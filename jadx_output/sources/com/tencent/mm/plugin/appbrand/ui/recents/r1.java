package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes15.dex */
public class r1 extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.c1 f90144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n3.z1 f90145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.a2 f90146c;

    public r1(com.tencent.mm.plugin.appbrand.ui.recents.a2 a2Var, com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var, n3.z1 z1Var) {
        this.f90146c = a2Var;
        this.f90144a = c1Var;
        this.f90145b = z1Var;
    }

    @Override // n3.d2, n3.c2
    public void a(android.view.View view) {
        if (view == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        view.setTranslationY(0.0f);
        n3.l1.m(view, 1.0f);
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        this.f90145b.d(null);
        com.tencent.mm.plugin.appbrand.ui.recents.a2 a2Var = this.f90146c;
        com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var = this.f90144a;
        a2Var.h(c1Var);
        a2Var.C.remove(c1Var);
        if (a2Var.o()) {
            return;
        }
        a2Var.i();
    }

    @Override // n3.d2, n3.c2
    public void c(android.view.View view) {
        this.f90146c.getClass();
    }
}
