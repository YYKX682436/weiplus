package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class ug implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f74254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f74255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f74256f;

    public ug(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI, com.tencent.mm.modelbase.m1 m1Var, java.lang.String str) {
        this.f74256f = regSetInfoUI;
        this.f74254d = m1Var;
        this.f74255e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String K = ((com.tencent.mm.modelsimple.z0) this.f74254d).K();
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f74256f;
        regSetInfoUI.f73637o = K;
        c01.b9.f37069c.d("login_user_name", this.f74255e);
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(regSetInfoUI);
        b17.addFlags(67108864);
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI2 = this.f74256f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(regSetInfoUI2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI$17", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        regSetInfoUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(regSetInfoUI2, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$17", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(regSetInfoUI.getClass().getName());
        sb6.append(",R200_900_phone,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_900_phone"));
        sb6.append(",4");
        n71.a.b(10645, sb6.toString());
        regSetInfoUI.finish();
    }
}
