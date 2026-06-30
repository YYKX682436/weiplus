package com.tencent.mm.plugin.ball.ui;

@db5.a(7)
/* loaded from: classes8.dex */
public class FloatBallProxyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f93268d;

    /* renamed from: e, reason: collision with root package name */
    public int f93269e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93270f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93271g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93272h = false;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.model.BallInfo f93273i = null;

    public static void T6(com.tencent.mm.plugin.ball.ui.FloatBallProxyUI floatBallProxyUI, int i17) {
        if (floatBallProxyUI.f93270f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallProxyUI", "sendResult, has sent result, resultCode:%s", java.lang.Integer.valueOf(i17));
            return;
        }
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) floatBallProxyUI.getIntent().getParcelableExtra("key_result_callback");
        if (resultReceiver != null) {
            floatBallProxyUI.f93270f = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallProxyUI", "sendResult, resultCode:%s", java.lang.Integer.valueOf(i17));
            resultReceiver.send(i17, null);
        }
    }

    public static void U6(android.content.Context context, final int i17, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, boolean z17, final com.tencent.mm.plugin.ball.ui.v0 v0Var) {
        if (1 == i17) {
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.fan);
            java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.o3e);
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.g(string);
            u1Var.n(string2);
            u1Var.l(new com.tencent.mm.plugin.ball.ui.r(v0Var, i17));
            u1Var.j(context.getResources().getString(com.tencent.mm.R.string.f490347sg));
            u1Var.i(new com.tencent.mm.plugin.ball.ui.q(v0Var, i17));
            u1Var.q(false);
            return;
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.ball.ui.FloatBallProxyUI.class);
        if (ballInfo != null) {
            intent.putExtra("key_ball_info", ballInfo);
        }
        intent.putExtra("key_can_message_ball", z17);
        intent.putExtra("key_proxy_mode", i17);
        intent.putExtra("key_result_callback", new android.os.ResultReceiver(com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.ball.ui.FloatBallProxyUI.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i18, android.os.Bundle bundle) {
                com.tencent.mm.plugin.ball.ui.v0 v0Var2 = v0Var;
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
        this.f93271g = false;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(string);
        u1Var.n(string2);
        u1Var.l(new com.tencent.mm.plugin.ball.ui.w(this));
        u1Var.j(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490347sg));
        u1Var.i(new com.tencent.mm.plugin.ball.ui.v(this));
        u1Var.q(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        com.tencent.mm.ui.v9.e(getWindow());
        com.tencent.mm.ui.v9.c(getWindow(), false);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        if (getIntent() == null) {
            finish();
        }
        int intExtra = getIntent().getIntExtra("key_proxy_mode", 1);
        this.f93269e = intExtra;
        if (intExtra == 1) {
            V6(com.tencent.mm.R.string.fan, com.tencent.mm.R.string.o3e);
        } else if (intExtra == 2) {
            this.f93268d = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, true);
            this.f93268d.q(getString(com.tencent.mm.R.string.f492131fb4), 17);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f93268d;
            k0Var.f211872n = new com.tencent.mm.plugin.ball.ui.s(this);
            k0Var.f211881s = new com.tencent.mm.plugin.ball.ui.t(this);
            k0Var.p(new com.tencent.mm.plugin.ball.ui.u(this));
            this.f93268d.v();
        } else if (intExtra == 3) {
            V6(com.tencent.mm.R.string.f492132fb5, com.tencent.mm.R.string.fao);
        }
        this.f93273i = (com.tencent.mm.plugin.ball.model.BallInfo) getIntent().getParcelableExtra("key_ball_info");
        this.f93272h = getIntent().getBooleanExtra("key_can_message_ball", false);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(1);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f93268d;
        if (k0Var == null || !k0Var.i()) {
            return;
        }
        this.f93268d.u();
        this.f93268d = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallProxyUI", "onPause proxyType: %d, hasConfirmed: %b, canAddMessageBall: %b, ballInfo: %s", java.lang.Integer.valueOf(this.f93269e), java.lang.Boolean.valueOf(this.f93271g), java.lang.Boolean.valueOf(this.f93272h), this.f93273i);
        if (this.f93269e != 1 || this.f93271g || !this.f93272h || this.f93273i == null) {
            return;
        }
        com.tencent.mm.plugin.ball.service.s.H0().o0(this.f93273i);
    }
}
