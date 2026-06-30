package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a;

/* renamed from: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient */
/* loaded from: classes16.dex */
public class C26806xdc65f6eb extends com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26805x8904140d {

    /* renamed from: ENGINE_CLASS_NAME */
    private static final java.lang.String f57387xd95bdb2f = "com.hihonor.android.magicx.media.audioengine.HnAudioPlayServiceImpl";
    private static final java.lang.String TAG = "HnAudioEngine.HnAudioPlayClient";

    /* renamed from: mContext */
    private android.content.Context f57389xd6cfe882;

    /* renamed from: mFeatureKitManager */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863 f57391x5996eea0;

    /* renamed from: mHnAudioPlayService */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec f57392xf694db9e;

    /* renamed from: mIsServiceConnected */
    private boolean f57393x68ac206b = false;

    /* renamed from: mService */
    private android.os.IBinder f57394x145c7988 = null;

    /* renamed from: mConnection */
    private android.content.ServiceConnection f57388xadf6772b = new android.content.ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.TAG, "onServiceConnected");
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.this.f57392xf694db9e = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.m105863xbd0d1927(iBinder);
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.this.f57392xf694db9e != null) {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.this.f57393x68ac206b = true;
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb c26806xdc65f6eb = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.this;
                c26806xdc65f6eb.m105806x8d0a3d65(c26806xdc65f6eb.f57389xd6cfe882.getPackageName());
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.this.m105807x8bcb516a(iBinder);
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.this.f57391x5996eea0.m105837x9ac7b764(3000);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.TAG, "onServiceDisconnected");
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.this.f57393x68ac206b = false;
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.this.f57391x5996eea0 != null) {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.this.f57391x5996eea0.m105837x9ac7b764(3001);
            }
        }
    };

    /* renamed from: mDeathRecipient */
    private android.os.IBinder.DeathRecipient f57390xa3218bd2 = new android.os.IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.this.f57394x145c7988.unlinkToDeath(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.this.f57390xa3218bd2, 0);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.this.f57391x5996eea0.m105837x9ac7b764(3004);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.TAG, "service binder died");
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26806xdc65f6eb.this.f57394x145c7988 = null;
        }
    };

    public C26806xdc65f6eb(android.content.Context context) {
        this.f57391x5996eea0 = null;
        this.f57391x5996eea0 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.m105832x9cf0d20b();
        this.f57389xd6cfe882 = context;
    }

    /* renamed from: bindService */
    private void m105805x54856bb8(android.content.Context context) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "bindService");
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863 c26809x30c9c863 = this.f57391x5996eea0;
        if (c26809x30c9c863 == null || this.f57393x68ac206b) {
            return;
        }
        c26809x30c9c863.m105834x54856bb8(context, this.f57388xadf6772b, f57387xd95bdb2f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: serviceInit */
    public void m105806x8d0a3d65(java.lang.String str) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "HnAudioPlayClient serviceInit");
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec interfaceC26814x4f735eec = this.f57392xf694db9e;
            if (interfaceC26814x4f735eec == null || !this.f57393x68ac206b) {
                return;
            }
            interfaceC26814x4f735eec.mo105862x316510(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "HnAudioPlayClient isSupported,RemoteException ex :" + th6.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: serviceLinkToDeath */
    public void m105807x8bcb516a(android.os.IBinder iBinder) {
        this.f57394x145c7988 = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.f57390xa3218bd2, 0);
            } catch (java.lang.Throwable unused) {
                this.f57391x5996eea0.m105837x9ac7b764(3003);
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26805x8904140d
    /* renamed from: destroy */
    public void mo105752x5cd39ffa() {
        super.mo105752x5cd39ffa();
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "destroy, mIsServiceConnected = " + this.f57393x68ac206b);
        if (this.f57393x68ac206b) {
            this.f57393x68ac206b = false;
            this.f57391x5996eea0.m105839xa4bc737f(this.f57389xd6cfe882, this.f57388xadf6772b);
        }
    }

    /* renamed from: enableHighSampleRatePlay */
    public void m105808x476c3923(boolean z17) {
        if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.f57426xca77a673 < 1000001) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "not support high sample rate play service. The mix version is " + com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.f57426xca77a673);
            this.f57391x5996eea0.m105837x9ac7b764(3002);
            return;
        }
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "enableHighSampleRatePlay, enable = ".concat(java.lang.String.valueOf(z17)));
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec interfaceC26814x4f735eec = this.f57392xf694db9e;
            if (interfaceC26814x4f735eec == null || !this.f57393x68ac206b) {
                return;
            }
            interfaceC26814x4f735eec.mo105861x476c3923(z17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "enableHighSampleRatePlay,RemoteException ex : " + th6.getMessage());
        }
    }

    /* renamed from: initialize */
    public void m105809x33ebcb90(android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "initialize, context is null");
        } else if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.m105833xbfc3d205(context)) {
            m105805x54856bb8(context);
        } else {
            this.f57391x5996eea0.m105837x9ac7b764(2);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "initialize, not install AudioEngine");
        }
    }
}
