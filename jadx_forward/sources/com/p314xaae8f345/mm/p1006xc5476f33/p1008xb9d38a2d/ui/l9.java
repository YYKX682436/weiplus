package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class l9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 f155540d;

    public l9(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 activityC11450xd4511c1) {
        this.f155540d = activityC11450xd4511c1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 activityC11450xd4511c1 = this.f155540d;
        android.content.Intent b17 = y7Var.b(activityC11450xd4511c1);
        b17.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 activityC11450xd4511c12 = this.f155540d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11450xd4511c12, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MMFBLoginUI$6", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11450xd4511c12.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11450xd4511c12, "com/tencent/mm/plugin/account/ui/MMFBLoginUI$6", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(activityC11450xd4511c1.getClass().getName());
        sb6.append(",L14,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L14"));
        sb6.append(",4");
        n71.a.b(10645, sb6.toString());
        activityC11450xd4511c1.finish();
    }
}
