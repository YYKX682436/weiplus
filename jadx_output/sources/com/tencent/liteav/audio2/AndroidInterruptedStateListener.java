package com.tencent.liteav.audio2;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::audio")
/* loaded from: classes13.dex */
public class AndroidInterruptedStateListener implements com.tencent.liteav.audio2.d.a, com.tencent.liteav.audio2.e.b {
    private static final int RECORDING_CONFIGS_LIMIT = 10;
    public static final java.lang.String TAG = "AndroidInterruptedStateListener";
    private static com.tencent.liteav.audio2.d mRecordingCallback = new com.tencent.liteav.audio2.d();
    private byte _hellAccFlag_;
    private final long mNativeRecordingConfigListener;
    private volatile boolean mNeedNotify = false;
    private java.lang.Object mObject = new java.lang.Object();
    private com.tencent.liteav.audio2.e mPhoneStateManager;

    /* loaded from: classes13.dex */
    public static class RecordingConfig {

        /* renamed from: a, reason: collision with root package name */
        int f46246a = 0;

        /* renamed from: b, reason: collision with root package name */
        boolean f46247b = false;

        public int getSessionId() {
            return this.f46246a;
        }

        public boolean isSilenced() {
            return this.f46247b;
        }
    }

    public AndroidInterruptedStateListener(long j17) {
        this.mNativeRecordingConfigListener = j17;
        com.tencent.liteav.base.Log.d(TAG, "new AndroidInterruptedStateListener" + hashCode(), new java.lang.Object[0]);
    }

