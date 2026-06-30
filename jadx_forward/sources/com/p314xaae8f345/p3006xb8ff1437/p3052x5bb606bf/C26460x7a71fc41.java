package com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf;

/* renamed from: com.tencent.thumbplayer.datatransport.TPPreloadProxyImpl */
/* loaded from: classes16.dex */
public class C26460x7a71fc41 implements com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a {

    /* renamed from: LOD_P2P_TIMES */
    private static final int f53847x30e6d6b7 = 3;

    /* renamed from: PRELOAD_ID_INVALID */
    private static final int f53848x838222c9 = -1;
    private static final java.lang.String TAG = "TPPreloadProxyImpl";

    /* renamed from: mContext */
    private android.content.Context f53850xd6cfe882;

    /* renamed from: mDownloadProxy */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 f53851x5c202f59;

    /* renamed from: mServiceType */
    private int f53854x371c78e2;

    /* renamed from: loadProxySucc */
    private boolean f53849x27b7df8a = false;

    /* renamed from: mInnerProxyListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26460x7a71fc41.InnerProxyListener f53852xad385dd9 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26460x7a71fc41.InnerProxyListener();

    /* renamed from: mPreloadListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a.IPreloadListener f53853x6ae3adb0 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26459x79358ddb(TAG);

    /* renamed from: com.tencent.thumbplayer.datatransport.TPPreloadProxyImpl$InnerProxyListener */
    /* loaded from: classes15.dex */
    public class InnerProxyListener implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7 {
        private InnerProxyListener() {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7
        public int d(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(str2, "[" + str + ":" + i17 + "] " + str3);
            return 0;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7
        public int e(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(str2, "[" + str + ":" + i17 + "] " + str3);
            return 0;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7
        public int i(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(str2, "[" + str + ":" + i17 + "] " + str3);
            return 0;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8
        /* renamed from: onPrepareDownloadProgressUpdate */
        public void mo102294x8ea30446(int i17, int i18, long j17, long j18, java.lang.String str) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26460x7a71fc41.this.f53853x6ae3adb0.mo54380x8ea30446(i17, i18, j17, j18);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8
        /* renamed from: onPrepareError */
        public void mo102295xfaf06cc0(int i17, int i18, java.lang.String str) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26460x7a71fc41.this.f53853x6ae3adb0.mo54381xfaf06cc0();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8
        /* renamed from: onPrepareOK */
        public void mo102296xc1e12e04() {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26460x7a71fc41.this.f53853x6ae3adb0.mo54382xe9650cbb();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7
        public int w(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(str2, "[" + str + ":" + i17 + "] " + str3);
            return 0;
        }
    }

    public C26460x7a71fc41(android.content.Context context, int i17) {
        this.f53850xd6cfe882 = context;
        this.f53854x371c78e2 = i17;
        m103068xefd01f3e();
    }

    /* renamed from: initProxy */
    private void m103068xefd01f3e() {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b m103074xfa372ad7;
        int i17 = 3;
        while (i17 > 0 && !this.f53849x27b7df8a) {
            try {
                m103074xfa372ad7 = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26462x5cffbe58.m103071x9cf0d20b().m103074xfa372ad7(this.f53854x371c78e2);
            } catch (java.lang.Exception e17) {
                i17--;
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
            if (m103074xfa372ad7 != null && m103074xfa372ad7.mo103015xbe71e310() != null) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 mo103015xbe71e310 = m103074xfa372ad7.mo103015xbe71e310();
                this.f53851x5c202f59 = mo103015xbe71e310;
                mo103015xbe71e310.mo102245x282f0256(this.f53852xad385dd9);
                this.f53851x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52912x3112e5c, java.lang.Boolean.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101648x5943477e()));
                if (!android.text.TextUtils.isEmpty(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101641x35080459())) {
                    this.f53851x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52926x1ed77dc6, com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101641x35080459());
                }
                if (!android.text.TextUtils.isEmpty(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101632xc725eb98(this.f53850xd6cfe882))) {
                    this.f53851x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52905x6ff5a606, com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101632xc725eb98(this.f53850xd6cfe882));
                }
                if (com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101633x57b0ca21(this.f53850xd6cfe882) != -1) {
                    this.f53851x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52906x95398c86, java.lang.String.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101633x57b0ca21(this.f53850xd6cfe882)));
                }
                this.f53851x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52927x1ed77e94, com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101642x35080527());
                this.f53851x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52928xeeb06f06, java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101643x7f87efaa()));
                this.f53851x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52910xf2f60778, com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101637x7e22be6c());
                this.f53849x27b7df8a = true;
                return;
            }
            i17--;
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "p2p so load failed");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a
    /* renamed from: getPlayErrorCodeStr */
    public java.lang.String mo101363xe1ed3aa6(int i17) {
        return null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a
    /* renamed from: isAvailable */
    public boolean mo101364x1a7eccbf() {
        return this.f53851x5c202f59 != null && this.f53849x27b7df8a;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a
    /* renamed from: pushEvent */
    public void mo101365xd0c233a0(int i17) {
        if (mo101364x1a7eccbf()) {
            try {
                this.f53851x5c202f59.mo102241xd0c233a0(i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6);
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a
    /* renamed from: setPreloadListener */
    public void mo101366xb66de91b(com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a.IPreloadListener iPreloadListener) {
        if (iPreloadListener == null) {
            this.f53853x6ae3adb0 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26459x79358ddb(TAG);
        } else {
            this.f53853x6ae3adb0 = iPreloadListener;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a
    /* renamed from: startClipPreload */
    public int mo101367xed7cbad7(java.lang.String str, java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13> arrayList) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "[startClipPreload] Preloading clips.");
        if (arrayList == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "[startClipPreload] Fail to start clip preload: null download parameter list.");
            return -1;
        }
        if (!mo101364x1a7eccbf()) {
            m103068xefd01f3e();
            if (!mo101364x1a7eccbf()) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "[startClipPreload] Fail to initialize proxy.");
                return -1;
            }
        }
        int mo102251xed7cbad7 = this.f53851x5c202f59.mo102251xed7cbad7(str, arrayList.size(), this.f53852xad385dd9);
        if (mo102251xed7cbad7 <= 0) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "[startClipPreload] Fail to start clip preload: invalid preload ID.");
            mo101370xa07057a7(mo102251xed7cbad7);
            return -1;
        }
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13> it = arrayList.iterator();
        int i17 = 1;
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 next = it.next();
            if (!this.f53851x5c202f59.mo102244xad41f2a0(mo102251xed7cbad7, i17, next.m101382xfe398b35(), com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26464x151ba67f.m103086x9365589(next.m101411xb5887639(), next, null, null))) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "[startClipPreload] Fail to set clip info.");
                mo101370xa07057a7(mo102251xed7cbad7);
                return -1;
            }
            i17++;
        }
        try {
            this.f53851x5c202f59.mo102255x81156d07(mo102251xed7cbad7);
            return mo102251xed7cbad7;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "[startClipPreload] Fail to start task: " + th6.toString());
            mo101370xa07057a7(mo102251xed7cbad7);
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a
    /* renamed from: startPreload */
    public int mo101368xe500ef47(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13) {
        return mo101369xe500ef47(str, c26231xafaedb13, null);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a
    /* renamed from: stopPreload */
    public void mo101370xa07057a7(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 interfaceC26361x94977a41 = this.f53851x5c202f59;
        if (interfaceC26361x94977a41 == null) {
            return;
        }
        try {
            interfaceC26361x94977a41.mo102258xa07057a7(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a
    /* renamed from: startPreload */
    public int mo101369xe500ef47(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13, java.util.Map<java.lang.String, java.lang.String> map) {
        if (!mo101364x1a7eccbf()) {
            m103068xefd01f3e();
            if (!mo101364x1a7eccbf()) {
                return -1;
            }
        }
        if (c26231xafaedb13 != null) {
            try {
                return this.f53851x5c202f59.mo102254xe500ef47(str, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26464x151ba67f.m103086x9365589(null, c26231xafaedb13, map, null), this.f53852xad385dd9);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6);
            }
        }
        return -1;
    }
}
