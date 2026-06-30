package com.tencent.kinda.framework.app;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u000f\u001a\u00020\u0007R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/tencent/kinda/framework/app/KindaShakeSensor;", "", "", "hasASensor", "hasGSensor", "hasGYSensor", "hasListen", "Ljz5/f0;", "resetThreshold", "", "threshold", "setThreshold", "Lcom/tencent/kinda/framework/app/KindaShakeSensor$ShakeSensorListener;", "shakeListener", "startListen", "stopListen", "Landroid/hardware/SensorManager;", com.tencent.shadow.core.common.HostConstants.MANAGER_APPID, "Landroid/hardware/SensorManager;", "<set-?>", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/tencent/kinda/framework/app/KindaShakeSensor$ShakeSensorListener;", "getListener", "()Lcom/tencent/kinda/framework/app/KindaShakeSensor$ShakeSensorListener;", "isShakeSupported", "()Z", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "ShakeSensorListener", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class KindaShakeSensor {
    private static final java.lang.String TAG = "MicroMsg.ShakeSensorService";
    private com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener listener;
    private final android.hardware.SensorManager manager = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0007H&J\u0006\u0010\f\u001a\u00020\u0007J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/tencent/kinda/framework/app/KindaShakeSensor$ShakeSensorListener;", "Landroid/hardware/SensorEventListener;", "", "result", "selfAdaptation", "", "shaken", "Ljz5/f0;", "onShake", "", "values", "onRelease", "reset", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "mScale", "[F", "mPrev", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes13.dex */
    public static abstract class ShakeSensorListener implements android.hardware.SensorEventListener {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener.Companion INSTANCE = new com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener.Companion(null);
        private static final java.lang.String LG_E510 = "LG-E510";
        private static final java.lang.String TAG = "MicroMsg.ShakeSensorListener";
        private static int THREAHOLD = 0;
        private static final int defaultThreahold = 5;
        private static final int defaultThreaholdLG = 4;
        private final float[] mScale = {2.0f, 2.5f, 0.5f};
        private final float[] mPrev = new float[3];

        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/tencent/kinda/framework/app/KindaShakeSensor$ShakeSensorListener$Companion;", "", "", "threshold", "Ljz5/f0;", "setThreshold", "getDefaultThreshold", "", "LG_E510", "Ljava/lang/String;", "TAG", "THREAHOLD", "I", "defaultThreahold", "defaultThreaholdLG", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }

            public final int getDefaultThreshold() {
                return kotlin.jvm.internal.o.b(wo.w0.m(), com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener.LG_E510) ? 4 : 5;
            }

            public final void setThreshold(int i17) {
                com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener.THREAHOLD = e06.p.f(i17, 2, 20);
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener.TAG, "setThreshold: " + com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener.THREAHOLD);
            }
        }

        static {
            THREAHOLD = 5;
            if (kotlin.jvm.internal.o.b(wo.w0.m(), LG_E510)) {
                THREAHOLD = 4;
            }
        }

        public static final int getDefaultThreshold() {
            return INSTANCE.getDefaultThreshold();
        }

        private final float selfAdaptation(float result) {
            int i17 = THREAHOLD;
            if (i17 >= 9) {
                return result;
            }
            if (result >= 14.0f) {
                THREAHOLD = 9;
                return result;
            }
            int i18 = ((int) result) - 4;
            if (i17 < i18) {
                THREAHOLD = i18;
            }
            return result;
        }

        public static final void setThreshold(int i17) {
            INSTANCE.setThreshold(i17);
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        }

        public abstract void onRelease();

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(android.hardware.SensorEvent event) {
            kotlin.jvm.internal.o.g(event, "event");
            float[] fArr = new float[3];
            float[] fArr2 = event.values;
            boolean z17 = false;
            for (int i17 = 0; i17 < 3; i17++) {
                float round = java.lang.Math.round(this.mScale[i17] * (fArr2[i17] - this.mPrev[i17]) * 0.45f);
                fArr[i17] = round;
                if (selfAdaptation(java.lang.Math.abs(round)) > THREAHOLD) {
                    z17 = true;
                }
                this.mPrev[i17] = fArr2[i17];
            }
            if (z17) {
                event.sensor.getName();
                float f17 = fArr2[0];
                float f18 = fArr2[1];
                float f19 = fArr2[2];
                onShake(true);
                onShake(event.values);
            }
        }

        public abstract void onShake(boolean z17);

        public final void onShake(float[] fArr) {
        }

        public final void reset() {
            THREAHOLD = 5;
            if (kotlin.jvm.internal.o.b(wo.w0.m(), LG_E510)) {
                THREAHOLD = 4;
            }
        }
    }

    public KindaShakeSensor(android.content.Context context) {
    }

    private final boolean hasASensor() {
        android.hardware.SensorManager sensorManager = this.manager;
        if (sensorManager == null) {
            com.tencent.mars.xlog.Log.e(TAG, "cannot init sensor manager");
            return false;
        }
        java.util.List<android.hardware.Sensor> sensorList = sensorManager.getSensorList(1);
        return sensorList != null && sensorList.size() > 0;
    }

    private final boolean hasGSensor() {
        return false;
    }

    private final boolean hasGYSensor() {
        return false;
    }

    public final com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener getListener() {
        return this.listener;
    }

    public final boolean hasListen() {
        return this.listener != null;
    }

    public final boolean isShakeSupported() {
        return hasASensor() || hasGSensor() || hasGYSensor();
    }

    public final void resetThreshold() {
        com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener shakeSensorListener = this.listener;
        if (shakeSensorListener != null) {
            shakeSensorListener.reset();
        }
    }

    public final void setThreshold(int i17) {
        com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener.INSTANCE.setThreshold(i17);
    }

    public final void startListen(com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener shakeSensorListener) {
        stopListen();
        if (!hasASensor()) {
            com.tencent.mars.xlog.Log.e(TAG, "no sensor found for shake detection");
            return;
        }
        this.listener = shakeSensorListener;
        android.hardware.SensorManager sensorManager = this.manager;
        if (sensorManager != null) {
            sensorManager.registerListener(shakeSensorListener, sensorManager.getDefaultSensor(1), 1);
        }
    }

    public final void stopListen() {
        com.tencent.kinda.framework.app.KindaShakeSensor.ShakeSensorListener shakeSensorListener = this.listener;
        if (shakeSensorListener != null) {
            if (shakeSensorListener != null) {
                shakeSensorListener.onRelease();
            }
            android.hardware.SensorManager sensorManager = this.manager;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.listener, sensorManager.getDefaultSensor(1));
            }
            this.listener = null;
        }
    }
}
