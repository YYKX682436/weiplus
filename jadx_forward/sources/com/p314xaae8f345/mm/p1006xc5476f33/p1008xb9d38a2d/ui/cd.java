package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class cd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f155308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qd f155310f;

    public cd(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qd qdVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, java.lang.String str) {
        this.f155310f = qdVar;
        this.f155308d = m1Var;
        this.f155309e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.p314xaae8f345.mm.p957x53236a1b.z0) this.f155308d).K();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qd qdVar = this.f155310f;
        qdVar.getClass();
        c01.b9.f118602c.d("login_user_name", this.f155309e);
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(qdVar.f155672d);
        b17.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af = qdVar.f155672d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11457x794a57af, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic$11", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11457x794a57af.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11457x794a57af, "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic$11", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(qdVar.f155672d.getClass().getName());
        sb6.append(",R200_900_phone,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_900_phone"));
        sb6.append(",4");
        n71.a.b(10645, sb6.toString());
        qdVar.c();
        qdVar.f155672d.finish();
    }
}
