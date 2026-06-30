package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class gf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI f73888d;

    public gf(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI) {
        this.f73888d = regByMobileRegAIOUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI = this.f73888d;
        android.content.Intent b17 = y7Var.b(regByMobileRegAIOUI);
        b17.addFlags(67108864);
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI2 = this.f73888d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(regByMobileRegAIOUI2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$22", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        regByMobileRegAIOUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(regByMobileRegAIOUI2, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$22", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(regByMobileRegAIOUI.getClass().getName());
        sb6.append(",L14,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L14"));
        sb6.append(",4");
        n71.a.b(10645, sb6.toString());
        regByMobileRegAIOUI.finish();
    }
}
