package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class cb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa f155305d;

    public cb(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa saVar) {
        this.f155305d = saVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa saVar = this.f155305d;
        android.content.Intent b17 = y7Var.b(saVar.f155721d);
        b17.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = saVar.f155721d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11453xa58e34bc, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$18", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11453xa58e34bc.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11453xa58e34bc, "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic$18", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        saVar.f155721d.finish();
        v61.d.f(2);
    }
}
