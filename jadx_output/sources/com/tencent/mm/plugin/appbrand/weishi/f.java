package com.tencent.mm.plugin.appbrand.weishi;

/* loaded from: classes7.dex */
public class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f90965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.weishi.i f90966e;

    public f(com.tencent.mm.plugin.appbrand.weishi.i iVar, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f90966e = iVar;
        this.f90965d = n7Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f90965d;
            com.tencent.mm.plugin.appbrand.menu.u0 H1 = n7Var.H1(3);
            android.content.Context f147807d = n7Var.getF147807d();
            com.tencent.mm.plugin.appbrand.report.v0.e(n7Var.getAppId(), n7Var.X1(), 39, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
            com.tencent.mm.plugin.appbrand.weishi.c.a(n7Var.getRuntime());
            com.tencent.mm.plugin.appbrand.menu.z0.b(f147807d, n7Var, H1, null);
            com.tencent.mm.plugin.appbrand.weishi.i.C(this.f90966e);
        }
    }
}
