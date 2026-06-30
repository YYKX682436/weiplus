package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI */
/* loaded from: classes8.dex */
public class ActivityC19016xf99a44c4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.AbstractActivityC19010x9ab25415 {
    public static final /* synthetic */ int D = 0;
    public int A;
    public boolean B;
    public boolean C;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f259538f;

    /* renamed from: h, reason: collision with root package name */
    public r45.n85 f259540h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.q4 f259541i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab f259542m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f259543n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f259544o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f259545p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f259546q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f259547r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ListView f259548s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f259549t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f259550u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f259551v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f259552w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f259553x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f259554y;

    /* renamed from: z, reason: collision with root package name */
    public int f259555z;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.u1 f259537e = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.u1) this.f259479d.a(this, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.u1.class);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f259539g = new java.util.ArrayList();

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 activityC19016xf99a44c4, int i17) {
        activityC19016xf99a44c4.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanDetailUI", "go to check pwd");
        android.content.Intent intent = new android.content.Intent(activityC19016xf99a44c4, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19111xd5a60886.class);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 3);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        intent.putExtra("subtitle", com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.e3.a(i17));
        activityC19016xf99a44c4.startActivityForResult(intent, i17);
    }

    public final void V6(int i17, int i18, int i19) {
        android.app.Dialog e17 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(mo55332x76847179(), false, false, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.t1 t1Var = this.f259537e.f259256d;
        t1Var.getClass();
        ((km5.q) ((km5.q) km5.u.g(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19))).n(t1Var).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.j4(this, e17))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.i4(this, e17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.AbstractActivityC19010x9ab25415, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.btn;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanDetailUI", "activity result: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1) {
            if (intent != null) {
                intent.putExtra("oper_type", i17);
                intent.putExtra("plan_id", this.f259555z);
                setResult(-1, intent);
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("oper_type", i17);
                setResult(-1, intent2);
            }
        }
        finish();
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.AbstractActivityC19010x9ab25415, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("key_plan_item_detail");
        if (parcelableExtra instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18995xe3fe0610) {
            this.f259540h = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.u.s((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18995xe3fe0610) parcelableExtra);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanDetailUI", "parcelable no instanceof CgiLqtPlanOrderList.PlanItemParcel");
            finish();
        }
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        r45.n85 n85Var = this.f259540h;
        if (n85Var != null) {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.l4(this, n85Var));
        }
        r45.n85 n85Var2 = this.f259540h;
        if (n85Var2 == null) {
            return;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.View.inflate(getBaseContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.btl, null);
        this.f259552w = linearLayout;
        this.f259542m = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.jq9);
        this.f259550u = (android.widget.LinearLayout) this.f259552w.findViewById(com.p314xaae8f345.mm.R.id.nhf);
        this.f259551v = (android.widget.LinearLayout) this.f259552w.findViewById(com.p314xaae8f345.mm.R.id.o7x);
        this.f259543n = (android.widget.TextView) this.f259552w.findViewById(com.p314xaae8f345.mm.R.id.o7v);
        this.f259544o = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) this.f259552w.findViewById(com.p314xaae8f345.mm.R.id.ad9);
        this.f259545p = (android.widget.TextView) this.f259552w.findViewById(com.p314xaae8f345.mm.R.id.bce);
        this.f259546q = (android.widget.TextView) this.f259552w.findViewById(com.p314xaae8f345.mm.R.id.o7p);
        this.f259549t = (android.widget.LinearLayout) this.f259552w.findViewById(com.p314xaae8f345.mm.R.id.o7q);
        this.f259554y = this.f259552w.findViewById(com.p314xaae8f345.mm.R.id.h08);
        this.f259547r = (android.widget.TextView) this.f259552w.findViewById(com.p314xaae8f345.mm.R.id.nxi);
        this.f259548s = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.cw8);
        this.f259553x = findViewById(com.p314xaae8f345.mm.R.id.ivn);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.q4 q4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.q4(this, null);
        this.f259541i = q4Var;
        this.f259548s.setAdapter((android.widget.ListAdapter) q4Var);
        this.f259548s.addHeaderView(this.f259552w);
        this.f259542m.b();
        java.math.BigDecimal i17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i("" + n85Var2.f462697e, "100", 2, java.math.RoundingMode.HALF_UP);
        if (i17.intValue() == i17.doubleValue()) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab c22904x897710ab = this.f259542m;
            java.lang.String str = "" + i17.intValue();
            if (!str.contains(".")) {
                str = str.concat(".00");
            }
            c22904x897710ab.setText(str);
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab c22904x897710ab2 = this.f259542m;
            java.lang.String bigDecimal = i17.toString();
            if (!bigDecimal.contains(".")) {
                bigDecimal = bigDecimal.concat(".00");
            }
            c22904x897710ab2.setText(bigDecimal);
        }
        this.f259543n.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575096kq5, "" + n85Var2.f462696d));
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        gt4.c1 c1Var = new gt4.c1(n85Var2.f462708s);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(c1Var);
        if (d17 != null) {
            this.f259544o.setImageBitmap(d17);
        }
        this.f259545p.setText(java.lang.String.format("%s %s（%s）", n85Var2.f462707r, n85Var2.f462709t, n85Var2.f462699g));
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f259551v.getLayoutParams();
        if (n85Var2.f462706q != 1) {
            this.f259550u.setVisibility(0);
            layoutParams.setMargins(0, i65.a.b(mo55332x76847179(), 8), 0, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanDetailUI", "params.topMargin:%s", java.lang.Integer.valueOf(layoutParams.topMargin));
        } else {
            this.f259550u.setVisibility(8);
            layoutParams.setMargins(0, i65.a.b(mo55332x76847179(), 16), 0, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanDetailUI", "params.topMargin:%s", java.lang.Integer.valueOf(layoutParams.topMargin));
        }
        this.f259551v.setLayoutParams(layoutParams);
        this.A = 0;
        this.C = true;
        V6(n85Var2.f462705p, 0, 6);
        this.f259548s.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.h4(this, n85Var2));
        this.f259554y.setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
    }
}
