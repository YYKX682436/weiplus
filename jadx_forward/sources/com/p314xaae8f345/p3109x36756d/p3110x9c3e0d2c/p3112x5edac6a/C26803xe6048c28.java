package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a;

/* renamed from: com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient */
/* loaded from: classes16.dex */
public class C26803xe6048c28 extends com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26805x8904140d {

    /* renamed from: ENGINE_CLASS_NAME */
    private static final java.lang.String f57351xd95bdb2f = "com.hihonor.android.magicx.media.audioengine.HnAdvancedRecordServiceImpl";
    private static final java.lang.String TAG = "HnAudioService.HnAdvancedRecordClient";

    /* renamed from: mContext */
    private android.content.Context f57354xd6cfe882;

    /* renamed from: mFeatureKitManager */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863 f57356x5996eea0;

    /* renamed from: mIsServiceConnected */
    private boolean f57358x68ac206b = false;

    /* renamed from: mHnAdvancedRecordService */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101 f57357xe3cda38f = null;

    /* renamed from: mService */
    private android.os.IBinder f57359x145c7988 = null;

    /* renamed from: mClientBinder */
    private final android.os.IBinder f57352x2491ca62 = new android.os.Binder();

    /* renamed from: mConnection */
    private android.content.ServiceConnection f57353xadf6772b = new android.content.ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.this.f57357xe3cda38f = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105856xbd0d1927(iBinder);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.TAG, "HnAdvancedRecordClient onServiceConnected");
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.this.f57357xe3cda38f != null) {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.this.f57358x68ac206b = true;
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.TAG, "HnAdvancedRecordClient onServiceConnected, mIHnAdvancedRecordService is not null");
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.this.f57356x5996eea0.m105837x9ac7b764(2000);
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28 c26803xe6048c28 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.this;
                c26803xe6048c28.m105750x8d0a3d65(c26803xe6048c28.f57354xd6cfe882.getPackageName());
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.this.m105751x8bcb516a(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.TAG, "HnAdvancedRecordClient onServiceDisconnected");
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.this.f57357xe3cda38f = null;
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.this.f57358x68ac206b = false;
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.this.f57356x5996eea0.m105837x9ac7b764(2001);
        }
    };

    /* renamed from: mDeathRecipient */
    private android.os.IBinder.DeathRecipient f57355xa3218bd2 = new android.os.IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.this.f57359x145c7988.unlinkToDeath(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.this.f57355xa3218bd2, 0);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.this.f57356x5996eea0.m105837x9ac7b764(6);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.TAG, "service binder died");
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.this.f57359x145c7988 = null;
        }
    };

    /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient$DenoiseLevel */
    /* loaded from: classes6.dex */
    public enum DenoiseLevel {
        DENOISE_DEFAULT_LEVEL(1);


        /* renamed from: mDenoiseLevel */
        private final int f57362xa7ef1cd8;

        DenoiseLevel(int i17) {
            this.f57362xa7ef1cd8 = i17;
        }

        /* renamed from: getLevel */
        public final int m105761x74bf41ce() {
            return this.f57362xa7ef1cd8;
        }
    }

    /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient$DenoiseMode */
    /* loaded from: classes6.dex */
    public enum DenoiseMode {
        DENOISE_NN_MODE(1);


        /* renamed from: mDenoiseMode */
        private final int f57365x70c63dcf;

        DenoiseMode(int i17) {
            this.f57365x70c63dcf = i17;
        }

        /* renamed from: getMode */
        public final int m105765xfb82a219() {
            return this.f57365x70c63dcf;
        }
    }

    /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient$DenoiseScene */
    /* loaded from: classes6.dex */
    public enum DenoiseScene {
        DENOISE_SPEAK_SCENE(1);


        /* renamed from: mDenoiseScene */
        private final int f57368xa85099e0;

        DenoiseScene(int i17) {
            this.f57368xa85099e0 = i17;
        }

        /* renamed from: getScene */
        public final int m105769x7520bed6() {
            return this.f57368xa85099e0;
        }
    }

    public C26803xe6048c28(android.content.Context context) {
        this.f57356x5996eea0 = null;
        this.f57356x5996eea0 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.m105832x9cf0d20b();
        this.f57354xd6cfe882 = context;
    }

    /* renamed from: bindService */
    private void m105749x54856bb8(android.content.Context context) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "HnAdvancedRecordClient bindService");
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863 c26809x30c9c863 = this.f57356x5996eea0;
        if (c26809x30c9c863 == null || this.f57358x68ac206b) {
            return;
        }
        c26809x30c9c863.m105834x54856bb8(context, this.f57353xadf6772b, f57351xd95bdb2f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: serviceInit */
    public void m105750x8d0a3d65(java.lang.String str) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "HnAdvancedRecordClient serviceInit");
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101 interfaceC26813x75a30101 = this.f57357xe3cda38f;
            if (interfaceC26813x75a30101 == null || !this.f57358x68ac206b) {
                return;
            }
            interfaceC26813x75a30101.mo105853x316510(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "HnAdvancedRecordClient isSupported,RemoteException ex :" + th6.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: serviceLinkToDeath */
    public void m105751x8bcb516a(android.os.IBinder iBinder) {
        this.f57359x145c7988 = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.f57355xa3218bd2, 0);
            } catch (java.lang.Throwable unused) {
                this.f57356x5996eea0.m105837x9ac7b764(2002);
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26805x8904140d
    /* renamed from: destroy */
    public void mo105752x5cd39ffa() {
        super.mo105752x5cd39ffa();
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "destroy, HnAdvancedRecordClient mIsServiceConnected = " + this.f57358x68ac206b);
        if (this.f57358x68ac206b) {
            this.f57358x68ac206b = false;
            this.f57356x5996eea0.m105839xa4bc737f(this.f57354xd6cfe882, this.f57353xadf6772b);
        }
    }

    /* renamed from: disableAdvancedRecord */
    public boolean m105753x4a92581b(android.content.Context context) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "HnAdvancedRecordClient disableAdvancedRecord mIsServiceConnected=" + this.f57358x68ac206b);
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101 interfaceC26813x75a30101 = this.f57357xe3cda38f;
            if (interfaceC26813x75a30101 == null || !this.f57358x68ac206b) {
                return false;
            }
            return interfaceC26813x75a30101.mo105850x4a92581b();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "disableAdvancedRecord failed, RemoteException ex : " + th6.getMessage());
            return false;
        }
    }

    /* renamed from: enableAdvancedRecord */
    public boolean m105754xbbf72f76(android.content.Context context) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "HnAdvancedRecordClient enableAdvancedRecord");
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101 interfaceC26813x75a30101 = this.f57357xe3cda38f;
            if (interfaceC26813x75a30101 == null || !this.f57358x68ac206b) {
                return false;
            }
            return interfaceC26813x75a30101.mo105851xbbf72f76();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "enableAdvancedRecord failed, RemoteException ex : " + th6.getMessage());
            return false;
        }
    }

    /* renamed from: enableRecordDenoise */
    public int m105755xd3b6f8e5(boolean z17, com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.DenoiseMode denoiseMode, com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.DenoiseScene denoiseScene, com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26803xe6048c28.DenoiseLevel denoiseLevel) {
        if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.f57426xca77a673 < 1000001) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "enable record denoise fail, mix version is " + com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.f57426xca77a673);
            return 2004;
        }
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101 interfaceC26813x75a30101 = this.f57357xe3cda38f;
            if (interfaceC26813x75a30101 == null || !this.f57358x68ac206b) {
                return -2;
            }
            return interfaceC26813x75a30101.mo105852xd3b6f8e5(z17, denoiseMode.m105765xfb82a219(), denoiseScene.m105769x7520bed6(), denoiseLevel.m105761x74bf41ce(), this.f57352x2491ca62);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "enableRecordDenoise,RemoteException ex : " + th6.getMessage());
            return -2;
        }
    }

    /* renamed from: initialize */
    public void m105756x33ebcb90(android.content.Context context) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "HnAdvancedRecordClient initialize");
        if (context == null) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "initialize, context is null");
        } else if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.m105833xbfc3d205(context)) {
            m105749x54856bb8(context);
        } else {
            this.f57356x5996eea0.m105837x9ac7b764(2);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "initialize, not install AudioEngine");
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26805x8904140d
    /* renamed from: isServiceSupported */
    public boolean mo105757x8ab4a6c3() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HnAdvancedRecordClient isSupported, type = ");
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.ServiceType serviceType = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.ServiceType.HNAUDIO_SERVICE_ADVANCEDRECORD;
        sb6.append(serviceType.m105794x66e5ae59());
        sb6.append(",mIsServiceConnected=");
        sb6.append(this.f57358x68ac206b);
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, sb6.toString());
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101 interfaceC26813x75a30101 = this.f57357xe3cda38f;
            if (interfaceC26813x75a30101 != null && this.f57358x68ac206b) {
                return interfaceC26813x75a30101.mo105854x450f16a4(serviceType.m105794x66e5ae59());
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "isSupported,RemoteException ex : " + th6.getMessage());
        }
        return super.mo105757x8ab4a6c3();
    }
}
