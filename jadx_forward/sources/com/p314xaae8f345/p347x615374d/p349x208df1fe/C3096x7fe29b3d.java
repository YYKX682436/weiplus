package com.p314xaae8f345.p347x615374d.p349x208df1fe;

@j95.b
/* renamed from: com.tencent.kinda.framework.WxCrossServices */
/* loaded from: classes9.dex */
public class C3096x7fe29b3d extends i95.w implements h45.q, wo3.s {

    /* renamed from: OFFLINE_FINISH_KEY */
    private static final java.lang.String f11677xdc08648f = "Offline.shouldFinishTransparentUI";

    /* renamed from: REPORT_IDKEY */
    public static final int f11678xf889b479 = 1004;

    /* renamed from: SINGLE_BYTE_CHARSET_FOR_SAVE */
    private static final java.lang.String f11679xb5bec6a6 = "ISO-8859-1";
    public static final java.lang.String TAG = "MicroMsg.WxCrossServices";

    /* renamed from: TAG_SCAN_QR_CODE_PAY */
    private static final java.lang.String f11680x9001d2f7 = "tag_scan_qrcode_pay";

    /* renamed from: appListener */
    private com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5160x33ad8273> f11684x7cd0f1f5;

    /* renamed from: jsApiOfflineUserBindQueryEvent */
    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5653x583ecdca f11688xa0398fac;

    /* renamed from: jsApiOfflineUserBindQueryListener */
    private com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5653x583ecdca> f11689xca20b662;

    /* renamed from: lastLat */
    private float f11692xfd318729;

    /* renamed from: lastLng */
    private float f11693xfd3188af;

    /* renamed from: mDialogForScanPay */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f11694xbd91f5d7;

    /* renamed from: netListener */
    private com.p314xaae8f345.mm.p971x6de15a2e.s0 f11696xde57e571;

    /* renamed from: onLocationGet */
    private i11.c f11697x3d79e802;

    /* renamed from: walletLockListener */
    private com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f> f11699xcf260d98;

    /* renamed from: report */
    public static com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.MaybeCrashReport f11682xc84c5534 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.MaybeCrashReport();

    /* renamed from: currentSessionUserName */
    public static java.lang.String f11681x6f8426f3 = "";

    /* renamed from: hasUpdateNfc */
    private boolean f11687x4b1432a8 = false;

    /* renamed from: deeplinkUrl */
    private java.lang.String f11685x8660c4a9 = "";

    /* renamed from: overseaWalletRequestInfo */
    public java.util.HashMap<java.lang.String, java.lang.String> f11698x25df9069 = new java.util.HashMap<>();

    /* renamed from: kindaLiteMgr */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3194xff8cea9d f11690xf5c1967d = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3194xff8cea9d();

    /* renamed from: firstPreloadTime */
    private long f11686x2e694fa6 = 0;

    /* renamed from: accountLoginSuccessTime */
    private long f11683x7aec4e94 = 0;

    /* renamed from: lastEnterForegroundTime */
    private long f11691xfa846132 = 0;

    /* renamed from: mInitFlag */
    private boolean f11695x34f77829 = false;

