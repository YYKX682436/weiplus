package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* renamed from: com.tencent.mm.plugin.card.ui.CardViewUI */
/* loaded from: classes15.dex */
public class ActivityC13061xa213e749 extends com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 {
    public int C;
    public int D;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f176449y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f176450z;

    /* renamed from: w, reason: collision with root package name */
    public int f176447w = 1;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f176448x = new java.util.LinkedList();
    public java.lang.String A = "";
    public java.lang.String B = "";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public android.widget.BaseAdapter T6() {
        return this.f176447w == 0 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s2(getApplicationContext()) : super.T6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public xt1.r U6() {
        return xt1.r.CAN_GIFT_TYPE;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void V6() {
        int i17 = this.f176447w;
        if (i17 == 0) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.aw7);
        } else if (i17 == 1) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.asn);
        }
        gm0.j1.n().f354821b.a(1099, this);
        int i18 = this.f176447w;
        int i19 = com.p314xaae8f345.mm.R.C30867xcad56011.ar6;
        if (i18 == 0) {
            j7(true);
            r45.pd6 pd6Var = new r45.pd6();
            java.lang.String str = this.A;
            pd6Var.f464502d = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardViewUI", "doBatchGetCardItemByTpInfo templateId:%s", str);
            gm0.j1.n().f354821b.g(new xt1.b0(this.f176448x, pd6Var, this.C));
        } else if (i18 == 1) {
            android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569869qi, null);
            this.f176450z = inflate;
            android.widget.LinearLayout linearLayout = this.f176168h;
            if (linearLayout != null) {
                linearLayout.addView(inflate);
            }
            i19 = com.p314xaae8f345.mm.R.C30867xcad56011.avm;
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kbw);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardViewUI", "initBaseUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/CardViewUI", "initBaseUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kby)).setText(i19);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public boolean Y6() {
        if (this.f176447w == 1) {
            return false;
        }
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13042x42c001);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void a7(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe) {
        if (this.f176447w == 1) {
            this.f176173p = c13038x357affe;
            k7(this.f176449y, 1, true);
            return;
        }
        super.a7(c13038x357affe);
        if (this.f176173p != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f176173p.s0().f470083i);
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe2 = this.f176173p;
            g0Var.d(11582, "OperGift", 4, valueOf, c13038x357affe2.f67737xf4648834, c13038x357affe2.f67736x95970a65, this.f176449y);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void b7(tt1.j jVar, int i17) {
        if (this.f176447w != 0) {
            super.b7(jVar, i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) jVar;
        xt1.t0.Di().f530829b = c13038x357affe;
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
        intent.putExtra("key_card_id", c13038x357affe.f67736x95970a65);
        intent.putExtra("key_from_scene", 51);
        intent.putExtra("key_from_appbrand_type", this.D);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardViewUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/card/ui/CardViewUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void c7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void d7(tt1.j jVar, int i17) {
        if (this.f176447w == 1) {
            a7((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) jVar);
        } else {
            super.d7(jVar, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardViewUI", "onCreate intent is null");
            finish();
            return;
        }
        this.C = intent.getIntExtra("key_previous_scene", 7);
        this.D = intent.getIntExtra("key_from_appbrand_type", 0);
        this.f176447w = intent.getIntExtra("view_type", 0);
        this.f176449y = intent.getStringExtra("user_name");
        this.B = intent.getStringExtra("key_app_id");
        java.lang.String stringExtra = intent.getStringExtra("card_list");
        this.A = getIntent().getStringExtra("key_template_id");
        if (this.f176447w == 0) {
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardViewUI", "oncreate card_list is empty");
                finish();
                return;
            }
            java.util.LinkedList a17 = lu1.x.a(stringExtra, this.C, this.B);
            if (a17 != null && a17.size() > 0) {
                java.util.LinkedList linkedList = this.f176448x;
                linkedList.clear();
                linkedList.addAll(a17);
            }
        }
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f354821b.q(1099, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof xt1.b0)) {
            super.mo815x76e0bfae(i17, i18, str, m1Var);
            return;
        }
        j7(false);
        if (i17 != 0 || i18 != 0) {
            lu1.r.d(this, str, i18);
            return;
        }
        java.util.LinkedList linkedList = ((xt1.b0) m1Var).f537985f;
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        android.widget.BaseAdapter baseAdapter = this.f176165e;
        if (baseAdapter instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s2 s2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s2) baseAdapter;
            java.util.ArrayList arrayList = (java.util.ArrayList) s2Var.f176688e;
            arrayList.clear();
            arrayList.addAll(linkedList);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) s2Var.f176689f;
            arrayList2.clear();
            for (int i19 = 0; i19 < linkedList.size(); i19++) {
                arrayList2.add(java.lang.Boolean.TRUE);
            }
        }
        this.f176165e.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        super.mo2295x59cfc822();
        if (this.C == 26) {
            overridePendingTransition(0, 0);
        }
    }
}
