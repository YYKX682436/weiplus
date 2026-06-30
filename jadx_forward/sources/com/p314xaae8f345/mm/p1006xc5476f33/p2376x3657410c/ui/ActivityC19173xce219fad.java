package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/wallet_index/ui/WecoinIapUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/wallet_index/ui/s0", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI */
/* loaded from: classes15.dex */
public final class ActivityC19173xce219fad extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f262656p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.r0 f262657d;

    /* renamed from: e, reason: collision with root package name */
    public final int f262658e = 6;

    /* renamed from: f, reason: collision with root package name */
    public final int f262659f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f262660g = 2;

    /* renamed from: h, reason: collision with root package name */
    public int f262661h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f262662i = 1002;

    /* renamed from: m, reason: collision with root package name */
    public boolean f262663m = true;

    /* renamed from: n, reason: collision with root package name */
    public android.app.Dialog f262664n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.s0 f262665o;

    public final void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WecoinIapUI", "hideLoadingDialog!");
        android.app.Dialog dialog = this.f262664n;
        if (dialog != null) {
            boolean z17 = false;
            if (dialog != null && dialog.isShowing()) {
                z17 = true;
            }
            if (z17) {
                android.app.Dialog dialog2 = this.f262664n;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                this.f262664n = null;
            }
        }
    }

    public final void U6(nt4.f fVar, int i17) {
        int i18 = fVar.f421356a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Consume failed: ");
        int i19 = fVar.f421356a;
        sb6.append(i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WecoinIapUI", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", i19);
        intent.putExtra("key_err_msg", fVar.f421357b);
        if (i17 != -1) {
            intent.putExtra("key_response_position", i17);
        }
        setResult(-1, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WecoinIapUI", "finish");
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f262665o = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.s0(new java.lang.ref.WeakReference(this));
        overridePendingTransition(0, 0);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        db5.f.c(this, null);
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.s0 s0Var = this.f262665o;
        if (s0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mNetSceneCallback");
            throw null;
        }
        r1Var.a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60863x5f3ec0e3, s0Var);
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var2 = gm0.j1.n().f354821b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.s0 s0Var2 = this.f262665o;
        if (s0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mNetSceneCallback");
            throw null;
        }
        r1Var2.a(414, s0Var2);
        this.f262657d = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.r0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WecoinIapUI", "onHandleIntent");
        android.content.Intent intent = getIntent();
        if (getIntent().getBooleanExtra("key_request_fullscreen", false)) {
            getWindow().addFlags(1024);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.r0 r0Var = this.f262657d;
        if (r0Var != null) {
            java.lang.String stringExtra = intent.getStringExtra("key_product_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            r0Var.f262733i = stringExtra;
            ((java.util.ArrayList) r0Var.f262732h).add(stringExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WecoinIapData", "prepare pay product: ".concat(stringExtra));
            r0Var.f262728d = intent.getStringExtra("key_wecoin_price");
            r0Var.f262729e = intent.getStringExtra("key_price");
            intent.getIntExtra("key_count", 1);
            intent.getStringExtra("key_currency_type");
            java.lang.String stringExtra2 = intent.getStringExtra("key_desc");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            r0Var.f262736l = stringExtra2;
            r0Var.f262725a = intent.getIntExtra("key_pay_type", this.f262658e);
            java.lang.String stringExtra3 = intent.getStringExtra("key_product_title_insufficient");
            r0Var.f262737m = stringExtra3 != null ? stringExtra3 : "";
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WecoinIapUI", "onDestroy");
        T6();
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.s0 s0Var = this.f262665o;
        if (s0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mNetSceneCallback");
            throw null;
        }
        r1Var.q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60863x5f3ec0e3, s0Var);
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var2 = gm0.j1.n().f354821b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.s0 s0Var2 = this.f262665o;
        if (s0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mNetSceneCallback");
            throw null;
        }
        r1Var2.q(414, s0Var2);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WecoinIapUI", "onResume");
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.r0 r0Var = this.f262657d;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b1 b1Var = r0Var != null ? new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b1(r0Var.f262733i, r0Var.f262728d, r0Var.f262725a) : null;
        if (b1Var == null || !this.f262663m) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WecoinIapUI", "showLoadingDialog!");
        this.f262664n = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.t0(this));
        gm0.j1.n().f354821b.g(b1Var);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WecoinIapUI", "onStop");
        super.onStop();
    }
}
