package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class a0 implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16296x40c45249 f226280a;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16296x40c45249 c16296x40c45249) {
        this.f226280a = c16296x40c45249;
    }

    @Override // u60.e
    /* renamed from: onLocationAddr */
    public void mo24721x71c058c5(com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011) {
        c11121x1f1011.m48126x9616526c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16296x40c45249 c16296x40c45249 = this.f226280a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 d0Var = c16296x40c45249.f226239h;
        if (d0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PickPoi", "error, empty poi!");
            return;
        }
        if (!d0Var.a(c11121x1f1011) || c16296x40c45249.f226241m == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.v1 v1Var = c16296x40c45249.f226243o;
        if (v1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 d0Var2 = c16296x40c45249.f226239h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.r1) v1Var).f226424a;
            x1Var.f226457n.m65962x5c1d7e2b(null);
            if (d0Var2 != null) {
                com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f10112 = d0Var2.f226317j;
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 d0Var3 = x1Var.L1;
                d0Var3.a(c11121x1f10112);
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.c0 c0Var = x1Var.f226464s;
                if (c0Var != null) {
                    java.lang.String str = d0Var3.f226313f;
                    java.lang.String str2 = d0Var3.f226314g;
                    c0Var.f226302r = str;
                    c0Var.f226303s = str2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.c0 c0Var2 = x1Var.f226465t;
                    c0Var2.f226302r = str;
                    c0Var2.f226303s = str2;
                }
            }
        }
        c16296x40c45249.f226241m.notifyDataSetChanged();
    }
}
