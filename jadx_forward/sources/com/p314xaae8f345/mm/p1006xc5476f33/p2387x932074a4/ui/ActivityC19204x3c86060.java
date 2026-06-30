package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui;

/* renamed from: com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI */
/* loaded from: classes9.dex */
public class ActivityC19204x3c86060 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f262913t = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f262914d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f262915e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f262916f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f262917g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f262918h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f262919i;

    /* renamed from: m, reason: collision with root package name */
    public int f262920m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f262921n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f262922o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f262923p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f262924q = true;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f262925r = true;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f262926s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI.1
        {
            this.f39173x3fe91575 = 1842411039;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f c6244x161a780f) {
            if (c6244x161a780f.f136493g.f88925a != 6) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.ActivityC19204x3c86060.this.finish();
            return false;
        }
    };

    public final void V6(int i17, int i18, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", i18);
        intent.putExtra("key_err_msg", str);
        setResult(i17, intent);
        finish();
    }

    public final void W6() {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = this.f262915e;
        if (c21549x15041e54 != null && (z18 = this.f262924q)) {
            X6(c21549x15041e54, false, z18);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e542 = this.f262918h;
        if (c21549x15041e542 != null && (z17 = this.f262925r)) {
            X6(c21549x15041e542, false, z17);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e543 = this.f262916f;
        if (c21549x15041e543 != null) {
            X6(c21549x15041e543, false, true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e544 = this.f262917g;
        if (c21549x15041e544 != null) {
            X6(c21549x15041e544, false, true);
        }
    }

    public final void X6(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, boolean z17, boolean z18) {
        if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) c21560x1fce98fb;
            c21549x15041e54.Z(i65.a.b(this, 20), i65.a.b(this, 20));
            if (!z17) {
                c21549x15041e54.S(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
                c21549x15041e54.T(0);
            } else {
                if (z18) {
                    c21549x15041e54.S(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
                } else {
                    c21549x15041e54.S(com.p314xaae8f345.mm.R.raw.f80934x4cd0ef61);
                }
                c21549x15041e54.T(0);
            }
        }
    }

    public final void Y6(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 G = db5.e1.G(this, str, "", true, new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.g(this));
        this.f262919i = G;
        G.setCanceledOnTouchOutside(false);
        this.f262919i.show();
    }

    public final void Z6() {
        W6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", "current wallet lock type: %d", java.lang.Integer.valueOf(lVar.h()));
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("TouchLockFunction", 0) != 1) {
            boolean z17 = re4.g0.c() && wt5.a.n(mo55332x76847179());
            if (lVar.i()) {
                if (!z17) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262914d).m("wallet_lock_fingerprint", false);
                    this.f262915e.O(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kno));
                    this.f262915e.Q(0);
                    X6(this.f262915e, true, false);
                    this.f262915e.w(false);
                    this.f262915e.U1 = true;
                    this.f262924q = false;
                } else if (this.f262923p) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262914d).m("wallet_lock_fingerprint", false);
                    X6(this.f262915e, true, true);
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = this.f262915e;
                    java.lang.String str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.koe) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.knv);
                    android.view.View view = c21549x15041e54.W1;
                    if (view != null) {
                        view.setContentDescription(str);
                    }
                    c21549x15041e54.N1 = str;
                }
            } else if (z17) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262914d).m("wallet_lock_fingerprint", false);
                X6(this.f262915e, false, true);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e542 = this.f262915e;
                java.lang.String str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kof) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.knv);
                android.view.View view2 = c21549x15041e542.W1;
                if (view2 != null) {
                    view2.setContentDescription(str2);
                }
                c21549x15041e542.N1 = str2;
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262914d).m("wallet_lock_fingerprint", true);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLockSettingUI", "FingerprintLock entry is not opened and don't show FingerprintLock entry");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262914d).m("wallet_lock_fingerprint", true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", "isUserSetGesturePwd: %b", java.lang.Boolean.valueOf(hu4.f.a()));
        if (lVar.h() == 2 || lVar.h() == 3) {
            X6(this.f262916f, false, true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262914d).m("wallet_lock_modify_gesture", true);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e543 = this.f262916f;
            java.lang.String str3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kof) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575081ko2);
            android.view.View view3 = c21549x15041e543.W1;
            if (view3 != null) {
                view3.setContentDescription(str3);
            }
            c21549x15041e543.N1 = str3;
        } else if (lVar.h() != 1) {
            X6(this.f262916f, false, true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262914d).m("wallet_lock_modify_gesture", true);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e544 = this.f262916f;
            java.lang.String str4 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kof) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575081ko2);
            android.view.View view4 = c21549x15041e544.W1;
            if (view4 != null) {
                view4.setContentDescription(str4);
            }
            c21549x15041e544.N1 = str4;
        } else if (this.f262923p) {
            X6(this.f262916f, true, true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262914d).m("wallet_lock_modify_gesture", false);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e545 = this.f262916f;
            java.lang.String str5 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.koe) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575081ko2);
            android.view.View view5 = c21549x15041e545.W1;
            if (view5 != null) {
                view5.setContentDescription(str5);
            }
            c21549x15041e545.N1 = str5;
        }
        if (lVar.h() != 0) {
            X6(this.f262917g, false, true);
        } else if (this.f262923p) {
            X6(this.f262917g, true, true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576505d1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", "onActivityResult requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLockSettingUI", "data is null");
            return;
        }
        int intExtra = intent.getIntExtra("key_err_code", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", "wallet lock setting onActivityResult errCode: %d", java.lang.Integer.valueOf(intExtra));
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", "request open fingerprint lock onActivityResult");
            if (intExtra == 0) {
                if (this.f262922o) {
                    setResult(i18, intent);
                    finish();
                    return;
                }
                return;
            }
            if (intExtra == 4) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", "open fingerprint lock failed");
            Y6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.knr));
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", "request open gesture onActivityResult");
            if (intExtra == 0) {
                if (this.f262922o) {
                    setResult(i18, intent);
                    finish();
                }
                s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.f(this), "WalletLockRemoveAuthKey");
                return;
            }
            if (intExtra == 4) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", "open gesture lock failed");
            Y6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575080ko1));
            return;
        }
        if (i17 == 3) {
            if (intExtra != 0) {
                if (intExtra == 4) {
                    return;
                }
                Y6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.knm));
                return;
            }
            ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().j(0);
            hu4.i.f366763a = -1L;
            fu4.a.f348417a = -1L;
            Z6();
            dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.knl), 0).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockReportManager", "idkey report close wallet lock success");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(713L, 3L, 1L, false);
            if (this.f262922o) {
                V6(-1, 0, "close wallet lock ok");
            }
            s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.h(this), "WalletLockRemoveAuthKey");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca9650 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
            c7053xf3ca9650.f143649d = 14L;
            c7053xf3ca9650.f143650e = 2L;
            c7053xf3ca9650.k();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", "onBackPressed");
        if (this.f262922o) {
            V6(0, 4, "user cancel setting wallet lock");
        } else {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.b(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.koa);
        this.f262914d = m79336x8b97809d();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f262914d = m79336x8b97809d;
        this.f262915e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).h("wallet_lock_fingerprint");
        this.f262916f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262914d).h("wallet_lock_gesture");
        this.f262917g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262914d).h("wallet_lock_close");
        this.f262918h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262914d).h("wallet_lock_faceid");
        this.f262915e.Y(0);
        this.f262916f.Y(0);
        this.f262917g.Y(0);
        this.f262918h.Y(0);
        this.f262915e.E(8);
        this.f262916f.E(8);
        this.f262917g.E(8);
        this.f262918h.E(8);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262914d).m("wallet_lock_faceid", true);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f262914d).h("wallet_lock_title");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", " cn wallet open new name ：%s", java.lang.Boolean.TRUE);
        c21568x1a71b23b.L(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ko_));
        this.f262921n = getIntent().getIntExtra("wallet_lock_jsapi_scene", 0);
        int intExtra = getIntent().getIntExtra("key_wallet_lock_setting_scene", -1);
        this.f262920m = intExtra;
        if (intExtra == 1) {
            this.f262922o = true;
            this.f262923p = false;
        } else if (intExtra == 2) {
            this.f262926s.mo48813x58998cd();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca9650 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
        c7053xf3ca9650.f143649d = 13L;
        c7053xf3ca9650.f143650e = 1L;
        c7053xf3ca9650.f143651f = this.f262921n;
        c7053xf3ca9650.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", "isNeedFinish: %b, isNeedShowOpenIcon: %b", java.lang.Boolean.valueOf(this.f262922o), java.lang.Boolean.valueOf(this.f262923p));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f262920m == 2) {
            this.f262926s.mo48814x2efc64();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f262919i;
        if (j0Var == null || !j0Var.isShowing()) {
            return;
        }
        this.f262919i.dismiss();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        boolean equals = "wallet_lock_fingerprint".equals(c21560x1fce98fb.f279313q);
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance;
        if (equals) {
            W6();
            X6(c21560x1fce98fb, true, true);
            if (this.f262924q && (!this.f262923p || lVar.h() != 2)) {
                if (!wt5.a.p(this)) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 G = db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575083ko4), "", true, new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.c(this));
                    this.f262919i = G;
                    G.setCanceledOnTouchOutside(false);
                } else if (!this.f262923p || lVar.h() != 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", "request open fingerprint lock");
                    ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().d(this, 2, 1);
                }
            }
            return true;
        }
        if ("wallet_lock_faceid".equals(c21560x1fce98fb.f279313q)) {
            W6();
            X6(c21560x1fce98fb, true, true);
            if (this.f262925r && (!this.f262923p || lVar.h() != 3)) {
                if (!wt5.a.o(this, 2)) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 G2 = db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575083ko4), "", true, new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.c(this));
                    this.f262919i = G2;
                    G2.setCanceledOnTouchOutside(false);
                } else if (!this.f262923p || lVar.h() == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", "request open faceid lock");
                    ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().d(this, 3, 4);
                }
            }
            return true;
        }
        if ("wallet_lock_gesture".equals(c21560x1fce98fb.f279313q)) {
            W6();
            X6(c21560x1fce98fb, true, true);
            if (lVar.h() != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockSettingUI", "request open gesture lock");
                ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().d(this, 1, 2);
            }
            return true;
        }
        if ("wallet_lock_close".equals(c21560x1fce98fb.f279313q)) {
            db5.e1.C(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.knk), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.d(this, c21560x1fce98fb), new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.e(this));
            return true;
        }
        if (!"wallet_lock_modify_gesture".equals(c21560x1fce98fb.f279313q)) {
            return false;
        }
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().g(this);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        Z6();
    }
}
