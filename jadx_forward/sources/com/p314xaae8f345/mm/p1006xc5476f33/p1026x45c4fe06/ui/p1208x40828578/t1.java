package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes15.dex */
public class t1 extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 f171688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 f171689b;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 a2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var) {
        this.f171689b = a2Var;
        this.f171688a = c1Var;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        view.setTranslationY(0.0f);
        n3.l1.m(view, 1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 a2Var = this.f171689b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var = this.f171688a;
        a2Var.y(c1Var);
        a2Var.G.remove(c1Var);
        if (a2Var.o()) {
            return;
        }
        a2Var.i();
    }

    @Override // n3.d2, n3.c2
    public void c(android.view.View view) {
        this.f171689b.C(this.f171688a);
    }
}
