package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a;

/* renamed from: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient */
/* loaded from: classes16.dex */
public class C26804xae65fc97 {

    /* renamed from: DEFAULT_FEATURE_LIST */
    private static final java.util.List<java.lang.Integer> f57369x36d775c5 = new java.util.ArrayList(0);

    /* renamed from: DEFAULT_VALUE */
    private static final int f57370x3ef281b3 = 0;

    /* renamed from: ENGINE_CLASS_NAME */
    private static final java.lang.String f57371xd95bdb2f = "com.hihonor.android.magicx.media.audioengine.HnAudioServiceImpl";

    /* renamed from: ENGINE_PACKAGE_NAME */
    private static final java.lang.String f57372xe553c9e1 = "com.hihonor.android.magicx.media.audioengine";
    private static final java.lang.String TAG = "HnAudioEngine.HnAudioClient";

    /* renamed from: mContext */
    private android.content.Context f57374xd6cfe882;

    /* renamed from: mFeatureKitManager */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863 f57376x5996eea0;

    /* renamed from: mIHnAudioService */
    private com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240 f57377xcedb7ec1 = null;

    /* renamed from: mIsServiceConnected */
    private boolean f57378x68ac206b = false;

    /* renamed from: mService */
    private android.os.IBinder f57379x145c7988 = null;

    /* renamed from: mSupportedServiceList */
    private java.util.List<java.lang.Integer> f57380xf59aff72 = new java.util.ArrayList();

