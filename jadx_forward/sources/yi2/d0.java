package yi2;

/* loaded from: classes10.dex */
public final class d0 implements si2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f544039a;

    public d0(yi2.i0 i0Var) {
        this.f544039a = i0Var;
    }

    @Override // si2.b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l a() {
        return this.f544039a.f544053f;
    }

    @Override // si2.b
    public void b(dk2.m battleData, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleData, "battleData");
        fj2.s sVar = fj2.s.f344716a;
        if (battleData.f315271a != 2) {
            sVar.a(ml2.k1.f409173g);
        } else if (battleData.f315275e != 3) {
            sVar.a(ml2.k1.f409174h);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c2 c2Var = this.f544039a.f544050J;
        if (c2Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7.t1(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p7) c2Var).f195371a, battleData, lVar);
        }
    }

    @Override // si2.b
    /* renamed from: onCancel */
    public void mo164628x3d6f0539() {
        yi2.i0 i0Var = this.f544039a;
        i0Var.f544053f.f446856d.setBackground(i0Var.f544052e.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560852w5));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = i0Var.f544053f.f196573t;
        c22613xe7040d9c.animate().translationY(0.0f);
        c22613xe7040d9c.f();
    }
}
