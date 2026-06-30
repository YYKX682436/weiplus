package com.p314xaae8f345.p373xbe494963.p376xac25df1c;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::audio")
/* renamed from: com.tencent.liteav.audio2.AndroidInterruptedStateListener */
/* loaded from: classes13.dex */
public class C3732x64ac3eb2 implements com.tencent.liteav.audio2.d.a, com.tencent.liteav.audio2.e.b {

    /* renamed from: RECORDING_CONFIGS_LIMIT */
    private static final int f14573x362f853f = 10;
    public static final java.lang.String TAG = "AndroidInterruptedStateListener";

    /* renamed from: mRecordingCallback */
    private static com.p314xaae8f345.p373xbe494963.p376xac25df1c.d f14574x18500869 = new com.p314xaae8f345.p373xbe494963.p376xac25df1c.d();

    /* renamed from: _hellAccFlag_ */
    private byte f14575x7f11beae;

    /* renamed from: mNativeRecordingConfigListener */
    private final long f14576x3954bae3;

    /* renamed from: mNeedNotify */
    private volatile boolean f14577x83f2bbcc = false;

    /* renamed from: mObject */
    private java.lang.Object f14578x126cca0c = new java.lang.Object();

    /* renamed from: mPhoneStateManager */
    private com.p314xaae8f345.p373xbe494963.p376xac25df1c.e f14579xed7e317d;

    /* renamed from: com.tencent.liteav.audio2.AndroidInterruptedStateListener$RecordingConfig */
    /* loaded from: classes13.dex */
    public static class RecordingConfig {

        /* renamed from: a, reason: collision with root package name */
        int f127779a = 0;

        /* renamed from: b, reason: collision with root package name */
        boolean f127780b = false;

        /* renamed from: getSessionId */
        public int m29170x23a7af9b() {
            return this.f127779a;
        }

        /* renamed from: isSilenced */
        public boolean m29171xeb5b472d() {
            return this.f127780b;
        }
    }

    public C3732x64ac3eb2(long j17) {
        this.f14576x3954bae3 = j17;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.d(TAG, "new AndroidInterruptedStateListener" + hashCode(), new java.lang.Object[0]);
    }

