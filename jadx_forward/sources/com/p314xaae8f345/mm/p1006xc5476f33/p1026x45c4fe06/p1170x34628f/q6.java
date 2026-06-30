package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168570d;

    public q6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        this.f168570d = v5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168570d;
        al1.b bVar = (al1.b) v5Var.A1().a(v5Var.getF229340d(), al1.b.class);
        v5Var.H = bVar;
        bVar.mo2206x5ca2d9f1().setId(v5Var.f168702z);
        v5Var.H.mo2215x1ae0b121(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r6(v5Var));
        v5Var.H.mo2218x262881b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s6(v5Var));
        al1.b bVar2 = v5Var.H;
        bVar2.E.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t6(v5Var));
        bVar2.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d.f171933e.mo53086xdac2174d(), bVar2.m2212xefd74969());
        v5Var.H.m2230x9b5ddf53(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x6(v5Var));
        al1.l lVar = (al1.l) v5Var.A1().a(v5Var.getF229340d(), al1.l.class);
        v5Var.G = lVar;
        lVar.setId(com.p314xaae8f345.mm.R.id.f564621w9);
        v5Var.G.m2239xb6ab3395(false);
        v5Var.G.m2240x5d3252c8(false);
        v5Var.G.addView(v5Var.H, new android.view.ViewGroup.LayoutParams(-1, -2));
        v5Var.R(v5Var.G);
        v5Var.U(v5Var.H);
        v5Var.R(v5Var.H);
        v5Var.G.D(v5Var.getF229340d());
        v5Var.F.addView(v5Var.G, -1, new android.view.ViewGroup.LayoutParams(-1, -2));
        v5Var.Q1().o(v5Var.H);
        if (v5Var.H.getParent() != v5Var.G) {
            throw new java.lang.IllegalAccessError("You should not modify actionbar's view hierarchy");
        }
    }
}
