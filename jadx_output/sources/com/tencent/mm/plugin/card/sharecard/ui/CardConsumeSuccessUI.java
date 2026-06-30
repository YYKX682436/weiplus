package com.tencent.mm.plugin.card.sharecard.ui;

/* loaded from: classes15.dex */
public class CardConsumeSuccessUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int F = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f94700d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f94701e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f94702f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f94703g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f94704h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f94705i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f94706m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f94707n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.CheckBox f94708o;

    /* renamed from: p, reason: collision with root package name */
    public fu1.g f94709p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f94710q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f94711r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f94712s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f94713t = "";

    /* renamed from: u, reason: collision with root package name */
    public int f94714u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f94715v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f94716w = 0;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f94717x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f94718y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.util.ArrayList f94719z = new java.util.ArrayList();
    public java.util.ArrayList A = new java.util.ArrayList();
    public long B = 0;
    public final com.tencent.mm.sdk.platformtools.n3 C = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    public com.tencent.mm.ui.widget.dialog.u3 D = null;
    public final android.view.View.OnClickListener E = new gu1.h(this);

    public final java.lang.String T6() {
        if (android.text.TextUtils.isEmpty(this.f94717x) || android.text.TextUtils.isEmpty(this.f94718y)) {
            return !android.text.TextUtils.isEmpty(this.f94717x) ? this.f94717x : !android.text.TextUtils.isEmpty(this.f94718y) ? lu1.a0.j(this.f94718y) : "";
        }
        return this.f94717x + "," + lu1.a0.j(this.f94718y);
    }

    public final boolean U6(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the consumed json is empty!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()");
        fu1.g gVar = null;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser json is empty");
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                fu1.g gVar2 = new fu1.g();
                gVar2.f266841b = jSONObject.optString("consumed_box_id");
                gVar2.f266842c = jSONObject.optString("subscribe_wording");
                gVar2.f266843d = jSONObject.optString("subscribe_app_username");
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("list");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                        fu1.o oVar = new fu1.o();
                        oVar.f266865b = optJSONObject.optString("card_ext");
                        oVar.f266864a = lu1.t.k(optJSONObject.optJSONObject("card_tp_info"));
                        arrayList.add(oVar);
                    }
                    gVar2.f266840a = arrayList;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser() tempList size is" + arrayList.size());
                    if (android.text.TextUtils.isEmpty(gVar2.f266841b)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()  consumed_box_id is empty");
                    }
                    if (android.text.TextUtils.isEmpty(gVar2.f266842c)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()  subscribe_wording is empty");
                    }
                    gVar = gVar2;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser cardItemListJson is null");
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser exception:" + e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareCardConsumedInfoParser", e17, "", new java.lang.Object[0]);
            }
        }
        this.f94709p = gVar;
        if (gVar != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the mConsumedInfo is null! json is " + str);
        return false;
    }

    public final void V6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeSuccessUI", "pushConsumedEvent resultCode is " + i17);
        com.tencent.mm.autogen.events.ConsumedCouponCardCodeEvent consumedCouponCardCodeEvent = new com.tencent.mm.autogen.events.ConsumedCouponCardCodeEvent();
        consumedCouponCardCodeEvent.f54074g.f7318a = i17;
        consumedCouponCardCodeEvent.e();
    }

    public final void W6() {
        getContentView().setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478780h0));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m7i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI", "resetBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI", "resetBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void X6(boolean z17) {
        if (z17) {
            this.D = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.ggc), true, 0, null);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.D;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.D.dismiss();
        this.D = null;
    }

    public final void Y6(java.lang.String str) {
        int d17 = lu1.a0.d(str);
        this.f94700d.setBackgroundColor(d17);
        setActionbarColor(d17);
        if (fp.h.c(16)) {
            this.f94707n.setBackground(lu1.a0.n(this, d17, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.q_) / 2));
        } else {
            this.f94707n.setBackgroundDrawable(lu1.a0.n(this, d17, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.q_) / 2));
        }
        this.f94700d.invalidate();
    }

    public final void Z6() {
        if (this.f94709p == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "don't updateView() , mConsumedInfo is null");
            return;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m7i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (android.text.TextUtils.isEmpty(this.f94709p.f266842c) || android.text.TextUtils.isEmpty(this.f94709p.f266843d)) {
            this.f94708o.setVisibility(8);
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.subscribe_wording is empty or subscribe_app_username is empty!");
        } else {
            this.f94708o.setText(this.f94709p.f266842c);
            this.f94708o.setVisibility(0);
        }
        java.util.ArrayList arrayList2 = this.f94709p.f266840a;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            this.f94707n.setEnabled(false);
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.list is null!");
            return;
        }
        this.f94703g.setText(getString(com.tencent.mm.R.string.f490784as0, java.lang.Integer.valueOf(this.f94709p.f266840a.size())));
        r45.vu vuVar = ((fu1.o) this.f94709p.f266840a.get(0)).f266864a;
        if (vuVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo is null!");
            return;
        }
        Y6(vuVar.f388555p);
        this.f94701e.setText(vuVar.f388552m);
        this.f94702f.setText(vuVar.f388553n);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480185qr);
        if (android.text.TextUtils.isEmpty(vuVar.f388546e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo.logo_url is empty!");
            this.f94706m.setImageResource(com.tencent.mm.R.drawable.cbt);
        } else {
            o11.f fVar = new o11.f();
            fVar.f342083g = lp0.b.D();
            fVar.f342082f = xt1.q.m(vuVar.f388546e);
            fVar.f342078b = true;
            fVar.f342096t = true;
            fVar.f342077a = true;
            fVar.f342087k = dimensionPixelSize;
            fVar.f342086j = dimensionPixelSize;
            fVar.f342091o = com.tencent.mm.R.drawable.cbt;
            n11.a.b().h(vuVar.f388546e, this.f94706m, fVar.a());
        }
        if (android.text.TextUtils.isEmpty(vuVar.D)) {
            this.f94707n.setText(com.tencent.mm.R.string.arx);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "accept_wording is empty!");
            this.f94707n.setText(vuVar.D);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488288p6;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new gu1.g(this));
        this.f94700d = getContentView();
        this.f94701e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b8b);
        this.f94702f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483577bb0);
        this.f94703g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nru);
        this.f94704h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nrt);
        this.f94705i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nrs);
        this.f94706m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.b_w);
        this.f94707n = (android.widget.Button) findViewById(com.tencent.mm.R.id.f482335bp);
        this.f94708o = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.a6i);
        android.widget.Button button = this.f94707n;
        android.view.View.OnClickListener onClickListener = this.E;
        button.setOnClickListener(onClickListener);
        this.f94708o.setOnClickListener(onClickListener);
        this.f94704h.setOnClickListener(onClickListener);
        if (this.f94709p != null) {
            Z6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            int intExtra = intent.getIntExtra("Ktag_range_index", 0);
            this.f94716w = intExtra;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeSuccessUI", "mPrivateSelelct : %d", java.lang.Integer.valueOf(intExtra));
            if (this.f94716w < 2) {
                this.f94705i.setVisibility(8);
                return;
            }
            this.f94717x = intent.getStringExtra("Klabel_name_list");
            this.f94718y = intent.getStringExtra("Kother_user_name_list");
            if (android.text.TextUtils.isEmpty(this.f94717x) && android.text.TextUtils.isEmpty(this.f94718y)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "mLabelNameList and mPrivateTmpUsers by getIntent is empty");
                return;
            }
            java.util.List asList = java.util.Arrays.asList(this.f94717x.split(","));
            this.A = lu1.a0.h(asList);
            this.f94719z = lu1.a0.i(asList);
            java.lang.String str = this.f94718y;
            if (str != null && str.length() > 0) {
                this.f94719z.addAll(java.util.Arrays.asList(this.f94718y.split(",")));
            }
            if (this.A != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeSuccessUI", "mPrivateIdsList size is " + this.A.size());
            }
            if (this.f94719z != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeSuccessUI", "mPrivateNamesList size is " + this.f94719z.size());
                java.util.Iterator it = this.f94719z.iterator();
                while (it.hasNext()) {
                }
            }
            int i19 = this.f94716w;
            if (i19 == 2) {
                this.f94705i.setVisibility(0);
                this.f94705i.setText(getString(com.tencent.mm.R.string.av8, T6()));
            } else if (i19 != 3) {
                this.f94705i.setVisibility(8);
            } else {
                this.f94705i.setVisibility(0);
                this.f94705i.setText(getString(com.tencent.mm.R.string.av7, T6()));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.vu vuVar;
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeSuccessUI", "onCreate()");
        this.B = java.lang.System.currentTimeMillis();
        java.lang.String str = "";
        setMMTitle("");
        setResult(0);
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX, this);
        gm0.j1.n().f273288b.a(oc1.e.CTRL_INDEX, this);
        int intExtra = getIntent().getIntExtra("key_from_scene", 0);
        this.f94714u = intExtra;
        if (intExtra == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_JS");
            this.f94711r = getIntent().getStringExtra("key_consumed_card_id");
            this.f94713t = getIntent().getStringExtra("key_consumed_Code");
            if (android.text.TextUtils.isEmpty(this.f94711r)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "the mConsumdeCardId is empty!");
                V6(0);
                finish();
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeSuccessUI", "the mConsumdeCode is " + this.f94713t);
                X6(true);
                gm0.j1.n().f273288b.g(new fu1.c("", 20, this.f94711r, this.f94713t));
                W6();
                this.f94715v = 7;
            }
        } else if (intExtra == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_MSG_UI");
            java.lang.String stringExtra = getIntent().getStringExtra("key_card_id");
            this.f94710q = stringExtra;
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "the mCardId is empty!");
                V6(0);
                finish();
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeSuccessUI", "the mCardId is " + this.f94710q);
                X6(true);
                gm0.j1.n().f273288b.g(new fu1.c(this.f94710q, 20, "", ""));
                W6();
                this.f94715v = 4;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_CONSUMED_CODE");
            this.f94710q = getIntent().getStringExtra("KEY_CARD_ID");
            if (!U6(getIntent().getStringExtra("KEY_CARD_CONSUMED_JSON"))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "the mCardId is empty!");
                V6(0);
                finish();
                return;
            }
            fu1.g gVar = this.f94709p;
            if (gVar != null && !com.tencent.mm.sdk.platformtools.t8.L0(gVar.f266840a) && (vuVar = ((fu1.o) this.f94709p.f266840a.get(0)).f266864a) != null) {
                str = vuVar.f388555p;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = getIntent().getStringExtra("KEY_CARD_COLOR");
            }
            this.f94715v = getIntent().getIntExtra("key_stastic_scene", 0);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardConsumeSuccessUI", 0, "", "", 0, java.lang.Integer.valueOf(this.f94715v), "", 0, "");
        initView();
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        Y6(str);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX, this);
        gm0.j1.n().f273288b.q(oc1.e.CTRL_INDEX, this);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.B;
        if (android.text.TextUtils.isEmpty(this.f94710q)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13219, "CardConsumeSuccessUI", java.lang.Integer.valueOf(this.f94714u), this.f94712s, this.f94711r, java.lang.Long.valueOf(currentTimeMillis));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13219, "CardConsumeSuccessUI", java.lang.Integer.valueOf(this.f94714u), this.f94712s, this.f94710q, java.lang.Long.valueOf(currentTimeMillis));
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "onKeyDown finishUI");
            V6(0);
            finish();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeSuccessUI", "onSceneEnd, errType = " + i17 + " errCode = " + i18 + " scene cmd is " + m1Var.getType());
        X6(false);
        if (i17 != 0 || i18 != 0) {
            if (!(m1Var instanceof fu1.c) || this.f94714u != 1) {
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
            if (eVar.f266836g != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "shareNetscene.getRetCode() is " + eVar.f266836g);
                lu1.r.c(this, eVar.f266837h);
                db5.e1.T(this, getString(com.tencent.mm.R.string.ar9));
                return;
            }
            db5.e1.T(this, getString(com.tencent.mm.R.string.arc));
            setResult(-1);
            this.f94707n.setEnabled(false);
            lu1.a0.K();
            com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeSuccessUI", "finish UI!");
            V6(-1);
            java.lang.String str2 = eVar.f266835f;
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo shareCardInfo = new com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo();
            lu1.t.q(shareCardInfo, str2);
            lu1.a0.E(shareCardInfo);
            xt1.t0.mj().b();
            finish();
            return;
        }
        if (m1Var instanceof fu1.c) {
            fu1.c cVar = (fu1.c) m1Var;
            if (!android.text.TextUtils.isEmpty(cVar.f266823f) && U6(cVar.f266823f)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeSuccessUI", "consumed return json is valid, update ui");
                this.C.post(new gu1.i(this));
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeSuccessUI", "consumed return json is empty, finish ui!");
            if (this.f94714u == 1) {
                V6(0);
                finish();
                return;
            }
            W6();
            java.lang.String str3 = cVar.f266824g;
            if (android.text.TextUtils.isEmpty(str3)) {
                str3 = getString(com.tencent.mm.R.string.ara);
            }
            db5.e1.G(this, str3, "", false, new gu1.j(this));
            if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f266824g)) {
                db5.e1.T(this, getString(com.tencent.mm.R.string.ara));
            } else {
                db5.e1.T(this, cVar.f266824g);
            }
        }
    }
}
