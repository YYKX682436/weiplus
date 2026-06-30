package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a;

/* renamed from: com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient */
/* loaded from: classes16.dex */
public class C26808x5890a1e7 extends com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26805x8904140d {

    /* renamed from: ENGINE_CLASS_NAME */
    private static final java.lang.String f57406xd95bdb2f = "com.hihonor.android.magicx.media.audioengine.HnEarReturnServiceImpl";
    private static final java.lang.String TAG = "HnAudioEngine.HnEarReturnClient";

    /* renamed from: mContext */
    private android.content.Context f57408xd6cfe882;

    /* renamed from: mFeatureKitManager */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863 f57410x5996eea0;

    /* renamed from: mHnEarReturnService */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370 f57411xffbf9022;

    /* renamed from: mIsServiceConnected */
    private boolean f57412x68ac206b = false;

    /* renamed from: mService */
    private android.os.IBinder f57413x145c7988 = null;

    /* renamed from: mConnection */
    private android.content.ServiceConnection f57407xadf6772b = new android.content.ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.TAG, "onServiceConnected");
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this.f57411xffbf9022 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.m105880xbd0d1927(iBinder);
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this.f57411xffbf9022 != null) {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this.f57412x68ac206b = true;
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7 c26808x5890a1e7 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this;
                if (!c26808x5890a1e7.m105822x8d0a3d65(c26808x5890a1e7.f57408xd6cfe882.getPackageName())) {
                    com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this.f57410x5996eea0.m105837x9ac7b764(1002);
                } else {
                    com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this.m105823x8bcb516a(iBinder);
                    com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this.f57410x5996eea0.m105837x9ac7b764(1000);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.TAG, "onServiceDisconnected");
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this.f57412x68ac206b = false;
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this.f57410x5996eea0 != null) {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this.f57410x5996eea0.m105837x9ac7b764(1001);
            }
        }
    };

    /* renamed from: mDeathRecipient */
    private android.os.IBinder.DeathRecipient f57409xa3218bd2 = new android.os.IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.TAG, "binderDied");
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this.f57413x145c7988.unlinkToDeath(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this.f57409xa3218bd2, 0);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this.f57410x5996eea0.m105837x9ac7b764(1003);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.this.f57413x145c7988 = null;
        }
    };

    /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient$ParameName */
    /* loaded from: classes16.dex */
    public enum ParameName {
        CMD_SET_AUDIO_EFFECT_MODE_BASE("Karaoke_reverb_mode="),
        CMD_SET_VOCAL_VOLUME_BASE("Karaoke_volume="),
        CMD_SET_VOCAL_EQUALIZER_MODE("Karaoke_eq_mode=");


        /* renamed from: mParameName */
        private java.lang.String f57418xf7786470;

        ParameName(java.lang.String str) {
            this.f57418xf7786470 = str;
        }

        /* renamed from: getParameName */
        public final java.lang.String m105830x9872419() {
            return this.f57418xf7786470;
        }
    }

    public C26808x5890a1e7(android.content.Context context) {
        this.f57410x5996eea0 = null;
        this.f57410x5996eea0 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.m105832x9cf0d20b();
        this.f57408xd6cfe882 = context;
    }

    /* renamed from: bindService */
    private void m105820x54856bb8(android.content.Context context) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "bindService");
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863 c26809x30c9c863 = this.f57410x5996eea0;
            if (c26809x30c9c863 == null || this.f57412x68ac206b) {
                return;
            }
            c26809x30c9c863.m105834x54856bb8(context, this.f57407xadf6772b, f57406xd95bdb2f);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "bindService,RemoteException ex : " + th6.getMessage());
        }
    }

    /* renamed from: getEarReturnLatency */
    private int m105821xdd389d6e() {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "getEarReturnLatency");
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370 interfaceC26817x589e1370 = this.f57411xffbf9022;
            if (interfaceC26817x589e1370 == null || !this.f57412x68ac206b) {
                return -1;
            }
            return interfaceC26817x589e1370.mo105876xdd389d6e();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "getEarReturnLatency,RemoteException ex : " + th6.getMessage());
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: serviceInit */
    public boolean m105822x8d0a3d65(java.lang.String str) {
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370 interfaceC26817x589e1370 = this.f57411xffbf9022;
            if (interfaceC26817x589e1370 != null && this.f57412x68ac206b) {
                interfaceC26817x589e1370.mo105877x316510(str);
            }
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "isSupported,RemoteException ex :" + th6.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: serviceLinkToDeath */
    public void m105823x8bcb516a(android.os.IBinder iBinder) {
        this.f57413x145c7988 = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.f57409xa3218bd2, 0);
            } catch (java.lang.Throwable unused) {
                this.f57410x5996eea0.m105837x9ac7b764(1002);
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26805x8904140d
    /* renamed from: destroy */
    public void mo105752x5cd39ffa() {
        try {
            super.mo105752x5cd39ffa();
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "destroy, mIsServiceConnected = " + this.f57412x68ac206b);
            if (this.f57412x68ac206b) {
                this.f57412x68ac206b = false;
                this.f57410x5996eea0.m105839xa4bc737f(this.f57408xd6cfe882, this.f57407xadf6772b);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "bindService,RemoteException ex : " + th6.getMessage());
        }
    }

    /* renamed from: enableEarReturn */
    public int m105824x76f6d5e3(boolean z17) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "enableEarReturn, enable = ".concat(java.lang.String.valueOf(z17)));
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370 interfaceC26817x589e1370 = this.f57411xffbf9022;
            if (interfaceC26817x589e1370 == null || !this.f57412x68ac206b) {
                return -2;
            }
            return interfaceC26817x589e1370.mo105875x76f6d5e3(z17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "enableEarReturn,RemoteException ex : " + th6.getMessage());
            return -2;
        }
    }

    /* renamed from: initialize */
    public void m105825x33ebcb90(android.content.Context context) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "initialize");
        if (context == null) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "initialize, context is null");
        } else if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.m105833xbfc3d205(context)) {
            m105820x54856bb8(context);
        } else {
            this.f57410x5996eea0.m105837x9ac7b764(2);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "initialize, not install AudioEngine");
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26805x8904140d
    /* renamed from: isServiceSupported */
    public boolean mo105757x8ab4a6c3() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSupported, type = ");
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.ServiceType serviceType = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.ServiceType.HNAUDIO_SERVICE_EARRETURN;
        sb6.append(serviceType.m105794x66e5ae59());
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, sb6.toString());
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370 interfaceC26817x589e1370 = this.f57411xffbf9022;
            if (interfaceC26817x589e1370 != null && this.f57412x68ac206b) {
                return interfaceC26817x589e1370.mo105878x450f16a4(serviceType.m105794x66e5ae59());
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "isSupported,RemoteException ex : " + th6.getMessage());
        }
        return super.mo105757x8ab4a6c3();
    }

    /* renamed from: setParameter */
    public int m105826xd03fe567(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26808x5890a1e7.ParameName parameName, int i17) {
        if (parameName == null) {
            return 1807;
        }
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "parameValue =" + i17 + ", parame.getParameName() =" + parameName.m105830x9872419());
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370 interfaceC26817x589e1370 = this.f57411xffbf9022;
            if (interfaceC26817x589e1370 == null || !this.f57412x68ac206b) {
                return -2;
            }
            return interfaceC26817x589e1370.mo105879xd03fe567(parameName.m105830x9872419(), i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "setParameter,RemoteException ex : " + th6.getMessage());
            return -2;
        }
    }
}