    /* renamed from: lambda$registerAudioRecordingCallback$0 */
    public static void m29160x1e9953ac(com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3732x64ac3eb2 c3732x64ac3eb2) {
        if (c3732x64ac3eb2.f14579xed7e317d == null) {
            c3732x64ac3eb2.f14579xed7e317d = new com.p314xaae8f345.p373xbe494963.p376xac25df1c.e(c3732x64ac3eb2);
        }
        com.p314xaae8f345.p373xbe494963.p376xac25df1c.e eVar = c3732x64ac3eb2.f14579xed7e317d;
        if (com.p314xaae8f345.p373xbe494963.p376xac25df1c.e.b()) {
            try {
                android.telephony.TelephonyManager telephonyManager = eVar.f127789a;
                if (telephonyManager == null) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w("PhoneStateManager", "TelephonyManager is null, start listen phone state failed.", new java.lang.Object[0]);
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(32);
                arrayList.add(eVar);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(telephonyManager, arrayList.toArray(), "com/tencent/liteav/audio2/AndroidInterruptedStateListener", "lambda$registerAudioRecordingCallback$0", "(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                telephonyManager.listen((android.telephony.PhoneStateListener) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(telephonyManager, "com/tencent/liteav/audio2/AndroidInterruptedStateListener", "lambda$registerAudioRecordingCallback$0", "(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                return;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("PhoneStateManager", "start listen phone state failed, " + th6.getMessage(), new java.lang.Object[0]);
                return;
            }
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 31) {
            if (i17 < 26 || com.p314xaae8f345.p373xbe494963.p376xac25df1c.e.f127788c == null) {
                return;
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("PhoneStateManager", "register audio playback callback.", new java.lang.Object[0]);
            com.p314xaae8f345.p373xbe494963.p376xac25df1c.e.f127788c.f127786a = eVar;
            return;
        }
        try {
            if (eVar.f127791d == null) {
                eVar.f127791d = java.lang.Class.forName("android.media.AudioManager$OnModeChangedListener");
            }
            if (eVar.f127792e == null) {
                eVar.f127792e = java.lang.reflect.Proxy.newProxyInstance(eVar.f127791d.getClassLoader(), new java.lang.Class[]{eVar.f127791d}, new com.tencent.liteav.audio2.e.a(eVar));
            }
            android.media.AudioManager.class.getMethod("addOnModeChangedListener", java.util.concurrent.Executor.class, eVar.f127791d).invoke(eVar.f127790b, com.p314xaae8f345.p373xbe494963.p376xac25df1c.g.a(eVar), eVar.f127792e);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("PhoneStateManager", "add mode changed listener failed, " + th7.getMessage(), new java.lang.Object[0]);
        }
    }

    /* renamed from: lambda$unregisterAudioRecordingCallback$1 */
    public static void m29161xea596306(com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3732x64ac3eb2 c3732x64ac3eb2) {
        com.p314xaae8f345.p373xbe494963.p376xac25df1c.e eVar = c3732x64ac3eb2.f14579xed7e317d;
        if (eVar != null) {
            if (!com.p314xaae8f345.p373xbe494963.p376xac25df1c.e.b()) {
                if (android.os.Build.VERSION.SDK_INT < 31) {
                    com.p314xaae8f345.p373xbe494963.p376xac25df1c.e.c();
                    return;
                }
                try {
                    java.lang.Class<?> cls = eVar.f127791d;
                    if (cls == null || eVar.f127792e == null) {
                        return;
                    }
                    android.media.AudioManager.class.getMethod("removeOnModeChangedListener", cls).invoke(eVar.f127790b, eVar.f127792e);
                    return;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("PhoneStateManager", "remove mode changed listener failed, " + th6.getMessage(), new java.lang.Object[0]);
                    return;
                }
            }
            try {
                android.telephony.TelephonyManager telephonyManager = eVar.f127789a;
                if (telephonyManager != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    arrayList.add(eVar);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(telephonyManager, arrayList.toArray(), "com/tencent/liteav/audio2/AndroidInterruptedStateListener", "lambda$unregisterAudioRecordingCallback$1", "(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                    telephonyManager.listen((android.telephony.PhoneStateListener) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.f(telephonyManager, "com/tencent/liteav/audio2/AndroidInterruptedStateListener", "lambda$unregisterAudioRecordingCallback$1", "(Lcom/tencent/liteav/audio2/AndroidInterruptedStateListener;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                }
                eVar.f127793f = 0;
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("PhoneStateManager", "stop listen phone state failed, " + th7.getMessage(), new java.lang.Object[0]);
            }
        }
    }

    /* renamed from: nativeNotifyAudioRecordingConfigChangedFromJava */
    private static native void m29162x5a1355c3(long j17, com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3732x64ac3eb2.RecordingConfig[] recordingConfigArr);

    /* renamed from: nativeNotifyInterruptedByPhoneCallFromJava */
    private static native void m29163x86edbb1f(long j17);

    /* renamed from: nativeNotifyResumedByPhoneCallFromJava */
    private static native void m29164xb2d416a(long j17);

    @Override // com.tencent.liteav.audio2.d.a
    /* renamed from: OnRecordingConfigChanged */
    public void mo29165xbee0e780(java.util.List<android.media.AudioRecordingConfiguration> list) {
        if (list == null) {
            return;
        }
        int min = java.lang.Math.min(list.size(), 10);
        com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3732x64ac3eb2.RecordingConfig[] recordingConfigArr = new com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3732x64ac3eb2.RecordingConfig[min];
        for (int i17 = 0; i17 < min; i17++) {
            recordingConfigArr[i17] = new com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3732x64ac3eb2.RecordingConfig();
            android.media.AudioRecordingConfiguration audioRecordingConfiguration = list.get(i17);
            recordingConfigArr[i17].f127779a = audioRecordingConfiguration.getClientAudioSessionId();
            if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 29) {
                recordingConfigArr[i17].f127780b = false;
            } else if (android.os.Build.VERSION.SDK_INT >= 29) {
                recordingConfigArr[i17].f127780b = audioRecordingConfiguration.isClientSilenced();
            }
        }
        synchronized (this.f14578x126cca0c) {
            if (this.f14577x83f2bbcc) {
                m29162x5a1355c3(this.f14576x3954bae3, recordingConfigArr);
            }
        }
    }

    @Override // com.tencent.liteav.audio2.e.b
    /* renamed from: onInterruptedByPhoneCall */
    public void mo29166x69019f72() {
        synchronized (this.f14578x126cca0c) {
            if (this.f14577x83f2bbcc) {
                m29163x86edbb1f(this.f14576x3954bae3);
            }
        }
    }

    @Override // com.tencent.liteav.audio2.e.b
    /* renamed from: onResumedByPhoneCall */
    public void mo29167x5835a83d() {
        synchronized (this.f14578x126cca0c) {
            if (this.f14577x83f2bbcc) {
                m29164xb2d416a(this.f14576x3954bae3);
            }
        }
    }

    /* renamed from: registerAudioRecordingCallback */
    public void m29168x92647aa3() {
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 24) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p376xac25df1c.d dVar = f14574x18500869;
        if (dVar != null) {
            dVar.f127787a = this;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3743xd5f5f0a7.m29291xfa032576().post(com.p314xaae8f345.p373xbe494963.p376xac25df1c.a.a(this));
        this.f14577x83f2bbcc = true;
    }

    /* renamed from: unregisterAudioRecordingCallback */
    public void m29169xcc77b77c() {
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 24 && f14574x18500869 != null) {
            synchronized (this.f14578x126cca0c) {
                this.f14577x83f2bbcc = false;
                f14574x18500869.f127787a = null;
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3743xd5f5f0a7.m29291xfa032576().post(com.p314xaae8f345.p373xbe494963.p376xac25df1c.b.a(this));
            }
        }
    }
}
