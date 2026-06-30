package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class dg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.z0 f73809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f73810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI f73811f;

    public dg(com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI, com.tencent.mm.modelsimple.z0 z0Var, java.lang.String str) {
        this.f73811f = regByMobileSendSmsUI;
        this.f73809d = z0Var;
        this.f73810e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String K = this.f73809d.K();
        com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI = this.f73811f;
        regByMobileSendSmsUI.f73598u = K;
        c01.b9.f37069c.d("login_user_name", this.f73810e);
        com.tencent.mm.vfs.w6.h(lp0.b.j() + "temp.avatar");
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(regByMobileSendSmsUI);
        b17.addFlags(67108864);
        com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI2 = this.f73811f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(regByMobileSendSmsUI2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$9", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        regByMobileSendSmsUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(regByMobileSendSmsUI2, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$9", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.dg.class.getName());
        sb6.append(",R200_600,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_600"));
        sb6.append(",4");
        n71.a.b(10645, sb6.toString());
        regByMobileSendSmsUI.finish();
        regByMobileSendSmsUI.U6();
    }
}
