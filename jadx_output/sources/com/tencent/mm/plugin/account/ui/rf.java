package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class rf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.z0 f74171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f74172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI f74173f;

    public rf(com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI, com.tencent.mm.modelsimple.z0 z0Var, java.lang.String str) {
        this.f74173f = regByMobileSendSmsUI;
        this.f74171d = z0Var;
        this.f74172e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String K = this.f74171d.K();
        com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI = this.f74173f;
        regByMobileSendSmsUI.f73598u = K;
        c01.b9.f37069c.d("login_user_name", this.f74172e);
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(regByMobileSendSmsUI);
        b17.addFlags(67108864);
        com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI2 = this.f74173f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(regByMobileSendSmsUI2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        regByMobileSendSmsUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(regByMobileSendSmsUI2, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.rf.class.getName());
        sb6.append(",R200_600,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_600"));
        sb6.append(",4");
        n71.a.b(10645, sb6.toString());
        regByMobileSendSmsUI.finish();
        regByMobileSendSmsUI.U6();
    }
}