    public static void lambda$registerAudioRecordingCallback$0(com.tencent.liteav.audio2.AndroidInterruptedStateListener androidInterruptedStateListener) {
        if (androidInterruptedStateListener.mPhoneStateManager == null) {
            androidInterruptedStateListener.mPhoneStateManager = new com.tencent.liteav.audio2.e(androidInterruptedStateListener);
        }
        com.tencent.liteav.audio2.e eVar = androidInterruptedStateListener.mPhoneStateManager;
        if (com.tencent.liteav.audio2.e.b()) {
            try {
                android.telephony.TelephonyManager telephonyManager = eVar.f46256a;
                if (telephonyManager == null) {
                    com.tencent.liteav.base.Log.w("PhoneStateManager", "TelephonyManager is null, start listen phone state failed.", new java.lang.Object[0]);
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(32);
                arrayList.add(eVar);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(telephonyManager, arrayList.toArray(), "com/tencent/liteav/audio2/AndroidInterruptedStateListener", "lambda$registerAudioRecordingCallback$0", "(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                telephonyManager.listen((android.telephony.PhoneStateListener) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(telephonyManager, "com/tencent/liteav/audio2/AndroidInterruptedStateListener", "lambda$registerAudioRecordingCallback$0", "(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                return;
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.Log.e("PhoneStateManager", "start listen phone state failed, " + th6.getMessage(), new java.lang.Object[0]);
                return;
            }
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 31) {
            if (i17 < 26 || com.tencent.liteav.audio2.e.f46255c == null) {
                return;
            }
            com.tencent.liteav.base.Log.i("PhoneStateManager", "register audio playback callback.", new java.lang.Object[0]);
            com.tencent.liteav.audio2.e.f46255c.f46253a = eVar;
            return;
        }
        try {
            if (eVar.f46258d == null) {
                eVar.f46258d = java.lang.Class.forName("android.media.AudioManager$OnModeChangedListener");
            }
            if (eVar.f46259e == null) {
                eVar.f46259e = java.lang.reflect.Proxy.newProxyInstance(eVar.f46258d.getClassLoader(), new java.lang.Class[]{eVar.f46258d}, new com.tencent.liteav.audio2.e.a(eVar));
            }
            android.media.AudioManager.class.getMethod("addOnModeChangedListener", java.util.concurrent.Executor.class, eVar.f46258d).invoke(eVar.f46257b, com.tencent.liteav.audio2.g.a(eVar), eVar.f46259e);
        } catch (java.lang.Throwable th7) {
            com.tencent.liteav.base.Log.e("PhoneStateManager", "add mode changed listener failed, " + th7.getMessage(), new java.lang.Object[0]);
        }
    }

    public static void lambda$unregisterAudioRecordingCallback$1(com.tencent.liteav.audio2.AndroidInterruptedStateListener androidInterruptedStateListener) {
        com.tencent.liteav.audio2.e eVar = androidInterruptedStateListener.mPhoneStateManager;
        if (eVar != null) {
            if (!com.tencent.liteav.audio2.e.b()) {
                if (android.os.Build.VERSION.SDK_INT < 31) {
                    com.tencent.liteav.audio2.e.c();
                    return;
                }
                try {
                    java.lang.Class<?> cls = eVar.f46258d;
                    if (cls == null || eVar.f46259e == null) {
                        return;
                    }
                    android.media.AudioManager.class.getMethod("removeOnModeChangedListener", cls).invoke(eVar.f46257b, eVar.f46259e);
                    return;
                } catch (java.lang.Throwable th6) {
                    com.tencent.liteav.base.Log.e("PhoneStateManager", "remove mode changed listener failed, " + th6.getMessage(), new java.lang.Object[0]);
                    return;
                }
            }
            try {
                android.telephony.TelephonyManager telephonyManager = eVar.f46256a;
                if (telephonyManager != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    arrayList.add(eVar);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(telephonyManager, arrayList.toArray(), "com/tencent/liteav/audio2/AndroidInterruptedStateListener", "lambda$unregisterAudioRecordingCallback$1", "(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                    telephonyManager.listen((android.telephony.PhoneStateListener) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.f(telephonyManager, "com/tencent/liteav/audio2/AndroidInterruptedStateListener", "lambda$unregisterAudioRecordingCallback$1", "(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                }
                eVar.f46260f = 0;
            } catch (java.lang.Throwable th7) {
                com.tencent.liteav.base.Log.e("PhoneStateManager", "stop listen phone state failed, " + th7.getMessage(), new java.lang.Object[0]);
            }
        }
    }

    private static native void nativeNotifyAudioRecordingConfigChangedFromJava(long j17, com.tencent.liteav.audio2.AndroidInterruptedStateListener.RecordingConfig[] recordingConfigArr);

    private static native void nativeNotifyInterruptedByPhoneCallFromJava(long j17);

    private static native void nativeNotifyResumedByPhoneCallFromJava(long j17);

    @Override // com.tencent.liteav.audio2.d.a
    public void OnRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> list) {
        if (list == null) {
            return;
        }
        int min = java.lang.Math.min(list.size(), 10);
        com.tencent.liteav.audio2.AndroidInterruptedStateListener.RecordingConfig[] recordingConfigArr = new com.tencent.liteav.audio2.AndroidInterruptedStateListener.RecordingConfig[min];
        for (int i17 = 0; i17 < min; i17++) {
            recordingConfigArr[i17] = new com.tencent.liteav.audio2.AndroidInterruptedStateListener.RecordingConfig();
            android.media.AudioRecordingConfiguration audioRecordingConfiguration = list.get(i17);
            recordingConfigArr[i17].f46246a = audioRecordingConfiguration.getClientAudioSessionId();
            if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 29) {
                recordingConfigArr[i17].f46247b = false;
            } else if (android.os.Build.VERSION.SDK_INT >= 29) {
                recordingConfigArr[i17].f46247b = audioRecordingConfiguration.isClientSilenced();
            }
        }
        synchronized (this.mObject) {
            if (this.mNeedNotify) {
                nativeNotifyAudioRecordingConfigChangedFromJava(this.mNativeRecordingConfigListener, recordingConfigArr);
            }
        }
    }

    @Override // com.tencent.liteav.audio2.e.b
    public void onInterruptedByPhoneCall() {
        synchronized (this.mObject) {
            if (this.mNeedNotify) {
                nativeNotifyInterruptedByPhoneCallFromJava(this.mNativeRecordingConfigListener);
            }
        }
    }

    @Override // com.tencent.liteav.audio2.e.b
    public void onResumedByPhoneCall() {
        synchronized (this.mObject) {
            if (this.mNeedNotify) {
                nativeNotifyResumedByPhoneCallFromJava(this.mNativeRecordingConfigListener);
            }
        }
    }

    public void registerAudioRecordingCallback() {
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 24) {
            return;
        }
        com.tencent.liteav.audio2.d dVar = mRecordingCallback;
        if (dVar != null) {
            dVar.f46254a = this;
        }
        com.tencent.liteav.base.ThreadUtils.getUiThreadHandler().post(com.tencent.liteav.audio2.a.a(this));
        this.mNeedNotify = true;
    }

    public void unregisterAudioRecordingCallback() {
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 24 && mRecordingCallback != null) {
            synchronized (this.mObject) {
                this.mNeedNotify = false;
                mRecordingCallback.f46254a = null;
                com.tencent.liteav.base.ThreadUtils.getUiThreadHandler().post(com.tencent.liteav.audio2.b.a(this));
            }
        }
    }
}
