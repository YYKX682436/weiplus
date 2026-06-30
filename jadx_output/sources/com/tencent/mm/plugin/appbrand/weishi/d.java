package com.tencent.mm.plugin.appbrand.weishi;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f90963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.weishi.i f90964e;

    public d(com.tencent.mm.plugin.appbrand.weishi.i iVar, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f90964e = iVar;
        this.f90963d = n7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.weishi.i iVar = this.f90964e;
        iVar.getClass();
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f90963d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(n7Var.getF147807d(), false, 1);
        iVar.f90971g = k0Var;
        k0Var.f211872n = new com.tencent.mm.plugin.appbrand.weishi.e(iVar);
        k0Var.f211881s = new com.tencent.mm.plugin.appbrand.weishi.f(iVar, n7Var);
        k0Var.T1 = true;
        k0Var.X1 = true;
        k0Var.v();
        n7Var.R(new com.tencent.mm.plugin.appbrand.weishi.g(iVar, n7Var));
        n7Var.w(new com.tencent.mm.plugin.appbrand.weishi.h(iVar, n7Var));
    }
}
