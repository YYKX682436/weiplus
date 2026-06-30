package cj5;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.s f42210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(cj5.s sVar) {
        super(1);
        this.f42210d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        java.util.LinkedList<java.lang.String> linkedList = state.f446319o;
        int i17 = 0;
        cj5.s sVar = this.f42210d;
        if (h0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiSelectContactMvvmListUIC", "InitAction");
            sVar.X6().b().setVisibility(0);
            sVar.X6().c().setVisibility(sVar.W6() ? 0 : 8);
            for (java.lang.String str : linkedList) {
                if (sVar.W6()) {
                    sVar.X6().c().d(str);
                } else {
                    sVar.X6().b().d(str);
                }
            }
        }
        wi5.t0 t0Var = (wi5.t0) state.a(wi5.t0.class);
        if (t0Var != null) {
            j75.e eVar = t0Var.f298067a;
            if (eVar == null || !(eVar instanceof wi5.w0)) {
                eVar = null;
            } else if (((wi5.w0) eVar).f446358b == wi5.u0.f446345d) {
                if (linkedList.size() == 0 || sVar.W6()) {
                    i17 = com.tencent.mm.ui.zk.e(sVar.getActivity(), com.tencent.mm.R.dimen.f479727dj);
                } else if (linkedList.size() == 1) {
                    i17 = com.tencent.mm.ui.zk.e(sVar.getActivity(), com.tencent.mm.R.dimen.f479734dr);
                }
                if (i17 > 0) {
                    sVar.Y6(i17);
                }
                boolean W6 = sVar.W6();
                ri5.j jVar = t0Var.f446341b;
                if (W6) {
                    sVar.X6().c().d(jVar.f396111f);
                } else {
                    sVar.X6().b().d(jVar.f396111f);
                }
                jVar.getClass();
                if (jVar.f396113h.d(jVar)) {
                    sVar.X6().b().c();
                    sVar.X6().b().clearFocus();
                    sVar.hideVKB();
                }
            }
        }
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.x0)) {
            if (linkedList.size() == 0) {
                sVar.Y6(com.tencent.mm.ui.zk.e(sVar.getActivity(), com.tencent.mm.R.dimen.f479727dj));
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.m0)) {
            cj5.s.V6(sVar, state);
        }
        if (((wi5.j0) state.a(wi5.j0.class)) != null) {
            cj5.s.U6(sVar, state);
            cj5.s.V6(sVar, state);
        }
        if (((wi5.b) state.a(wi5.b.class)) != null) {
            cj5.s.U6(sVar, state);
        }
        if (((wi5.r) state.a(wi5.r.class)) != null) {
            cj5.s.U6(sVar, state);
            cj5.s.V6(sVar, state);
        }
        if (((wi5.r) state.a(wi5.r.class)) != null) {
            cj5.s.U6(sVar, state);
            cj5.s.V6(sVar, state);
        }
        if (((wi5.k0) state.a(wi5.k0.class)) != null) {
            cj5.s.U6(sVar, state);
            cj5.s.V6(sVar, state);
        }
        return jz5.f0.f302826a;
    }
}
