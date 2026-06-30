package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class l9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBLoginUI f74007d;

    public l9(com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI) {
        this.f74007d = mMFBLoginUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI = this.f74007d;
        android.content.Intent b17 = y7Var.b(mMFBLoginUI);
        b17.addFlags(67108864);
        com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI2 = this.f74007d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMFBLoginUI2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MMFBLoginUI$6", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMFBLoginUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMFBLoginUI2, "com/tencent/mm/plugin/account/ui/MMFBLoginUI$6", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(mMFBLoginUI.getClass().getName());
        sb6.append(",L14,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L14"));
        sb6.append(",4");
        n71.a.b(10645, sb6.toString());
        mMFBLoginUI.finish();
    }
}