    /* renamed from: mConnection */
    private android.content.ServiceConnection f57373xadf6772b = new android.content.ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.this.f57377xcedb7ec1 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.m105870xbd0d1927(iBinder);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.TAG, "onServiceConnected");
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.this.f57377xcedb7ec1 != null) {
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.this.f57378x68ac206b = true;
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.TAG, "onServiceConnected, mIHnAudioService is not null");
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.this.f57376x5996eea0.m105837x9ac7b764(0);
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97 c26804xae65fc97 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.this;
                c26804xae65fc97.m105784x8d0a3d65(c26804xae65fc97.f57374xd6cfe882.getPackageName(), com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26812xb4ce712e.f57470x34efd9b7);
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.this.m105785x8bcb516a(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.TAG, "onServiceDisconnected");
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.this.f57377xcedb7ec1 = null;
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.this.f57378x68ac206b = false;
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.this.f57376x5996eea0.m105837x9ac7b764(4);
        }
    };

    /* renamed from: mDeathRecipient */
    private android.os.IBinder.DeathRecipient f57375xa3218bd2 = new android.os.IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.this.f57379x145c7988.unlinkToDeath(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.this.f57375xa3218bd2, 0);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.this.f57376x5996eea0.m105837x9ac7b764(6);
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.TAG, "service binder died");
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.this.f57379x145c7988 = null;
        }
    };

    /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient$ServiceType */
    /* loaded from: classes6.dex */
    public enum ServiceType {
        HNAUDIO_SERVICE_EARRETURN(1),
        HNAUDIO_SERVICE_ADVANCEDRECORD(2),
        HNAUDIO_SERVICE_HIGHSAMPLERATEPLAY(3),
        HNAUDIO_SERVICE_RECORDDENOISE(4);


        /* renamed from: mServiceType */
        private int f57386x371c78e2;

        ServiceType(int i17) {
            this.f57386x371c78e2 = i17;
        }

        /* renamed from: getServiceType */
        public final int m105794x66e5ae59() {
            return this.f57386x371c78e2;
        }
    }

    public C26804xae65fc97(android.content.Context context, com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26816x4a2b96a5 interfaceC26816x4a2b96a5) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863 m105832x9cf0d20b = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.m105832x9cf0d20b();
        this.f57376x5996eea0 = m105832x9cf0d20b;
        this.f57374xd6cfe882 = null;
        m105832x9cf0d20b.m105838x6c4032e7(interfaceC26816x4a2b96a5);
        this.f57374xd6cfe882 = context;
    }

    /* renamed from: bindService */
    private void m105781x54856bb8(android.content.Context context) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "bindService, mIsServiceConnected = " + this.f57378x68ac206b);
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863 c26809x30c9c863 = this.f57376x5996eea0;
            if (c26809x30c9c863 == null || this.f57378x68ac206b) {
                return;
            }
            c26809x30c9c863.m105834x54856bb8(context, this.f57373xadf6772b, f57371xd95bdb2f);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "bindService,RemoteException ex : " + th6.getMessage());
        }
    }

    /* renamed from: filterUnsupportedService */
    private void m105782x497e058(int i17) {
        if (i17 == 1) {
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.f57426xca77a673 >= 1000000) {
                this.f57380xf59aff72.add(java.lang.Integer.valueOf(i17));
            }
        } else if (i17 == 2) {
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.f57426xca77a673 >= 1000000) {
                this.f57380xf59aff72.add(java.lang.Integer.valueOf(i17));
            }
        } else if (i17 == 3) {
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.f57426xca77a673 >= 1000001) {
                this.f57380xf59aff72.add(java.lang.Integer.valueOf(i17));
            }
        } else if (i17 == 4 && com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.f57426xca77a673 >= 1000001) {
            this.f57380xf59aff72.add(java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: isDeviceSupported */
    public static boolean m105783xe8ec086e(android.content.Context context) {
        return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.m105833xbfc3d205(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: serviceInit */
    public void m105784x8d0a3d65(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "serviceInit");
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240 interfaceC26815x6eeb5240 = this.f57377xcedb7ec1;
            if (interfaceC26815x6eeb5240 == null || !this.f57378x68ac206b) {
                return;
            }
            interfaceC26815x6eeb5240.mo105868x316510(str, str2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "isFeatureSupported,RemoteException ex :" + th6.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: serviceLinkToDeath */
    public void m105785x8bcb516a(android.os.IBinder iBinder) {
        this.f57379x145c7988 = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.f57375xa3218bd2, 0);
            } catch (java.lang.Throwable unused) {
                this.f57376x5996eea0.m105837x9ac7b764(5);
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    /* renamed from: createService */
    public <T extends com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26805x8904140d> T m105786xfc2aea19(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.ServiceType serviceType) {
        if (this.f57376x5996eea0 != null && serviceType != null && this.f57380xf59aff72.contains(java.lang.Integer.valueOf(serviceType.m105794x66e5ae59()))) {
            return (T) this.f57376x5996eea0.m105835x63d3b21c(serviceType.m105794x66e5ae59(), this.f57374xd6cfe882);
        }
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "createService fail");
        return null;
    }

    /* renamed from: destroy */
    public void m105787x5cd39ffa() {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "destroy, mIsServiceConnected = " + this.f57378x68ac206b);
        try {
            if (this.f57378x68ac206b) {
                this.f57378x68ac206b = false;
                this.f57376x5996eea0.m105839xa4bc737f(this.f57374xd6cfe882, this.f57373xadf6772b);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "unbindService,RemoteException ex : " + th6.getMessage());
        }
    }

    /* renamed from: getSupportedServices */
    public java.util.List<java.lang.Integer> m105788xb9854276() {
        try {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240 interfaceC26815x6eeb5240 = this.f57377xcedb7ec1;
            if (interfaceC26815x6eeb5240 != null && this.f57378x68ac206b) {
                java.util.List mo105867xb9854276 = interfaceC26815x6eeb5240.mo105867xb9854276();
                if (mo105867xb9854276 == null) {
                    com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "list is null");
                    return f57369x36d775c5;
                }
                this.f57380xf59aff72.clear();
                java.util.Iterator it = mo105867xb9854276.iterator();
                while (it.hasNext()) {
                    m105782x497e058(((java.lang.Integer) it.next()).intValue());
                }
                com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "getSupportedServices " + java.util.Arrays.toString(mo105867xb9854276.toArray()));
                return this.f57380xf59aff72;
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "getSupportedServices, createFeature,wait bind service fail");
        }
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "getSupportedServices, service not bind");
        return f57369x36d775c5;
    }

    /* renamed from: initialize */
    public void m105789x33ebcb90() {
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "initialize");
        android.content.Context context = this.f57374xd6cfe882;
        if (context == null) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "mContext is null");
            this.f57376x5996eea0.m105837x9ac7b764(7);
        } else if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26809x30c9c863.m105833xbfc3d205(context)) {
            m105781x54856bb8(this.f57374xd6cfe882);
        } else {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "not install AudioKitEngine");
            this.f57376x5996eea0.m105837x9ac7b764(2);
        }
    }

    /* renamed from: isServiceSupported */
    public boolean m105790x8ab4a6c3(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26804xae65fc97.ServiceType serviceType) {
        if (serviceType == null) {
            return false;
        }
        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105845x3164ae(TAG, "isServiceSupported, type = " + serviceType.m105794x66e5ae59());
        try {
            if (this.f57377xcedb7ec1 != null && this.f57378x68ac206b && this.f57380xf59aff72.contains(java.lang.Integer.valueOf(serviceType.m105794x66e5ae59()))) {
                return this.f57377xcedb7ec1.mo105869x8ab4a6c3(serviceType.m105794x66e5ae59());
            }
            return false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26810xd2cb1e37.m105842x5c4d208(TAG, "isServiceSupported,RemoteException ex : " + th6.getMessage());
            return false;
        }
    }
}
