package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class bd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f73749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f73750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.qd f73751f;

    public bd(com.tencent.mm.plugin.account.ui.qd qdVar, com.tencent.mm.modelbase.m1 m1Var, java.lang.String str) {
        this.f73751f = qdVar;
        this.f73749d = m1Var;
        this.f73750e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mm.modelsimple.z0) this.f73749d).K();
        com.tencent.mm.plugin.account.ui.qd qdVar = this.f73751f;
        qdVar.getClass();
        c01.b9.f37069c.d("login_user_name", this.f73750e);
        com.tencent.mm.vfs.w6.h(lp0.b.j() + "temp.avatar");
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(qdVar.f74139d);
        b17.addFlags(67108864);
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = qdVar.f74139d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mobileVerifyUI, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mobileVerifyUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mobileVerifyUI, "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(qdVar.f74139d.getClass().getName());
        sb6.append(",R200_900_phone,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_900_phone"));
        sb6.append(",4");
        n71.a.b(10645, sb6.toString());
        qdVar.c();
        qdVar.f74139d.finish();
    }
}