    /* renamed from: com.tencent.kinda.framework.WxCrossServices$15, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass15 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5653x583ecdca> {
        public AnonymousClass15(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = 1878810586;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5653x583ecdca c5653x583ecdca) {
            if (!com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.mo24779x384d4000("offline")) {
                return false;
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11688xa0398fac = c5653x583ecdca;
            am.uh uhVar = c5653x583ecdca.f135978g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "on JsApiOfflineUserBindQueryResultCallBackEvent callback，appid: %s, package: %s", uhVar.f89618a, uhVar.f89623f);
            am.uh uhVar2 = c5653x583ecdca.f135978g;
            ss4.d dVar = new ss4.d(uhVar2.f89618a, uhVar2.f89622e, uhVar2.f89621d, uhVar2.f89623f, uhVar2.f89625h, uhVar2.f89624g, 23, uhVar2.f89619b, uhVar2.f89620c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m8.f34450x24728b, 1137);
            gm0.j1.i();
            gm0.j1.n().f354821b.a(580, new com.p314xaae8f345.mm.p944x882e457a.u0() { // from class: com.tencent.kinda.framework.WxCrossServices.15.1
                @Override // com.p314xaae8f345.mm.p944x882e457a.u0
                /* renamed from: onSceneEnd */
                public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
                    if (m1Var instanceof ss4.d) {
                        if (i17 == 0 && i18 == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "onScene end NetSceneCheckPayJsapi ok");
                            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11688xa0398fac != null) {
                                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                                m27539xaf65a0fc.mo27566xe4673800("package", com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11688xa0398fac.f135978g.f89623f);
                                m27539xaf65a0fc.mo27566xe4673800("func_name", "offline_request_bindquery");
                                m27539xaf65a0fc.mo27558x91a36ce2("JSEvent", new com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426() { // from class: com.tencent.kinda.framework.WxCrossServices.15.1.1
                                    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
                                    /* renamed from: kindaCloseWebViewImpl */
                                    public void mo24859x14baf22e(boolean z17, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
                                    }

                                    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
                                    /* renamed from: kindaEndWithResult */
                                    public void mo24860x91578571(java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
                                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5653x583ecdca c5653x583ecdca2 = com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11688xa0398fac;
                                        if (c5653x583ecdca2 != null) {
                                            c5653x583ecdca2.f135979h.f89729a = str2;
                                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k8) c5653x583ecdca2.f135978g.f89629l).run();
                                            com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11688xa0398fac = null;
                                        }
                                    }

                                    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
                                    /* renamed from: kindaGetType */
                                    public com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e mo24861xe667f7a3() {
                                        return com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.TINYAPP;
                                    }
                                });
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.mo24783x40cf7c9f(m27539xaf65a0fc);
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "onScene end NetSceneCheckPayJsapi fail");
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5653x583ecdca c5653x583ecdca2 = com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11688xa0398fac;
                            if (c5653x583ecdca2 != null) {
                                c5653x583ecdca2.f135979h.f89729a = "fail:NetSceneCheckPayJsapi";
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k8) c5653x583ecdca2.f135978g.f89629l).run();
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11688xa0398fac = null;
                            }
                        }
                        gm0.j1.i();
                        gm0.j1.n().f354821b.q(580, this);
                    }
                }
            });
            gm0.j1.i();
            gm0.j1.n().f354821b.g(dVar);
            return false;
        }
    }

    /* renamed from: com.tencent.kinda.framework.WxCrossServices$MaybeCrashReport */
    /* loaded from: classes9.dex */
    public static class MaybeCrashReport {
        /* renamed from: judgeReport */
        public void m24863x731dc32b() {
            long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTER_PAY_TIME_LONG_SYNC, 0L)).longValue();
            if (longValue > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20560, java.lang.Integer.valueOf(((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTER_PAY_SCENE_INT_SYNC, 0)).intValue()), java.lang.Long.valueOf(longValue));
            }
            m24865x6761d4f();
        }

        /* renamed from: markEnterPay */
        public void m24864xf8eef09d(int i17) {
            ((vc.z) i95.n0.c(vc.z.class)).m134976x2690a4ac();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTER_PAY_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTER_PAY_SCENE_INT_SYNC, java.lang.Integer.valueOf(i17));
        }

        /* renamed from: reset */
        public void m24865x6761d4f() {
            ((vc.z) i95.n0.c(vc.z.class)).m134976x2690a4ac();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTER_PAY_TIME_LONG_SYNC, 0L);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ENTER_PAY_SCENE_INT_SYNC, 0);
        }
    }

    static {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27317xeffb1758();
    }

    public C3096x7fe29b3d() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f11684x7cd0f1f5 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5160x33ad8273>(a0Var) { // from class: com.tencent.kinda.framework.WxCrossServices.12
            {
                this.f39173x3fe91575 = 2123042947;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public boolean mo1xf5bc2045(final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5160x33ad8273 c5160x33ad8273) {
                if (c5160x33ad8273 == null || c5160x33ad8273.f135510g == null) {
                    return false;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.WxCrossServices.12.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!c5160x33ad8273.f135510g.f89217a) {
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27476x74edf2b6();
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.f11682xc84c5534.m24865x6761d4f();
                        } else {
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11691xfa846132 = java.lang.System.currentTimeMillis();
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27477x3a9e06cb();
                        }
                    }
                });
                return false;
            }
        };
        this.f11696xde57e571 = new com.p314xaae8f345.mm.p971x6de15a2e.r0() { // from class: com.tencent.kinda.framework.WxCrossServices.13
            @Override // com.p314xaae8f345.mm.p971x6de15a2e.s0
            /* renamed from: onNetworkChange */
            public void mo8869xde9f63df(int i17) {
                com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11695x34f77829 && com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27488x249a671a()) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context)) {
                        m27539xaf65a0fc.mo27566xe4673800("type", "NON_NETWORK");
                    } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
                        m27539xaf65a0fc.mo27566xe4673800("type", "WIFI");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.i0 i0Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a;
                        java.lang.String j17 = i0Var.j(false);
                        java.lang.String f17 = i0Var.f(false);
                        if (j17 != null && f17 != null) {
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f, j17);
                            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52907xc5e80d49, f17);
                            r45.r1 a17 = at4.g0.a(hashMap);
                            m27539xaf65a0fc.mo27566xe4673800("info", a17.f465947n);
                            m27539xaf65a0fc.mo27566xe4673800("info_key", a17.f465948o);
                        }
                    } else {
                        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
                            m27539xaf65a0fc.mo27566xe4673800("type", "4G");
                        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context)) {
                            m27539xaf65a0fc.mo27566xe4673800("type", "3G");
                        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(context)) {
                            m27539xaf65a0fc.mo27566xe4673800("type", "2G");
                        } else {
                            m27539xaf65a0fc.mo27566xe4673800("type", "UNKNOW");
                        }
                        java.util.List<com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.CellInfo> m40060xc32c8064 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40060xc32c8064(context);
                        if (m40060xc32c8064.size() > 0) {
                            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.CellInfo cellInfo = m40060xc32c8064.get(0);
                            java.lang.String str = cellInfo.f19305xaeb1c5fd;
                            java.lang.String str2 = cellInfo.mcc;
                            java.lang.String str3 = cellInfo.mnc;
                            if (str != null && str2 != null && str3 != null) {
                                java.util.HashMap hashMap2 = new java.util.HashMap();
                                hashMap2.put("cellid", str);
                                hashMap2.put("mcc", str2);
                                hashMap2.put("mnc", str3);
                                r45.r1 a18 = at4.g0.a(hashMap2);
                                m27539xaf65a0fc.mo27566xe4673800("info", a18.f465947n);
                                m27539xaf65a0fc.mo27566xe4673800("info_key", a18.f465948o);
                            }
                        }
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27490xab907f7e(m27539xaf65a0fc);
                }
            }
        };
        this.f11699xcf260d98 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f>(a0Var) { // from class: com.tencent.kinda.framework.WxCrossServices.14
            {
                this.f39173x3fe91575 = 1842411039;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f c6244x161a780f) {
                if (c6244x161a780f.f136493g.f88925a != 5) {
                    return false;
                }
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                m27539xaf65a0fc.mo27556xf2e34299("check_wallet_lock_cancel", true);
                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.mo24783x40cf7c9f(m27539xaf65a0fc);
                return false;
            }
        };
        this.f11688xa0398fac = null;
        this.f11689xca20b662 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.AnonymousClass15(a0Var);
    }

    /* renamed from: checkSnsPayLiteAppMinVersion */
    private boolean m24732x167f5cc1() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_kinda_sns_pay_min_liteapp_version_android, "", true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "checkSnsPayLiteAppMinVersion version is empty, return false");
            return false;
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 Bj = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3192xff8cc88a.WX_PAY_CASHIER_LITE_APP_ID);
        if (Bj == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Bj.f14375x14f51cd8)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "checkSnsPayLiteAppMinVersion liteAppInfo is null or version is empty, return false");
            return false;
        }
        java.lang.String str = Bj.f14375x14f51cd8;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "checkSnsPayLiteAppMinVersion currentVersion: " + str + ", baseVersion: " + Zi);
        try {
            java.lang.String[] split = Zi.split("\\.");
            java.lang.String[] split2 = str.split("\\.");
            int max = java.lang.Math.max(split.length, split2.length);
            int i17 = 0;
            while (i17 < max) {
                int parseInt = i17 < split.length ? java.lang.Integer.parseInt(split[i17].trim()) : 0;
                int parseInt2 = i17 < split2.length ? java.lang.Integer.parseInt(split2[i17].trim()) : 0;
                if (parseInt2 > parseInt) {
                    return true;
                }
                if (parseInt2 < parseInt) {
                    return false;
                }
                i17++;
            }
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: fillOpeimId */
    private void m24733xfd081300(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(f11681x6f8426f3) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(f11681x6f8426f3)) {
            abstractC3411xcfaed72e.mo27566xe4673800("ww_user_name", f11681x6f8426f3);
        } else if (c01.e2.R(f11681x6f8426f3)) {
            abstractC3411xcfaed72e.mo27566xe4673800("imunion_chat_room_name", f11681x6f8426f3);
        }
    }

    /* renamed from: getPrepayIdFromPackage */
    private java.lang.String m24734x682746c6(java.lang.String str) {
        int indexOf;
        if (str == null || str.isEmpty() || (indexOf = str.indexOf("prepay_id=")) == -1) {
            return null;
        }
        java.lang.String substring = str.substring(indexOf + 10);
        if (substring.isEmpty()) {
            return null;
        }
        int indexOf2 = substring.indexOf("&");
        return indexOf2 == -1 ? substring : substring.substring(0, indexOf2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleWalletLockKindaCallBack */
    public void m24735x7fed3526(int i17, android.content.Intent intent, h45.i iVar) {
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("retCode", i17);
        if (intent != null) {
            intent2.putExtra("page_intent", intent);
        }
        if (iVar != null) {
            iVar.mo24858x44dbb8f3(intent2);
        }
    }

    /* renamed from: initIfNeed */
    private void m24736xfd897883() {
        m24753x8090dc3a();
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "IFingerPrintMgr is not null");
            aVar.af();
        }
        if (!this.f11695x34f77829) {
            this.f11684x7cd0f1f5.mo48813x58998cd();
            gm0.j1.n().a(this.f11696xde57e571);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25547x21169495().m25553x3e5a77bb();
            this.f11695x34f77829 = true;
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.m27175x789a515b();
    }

    /* renamed from: isCloseAllLiteAppUseCase */
    private boolean m24737xf1b9d1f7() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_close_all_android, false);
    }

    /* renamed from: isEnableLiteAppSnsPayByPayScene */
    private boolean m24738x5619bd11(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        boolean z17 = false;
        if (!"snsPay".equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppSnsPayByPayScene url is not snsPaym, return false");
            return false;
        }
        int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("payScene");
        if (mo27544xb58848b9 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "payScene is 0, return false");
            return false;
        }
        if (mo27544xb58848b9 == 37) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_hongbao_android, false);
        } else if (mo27544xb58848b9 == 78) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_newyear_hongbao_android, false);
        } else if (mo27544xb58848b9 == 31) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_transfer_android, false);
        } else if (mo27544xb58848b9 == 56) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_transfer2phone_android, false);
        } else if (mo27544xb58848b9 == 49) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_transfer2bank_android, false);
        } else if (mo27544xb58848b9 == 42) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_aa_android, false);
        } else if (mo27544xb58848b9 == 32 || mo27544xb58848b9 == 33) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_f2f_transfer_android, false);
        } else if (mo27544xb58848b9 == 48) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_qrcode_reward_android, false);
        } else if (mo27544xb58848b9 == 65) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_personal_payment_android, false);
        } else if (mo27544xb58848b9 == 43) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_f2f_hongbao_android, false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppSnsPayByPayScene, payScene: " + mo27544xb58848b9 + ", result: " + z17);
        return z17;
    }

    /* renamed from: isEnableLiteAppSnsPayUseCase */
    private boolean m24739x57298641(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        if (!"snsPay".equals(str)) {
            return false;
        }
        if (!m24732x167f5cc1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppSnsPayUseCase, checkMinVersion not passed");
            return false;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_close_snspay_android, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppSnsPayUseCase, clicfg_kinda_lite_usecases_close_snspay_android is true, return false");
            return false;
        }
        if (abstractC3411xcfaed72e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppSnsPayUseCase, data is null, return false");
            return false;
        }
        if (m24738x5619bd11(str, abstractC3411xcfaed72e)) {
            return true;
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_kinda_lite_usecases_snspay_scene_list_android, "", true);
        if (Zi == null || Zi.trim().isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppSnsPayUseCase, snsPaySceneListStr is empty, return false");
            return false;
        }
        java.util.List<java.lang.String> asList = java.util.Arrays.asList(Zi.split(","));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : asList) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                java.lang.String trim = str2.trim();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
                    try {
                        arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(trim)));
                    } catch (java.lang.NumberFormatException unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "isEnableLiteAppSnsPayUseCase, invalid scene: " + trim);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppSnsPayUseCase, sceneList is empty, return false");
            return false;
        }
        int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("payScene");
        boolean contains = arrayList.contains(java.lang.Integer.valueOf(mo27544xb58848b9));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppSnsPayUseCase, payScene: " + mo27544xb58848b9 + ", sceneList: " + arrayList + ", result: " + contains);
        return contains;
    }

    /* renamed from: isEnableLiteAppUseCase */
    private boolean m24740x6a93e3f1(java.lang.String str) {
        if ("jsapiPay".equals(str)) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_jsapipay_android, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppUseCase jsapiPay result: " + fj6);
            return fj6;
        }
        if ("appPay".equals(str)) {
            boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_apppay_android, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppUseCase appPay result: " + fj7);
            return fj7;
        }
        if ("scanQRCodePay".equals(str)) {
            boolean fj8 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_scan_qrcode_pay_android, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppUseCase scanQRCodePay result: " + fj8);
            return fj8;
        }
        if ("h5Pay".equals(str)) {
            boolean fj9 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_h5pay_android, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppUseCase h5Pay result: " + fj9);
            return fj9;
        }
        if ("snsPay".equals(str) && m24732x167f5cc1()) {
            boolean fj10 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_snspay_android, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppUseCase snsPay result: " + fj10);
            return fj10;
        }
        if ("offlinePay".equals(str)) {
            boolean fj11 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_offlinepay_android, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppUseCase offlinePay result: " + fj11);
            return fj11;
        }
        if ("balanceRechargeUseCase".equals(str)) {
            boolean fj12 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_balance_recharge_pay_android, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppUseCase balanceRechargeUseCase result: " + fj12);
            return fj12;
        }
        if ("inWxAppPay".equals(str) && m24732x167f5cc1()) {
            boolean fj13 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_c2b_transfer_android, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppUseCase InWxAppPayUseCase result: " + fj13);
            return fj13;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isEnableLiteAppUseCase url: " + str + ", not matched any lite app use case");
        return false;
    }

    /* renamed from: isPrepayIdIndicatesLiteApp */
    private boolean m24741xb8067ee3(java.lang.String str) {
        if (str != null && str.length() >= 2) {
            if (!str.startsWith("wx") && !str.startsWith("up")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "prepay_id does not start with wx or up, not enable lite app use case");
                return false;
            }
            if (java.lang.Character.getNumericValue(str.charAt(str.length() - 2)) == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "prepay_id indicates liteapp, enable lite app use case");
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "prepay_id indicates non-liteapp, not enable lite app use case");
        }
        return false;
    }

    /* renamed from: isQrCodeUrlIndicatesLiteApp */
    private boolean m24742xf4bec350(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            if (!(str.startsWith("weixin://wxpay/bizpayurl") || str.startsWith("weixin://wxpay/bizpayurl/up") || str.startsWith("weixin://wxpay/pcpayurl/up"))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "qrCodeUrl does not have valid prefix, not enable lite app use case");
                return false;
            }
            try {
                java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("pr");
                if (queryParameter != null && queryParameter.length() > 18) {
                    if (java.lang.Character.getNumericValue(queryParameter.charAt(queryParameter.length() - 1)) == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "qrCodeUrl pr parameter indicates liteapp, enable lite app use case");
                        return true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "qrCodeUrl pr parameter indicates non-liteapp, not enable lite app use case");
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "qrCodeUrl pr parameter not found or length <= 18, not enable lite app use case");
                return false;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "Error parsing qrCodeUrl: " + e17.getMessage());
            }
        }
        return false;
    }

    /* renamed from: judgeReprot */
    public static void m24743x731dce11() {
        f11682xc84c5534.m24863x731dc32b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleHKHongbaoRouteInfoFromUriSpan$2 */
    public static /* synthetic */ void m24744x6db772ab(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startKindaWalletLockVerify$0 */
    public static /* synthetic */ void m24745x994592d1(h45.i iVar, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "touch lock verify retcode is %s", java.lang.Integer.valueOf(intent.getIntExtra("retCode", -1)));
        if (iVar != null) {
            iVar.mo24858x44dbb8f3(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startKindaWalletLockVerify$1 */
    public static /* synthetic */ void m24746x994592d2(h45.i iVar, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "pattern lock verify retcode is %s", java.lang.Integer.valueOf(intent.getIntExtra("retCode", -1)));
        if (iVar != null) {
            iVar.mo24858x44dbb8f3(intent);
        }
    }

    /* renamed from: prepareInWxAppPayUseCase */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m24747x28910903(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1004L, 19L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startInWxAppPayUseCase %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        m24748xfaebb45a();
        f11682xc84c5534.m24864xf8eef09d(bundle.getInt("payScene"));
        java.lang.String string = bundle.getString("prepayId", "");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("prepay_id", string);
        m27539xaf65a0fc.mo27566xe4673800("bank_type", bundle.getString("bankType", ""));
        m27539xaf65a0fc.mo27566xe4673800("bind_serial", bundle.getString("bindSerial", ""));
        m27539xaf65a0fc.mo27557xc5c55e60("payScene", bundle.getInt("payScene"));
        m27539xaf65a0fc.mo27557xc5c55e60("payChannel", bundle.getInt("payChannel"));
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m27539xaf65a0fc.mo27566xe4673800("qrcode_url", bundle.getString("qrCodeUrl", ""));
        m27539xaf65a0fc.mo27557xc5c55e60("qrcode_session_type", bundle.getInt("qrCodeSessionType"));
        m27539xaf65a0fc.mo27566xe4673800("qrcode_session_name", bundle.getString("qrCodeSessionName", ""));
        m27539xaf65a0fc.mo27566xe4673800("qrcode_timeline_objid", bundle.getString("qrCodeTimelineObjId", ""));
        m27539xaf65a0fc.mo27556xf2e34299("enableDuplicate", bundle.getInt("enableDuplicate") == 1);
        m27539xaf65a0fc.mo27557xc5c55e60("chat_type", bundle.getInt("chatType"));
        m27539xaf65a0fc.mo27557xc5c55e60("send_type", bundle.getInt("sendType"));
        m27539xaf65a0fc.mo27566xe4673800("qrcodeSenderName", bundle.getString("qrcodeSenderName"));
        m27539xaf65a0fc.mo27566xe4673800("qrcodeSenderMsgId", bundle.getString("qrcodeSenderMsgId"));
        java.lang.String string2 = bundle.getString("payInitRawUrl");
        long j17 = bundle.getLong("payInitTimestamp", 0L);
        if (j17 == 0) {
            j17 = c01.id.a() / 1000;
        }
        java.lang.String string3 = bundle.getString("qrCodeUrl", "");
        m27539xaf65a0fc.mo27566xe4673800("initRawUrl", string2 == null ? "" : string2);
        m27539xaf65a0fc.mo27564xf2e7ce2b("initTimestamp", j17);
        m27539xaf65a0fc.mo27566xe4673800("latestUrl", string3 != null ? string3 : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "prepareInWxAppPayUseCase initRawUrl: %s, latestUrl: %s, initTimestamp: %d", string2, string3, java.lang.Long.valueOf(j17));
        java.lang.String string4 = bundle.getString("customSucTip");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
            m27539xaf65a0fc.mo27566xe4673800("succ_tip", string4);
        }
        return m27539xaf65a0fc;
    }

    /* renamed from: preparePayDesk */
    private void m24748xfaebb45a() {
        at4.g0.e(5);
    }

    /* renamed from: processBindCardBundle */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m24749x669a201e(android.os.Bundle bundle) {
        boolean z17 = bundle.getInt("key_bind_scene", -1) == 1;
        int i17 = bundle.getInt("reg_flag", -1);
        if (i17 == -1) {
            i17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67049xff817ee4;
        }
        boolean z18 = bundle.getInt("key_bind_scene") == 8;
        int i18 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().t() ? 2 : 1;
        java.lang.String q17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().q();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27556xf2e34299("bPresent", z17);
        m27539xaf65a0fc.mo27557xc5c55e60("regFlag", i17);
        m27539xaf65a0fc.mo27557xc5c55e60("cardUserFlag", i18);
        m27539xaf65a0fc.mo27566xe4673800("trueName", q17);
        m27539xaf65a0fc.mo27557xc5c55e60("addPayCardScene", bundle.getInt("key_bind_scene", -1));
        m27539xaf65a0fc.mo27557xc5c55e60("bindScene", bundle.getInt("key_bind_scene", -1));
        m27539xaf65a0fc.mo27557xc5c55e60("realnameScene", bundle.getInt("entry_scene", -1));
        m27539xaf65a0fc.mo27556xf2e34299("isWebankLoadScene", z18);
        m27539xaf65a0fc.mo27566xe4673800("password", bundle.getString("key_pwd1"));
        if (!bundle.getString("kreq_token", "").isEmpty()) {
            m27539xaf65a0fc.mo27566xe4673800("token", bundle.getString("kreq_token"));
        }
        if (!bundle.getString("usertoken", "").isEmpty()) {
            m27539xaf65a0fc.mo27566xe4673800("usertoken", bundle.getString("usertoken"));
        }
        m27539xaf65a0fc.mo27556xf2e34299("canChangeRealname", bundle.getBoolean("key_bind_show_change_card", false));
        m27539xaf65a0fc.mo27556xf2e34299("canPassPwd", bundle.getBoolean("key_bind_card_can_pass_pwd", false));
        m27539xaf65a0fc.mo27566xe4673800("usertoken", bundle.getString("key_bind_card_user_token", ""));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19087x5acf574b c19087x5acf574b = bundle.containsKey("realname_verify_process_bundle") ? (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19087x5acf574b) bundle.getParcelable("realname_verify_process_bundle") : null;
        if (c19087x5acf574b != null) {
            m27539xaf65a0fc.mo27556xf2e34299("isNewRealname", true);
            m27539xaf65a0fc.mo27566xe4673800("rn_realname_scene", bundle.getString("key_realname_scene", ""));
            m27539xaf65a0fc.mo27566xe4673800("rn_true_name", c19087x5acf574b.f260956d);
            m27539xaf65a0fc.mo27566xe4673800("rn_cre_type", "" + c19087x5acf574b.f260959g);
            m27539xaf65a0fc.mo27566xe4673800("rn_cre_name", c19087x5acf574b.f260960h);
            m27539xaf65a0fc.mo27566xe4673800("rn_identify_card_origin", c19087x5acf574b.f260957e);
            m27539xaf65a0fc.mo27566xe4673800("rn_encry_identity_card", c19087x5acf574b.f260958f);
            m27539xaf65a0fc.mo27557xc5c55e60("rn_creid_renewal_origin", c19087x5acf574b.f260966q);
            m27539xaf65a0fc.mo27557xc5c55e60("rn_cre_expire_date_origin_year", c19087x5acf574b.f260968s);
            m27539xaf65a0fc.mo27557xc5c55e60("rn_cre_expire_date_origin_month", c19087x5acf574b.f260969t);
            m27539xaf65a0fc.mo27557xc5c55e60("rn_cre_expire_date_origin_day", c19087x5acf574b.f260970u);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19087x5acf574b.f260967r)) {
                m27539xaf65a0fc.mo27566xe4673800("rn_cre_expire_date_encrypt", new com.p3249xcbb51f6b.ndk.C28013x36bca45().m121799xea62cd8a(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(c19087x5acf574b.f260968s), java.lang.Integer.valueOf(c19087x5acf574b.f260969t), java.lang.Integer.valueOf(c19087x5acf574b.f260970u))));
            }
            m27539xaf65a0fc.mo27557xc5c55e60("rn_cre_effect_date_origin_year", c19087x5acf574b.E);
            m27539xaf65a0fc.mo27557xc5c55e60("rn_cre_effect_date_origin_month", c19087x5acf574b.F);
            m27539xaf65a0fc.mo27557xc5c55e60("rn_cre_effect_date_origin_day", c19087x5acf574b.G);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19087x5acf574b.D)) {
                m27539xaf65a0fc.mo27566xe4673800("rn_cre_effect_date_encrypt", new com.p3249xcbb51f6b.ndk.C28013x36bca45().m121799xea62cd8a(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(c19087x5acf574b.E), java.lang.Integer.valueOf(c19087x5acf574b.F), java.lang.Integer.valueOf(c19087x5acf574b.G))));
            }
            m27539xaf65a0fc.mo27557xc5c55e60("rn_birth_date_origin_year", c19087x5acf574b.f260972w);
            m27539xaf65a0fc.mo27557xc5c55e60("rn_birth_date_origin_month", c19087x5acf574b.f260973x);
            m27539xaf65a0fc.mo27557xc5c55e60("rn_birth_date_origin_day", c19087x5acf574b.f260974y);
            m27539xaf65a0fc.mo27566xe4673800("rn_country", c19087x5acf574b.f260962m);
            m27539xaf65a0fc.mo27566xe4673800("rn_province", c19087x5acf574b.f260963n);
            m27539xaf65a0fc.mo27566xe4673800("rn_city", c19087x5acf574b.f260964o);
            m27539xaf65a0fc.mo27566xe4673800("rn_areaStr", c19087x5acf574b.f260965p);
            m27539xaf65a0fc.mo27566xe4673800("rn_profession_type", "" + c19087x5acf574b.f260961i.f260955e);
            m27539xaf65a0fc.mo27566xe4673800("rn_profession_name", c19087x5acf574b.f260961i.f260954d);
            m27539xaf65a0fc.mo27566xe4673800("rn_iso_country_code", c19087x5acf574b.f260975z);
            m27539xaf65a0fc.mo27557xc5c55e60("rn_sex", c19087x5acf574b.I);
            m27539xaf65a0fc.mo27566xe4673800("rn_detail_address", c19087x5acf574b.C);
            boolean z19 = bundle.getBoolean("realname_verify_process_need_face", false);
            m27539xaf65a0fc.mo27556xf2e34299("rn_is_need_face", z19);
            if (z19) {
                m27539xaf65a0fc.mo27557xc5c55e60("rn_scene", (int) bundle.getLong("realname_verify_process_face_scene"));
                m27539xaf65a0fc.mo27566xe4673800("rn_package", bundle.getString("realname_verify_process_face_package"));
                m27539xaf65a0fc.mo27566xe4673800("rn_package_sign", bundle.getString("realname_verify_process_face_package_sign"));
            }
            m27539xaf65a0fc.mo27566xe4673800("rn_session_id", bundle.getString("key_realname_sessionid", ""));
        }
        m27539xaf65a0fc.mo27557xc5c55e60("bindCardScene", bundle.getInt("key_bind_scene"));
        m27539xaf65a0fc.mo27566xe4673800("bindCardUuid", com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295449c);
        m27539xaf65a0fc.mo27566xe4673800("deviceName", wo.w0.m());
        m27539xaf65a0fc.mo27566xe4673800("deviceType", "");
        m27539xaf65a0fc.mo27556xf2e34299("BindCardV2", true);
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m27539xaf65a0fc.mo27556xf2e34299("marketingSwitchClosed", bundle.getBoolean("key_marketing_switch_closed", false));
        m27539xaf65a0fc.mo27556xf2e34299("realname_is_minor_bindcard", bundle.getBoolean("realname_is_minor_bindcard", false));
        m27539xaf65a0fc.mo27556xf2e34299("should_block_usecase_stop_when_add_card_success", bundle.getBoolean("should_block_usecase_stop_when_add_card_success", false));
        m27539xaf65a0fc.mo27566xe4673800("notifyType", bundle.getString("notifyType"));
        m27539xaf65a0fc.mo27556xf2e34299("stopUseCase", bundle.getBoolean("stopUseCase"));
        return m27539xaf65a0fc;
    }

    /* renamed from: shouldStartLiteAppUseCase */
    private boolean m24750x7d90ff93(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        boolean z17 = false;
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        if (intValue != 0 && intValue != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "shouldStartLiteAppUseCase, walletRegion %s is not CN, return false", java.lang.Integer.valueOf(intValue));
            return false;
        }
        if (m24737xf1b9d1f7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isCloseAllLiteAppUseCase, not enable lite app use case");
            return false;
        }
        if (this.f11690xf5c1967d.m25629x29d6efdd()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "closeByMinVersionCheck, not enable lite app use case");
            return false;
        }
        if (abstractC3411xcfaed72e != null) {
            java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("prepay_id");
            if (mo27551x2fec8307.startsWith("sns")) {
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_third_hongbao_android, false);
                boolean m24732x167f5cc1 = m24732x167f5cc1();
                if (fj6 && m24732x167f5cc1) {
                    z17 = true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "prepareId hit sns logic! result is %s", java.lang.Boolean.valueOf(z17));
                return z17;
            }
            if (m24741xb8067ee3(mo27551x2fec8307)) {
                return true;
            }
            java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307("package");
            if ((mo27551x2fec83072 != null && m24741xb8067ee3(m24734x682746c6(mo27551x2fec83072))) || m24742xf4bec350(abstractC3411xcfaed72e.mo27551x2fec8307("qrCodeUrl"))) {
                return true;
            }
        }
        if (this.f11690xf5c1967d.m25626x893edba7(str) || m24740x6a93e3f1(str) || m24739x57298641(str, abstractC3411xcfaed72e)) {
            return true;
        }
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_kinda_lite_usecases_android", "");
        java.lang.String aj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_kinda_lite_usecases_internal_android", "");
        java.util.List asList = java.util.Arrays.asList(aj6.split(","));
        java.util.List asList2 = java.util.Arrays.asList(aj7.split(","));
        java.util.ArrayList arrayList = new java.util.ArrayList(asList);
        arrayList.addAll(asList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "mergedKindaLiteUseCases: %s", arrayList);
        if (!arrayList.contains(str)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "shouldStartLiteAppUseCase, url: %s, return true", str);
        return true;
    }

    /* renamed from: startLqtDetailUseCase */
    private boolean m24751x3f85cf9(final android.content.Context context, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start LqtDetailUseCase");
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        m24752xef221a95("lqt", abstractC3411xcfaed72e, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.24

            /* renamed from: _hellAccFlag_ */
            private byte f11741x7f11beae;

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e2) {
                java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e2.mo27551x2fec8307("dataSource");
                java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e2.mo27551x2fec8307("cmdWord");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec8307) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec83072)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "datasource or cmdword is null!");
                    return;
                }
                if (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "context is not instance of mmactivity");
                }
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
                if (mo27551x2fec8307.equals("lqt")) {
                    if (mo27551x2fec83072.equals("startAutoChargeSetting")) {
                        android.content.Intent intent = new android.content.Intent(abstractActivityC21394xb3d2c0cf, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4.class);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/kinda/framework/WxCrossServices$24", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/kinda/framework/WxCrossServices$24", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    if (mo27551x2fec83072.equals("startPlainIndex")) {
                        android.content.Intent intent2 = new android.content.Intent(abstractActivityC21394xb3d2c0cf, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19015x36b35eb1.class);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList2.toArray(), "com/tencent/kinda/framework/WxCrossServices$24", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/kinda/framework/WxCrossServices$24", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    if (mo27551x2fec83072.equals("jumpStaticVideo")) {
                        java.lang.String mo27551x2fec83073 = abstractC3411xcfaed72e2.mo27551x2fec8307("video_url");
                        android.content.Intent intent3 = new android.content.Intent(abstractActivityC21394xb3d2c0cf, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19007xc161a489.class);
                        intent3.putExtra("videoUrl", mo27551x2fec83073);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent3);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList3.toArray(), "com/tencent/kinda/framework/WxCrossServices$24", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/kinda/framework/WxCrossServices$24", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    if (mo27551x2fec83072.equals("jumpVideoFeed")) {
                        java.lang.String mo27551x2fec83074 = abstractC3411xcfaed72e2.mo27551x2fec8307("feed_id");
                        java.lang.String mo27551x2fec83075 = abstractC3411xcfaed72e2.mo27551x2fec8307("nonce_id");
                        android.content.Intent intent4 = new android.content.Intent();
                        intent4.putExtra("feed_object_id", pm0.v.Z(mo27551x2fec83074));
                        intent4.putExtra("feed_object_nonceId", mo27551x2fec83075);
                        intent4.putExtra("key_comment_scene", 1);
                        intent4.putExtra("tab_type", 1001);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        ya2.e1.f542005a.A(abstractActivityC21394xb3d2c0cf, intent4, false);
                    }
                }
            }
        });
        return true;
    }

    /* renamed from: tryLoadLibrary */
    public static void m24753x8090dc3a() {
        if (((h45.q) i95.n0.c(h45.q.class)).mo24775x5d907d7e()) {
            fp.d0.o("wechatxlog");
            fp.d0.o("kinda_android");
        }
    }

    @Override // h45.q
    /* renamed from: TenPaySDKABTestKindaEnable */
    public boolean mo24754xf742bfee() {
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        return true;
    }

    @Override // h45.q
    /* renamed from: canOpenKindaCashier */
    public boolean mo24755x47b8ea10(android.content.Context context) {
        m24736xfd897883();
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27485x68b5757a() || this.f11690xf5c1967d.m25631xecdb3804()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("canOpenKindaCashier", "is paying");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("canOpenKindaCashier", "not paying");
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27497xaa9182f5("rootUseCase");
        this.f11690xf5c1967d.m25635x6f73e2f4();
        return true;
    }

    @Override // h45.q
    /* renamed from: checkIfNeedRequestUserBindqueryWhenUnBindCard */
    public void mo24756xcebbfc8c(java.lang.String str) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27482xcebbfc8c(str);
    }

    @Override // h45.q
    /* renamed from: checkIfNeedUpdateOfflinePayToken */
    public void mo24757x68e57170() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27483x68e57170();
    }

    @Override // h45.q
    /* renamed from: ensureLibraryLoaded */
    public void mo24758xc71a7102() {
        m24753x8090dc3a();
    }

    @Override // h45.q
    /* renamed from: getAccountLoginSuccessTime */
    public long mo24759x4aecb65e() {
        return this.f11683x7aec4e94;
    }

    @Override // h45.q
    /* renamed from: getAppColdStartTime */
    public long mo24760x3928d6a0() {
        return com.p314xaae8f345.mm.app.x.f135439a;
    }

    @Override // h45.q
    /* renamed from: getColorByMode */
    public long mo24761xf794c2a7(long j17, long j18) {
        com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284 = new com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284();
        c3392x2ae78284.f13482x98ef8c0f = j17;
        c3392x2ae78284.f13481x5f08b15d = j18;
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27191xf794c2a7(c3392x2ae78284, false);
    }

    @Override // h45.q
    /* renamed from: getCrossActivity */
    public android.app.Activity mo24762xef326bb9() {
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
    }

    @Override // h45.q
    /* renamed from: getDeeplinkUrlInMemory */
    public java.lang.String mo24763xa804d319() {
        return this.f11685x8660c4a9;
    }

    @Override // h45.q
    /* renamed from: getFirstPreloadTime */
    public long mo24764xd641b71c() {
        return this.f11686x2e694fa6;
    }

    @Override // h45.q
    /* renamed from: getKindaLiteUseCaseSessionId */
    public java.lang.String mo24765x3b648fbf() {
        try {
            return this.f11690xf5c1967d.m25625x681bb8d8();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getKindaLiteUseCaseSessionId error: %s", th6.getMessage());
            return null;
        }
    }

    @Override // h45.q
    /* renamed from: getLastEnterForegroundTime */
    public long mo24766xca84c8fc() {
        return this.f11691xfa846132;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r3 == null) goto L9;
     */
    @Override // h45.q
    /* renamed from: getOverseaFunctionUrlWithToken */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String mo24767xd9be2a81(java.lang.String r14) {
        /*
            r13 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r13.f11698x25df9069
            java.lang.String r1 = ""
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L18
            r3.<init>(r14)     // Catch: java.lang.Throwable -> L18
            java.net.URI r3 = r3.toURI()     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L15
            java.lang.String r3 = r3.getHost()     // Catch: java.lang.Throwable -> L18
            goto L16
        L15:
            r3 = r2
        L16:
            if (r3 != 0) goto L19
        L18:
            r3 = r1
        L19:
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L25
            boolean r6 = r0.containsKey(r3)
            if (r6 != r4) goto L25
            r6 = r4
            goto L26
        L25:
            r6 = r5
        L26:
            if (r6 == 0) goto L34
            if (r0 == 0) goto L31
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 != 0) goto L35
        L34:
            r0 = r1
        L35:
            int r3 = r0.length()
            if (r3 != 0) goto L3c
            goto L3d
        L3c:
            r4 = r5
        L3d:
            if (r4 == 0) goto L41
            goto Lc8
        L41:
            java.lang.String r3 = "_stk"
            java.lang.String r4 = "New URL: "
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> Lc7
            r5.<init>(r14)     // Catch: java.lang.Throwable -> Lc7
            java.net.URI r5 = r5.toURI()     // Catch: java.lang.Throwable -> Lc7
            if (r5 != 0) goto L54
            if (r14 != 0) goto Lc8
            goto Lc7
        L54:
            java.lang.String r14 = r5.getQuery()     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r6.<init>()     // Catch: java.lang.Throwable -> Lc7
            if (r14 == 0) goto L67
            r6.append(r14)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r14 = "&"
            r6.append(r14)     // Catch: java.lang.Throwable -> Lc7
        L67:
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Lc7
            if (r14 == 0) goto L70
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> Lc7
            goto L71
        L70:
            r14 = r2
        L71:
            java.lang.String r14 = java.net.URLEncoder.encode(r3, r14)     // Catch: java.lang.Throwable -> Lc7
            r6.append(r14)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r14 = "="
            r6.append(r14)     // Catch: java.lang.Throwable -> Lc7
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Lc7
            if (r14 == 0) goto L86
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> Lc7
            goto L87
        L86:
            r14 = r2
        L87:
            java.lang.String r14 = java.net.URLEncoder.encode(r0, r14)     // Catch: java.lang.Throwable -> Lc7
            r6.append(r14)     // Catch: java.lang.Throwable -> Lc7
            java.net.URI r14 = new java.net.URI     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r8 = r5.getScheme()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r9 = r5.getAuthority()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r10 = r5.getPath()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r11 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r12 = r5.getFragment()     // Catch: java.lang.Throwable -> Lc7
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lc7
            java.net.URL r14 = r14.toURL()     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lc7
            r0.append(r14)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc7
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Throwable -> Lc7
            r3.println(r0)     // Catch: java.lang.Throwable -> Lc7
            if (r14 == 0) goto Lc3
            java.lang.String r2 = r14.toString()     // Catch: java.lang.Throwable -> Lc7
        Lc3:
            if (r2 != 0) goto Lc6
            goto Lc7
        Lc6:
            r1 = r2
        Lc7:
            r14 = r1
        Lc8:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.mo24767xd9be2a81(java.lang.String):java.lang.String");
    }

    @Override // h45.q
    /* renamed from: handleHKHongbaoRouteInfoFromUriSpan */
    public boolean mo24768x94c527ba(java.lang.String str) {
        byte[] m24719x79db2ec3 = com.p314xaae8f345.p347x615374d.p349x208df1fe.C3091xa23ac64d.f11664x4fbc8495.m24719x79db2ec3(str);
        if (m24719x79db2ec3 == null) {
            return false;
        }
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27555xc6c7e3f0("route_info", m24719x79db2ec3);
        m24752xef221a95("commonRoute", m27539xaf65a0fc, (com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c) new com.p314xaae8f345.p347x615374d.p349x208df1fe.C3097x236fcb84());
        return true;
    }

    @Override // h45.q
    /* renamed from: handleHKNativeCashier */
    public void mo24769x9a395b41(android.content.Context context, android.os.Bundle bundle, final h45.k kVar) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        java.lang.String string = bundle.getString("attach");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            m27539xaf65a0fc.mo27566xe4673800("attach", string);
        }
        java.lang.String string2 = bundle.getString("ff_attach");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            m27539xaf65a0fc.mo27566xe4673800("ff_attach", string2);
        }
        java.lang.String string3 = bundle.getString("req_key");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
            m27539xaf65a0fc.mo27566xe4673800("req_key", string3);
        }
        m27539xaf65a0fc.mo27557xc5c55e60("cashierType", bundle.getInt("cashierType", 0));
        m24752xef221a95("hkcashier", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.43
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("retcode");
                h45.k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.a(mo27544xb58848b9);
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: handleHKOfflineNewXmlMsg */
    public void mo24770xe430ce52(java.lang.String str) {
        int P;
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null);
        if (d17 != null && (P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1)) == 51) {
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.HKOfflineMsgType"), 0);
            java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.paymsg.HKOfflineMsgInfo");
            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.paymsg.HKOfflineMsgExtInfo");
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            m27539xaf65a0fc.mo27557xc5c55e60("PayMsgType", P);
            m27539xaf65a0fc.mo27557xc5c55e60("hk_msg_type", P2);
            m27539xaf65a0fc.mo27566xe4673800("hk_msg_info", str2);
            m27539xaf65a0fc.mo27566xe4673800("hk_msg_extInfo", str3);
            m27539xaf65a0fc.mo27566xe4673800("func_name", "hkoffline_push_newxml");
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27492xc71a7f6e(m27539xaf65a0fc);
        }
    }

    @Override // h45.q
    /* renamed from: handleHKWalletScanCodeRoute */
    public void mo24771x42240bbb(java.lang.String str, int i17, final h45.i iVar) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            m27539xaf65a0fc.mo27566xe4673800("scan_url", str);
        }
        int i18 = 1;
        if (i17 == 1) {
            i18 = 3;
        } else if (i17 != 0) {
            i18 = 2;
        }
        m27539xaf65a0fc.mo27557xc5c55e60("scan_scene", i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "WPHK handle url route, url: %s, scene : %d", str, java.lang.Integer.valueOf(i18));
        m24752xef221a95("hkScanCodeRouteUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.56
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("scan_continue");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "WPHK hkScanCodeRouteUseCase call back, scan_contiune is : %s", java.lang.Integer.valueOf(mo27544xb58848b9));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("scan_continue", mo27544xb58848b9);
                h45.i iVar2 = iVar;
                if (iVar2 != null) {
                    iVar2.mo24858x44dbb8f3(intent);
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: isDeviceSupportNFC */
    public boolean mo24772x3494ab9c() {
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_SUPPORT_NFC_TYPE_INT_SYNC, 0);
        if (!this.f11687x4b1432a8) {
            this.f11687x4b1432a8 = true;
            com.p314xaae8f345.p347x615374d.p349x208df1fe.C3091xa23ac64d.f11664x4fbc8495.m24720x6a35f2b4();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isDeviceSupportNFC, isSupport: %s", java.lang.Integer.valueOf(r17));
        return r17 == 1;
    }

    @Override // h45.q
    /* renamed from: isKindaActivity */
    public boolean mo24774x8fe94872(android.app.Activity activity) {
        return activity != null && (activity instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2);
    }

    @Override // h45.q
    /* renamed from: isKindaEnabled */
    public boolean mo24775x5d907d7e() {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("kinda");
        return true;
    }

    @Override // h45.q
    /* renamed from: isKindaLitePaying */
    public boolean mo24776x1e9bb12b() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3194xff8cea9d c3194xff8cea9d = this.f11690xf5c1967d;
        if (c3194xff8cea9d != null) {
            return c3194xff8cea9d.m25630x9d5c780();
        }
        return false;
    }

    @Override // h45.q
    /* renamed from: isOfflineReady */
    public boolean mo24777x653c03ca() {
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27484xee74fea8();
    }

    @Override // h45.q
    /* renamed from: isSwitch2InWxAppPay */
    public boolean mo24778x3c5fbb61(java.lang.String str) {
        if (str != null) {
            return !str.startsWith("ts_");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "isSwitch2InWxAppPay prepayId is null");
        return false;
    }

    @Override // h45.q
    /* renamed from: isUseCaseAlive */
    public boolean mo24779x384d4000(java.lang.String str) {
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27489x384d4000(str);
    }

    @Override // h45.q
    /* renamed from: markFirstPreloadTimeIfNeeded */
    public void mo24780x95138e5() {
        if (this.f11686x2e694fa6 == 0) {
            this.f11686x2e694fa6 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "markFirstPreloadTimeIfNeeded: " + this.f11686x2e694fa6);
        }
    }

    @Override // h45.q
    /* renamed from: notifyAddPaycardUsecase */
    public void mo24781x29b0a117(android.os.Bundle bundle, java.lang.String str, h45.i iVar) {
        m24787x2fb4713c("addPayCard", m24749x669a201e(bundle), str, iVar);
    }

    @Override // h45.q
    /* renamed from: notifyAllLiteAppForPay */
    public void mo24782x854b4da(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        map.put("businessEventName", str);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject(map);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.k("", "pay.notifyAll", jSONObject);
    }

    @Override // h45.q
    /* renamed from: notifyAllUseCase */
    public void mo24783x40cf7c9f(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start common notifyAllUseCase");
        if (obj instanceof com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e) {
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e = (com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start common notifyAllUseCase: %s", abstractC3411xcfaed72e.mo27567xcc31ba03());
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27491xd92017b4(abstractC3411xcfaed72e);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3223xe2f48814.INSTANCE.m25845x9cf0d20b().m25844x40cf7c9f(obj);
        }
    }

    @Override // h45.q
    /* renamed from: notifyKindaOnManualAuthOk */
    public void mo24784xd8bbbb2d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "notifyKindaOnManualAuthOk");
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27493xfdb38012();
    }

    @Override // h45.q
    /* renamed from: notifyRealnameCancel */
    public void mo24785x199d1cac() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "notifyRealnameCancel");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("func_name", "realnameCancel");
        mo24783x40cf7c9f(m27539xaf65a0fc);
    }

    @Override // h45.q
    /* renamed from: notifyRealnameEnd */
    public void mo24786xf79697e9() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "notifyRealnameEnd");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("func_name", "realnameEnd");
        mo24783x40cf7c9f(m27539xaf65a0fc);
    }

    /* renamed from: notifySpecificUseCase */
    public void m24787x2fb4713c(final java.lang.String str, java.lang.Object obj, java.lang.String str2, final h45.i iVar) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = java.lang.Boolean.valueOf(iVar == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "notify specific usecase, url: %s, callbackkey: %s, whether callback is null: %s", objArr);
        if (obj instanceof com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e) {
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e = (com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e) obj;
            if (iVar != null) {
                abstractC3411xcfaed72e.mo27565xf01dc307(str2, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.32
                    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
                    /* renamed from: call */
                    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e2) {
                        android.content.Intent intent = new android.content.Intent();
                        java.util.Iterator<java.lang.String> it = abstractC3411xcfaed72e2.mo27540xc99d6335().iterator();
                        while (it.hasNext()) {
                            java.lang.String next = it.next();
                            intent.putExtra(next, abstractC3411xcfaed72e2.mo27551x2fec8307(next));
                        }
                        if (java.util.Objects.equals(str, "addPayCard")) {
                            intent.putExtra("retcode", abstractC3411xcfaed72e2.mo27544xb58848b9("retcode"));
                            intent.putExtra("passport_page_style", abstractC3411xcfaed72e2.mo27544xb58848b9("passport_page_style"));
                        }
                        iVar.mo24858x44dbb8f3(intent);
                    }
                });
            }
            com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137 mo27486x4b4e2002 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27486x4b4e2002(str);
            if (mo27486x4b4e2002 != null) {
                mo27486x4b4e2002.mo25794xc2079749(abstractC3411xcfaed72e);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "usecase is null, do not notify");
            }
        }
    }

    @Override // h45.q
    /* renamed from: notifyUploadCardSuccess */
    public void mo24788x8ddb4dc9() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("upload_id_success_notifycation", "1");
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        mo24783x40cf7c9f(m27539xaf65a0fc);
    }

    @Override // h45.q
    /* renamed from: notifyWalletPageRefresh */
    public void mo24789xcfbaeb4a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "notifyAllUseCase");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("notifyType", "walletusecaserefresh");
        mo24783x40cf7c9f(m27539xaf65a0fc);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        this.f11683x7aec4e94 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onAccountInitialized, accountLoginSuccessTime=" + this.f11683x7aec4e94);
        this.f11690xf5c1967d.m25632xed046e09(context);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        this.f11698x25df9069 = null;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3243x21e8d215.INSTANCE.m25909x331156a4();
    }

    @Override // wo3.s
    /* renamed from: onNotify */
    public boolean mo24790x50fc6e08(wo3.v vVar) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27557xc5c55e60("PayMsgType", vVar.f529749a);
        m27539xaf65a0fc.mo27566xe4673800("ack_key", vVar.f529751c);
        m27539xaf65a0fc.mo27566xe4673800("req_key", vVar.f529750b);
        m27539xaf65a0fc.mo27566xe4673800("func_name", "offline_push_xml");
        int i17 = vVar.f529749a;
        if (i17 == 20) {
            wo3.b0 b0Var = (wo3.b0) vVar;
            m27539xaf65a0fc.mo27557xc5c55e60("guide_block", b0Var.f529676d.f529673f ? 1 : 0);
            wo3.a0 a0Var = b0Var.f529676d;
            m27539xaf65a0fc.mo27557xc5c55e60("guide_flag", java.lang.Integer.parseInt(a0Var.f529668a));
            m27539xaf65a0fc.mo27566xe4673800("guide_wording", a0Var.f529669b);
            m27539xaf65a0fc.mo27566xe4673800("left_button_wording", a0Var.f529670c);
            m27539xaf65a0fc.mo27566xe4673800("right_button_wording", a0Var.f529671d);
            m27539xaf65a0fc.mo27566xe4673800("upload_credit_url", a0Var.f529672e);
            mo24783x40cf7c9f(m27539xaf65a0fc);
        } else if (i17 == 5) {
            wo3.x xVar = (wo3.x) vVar;
            m27539xaf65a0fc.mo27557xc5c55e60("pay_cmd", xVar.f529758i);
            m27539xaf65a0fc.mo27557xc5c55e60("cftretcode", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(xVar.f529753d, 0));
            m27539xaf65a0fc.mo27557xc5c55e60("wxretcode", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(xVar.f529755f, 0));
            m27539xaf65a0fc.mo27566xe4673800("cftretmsg", xVar.f529754e);
            m27539xaf65a0fc.mo27566xe4673800("wxretmsg", xVar.f529756g);
            m27539xaf65a0fc.mo27566xe4673800("error_detail_url", xVar.f529757h);
            m27539xaf65a0fc.mo27566xe4673800("error_icon_url", xVar.f529759j);
            m27539xaf65a0fc.mo27564xf2e7ce2b("error_icon_lcolor", xVar.f529760k);
            m27539xaf65a0fc.mo27564xf2e7ce2b("error_icon_dcolor", xVar.f529761l);
            m27539xaf65a0fc.mo27566xe4673800("dialog_viewid", xVar.f529762m);
            m27539xaf65a0fc.mo27566xe4673800("right_btn_title", xVar.f529763n);
            m27539xaf65a0fc.mo27566xe4673800("tinyapp_username", xVar.f529764o);
            m27539xaf65a0fc.mo27566xe4673800("tinyapp_path", xVar.f529765p);
            mo24783x40cf7c9f(m27539xaf65a0fc);
        } else if (i17 == 6) {
            mo24783x40cf7c9f(m27539xaf65a0fc);
        } else if (i17 == 8) {
            mo24783x40cf7c9f(m27539xaf65a0fc);
        } else if (i17 == 4) {
            mo24783x40cf7c9f(m27539xaf65a0fc);
        } else if (i17 == 23) {
            mo24783x40cf7c9f(m27539xaf65a0fc);
        } else if (i17 == 24) {
            mo24783x40cf7c9f(m27539xaf65a0fc);
        } else if (i17 == 42) {
            m27539xaf65a0fc.mo27566xe4673800("PayMsgInfo", ((wo3.u) vVar).f529748d);
            mo24783x40cf7c9f(m27539xaf65a0fc);
        }
        return false;
    }

    @Override // h45.q
    /* renamed from: parseHKHongbaoRouteInfoData */
    public byte[] mo24791x3ecda1c7(java.lang.String str, java.lang.String str2) {
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.C3091xa23ac64d.f11664x4fbc8495.m24716x5abcaa2a(str, str2);
    }

    @Override // h45.q
    /* renamed from: preloadKindalite */
    public void mo24792x132fe572() {
        this.f11690xf5c1967d.m25633x59053cbd(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // h45.q
    /* renamed from: registerLiteAppModuleEventForPay */
    public int mo24793x32c55bbd(java.lang.String str, h45.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "registerLiteAppModuleEventForPay, businessEventName: %s", str);
        return id.d.f371977c.a().b(str, mVar);
    }

    @Override // h45.q
    /* renamed from: requestHKCashierFromLite */
    public void mo24794xd0977929(org.json.JSONObject jSONObject, final h45.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "requestHKCashierFromLite");
        m24752xef221a95("hkcashier", com.p314xaae8f345.p347x615374d.p349x208df1fe.C3091xa23ac64d.f11664x4fbc8495.m24718xc83661bb(jSONObject), new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.44
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("retcode");
                int mo27544xb58848b92 = abstractC3411xcfaed72e.mo27544xb58848b9("action");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "requestHKCashierFromLite callback, retcode=" + mo27544xb58848b9 + ", action=" + mo27544xb58848b92);
                if (jVar != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("retcode", mo27544xb58848b9);
                    intent.putExtra("action", mo27544xb58848b92);
                    hd.b bVar = (hd.b) jVar;
                    bVar.getClass();
                    int intExtra = intent.getIntExtra("retcode", 0);
                    int intExtra2 = intent.getIntExtra("action", 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPLiteHKCashierService", "hkcashier callback, retcode is %s", java.lang.Integer.valueOf(intExtra));
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    if (intExtra == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPLiteHKCashierService", "hkcashier callback, pay fail");
                        jSONObject2.put("result", "requestHKCashier:fail");
                    } else if (intExtra != 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPLiteHKCashierService", "hkcashier callback, pay cancel");
                        jSONObject2.put("result", "requestHKCashier:cancel");
                    } else if (intExtra2 == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPLiteHKCashierService", "hkcashier callback, pay presucc, ignore callback");
                        return;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPLiteHKCashierService", "hkcashier callback, pay succ");
                        jSONObject2.put("result", "requestHKCashier:ok");
                    }
                    hd.a aVar = bVar.f361904a;
                    if (aVar != null) {
                        aVar.mo28755xc397f4dd(jSONObject2);
                    }
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: requestHKCashierNotify */
    public void mo24795xebe1713a(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            m27539xaf65a0fc.mo27566xe4673800("jsapi_package", str);
        }
        m27539xaf65a0fc.mo27566xe4673800("func_name", "requestHKCashier");
        mo24783x40cf7c9f(m27539xaf65a0fc);
    }

    @Override // h45.q
    /* renamed from: saveDeeplinkUrlInMemory */
    public void mo24796x18d70992(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "save deeplinkUrl: %s", str);
        this.f11685x8660c4a9 = str;
    }

    @Override // h45.q
    /* renamed from: setCurrentSeesionUserName */
    public void mo24797x6bdee7(java.lang.String str) {
        f11681x6f8426f3 = str;
    }

    @Override // h45.q
    /* renamed from: setOverseaUrlTokens */
    public void mo24798xfeb18fb0(java.lang.String str, java.lang.String str2) {
        if (this.f11698x25df9069 == null) {
            this.f11698x25df9069 = new java.util.HashMap<>();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str2 == null) {
            return;
        }
        this.f11698x25df9069.put(str, str2);
    }

    @Override // h45.q
    /* renamed from: shouldHandleHKWalletCGPUrl */
    public boolean mo24799x802b81ba(java.lang.String str) {
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.C3091xa23ac64d.f11664x4fbc8495.m24715x36948e2(str);
    }

    @Override // h45.q
    /* renamed from: startBindCardUseCase */
    public void mo24800xa4a1f2e8(android.content.Context context, final android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1004L, 16L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startBindCardUseCase %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        m24752xef221a95("addPayCard", m24749x669a201e(bundle), new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.16
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "startBindCardUseCase callback");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b80 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80();
                int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("retcode");
                am.di diVar = c5663xbbd89b80.f135987g;
                if (mo27544xb58848b9 == 1) {
                    diVar.f87986a = true;
                    diVar.f87988c = abstractC3411xcfaed72e.mo27551x2fec8307("bind_serial");
                    diVar.f87989d = abstractC3411xcfaed72e.mo27551x2fec8307("password");
                    diVar.f87990e = abstractC3411xcfaed72e.mo27551x2fec8307("bank_type");
                    diVar.f87991f = abstractC3411xcfaed72e.mo27551x2fec8307("mobile_no");
                    diVar.f87992g = abstractC3411xcfaed72e.mo27551x2fec8307("realname_title");
                    diVar.f87993h = abstractC3411xcfaed72e.mo27551x2fec8307("realname_desc");
                    diVar.f87994i = abstractC3411xcfaed72e.mo27551x2fec8307("realname_btn_title");
                    diVar.f87995j = abstractC3411xcfaed72e.mo27551x2fec8307("realname_err_jump_page");
                    diVar.f87997l = abstractC3411xcfaed72e.mo27544xb58848b9("passport_page_style");
                    diVar.f87998m = abstractC3411xcfaed72e.mo27551x2fec8307("confirm_btn_title");
                    diVar.f87999n = abstractC3411xcfaed72e.mo27551x2fec8307("confirm_btn_url");
                    diVar.f88000o = abstractC3411xcfaed72e.mo27551x2fec8307("cancel_btn_title");
                    diVar.f88001p = abstractC3411xcfaed72e.mo27551x2fec8307("bottom_wording");
                    diVar.f88002q = abstractC3411xcfaed72e.mo27551x2fec8307("bottom_url");
                    diVar.f88003r = abstractC3411xcfaed72e.mo27551x2fec8307("bottom_username");
                } else if (abstractC3411xcfaed72e.mo27544xb58848b9("retcode") == -1) {
                    diVar.f87986a = false;
                }
                diVar.f87987b = bundle.getBoolean("key_need_bind_response", false);
                c5663xbbd89b80.e();
            }
        });
    }

    @Override // h45.q
    /* renamed from: startFaceCheckUseCase */
    public void mo24801xcb599eae(java.lang.String str, android.content.Intent intent, final h45.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startFaceCheckUseCase， url：%s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        str.getClass();
        if (str.equals("faceCheckFrontUseCase")) {
            m27539xaf65a0fc.mo27557xc5c55e60(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, intent.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0));
            m27539xaf65a0fc.mo27566xe4673800("package", intent.getStringExtra("package"));
            m27539xaf65a0fc.mo27566xe4673800("package_sign", intent.getStringExtra("package_sign"));
            m27539xaf65a0fc.mo27566xe4673800("other_verify_title_front", intent.getStringExtra("other_verify_title_front"));
            m24752xef221a95("faceCheckFrontUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.48
                @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
                /* renamed from: call */
                public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, abstractC3411xcfaed72e.mo27544xb58848b9(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4));
                    intent2.putExtra("error_msg", abstractC3411xcfaed72e.mo27551x2fec8307("error_msg"));
                    intent2.putExtra("need_show_protocal", abstractC3411xcfaed72e.mo27544xb58848b9("need_show_protocal"));
                    iVar.mo24858x44dbb8f3(intent2);
                }
            });
            return;
        }
        if (!str.equals("faceCheckResultUseCase")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "unknown type");
            return;
        }
        m27539xaf65a0fc.mo27566xe4673800("error_msg", intent.getStringExtra("error_msg"));
        m27539xaf65a0fc.mo27566xe4673800("error_tips", intent.getStringExtra("error_tips"));
        m27539xaf65a0fc.mo27556xf2e34299("can_retry", intent.getBooleanExtra("can_retry", true));
        m27539xaf65a0fc.mo27566xe4673800("other_verify_title", intent.getStringExtra("other_verify_title"));
        m24752xef221a95("faceCheckResultUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.49
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("error_msg", abstractC3411xcfaed72e.mo27551x2fec8307("error_msg"));
                intent2.putExtra("other_verify_title_state", abstractC3411xcfaed72e.mo27551x2fec8307("other_verify_title_state"));
                iVar.mo24858x44dbb8f3(intent2);
            }
        });
    }

    @Override // h45.q
    /* renamed from: startFastBindUseCase */
    public void mo24802xdd1fdf9c(java.lang.String str, int i17, final java.lang.Runnable runnable) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start startFastBindUseCase");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("qr_code", str);
        m27539xaf65a0fc.mo27557xc5c55e60("channel", i17);
        m27539xaf65a0fc.mo27557xc5c55e60("bind_card_entrance_scene", 2);
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m24752xef221a95("fastbindcard", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.31
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: startGetEncryptHKPasswd */
    public void mo24803x96fa54b2(java.lang.String str, final h45.i iVar) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            m27539xaf65a0fc.mo27566xe4673800("jsapi_package", str);
        }
        m24752xef221a95("hkGetEncryptPwd", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.55
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("result_code");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "retcode is %s", java.lang.Integer.valueOf(mo27544xb58848b9));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("retcode", mo27544xb58848b9);
                if (mo27544xb58848b9 == 1) {
                    java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("encrypt_pwd");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec8307)) {
                        intent.putExtra("encryptPasswd", mo27551x2fec8307);
                    }
                    java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307("signature");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec83072)) {
                        intent.putExtra("signature", mo27551x2fec83072);
                    }
                }
                h45.i iVar2 = iVar;
                if (iVar2 != null) {
                    iVar2.mo24858x44dbb8f3(intent);
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: startHKOfflinePrePay */
    public void mo24804x3b8ef1e3(android.content.Context context, int i17) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27557xc5c55e60("entry_scene", i17);
        m24752xef221a95("hkoffline", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.41
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            }
        });
    }

    @Override // h45.q
    /* renamed from: startHKOfflinePrePayFromJsApi */
    public void mo24805x1fe7d3e4(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27557xc5c55e60("entry_scene", 3);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            m27539xaf65a0fc.mo27566xe4673800("jsapi_package", str);
        }
        m24752xef221a95("hkoffline", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.42
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            }
        });
    }

    @Override // h45.q
    /* renamed from: startInWxAppPayUseCase */
    public void mo24807xf00c9308(final h45.l lVar, android.os.Bundle bundle) {
        m24752xef221a95("inWxAppPay", m24747x28910903(bundle), new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.33
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (lVar != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("result");
                    java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307(ya.b.f77506xba41a63c);
                    java.lang.String mo27551x2fec83073 = abstractC3411xcfaed72e.mo27551x2fec8307("prepay_id");
                    hashMap.put("result", mo27551x2fec8307);
                    hashMap.put("transactionId", mo27551x2fec83072);
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (mo27551x2fec83073 == null) {
                        mo27551x2fec83073 = "";
                    }
                    hashMap.put("prepayId", mo27551x2fec83073);
                    d22.a0 a0Var = (d22.a0) lVar;
                    a0Var.getClass();
                    java.lang.Object obj = hashMap.get("result");
                    boolean z18 = obj instanceof java.lang.String;
                    d22.a aVar = a0Var.f307357d;
                    if (z18) {
                        java.lang.String str = (java.lang.String) obj;
                        if (r26.i0.p(str, "ok", true)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                            g0Var.d(12738, aVar.f307350a, java.lang.Integer.valueOf(aVar.f307353d), java.lang.Integer.valueOf(aVar.f307354e), 1);
                            g0Var.mo68477x336bdfd8(408L, 9L, 1L, false);
                            a0Var.a(true, 0);
                        } else if (r26.i0.p(str, "cancel", true)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                            g0Var2.d(12738, aVar.f307350a, java.lang.Integer.valueOf(aVar.f307353d), java.lang.Integer.valueOf(aVar.f307354e), 3);
                            g0Var2.mo68477x336bdfd8(408L, 3L, 1L, false);
                            a0Var.a(true, 1);
                        } else if (r26.i0.p(str, "fail", true)) {
                            if (!a0Var.f307361h) {
                                a0Var.f307361h = true;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12738, aVar.f307350a, java.lang.Integer.valueOf(aVar.f307353d), java.lang.Integer.valueOf(aVar.f307354e), 2);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(408L, 4L, 1L, false);
                            a0Var.a(false, -1);
                        }
                    } else {
                        if (!a0Var.f307361h) {
                            a0Var.f307361h = true;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12738, aVar.f307350a, java.lang.Integer.valueOf(aVar.f307353d), java.lang.Integer.valueOf(aVar.f307354e), 2);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(408L, 4L, 1L, false);
                    }
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.f11682xc84c5534.m24865x6761d4f();
            }
        });
    }

    @Override // h45.q
    /* renamed from: startJSApiWCPaySecurityCrosscut */
    public void mo24808x12ed9e2f(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("secure_crosscut", "1");
        m27539xaf65a0fc.mo27566xe4673800("appId", (java.lang.String) map.get("appId"));
        m27539xaf65a0fc.mo27566xe4673800("timeStamp", (java.lang.String) map.get("timeStamp"));
        m27539xaf65a0fc.mo27566xe4673800("nonceStr", (java.lang.String) map.get("nonceStr"));
        m27539xaf65a0fc.mo27566xe4673800("package", (java.lang.String) map.get("package"));
        m27539xaf65a0fc.mo27566xe4673800("signType", (java.lang.String) map.get("signType"));
        m27539xaf65a0fc.mo27566xe4673800("paySign", (java.lang.String) map.get("paySign"));
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        mo24783x40cf7c9f(m27539xaf65a0fc);
    }

    @Override // h45.q
    /* renamed from: startJsApiComponentUseCase */
    public void mo24809x8c9a7089(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62, final com.p314xaae8f345.mm.ui.da daVar, final int i17) {
        m24736xfd897883();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        java.util.Map map = c19761xc2874b62.V;
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                m27539xaf65a0fc.mo27566xe4673800((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        m27539xaf65a0fc.mo27558x91a36ce2("JSEvent", new com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426() { // from class: com.tencent.kinda.framework.WxCrossServices.17
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaCloseWebViewImpl */
            public void mo24859x14baf22e(boolean z17, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaEndWithResult */
            public void mo24860x91578571(java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
                if (daVar != null) {
                    int i18 = str.endsWith("ok") ? -1 : str.endsWith("fail") ? 5 : 0;
                    android.content.Intent intent = new android.content.Intent();
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : hashMap.entrySet()) {
                        intent.putExtra(entry2.getKey(), entry2.getValue());
                    }
                    daVar.mo9729x757c998b(i17, i18, intent);
                }
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaGetType */
            public com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e mo24861xe667f7a3() {
                return com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.WEB;
            }
        });
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m24752xef221a95(c19761xc2874b62.W, m27539xaf65a0fc, (com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c) null);
    }

    @Override // h45.q
    /* renamed from: startKindaWalletLockVerify */
    public void mo24810x6f1c7888(android.content.Intent intent, int i17, final h45.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startKindaWalletLockVerify, walletLockType is %s", java.lang.Integer.valueOf(i17));
        if (i17 == 2) {
            ((h45.q) i95.n0.c(h45.q.class)).mo24834x6e6d756f(intent, false, new h45.i() { // from class: com.tencent.kinda.framework.WxCrossServices$$b
                @Override // h45.i
                /* renamed from: onKindaBusinessCallback */
                public final void mo24858x44dbb8f3(android.content.Intent intent2) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.m24745x994592d1(h45.i.this, intent2);
                }
            });
        } else if (i17 == 1) {
            ((h45.q) i95.n0.c(h45.q.class)).mo24824x2e7223fe(intent, false, new h45.i() { // from class: com.tencent.kinda.framework.WxCrossServices$$c
                @Override // h45.i
                /* renamed from: onKindaBusinessCallback */
                public final void mo24858x44dbb8f3(android.content.Intent intent2) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.m24746x994592d2(h45.i.this, intent2);
                }
            });
        }
    }

    @Override // h45.q
    /* renamed from: startListen */
    public void mo24811x84386cc9(java.lang.String str, h45.n nVar) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3243x21e8d215.INSTANCE.m25911x84386cc9(str, nVar);
    }

    @Override // h45.q
    /* renamed from: startLqtDetailUseCaseInMMProcess */
    public boolean mo24812x391b2a71(android.content.Context context) {
        return m24751x3f85cf9(context, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc());
    }

    @Override // h45.q
    /* renamed from: startLqtDetailUseCaseInOtherProcess */
    public boolean mo24813xfe71785d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start LqtDetailUseCase");
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "is main thread");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "is not main thread");
        }
        m24752xef221a95("lqt", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.23

            /* renamed from: _hellAccFlag_ */
            private byte f11739x7f11beae;

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("dataSource");
                java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307("cmdWord");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec8307) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec83072)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "datasource or cmdword is null!");
                    return;
                }
                java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
                if (k17.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "top activity null");
                    return;
                }
                android.app.Activity activity = (android.app.Activity) k17.get();
                if (mo27551x2fec8307.equals("lqt")) {
                    if (mo27551x2fec83072.equals("startAutoChargeSetting")) {
                        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4.class);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(activity, arrayList.toArray(), "com/tencent/kinda/framework/WxCrossServices$23", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(activity, "com/tencent/kinda/framework/WxCrossServices$23", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    if (mo27551x2fec83072.equals("startPlainIndex")) {
                        android.content.Intent intent2 = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19015x36b35eb1.class);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/kinda/framework/WxCrossServices$23", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(activity, "com/tencent/kinda/framework/WxCrossServices$23", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    if (mo27551x2fec83072.equals("jumpStaticVideo")) {
                        java.lang.String mo27551x2fec83073 = abstractC3411xcfaed72e.mo27551x2fec8307("video_url");
                        android.content.Intent intent3 = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19007xc161a489.class);
                        intent3.putExtra("videoUrl", mo27551x2fec83073);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent3);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(activity, arrayList3.toArray(), "com/tencent/kinda/framework/WxCrossServices$23", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity.startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(activity, "com/tencent/kinda/framework/WxCrossServices$23", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    if (mo27551x2fec83072.equals("jumpVideoFeed")) {
                        java.lang.String mo27551x2fec83074 = abstractC3411xcfaed72e.mo27551x2fec8307("feed_id");
                        java.lang.String mo27551x2fec83075 = abstractC3411xcfaed72e.mo27551x2fec8307("nonce_id");
                        android.content.Intent intent4 = new android.content.Intent();
                        intent4.putExtra("feed_object_id", pm0.v.Z(mo27551x2fec83074));
                        intent4.putExtra("feed_object_nonceId", mo27551x2fec83075);
                        intent4.putExtra("key_comment_scene", 1);
                        intent4.putExtra("tab_type", 1001);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        ya2.e1.f542005a.A(activity, intent4, false);
                    }
                }
            }
        });
        return true;
    }

    @Override // h45.q
    /* renamed from: startLqtDetailUseCaseWithBalanceInMMProcess */
    public boolean mo24814xf7953c6d(android.content.Context context, long j17) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27564xf2e7ce2b("lqtWalletBalance", j17);
        return m24751x3f85cf9(context, m27539xaf65a0fc);
    }

    @Override // h45.q
    /* renamed from: startLqtFetchUseCase */
    public boolean mo24815xbdb881aa(android.content.Context context, final android.content.Intent intent, final h45.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start LqtSaveFetchUseCase");
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        m24736xfd897883();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27557xc5c55e60("entrance_type", intent.getIntExtra("entrance_type", 0));
        m27539xaf65a0fc.mo27566xe4673800("bind_serial", intent.getStringExtra("card_serial"));
        m27539xaf65a0fc.mo27566xe4673800("amount", intent.getStringExtra("fill_money"));
        m24752xef221a95("LQTRedeemUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.26
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (iVar != null) {
                    java.util.Iterator<java.lang.String> it = abstractC3411xcfaed72e.mo27540xc99d6335().iterator();
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        intent.putExtra(next, abstractC3411xcfaed72e.mo27551x2fec8307(next));
                    }
                    iVar.mo24858x44dbb8f3(intent);
                }
            }
        });
        return true;
    }

    /* renamed from: startLqtFixedDepositEntranceUseCase */
    public void m24816xb44c5fca(final android.content.Context context, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start LqtFixedDepositEntranceUseCase");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m24752xef221a95("LQTFixedDepositEntranceUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.27
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if ((context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b) && abstractC3411xcfaed72e != null && abstractC3411xcfaed72e.mo27544xb58848b9("LQTMainPageShouldRefresh") == 1) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b) context).Y6(0, true);
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: startLqtFixedDepositMakePlanUseCase */
    public void mo24817xf6e2c929(final android.content.Context context, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start LqtFixedDepositMakePlanUseCase");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m27539xaf65a0fc.mo27557xc5c55e60("entry_scene", bundle.getInt("entry_scene"));
        m24752xef221a95("LQTFixedDepositMakePlanUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.28
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if ((context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b) && abstractC3411xcfaed72e != null && abstractC3411xcfaed72e.mo27544xb58848b9("LQTMainPageShouldRefresh") == 1) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b) context).Y6(0, true);
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: startLqtFixedDepositPlanListUseCase */
    public void mo24818x58c4fdf9(final android.content.Context context, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start LqtFixedDepositPlanListUseCase");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m24752xef221a95("LQTFixedDepositPlanListUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.29
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if ((context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b) && abstractC3411xcfaed72e != null && abstractC3411xcfaed72e.mo27544xb58848b9("LQTMainPageShouldRefresh") == 1) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b) context).Y6(0, true);
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: startLqtSaveUseCase */
    public boolean mo24819x8648fb0d(android.content.Context context, final android.content.Intent intent, final h45.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start LqtSaveUseCase");
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        m24736xfd897883();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27557xc5c55e60("entrance_type", intent.getIntExtra("entrance_type", 0));
        m27539xaf65a0fc.mo27566xe4673800("bind_serial", intent.getStringExtra("card_serial"));
        m27539xaf65a0fc.mo27566xe4673800("outer_trans_money", intent.getStringExtra("fill_money"));
        if (intent.getIntExtra("entrance_type", 0) == 14) {
            m27539xaf65a0fc.mo27564xf2e7ce2b("limit_cashier_amount", (long) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(intent.getStringExtra("fill_money"), 0.0d));
        }
        m24752xef221a95("LQTPurchaseUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.25
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (iVar != null) {
                    java.util.Iterator<java.lang.String> it = abstractC3411xcfaed72e.mo27540xc99d6335().iterator();
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        intent.putExtra(next, abstractC3411xcfaed72e.mo27551x2fec8307(next));
                    }
                    iVar.mo24858x44dbb8f3(intent);
                }
            }
        });
        return true;
    }

    @Override // h45.q
    /* renamed from: startModifyPwdUseCase */
    public void mo24820x20e40836(android.content.Context context, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start startModifyPwdUseCase");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, gm0.j1.b().j() + "_" + com.p314xaae8f345.mm.p2802xd031a825.ui.r1.B());
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m24752xef221a95("modifyPwdUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.30
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            }
        });
    }

    @Override // h45.q
    /* renamed from: startOfflinePay */
    public void mo24821xdea349c7(android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1004L, 18L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startOfflinePay %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        m24748xfaebb45a();
        re4.n.k();
        f11682xc84c5534.m24864xf8eef09d(8);
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("req_key", str);
        m27539xaf65a0fc.mo27566xe4673800("prefer_bind_serial", str2);
        m27539xaf65a0fc.mo27557xc5c55e60("payScene", 8);
        m27539xaf65a0fc.mo27557xc5c55e60("payChannel", i17);
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m24752xef221a95("offlinePay", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.10
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                boolean mo27542xfb7da360 = abstractC3411xcfaed72e.mo27542xfb7da360("pay_result");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "startOfflinePay UseCaseCallback pay_result: " + mo27542xfb7da360);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e();
                am.s10 s10Var = c6249x2aa12f2e.f136498g;
                s10Var.f89396c = 0;
                if (mo27542xfb7da360) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                    s10Var.f89396c = -1;
                    s10Var.f89394a = new android.content.Intent();
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("payScene", 8);
                    bundle.putString("pay_bind_serial", abstractC3411xcfaed72e.mo27551x2fec8307("pay_bind_serial"));
                    bundle.putInt("isFromKinda", 1);
                    s10Var.f89394a.putExtras(bundle);
                } else {
                    s10Var.f89396c = 0;
                    s10Var.f89394a = new android.content.Intent();
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putInt("payScene", 8);
                    bundle2.putInt("isFromKinda", 1);
                    s10Var.f89394a.putExtras(bundle2);
                }
                c6249x2aa12f2e.e();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.f11682xc84c5534.m24865x6761d4f();
            }
        });
    }

    @Override // h45.q
    /* renamed from: startOfflinePrePay */
    public void mo24822x9cee3d86(android.content.Context context, int i17, int i18, int i19, java.util.Map<java.lang.String, java.lang.String> map, boolean z17, java.lang.String str, final h45.i iVar) {
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startOfflinePrePay %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        this.f11699xcf260d98.mo48813x58998cd();
        this.f11689xca20b662.mo48813x58998cd();
        wo3.c0 Ri = to3.c0.Ai().Ri();
        if (Ri.f529677a == null) {
            Ri.f529677a = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ri.f529677a).add(new java.lang.ref.WeakReference(this));
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27557xc5c55e60("entry_scene", i17);
        m27539xaf65a0fc.mo27557xc5c55e60("payScene", 8);
        m27539xaf65a0fc.mo27557xc5c55e60("payChannel", i18);
        m27539xaf65a0fc.mo27557xc5c55e60("pay_receipt_scene", i19);
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m27539xaf65a0fc.mo27556xf2e34299("from_pinned_shortcut", z17);
        m27539xaf65a0fc.mo27566xe4673800("mkt_biz_info", str);
        if (map != null) {
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc2 = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            m27539xaf65a0fc2.mo27566xe4673800("card_id", map.get("card_id"));
            m27539xaf65a0fc2.mo27566xe4673800("user_card_id", map.get("user_card_id"));
            m27539xaf65a0fc2.mo27566xe4673800("card_code", map.get("card_code"));
            m27539xaf65a0fc.mo27559xd6c79ba4("member_card", m27539xaf65a0fc2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 105L, 1L, false);
        m24752xef221a95("offline", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.11
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                boolean mo27542xfb7da360 = abstractC3411xcfaed72e.mo27542xfb7da360("Offline.shouldStopUseCase");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "[startOfflinePrePay] CallBack Offline.shouldStopUseCase %s", java.lang.Boolean.valueOf(mo27542xfb7da360));
                if (mo27542xfb7da360) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11699xcf260d98.mo48814x2efc64();
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11689xca20b662.mo48814x2efc64();
                    to3.c0.Ai().Ri().j(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this);
                    if (abstractC3411xcfaed72e.mo27542xfb7da360("dropServiceHome")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "startOfflinePrePay dropServiceHome send OfflineUseCaseFinishEvent");
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5779xd33b1313 c5779xd33b1313 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5779xd33b1313();
                        c5779xd33b1313.f136092g.f88096a = 1;
                        c5779xd33b1313.e();
                    }
                }
                if (iVar != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.f11677xdc08648f, abstractC3411xcfaed72e.mo27542xfb7da360(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.f11677xdc08648f));
                    iVar.mo24858x44dbb8f3(intent);
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: startOverseaWalletSuccPageUseCase */
    public boolean mo24823x64e17034(final android.content.Context context, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2802xd031a825.b a17 = com.p314xaae8f345.mm.p2802xd031a825.b.a();
        a17.getClass();
        if (!a17.d(e42.d0.clicfg_kinda_hk_wallet_succ_page_android, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startOverseaWalletSuccPageUseCase, isKindaOverseaWalletSuccPageEnable is false");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1004L, 20L, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startOverseaWalletSuccPageUseCase, isKindaOverseaWalletSuccPageEnable is true");
        m24736xfd897883();
        m24748xfaebb45a();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("appid", bundle.getString("appid"));
        m27539xaf65a0fc.mo27566xe4673800(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, bundle.getString(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6));
        m27539xaf65a0fc.mo27566xe4673800("nonce_str", bundle.getString("nonce_str"));
        m27539xaf65a0fc.mo27566xe4673800("package", bundle.getString("package"));
        m27539xaf65a0fc.mo27557xc5c55e60("input_pay_scene", bundle.getInt("input_pay_scene"));
        m27539xaf65a0fc.mo27566xe4673800("sign_type", bundle.getString("sign_type"));
        m27539xaf65a0fc.mo27566xe4673800("pay_sign", bundle.getString("pay_sign"));
        m27539xaf65a0fc.mo27566xe4673800("req_key", bundle.getString("req_key"));
        m27539xaf65a0fc.mo27557xc5c55e60("origin_pay_scene", bundle.getInt("origin_pay_scene"));
        m27539xaf65a0fc.mo27566xe4673800("order_id", bundle.getString("order_id"));
        m27539xaf65a0fc.mo27557xc5c55e60("retry_max_count", bundle.getInt("retry_max_count"));
        m27539xaf65a0fc.mo27557xc5c55e60("retry_interval_seconds", bundle.getInt("retry_interval_seconds"));
        m27539xaf65a0fc.mo27566xe4673800("retry_default_wording", bundle.getString("retry_default_wording"));
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m24752xef221a95("overseaWalletSuccPage", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.36
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19115x62a5592d) {
                    java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("result");
                    boolean mo27542xfb7da360 = abstractC3411xcfaed72e.mo27542xfb7da360("is_pending");
                    boolean mo27542xfb7da3602 = abstractC3411xcfaed72e.mo27542xfb7da360("is_jsapi_close_page");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19115x62a5592d activityC19115x62a5592d = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19115x62a5592d) context;
                    activityC19115x62a5592d.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack begin, result=%s is_pending=%b is_jsapi_close_page=%b", mo27551x2fec8307, java.lang.Boolean.valueOf(mo27542xfb7da360), java.lang.Boolean.valueOf(mo27542xfb7da3602));
                    activityC19115x62a5592d.f261539e = mo27542xfb7da360;
                    if (mo27551x2fec8307.equalsIgnoreCase("pre_succ")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack not handle pre_succ");
                    } else if (mo27551x2fec8307.equalsIgnoreCase("after_show_succ_page")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack handle after_show_succ_page, payScene=%d", java.lang.Integer.valueOf(activityC19115x62a5592d.f261548q));
                        if (activityC19115x62a5592d.f261548q == 1) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6273xbf9150fd c6273xbf9150fd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6273xbf9150fd();
                            c6273xbf9150fd.f136522g.f89222a = -1;
                            c6273xbf9150fd.e();
                            activityC19115x62a5592d.setResult(-1);
                            activityC19115x62a5592d.finish();
                        }
                    } else if (mo27551x2fec8307.equalsIgnoreCase("ok")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack handle ok, payScene=%d prepayId=%s", java.lang.Integer.valueOf(activityC19115x62a5592d.f261548q), activityC19115x62a5592d.f261542h);
                        if (activityC19115x62a5592d.f261548q == 2) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6273xbf9150fd c6273xbf9150fd2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6273xbf9150fd();
                            c6273xbf9150fd2.f136522g.f89222a = -1;
                            c6273xbf9150fd2.e();
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19115x62a5592d.f261542h)) {
                                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e();
                                android.content.Intent intent = new android.content.Intent();
                                intent.putExtra("intent_pay_end", true);
                                intent.putExtra("is_jsapi_close_page", mo27542xfb7da3602 ? 1 : 0);
                                am.s10 s10Var = c6249x2aa12f2e.f136498g;
                                s10Var.f89394a = intent;
                                s10Var.f89397d = activityC19115x62a5592d.f261542h;
                                s10Var.f89396c = -1;
                                s10Var.f89399f = 1;
                                c6249x2aa12f2e.e();
                            }
                            activityC19115x62a5592d.setResult(-1);
                            activityC19115x62a5592d.finish();
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack handle else, payScene=%d prepayId=%s", java.lang.Integer.valueOf(activityC19115x62a5592d.f261548q), activityC19115x62a5592d.f261542h);
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6273xbf9150fd c6273xbf9150fd3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6273xbf9150fd();
                        c6273xbf9150fd3.f136522g.f89222a = 0;
                        c6273xbf9150fd3.e();
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e();
                        java.lang.String str = activityC19115x62a5592d.f261542h;
                        am.s10 s10Var2 = c6249x2aa12f2e2.f136498g;
                        s10Var2.f89397d = str;
                        s10Var2.f89396c = 0;
                        c6249x2aa12f2e2.e();
                        activityC19115x62a5592d.setResult(0);
                        activityC19115x62a5592d.finish();
                    }
                    if (abstractC3411xcfaed72e.mo27551x2fec8307("result").equals("ok")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "startOverseaWalletSuccPageUseCase, publish ok WalletPayResultEvent");
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e();
                        am.s10 s10Var3 = c6249x2aa12f2e3.f136498g;
                        s10Var3.f89396c = -1;
                        s10Var3.f89399f = 2;
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("key_is_clear_failure", -1);
                        s10Var3.f89394a = intent2;
                        c6249x2aa12f2e3.e();
                        return;
                    }
                    if (abstractC3411xcfaed72e.mo27551x2fec8307("result").equals("fail")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "startOverseaWalletSuccPageUseCase, publish canceled WalletPayResultEvent");
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e();
                        am.s10 s10Var4 = c6249x2aa12f2e4.f136498g;
                        s10Var4.f89396c = 0;
                        s10Var4.f89399f = 2;
                        android.content.Intent intent3 = new android.content.Intent();
                        intent3.putExtra("key_is_clear_failure", -1);
                        s10Var4.f89394a = intent3;
                        c6249x2aa12f2e4.e();
                    }
                }
            }
        });
        return true;
    }

    @Override // h45.q
    /* renamed from: startPatternLockUseCase */
    public void mo24824x2e7223fe(final android.content.Intent intent, boolean z17, final h45.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startPatternLockUseCase");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27557xc5c55e60("lock_scene", 1);
        if (intent != null) {
            m27539xaf65a0fc.mo27556xf2e34299("need_block_back", intent.getBooleanExtra("need_block_back", false));
        }
        m27539xaf65a0fc.mo27556xf2e34299("need_remove_same", z17);
        m24752xef221a95("patternLockUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.53
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("retCode");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "patternLockUseCase kinda callback, retcode is %s", java.lang.Integer.valueOf(mo27544xb58848b9));
                if (mo27544xb58848b9 == 1) {
                    hu4.i.f366763a = android.os.SystemClock.elapsedRealtime();
                    hu4.i.e();
                    hu4.i.g();
                    hu4.i.f();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.m24735x7fed3526(mo27544xb58848b9, intent, iVar);
            }
        });
    }

    @Override // h45.q
    /* renamed from: startPayIBGJsGetSuccPageUseCase */
    public boolean mo24825x39b1d2e1(final android.content.Context context, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2802xd031a825.b a17 = com.p314xaae8f345.mm.p2802xd031a825.b.a();
        a17.getClass();
        if (!a17.d(e42.d0.clicfg_kinda_hk_wallet_succ_page_android, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startPayIBGJsGetSuccPageUseCase, isKindaOverseaWalletSuccPageEnable is false");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1004L, 21L, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startPayIBGJsGetSuccPageUseCase, isKindaOverseaWalletSuccPageEnable is true");
        m24736xfd897883();
        m24748xfaebb45a();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("appid", bundle.getString("appid"));
        m27539xaf65a0fc.mo27566xe4673800(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, bundle.getString(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6));
        m27539xaf65a0fc.mo27566xe4673800("nonce_str", bundle.getString("nonce_str"));
        m27539xaf65a0fc.mo27566xe4673800("package", bundle.getString("package"));
        m27539xaf65a0fc.mo27566xe4673800("sign_type", bundle.getString("sign_type"));
        m27539xaf65a0fc.mo27566xe4673800("pay_sign", bundle.getString("pay_sign"));
        m27539xaf65a0fc.mo27566xe4673800("webview_url", bundle.getString("webview_url"));
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m24752xef221a95("payIbgGetSuccPage", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.37
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ibg.ActivityC19134xd2cd09db) {
                    java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("result");
                    java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307("subscribe_username");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ibg.ActivityC19134xd2cd09db activityC19134xd2cd09db = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ibg.ActivityC19134xd2cd09db) context;
                    activityC19134xd2cd09db.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIbgOrderInfoUI", "onKindaPayIBGGetSuccPageBack, result: %s", mo27551x2fec8307);
                    if (mo27551x2fec8307.equalsIgnoreCase("fail")) {
                        activityC19134xd2cd09db.setResult(0);
                    } else if (mo27551x2fec8307.equalsIgnoreCase("ok")) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec83072)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIbgOrderInfoUI", "hy: doing netscene subscribe...subscribe_username: %s", mo27551x2fec83072);
                            gm0.j1.i();
                            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a1(mo27551x2fec83072));
                        }
                        activityC19134xd2cd09db.setResult(-1);
                    }
                    activityC19134xd2cd09db.finish();
                }
            }
        });
        return true;
    }

    @Override // h45.q
    /* renamed from: startPaySecurityUseCase */
    public void mo24826x2446a031(int i17, final h45.i iVar) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27557xc5c55e60("entryScene", i17);
        int i18 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67042x8a2885a8;
        java.lang.String str = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67041x8a2570f9;
        java.lang.String str2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().f67066xeae73197;
        m27539xaf65a0fc.mo27566xe4673800("payUseInfo:credInfo.credType", java.lang.String.valueOf(i18));
        m27539xaf65a0fc.mo27566xe4673800("payUseInfo:credInfo.credName", str);
        m27539xaf65a0fc.mo27566xe4673800("payUseInfo:usrName", str2);
        m24752xef221a95("paySecurity", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.40
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (iVar != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("finished", abstractC3411xcfaed72e.mo27544xb58848b9("finished"));
                    iVar.mo24858x44dbb8f3(intent);
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: startQrcodeCollectionSettingUseCase */
    public void mo24827x2fbc8dd5(android.content.Intent intent, final h45.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startQrcodeCollectionSettingUseCase");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27557xc5c55e60("key_collect_type", intent.getIntExtra("key_type", 1));
        m27539xaf65a0fc.mo27566xe4673800("key_collect_currency_unit", intent.getStringExtra("key_currency_unit"));
        m27539xaf65a0fc.mo27557xc5c55e60("key_collect_fixed_fee", intent.getIntExtra("ftf_fixed_fee", 0));
        m27539xaf65a0fc.mo27566xe4673800("key_collect_fixed_desc", intent.getStringExtra("ftf_fixed_desc"));
        m27539xaf65a0fc.mo27556xf2e34299("key_collect_fixed_desc_required", intent.getBooleanExtra("ftf_fixed_desc_required", false));
        m27539xaf65a0fc.mo27566xe4673800("key_collect_fixed_desc_placeholder", intent.getStringExtra("ftf_fixed_desc_placeholder"));
        m27539xaf65a0fc.mo27566xe4673800("key_collect_payer_desc_switch_title", intent.getStringExtra("key_payer_desc_switch_title"));
        m27539xaf65a0fc.mo27566xe4673800("key_collect_payer_desc_switch_sub_title", intent.getStringExtra("key_payer_desc_switch_sub_title"));
        m27539xaf65a0fc.mo27566xe4673800("key_collect_payer_desc_fill_title", intent.getStringExtra("key_payer_desc_fill_title"));
        m27539xaf65a0fc.mo27566xe4673800("key_collect_payer_desc_fill_hint", intent.getStringExtra("key_payer_desc_fill_hint"));
        long longExtra = intent.getLongExtra("ftf_fixed_current_shop_id", 0L);
        if (longExtra != 0) {
            m27539xaf65a0fc.mo27564xf2e7ce2b("key_collect_current_shop_id", longExtra);
        }
        m24752xef221a95("qrcodeCollectionSettingsUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.50
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_error_msg", abstractC3411xcfaed72e.mo27551x2fec8307("key_error_msg"));
                intent2.putExtra("ftf_pay_url", abstractC3411xcfaed72e.mo27551x2fec8307("key_collect_pay_url"));
                intent2.putExtra("ftf_fixed_fee", (int) abstractC3411xcfaed72e.mo27548xfb822ef2("key_collect_fee"));
                intent2.putExtra("ftf_fixed_fee_type", abstractC3411xcfaed72e.mo27551x2fec8307("key_collect_fee_type"));
                intent2.putExtra("ftf_fixed_desc", abstractC3411xcfaed72e.mo27551x2fec8307("key_collect_fee_desc"));
                intent2.putExtra("key_error_level", abstractC3411xcfaed72e.mo27544xb58848b9("key_collect_error_level"));
                intent2.putExtra("key_currency_unit", abstractC3411xcfaed72e.mo27551x2fec8307("key_collect_currenct_unit"));
                intent2.putExtra("key_save_notify_info", new java.lang.String(abstractC3411xcfaed72e.mo27541x124d2ef7("key_collect_save_notify_info")));
                intent2.putExtra("ftf_fixed_desc_required", abstractC3411xcfaed72e.mo27542xfb7da360("key_collect_desc_required"));
                intent2.putExtra("ftf_fixed_desc_placeholder", abstractC3411xcfaed72e.mo27551x2fec8307("key_collect_fee_desc_placeholder"));
                iVar.mo24858x44dbb8f3(intent2);
            }
        });
    }

    @Override // h45.q
    /* renamed from: startResetPwdUseCase */
    public void mo24828x975e1547(android.content.Context context, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1004L, 17L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startResetPwdUseCase %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        if (bundle == null) {
            m27539xaf65a0fc.mo27556xf2e34299("bResetPwdFromPayManage", false);
            m27539xaf65a0fc.mo27557xc5c55e60("realnameScene", 0);
            m27539xaf65a0fc.mo27557xc5c55e60("payScene", 0);
        } else {
            m27539xaf65a0fc.mo27556xf2e34299("bResetPwdFromPayManage", bundle.getBoolean("key_is_paymanager", false));
            m27539xaf65a0fc.mo27557xc5c55e60("realnameScene", 0);
            m27539xaf65a0fc.mo27557xc5c55e60("payScene", 0);
        }
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m24752xef221a95("resetPwdUseCase", m27539xaf65a0fc, (com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c) null);
    }

    @Override // h45.q
    /* renamed from: startResetPwdUseCaseFromJsApi */
    public boolean mo24829x14204100(android.content.Intent intent, h45.i iVar) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27556xf2e34299("fromJsapi", true);
        m24752xef221a95("resetPwdUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.54
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            }
        });
        return true;
    }

    @Override // h45.q
    /* renamed from: startSNSPay */
    public void mo24830x8e9ecb12(final android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1004L, 10L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startSNSPay %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        m24748xfaebb45a();
        re4.n.k();
        f11682xc84c5534.m24864xf8eef09d(c19760x34448d56.f273642e);
        if (!((h45.q) i95.n0.c(h45.q.class)).mo24755x47b8ea10(context)) {
            db5.e1.y(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.knf), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.apu), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.WxCrossServices.9
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    android.content.Context context2 = context;
                    if (context2 instanceof android.app.Activity) {
                        ((android.app.Activity) context2).finish();
                    }
                }
            });
            return;
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3266xa5a26a98 m25998xfc2aea19 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3274x4640fc9.m25998xfc2aea19(c19760x34448d56.f273642e);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3267x684dce4d m25997x2cb96961 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3274x4640fc9.m25997x2cb96961(c19760x34448d56.f273642e);
        m25998xfc2aea19.mo25995x76491f2c(context, c19760x34448d56);
        m25997x2cb96961.mo25996x76491f2c(context, c19760x34448d56);
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e mo25994x63ee79de = m25998xfc2aea19.mo25994x63ee79de();
        mo25994x63ee79de.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startSnsPay initRawUrl: %s, latestUrl: %s, initTimestamp: %d", mo25994x63ee79de.mo27551x2fec8307("initRawUrl"), mo25994x63ee79de.mo27551x2fec8307("latestUrl"), java.lang.Long.valueOf(mo25994x63ee79de.mo27548xfb822ef2("initTimestamp")));
        m24752xef221a95("snsPay", mo25994x63ee79de, (com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c) m25997x2cb96961);
    }

    @Override // h45.q
    /* renamed from: startScanQRCodePay */
    public void mo24831x2a828efb(android.content.Context context, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1004L, 13L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startScanQRCodePay %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        m24748xfaebb45a();
        re4.n.k();
        f11682xc84c5534.m24864xf8eef09d(1);
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27557xc5c55e60("m_A8keyScene", bundle.getInt("a8key_scene"));
        m27539xaf65a0fc.mo27566xe4673800("qrCodeUrl", bundle.getString("qrcode_url"));
        m27539xaf65a0fc.mo27557xc5c55e60("payChannel", bundle.getInt("channel"));
        m27539xaf65a0fc.mo27557xc5c55e60("payScene", 1);
        m27539xaf65a0fc.mo27557xc5c55e60("chat_type", bundle.getInt("chat_type"));
        m27539xaf65a0fc.mo27557xc5c55e60("send_type", bundle.getInt("send_type"));
        m27539xaf65a0fc.mo27557xc5c55e60("qrcode_session_type", bundle.getInt("qrcode_session_type"));
        m27539xaf65a0fc.mo27566xe4673800("qrcode_session_name", bundle.getString("qrcode_session_name"));
        m27539xaf65a0fc.mo27566xe4673800("qrcode_timeline_objid", bundle.getString("qrcode_timeline_objid"));
        m27539xaf65a0fc.mo27566xe4673800("qrcodeSenderName", bundle.getString("qrcodeSenderName"));
        m27539xaf65a0fc.mo27566xe4673800("qrcodeSenderMsgId", bundle.getString("qrcodeSenderMsgId"));
        java.lang.String string = bundle.getString("payInitRawUrl");
        long j17 = bundle.getLong("payInitTimestamp", 0L);
        if (j17 == 0) {
            j17 = c01.id.a() / 1000;
        }
        java.lang.String string2 = bundle.getString("qrcode_url", "");
        m27539xaf65a0fc.mo27566xe4673800("initRawUrl", string == null ? "" : string);
        m27539xaf65a0fc.mo27564xf2e7ce2b("initTimestamp", j17);
        m27539xaf65a0fc.mo27566xe4673800("latestUrl", string2 != null ? string2 : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startScanQRCodePay initRawUrl: %s, latestUrl: %s, initTimestamp: %d", string, string2, java.lang.Long.valueOf(j17));
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f11694xbd91f5d7;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f11694xbd91f5d7 = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvq), false, false, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.WxCrossServices.6
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
            }
        });
        m24752xef221a95("scanQRCodePay", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.7
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "startScanQRCodePay call()");
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11694xbd91f5d7 != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11694xbd91f5d7.dismiss();
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.f11694xbd91f5d7 = null;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e();
                int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("scanQRCodeState");
                am.s10 s10Var = c6249x2aa12f2e.f136498g;
                s10Var.f89396c = mo27544xb58848b9;
                s10Var.f89398e = true;
                abstractC3411xcfaed72e.mo27551x2fec8307("failReason");
                s10Var.getClass();
                c6249x2aa12f2e.e();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.f11682xc84c5534.m24865x6761d4f();
            }
        });
    }

    @Override // h45.q
    /* renamed from: startTeenagerPay */
    public void mo24832x725d5279(android.content.Context context, byte[] bArr, final h45.i iVar) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        if (bArr != null && bArr.length > 0) {
            m27539xaf65a0fc.mo27555xc6c7e3f0("respData", bArr);
        }
        m24752xef221a95("teenagerPayUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.46
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("event", abstractC3411xcfaed72e.mo27551x2fec8307("event"));
                iVar.mo24858x44dbb8f3(intent);
            }
        });
    }

    @Override // h45.q
    /* renamed from: startTeenagerPayGetDetail */
    public void mo24833x7028c0ce(android.content.Context context, final h45.o oVar) {
        m24752xef221a95("teenagerPayGetDetailUseCase", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.45
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                final java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("status");
                final byte[] mo27541x124d2ef7 = abstractC3411xcfaed72e.mo27541x124d2ef7("respData");
                com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.C18582x9665f269 c18582x9665f269 = (com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.C18582x9665f269) oVar;
                c18582x9665f269.getClass();
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9.I;
                final com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9 = c18582x9665f269.f254404a;
                activityC18580x3cc47ed9.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed92 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9.this;
                        android.view.View view = activityC18580x3cc47ed92.f254391o;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "lambda$updateWCPayLimit$1", "(Ljava/lang/String;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "lambda$updateWCPayLimit$1", "(Ljava/lang/String;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        activityC18580x3cc47ed92.f254390n.setText(mo27551x2fec8307);
                        activityC18580x3cc47ed92.f254390n.setVisibility(0);
                        activityC18580x3cc47ed92.f254392p = mo27541x124d2ef7;
                    }
                });
            }
        });
    }

    @Override // h45.q
    /* renamed from: startTouchLockUseCase */
    public void mo24834x6e6d756f(final android.content.Intent intent, boolean z17, final h45.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startTouchLockUseCase");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27557xc5c55e60("lock_scene", 1);
        if (intent != null) {
            m27539xaf65a0fc.mo27556xf2e34299("need_block_back", intent.getBooleanExtra("need_block_back", false));
        }
        m27539xaf65a0fc.mo27556xf2e34299("need_remove_same", z17);
        m24752xef221a95("touchLockUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.52
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("retCode");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "touchLockUseCase kinda callback, retcode is %s", java.lang.Integer.valueOf(mo27544xb58848b9));
                if (mo27544xb58848b9 == 1) {
                    java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("auth_fid");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec8307)) {
                        fu4.a.a(mo27551x2fec8307);
                    }
                    if (!abstractC3411xcfaed72e.mo27542xfb7da360("verifyByPwd")) {
                        fu4.a.f348417a = android.os.SystemClock.elapsedRealtime();
                    }
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.m24735x7fed3526(mo27544xb58848b9, intent, iVar);
            }
        });
    }

    @Override // h45.q
    /* renamed from: startUiTest */
    public void mo24835x9385bc48(java.lang.String str) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m27539xaf65a0fc.mo27566xe4673800("url", str);
        m24752xef221a95("uiTest", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.35
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (abstractC3411xcfaed72e.mo27544xb58848b9(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811) == 1) {
                    throw null;
                }
                if ("WalletDemoUI".equals(abstractC3411xcfaed72e.mo27551x2fec8307("url"))) {
                    j45.l.h(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), "repairer", ".ui.RepairerPayDebugUI");
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: startUniPcPay */
    public void mo24836xf42d0927(android.os.Bundle bundle, final h45.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1004L, 22L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[startUniPcPay] %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        m24748xfaebb45a();
        re4.n.k();
        f11682xc84c5534.m24864xf8eef09d(88);
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("qrCodeUrl", bundle.getString("qrcode_url"));
        m27539xaf65a0fc.mo27557xc5c55e60("payChannel", bundle.getInt("pay_channel"));
        m27539xaf65a0fc.mo27557xc5c55e60("payScene", bundle.getInt("pay_scene"));
        m27539xaf65a0fc.mo27557xc5c55e60("qrcode_session_type", bundle.getInt("qrcode_session_type"));
        m27539xaf65a0fc.mo27566xe4673800("qrcode_session_name", bundle.getString("qrcode_session_name"));
        m27539xaf65a0fc.mo27566xe4673800("qrcodeSenderName", bundle.getString("qrcode_sender_name"));
        m27539xaf65a0fc.mo27566xe4673800("qrcode_timeline_objid", bundle.getString("qrcode_timeline_objid"));
        m27539xaf65a0fc.mo27557xc5c55e60("chat_type", bundle.getInt("chat_type"));
        m27539xaf65a0fc.mo27557xc5c55e60("send_type", bundle.getInt("send_type"));
        m27539xaf65a0fc.mo27566xe4673800("qrcodeSenderMsgId", bundle.getString("msg_svr_id"));
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m24752xef221a95("uniPcPay", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.8
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (iVar != null && abstractC3411xcfaed72e != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, abstractC3411xcfaed72e.mo27544xb58848b9(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993));
                    iVar.mo24858x44dbb8f3(intent);
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.f11682xc84c5534.m24865x6761d4f();
            }
        });
    }

    @Override // h45.q
    /* renamed from: startUseCase */
    public void mo24837xef221a95(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start common useCase");
        if ((obj instanceof com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e) && (obj2 instanceof com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c)) {
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e = (com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e) obj;
            abstractC3411xcfaed72e.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
            m24752xef221a95(str, abstractC3411xcfaed72e, (com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c) obj2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startUseCase fail, data or callback is not the right type");
    }

    @Override // h45.q
    /* renamed from: startWalletBalanceEntryUseCase */
    public boolean mo24838x4e268286(final android.content.Context context) {
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(196660, 0)).intValue();
        gm0.j1.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + intValue + "balanceShow:" + ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue());
        boolean z17 = (32768 & intValue) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isShowRealnameGuide, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(intValue));
        if (z17) {
            gm0.j1.i();
            m27539xaf65a0fc.mo27566xe4673800("balance:entry:realnameGuideTitle", (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_RELEAY_NAME_TIP_CONTENT_STRING_SYNC, null));
        }
        m24752xef221a95("balanceEntryUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.21
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("jumpToNativeUrl");
                java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307("fromScene");
                android.app.Activity mo24762xef326bb9 = com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.mo24762xef326bb9();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec8307) || mo24762xef326bb9 == null) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "balance open nativeUrl: %s, fromScene: %s", mo27551x2fec8307, mo27551x2fec83072);
                final com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g1 g1Var = mo27551x2fec83072.equals("recharge") ? com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g1.f259172f : com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g1.f259171e;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("fromScene", g1Var.ordinal());
                bundle.putString("bindSerial", abstractC3411xcfaed72e.mo27551x2fec8307("lqtsave:bindSerial"));
                bundle.putString("amountString", abstractC3411xcfaed72e.mo27551x2fec8307("lqtsave:amountString"));
                final int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l1.f259221a.a(mo24762xef326bb9, mo27551x2fec8307, bundle);
                if (a17 > 0) {
                    if (mo24762xef326bb9 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) {
                        ((com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) mo24762xef326bb9).f149697t.put(java.lang.Integer.valueOf(a17), new ej0.f() { // from class: com.tencent.kinda.framework.WxCrossServices.21.1
                            @Override // ej0.f
                            /* renamed from: handle */
                            public void mo24862xb7026e28(int i17, android.content.Intent intent) {
                                if (a17 != 32770) {
                                    return;
                                }
                                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc2 = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                                if (g1Var == com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g1.f259171e) {
                                    m27539xaf65a0fc2.mo27557xc5c55e60("balance:entry:refresh", 1);
                                } else if (i17 == -1) {
                                    m27539xaf65a0fc2.mo27557xc5c55e60("balance:recharge:chargedLQTInBalance", 1);
                                }
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.mo24783x40cf7c9f(m27539xaf65a0fc2);
                            }
                        });
                    }
                } else if (mo27551x2fec8307.startsWith("wxpay://lqp/balanceQuotaState")) {
                    j45.l.j(context, "wallet_ecard", ".ui.WalletECardLogoutUI", new android.content.Intent(), null);
                }
            }
        });
        return true;
    }

    @Override // h45.q
    /* renamed from: startWalletBalanceFetchPageUseCase */
    public void mo24839x9afc1e2f(android.content.Context context, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startWalletBalanceFetchPageUseCase");
        m24736xfd897883();
        m24752xef221a95("FetchBalancePageUseCase", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.19
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            }
        });
    }

    @Override // h45.q
    /* renamed from: startWalletBalanceFetchUseCase */
    public void mo24840x83d7633e(final android.content.Context context, final android.os.Bundle bundle) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startWalletBalanceFetchUseCase %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        m24748xfaebb45a();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27557xc5c55e60("payScene", bundle.getInt("payScene"));
        m27539xaf65a0fc.mo27566xe4673800("totalFee", bundle.getString("totalFee"));
        m27539xaf65a0fc.mo27566xe4673800("feeType", bundle.getString("feeType"));
        m27539xaf65a0fc.mo27566xe4673800("bankType", bundle.getString("bankType"));
        m27539xaf65a0fc.mo27566xe4673800("bindSerial", bundle.getString("bindSerial"));
        m27539xaf65a0fc.mo27566xe4673800("operation", bundle.getString("operation"));
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m24752xef221a95("fetchBalance", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.18

            /* renamed from: _hellAccFlag_ */
            private byte f11721x7f11beae;

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb) {
                    int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("result");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "startWalletBalanceFetchUseCase result：%s", java.lang.Integer.valueOf(mo27544xb58848b9));
                    if (mo27544xb58848b9 != 1) {
                        if (mo27544xb58848b9 != 2) {
                            if (mo27544xb58848b9 != 3) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "startWalletBalanceFetch unknown result：%s", java.lang.Integer.valueOf(mo27544xb58848b9));
                                return;
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16398, bundle.getString("reportSessionId"), 8, "", "");
                                return;
                            }
                        }
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe.class);
                    intent.addFlags(67108864);
                    android.content.Context context2 = context;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context2, arrayList.toArray(), "com/tencent/kinda/framework/WxCrossServices$18", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context2, "com/tencent/kinda/framework/WxCrossServices$18", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: startWalletBalanceRechargeUIUseCase */
    public void mo24841xd6f21ffb(android.content.Context context) {
        m24752xef221a95("balanceRechargeUseCase", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.22
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("jumpToNativeUrl");
                android.app.Activity mo24762xef326bb9 = com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.mo24762xef326bb9();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec8307) || mo24762xef326bb9 == null) {
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.f1 f1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.g1.f259170d;
                bundle.putInt("fromScene", 1);
                bundle.putString("bindSerial", abstractC3411xcfaed72e.mo27551x2fec8307("lqtsave:bindSerial"));
                bundle.putString("amountString", abstractC3411xcfaed72e.mo27551x2fec8307("lqtsave:amountString"));
                final int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l1.f259221a.a(mo24762xef326bb9, mo27551x2fec8307, bundle);
                if (a17 <= 0 || !(mo24762xef326bb9 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2)) {
                    return;
                }
                ((com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) mo24762xef326bb9).f149697t.put(java.lang.Integer.valueOf(a17), new ej0.f() { // from class: com.tencent.kinda.framework.WxCrossServices.22.1
                    @Override // ej0.f
                    /* renamed from: handle */
                    public void mo24862xb7026e28(int i17, android.content.Intent intent) {
                        if (a17 != 32770) {
                            return;
                        }
                        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                        m27539xaf65a0fc.mo27557xc5c55e60("balance:recharge:chargedLQTInBalance", 1);
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.mo24783x40cf7c9f(m27539xaf65a0fc);
                    }
                });
            }
        });
    }

    @Override // h45.q
    /* renamed from: startWalletBalanceSaveUseCase */
    public void mo24842xcebd96f9(final android.content.Context context, final android.os.Bundle bundle) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startWalletBalanceSaveUseCase %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        m24748xfaebb45a();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27557xc5c55e60("payScene", bundle.getInt("payScene"));
        m27539xaf65a0fc.mo27566xe4673800("totalFee", bundle.getString("totalFee"));
        m27539xaf65a0fc.mo27566xe4673800("feeType", bundle.getString("feeType"));
        m27539xaf65a0fc.mo27566xe4673800("bankType", bundle.getString("bankType"));
        m27539xaf65a0fc.mo27566xe4673800("bindSerial", bundle.getString("bindSerial"));
        m27539xaf65a0fc.mo27566xe4673800("operation", bundle.getString("operation"));
        m24752xef221a95("saveBalance", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.20
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734) {
                    int mo27544xb58848b9 = abstractC3411xcfaed72e.mo27544xb58848b9("result");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "startWalletBalanceSaveUseCase result：%s", java.lang.Integer.valueOf(mo27544xb58848b9));
                    if (mo27544xb58848b9 == 1) {
                        android.content.Context context2 = context;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734) context2).f259379v = false;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734) context2).finish();
                    } else if (mo27544xb58848b9 == 2) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734) context).f259379v = false;
                    } else if (mo27544xb58848b9 != 3) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "startWalletBalanceSave unknown result：%s", java.lang.Integer.valueOf(mo27544xb58848b9));
                    } else {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734) context).f259379v = false;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16398, bundle.getString("reportSessionId"), 8, "", "");
                    }
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: startWalletLockSettingUseCase */
    public void mo24843xf99bd94d(android.content.Context context, android.content.Intent intent, final h45.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startWalletLockSettingUseCase");
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        if (intent.getIntExtra("key_wallet_lock_setting_scene", -1) == 1) {
            m27539xaf65a0fc.mo27556xf2e34299("hide_checkmark", true);
        }
        m24752xef221a95("walletLockSettingUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.51
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "wallet lock setting kinda callback, action_code is %d", java.lang.Integer.valueOf(abstractC3411xcfaed72e.mo27544xb58848b9("action_code")));
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("result", true);
                h45.i iVar2 = iVar;
                if (iVar2 != null) {
                    iVar2.mo24858x44dbb8f3(intent2);
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: startWalletSecuritySetting */
    public void mo24844x9e1fd675(android.content.Context context, android.content.Intent intent) {
        android.app.Activity mo24762xef326bb9 = mo24762xef326bb9();
        if (mo24762xef326bb9 != null) {
            ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().l(mo24762xef326bb9, intent);
        }
    }

    @Override // h45.q
    /* renamed from: startWeBankLoanPay */
    public void mo24845x51356acc(android.content.Context context, java.lang.String str, java.lang.String str2, final h45.p pVar) {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("token", str);
        m27539xaf65a0fc.mo27566xe4673800("jsapi_reqkey", str2);
        m24752xef221a95("webankLoanPayUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.47
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (abstractC3411xcfaed72e.mo27544xb58848b9("pay_success") != 1) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.n) pVar).a(null, null);
                    return;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.n) pVar).a(abstractC3411xcfaed72e.mo27551x2fec8307("result_token"), abstractC3411xcfaed72e.mo27551x2fec8307("bind_serial"));
            }
        });
    }

    @Override // h45.q
    /* renamed from: startWxpayAppPay */
    public void mo24846x2057ce0c(final android.content.Context context, android.os.Bundle bundle, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startWxpayAppPay %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        m24748xfaebb45a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(1004L, 11L, 1L, false);
        re4.n.k();
        f11682xc84c5534.m24864xf8eef09d(2);
        com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6 c11302x8e12daf6 = new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6();
        c11302x8e12daf6.mo48425x63aa4ccc(bundle);
        final com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("appid", c11302x8e12daf6.f33251x58b7f1c);
        m27539xaf65a0fc.mo27566xe4673800("partner_id", c11302x8e12daf6.f33256x94f8d403);
        m27539xaf65a0fc.mo27566xe4673800("prepay_id", c11302x8e12daf6.f33257xb3bbab20);
        m27539xaf65a0fc.mo27566xe4673800("nonce_str", c11302x8e12daf6.f33253x53ec53c2);
        m27539xaf65a0fc.mo27566xe4673800(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, c11302x8e12daf6.f33260x18638f6);
        m27539xaf65a0fc.mo27566xe4673800("package", c11302x8e12daf6.f33255x8f9828cb);
        m27539xaf65a0fc.mo27566xe4673800("sign", c11302x8e12daf6.f33258x35ddbd);
        m27539xaf65a0fc.mo27566xe4673800("sign_type", c11302x8e12daf6.f33259x128eba97);
        m27539xaf65a0fc.mo27566xe4673800(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str);
        m27539xaf65a0fc.mo27566xe4673800("app_package_name", str2);
        m27539xaf65a0fc.mo27566xe4673800("safe_app_package_name", bundle.getString("key_app_packagename_safe"));
        m27539xaf65a0fc.mo27566xe4673800("app_display_name", str3);
        m27539xaf65a0fc.mo27566xe4673800("android_sign", str4);
        m27539xaf65a0fc.mo27566xe4673800("app_token", bundle.getString("key_app_token"));
        m27539xaf65a0fc.mo27557xc5c55e60("app_token_verifyResult", bundle.getInt("key_app_token_verify_result"));
        m27539xaf65a0fc.mo27566xe4673800("app_sdkVersion", "" + bundle.getInt("key_sdk_version", 0));
        m27539xaf65a0fc.mo27566xe4673800("safe_app_sdkVersion", "" + bundle.getInt("key_sdk_version_safe", 0));
        m27539xaf65a0fc.mo27566xe4673800("bundle_id", "");
        m27539xaf65a0fc.mo27557xc5c55e60("payScene", 2);
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        final java.lang.String str5 = bundle.getInt("_wxapi_command_type", 0) == 27 ? "jointPay" : "appPay";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "app url: %s", str5);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).f270103e) {
            m24752xef221a95(str5, m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.2
                @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
                /* renamed from: call */
                public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                    android.content.Context context2 = context;
                    if (context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19167xed6273d0) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19167xed6273d0) context2).finish();
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.f11682xc84c5534.m24865x6761d4f();
                    }
                }
            });
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "soter has not initialized, wait 1s");
        g0Var.A(1104, 48);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.WxCrossServices.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).f270103e;
                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.this.m24752xef221a95(str5, m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.1.1
                    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
                    /* renamed from: call */
                    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                        android.content.Context context2 = context;
                        if (context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19167xed6273d0) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19167xed6273d0) context2).finish();
                        }
                    }
                });
            }
        }, 1000L);
    }

    @Override // h45.q
    /* renamed from: startWxpayH5Pay */
    public void mo24847xcfc610b6(final android.content.Context context, android.os.Bundle bundle, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1004L, 14L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startWxpayH5Pay %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        m24748xfaebb45a();
        re4.n.k();
        f11682xc84c5534.m24864xf8eef09d(36);
        com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6 c11302x8e12daf6 = new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6();
        c11302x8e12daf6.mo48425x63aa4ccc(bundle);
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("appid", c11302x8e12daf6.f33251x58b7f1c);
        m27539xaf65a0fc.mo27566xe4673800("partner_id", c11302x8e12daf6.f33256x94f8d403);
        m27539xaf65a0fc.mo27566xe4673800("prepay_id", c11302x8e12daf6.f33257xb3bbab20);
        m27539xaf65a0fc.mo27566xe4673800("nonce_str", c11302x8e12daf6.f33253x53ec53c2);
        m27539xaf65a0fc.mo27566xe4673800(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, c11302x8e12daf6.f33260x18638f6);
        m27539xaf65a0fc.mo27566xe4673800("package", c11302x8e12daf6.f33255x8f9828cb);
        m27539xaf65a0fc.mo27566xe4673800("sign", c11302x8e12daf6.f33258x35ddbd);
        m27539xaf65a0fc.mo27566xe4673800("sign_type", c11302x8e12daf6.f33259x128eba97);
        m27539xaf65a0fc.mo27566xe4673800(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str);
        m27539xaf65a0fc.mo27566xe4673800("app_package_name", str2);
        m27539xaf65a0fc.mo27566xe4673800("app_display_name", str3);
        m27539xaf65a0fc.mo27566xe4673800("android_sign", str4);
        m27539xaf65a0fc.mo27566xe4673800("android_sign", str4);
        m27539xaf65a0fc.mo27566xe4673800("bundle_id", "");
        m27539xaf65a0fc.mo27557xc5c55e60("payScene", 36);
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m24752xef221a95("h5Pay", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.4
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                android.content.Context context2 = context;
                if (context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19167xed6273d0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19167xed6273d0) context2).finish();
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.f11682xc84c5534.m24865x6761d4f();
                }
            }
        });
    }

    @Override // h45.q
    /* renamed from: startWxpayJsApiPay */
    public void mo24848x60cc00dc(final android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62, com.p314xaae8f345.mm.ui.da daVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1004L, 12L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startWxpayJsApiPay %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        m24748xfaebb45a();
        re4.n.k();
        f11682xc84c5534.m24864xf8eef09d(c19761xc2874b62.f273675t);
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("appid", c19761xc2874b62.f273662d);
        m27539xaf65a0fc.mo27566xe4673800("package", c19761xc2874b62.f273667i);
        m27539xaf65a0fc.mo27566xe4673800("signType", c19761xc2874b62.f273664f);
        m27539xaf65a0fc.mo27566xe4673800("timeStamp", c19761xc2874b62.f273666h);
        m27539xaf65a0fc.mo27566xe4673800("paySign", c19761xc2874b62.f273671p);
        m27539xaf65a0fc.mo27566xe4673800("nonce_str", c19761xc2874b62.f273665g);
        m27539xaf65a0fc.mo27566xe4673800("stepInAppUserName", c19761xc2874b62.f273674s);
        java.lang.String str = c19761xc2874b62.f273673r;
        m27539xaf65a0fc.mo27566xe4673800("stepInURL", str);
        m27539xaf65a0fc.mo27557xc5c55e60("payChannel", c19761xc2874b62.f273677v);
        m27539xaf65a0fc.mo27557xc5c55e60("payScene", c19761xc2874b62.f273675t);
        m27539xaf65a0fc.mo27557xc5c55e60("codeScene", c19761xc2874b62.f273678w);
        m27539xaf65a0fc.mo27557xc5c55e60("weappEnterScene", c19761xc2874b62.f273679x);
        m27539xaf65a0fc.mo27566xe4673800("weappPayCookies", c19761xc2874b62.f273672q);
        m27539xaf65a0fc.mo27566xe4673800("adUxInfo", c19761xc2874b62.H);
        m27539xaf65a0fc.mo27566xe4673800("commonUxInfo", c19761xc2874b62.I);
        m27539xaf65a0fc.mo27557xc5c55e60("sendType", c19761xc2874b62.K);
        m27539xaf65a0fc.mo27557xc5c55e60("chatType", c19761xc2874b62.f273661J);
        m27539xaf65a0fc.mo27557xc5c55e60("qrcodeSessionType", c19761xc2874b62.L);
        m27539xaf65a0fc.mo27566xe4673800("qrcodeSessionName", c19761xc2874b62.M);
        m27539xaf65a0fc.mo27566xe4673800("qrcodeTimelineObjid", c19761xc2874b62.N);
        m27539xaf65a0fc.mo27556xf2e34299("imitationNativeTinyApp", c19761xc2874b62.f273681z == 1);
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m27539xaf65a0fc.mo27566xe4673800("extInfo", c19761xc2874b62.f273680y);
        m27539xaf65a0fc.mo27566xe4673800("qrcodeSenderMsgId", c19761xc2874b62.R);
        m27539xaf65a0fc.mo27566xe4673800("qrcodeSenderName", c19761xc2874b62.Q);
        m27539xaf65a0fc.mo27566xe4673800("initRawUrl", c19761xc2874b62.S);
        m27539xaf65a0fc.mo27564xf2e7ce2b("initTimestamp", c19761xc2874b62.T);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04 c3235x6da79b04 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04();
        c3235x6da79b04.m25880xcf5b49f2(daVar);
        c3235x6da79b04.m25881xb4c0ef5a(i17);
        java.lang.String str2 = c19761xc2874b62.E;
        c3235x6da79b04.m25882x7650bebc(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.WEB : com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.TINYAPP);
        m27539xaf65a0fc.mo27558x91a36ce2("JSEvent", c3235x6da79b04);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            m27539xaf65a0fc.mo27566xe4673800("latestUrl", str);
        } else {
            m27539xaf65a0fc.mo27566xe4673800("latestUrl", str2);
        }
        java.lang.String str3 = c19761xc2874b62.G ? "jointPay" : "jsapiPay";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "jsapi url: %s, initRawUrl is: %s, latestUrl is: %s, timestamp is: %s", str3, m27539xaf65a0fc.mo27551x2fec8307("initRawUrl"), m27539xaf65a0fc.mo27551x2fec8307("latestUrl"), java.lang.Long.valueOf(m27539xaf65a0fc.mo27548xfb822ef2("initTimestamp")));
        m24752xef221a95(str3, m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.3
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (abstractC3411xcfaed72e == null || !(context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02)) {
                    return;
                }
                java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("result");
                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.f11682xc84c5534.m24865x6761d4f();
                if (mo27551x2fec8307 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "JsApiPay UseCaseCallback get result null! ");
                    mo27551x2fec8307 = "";
                }
                int i18 = mo27551x2fec8307.endsWith("ok") ? -1 : mo27551x2fec8307.endsWith("fail") ? 5 : 0;
                java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307("total_fee_str");
                com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02 = (com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02) context;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "JsApiPay UseCaseCallback receive data, result: %s, resultCode:%d, total_fee_str: ", mo27551x2fec8307, java.lang.Integer.valueOf(i18), mo27551x2fec83072);
                if (!lj.f.f(mo27551x2fec83072)) {
                    java.lang.String replaceAll = mo27551x2fec83072.replaceAll("[^0-9\\.]", "");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "JsApiPay UseCaseCallback totalFee after format is: " + replaceAll);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_total_fee", replaceAll);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19168xd4c44a02.f262622n) && activityC19168xd4c44a02.f262622n.equalsIgnoreCase("key_from_scene_appbrandgame")) {
                        activityC19168xd4c44a02.U6(i18, intent);
                    }
                }
                if (!mo27551x2fec8307.equals("pre_ok")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "JsApiPay UseCaseCallback finish WalletBrandUI.");
                    activityC19168xd4c44a02.finish();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.TAG, "JsApiPay UseCaseCallback preSuccess!");
                android.content.Intent intent2 = new android.content.Intent();
                java.lang.String mo27551x2fec83073 = abstractC3411xcfaed72e.mo27551x2fec8307("pay_completed_data");
                intent2.putExtra("key_is_clear_failure", -1);
                if (!lj.f.f(mo27551x2fec83073)) {
                    intent2.putExtra("key_pay_completed_data", mo27551x2fec83073);
                }
                activityC19168xd4c44a02.V6(i18, intent2);
            }
        });
    }

    @Override // h45.q
    /* renamed from: startWxpayQueryCashierPay */
    public void mo24849x2784dc28(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1004L, 15L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "startWxpayQueryCashierPay %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m24736xfd897883();
        m24748xfaebb45a();
        f11682xc84c5534.m24864xf8eef09d(i17);
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("req_key", str);
        m27539xaf65a0fc.mo27557xc5c55e60("payScene", i17);
        m27539xaf65a0fc.mo27557xc5c55e60("payChannel", i18);
        m27539xaf65a0fc.mo27566xe4673800("nativeReportSessionId", com.p314xaae8f345.mm.p2802xd031a825.ui.b0.a());
        m24752xef221a95("queryCashierPay", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.5
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e();
                c6249x2aa12f2e.f136498g.f89396c = abstractC3411xcfaed72e.mo27551x2fec8307("result").equals("ok") ? -1 : 0;
                c6249x2aa12f2e.e();
                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.f11682xc84c5534.m24865x6761d4f();
            }
        });
    }

    @Override // h45.q
    /* renamed from: stopListen */
    public void mo24850xa30a7869(java.lang.String str) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3243x21e8d215.INSTANCE.m25912xa30a7869(str);
    }

    @Override // h45.q
    /* renamed from: tryStartTransferToBankDetailUseCase */
    public boolean mo24851x287b17dd(java.lang.String str, final h45.i iVar) {
        com.p314xaae8f345.mm.p2802xd031a825.b a17 = com.p314xaae8f345.mm.p2802xd031a825.b.a();
        a17.getClass();
        if (!a17.d(e42.d0.clicfg_transfer_to_bank_kinda_switch_android, false)) {
            return false;
        }
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            m27539xaf65a0fc.mo27566xe4673800("transferBillId", str);
            m27539xaf65a0fc.mo27556xf2e34299("isFromJsApi", true);
        }
        m24752xef221a95("transferToBankShowDetailUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.39
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (iVar != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("finished", abstractC3411xcfaed72e.mo27544xb58848b9("finished"));
                    iVar.mo24858x44dbb8f3(intent);
                }
            }
        });
        return true;
    }

    @Override // h45.q
    /* renamed from: tryStartTransferToBankUseCase */
    public boolean mo24852xdf2d02ae(java.lang.String str, final h45.i iVar) {
        com.p314xaae8f345.mm.p2802xd031a825.b a17 = com.p314xaae8f345.mm.p2802xd031a825.b.a();
        a17.getClass();
        if (!a17.d(e42.d0.clicfg_transfer_to_bank_kinda_switch_android, false)) {
            return false;
        }
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            m27539xaf65a0fc.mo27566xe4673800("bank_card_number", str);
        }
        m24752xef221a95("transferToBankUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.38
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                if (iVar != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("pay_success", abstractC3411xcfaed72e.mo27544xb58848b9("pay_success"));
                    iVar.mo24858x44dbb8f3(intent);
                }
            }
        });
        return true;
    }

    @Override // h45.q
    /* renamed from: unregisterLiteAppModuleEventForPay */
    public void mo24853x34fcc656(java.lang.String event, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "registerLiteAppModuleEventForPay, businessEventName: %s", event);
        id.d a17 = id.d.f371977c.a();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.Map map = a17.f371979a;
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(event);
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteApp.ModuleEventManager", "unregisterEventCallback failed, event not found: %s", event);
            return;
        }
        if (valueOf == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteApp.ModuleEventManager", "unregisterEventCallback, event: %s, clear all", event);
            map.remove(event);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((id.b) next).f371975a != valueOf.intValue()) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            map.put(event, kz5.n0.V0(arrayList));
        } else {
            map.remove(event);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteApp.ModuleEventManager", "unregisterEventCallback, event: %s, id: %s", event, valueOf);
    }

    @Override // h45.q
    /* renamed from: updateLocationCacheIfNeed */
    public void mo24854x32141af7(float f17, float f18, long j17, java.lang.String str, int i17) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.C3091xa23ac64d.f11664x4fbc8495.m24717x26f4c9af(f17, f18, j17, str, i17);
    }

    @Override // h45.q
    /* renamed from: updateOfflinePayDefaultCard */
    public void mo24855x361c2aa3(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27499x361c2aa3(str, str2);
    }

    @Override // h45.q
    /* renamed from: updateOfflinePayTokenFromScene */
    public void mo24856x6b373617(int i17) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27500x9cceee7b(i17);
    }

    @Override // h45.q
    /* renamed from: startInWxAppPayUseCase */
    public void mo24806xf00c9308(final android.content.Context context, android.os.Bundle bundle) {
        m24752xef221a95("inWxAppPay", m24747x28910903(bundle), new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.WxCrossServices.34
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
                java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307(ya.b.f77506xba41a63c);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (mo27551x2fec8307 == null) {
                    mo27551x2fec8307 = "";
                }
                java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307("prepay_id");
                if (mo27551x2fec83072 == null) {
                    mo27551x2fec83072 = "";
                }
                java.lang.String mo27551x2fec83073 = abstractC3411xcfaed72e.mo27551x2fec8307("result");
                if (mo27551x2fec83073 == null) {
                    mo27551x2fec83073 = "";
                }
                android.content.Context context2 = context;
                if (context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7 abstractActivityC17142x347c74c7 = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7) context2;
                    abstractActivityC17142x347c74c7.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceNewBaseUI", "onKindaInWxAppPayCallback result:%s prepayId:%s transactionId:%s", mo27551x2fec83073, mo27551x2fec83072, mo27551x2fec8307);
                    if ("query:ok".equals(mo27551x2fec83073)) {
                        abstractActivityC17142x347c74c7.mo48627xce38d9a();
                    } else if ("pre_ok".equals(mo27551x2fec83073)) {
                        abstractActivityC17142x347c74c7.Y6(mo27551x2fec83072, mo27551x2fec8307);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractActivityC17142x347c74c7.W)) {
                            kw3.p.Ai().Di().d(abstractActivityC17142x347c74c7.f238989p0, abstractActivityC17142x347c74c7.f238972g, "");
                        } else {
                            kw3.p.Ai().Di().d(abstractActivityC17142x347c74c7.f238989p0, abstractActivityC17142x347c74c7.W, abstractActivityC17142x347c74c7.f238972g);
                        }
                        if (abstractActivityC17142x347c74c7.D1 > 0) {
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractActivityC17142x347c74c7.W)) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.h.f238380b.a(abstractActivityC17142x347c74c7.f238972g, abstractActivityC17142x347c74c7.D1, abstractActivityC17142x347c74c7.E1, abstractActivityC17142x347c74c7.f238989p0, abstractActivityC17142x347c74c7.F1);
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.h.f238380b.a(abstractActivityC17142x347c74c7.W, abstractActivityC17142x347c74c7.D1, abstractActivityC17142x347c74c7.E1, abstractActivityC17142x347c74c7.f238989p0, abstractActivityC17142x347c74c7.F1);
                            }
                        }
                    } else if ("ok".equals(mo27551x2fec83073)) {
                        if (abstractActivityC17142x347c74c7.G1) {
                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_UNION_TRANSFER_KEYBOARD_TIPS_DISABLE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                        }
                        abstractActivityC17142x347c74c7.finish();
                    } else {
                        abstractActivityC17142x347c74c7.mo48627xce38d9a();
                    }
                } else if (context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb) context2;
                    activityC19020x7623dbfb.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "onKindaInWxAppPayCallback result:%s transactionId:%s", mo27551x2fec83073, mo27551x2fec8307);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.w2 w2Var = activityC19020x7623dbfb.f259586e;
                    if (w2Var != null) {
                        java.lang.String str = activityC19020x7623dbfb.W;
                        if (mo27551x2fec83073.equalsIgnoreCase("ok")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchLogic", "%s onKindaInWxAppPayCallback, doQueryPurchaseResult, accountType: %s, reqkey: %s", java.lang.Integer.valueOf(w2Var.hashCode()), java.lang.Integer.valueOf(w2Var.f259271h), mo27551x2fec83072);
                            w2Var.f259267d = mo27551x2fec8307;
                            java.lang.String str2 = (java.lang.String) ((java.util.HashMap) w2Var.f259276m).get(mo27551x2fec83072);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                                w2Var.f259266c = str2;
                            }
                            com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = w2Var.f259265b;
                            if (abstractActivityC22902xe37969e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb) abstractActivityC22902xe37969e;
                                activityC19020x7623dbfb2.f259607x1 = true;
                                activityC19020x7623dbfb2.j7();
                            }
                            w2Var.b(str, 0);
                        }
                    }
                } else if (context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253 activityC19169x32646253 = (com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253) context2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f fVar = activityC19169x32646253.f262643p;
                    if (fVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "onKindaInWxAppPayCallback mPurchaseFinishedListener is null");
                    } else {
                        nt4.f a17 = mo27551x2fec83073.equalsIgnoreCase("ok") ? nt4.f.a(0) : mo27551x2fec83073.equalsIgnoreCase("cancel") ? nt4.f.a(1) : nt4.f.a(6);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e eVar = activityC19169x32646253.f262640m;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.y) fVar).a(a17, new mt4.e(eVar.f262696l, eVar.f262694j, eVar.f262693i, eVar.f262692h));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "onKindaInWxAppPayCallback result:%s iapResult:%s", mo27551x2fec83073, a17);
                    }
                } else if (context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb) context2;
                    activityC17155x7c2f4bb.getClass();
                    if (mo27551x2fec83073.equalsIgnoreCase("ok")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "in wx app pay succ");
                        activityC17155x7c2f4bb.a7(activityC17155x7c2f4bb.f239147w, 0);
                        ku5.u0 u0Var = ku5.t0.f394148d;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b9 b9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b9(activityC17155x7c2f4bb);
                        ku5.t0 t0Var = (ku5.t0) u0Var;
                        t0Var.getClass();
                        t0Var.z(b9Var, 200L, false);
                    } else if (mo27551x2fec83073.equalsIgnoreCase("cancel")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "in wx app pay cancel");
                        activityC17155x7c2f4bb.a7(activityC17155x7c2f4bb.f239147w, 1);
                    } else if (mo27551x2fec83073.equalsIgnoreCase("fail")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "in wx app pay fail");
                        activityC17155x7c2f4bb.a7(activityC17155x7c2f4bb.f239147w, 1);
                    }
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.f11682xc84c5534.m24865x6761d4f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startUseCase */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3613x5a5e3137 m24752xef221a95(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c interfaceC3614x9e78e9c) {
        m24733xfd081300(abstractC3411xcfaed72e);
        this.f11690xf5c1967d.m25636xfbd117d2(str);
        if (m24750x7d90ff93(str, abstractC3411xcfaed72e)) {
            return this.f11690xf5c1967d.m25634xa04ad3be(str, abstractC3411xcfaed72e, interfaceC3614x9e78e9c);
        }
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27496xef221a95(str, abstractC3411xcfaed72e, interfaceC3614x9e78e9c);
    }

    @Override // h45.q
    /* renamed from: isEnableLiteAppUseCase */
    public boolean mo24773x6a93e3f1(java.lang.String str, java.lang.Object obj) {
        return m24750x7d90ff93(str, obj instanceof com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e ? (com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e) obj : null);
    }
}
