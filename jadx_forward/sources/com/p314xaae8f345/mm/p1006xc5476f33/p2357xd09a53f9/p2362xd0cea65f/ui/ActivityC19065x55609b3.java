package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/ui/WeCoinBalanceDetailView;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinBalanceDetailView */
/* loaded from: classes8.dex */
public final class ActivityC19065x55609b3 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f260672o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f260673d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f260674e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f260675f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f260676g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f260677h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f260678i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19062x526af630 f260679m;

    /* renamed from: n, reason: collision with root package name */
    public int f260680n;

    public final void T6(int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19062x526af630 c19062x526af630 = this.f260679m;
        int i18 = c19062x526af630 != null ? c19062x526af630.f260669d : 1;
        java.lang.String str3 = "";
        if (c19062x526af630 == null || (str = c19062x526af630.f260670e) == null) {
            str = "";
        }
        if (c19062x526af630 != null && (str2 = c19062x526af630.f260671f) != null) {
            str3 = str2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21655, java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i17), str3);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dgs;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("key_orders");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(parcelableExtra);
        this.f260678i = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) parcelableExtra;
        this.f260679m = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19062x526af630) getIntent().getParcelableExtra("wecoin_fetch_result_kv_data");
        this.f260680n = getIntent().getIntExtra("WECOIN_FETCH_RESULT_BIZ_TYPE", 0);
        if (this.f260678i == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mOrders");
            throw null;
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.axv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f260673d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.axw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f260674e = (android.widget.TextView) findViewById2;
        android.widget.TextView textView = this.f260673d;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPaymentStateTitleTv");
            throw null;
        }
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kex);
        android.widget.TextView textView2 = this.f260674e;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCftHandleStateTitleTv");
            throw null;
        }
        textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l8w);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.axh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f260675f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.axi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f260676g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.axb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f260677h = (android.widget.LinearLayout) findViewById5;
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.l9h);
        mo54448x9c8c0d33(new ns4.t(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        T6(23);
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19065x55609b3.onCreate(android.os.Bundle):void");
    }
}
