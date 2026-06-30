package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class z implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0 f233092d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0 c0Var) {
        this.f233092d = c0Var;
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
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0 c0Var = this.f233092d;
        im3.j jVar = dVar2.f438409c;
        if (ordinal == 0 || ordinal == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16666xe1e8fad2 c16666xe1e8fad2 = c0Var.f232602g;
            if (c16666xe1e8fad2 != null) {
                c16666xe1e8fad2.z(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y(jVar));
                return;
            }
            return;
        }
        if (ordinal != 2) {
            return;
        }
        if (!jVar.f374235h) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16666xe1e8fad2 c16666xe1e8fad22 = c0Var.f232602g;
            if (c16666xe1e8fad22 != null) {
                c16666xe1e8fad22.u(jVar);
                return;
            }
            return;
        }
        im3.j jVar2 = (im3.j) jVar.y0();
        jVar2.f374232e = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16666xe1e8fad2 c16666xe1e8fad23 = c0Var.f232602g;
        if (c16666xe1e8fad23 != null) {
            c16666xe1e8fad23.y(jVar2, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16666xe1e8fad2 c16666xe1e8fad24 = c0Var.f232602g;
        if (c16666xe1e8fad24 != null) {
            c16666xe1e8fad24.z(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x(jVar));
        }
    }
}
