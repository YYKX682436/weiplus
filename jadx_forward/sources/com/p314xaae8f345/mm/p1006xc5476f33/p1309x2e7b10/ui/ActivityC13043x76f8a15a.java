package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* renamed from: com.tencent.mm.plugin.card.ui.CardAcceptCardListUI */
/* loaded from: classes15.dex */
public class ActivityC13043x76f8a15a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.ui.da {
    public static final /* synthetic */ int M = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f176259d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f176260e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f176261f;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f176265m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f176266n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f176267o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f176268p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f176269q;

    /* renamed from: t, reason: collision with root package name */
    public int f176272t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f176273u;

    /* renamed from: v, reason: collision with root package name */
    public int f176274v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f176275w;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f176262g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b f176263h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f176264i = null;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f176270r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f176271s = "";

    /* renamed from: x, reason: collision with root package name */
    public int f176276x = 8;

    /* renamed from: y, reason: collision with root package name */
    public int f176277y = 7;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f176278z = "";
    public java.lang.String A = "";
    public java.lang.String B = "";
    public boolean C = false;
    public int D = 0;
    public java.lang.String E = "";
    public java.lang.String F = "";
    public java.util.ArrayList G = new java.util.ArrayList();
    public java.util.ArrayList H = new java.util.ArrayList();
    public final java.util.LinkedList I = new java.util.LinkedList();

    /* renamed from: J, reason: collision with root package name */
    public final java.util.LinkedList f176258J = new java.util.LinkedList();
    public final java.util.HashMap K = new java.util.HashMap();
    public java.lang.String L = "";

