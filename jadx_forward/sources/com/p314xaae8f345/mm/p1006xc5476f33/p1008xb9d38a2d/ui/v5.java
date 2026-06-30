package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11418xe15aceb2 f155798d;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11418xe15aceb2 activityC11418xe15aceb2) {
        this.f155798d = activityC11418xe15aceb2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11418xe15aceb2 activityC11418xe15aceb2 = this.f155798d;
        android.content.Intent b17 = y7Var.b(activityC11418xe15aceb2);
        b17.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11418xe15aceb2 activityC11418xe15aceb22 = this.f155798d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11418xe15aceb22, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginIndepPass$14", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11418xe15aceb22.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11418xe15aceb22, "com/tencent/mm/plugin/account/ui/LoginIndepPass$14", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11418xe15aceb2.finish();
    }
}
