package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2;

/* renamed from: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit */
/* loaded from: classes16.dex */
public class C26795x66465412 {

    /* renamed from: DEFAULT_FEATURE_LIST */
    private static final java.util.List<java.lang.Integer> f57294x36d775c5 = new java.util.ArrayList(0);

    /* renamed from: ENGINE_CLASS_NAME */
    private static final java.lang.String f57295xd95bdb2f = "com.huawei.multimedia.audioengine.HwAudioEngineService";
    private static final java.lang.String TAG = "DaisyAudioKit.DaisyAudioKit";

    /* renamed from: mContext */
    private android.content.Context f57297xd6cfe882;

    /* renamed from: mFeatureKitManager */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db f57299x5996eea0;

    /* renamed from: mIHwAudioEngine */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf f57300xb8a1e10d = null;

    /* renamed from: mIsServiceConnected */
    private boolean f57301x68ac206b = false;

    /* renamed from: mService */
    private android.os.IBinder f57302x145c7988 = null;

    /* renamed from: mConnection */
    private android.content.ServiceConnection f57296xadf6772b = new android.content.ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.this.f57300xb8a1e10d = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf.Stub.m105718xbd0d1927(iBinder);
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.this.f57300xb8a1e10d != null) {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.this.f57301x68ac206b = true;
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.this.f57299x5996eea0.m105698x9ac7b764(0);
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412 c26795x66465412 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.this;
                c26795x66465412.m105681x8d0a3d65(c26795x66465412.f57297xd6cfe882.getPackageName(), "1.0.1");
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.this.m105682x8bcb516a(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.this.f57300xb8a1e10d = null;
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.this.f57301x68ac206b = false;
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.this.f57299x5996eea0.m105698x9ac7b764(4);
        }
    };

    /* renamed from: mDeathRecipient */
    private android.os.IBinder.DeathRecipient f57298xa3218bd2 = new android.os.IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.this.f57302x145c7988.unlinkToDeath(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.this.f57298xa3218bd2, 0);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.this.f57299x5996eea0.m105698x9ac7b764(6);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.TAG, "service binder died");
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.this.f57302x145c7988 = null;
        }
    };

    /* renamed from: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit$FeatureType */
    /* loaded from: classes6.dex */
    public enum FeatureType {
        HWAUDIO_FEATURE_KARAOKE(1);


        /* renamed from: mFeatureType */
        private int f57305x939524a3;

        FeatureType(int i17) {
            this.f57305x939524a3 = i17;
        }

        /* renamed from: getFeatureType */
        public final int m105691xc35e5a1a() {
            return this.f57305x939524a3;
        }
    }

    public C26795x66465412(android.content.Context context, com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26801xf73addce interfaceC26801xf73addce) {
        this.f57297xd6cfe882 = null;
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db m105693x9cf0d20b = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db.m105693x9cf0d20b();
        this.f57299x5996eea0 = m105693x9cf0d20b;
        m105693x9cf0d20b.m105699x6c4032e7(interfaceC26801xf73addce);
        this.f57297xd6cfe882 = context;
    }

    /* renamed from: bindService */
    private void m105680x54856bb8(android.content.Context context) {
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db c26796x76d2f6db = this.f57299x5996eea0;
            if (c26796x76d2f6db == null || this.f57301x68ac206b) {
                return;
            }
            c26796x76d2f6db.m105695x54856bb8(context, this.f57296xadf6772b, f57295xd95bdb2f);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "bindService,RemoteException ex : %s", th6.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: serviceInit */
    public void m105681x8d0a3d65(java.lang.String str, java.lang.String str2) {
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf interfaceC26799xc8a6b9cf = this.f57300xb8a1e10d;
            if (interfaceC26799xc8a6b9cf == null || !this.f57301x68ac206b) {
                return;
            }
            interfaceC26799xc8a6b9cf.mo105716x316510(str, str2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "isFeatureSupported,RemoteException ex : %s", th6.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: serviceLinkToDeath */
    public void m105682x8bcb516a(android.os.IBinder iBinder) {
        this.f57302x145c7988 = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.f57298xa3218bd2, 0);
            } catch (java.lang.Throwable unused) {
                this.f57299x5996eea0.m105698x9ac7b764(5);
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    /* renamed from: createFeature */
    public <T extends com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26793xee5f3695> T m105683x4b899e5a(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.FeatureType featureType) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db c26796x76d2f6db = this.f57299x5996eea0;
        if (c26796x76d2f6db == null || featureType == null) {
            return null;
        }
        return (T) c26796x76d2f6db.m105696x63d3b21c(featureType.m105691xc35e5a1a(), this.f57297xd6cfe882);
    }

    /* renamed from: destroy */
    public void m105684x5cd39ffa() {
        try {
            if (this.f57301x68ac206b) {
                this.f57301x68ac206b = false;
                this.f57299x5996eea0.m105700xa4bc737f(this.f57297xd6cfe882, this.f57296xadf6772b);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "unbindService,RemoteException ex : %s", th6.getMessage());
        }
    }

    /* renamed from: getSupportedFeatures */
    public java.util.List<java.lang.Integer> m105685x55fd1655() {
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf interfaceC26799xc8a6b9cf = this.f57300xb8a1e10d;
            if (interfaceC26799xc8a6b9cf != null && this.f57301x68ac206b) {
                return interfaceC26799xc8a6b9cf.mo105715x55fd1655();
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "getSupportedFeatures, createFeature,wait bind service fail");
        }
        return f57294x36d775c5;
    }

    /* renamed from: initialize */
    public void m105686x33ebcb90() {
        android.content.Context context = this.f57297xd6cfe882;
        if (context == null) {
            this.f57299x5996eea0.m105698x9ac7b764(7);
        } else if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db.m105694xbfc3d205(context)) {
            m105680x54856bb8(this.f57297xd6cfe882);
        } else {
            this.f57299x5996eea0.m105698x9ac7b764(2);
        }
    }

    /* renamed from: isFeatureSupported */
    public boolean m105687x4f462ba2(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26795x66465412.FeatureType featureType) {
        if (featureType == null) {
            return false;
        }
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf interfaceC26799xc8a6b9cf = this.f57300xb8a1e10d;
            if (interfaceC26799xc8a6b9cf != null && this.f57301x68ac206b) {
                return interfaceC26799xc8a6b9cf.mo105717x4f462ba2(featureType.m105691xc35e5a1a());
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "isFeatureSupported,RemoteException ex : %s", th6.getMessage());
        }
        return false;
    }
}
