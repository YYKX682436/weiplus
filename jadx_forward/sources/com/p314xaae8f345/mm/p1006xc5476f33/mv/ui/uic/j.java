package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class j implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q f232745d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q qVar) {
        this.f232745d = qVar;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        pm3.a state = (pm3.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar == null || !(dVar instanceof pm3.d)) {
            return;
        }
        pm3.d dVar2 = (pm3.d) dVar;
        int ordinal = dVar2.f438408b.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q qVar = this.f232745d;
        im3.j jVar = dVar2.f438409c;
        if (ordinal == 0) {
            qVar.P6().setChecked(jVar.f374235h);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        qVar.P6().setChecked(jVar.f374235h);
        im3.g gVar = qVar.f232898h;
        java.lang.String str = jVar.f374234g;
        if (gVar != null) {
            gVar.f374224e = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16664x54fdbbae c16664x54fdbbae = qVar.f232899i;
        if (c16664x54fdbbae != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.r(c16664x54fdbbae, null, 1, null);
        }
        r45.oc5 oc5Var = state.f438401e;
        if (oc5Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16664x54fdbbae c16664x54fdbbae2 = qVar.f232899i;
            xm3.n0 n0Var = c16664x54fdbbae2 != null ? c16664x54fdbbae2.f233591e : null;
            if (n0Var == null) {
                return;
            }
            n0Var.d(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q.O6(qVar, oc5Var, str, jVar.f374231d));
        }
    }
}
