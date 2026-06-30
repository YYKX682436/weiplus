package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes15.dex */
public class t1 extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.c1 f90155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.a2 f90156b;

    public t1(com.tencent.mm.plugin.appbrand.ui.recents.a2 a2Var, com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var) {
        this.f90156b = a2Var;
        this.f90155a = c1Var;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        view.setTranslationY(0.0f);
        n3.l1.m(view, 1.0f);
        com.tencent.mm.plugin.appbrand.ui.recents.a2 a2Var = this.f90156b;
        com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var = this.f90155a;
        a2Var.y(c1Var);
        a2Var.G.remove(c1Var);
        if (a2Var.o()) {
            return;
        }
        a2Var.i();
    }

    @Override // n3.d2, n3.c2
    public void c(android.view.View view) {
        this.f90156b.C(this.f90155a);
    }
}
