package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginIndepPass f74265d;

    public v5(com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass) {
        this.f74265d = loginIndepPass;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass = this.f74265d;
        android.content.Intent b17 = y7Var.b(loginIndepPass);
        b17.addFlags(67108864);
        com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass2 = this.f74265d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(loginIndepPass2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginIndepPass$14", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        loginIndepPass2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(loginIndepPass2, "com/tencent/mm/plugin/account/ui/LoginIndepPass$14", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        loginIndepPass.finish();
    }
}
