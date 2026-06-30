package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI */
/* loaded from: classes8.dex */
public class ActivityC19017x85a03192 extends com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.AbstractActivityC19010x9ab25415 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f259556s = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f259557e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f259558f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f259559g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f259560h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f259561i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f259562m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f259563n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.y1 f259564o = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.y1) this.f259479d.a(this, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.y1.class);

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.b5 f259565p = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.b5(this, null);

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f259566q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public int f259567r;

    public final void U6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c0 c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c0();
        c0Var.f295418c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.r();
        c0Var.c(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.x4(this, z17), true);
    }

    public final void V6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanHomeUI", "go to add plan ui -> add");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936.class);
        intent.putExtra("key_mode", 1);
        startActivityForResult(intent, i17);
    }

    public final void W6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanHomeUI", "show null plan home ui");
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kqr));
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.ixa);
        this.f259561i = relativeLayout;
        relativeLayout.setVisibility(0);
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.ix_)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.v4(this));
    }

    public final void X6(r45.m85 m85Var) {
        if (m85Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanHomeUI", "resp is null");
            finish();
            return;
        }
        java.util.LinkedList linkedList = m85Var.f461773f;
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanHomeUI", "show empty view");
            if (this.f259567r != 3) {
                finish();
                return;
            }
            W6();
            this.f259566q = linkedList;
            this.f259565p.notifyDataSetChanged();
            this.f259563n.setVisibility(8);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m85Var.f461778n)) {
            mo54450xbf7c1df6("");
        } else {
            mo54450xbf7c1df6(m85Var.f461778n);
        }
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        this.f259559g.setVisibility(8);
        this.f259557e.setVisibility(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanHomeUI", "limit: %s", java.lang.Long.valueOf(m85Var.f461774g));
        this.f259563n.setVisibility(0);
        if (m85Var.f461774g <= linkedList.size()) {
            android.view.View findViewById = this.f259563n.findViewById(com.p314xaae8f345.mm.R.id.f567270iu4);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI", "updateFooterView", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI", "updateFooterView", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) this.f259563n.findViewById(com.p314xaae8f345.mm.R.id.f567271iu5);
            textView.setPadding(i65.a.b(mo55332x76847179(), 24), 0, 0, 0);
            textView.setText(m85Var.f461777m);
            textView.setTextColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
            this.f259563n.setEnabled(false);
        } else {
            android.view.View findViewById2 = this.f259563n.findViewById(com.p314xaae8f345.mm.R.id.f567270iu4);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI", "updateFooterView", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI", "updateFooterView", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = (android.widget.TextView) this.f259563n.findViewById(com.p314xaae8f345.mm.R.id.f567271iu5);
            textView2.setPadding(0, 0, 0, 0);
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kol);
            textView2.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            this.f259563n.setEnabled(true);
        }
        this.f259566q = linkedList;
        this.f259565p.notifyDataSetChanged();
        r45.rd rdVar = m85Var.f461776i;
        if (rdVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rdVar.f466268d)) {
            this.f259560h.setVisibility(8);
            return;
        }
        this.f259562m.setText(m85Var.f461776i.f466268d);
        this.f259560h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.w4(this, m85Var));
        this.f259560h.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.AbstractActivityC19010x9ab25415, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.btr;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f259557e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.it7);
        this.f259558f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f567262it2);
        this.f259559g = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f567264it4);
        this.f259560h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.iuu);
        this.f259562m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iuv);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.b5 b5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.b5(this, null);
        this.f259565p = b5Var;
        this.f259557e.setAdapter((android.widget.ListAdapter) b5Var);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.btq, (android.view.ViewGroup) this.f259557e, false);
        this.f259563n = viewGroup;
        viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u4(this));
        this.f259557e.addFooterView(this.f259563n);
        this.f259558f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.s4(this));
        this.f259557e.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t4(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanHomeUI", "activity result: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 5 && i18 == -1) {
            i17 = intent.getIntExtra("oper_type", -1);
        }
        this.f259567r = i17;
        if (i17 != 1 && i17 != 2 && i17 != 3) {
            switch (i17) {
                case 65281:
                    if (i18 == -1) {
                        U6(false);
                        break;
                    }
                    break;
                case 65282:
                    if (i18 != -1) {
                        finish();
                        break;
                    } else {
                        U6(false);
                        break;
                    }
                case 65283:
                    if (i18 == -1) {
                        U6(false);
                        this.f259561i.setVisibility(8);
                        break;
                    }
                    break;
            }
        } else if (i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("encrypt_pwd");
            int intExtra = intent.getIntExtra("oper_type", -1);
            int intExtra2 = intent.getIntExtra("plan_id", -1);
            android.app.Dialog e17 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(mo55332x76847179(), false, false, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.x1 x1Var = this.f259564o.f259285b;
            x1Var.getClass();
            ((km5.q) ((km5.q) km5.u.g(java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intExtra2), stringExtra)).n(x1Var).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.a5(this, e17))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.y4(this, e17));
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.AbstractActivityC19010x9ab25415, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        mo66578x399050cf();
        mo78530x8b45058f();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, 0);
        mo43517x10010bd5();
        int intExtra = getIntent().getIntExtra("key_plan_go_scene_ui", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanHomeUI", "WalletLqtPlanHomeUI scene：%s", java.lang.Integer.valueOf(intExtra));
        if (intExtra == 1) {
            V6(65282);
            return;
        }
        if (intExtra == 2) {
            W6();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanHomeUI", "go to plan home ui");
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("key_plan_index_resp");
        if (parcelableExtra instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18991x2053ef2d) {
            X6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.r.t((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18991x2053ef2d) parcelableExtra));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanHomeUI", "parcelable no instanceof CgiLqtPlanIndex.PlanIndexParcel");
            finish();
        }
    }
}
