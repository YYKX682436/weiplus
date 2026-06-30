package com.tencent.kinda.framework.app;

/* loaded from: classes13.dex */
public class KindaShakeCheckingManager implements com.tencent.kinda.gen.IShakeCheckingManager {
    private static final int CONTINUE_SHAKE_INTERVAL = 80;
    private static final int FIRST_SHAKE_INTERVAL = 1200;
    private static final float SENSITIVITY_MAX_VALUE = 3.6f;
    private static final float SENSITIVITY_MIN_VALUE = 0.3f;
    private com.tencent.kinda.gen.VoidCallback delayNotifyCallback;
    private long lastShakeTime;
    private com.tencent.kinda.gen.VoidCallback shakeCallBack;
    private com.tencent.kinda.framework.app.KindaShakeSensor shakeSensor;
    private final java.lang.String TAG = "KindaShakeCheckingManager";
    private boolean isStartShake = false;
    private boolean isInvokeCallback = false;
    private boolean isInForeground = true;
    private boolean needSetThreshold = false;
    private float thresholdValue = 0.0f;
    private int delayNotifyMs = 3000;
    private java.lang.Runnable delayNofiyRunnable = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaShakeCheckingManager.1
        @Override // java.lang.Runnable
        public void run() {
            if (com.tencent.kinda.framework.app.KindaShakeCheckingManager.this.isInvokeCallback || com.tencent.kinda.framework.app.KindaShakeCheckingManager.this.delayNotifyCallback == null) {
                return;
            }
            com.tencent.kinda.framework.app.KindaShakeCheckingManager.this.delayNotifyCallback.call();
        }
    };
    private final com.tencent.kinda.framework.app.KindaShakeCheckingManager.WeakLifecycleCallback appLifecycle = new com.tencent.kinda.framework.app.KindaShakeCheckingManager.WeakLifecycleCallback(new java.lang.ref.WeakReference(this));

    /* loaded from: classes13.dex */
    public static class WeakLifecycleCallback extends com.tencent.matrix.lifecycle.h {
        private final java.lang.ref.WeakReference<com.tencent.kinda.framework.app.KindaShakeCheckingManager> weakManager;

        public WeakLifecycleCallback(java.lang.ref.WeakReference<com.tencent.kinda.framework.app.KindaShakeCheckingManager> weakReference) {
            this.weakManager = weakReference;
        }

        @Override // com.tencent.matrix.lifecycle.h
        public void onEnterForeground() {
            com.tencent.kinda.framework.app.KindaShakeCheckingManager kindaShakeCheckingManager = this.weakManager.get();
            if (kindaShakeCheckingManager == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("KindaShakeCheckingManager", "onEnterForeground() - app in foreground, enable shake response");
            kindaShakeCheckingManager.isInForeground = true;
        }

        @Override // com.tencent.matrix.lifecycle.h
        public void onExitForeground() {
            com.tencent.kinda.framework.app.KindaShakeCheckingManager kindaShakeCheckingManager = this.weakManager.get();
            if (kindaShakeCheckingManager == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("KindaShakeCheckingManager", "onExitForeground() - app in background, disable shake response");
            kindaShakeCheckingManager.isInForeground = false;
        }
    }

    public boolean isValueOutOfRange(float f17, float f18, float f19, float f27) {
        return f17 < f18 - f27 || f17 > f19 + f27;
    }

    @Override // com.tencent.kinda.gen.IShakeCheckingManager
    public void playShakeMatch(boolean z17) {
        if (z17) {
            com.tencent.mm.sdk.platformtools.v5.b(com.tencent.kinda.framework.widget.tools.KindaContext.get(), com.tencent.mm.R.string.j2u);
        } else {
            com.tencent.mm.sdk.platformtools.v5.b(com.tencent.kinda.framework.widget.tools.KindaContext.get(), com.tencent.mm.R.string.f493119j34);
        }
    }

    @Override // com.tencent.kinda.gen.IShakeCheckingManager
    public void playShakeSound() {
        if (com.tencent.kinda.framework.widget.tools.KindaContext.get() != null) {
            com.tencent.mm.sdk.platformtools.v5.b(com.tencent.kinda.framework.widget.tools.KindaContext.get(), com.tencent.mm.R.string.j3j);
        } else {
            com.tencent.mars.xlog.Log.e("KindaShakeCheckingManager", "[playShakeSound] KindaContext.get() == null");
        }
    }

    @Override // com.tencent.kinda.gen.IShakeCheckingManager
    public void setDelayNotifyCallBackImpl(com.tencent.kinda.gen.VoidCallback voidCallback, int i17) {
        this.delayNotifyCallback = voidCallback;
        this.delayNotifyMs = i17;
    }

    @Override // com.tencent.kinda.gen.IShakeCheckingManager
    public void setOnShakeCallBackImpl(com.tencent.kinda.gen.VoidCallback voidCallback) {
        this.shakeCallBack = voidCallback;
    }

    @Override // com.tencent.kinda.gen.IShakeCheckingManager
    public void setShakeSensitivity(float f17) {
        com.tencent.mars.xlog.Log.i("KindaShakeCheckingManager", "[setShakeSensitivity] Need Set value: %s", java.lang.Float.valueOf(f17));
        if (isValueOutOfRange(f17, SENSITIVITY_MIN_VALUE, SENSITIVITY_MAX_VALUE, 1.0E-4f)) {
            com.tencent.mars.xlog.Log.i("KindaShakeCheckingManager", "[setShakeSensitivity] value is not range ignore");
        } else {
            this.needSetThreshold = true;
            this.thresholdValue = f17;
        }
    }

    @Override // com.tencent.kinda.gen.IShakeCheckingManager
    public void startCheck() {
        com.tencent.mars.xlog.Log.i("KindaShakeCheckingManager", "startCheck() called");
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(this.appLifecycle);
        this.shakeSensor = new com.tencent.kinda.framework.app.KindaShakeSensor(com.tencent.kinda.framework.widget.tools.KindaContext.get());
        if (this.needSetThreshold) {
            int defaultThreshold = com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener.getDefaultThreshold();
            int round = java.lang.Math.round(defaultThreshold * this.thresholdValue);
            this.shakeSensor.setThreshold(round);
            com.tencent.mars.xlog.Log.i("KindaShakeCheckingManager", "startCheck() set threshold: default=%s, sensitivity=%s, newThreshold=%s", java.lang.Integer.valueOf(defaultThreshold), java.lang.Float.valueOf(this.thresholdValue), java.lang.Integer.valueOf(round));
            this.needSetThreshold = false;
        }
        this.shakeSensor.startListen(new com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener() { // from class: com.tencent.kinda.framework.app.KindaShakeCheckingManager.2
            @Override // com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener
            public void onRelease() {
            }

            @Override // com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener
            public void onShake(boolean z17) {
                if (!com.tencent.kinda.framework.app.KindaShakeCheckingManager.this.isInForeground) {
                    com.tencent.mars.xlog.Log.i("KindaShakeCheckingManager", "onShake ignored - app in background");
                    return;
                }
                com.tencent.mars.xlog.Log.i("KindaShakeCheckingManager", "onShake - app in foreground");
                long j17 = com.tencent.kinda.framework.app.KindaShakeCheckingManager.this.lastShakeTime;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                if (com.tencent.kinda.framework.app.KindaShakeCheckingManager.this.isStartShake) {
                    if (elapsedRealtime < 80) {
                        return;
                    }
                } else if (elapsedRealtime < 1200) {
                    return;
                }
                com.tencent.kinda.framework.app.KindaShakeCheckingManager.this.lastShakeTime = android.os.SystemClock.elapsedRealtime();
                com.tencent.kinda.framework.app.KindaShakeCheckingManager.this.isStartShake = true;
                if (com.tencent.kinda.framework.app.KindaShakeCheckingManager.this.shakeCallBack != null) {
                    com.tencent.kinda.framework.app.KindaShakeCheckingManager.this.isInvokeCallback = true;
                    com.tencent.kinda.framework.app.KindaShakeCheckingManager.this.shakeCallBack.call();
                }
            }
        });
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.lastShakeTime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.sdk.platformtools.u3.l(this.delayNofiyRunnable);
        com.tencent.mm.sdk.platformtools.u3.i(this.delayNofiyRunnable, this.delayNotifyMs);
    }

    @Override // com.tencent.kinda.gen.IShakeCheckingManager
    public void stopCheck() {
        com.tencent.mars.xlog.Log.i("KindaShakeCheckingManager", "stopCheck() called");
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.removeLifecycleCallback(this.appLifecycle);
        com.tencent.kinda.framework.app.KindaShakeSensor kindaShakeSensor = this.shakeSensor;
        if (kindaShakeSensor != null) {
            kindaShakeSensor.stopListen();
            this.shakeSensor = null;
        }
        this.isInvokeCallback = false;
        this.isStartShake = false;
        com.tencent.mm.sdk.platformtools.u3.l(this.delayNofiyRunnable);
    }
}
