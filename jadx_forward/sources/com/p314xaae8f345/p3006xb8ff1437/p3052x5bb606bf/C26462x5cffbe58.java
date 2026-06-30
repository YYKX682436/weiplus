package com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf;

/* renamed from: com.tencent.thumbplayer.datatransport.TPProxyGlobalManager */
/* loaded from: classes16.dex */
public class C26462x5cffbe58 implements com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.OnGlobalEventChangeListener, com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.OnNetStatusChangeListener {
    private static final java.lang.String TAG = "TPProxyGlobalManager";

    /* renamed from: mAppBackOrFront */
    private int f53856x20caf00b;

    /* renamed from: mServiceTypeDownloadProxyMap */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b> f53857xc23601b8;

    /* renamed from: mUpc */
    private java.lang.String f53858x32d97b;

    /* renamed from: mUpcState */
    private int f53859x7158afd6;

    /* renamed from: com.tencent.thumbplayer.datatransport.TPProxyGlobalManager$InstanceHolder */
    /* loaded from: classes16.dex */
    public static class InstanceHolder {

        /* renamed from: instance */
        private static com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26462x5cffbe58 f53861x21169495 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26462x5cffbe58();

        private InstanceHolder() {
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26462x5cffbe58 m103071x9cf0d20b() {
        return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26462x5cffbe58.InstanceHolder.f53861x21169495;
    }

    /* renamed from: pushAllProxyManagerEvent */
    private void m103072xc2b38f14(int i17) {
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b> it = this.f53857xc23601b8.values().iterator();
        while (it.hasNext()) {
            it.next().mo103016xd0c233a0(i17);
        }
    }

    /* renamed from: pushAllProxyManagerUpcChanged */
    private void m103073x25ed3832(java.lang.String str, int i17) {
        this.f53858x32d97b = str;
        this.f53859x7158afd6 = i17;
        for (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b interfaceC26455xfa6e82b : this.f53857xc23601b8.values()) {
            interfaceC26455xfa6e82b.mo103015xbe71e310().mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52927x1ed77e94, str);
            interfaceC26455xfa6e82b.mo103015xbe71e310().mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52928xeeb06f06, java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: getPlayerProxy */
    public com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b m103074xfa372ad7(int i17) {
        if (i17 < 0) {
            return null;
        }
        if (this.f53857xc23601b8.containsKey(java.lang.Integer.valueOf(i17))) {
            return this.f53857xc23601b8.get(java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 m102340x61ce4f94 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.m102340x61ce4f94(i17);
        if (m102340x61ce4f94 != null) {
            try {
                int mo102239x316510 = m102340x61ce4f94.mo102239x316510(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101093x6a789444(), com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103091xf5246b85(i17));
                if (mo102239x316510 < 0) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "downloadProxy init failed with status:" + mo102239x316510 + " downloadProxy:" + m102340x61ce4f94);
                    return null;
                }
                m102340x61ce4f94.mo102245x282f0256(new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7() { // from class: com.tencent.thumbplayer.datatransport.TPProxyGlobalManager.1
                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7
                    public int d(java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
                        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(str2, "[" + str + ":" + i18 + "] " + str3);
                        return 0;
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7
                    public int e(java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
                        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(str2, "[" + str + ":" + i18 + "] " + str3);
                        return 0;
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7
                    public int i(java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
                        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(str2, "[" + str + ":" + i18 + "] " + str3);
                        return 0;
                    }

                    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7
                    public int w(java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
                        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(str2, "[" + str + ":" + i18 + "] " + str3);
                        return 0;
                    }
                });
                com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225 m103090x3b48761a = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103090x3b48761a(i17);
                int m104333x84e6f80a = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.m104333x84e6f80a();
                if (m104333x84e6f80a == 1) {
                    m102340x61ce4f94.mo102241xd0c233a0(1);
                    m102340x61ce4f94.mo102241xd0c233a0(10);
                } else if (m104333x84e6f80a == 2) {
                    m102340x61ce4f94.mo102241xd0c233a0(2);
                    m102340x61ce4f94.mo102241xd0c233a0(9);
                } else if (m104333x84e6f80a == 3) {
                    m102340x61ce4f94.mo102241xd0c233a0(2);
                    m102340x61ce4f94.mo102241xd0c233a0(10);
                }
                m102340x61ce4f94.mo102241xd0c233a0(this.f53856x20caf00b);
                m102340x61ce4f94.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52927x1ed77e94, this.f53858x32d97b);
                m102340x61ce4f94.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52928xeeb06f06, java.lang.Integer.valueOf(this.f53859x7158afd6));
                long j17 = m103090x3b48761a.f53872x52ae3f0d;
                if (j17 > 0) {
                    m102340x61ce4f94.mo102246xd7e17d2f(j17);
                }
                com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26463xd7afd14 c26463xd7afd14 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26463xd7afd14(m102340x61ce4f94);
                this.f53857xc23601b8.put(java.lang.Integer.valueOf(i17), c26463xd7afd14);
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "getPlayerProxy, init proxy succeeded, serviceType:" + i17);
                return c26463xd7afd14;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "init proxy failed:" + th6);
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.OnGlobalEventChangeListener
    /* renamed from: onEvent */
    public void mo103064xaf8c47fb(int i17, int i18, int i19, java.lang.Object obj) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onEvent eventId: " + i17 + ", arg1: " + i18 + ", arg2: " + i19 + ", object" + obj);
        switch (i17) {
            case 100001:
                this.f53856x20caf00b = 13;
                m103072xc2b38f14(13);
                return;
            case 100002:
                this.f53856x20caf00b = 14;
                m103072xc2b38f14(14);
                return;
            case com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.f55299x87635d9e /* 100003 */:
                m103073x25ed3832((java.lang.String) obj, i18);
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.OnNetStatusChangeListener
    /* renamed from: onStatusChanged */
    public void mo103065xed0a9ac3(int i17, int i18, int i19, int i27) {
        if (i18 == 1) {
            m103072xc2b38f14(1);
            m103072xc2b38f14(10);
        } else if (i18 == 2) {
            m103072xc2b38f14(2);
            m103072xc2b38f14(9);
        } else if (i18 == 3) {
            m103072xc2b38f14(2);
            m103072xc2b38f14(10);
        }
    }

    /* renamed from: proxyInit */
    public void m103075xe39bbc9e() {
        m103071x9cf0d20b().m103074xfa372ad7(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101640xab647bb7());
    }

    /* renamed from: updateDataReportEnable */
    public void m103077x10788f8a(boolean z17) {
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b> it = this.f53857xc23601b8.values().iterator();
        while (it.hasNext()) {
            it.next().mo103015xbe71e310().mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52921xa6ff5647, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225.Helper.m103111x38a6f981(z17));
        }
    }

    /* renamed from: updateMaxStorageSizeMB */
    public void m103079xa5c04b96(long j17) {
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b> it = this.f53857xc23601b8.values().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 mo103015xbe71e310 = it.next().mo103015xbe71e310();
            if (mo103015xbe71e310 != null && j17 > 0) {
                mo103015xbe71e310.mo102246xd7e17d2f(j17);
            }
        }
    }

    /* renamed from: updateMaxUseMemoryMB */
    public void m103081x4ef42a22(long j17) {
        for (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b interfaceC26455xfa6e82b : this.f53857xc23601b8.values()) {
            if (interfaceC26455xfa6e82b.mo103015xbe71e310() != null && j17 > 0) {
                interfaceC26455xfa6e82b.mo103015xbe71e310().mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52921xa6ff5647, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225.Helper.m103110x47418023(j17));
            }
        }
    }

    /* renamed from: updateVodCachedEnable */
    public void m103083x43869a7(boolean z17) {
        for (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b interfaceC26455xfa6e82b : this.f53857xc23601b8.values()) {
            if (interfaceC26455xfa6e82b.mo103015xbe71e310() != null) {
                interfaceC26455xfa6e82b.mo103015xbe71e310().mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52922xea8f1b20, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225.Helper.m103112x191f441a(z17));
            }
        }
    }

