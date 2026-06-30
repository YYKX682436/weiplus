package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes15.dex */
public class v1 extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 f171697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n3.z1 f171698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 f171699c;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 a2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var, n3.z1 z1Var) {
        this.f171699c = a2Var;
        this.f171697a = c1Var;
        this.f171698b = z1Var;
    }

    @Override // n3.d2, n3.c2
    public void a(android.view.View view) {
        if (view == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        view.setTranslationY(0.0f);
        n3.l1.m(view, 1.0f);
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        this.f171698b.d(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 a2Var = this.f171699c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var = this.f171697a;
        a2Var.h(c1Var);
        a2Var.K.remove(c1Var);
        if (a2Var.o()) {
            return;
        }
        a2Var.i();
    }

    @Override // n3.d2, n3.c2
    public void c(android.view.View view) {
        this.f171699c.getClass();
    }
}
