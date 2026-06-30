package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class dg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.z0 f155342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 f155344f;

    public dg(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 activityC11462xec7fb918, com.p314xaae8f345.mm.p957x53236a1b.z0 z0Var, java.lang.String str) {
        this.f155344f = activityC11462xec7fb918;
        this.f155342d = z0Var;
        this.f155343e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String K = this.f155342d.K();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 activityC11462xec7fb918 = this.f155344f;
        activityC11462xec7fb918.f155131u = K;
        c01.b9.f118602c.d("login_user_name", this.f155343e);
        com.p314xaae8f345.mm.vfs.w6.h(lp0.b.j() + "temp.avatar");
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(activityC11462xec7fb918);
        b17.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918 activityC11462xec7fb9182 = this.f155344f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11462xec7fb9182, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$9", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11462xec7fb9182.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11462xec7fb9182, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI$9", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.dg.class.getName());
        sb6.append(",R200_600,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_600"));
        sb6.append(",4");
        n71.a.b(10645, sb6.toString());
        activityC11462xec7fb918.finish();
        activityC11462xec7fb918.U6();
    }
}
