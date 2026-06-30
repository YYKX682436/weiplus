package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* renamed from: com.tencent.mm.plugin.shake.ui.TVInfoUI */
/* loaded from: classes9.dex */
public class ActivityC17681x5e0a88e4 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements x51.r0, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f243756q = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f243757d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f243758e;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f243760g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f243761h;

    /* renamed from: i, reason: collision with root package name */
    public j34.i f243762i;

    /* renamed from: m, reason: collision with root package name */
    public long f243763m;

    /* renamed from: o, reason: collision with root package name */
    public j34.h f243765o;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f243759f = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f243764n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f243766p = false;

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4 activityC17681x5e0a88e4, java.lang.String str) {
        activityC17681x5e0a88e4.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("show_bottom", false);
        intent.putExtra("geta8key_scene", 10);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, activityC17681x5e0a88e4);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TVInfoUI", "onUpdateEnable pic, url  is null ");
            return;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.n1(this, str, bitmap));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TVInfoUI", "onGetPictureFinish : [%s]", e17.getLocalizedMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TVInfoUI", e17, "", new java.lang.Object[0]);
        }
    }

    public final void W6(j34.i iVar) {
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TVInfoUI", "refreshViewByProduct(), pd == null");
            finish();
            return;
        }
        this.f243760g.setText(iVar.f72371x29dd02d3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f72372x29dfadaa)) {
            this.f243761h.setVisibility(8);
        } else {
            this.f243761h.setText(iVar.f72372x29dfadaa);
        }
        this.f243758e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.oqz);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f72366x5727ab76)) {
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.oqy);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.g1(this, iVar));
            this.f243758e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.h1(this, iVar));
        }
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.i1(this));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f72364xc8a07680) && !this.f243764n && !getIntent().getBooleanExtra("key_TV_come_from_shake", false)) {
            c01.d9.e().g(new h34.g(iVar.f72364xc8a07680, getIntent().getIntExtra("key_TV_getProductInfoScene", 0)));
            this.f243764n = true;
        }
        this.f243758e.setVisibility(0);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.j1(this));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.k1(this, iVar));
    }

    public final void X6() {
        this.f243763m = getIntent().getLongExtra("key_TVInfoUI_chatting_msgId", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_TVInfoUI_chatting_talker");
        if (this.f243763m <= 0 || !gm0.j1.a()) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(stringExtra, this.f243763m);
        if (Li.m124847x74d37ac6() > 0) {
            Li.i1(this.f243765o.k());
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(this.f243763m, Li, true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getHeaderResourceId */
    public int mo48679xfc6e1bac() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d2g;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d2f;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576499cv;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        byte[] byteArrayExtra;
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574463ib0);
        this.f243757d = m79336x8b97809d();
        this.f243760g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569008or0);
        this.f243761h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569009or1);
        java.lang.String stringExtra = getIntent().getStringExtra("key_TV_xml");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && (byteArrayExtra = getIntent().getByteArrayExtra("key_TV_xml_bytes")) != null) {
            stringExtra = new java.lang.String(byteArrayExtra);
        }
        j34.i b17 = j34.j.b(stringExtra);
        this.f243762i = b17;
        if (b17 != null) {
            W6(b17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TVInfoUI", "initView(), tv == null");
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        x51.w0.a(this);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        x51.w0.e(this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        c01.d9.e().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.f0.f34795x366c91de, this);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        j34.i iVar = this.f243762i;
        if (iVar == null || iVar.f379027a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TVInfoUI", "tv == null || tv.actionlist == null");
            return false;
        }
        try {
            int intValue = java.lang.Integer.valueOf(str).intValue();
            int i17 = intValue / 100;
            int i18 = intValue % 100;
            if (i17 >= 0 && i17 < this.f243762i.f379027a.size()) {
                j34.g gVar = (j34.g) this.f243762i.f379027a.get(i17);
                if (gVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TVInfoUI", "actionList == null");
                    return false;
                }
                if (i18 >= 0 && i18 < gVar.f379024a.size()) {
                    j34.f fVar = (j34.f) gVar.f379024a.get(i18);
                    if (fVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TVInfoUI", "action == null");
                        return false;
                    }
                    int i19 = fVar.f379017a;
                    if (i19 == 3) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("rawUrl", fVar.f379020d);
                        intent.putExtra("show_bottom", false);
                        intent.putExtra("geta8key_scene", 10);
                        intent.putExtra("srcUsername", fVar.f379023g);
                        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, this);
                    } else if (i19 == 4) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(fVar.f379020d, true);
                        if (n17 != null) {
                            android.content.Intent intent2 = new android.content.Intent();
                            if (n17.r2() && n17.k2()) {
                                r01.q3.cj().b1(fVar.f379020d);
                                if (fVar.f379022f.equals("1")) {
                                    intent2.putExtra("Chat_User", fVar.f379020d);
                                    intent2.putExtra("finish_direct", true);
                                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent2, this);
                                }
                            }
                            intent2.putExtra("Contact_User", fVar.f379020d);
                            intent2.putExtra("force_get_contact", true);
                            j45.l.j(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
                        }
                    } else if (i19 == 5) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec();
                        am.df dfVar = c5587xf7a06bec.f135909g;
                        dfVar.f87979a = 11;
                        dfVar.f87980b = fVar.f379020d;
                        dfVar.f87981c = new java.lang.ref.WeakReference(this);
                        c5587xf7a06bec.f273897d = null;
                        c5587xf7a06bec.b(android.os.Looper.myLooper());
                    } else if (i19 == 6) {
                        android.content.Intent intent3 = new android.content.Intent();
                        intent3.putExtra("key_product_id", fVar.f379020d);
                        intent3.putExtra("key_product_scene", 9);
                        j45.l.j(this, "product", ".ui.MallProductUI", intent3, null);
                    }
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TVInfoUI", "index out of bounds, jj=[%s], actions Size=[%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(gVar.f379024a.size()));
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TVInfoUI", "index out of bounds, ii=[%s], list Size=[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f243762i.f379027a.size()));
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TVInfoUI", "onPreferenceTreeClick, [%s]", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TVInfoUI", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.f0.f34795x366c91de, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TVInfoUI", "scene == null");
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 552) {
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TVInfoUI", "onSceneEnd() errType = [%s], errCode = [%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f574464ib1, 0).show();
                return;
            }
            if (this.f243762i == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TVInfoUI", "onSceneEnd tv == null");
                return;
            }
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((h34.g) m1Var).f360062e;
            r45.wo3 wo3Var = (oVar == null || (fVar = oVar.f152244b.f152233a) == null) ? null : (r45.wo3) fVar;
            if (wo3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TVInfoUI", "onSceneEnd tvInfo == null");
                return;
            }
            java.lang.String str4 = wo3Var.f470874e;
            if (str4 != null) {
                j34.i b17 = j34.j.b(str4);
                j34.i iVar = this.f243762i;
                if (iVar == null || (str2 = iVar.f72373x4b6e9352) == null || b17 == null || (str3 = b17.f72373x4b6e9352) == null || str2.equals(str3)) {
                    return;
                }
                this.f243762i = b17;
                W6(b17);
            }
        }
    }
}
