package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class cb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.sa f73772d;

    public cb(com.tencent.mm.plugin.account.ui.sa saVar) {
        this.f73772d = saVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        com.tencent.mm.plugin.account.ui.sa saVar = this.f73772d;
        android.content.Intent b17 = y7Var.b(saVar.f74188d);
        b17.addFlags(67108864);
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = saVar.f74188d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mobileInputUI, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$18", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mobileInputUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mobileInputUI, "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$18", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        saVar.f74188d.finish();
        v61.d.f(2);
    }
}
