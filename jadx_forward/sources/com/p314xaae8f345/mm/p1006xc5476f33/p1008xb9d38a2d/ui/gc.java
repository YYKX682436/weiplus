package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class gc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f155417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11456xd84e63d3 f155419f;

    public gc(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11456xd84e63d3 activityC11456xd84e63d3, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, java.lang.String str) {
        this.f155419f = activityC11456xd84e63d3;
        this.f155417d = m1Var;
        this.f155418e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String K = ((com.p314xaae8f345.mm.p957x53236a1b.z0) this.f155417d).K();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11456xd84e63d3 activityC11456xd84e63d3 = this.f155419f;
        activityC11456xd84e63d3.f155042i = K;
        c01.b9.f118602c.d("login_user_name", this.f155418e);
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(activityC11456xd84e63d3);
        b17.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11456xd84e63d3 activityC11456xd84e63d32 = this.f155419f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11456xd84e63d32, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$11", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11456xd84e63d32.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11456xd84e63d32, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$11", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.gc.class.getName());
        sb6.append(",R200_600,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_600"));
        sb6.append(",4");
        n71.a.b(10645, sb6.toString());
        activityC11456xd84e63d3.V6();
        activityC11456xd84e63d3.finish();
    }
}
