package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::extensions")
/* renamed from: com.tencent.trtc.hardwareearmonitor.HardwareEarMonitorUtil */
/* loaded from: classes7.dex */
public class C26792x5dfd1b6e extends android.content.BroadcastReceiver {

    /* renamed from: mFilter */
    private android.content.IntentFilter f57275x374f245;

    /* renamed from: mNativeHardwareEarMonitorHandle */
    private long f57279x211c7978;

    /* renamed from: mHeadsetState */
    private int f57277x44408c3c = -1;

    /* renamed from: mHasMicrophone */
    private int f57276xd5dd17f7 = -1;

    /* renamed from: mDeviceName */
    private java.lang.String f57274xabeea4e = "NotDefine";

    /* renamed from: mPortName */
    private java.lang.String f57280x50650639 = "NotDefine";

    /* renamed from: mDeviceAddress */
    private java.lang.String f57273xd3fa7151 = "NotDefine";

    /* renamed from: mLock */
    private java.lang.Object f57278x6243b38 = new java.lang.Object();

    /* renamed from: mContext */
    private android.content.Context f57272xd6cfe882 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();

    public C26792x5dfd1b6e(long j17) {
        this.f57279x211c7978 = 0L;
        this.f57279x211c7978 = j17;
        try {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.HEADSET_PLUG");
            this.f57275x374f245 = intentFilter;
            this.f57272xd6cfe882.registerReceiver(this, intentFilter);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.C26792x5dfd1b6e m105643xaf65a0fc(long j17) {
        return new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.C26792x5dfd1b6e(j17);
    }

    /* renamed from: nativeHeadsetDescChanged */
    private static native void m105644x6c453b78(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: destroy */
    public void m105645x5cd39ffa() {
        android.content.Context context = this.f57272xd6cfe882;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        if (this.f57275x374f245 != null) {
            this.f57275x374f245 = null;
        }
        synchronized (this.f57278x6243b38) {
            this.f57279x211c7978 = 0L;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent != null && "android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
            synchronized (this.f57278x6243b38) {
                this.f57277x44408c3c = intent.getIntExtra("state", -1);
                this.f57276xd5dd17f7 = intent.getIntExtra("microphone", -1);
                this.f57274xabeea4e = intent.getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
                this.f57280x50650639 = intent.getStringExtra("portName");
                java.lang.String stringExtra = intent.getStringExtra("address");
                this.f57273xd3fa7151 = stringExtra;
                long j17 = this.f57279x211c7978;
                int i17 = this.f57277x44408c3c;
                int i18 = this.f57276xd5dd17f7;
                java.lang.String str = this.f57274xabeea4e;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = this.f57280x50650639;
                if (str2 == null) {
                    str2 = "";
                }
                if (stringExtra == null) {
                    stringExtra = "";
                }
                m105644x6c453b78(j17, i17, i18, str, str2, stringExtra);
            }
        }
    }
}
