package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui;

/* renamed from: com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI */
/* loaded from: classes15.dex */
public class ActivityC13041xc416088b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int F = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f176233d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f176234e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f176235f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f176236g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f176237h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f176238i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f176239m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f176240n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.CheckBox f176241o;

    /* renamed from: p, reason: collision with root package name */
    public fu1.g f176242p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f176243q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f176244r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f176245s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f176246t = "";

    /* renamed from: u, reason: collision with root package name */
    public int f176247u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f176248v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f176249w = 0;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f176250x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f176251y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.util.ArrayList f176252z = new java.util.ArrayList();
    public java.util.ArrayList A = new java.util.ArrayList();
    public long B = 0;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 C = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 D = null;
    public final android.view.View.OnClickListener E = new gu1.h(this);

    public final java.lang.String T6() {
        if (android.text.TextUtils.isEmpty(this.f176250x) || android.text.TextUtils.isEmpty(this.f176251y)) {
            return !android.text.TextUtils.isEmpty(this.f176250x) ? this.f176250x : !android.text.TextUtils.isEmpty(this.f176251y) ? lu1.a0.j(this.f176251y) : "";
        }
        return this.f176250x + "," + lu1.a0.j(this.f176251y);
    }

    public final boolean U6(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the consumed json is empty!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()");
        fu1.g gVar = null;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser json is empty");
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                fu1.g gVar2 = new fu1.g();
                gVar2.f348374b = jSONObject.optString("consumed_box_id");
                gVar2.f348375c = jSONObject.optString("subscribe_wording");
                gVar2.f348376d = jSONObject.optString("subscribe_app_username");
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("list");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                        fu1.o oVar = new fu1.o();
                        oVar.f348398b = optJSONObject.optString("card_ext");
                        oVar.f348397a = lu1.t.k(optJSONObject.optJSONObject("card_tp_info"));
                        arrayList.add(oVar);
                    }
                    gVar2.f348373a = arrayList;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser() tempList size is" + arrayList.size());
                    if (android.text.TextUtils.isEmpty(gVar2.f348374b)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()  consumed_box_id is empty");
                    }
                    if (android.text.TextUtils.isEmpty(gVar2.f348375c)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()  subscribe_wording is empty");
                    }
                    gVar = gVar2;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser cardItemListJson is null");
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser exception:" + e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShareCardConsumedInfoParser", e17, "", new java.lang.Object[0]);
            }
        }
        this.f176242p = gVar;
        if (gVar != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the mConsumedInfo is null! json is " + str);
        return false;
    }

    public final void V6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeSuccessUI", "pushConsumedEvent resultCode is " + i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5284x55c86fcf c5284x55c86fcf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5284x55c86fcf();
        c5284x55c86fcf.f135607g.f88851a = i17;
        c5284x55c86fcf.e();
    }

    public final void W6() {
        m78513xc2a54588().setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560313h0));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m7i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI", "resetBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI", "resetBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void X6(boolean z17) {
        if (z17) {
            this.D = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, 0, null);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.D;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.D.dismiss();
        this.D = null;
    }

    public final void Y6(java.lang.String str) {
        int d17 = lu1.a0.d(str);
        this.f176233d.setBackgroundColor(d17);
        mo64405x4dab7448(d17);
        if (fp.h.c(16)) {
            this.f176240n.setBackground(lu1.a0.n(this, d17, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.q_) / 2));
        } else {
            this.f176240n.setBackgroundDrawable(lu1.a0.n(this, d17, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.q_) / 2));
        }
        this.f176233d.invalidate();
    }

    public final void Z6() {
        if (this.f176242p == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "don't updateView() , mConsumedInfo is null");
            return;
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m7i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (android.text.TextUtils.isEmpty(this.f176242p.f348375c) || android.text.TextUtils.isEmpty(this.f176242p.f348376d)) {
            this.f176241o.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.subscribe_wording is empty or subscribe_app_username is empty!");
        } else {
            this.f176241o.setText(this.f176242p.f348375c);
            this.f176241o.setVisibility(0);
        }
        java.util.ArrayList arrayList2 = this.f176242p.f348373a;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            this.f176240n.setEnabled(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.list is null!");
            return;
        }
        this.f176236g.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572317as0, java.lang.Integer.valueOf(this.f176242p.f348373a.size())));
        r45.vu vuVar = ((fu1.o) this.f176242p.f348373a.get(0)).f348397a;
        if (vuVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo is null!");
            return;
        }
        Y6(vuVar.f470088p);
        this.f176234e.setText(vuVar.f470085m);
        this.f176235f.setText(vuVar.f470086n);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561718qr);
        if (android.text.TextUtils.isEmpty(vuVar.f470079e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo.logo_url is empty!");
            this.f176239m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cbt);
        } else {
            o11.f fVar = new o11.f();
            fVar.f423616g = lp0.b.D();
            fVar.f423615f = xt1.q.m(vuVar.f470079e);
            fVar.f423611b = true;
            fVar.f423629t = true;
            fVar.f423610a = true;
            fVar.f423620k = dimensionPixelSize;
            fVar.f423619j = dimensionPixelSize;
            fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.cbt;
            n11.a.b().h(vuVar.f470079e, this.f176239m, fVar.a());
        }
        if (android.text.TextUtils.isEmpty(vuVar.D)) {
            this.f176240n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.arx);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "accept_wording is empty!");
            this.f176240n.setText(vuVar.D);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569821p6;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new gu1.g(this));
        this.f176233d = m78513xc2a54588();
        this.f176234e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.b8b);
        this.f176235f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565110bb0);
        this.f176236g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nru);
        this.f176237h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nrt);
        this.f176238i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nrs);
        this.f176239m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.b_w);
        this.f176240n = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f563868bp);
        this.f176241o = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.a6i);
        android.widget.Button button = this.f176240n;
        android.view.View.OnClickListener onClickListener = this.E;
        button.setOnClickListener(onClickListener);
        this.f176241o.setOnClickListener(onClickListener);
        this.f176237h.setOnClickListener(onClickListener);
        if (this.f176242p != null) {
            Z6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            int intExtra = intent.getIntExtra("Ktag_range_index", 0);
            this.f176249w = intExtra;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeSuccessUI", "mPrivateSelelct : %d", java.lang.Integer.valueOf(intExtra));
            if (this.f176249w < 2) {
                this.f176238i.setVisibility(8);
                return;
            }
            this.f176250x = intent.getStringExtra("Klabel_name_list");
            this.f176251y = intent.getStringExtra("Kother_user_name_list");
            if (android.text.TextUtils.isEmpty(this.f176250x) && android.text.TextUtils.isEmpty(this.f176251y)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "mLabelNameList and mPrivateTmpUsers by getIntent is empty");
                return;
            }
            java.util.List asList = java.util.Arrays.asList(this.f176250x.split(","));
            this.A = lu1.a0.h(asList);
            this.f176252z = lu1.a0.i(asList);
            java.lang.String str = this.f176251y;
            if (str != null && str.length() > 0) {
                this.f176252z.addAll(java.util.Arrays.asList(this.f176251y.split(",")));
            }
            if (this.A != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeSuccessUI", "mPrivateIdsList size is " + this.A.size());
            }
            if (this.f176252z != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeSuccessUI", "mPrivateNamesList size is " + this.f176252z.size());
                java.util.Iterator it = this.f176252z.iterator();
                while (it.hasNext()) {
                }
            }
            int i19 = this.f176249w;
            if (i19 == 2) {
                this.f176238i.setVisibility(0);
                this.f176238i.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.av8, T6()));
            } else if (i19 != 3) {
                this.f176238i.setVisibility(8);
            } else {
                this.f176238i.setVisibility(0);
                this.f176238i.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.av7, T6()));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.vu vuVar;
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeSuccessUI", "onCreate()");
        this.B = java.lang.System.currentTimeMillis();
        java.lang.String str = "";
        mo54450xbf7c1df6("");
        setResult(0);
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.f34420x366c91de, this);
        gm0.j1.n().f354821b.a(oc1.e.f73030x366c91de, this);
        int intExtra = getIntent().getIntExtra("key_from_scene", 0);
        this.f176247u = intExtra;
        if (intExtra == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_JS");
            this.f176244r = getIntent().getStringExtra("key_consumed_card_id");
            this.f176246t = getIntent().getStringExtra("key_consumed_Code");
            if (android.text.TextUtils.isEmpty(this.f176244r)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "the mConsumdeCardId is empty!");
                V6(0);
                finish();
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeSuccessUI", "the mConsumdeCode is " + this.f176246t);
                X6(true);
                gm0.j1.n().f354821b.g(new fu1.c("", 20, this.f176244r, this.f176246t));
                W6();
                this.f176248v = 7;
            }
        } else if (intExtra == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_MSG_UI");
            java.lang.String stringExtra = getIntent().getStringExtra("key_card_id");
            this.f176243q = stringExtra;
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "the mCardId is empty!");
                V6(0);
                finish();
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeSuccessUI", "the mCardId is " + this.f176243q);
                X6(true);
                gm0.j1.n().f354821b.g(new fu1.c(this.f176243q, 20, "", ""));
                W6();
                this.f176248v = 4;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_CONSUMED_CODE");
            this.f176243q = getIntent().getStringExtra("KEY_CARD_ID");
            if (!U6(getIntent().getStringExtra("KEY_CARD_CONSUMED_JSON"))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "the mCardId is empty!");
                V6(0);
                finish();
                return;
            }
            fu1.g gVar = this.f176242p;
            if (gVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(gVar.f348373a) && (vuVar = ((fu1.o) this.f176242p.f348373a.get(0)).f348397a) != null) {
                str = vuVar.f470088p;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = getIntent().getStringExtra("KEY_CARD_COLOR");
            }
            this.f176248v = getIntent().getIntExtra("key_stastic_scene", 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardConsumeSuccessUI", 0, "", "", 0, java.lang.Integer.valueOf(this.f176248v), "", 0, "");
        mo43517x10010bd5();
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        Y6(str);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.f34420x366c91de, this);
        gm0.j1.n().f354821b.q(oc1.e.f73030x366c91de, this);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.B;
        if (android.text.TextUtils.isEmpty(this.f176243q)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13219, "CardConsumeSuccessUI", java.lang.Integer.valueOf(this.f176247u), this.f176245s, this.f176244r, java.lang.Long.valueOf(currentTimeMillis));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13219, "CardConsumeSuccessUI", java.lang.Integer.valueOf(this.f176247u), this.f176245s, this.f176243q, java.lang.Long.valueOf(currentTimeMillis));
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "onKeyDown finishUI");
            V6(0);
            finish();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeSuccessUI", "onSceneEnd, errType = " + i17 + " errCode = " + i18 + " scene cmd is " + m1Var.mo808xfb85f7b0());
        X6(false);
        if (i17 != 0 || i18 != 0) {
            if (!(m1Var instanceof fu1.c) || this.f176247u != 1) {
                lu1.r.c(this, str);
                return;
            } else {
                V6(0);
                finish();
                return;
            }
        }
        if (m1Var instanceof fu1.e) {
            fu1.e eVar = (fu1.e) m1Var;
            if (eVar.f348369g != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "shareNetscene.getRetCode() is " + eVar.f348369g);
                lu1.r.c(this, eVar.f348370h);
                db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ar9));
                return;
            }
            db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.arc));
            setResult(-1);
            this.f176240n.setEnabled(false);
            lu1.a0.K();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeSuccessUI", "finish UI!");
            V6(-1);
            java.lang.String str2 = eVar.f348368f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd c13039x2a59e0bd = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd();
            lu1.t.q(c13039x2a59e0bd, str2);
            lu1.a0.E(c13039x2a59e0bd);
            xt1.t0.mj().b();
            finish();
            return;
        }
        if (m1Var instanceof fu1.c) {
            fu1.c cVar = (fu1.c) m1Var;
            if (!android.text.TextUtils.isEmpty(cVar.f348356f) && U6(cVar.f348356f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeSuccessUI", "consumed return json is valid, update ui");
                this.C.mo50293x3498a0(new gu1.i(this));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "consumed return json is empty, finish ui!");
            if (this.f176247u == 1) {
                V6(0);
                finish();
                return;
            }
            W6();
            java.lang.String str3 = cVar.f348357g;
            if (android.text.TextUtils.isEmpty(str3)) {
                str3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ara);
            }
            db5.e1.G(this, str3, "", false, new gu1.j(this));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f348357g)) {
                db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ara));
            } else {
                db5.e1.T(this, cVar.f348357g);
            }
        }
    }
}
