package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class gc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f73884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f73885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg f73886f;

    public gc(com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg mobileLoginOrForceReg, com.tencent.mm.modelbase.m1 m1Var, java.lang.String str) {
        this.f73886f = mobileLoginOrForceReg;
        this.f73884d = m1Var;
        this.f73885e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String K = ((com.tencent.mm.modelsimple.z0) this.f73884d).K();
        com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg mobileLoginOrForceReg = this.f73886f;
        mobileLoginOrForceReg.f73509i = K;
        c01.b9.f37069c.d("login_user_name", this.f73885e);
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(mobileLoginOrForceReg);
        b17.addFlags(67108864);
        com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg mobileLoginOrForceReg2 = this.f73886f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mobileLoginOrForceReg2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$11", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mobileLoginOrForceReg2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mobileLoginOrForceReg2, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$11", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.gc.class.getName());
        sb6.append(",R200_600,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_600"));
        sb6.append(",4");
        n71.a.b(10645, sb6.toString());
        mobileLoginOrForceReg.V6();
        mobileLoginOrForceReg.finish();
    }
}
