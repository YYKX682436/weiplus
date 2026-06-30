package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class fg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI f73865d;

    public fg(com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI regByMobileSetPwdUI) {
        this.f73865d = regByMobileSetPwdUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        js.w0 w0Var = (js.w0) i95.n0.c(js.w0.class);
        com.tencent.mm.plugin.account.ui.eg egVar = new com.tencent.mm.plugin.account.ui.eg(this);
        is.i0 i0Var = (is.i0) w0Var;
        i0Var.getClass();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        boolean t17 = c01.z1.t();
        com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI regByMobileSetPwdUI = this.f73865d;
        if (t17 && !com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AffiliatedAcctForgetPwdUrl"))) {
            c71.b.c(regByMobileSetPwdUI, ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AffiliatedAcctForgetPwdUrl"), 0, true);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SetPwdServiceSetPwdService", "has not bind mobile");
            android.content.Intent intent = new android.content.Intent(regByMobileSetPwdUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactUI.class);
            intent.putExtra("bind_scene", 4);
            intent.putExtra("bind_scene", 4);
            db5.e1.C(regByMobileSetPwdUI, regByMobileSetPwdUI.getString(com.tencent.mm.R.string.f492804hx4), "", regByMobileSetPwdUI.getString(com.tencent.mm.R.string.ail), regByMobileSetPwdUI.getString(com.tencent.mm.R.string.f490347sg), true, new is.v(i0Var, regByMobileSetPwdUI, intent, egVar), new is.w(i0Var, egVar));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SetPwdServiceSetPwdService", "has bind mobile");
            db5.e1.C(regByMobileSetPwdUI, regByMobileSetPwdUI.getString(com.tencent.mm.R.string.f492802hx2, str), "", regByMobileSetPwdUI.getString(com.tencent.mm.R.string.f490551ya), regByMobileSetPwdUI.getString(com.tencent.mm.R.string.f490347sg), true, new is.y(i0Var, regByMobileSetPwdUI, str, egVar), new is.z(i0Var, egVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
