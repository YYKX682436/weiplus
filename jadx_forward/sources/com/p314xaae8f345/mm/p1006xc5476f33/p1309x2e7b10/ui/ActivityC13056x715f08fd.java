package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* renamed from: com.tencent.mm.plugin.card.ui.CardListSelectedUI */
/* loaded from: classes15.dex */
public class ActivityC13056x715f08fd extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, wt1.a0 {
    public static final /* synthetic */ int K = 0;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public int D;
    public java.lang.String E;
    public java.lang.String G;

    /* renamed from: J, reason: collision with root package name */
    public xt1.a f176405J;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f176407e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f176408f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f176409g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f176410h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f176411i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.BaseAdapter f176412m;

    /* renamed from: t, reason: collision with root package name */
    public boolean f176419t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f176420u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f176421v;

    /* renamed from: w, reason: collision with root package name */
    public int f176422w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f176423x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f176424y;

    /* renamed from: z, reason: collision with root package name */
    public int f176425z;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f176406d = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f176413n = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f176414o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f176415p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public boolean f176416q = true;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f176417r = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f176418s = false;
    public java.lang.String F = "";
    public boolean H = false;
    public int I = 0;

    @Override // wt1.a0
    public void A1(java.lang.String str, wt1.b0 b0Var, java.lang.String str2) {
        U6(false);
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(this.f176405J.f537965j)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardListSelectedUI", "onMarkFail(), the mark card id is diff from current id!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListSelectedUI", "onMarkFail()");
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.atz);
        }
        lu1.r.c(this, str2);
    }

    @Override // wt1.a0
    public void C5(java.lang.String str, wt1.b0 b0Var) {
        java.util.HashMap hashMap;
        int i17 = 0;
        U6(false);
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(this.f176405J.f537965j)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardListSelectedUI", "onMarkSuccess(), the mark card id is diff from current id!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListSelectedUI", "onMarkSuccess()");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListSelectedUI", "markSucc:" + b0Var.f530783b + " markCardId: " + b0Var.f530784c);
        if (b0Var.f530783b != 1) {
            lu1.r.c(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572329au0));
            return;
        }
        if (android.text.TextUtils.isEmpty(b0Var.f530784c) || str.equals(b0Var.f530784c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListSelectedUI", "markCardId is same as now id!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListSelectedUI", "markCardId is diff as now id!");
            int i18 = 0;
            while (true) {
                java.util.LinkedList linkedList = this.f176414o;
                if (i18 >= linkedList.size()) {
                    break;
                }
                if (((xt1.a) linkedList.get(i18)).f537965j == b0Var.f530784c) {
                    while (true) {
                        int size = linkedList.size();
                        hashMap = this.f176415p;
                        if (i17 >= size) {
                            break;
                        }
                        hashMap.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.FALSE);
                        i17++;
                    }
                    hashMap.put(java.lang.Integer.valueOf(i18), java.lang.Boolean.TRUE);
                } else {
                    i18++;
                }
            }
        }
        x();
    }

    public final void T6() {
        if (this.f176418s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardListSelectedUI", "doNetSceneGetShareCardsLayout, isDoingGetData is true");
            return;
        }
        if (this.f176417r == null) {
            this.f176419t = false;
            this.f176420u = false;
        }
        gm0.j1.n().f354821b.a(ib1.n.f69905x366c91de, this);
        gm0.j1.n().f354821b.g(new xt1.q0(this.f176421v, this.f176422w, this.f176423x, this.f176424y, this.f176425z, this.A, this.B, this.C, this.f176417r));
        U6(true);
        this.f176418s = true;
        if (this.D == 1) {
            this.f176413n = true;
        }
    }

    public void U6(boolean z17) {
        if (z17) {
            this.f176406d = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), false, 0, null);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f176406d;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f176406d.dismiss();
        this.f176406d = null;
    }

    public final void V6(int i17, java.lang.String str) {
        if (this.I != 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardListSelectedUI", "setResultToSDK need MM_CARD_ITEM_FROM_SCENE_OPENAPI scene, the fromscene is " + this.I);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("_wxapi_choose_card_from_wx_card_list", str);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str2 = this.f176421v;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str2);
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11232xd82d2ee4.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11232xd82d2ee4.Resp(bundle);
        if (h17 != null) {
            resp.f32869xc3c3c505 = h17.f67384x996f3ea;
        }
        java.lang.String str3 = this.G;
        resp.f32870x7fa0d2de = str3;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this.f176421v;
        objArr[1] = h17 == null ? "null appinfo" : h17.f67372x453d1e07;
        objArr[2] = h17 != null ? h17.f67384x996f3ea : "null appinfo";
        objArr[3] = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListSelectedUI", "setResultToSDK, appid : %s, appname : %s, openid : %s, transcation : %s", objArr);
        resp.mo48431x792022dd(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListSelectedUI", "setResultToSDK result:" + i17);
        if (i17 == -1) {
            resp.f32867xa7c470f2 = 0;
        } else {
            resp.f32867xa7c470f2 = -2;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = this.F;
        args.f32701xaddf3082 = bundle;
        args.f32703x5cfee87 = 268435456;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, args);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569872ql;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (this.H) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.atu);
            m78572x3f86539a(com.p314xaae8f345.mm.R.C30867xcad56011.ats);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.att);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.u2(this));
        if (!this.H) {
            mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2(this));
            m78501x43e00957(false);
        }
        this.f176407e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.bae);
        if (this.H) {
            this.f176412m = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b3(this);
        } else {
            this.f176412m = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a3(this);
        }
        this.f176407e.setAdapter((android.widget.ListAdapter) this.f176412m);
        this.f176407e.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.w2(this));
        this.f176407e.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.x2(this));
        this.f176408f = findViewById(com.p314xaae8f345.mm.R.id.cho);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kby);
        if (this.H) {
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.aur));
        }
        this.f176409g = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.hfi);
        this.f176410h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hfz);
        this.f176411i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hfu);
        if (!this.H) {
            this.f176409g.setVisibility(8);
            return;
        }
        this.f176409g.setVisibility(0);
        this.f176410h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.y2(this));
        this.f176411i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.z2(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        wt1.c0 Ri = xt1.t0.Ri();
        if (Ri.f530792d == null) {
            Ri.f530792d = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ri.f530792d).add(new java.lang.ref.WeakReference(this));
        android.content.Intent intent = getIntent();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListSelectedUI", "initData()");
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardListSelectedUI", "doGetCardList()  intent == null");
            setResult(1);
            V6(1, "");
            finish();
        } else {
            this.I = intent.getIntExtra("key_from_scene", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListSelectedUI", "mFromScene:" + this.I);
            this.f176421v = intent.getStringExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
            this.f176422w = intent.getIntExtra("shop_id", 0);
            this.f176423x = intent.getStringExtra("sign_type");
            this.f176424y = intent.getStringExtra("card_sign");
            this.f176425z = intent.getIntExtra("time_stamp", 0);
            this.A = intent.getStringExtra("nonce_str");
            this.B = intent.getStringExtra("card_tp_id");
            this.C = intent.getStringExtra("card_type");
            this.D = intent.getIntExtra("can_multi_select", 0);
            this.F = intent.getStringExtra("key_package_name");
            this.G = intent.getStringExtra("key_transaction");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListSelectedUI", "app_id:" + this.f176421v + " shop_id:" + this.f176422w + " sign_type:" + this.f176423x + " time_stamp:" + this.f176425z);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardListSelectedUI", "nonce_str:" + this.A + " card_tp_id:" + this.B + " card_type:" + this.C + " canMultiSelect:" + this.D + " packateName:" + this.F);
            if ("INVOICE".equalsIgnoreCase(this.C)) {
                this.H = true;
            }
            if (android.text.TextUtils.isEmpty(this.f176421v)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardListSelectedUI", "doGetCardList()  app_id is nulls");
                setResult(1);
                V6(1, "app_id  or card_sign is empty!");
                finish();
            }
        }
        T6();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        xt1.t0.Ri().f(this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            setResult(0);
            V6(0, "");
            finish();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r10, int r11, java.lang.String r12, com.p314xaae8f345.mm.p944x882e457a.m1 r13) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13056x715f08fd.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // wt1.a0
    public void p4(java.lang.String str, wt1.b0 b0Var) {
    }

    public final void x() {
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.f176414o;
            if (i17 >= linkedList.size()) {
                break;
            }
            java.lang.Boolean bool = (java.lang.Boolean) this.f176415p.get(java.lang.Integer.valueOf(i17));
            if (bool != null && bool.booleanValue()) {
                arrayList.add((xt1.a) linkedList.get(i17));
            }
            i17++;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (i18 != 0) {
                sb6.append(",");
            }
            xt1.a aVar = (xt1.a) arrayList.get(i18);
            sb6.append("{\"card_id\":");
            sb6.append("\"" + aVar.f537956a + "\"");
            sb6.append(",\"encrypt_code\":");
            sb6.append("\"" + aVar.f537962g + "\"");
            if (this.H) {
                sb6.append(",\"app_id\":");
                sb6.append("\"" + aVar.f537964i + "\"");
            }
            sb6.append("}");
        }
        sb6.append("]");
        java.lang.String sb7 = sb6.toString();
        if (this.H) {
            intent.putExtra("choose_invoice_info", sb7);
        } else {
            intent.putExtra("choose_card_info", sb7);
        }
        setResult(-1, intent);
        V6(-1, sb7);
        finish();
    }
}
