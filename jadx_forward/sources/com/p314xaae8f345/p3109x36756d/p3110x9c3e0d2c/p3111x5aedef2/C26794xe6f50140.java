package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2;

/* renamed from: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit */
/* loaded from: classes16.dex */
public class C26794xe6f50140 extends com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26793xee5f3695 {

    /* renamed from: ENGINE_CLASS_NAME */
    private static final java.lang.String f57281xd95bdb2f = "com.huawei.multimedia.audioengine.HwAudioKaraokeFeatureService";
    private static final java.lang.String TAG = "DaisyAudioKit.DaisyAudioKaraokeFeatureKit";

    /* renamed from: mContext */
    private android.content.Context f57283xd6cfe882;

    /* renamed from: mFeatureKitManager */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db f57285x5996eea0;

    /* renamed from: mIHwAudioKaraokeFeatureAidl */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff f57286x48a2fc8d;

    /* renamed from: mIsServiceConnected */
    private boolean f57287x68ac206b = false;

    /* renamed from: mService */
    private android.os.IBinder f57288x145c7988 = null;

    /* renamed from: mConnection */
    private android.content.ServiceConnection f57282xadf6772b = new android.content.ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this.f57286x48a2fc8d = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff.Stub.m105724xbd0d1927(iBinder);
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this.f57286x48a2fc8d != null) {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this.f57287x68ac206b = true;
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140 c26794xe6f50140 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this;
                if (!c26794xe6f50140.m105657x8d0a3d65(c26794xe6f50140.f57283xd6cfe882.getPackageName())) {
                    com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this.f57285x5996eea0.m105698x9ac7b764(1002);
                } else {
                    com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this.f57285x5996eea0.m105698x9ac7b764(1000);
                    com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this.m105658x8bcb516a(iBinder);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this.f57287x68ac206b = false;
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this.f57285x5996eea0 != null) {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this.f57285x5996eea0.m105698x9ac7b764(1001);
            }
        }
    };

    /* renamed from: mDeathRecipient */
    private android.os.IBinder.DeathRecipient f57284xa3218bd2 = new android.os.IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.TAG, "binderDied");
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this.f57288x145c7988.unlinkToDeath(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this.f57284xa3218bd2, 0);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this.f57285x5996eea0.m105698x9ac7b764(1003);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.this.f57288x145c7988 = null;
        }
    };

    /* renamed from: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit$ParameName */
    /* loaded from: classes16.dex */
    public enum ParameName {
        CMD_SET_AUDIO_EFFECT_MODE_BASE("Karaoke_reverb_mode="),
        CMD_SET_VOCAL_VOLUME_BASE("Karaoke_volume="),
        CMD_SET_VOCAL_EQUALIZER_MODE("Karaoke_eq_mode=");


        /* renamed from: mParameName */
        private java.lang.String f57293xf7786470;

        ParameName(java.lang.String str) {
            this.f57293xf7786470 = str;
        }

        /* renamed from: getParameName */
        public final java.lang.String m105668x9872419() {
            return this.f57293xf7786470;
        }
    }

    public C26794xe6f50140(android.content.Context context) {
        this.f57285x5996eea0 = null;
        this.f57285x5996eea0 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db.m105693x9cf0d20b();
        this.f57283xd6cfe882 = context;
    }

    /* renamed from: bindService */
    private void m105656x54856bb8(android.content.Context context) {
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db c26796x76d2f6db = this.f57285x5996eea0;
            if (c26796x76d2f6db == null || this.f57287x68ac206b) {
                return;
            }
            c26796x76d2f6db.m105695x54856bb8(context, this.f57282xadf6772b, f57281xd95bdb2f);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "bindService,RemoteException ex : %s", th6.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: serviceInit */
    public boolean m105657x8d0a3d65(java.lang.String str) {
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff interfaceC26800x88d136ff = this.f57286x48a2fc8d;
            if (interfaceC26800x88d136ff != null && this.f57287x68ac206b) {
                interfaceC26800x88d136ff.mo105721x316510(str);
            }
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "isFeatureSupported,RemoteException ex : %s", th6.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: serviceLinkToDeath */
    public void m105658x8bcb516a(android.os.IBinder iBinder) {
        this.f57288x145c7988 = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.f57284xa3218bd2, 0);
            } catch (java.lang.Throwable unused) {
                this.f57285x5996eea0.m105698x9ac7b764(1002);
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    /* renamed from: destroy */
    public void m105659x5cd39ffa() {
        try {
            if (this.f57287x68ac206b) {
                this.f57287x68ac206b = false;
                this.f57285x5996eea0.m105700xa4bc737f(this.f57283xd6cfe882, this.f57282xadf6772b);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "unbindService,RemoteException ex : %s", th6.getMessage());
        }
    }

    /* renamed from: enableKaraokeFeature */
    public int m105660x27fee4d5(boolean z17) {
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff interfaceC26800x88d136ff = this.f57286x48a2fc8d;
            if (interfaceC26800x88d136ff == null || !this.f57287x68ac206b) {
                return -2;
            }
            return interfaceC26800x88d136ff.mo105719x27fee4d5(z17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "enableKaraokeFeature,RemoteException ex : %s", th6.getMessage());
            return -2;
        }
    }

    /* renamed from: getKaraokeLatency */
    public int m105661xce6ef370() {
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff interfaceC26800x88d136ff = this.f57286x48a2fc8d;
            if (interfaceC26800x88d136ff == null || !this.f57287x68ac206b) {
                return -1;
            }
            return interfaceC26800x88d136ff.mo105720xce6ef370();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "getKaraokeLatency,RemoteException ex : %s", th6.getMessage());
            return -1;
        }
    }

    /* renamed from: initialize */
    public void m105662x33ebcb90(android.content.Context context) {
        if (context == null) {
            return;
        }
        if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26796x76d2f6db.m105694xbfc3d205(context)) {
            m105656x54856bb8(context);
        } else {
            this.f57285x5996eea0.m105698x9ac7b764(2);
        }
    }

    /* renamed from: isKaraokeFeatureSupport */
    public boolean m105663xf2b63ff3() {
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff interfaceC26800x88d136ff = this.f57286x48a2fc8d;
            if (interfaceC26800x88d136ff == null || !this.f57287x68ac206b) {
                return false;
            }
            return interfaceC26800x88d136ff.mo105722xf2b63ff3();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "isFeatureSupported,RemoteException ex : %s", th6.getMessage());
            return false;
        }
    }

    /* renamed from: setParameter */
    public int m105664xd03fe567(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.C26794xe6f50140.ParameName parameName, int i17) {
        if (parameName == null) {
            return 1807;
        }
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff interfaceC26800x88d136ff = this.f57286x48a2fc8d;
            if (interfaceC26800x88d136ff == null || !this.f57287x68ac206b) {
                return -2;
            }
            return interfaceC26800x88d136ff.mo105723xd03fe567(parameName.m105668x9872419(), i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "setParameter,RemoteException ex : %s", th6.getMessage());
            return -2;
        }
    }
}
