package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.ball.ui.FloatBallProxyUI */
/* loaded from: classes8.dex */
public class ActivityC12906x5398ea7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f174801d;

    /* renamed from: e, reason: collision with root package name */
    public int f174802e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f174803f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f174804g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f174805h = false;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f174806i = null;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.ActivityC12906x5398ea7 activityC12906x5398ea7, int i17) {
        if (activityC12906x5398ea7.f174803f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallProxyUI", "sendResult, has sent result, resultCode:%s", java.lang.Integer.valueOf(i17));
            return;
        }
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) activityC12906x5398ea7.getIntent().getParcelableExtra("key_result_callback");
        if (resultReceiver != null) {
            activityC12906x5398ea7.f174803f = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallProxyUI", "sendResult, resultCode:%s", java.lang.Integer.valueOf(i17));
            resultReceiver.send(i17, null);
        }
    }

    public static void U6(android.content.Context context, final int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, boolean z17, final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.v0 v0Var) {
        if (1 == i17) {
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fan);
            java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o3e);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var.g(string);
            u1Var.n(string2);
            u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.r(v0Var, i17));
            u1Var.j(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
            u1Var.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q(v0Var, i17));
            u1Var.q(false);
            return;
        }
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.ActivityC12906x5398ea7.class);
        if (c12886x91aa2b6d != null) {
            intent.putExtra("key_ball_info", c12886x91aa2b6d);
        }
        intent.putExtra("key_can_message_ball", z17);
        intent.putExtra("key_proxy_mode", i17);
        intent.putExtra("key_result_callback", new android.os.ResultReceiver(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.ball.ui.FloatBallProxyUI.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i18, android.os.Bundle bundle) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.v0 v0Var2 = v0Var;
                if (v0Var2 != null) {
                    v0Var2.a(i17, i18);
                }
            }
        });
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/ball/ui/FloatBallProxyUI", "showFloatBallProxyUI", "(Landroid/content/Context;ILcom/tencent/mm/plugin/ball/model/BallInfo;ZLcom/tencent/mm/plugin/ball/ui/OnFloatBallProxyUIResultCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/ball/ui/FloatBallProxyUI", "showFloatBallProxyUI", "(Landroid/content/Context;ILcom/tencent/mm/plugin/ball/model/BallInfo;ZLcom/tencent/mm/plugin/ball/ui/OnFloatBallProxyUIResultCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void V6(int i17, int i18) {
        java.lang.String string = getResources().getString(i17);
        java.lang.String string2 = getResources().getString(i18);
        this.f174804g = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        u1Var.g(string);
        u1Var.n(string2);
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.w(this));
        u1Var.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        u1Var.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.v(this));
        u1Var.q(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
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
        overridePendingTransition(0, 0);
        com.p314xaae8f345.mm.ui.v9.e(getWindow());
        com.p314xaae8f345.mm.ui.v9.c(getWindow(), false);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        if (getIntent() == null) {
            finish();
        }
        int intExtra = getIntent().getIntExtra("key_proxy_mode", 1);
        this.f174802e = intExtra;
        if (intExtra == 1) {
            V6(com.p314xaae8f345.mm.R.C30867xcad56011.fan, com.p314xaae8f345.mm.R.C30867xcad56011.o3e);
        } else if (intExtra == 2) {
            this.f174801d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this, 1, true);
            this.f174801d.q(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573664fb4), 17);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f174801d;
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.s(this);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.t(this);
            k0Var.p(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u(this));
            this.f174801d.v();
        } else if (intExtra == 3) {
            V6(com.p314xaae8f345.mm.R.C30867xcad56011.f573665fb5, com.p314xaae8f345.mm.R.C30867xcad56011.fao);
        }
        this.f174806i = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) getIntent().getParcelableExtra("key_ball_info");
        this.f174805h = getIntent().getBooleanExtra("key_can_message_ball", false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        mo2550x7c2abd06(1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f174801d;
        if (k0Var == null || !k0Var.i()) {
            return;
        }
        this.f174801d.u();
        this.f174801d = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallProxyUI", "onPause proxyType: %d, hasConfirmed: %b, canAddMessageBall: %b, ballInfo: %s", java.lang.Integer.valueOf(this.f174802e), java.lang.Boolean.valueOf(this.f174804g), java.lang.Boolean.valueOf(this.f174805h), this.f174806i);
        if (this.f174802e != 1 || this.f174804g || !this.f174805h || this.f174806i == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.H0().o0(this.f174806i);
    }
}
