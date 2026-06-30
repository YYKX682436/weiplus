package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI */
/* loaded from: classes9.dex */
public class ActivityC19027xea6090a extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f260105t = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f260108f;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260116q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260117r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260118s;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 f260106d = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();

    /* renamed from: e, reason: collision with root package name */
    public boolean f260107e = false;

    /* renamed from: g, reason: collision with root package name */
    public int f260109g = -1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f260110h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f260111i = false;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f260112m = null;

    /* renamed from: n, reason: collision with root package name */
    public ss4.d f260113n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f260114o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f260115p = false;

    public ActivityC19027xea6090a() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f260116q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6239x3d383f6>(a0Var) { // from class: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.3
            {
                this.f39173x3fe91575 = 92672998;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6239x3d383f6 c6239x3d383f6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a.this.finish();
                return false;
            }
        };
        this.f260117r = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80>(a0Var) { // from class: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.8
            {
                this.f39173x3fe91575 = 572563856;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b80) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b802 = c5663xbbd89b80;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindUI", "KindaBindCardEvent callback");
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a activityC19027xea6090a = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a.this;
                activityC19027xea6090a.f260117r.mo48814x2efc64();
                if (c5663xbbd89b802 == null) {
                    return false;
                }
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
                am.di diVar = c5663xbbd89b802.f135987g;
                if (diVar != null && !diVar.f87996k.booleanValue()) {
                    activityC19027xea6090a.X6(diVar.f87986a, diVar.f87987b);
                }
                return true;
            }
        };
        this.f260118s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(a0Var) { // from class: com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.9
            {
                this.f39173x3fe91575 = 323604482;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindUI", "WalletRealNameResultNotifyEvent callback");
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a activityC19027xea6090a = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a.this;
                activityC19027xea6090a.f260118s.mo48814x2efc64();
                if (c6256xb3fb7c12.f136506g.f87653a == -1) {
                    activityC19027xea6090a.setResult(-1);
                    activityC19027xea6090a.Y6(-1);
                    activityC19027xea6090a.finish();
                }
                activityC19027xea6090a.f260115p = true;
                return true;
            }
        };
    }

    public final void U6() {
        if (vr4.f1.wi().Ai().s()) {
            m83096xe7b1ccf7(new ss4.e0(null, 12));
            return;
        }
        java.lang.String str = getIntent().getStringExtra("packageExt") + "";
        java.lang.String[] split = str.split("&");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && split.length >= 2) {
            boolean z17 = false;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            for (java.lang.String str4 : split) {
                if (str4.startsWith("bankType=")) {
                    str3 = str4.replace("bankType=", "");
                } else if (str4.startsWith("bankName=")) {
                    str2 = str4.replace("bankName=", "");
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                at4.x1 Ai = vr4.f1.wi().Ai();
                Ai.getClass();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    java.util.ArrayList arrayList = Ai.f95528d;
                    if (arrayList != null) {
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
                            if (str3.equals(c19091x9511676c.f69223x58802fcb) && c19091x9511676c.F0()) {
                                break;
                            }
                        }
                    }
                    java.util.ArrayList arrayList2 = Ai.f95529e;
                    if (arrayList2 != null) {
                        java.util.Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it6.next();
                            if (str3.equals(c19091x9511676c2.f69223x58802fcb) && c19091x9511676c2.f69220xb7753620 == 0) {
                                break;
                            }
                        }
                    }
                    z17 = true;
                }
                if (z17) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
                    c19091x9511676c3.f69217xaef0808c = str2;
                    c19091x9511676c3.f69223x58802fcb = str3;
                    bundle.putParcelable("key_bankcard", c19091x9511676c3);
                    bundle.putString("key_bank_type", c19091x9511676c3.f69223x58802fcb);
                    com.p314xaae8f345.mm.p2802xd031a825.a.k(this, "wxcredit", "WXCreditOpenProcess", bundle, null);
                    return;
                }
            }
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a.V6():void");
    }

    public final void W6(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doBindCardForOtherScene ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindUI", sb6.toString());
        android.os.Bundle m83105x7498fe14 = m83105x7498fe14();
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = this.f260106d;
        m83105x7498fe14.putParcelable("key_pay_info", c19760x34448d56);
        m83105x7498fe14.putBoolean("key_need_bind_response", true);
        m83105x7498fe14.putString("key_custom_bind_tips", getIntent().getStringExtra("key_custom_bind_tips"));
        boolean booleanExtra = getIntent().getBooleanExtra("from_kinda", false);
        if (booleanExtra) {
            m83105x7498fe14.putBoolean("is_from_new_cashier", true);
            m83105x7498fe14.putString("start_activity_class", getClass().getName());
        }
        if (vr4.f1.wi().Ai().s()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindUI", "user status invalid");
            if (i17 == 4) {
                m83096xe7b1ccf7(new ss4.e0(null, 20));
            } else {
                m83096xe7b1ccf7(new ss4.e0(null, 12));
            }
        } else {
            boolean w17 = vr4.f1.wi().Ai().w();
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f260117r;
            if (w17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindUI", "user status reg");
                this.f260107e = true;
                int i18 = this.f260109g;
                c19760x34448d56.f273641d = i18;
                m83105x7498fe14.putInt("key_bind_scene", i18);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260110h)) {
                    m83105x7498fe14.putString("kreq_token", this.f260110h);
                }
                if (!this.f260111i || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260112m)) {
                    m83105x7498fe14.putBoolean("key_bind_card_can_pass_pwd", false);
                } else {
                    m83105x7498fe14.putBoolean("key_bind_card_can_pass_pwd", true);
                    m83105x7498fe14.putString("key_bind_card_user_token", this.f260112m);
                }
                java.lang.String str = h45.y.f360501a;
                if (str != null) {
                    m83105x7498fe14.putString("jsapi_reqkey", str);
                }
                if (com.p314xaae8f345.mm.p2802xd031a825.b.a().b()) {
                    abstractC20980x9b9ad01d.mo48813x58998cd();
                    b7(m83105x7498fe14);
                    return;
                } else {
                    getIntent().putExtra("process_id", qs4.j.class.hashCode());
                    com.p314xaae8f345.mm.p2802xd031a825.a.j(this, qs4.j.class, m83105x7498fe14, null);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindUI", "user status unreg");
                this.f260107e = true;
                int i19 = this.f260109g;
                if (i19 >= 0) {
                    c19760x34448d56.f273641d = i19;
                } else {
                    c19760x34448d56.f273641d = 1;
                }
                m83105x7498fe14.putInt("key_bind_scene", c19760x34448d56.f273641d);
                if (!this.f260111i || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260112m)) {
                    m83105x7498fe14.putBoolean("key_bind_card_can_pass_pwd", false);
                } else {
                    m83105x7498fe14.putBoolean("key_bind_card_can_pass_pwd", true);
                    m83105x7498fe14.putString("key_bind_card_user_token", this.f260112m);
                }
                if (com.p314xaae8f345.mm.p2802xd031a825.b.a().b()) {
                    abstractC20980x9b9ad01d.mo48813x58998cd();
                    b7(m83105x7498fe14);
                    return;
                } else {
                    getIntent().putExtra("process_id", qs4.j.class.hashCode());
                    com.p314xaae8f345.mm.p2802xd031a825.a.j(this, qs4.j.class, m83105x7498fe14, null);
                }
            }
        }
        if (booleanExtra) {
            com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
            if (g17 instanceof qs4.j) {
                ((qs4.j) g17).f447953d = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.a0(this);
            }
        }
    }

    public void X6(boolean z17, boolean z18) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindUI", "kindaBindCardCallback bindCard Succ");
            if (this.f260109g == 4) {
                m83096xe7b1ccf7(new ss4.e0(null, 20));
            } else {
                m83096xe7b1ccf7(new ss4.e0(null, 12));
            }
            if (z18 && this.f260107e) {
                setResult(-1);
                Y6(-1);
                finish();
                return;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindUI", "kindaBindCardCallback bindCard Cancel");
            if (z18 && this.f260107e) {
                setResult(0);
                Y6(0);
                finish();
                return;
            }
        }
        if (Z6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindUI", "kindaBindCardCallback delay finish");
            setResult(0);
            finish();
        }
    }

    public final void Y6(int i17) {
        if (getIntent().getBooleanExtra("from_kinda", false)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6238xf12e491b c6238xf12e491b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6238xf12e491b();
            c6238xf12e491b.f136486g.f88261a = i17;
            c6238xf12e491b.e();
        }
    }

    public final boolean Z6() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_bindui_delay_finish, false) && this.f260115p;
    }

    public void a7(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
        }
        db5.e1.G(this, str, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.e0(this));
    }

    public final void b7(android.os.Bundle bundle) {
        this.f260118s.mo48813x58998cd();
        if (bundle != null) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, bundle.getInt("key_bind_scene"));
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(bundle.getInt("key_bind_scene"));
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, 0);
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(0);
        }
        ((h45.q) i95.n0.c(h45.q.class)).mo24800xa4a1f2e8(this, bundle);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: checkProcLife */
    public boolean mo66577x53f7ec9a() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(580);
        this.f260108f = getIntent().getStringExtra("key_import_key");
        this.f260109g = getIntent().getIntExtra("key_req_bind_scene", -1);
        getWindow().setStatusBarColor(0);
        int intExtra = getIntent() != null ? getIntent().getIntExtra("key_req_bind_scene", 13) : -1;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
        am.l10 l10Var = c6243x5c461184.f136491g;
        if (intExtra == 4) {
            l10Var.f88748a = 20;
        } else {
            l10Var.f88748a = 13;
        }
        c6243x5c461184.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.z(this);
        c6243x5c461184.e();
        this.f260116q.mo48813x58998cd();
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, 0);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        m83121xf6ff5b27(580);
        this.f260116q.mo48814x2efc64();
        this.f260117r.mo48814x2efc64();
        this.f260118s.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBindUI", "onNewIntent intent null");
            setResult(0);
            Y6(0);
            finish();
            return;
        }
        super.onNewIntent(intent);
        if (Z6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindUI", "should delay finish after bindcard, skip setnewIntent");
            return;
        }
        setIntent(intent);
        if (intent.getBooleanExtra("intent_bind_end", false)) {
            intent.getBooleanExtra("intent_bind_end", false);
            setResult(-1, getIntent());
            Y6(-1);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindUI", "pay cancel");
            setResult(0);
            Y6(0);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f260107e = bundle.getBoolean("key_is_jump", false);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        if (this.f260107e && !Z6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindUI", "finish on resume");
            finish();
        }
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key_is_jump", this.f260107e);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = m1Var instanceof tr4.c;
        if (z17) {
            this.f260107e = true;
        }
        if (i17 != 0 || i18 != 0) {
            a7(str);
            return true;
        }
        if (m1Var instanceof ss4.e0) {
            if (this.f260109g == 6) {
                U6();
            } else {
                V6();
            }
            return true;
        }
        if (!z17) {
            if (m1Var instanceof ss4.d) {
                ss4.d dVar = this.f260113n;
                if (dVar != null && dVar.equals(m1Var)) {
                    ss4.d dVar2 = (ss4.d) m1Var;
                    h45.y.f360501a = dVar2.H();
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = dVar2.f493562e.f152244b.f152233a;
                    this.f260110h = ((r45.y10) fVar).f472235f;
                    r45.y10 y10Var = (r45.y10) fVar;
                    this.f260111i = y10Var.f472238i;
                    this.f260112m = y10Var.f472239m;
                    W6(4);
                    return true;
                }
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
            }
            return false;
        }
        tr4.c cVar = (tr4.c) m1Var;
        android.os.Bundle m83105x7498fe14 = m83105x7498fe14();
        m83105x7498fe14.putBoolean("key_is_import_bind", true);
        java.util.ArrayList arrayList = cVar.f502968d;
        if (arrayList == null || arrayList.size() <= 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kgo);
            }
            db5.e1.G(this, str, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.d0(this));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) cVar.f502968d.get(0);
            if (c19091x9511676c.Z2) {
                db5.e1.o(this, com.p314xaae8f345.mm.R.C30867xcad56011.kii, 0, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.c0(this));
            } else {
                m83105x7498fe14.putBoolean("key_need_bind_response", true);
                m83105x7498fe14.putString("kreq_token", cVar.f502969e);
                m83105x7498fe14.putString("key_bank_username", cVar.f502970f);
                m83105x7498fe14.putString("key_recommand_desc", cVar.f502971g);
                m83105x7498fe14.putParcelable("key_import_bankcard", c19091x9511676c);
                this.f260107e = true;
                m83105x7498fe14.putInt("key_bind_scene", 2);
                com.p314xaae8f345.mm.p2802xd031a825.a.j(this, qs4.j.class, m83105x7498fe14, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.b0(this));
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.g0.class);
    }
}
