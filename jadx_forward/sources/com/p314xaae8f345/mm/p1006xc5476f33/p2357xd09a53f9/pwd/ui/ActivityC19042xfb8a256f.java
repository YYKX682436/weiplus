package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI */
/* loaded from: classes9.dex */
public class ActivityC19042xfb8a256f extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f260372u = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f260373d;

    /* renamed from: e, reason: collision with root package name */
    public long f260374e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19043xea94b960 f260375f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19043xea94b960 f260376g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19043xea94b960 f260377h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f260378i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f260379m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f260380n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f260381o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f260382p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f260384r;

    /* renamed from: q, reason: collision with root package name */
    public int f260383q = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f260385s = 1;

    /* renamed from: t, reason: collision with root package name */
    public int f260386t = 0;

    public final boolean V6(int i17) {
        return (this.f260374e & ((long) i17)) != 0;
    }

    public final void W6() {
        if (this.f260383q != 1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260384r)) {
            m78548x39037dd1();
        } else {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.C30861xcebc809e.chy, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.l(this));
        }
    }

    public final void X6(boolean z17) {
        if (V6(16)) {
            this.f260375f.M = false;
            this.f260376g.M = true;
            this.f260377h.M = false;
            if (z17) {
                return;
            }
            this.f260386t = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23319, java.lang.Integer.valueOf(this.f260385s), java.lang.Integer.valueOf(this.f260386t), 0);
            return;
        }
        if (V6(32)) {
            this.f260375f.M = false;
            this.f260376g.M = false;
            this.f260377h.M = true;
            if (z17) {
                return;
            }
            this.f260386t = 3;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23319, java.lang.Integer.valueOf(this.f260385s), java.lang.Integer.valueOf(this.f260386t), 0);
            return;
        }
        this.f260375f.M = true;
        this.f260376g.M = false;
        this.f260377h.M = false;
        if (z17) {
            return;
        }
        this.f260386t = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23319, java.lang.Integer.valueOf(this.f260385s), java.lang.Integer.valueOf(this.f260386t), 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getBottomView */
    public android.view.View mo60898x89f7f366() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(mo55332x76847179());
        linearLayout.setPadding(0, 0, 0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu));
        linearLayout.setOrientation(1);
        android.widget.Button button = new android.widget.Button(mo55332x76847179());
        linearLayout.addView(button);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(button.getLayoutParams());
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        button.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
        button.setBackground(getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk));
        button.setTextSize(1, 17.0f);
        button.setPadding(i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561395hb), 0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561395hb), 0);
        button.setMinHeight(i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561414hu));
        button.setMinWidth(i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561416hw));
        button.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfd));
        button.setGravity(17);
        button.setLayoutParams(layoutParams);
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.n(this));
        return linearLayout;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getHeaderResourceId */
    public int mo48679xfc6e1bac() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d6c;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f260375f = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19043xea94b960) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260373d).h("wallet_transfer_realtime");
        this.f260376g = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19043xea94b960) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260373d).h("wallet_transfer_2h");
        this.f260377h = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19043xea94b960) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260373d).h("wallet_transfer_24h");
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.csz);
        this.f260378i = textView;
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f260379m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.csy);
        this.f260375f.E(8);
        this.f260376g.E(8);
        this.f260377h.E(8);
        X6(false);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.m(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean H;
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        mo78530x8b45058f();
        this.f260373d = m79336x8b97809d();
        this.f260385s = getIntent().getIntExtra("key_scene", 1);
        if (m79335xcc101dd9() != null) {
            int dimensionPixelSize = mo55332x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
            m79335xcc101dd9().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            m79335xcc101dd9().setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.jlw);
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260373d).g(com.p314xaae8f345.mm.R.xml.f576504d0);
        gm0.j1.i();
        this.f260374e = ((java.lang.Long) gm0.j1.u().c().l(147457, 0L)).longValue();
        mo43517x10010bd5();
        gm0.j1.i();
        gm0.j1.n().f354821b.a(385, this);
        gm0.j1.i();
        this.f260380n = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_REMIND_WORDING_STRING, "");
        gm0.j1.i();
        this.f260381o = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_HALF_PAGE_WORDING_STRING, "");
        gm0.j1.i();
        this.f260382p = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_SWITCH_WORDING_STRING, "");
        gm0.j1.i();
        this.f260384r = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_DESC_URL_STRING, "");
        gm0.j1.i();
        this.f260383q = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_DESC_URL_FLAG_INT, 0)).intValue();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260380n) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260382p) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260384r) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260381o)) {
            H = ss4.k0.H(true, null, null);
        } else {
            this.f260379m.setText(this.f260380n);
            this.f260378i.setText(this.f260382p);
            W6();
            H = ss4.k0.H(false, null, null);
        }
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        if (H) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletDelayTransferSettingUI", "no need do scene, remove listener");
        gm0.j1.i();
        gm0.j1.n().f354821b.q(385, this);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletDelayTransferSettingUI", "do oplog, %s", java.lang.Long.valueOf(this.f260374e));
        int i17 = V6(16) ? 1 : V6(32) ? 2 : 0;
        r45.po4 po4Var = new r45.po4();
        po4Var.f464786d = i17;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(205, po4Var));
        gm0.j1.i();
        gm0.j1.n().f354821b.q(385, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if ("wallet_transfer_realtime".equals(str)) {
            this.f260374e = (-17) & this.f260374e & (-33);
        } else if ("wallet_transfer_2h".equals(str)) {
            this.f260374e = (this.f260374e & (-33)) | 16;
        } else if ("wallet_transfer_24h".equals(str)) {
            this.f260374e = (this.f260374e & (-17)) | 32;
        }
        X6(true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof ss4.k0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletDelayTransferSettingUI", "other scene");
            return;
        }
        if (i17 == 0 && i18 == 0) {
            ss4.k0 k0Var = (ss4.k0) m1Var;
            java.lang.String str2 = k0Var.f493610f;
            this.f260380n = str2;
            this.f260382p = k0Var.f493609e;
            this.f260384r = k0Var.f493613i;
            this.f260383q = k0Var.f493614m;
            this.f260381o = k0Var.f493611g;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletDelayTransferSettingUI", "use hardcode wording");
                this.f260379m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575056kl1);
            } else {
                this.f260379m.setText(this.f260380n);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260382p)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletDelayTransferSettingUI", "use hardcode title wording");
                this.f260378i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ktl);
            } else {
                this.f260378i.setText(this.f260382p);
            }
            W6();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletDelayTransferSettingUI", "net error, use hardcode wording");
            this.f260379m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575056kl1);
            this.f260378i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ktl);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260373d).notifyDataSetChanged();
    }
}