    private C26462x5cffbe58() {
        this.f53856x20caf00b = 0;
        this.f53858x32d97b = "";
        this.f53859x7158afd6 = 0;
        if (this.f53857xc23601b8 == null) {
            this.f53857xc23601b8 = new java.util.concurrent.ConcurrentHashMap<>();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.m104303xdab2e64d(this);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.m104331x9cf0d20b().m104347x9e2a13d3(this);
    }

    /* renamed from: updateMaxStorageSizeMB */
    public void m103078xa5c04b96(int i17, long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b interfaceC26455xfa6e82b = this.f53857xc23601b8.get(java.lang.Integer.valueOf(i17));
        if (interfaceC26455xfa6e82b == null || interfaceC26455xfa6e82b.mo103015xbe71e310() == null || j17 <= 0) {
            return;
        }
        interfaceC26455xfa6e82b.mo103015xbe71e310().mo102246xd7e17d2f(j17);
    }

    /* renamed from: updateDataReportEnable */
    public void m103076x10788f8a(int i17, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b interfaceC26455xfa6e82b = this.f53857xc23601b8.get(java.lang.Integer.valueOf(i17));
        if (interfaceC26455xfa6e82b == null || interfaceC26455xfa6e82b.mo103015xbe71e310() == null) {
            return;
        }
        interfaceC26455xfa6e82b.mo103015xbe71e310().mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52921xa6ff5647, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225.Helper.m103111x38a6f981(z17));
    }

    /* renamed from: updateMaxUseMemoryMB */
    public void m103080x4ef42a22(int i17, long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b interfaceC26455xfa6e82b = this.f53857xc23601b8.get(java.lang.Integer.valueOf(i17));
        if (interfaceC26455xfa6e82b == null || interfaceC26455xfa6e82b.mo103015xbe71e310() == null || j17 <= 0) {
            return;
        }
        interfaceC26455xfa6e82b.mo103015xbe71e310().mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52921xa6ff5647, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225.Helper.m103110x47418023(j17));
    }

    /* renamed from: updateVodCachedEnable */
    public void m103082x43869a7(int i17, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b interfaceC26455xfa6e82b = this.f53857xc23601b8.get(java.lang.Integer.valueOf(i17));
        if (interfaceC26455xfa6e82b == null || interfaceC26455xfa6e82b.mo103015xbe71e310() == null) {
            return;
        }
        interfaceC26455xfa6e82b.mo103015xbe71e310().mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52922xea8f1b20, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26466xe7648225.Helper.m103112x191f441a(z17));
    }
}
