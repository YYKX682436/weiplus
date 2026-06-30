package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI */
/* loaded from: classes8.dex */
public class ActivityC19009xdf81ddb4 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f259465t = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f259466d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f259467e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f259468f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f259469g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f259470h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f259471i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f259472m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f259473n;

    /* renamed from: o, reason: collision with root package name */
    public int f259474o;

    /* renamed from: p, reason: collision with root package name */
    public r45.dm6 f259475p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ra5 f259476q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f259477r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f259478s;

    public final void U6() {
        this.f259472m.setVisibility(8);
        android.view.View view = this.f259473n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "hideTimeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "hideTimeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.lang.String V6(r45.dm6 dm6Var, int i17) {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("00");
        return getString(i17, decimalFormat.format(dm6Var.f454111d / 60), decimalFormat.format(dm6Var.f454112e / 60));
    }

    public final void W6() {
        this.f259466d.m81392x52cfa5c6(true);
        android.view.View view = this.f259478s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAccountChecked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAccountChecked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Y6();
    }

    public final void X6() {
        this.f259466d.m81392x52cfa5c6(false);
        android.view.View view = this.f259478s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAccountUnChecked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAccountUnChecked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        U6();
    }

    public final void Y6() {
        this.f259472m.setVisibility(0);
        android.view.View view = this.f259473n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "showTimeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "showTimeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bt8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f259466d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.f567051hz0);
        this.f259470h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hz9);
        this.f259471i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567055hz4);
        this.f259469g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hz6);
        this.f259472m = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.hz7);
        this.f259473n = findViewById(com.p314xaae8f345.mm.R.id.f567054hz3);
        this.f259467e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567053hz2);
        this.f259468f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hz8);
        this.f259478s = findViewById(com.p314xaae8f345.mm.R.id.f567056hz5);
        this.f259466d.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.v(this));
        this.f259472m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.w(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "on activity result: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("encrypt_pwd") : "";
        if (i17 == 16) {
            if (i18 != -1) {
                X6();
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "do open");
                new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.d(stringExtra).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.b0(this, com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(mo55332x76847179(), false, false, null)));
                return;
            }
        }
        if (i17 != 32) {
            super.onActivityResult(i17, i18, intent);
        } else if (i18 != -1) {
            W6();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "do close");
            new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.b(stringExtra).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.c0(this, com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(mo55332x76847179(), false, false, null)));
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo43517x10010bd5();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        if (getIntent().getIntExtra("show_open_toast", 0) == 1) {
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.koo, 0).show();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "do qry setting");
        new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.e().l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.a0(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