    public static java.util.LinkedList T6(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13043x76f8a15a activityC13043x76f8a15a) {
        activityC13043x76f8a15a.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList2 = activityC13043x76f8a15a.f176270r;
            if (i17 >= linkedList2.size()) {
                return linkedList;
            }
            linkedList.add((r45.hu) linkedList2.get(i17));
            i17++;
        }
    }

    public final void U6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI finishUI() result_code:" + i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("card_list", this.f176271s);
        intent.putExtra("result_code", i17);
        setResult(0, intent);
        finish();
    }

    public final java.lang.String V6() {
        if (android.text.TextUtils.isEmpty(this.E) || android.text.TextUtils.isEmpty(this.F)) {
            return !android.text.TextUtils.isEmpty(this.E) ? this.E : !android.text.TextUtils.isEmpty(this.F) ? lu1.a0.j(this.F) : "";
        }
        return this.E + "," + lu1.a0.j(this.F);
    }

    public final void W6() {
        if (android.text.TextUtils.isEmpty(this.f176275w)) {
            this.f176268p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.av6);
        } else {
            this.f176268p.setText(this.f176275w);
        }
    }

    public void X6(boolean z17) {
        if (z17) {
            this.f176264i = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), false, 0, null);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f176264i;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f176264i.dismiss();
        this.f176264i = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569805oq;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ar7);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.c(this));
        this.f176259d = findViewById(com.p314xaae8f345.mm.R.id.b7a);
        this.f176260e = findViewById(com.p314xaae8f345.mm.R.id.ofx);
        this.f176261f = findViewById(com.p314xaae8f345.mm.R.id.i3k);
        android.view.View view = this.f176260e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f176262g = (android.widget.ListView) findViewById(android.R.id.list);
        this.f176262g.setEmptyView((android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.cho));
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b(this);
        this.f176263h = bVar;
        this.f176262g.setAdapter((android.widget.ListAdapter) bVar);
        this.f176262g.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.d(this));
        this.f176265m = findViewById(com.p314xaae8f345.mm.R.id.b7e);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.b76);
        this.f176266n = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e(this));
        this.f176266n.setEnabled(false);
        this.f176267o = findViewById(com.p314xaae8f345.mm.R.id.bbi);
        this.f176268p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.bbj);
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.bbh);
        this.f176269q = button2;
        button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.f(this));
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () intent == null");
            U6(2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI handle data");
        java.lang.String stringExtra = intent.getStringExtra("key_in_card_list");
        this.f176276x = intent.getIntExtra("key_from_scene", 8);
        java.lang.String stringExtra2 = intent.getStringExtra("key_package_name");
        java.lang.String stringExtra3 = intent.getStringExtra("key_sign");
        this.f176277y = getIntent().getIntExtra("key_stastic_scene", 7);
        this.f176278z = getIntent().getStringExtra("src_username");
        this.A = getIntent().getStringExtra("js_url");
        this.B = getIntent().getStringExtra("key_consumed_card_id");
        this.L = getIntent().getStringExtra("key_template_id");
        java.util.ArrayList a17 = lu1.v.a(stringExtra, this.f176276x);
        if (a17 == null || a17.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () tempList == null || tempList.size() == 0");
            U6(2);
            return;
        }
        java.util.LinkedList linkedList = this.f176270r;
        linkedList.clear();
        linkedList.addAll(a17);
        this.I.clear();
        this.f176258J.clear();
        this.K.clear();
        X6(true);
        gm0.j1.n().f354821b.g(new xt1.i0(linkedList, this.f176276x, stringExtra2, stringExtra3, this.f176278z, this.A, this.B, this.f176277y));
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == 2 && i18 == -1) {
            int intExtra = intent.getIntExtra("Ktag_range_index", 0);
            this.D = intExtra;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptCardListUI", "mPrivateSelelct : %d", java.lang.Integer.valueOf(intExtra));
            if (this.D < 2) {
                W6();
                return;
            }
            this.E = intent.getStringExtra("Klabel_name_list");
            this.F = intent.getStringExtra("Kother_user_name_list");
            if (android.text.TextUtils.isEmpty(this.E) && android.text.TextUtils.isEmpty(this.F)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAcceptCardListUI", "mLabelNameList by getIntent is empty");
                W6();
                return;
            }
            java.util.List asList = java.util.Arrays.asList(this.E.split(","));
            this.H = lu1.a0.h(asList);
            this.G = lu1.a0.i(asList);
            java.lang.String str = this.F;
            if (str != null && str.length() > 0) {
                this.G.addAll(java.util.Arrays.asList(this.F.split(",")));
            }
            if (this.H != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptCardListUI", "mPrivateIdsList size is " + this.H.size());
            }
            if (this.G != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptCardListUI", "mPrivateNamesList size is " + this.G.size());
                java.util.Iterator it = this.G.iterator();
                while (it.hasNext()) {
                }
            }
            if (android.text.TextUtils.isEmpty(this.E)) {
                W6();
                return;
            }
            int i19 = this.D;
            if (i19 == 2) {
                this.f176268p.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.av8, V6()));
            } else if (i19 == 3) {
                this.f176268p.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.av7, V6()));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.n().f354821b.a(1079, this);
        gm0.j1.n().f354821b.a(1049, this);
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.f34420x366c91de, this);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f354821b.q(1079, this);
        gm0.j1.n().f354821b.q(1049, this);
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.f34420x366c91de, this);
        this.f176270r.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b bVar = this.f176263h;
        ((java.util.ArrayList) bVar.f176464d).clear();
        bVar.f176466f = null;
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI onKeyDown() back cancel");
            U6(1);
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAcceptCardListUI", "CardAddEntranceUI onSceneEnd() netsene type" + m1Var.mo808xfb85f7b0() + "errType = " + i17 + " errCode = " + i18);
            X6(false);
            lu1.r.d(this, str, i18);
            if (m1Var instanceof xt1.x) {
                this.f176271s = str;
                return;
            } else {
                if (m1Var instanceof fu1.e) {
                    this.f176271s = "";
                    return;
                }
                return;
            }
        }
        java.util.ArrayList arrayList = null;
        if (!(m1Var instanceof xt1.i0)) {
            if (m1Var instanceof xt1.x) {
                X6(false);
                xt1.x xVar = (xt1.x) m1Var;
                if (xVar.f538136g != 0) {
                    java.lang.String str2 = xVar.f538137h;
                    if (android.text.TextUtils.isEmpty(str2)) {
                        str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.arl);
                    }
                    db5.e1.G(this, str2, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.g(this));
                    this.f176271s = xVar.f538135f;
                    return;
                }
                db5.e1.T(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aso));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("card_list", xVar.f538135f);
                setResult(-1, intent);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for card");
                lu1.a0.J();
                finish();
                return;
            }
            if (m1Var instanceof fu1.e) {
                X6(false);
                fu1.e eVar = (fu1.e) m1Var;
                java.lang.String str3 = eVar.f348368f;
                int i19 = eVar.f348369g;
                java.lang.String str4 = eVar.f348370h;
                this.f176271s = str3;
                if (i19 != 0) {
                    if (android.text.TextUtils.isEmpty(str4)) {
                        str4 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.avg);
                    }
                    db5.e1.G(this, str4, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.h(this));
                    return;
                }
                db5.e1.T(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.arc));
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("card_list", this.f176271s);
                setResult(-1, intent2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for sharecard");
                lu1.a0.K();
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd c13039x2a59e0bd = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd();
                lu1.t.q(c13039x2a59e0bd, str3);
                lu1.a0.E(c13039x2a59e0bd);
                xt1.t0.mj().b();
                finish();
                return;
            }
            return;
        }
        X6(false);
        xt1.i0 i0Var = (xt1.i0) m1Var;
        java.lang.String str5 = i0Var.f538028f;
        this.f176272t = i0Var.f538029g;
        this.f176273u = i0Var.f538030h;
        this.f176274v = i0Var.f538031i;
        this.f176275w = i0Var.f538032m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptCardListUI", "accept_button_status: " + this.f176272t + "  accept_button_wording: " + this.f176273u);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptCardListUI", "private_status: " + this.f176274v + "  private_wording: " + this.f176275w);
        java.util.ArrayList c17 = lu1.t.c(str5);
        java.util.HashMap hashMap = this.K;
        if (c17 == null || c17.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAcceptCardListUI", "geCardInfoListByTpId list is empty!");
        } else {
            this.I.clear();
            java.util.LinkedList linkedList = this.f176258J;
            linkedList.clear();
            hashMap.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i27 = 0; i27 < c17.size(); i27++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) c17.get(i27);
                if (linkedList.contains(c13038x357affe.f67737xf4648834)) {
                    hashMap.put(c13038x357affe.f67737xf4648834, java.lang.Integer.valueOf(((java.lang.Integer) hashMap.get(c13038x357affe.f67737xf4648834)).intValue() + 1));
                } else {
                    arrayList2.add(c13038x357affe);
                    hashMap.put(c13038x357affe.f67737xf4648834, 1);
                    linkedList.add(c13038x357affe.f67737xf4648834);
                }
            }
            arrayList = arrayList2;
        }
        if (c17 == null || c17.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAcceptCardListUI", "The card info list size is 0!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAcceptCardListUI", "The card info list size is " + c17.size());
            if (arrayList != null && arrayList.size() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b bVar = this.f176263h;
                java.util.ArrayList arrayList3 = (java.util.ArrayList) bVar.f176464d;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                bVar.f176465e.putAll(hashMap);
            }
            this.f176263h.notifyDataSetChanged();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) c17.get(0)).i()) {
                this.C = true;
            }
        }
        android.view.View view = this.f176260e;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f176263h.getCount() <= 0) {
            android.view.View view2 = this.f176265m;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f176267o;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f176259d.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560313h0));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) ((java.util.ArrayList) this.f176263h.f176464d).get(0);
        mo64405x4dab7448(lu1.a0.d(c13038x357affe2.s0().f470088p));
        this.f176259d.setBackgroundColor(lu1.a0.d(c13038x357affe2.s0().f470088p));
        android.view.View view4 = this.f176265m;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561723qw);
        if (this.f176272t == 1) {
            this.f176266n.setEnabled(true);
            android.graphics.drawable.ShapeDrawable n17 = lu1.a0.n(this, lu1.a0.d(c13038x357affe2.s0().f470088p), dimensionPixelOffset);
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, lu1.a0.n(this, lu1.a0.e(c13038x357affe2.s0().f470088p, 175), dimensionPixelOffset));
            stateListDrawable.addState(new int[0], n17);
        } else {
            this.f176266n.setEnabled(false);
            stateListDrawable.addState(new int[0], lu1.a0.n(this, lu1.a0.e(c13038x357affe2.s0().f470088p, 175), dimensionPixelOffset));
        }
        this.f176266n.setBackgroundDrawable(stateListDrawable);
        if (!android.text.TextUtils.isEmpty(this.f176273u)) {
            this.f176266n.setText(this.f176273u);
        }
        if (this.f176274v != 1) {
            android.view.View view5 = this.f176267o;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view5, arrayList8.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f176260e.getLayoutParams();
            layoutParams.topMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3);
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561403hj);
            this.f176260e.setLayoutParams(layoutParams);
            this.f176260e.invalidate();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f176265m.getLayoutParams();
            layoutParams2.addRule(8, com.p314xaae8f345.mm.R.id.i3k);
            this.f176265m.setLayoutParams(layoutParams2);
            this.f176265m.invalidate();
            return;
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
        android.graphics.drawable.ShapeDrawable l17 = lu1.a0.l(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), dimensionPixelOffset2);
        android.graphics.drawable.ShapeDrawable n18 = lu1.a0.n(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), dimensionPixelOffset2);
        android.graphics.drawable.StateListDrawable stateListDrawable2 = new android.graphics.drawable.StateListDrawable();
        stateListDrawable2.addState(new int[]{android.R.attr.state_pressed}, n18);
        stateListDrawable2.addState(new int[0], l17);
        this.f176269q.setBackgroundDrawable(stateListDrawable2);
        this.f176269q.setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, new int[0]}, new int[]{lu1.a0.d(c13038x357affe2.s0().f470088p), getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw)}));
        android.view.View view6 = this.f176267o;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view6, arrayList9.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (android.text.TextUtils.isEmpty(this.f176275w)) {
            this.f176268p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.av6);
        } else {
            this.f176268p.setText(this.f176275w);
        }
    }
}
