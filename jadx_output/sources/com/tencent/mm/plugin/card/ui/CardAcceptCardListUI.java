package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class CardAcceptCardListUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, com.tencent.mm.ui.da {
    public static final /* synthetic */ int M = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f94726d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f94727e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f94728f;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f94732m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f94733n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f94734o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f94735p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f94736q;

    /* renamed from: t, reason: collision with root package name */
    public int f94739t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f94740u;

    /* renamed from: v, reason: collision with root package name */
    public int f94741v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f94742w;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f94729g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.b f94730h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f94731i = null;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f94737r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f94738s = "";

    /* renamed from: x, reason: collision with root package name */
    public int f94743x = 8;

    /* renamed from: y, reason: collision with root package name */
    public int f94744y = 7;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f94745z = "";
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
    public final java.util.LinkedList f94725J = new java.util.LinkedList();
    public final java.util.HashMap K = new java.util.HashMap();
    public java.lang.String L = "";

    public static java.util.LinkedList T6(com.tencent.mm.plugin.card.ui.CardAcceptCardListUI cardAcceptCardListUI) {
        cardAcceptCardListUI.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList2 = cardAcceptCardListUI.f94737r;
            if (i17 >= linkedList2.size()) {
                return linkedList;
            }
            linkedList.add((r45.hu) linkedList2.get(i17));
            i17++;
        }
    }

    public final void U6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI finishUI() result_code:" + i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("card_list", this.f94738s);
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
        if (android.text.TextUtils.isEmpty(this.f94742w)) {
            this.f94735p.setText(com.tencent.mm.R.string.av6);
        } else {
            this.f94735p.setText(this.f94742w);
        }
    }

    public void X6(boolean z17) {
        if (z17) {
            this.f94731i = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.ggc), false, 0, null);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f94731i;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f94731i.dismiss();
        this.f94731i = null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488272oq;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.ar7);
        setBackBtn(new com.tencent.mm.plugin.card.ui.c(this));
        this.f94726d = findViewById(com.tencent.mm.R.id.b7a);
        this.f94727e = findViewById(com.tencent.mm.R.id.ofx);
        this.f94728f = findViewById(com.tencent.mm.R.id.i3k);
        android.view.View view = this.f94727e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f94729g = (android.widget.ListView) findViewById(android.R.id.list);
        this.f94729g.setEmptyView((android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.cho));
        com.tencent.mm.plugin.card.ui.b bVar = new com.tencent.mm.plugin.card.ui.b(this);
        this.f94730h = bVar;
        this.f94729g.setAdapter((android.widget.ListAdapter) bVar);
        this.f94729g.setOnItemClickListener(new com.tencent.mm.plugin.card.ui.d(this));
        this.f94732m = findViewById(com.tencent.mm.R.id.b7e);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.b76);
        this.f94733n = button;
        button.setOnClickListener(new com.tencent.mm.plugin.card.ui.e(this));
        this.f94733n.setEnabled(false);
        this.f94734o = findViewById(com.tencent.mm.R.id.bbi);
        this.f94735p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.bbj);
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.bbh);
        this.f94736q = button2;
        button2.setOnClickListener(new com.tencent.mm.plugin.card.ui.f(this));
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () intent == null");
            U6(2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI handle data");
        java.lang.String stringExtra = intent.getStringExtra("key_in_card_list");
        this.f94743x = intent.getIntExtra("key_from_scene", 8);
        java.lang.String stringExtra2 = intent.getStringExtra("key_package_name");
        java.lang.String stringExtra3 = intent.getStringExtra("key_sign");
        this.f94744y = getIntent().getIntExtra("key_stastic_scene", 7);
        this.f94745z = getIntent().getStringExtra("src_username");
        this.A = getIntent().getStringExtra("js_url");
        this.B = getIntent().getStringExtra("key_consumed_card_id");
        this.L = getIntent().getStringExtra("key_template_id");
        java.util.ArrayList a17 = lu1.v.a(stringExtra, this.f94743x);
        if (a17 == null || a17.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () tempList == null || tempList.size() == 0");
            U6(2);
            return;
        }
        java.util.LinkedList linkedList = this.f94737r;
        linkedList.clear();
        linkedList.addAll(a17);
        this.I.clear();
        this.f94725J.clear();
        this.K.clear();
        X6(true);
        gm0.j1.n().f273288b.g(new xt1.i0(linkedList, this.f94743x, stringExtra2, stringExtra3, this.f94745z, this.A, this.B, this.f94744y));
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 2 && i18 == -1) {
            int intExtra = intent.getIntExtra("Ktag_range_index", 0);
            this.D = intExtra;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptCardListUI", "mPrivateSelelct : %d", java.lang.Integer.valueOf(intExtra));
            if (this.D < 2) {
                W6();
                return;
            }
            this.E = intent.getStringExtra("Klabel_name_list");
            this.F = intent.getStringExtra("Kother_user_name_list");
            if (android.text.TextUtils.isEmpty(this.E) && android.text.TextUtils.isEmpty(this.F)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardAcceptCardListUI", "mLabelNameList by getIntent is empty");
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
                com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptCardListUI", "mPrivateIdsList size is " + this.H.size());
            }
            if (this.G != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptCardListUI", "mPrivateNamesList size is " + this.G.size());
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
                this.f94735p.setText(getString(com.tencent.mm.R.string.av8, V6()));
            } else if (i19 == 3) {
                this.f94735p.setText(getString(com.tencent.mm.R.string.av7, V6()));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.n().f273288b.a(1079, this);
        gm0.j1.n().f273288b.a(1049, this);
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX, this);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f273288b.q(1079, this);
        gm0.j1.n().f273288b.q(1049, this);
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX, this);
        this.f94737r.clear();
        com.tencent.mm.plugin.card.ui.b bVar = this.f94730h;
        ((java.util.ArrayList) bVar.f94931d).clear();
        bVar.f94933f = null;
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI onKeyDown() back cancel");
            U6(1);
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardAcceptCardListUI", "CardAddEntranceUI onSceneEnd() netsene type" + m1Var.getType() + "errType = " + i17 + " errCode = " + i18);
            X6(false);
            lu1.r.d(this, str, i18);
            if (m1Var instanceof xt1.x) {
                this.f94738s = str;
                return;
            } else {
                if (m1Var instanceof fu1.e) {
                    this.f94738s = "";
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
                if (xVar.f456603g != 0) {
                    java.lang.String str2 = xVar.f456604h;
                    if (android.text.TextUtils.isEmpty(str2)) {
                        str2 = getString(com.tencent.mm.R.string.arl);
                    }
                    db5.e1.G(this, str2, null, false, new com.tencent.mm.plugin.card.ui.g(this));
                    this.f94738s = xVar.f456602f;
                    return;
                }
                db5.e1.T(this, getResources().getString(com.tencent.mm.R.string.aso));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("card_list", xVar.f456602f);
                setResult(-1, intent);
                com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for card");
                lu1.a0.J();
                finish();
                return;
            }
            if (m1Var instanceof fu1.e) {
                X6(false);
                fu1.e eVar = (fu1.e) m1Var;
                java.lang.String str3 = eVar.f266835f;
                int i19 = eVar.f266836g;
                java.lang.String str4 = eVar.f266837h;
                this.f94738s = str3;
                if (i19 != 0) {
                    if (android.text.TextUtils.isEmpty(str4)) {
                        str4 = getString(com.tencent.mm.R.string.avg);
                    }
                    db5.e1.G(this, str4, null, false, new com.tencent.mm.plugin.card.ui.h(this));
                    return;
                }
                db5.e1.T(this, getResources().getString(com.tencent.mm.R.string.arc));
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("card_list", this.f94738s);
                setResult(-1, intent2);
                com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for sharecard");
                lu1.a0.K();
                com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo shareCardInfo = new com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo();
                lu1.t.q(shareCardInfo, str3);
                lu1.a0.E(shareCardInfo);
                xt1.t0.mj().b();
                finish();
                return;
            }
            return;
        }
        X6(false);
        xt1.i0 i0Var = (xt1.i0) m1Var;
        java.lang.String str5 = i0Var.f456495f;
        this.f94739t = i0Var.f456496g;
        this.f94740u = i0Var.f456497h;
        this.f94741v = i0Var.f456498i;
        this.f94742w = i0Var.f456499m;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptCardListUI", "accept_button_status: " + this.f94739t + "  accept_button_wording: " + this.f94740u);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptCardListUI", "private_status: " + this.f94741v + "  private_wording: " + this.f94742w);
        java.util.ArrayList c17 = lu1.t.c(str5);
        java.util.HashMap hashMap = this.K;
        if (c17 == null || c17.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardAcceptCardListUI", "geCardInfoListByTpId list is empty!");
        } else {
            this.I.clear();
            java.util.LinkedList linkedList = this.f94725J;
            linkedList.clear();
            hashMap.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i27 = 0; i27 < c17.size(); i27++) {
                com.tencent.mm.plugin.card.model.CardInfo cardInfo = (com.tencent.mm.plugin.card.model.CardInfo) c17.get(i27);
                if (linkedList.contains(cardInfo.field_card_tp_id)) {
                    hashMap.put(cardInfo.field_card_tp_id, java.lang.Integer.valueOf(((java.lang.Integer) hashMap.get(cardInfo.field_card_tp_id)).intValue() + 1));
                } else {
                    arrayList2.add(cardInfo);
                    hashMap.put(cardInfo.field_card_tp_id, 1);
                    linkedList.add(cardInfo.field_card_tp_id);
                }
            }
            arrayList = arrayList2;
        }
        if (c17 == null || c17.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardAcceptCardListUI", "The card info list size is 0!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptCardListUI", "The card info list size is " + c17.size());
            if (arrayList != null && arrayList.size() > 0) {
                com.tencent.mm.plugin.card.ui.b bVar = this.f94730h;
                java.util.ArrayList arrayList3 = (java.util.ArrayList) bVar.f94931d;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                bVar.f94932e.putAll(hashMap);
            }
            this.f94730h.notifyDataSetChanged();
            if (((com.tencent.mm.plugin.card.model.CardInfo) c17.get(0)).i()) {
                this.C = true;
            }
        }
        android.view.View view = this.f94727e;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f94730h.getCount() <= 0) {
            android.view.View view2 = this.f94732m;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f94734o;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f94726d.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478780h0));
            return;
        }
        com.tencent.mm.plugin.card.model.CardInfo cardInfo2 = (com.tencent.mm.plugin.card.model.CardInfo) ((java.util.ArrayList) this.f94730h.f94931d).get(0);
        setActionbarColor(lu1.a0.d(cardInfo2.s0().f388555p));
        this.f94726d.setBackgroundColor(lu1.a0.d(cardInfo2.s0().f388555p));
        android.view.View view4 = this.f94732m;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480190qw);
        if (this.f94739t == 1) {
            this.f94733n.setEnabled(true);
            android.graphics.drawable.ShapeDrawable n17 = lu1.a0.n(this, lu1.a0.d(cardInfo2.s0().f388555p), dimensionPixelOffset);
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, lu1.a0.n(this, lu1.a0.e(cardInfo2.s0().f388555p, 175), dimensionPixelOffset));
            stateListDrawable.addState(new int[0], n17);
        } else {
            this.f94733n.setEnabled(false);
            stateListDrawable.addState(new int[0], lu1.a0.n(this, lu1.a0.e(cardInfo2.s0().f388555p, 175), dimensionPixelOffset));
        }
        this.f94733n.setBackgroundDrawable(stateListDrawable);
        if (!android.text.TextUtils.isEmpty(this.f94740u)) {
            this.f94733n.setText(this.f94740u);
        }
        if (this.f94741v != 1) {
            android.view.View view5 = this.f94734o;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view5, arrayList8.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f94727e.getLayoutParams();
            layoutParams.topMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479924j3);
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479870hj);
            this.f94727e.setLayoutParams(layoutParams);
            this.f94727e.invalidate();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f94732m.getLayoutParams();
            layoutParams2.addRule(8, com.tencent.mm.R.id.i3k);
            this.f94732m.setLayoutParams(layoutParams2);
            this.f94732m.invalidate();
            return;
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.i_);
        android.graphics.drawable.ShapeDrawable l17 = lu1.a0.l(this, getResources().getColor(com.tencent.mm.R.color.aaw), dimensionPixelOffset2);
        android.graphics.drawable.ShapeDrawable n18 = lu1.a0.n(this, getResources().getColor(com.tencent.mm.R.color.aaw), dimensionPixelOffset2);
        android.graphics.drawable.StateListDrawable stateListDrawable2 = new android.graphics.drawable.StateListDrawable();
        stateListDrawable2.addState(new int[]{android.R.attr.state_pressed}, n18);
        stateListDrawable2.addState(new int[0], l17);
        this.f94736q.setBackgroundDrawable(stateListDrawable2);
        this.f94736q.setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, new int[0]}, new int[]{lu1.a0.d(cardInfo2.s0().f388555p), getResources().getColor(com.tencent.mm.R.color.aaw)}));
        android.view.View view6 = this.f94734o;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view6, arrayList9.toArray(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (android.text.TextUtils.isEmpty(this.f94742w)) {
            this.f94735p.setText(com.tencent.mm.R.string.av6);
        } else {
            this.f94735p.setText(this.f94742w);
        }
    }
}
