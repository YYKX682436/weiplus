package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class tg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f155761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 f155763f;

    public tg(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, java.lang.String str) {
        this.f155763f = activityC11466x7d774b0;
        this.f155761d = m1Var;
        this.f155762e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String K = ((com.p314xaae8f345.mm.p957x53236a1b.z0) this.f155761d).K();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b0 = this.f155763f;
        activityC11466x7d774b0.f155170o = K;
        c01.b9.f118602c.d("login_user_name", this.f155762e);
        com.p314xaae8f345.mm.vfs.w6.h(lp0.b.j() + "temp.avatar");
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(activityC11466x7d774b0);
        b17.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0 activityC11466x7d774b02 = this.f155763f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11466x7d774b02, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegSetInfoUI$16", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11466x7d774b02.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11466x7d774b02, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$16", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(activityC11466x7d774b0.getClass().getName());
        sb6.append(",R200_900_phone,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_900_phone"));
        sb6.append(",4");
        n71.a.b(10645, sb6.toString());
        activityC11466x7d774b0.finish();
    }
}
