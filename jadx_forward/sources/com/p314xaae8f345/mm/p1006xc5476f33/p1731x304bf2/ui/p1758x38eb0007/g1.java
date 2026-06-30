package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class g1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.h1 f223088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.j1 f223090f;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.j1 j1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.h1 h1Var, android.view.View view) {
        this.f223090f = j1Var;
        this.f223088d = h1Var;
        this.f223089e = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 11) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().mo9951xb06685ab(this.f223088d.f223095a, new java.lang.String[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.i1 i1Var = this.f223090f.f223109e;
            if (i1Var != null) {
                i1Var.a();
                return;
            }
            return;
        }
        if (menuItem.getItemId() != 12) {
            if (menuItem.getItemId() == 13) {
                r53.f.C(this.f223088d.f223095a.K2.f222094s, false);
                db5.t7.h(this.f223089e.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpc));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fon));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.foo);
        u1Var.a(true);
        u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.f1(this));
        u1Var.e(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.e1(this));
        u1Var.q(false);
    }
}
