package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t f290886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t tVar) {
        super(1);
        this.f290886d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t tVar = this.f290886d;
        if (dVar != null && (dVar instanceof wi5.e)) {
            tVar.W6(state);
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.b)) {
            tVar.W6(state);
        }
        wi5.t0 t0Var = (wi5.t0) state.a(wi5.t0.class);
        if (t0Var != null) {
            j75.e eVar = t0Var.f379600a;
            if (eVar == null || !(eVar instanceof wi5.w0)) {
                eVar = null;
            } else {
                if (((wi5.w0) eVar).f527891b == wi5.u0.f527878d) {
                    tVar.V6(t0Var.f527874b.f477644f);
                }
            }
        }
        wi5.x0 x0Var = (wi5.x0) state.a(wi5.x0.class);
        if (x0Var != null) {
            tVar.V6(x0Var.f527894b);
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof wi5.m0)) {
            wi5.m0 m0Var = (wi5.m0) dVar3;
            java.util.Iterator it = tVar.f290898d.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.v8 v8Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.v8) it.next();
                v8Var.f288753d.f288766c = false;
                java.util.List<java.lang.String> list = m0Var.f527843b;
                if (list != null) {
                    for (java.lang.String str : list) {
                        com.p314xaae8f345.mm.ui.p2690x38b72420.w8 w8Var = v8Var.f288753d;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(w8Var.f288764a, str)) {
                            w8Var.f288766c = true;
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = tVar.f290900f;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8146xced61ae5();
            }
        }
        j75.d dVar4 = state.f379599d;
        if (dVar4 != null && (dVar4 instanceof wi5.c0)) {
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t.U6(tVar);
        }
        j75.d dVar5 = state.f379599d;
        if (dVar5 != null && (dVar5 instanceof xi5.e)) {
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t.U6(tVar);
        }
        j75.d dVar6 = state.f379599d;
        if (dVar6 != null && (dVar6 instanceof wi5.k)) {
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t.U6(tVar);
        }
        return jz5.f0.f384359a;
    }
}
