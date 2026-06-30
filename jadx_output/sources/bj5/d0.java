package bj5;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.f0 f21177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(bj5.f0 f0Var) {
        super(1);
        this.f21177d = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        java.util.LinkedList linkedList = state.f446319o;
        int i17 = 0;
        j75.e eVar = null;
        bj5.f0 f0Var = this.f21177d;
        if (h0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiSelectAtSomeOneMvvmListUIC", "InitAction");
            f0Var.V6().b().setVisibility(0);
            android.view.View findViewById = f0Var.V6().b().findViewById(com.tencent.mm.R.id.m7g);
            if (findViewById != null) {
                findViewById.setBackground(null);
            }
            android.view.View findViewById2 = f0Var.V6().b().findViewById(com.tencent.mm.R.id.f486064k12);
            if (findViewById2 != null) {
                findViewById2.setBackgroundResource(com.tencent.mm.R.drawable.ahm);
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                f0Var.V6().b().d((java.lang.String) it.next());
            }
        }
        wi5.t0 t0Var = (wi5.t0) state.a(wi5.t0.class);
        if (t0Var != null) {
            j75.e eVar2 = t0Var.f298067a;
            if (eVar2 != null && (eVar2 instanceof wi5.w0)) {
                if (((wi5.w0) eVar2).f446358b == wi5.u0.f446345d) {
                    if (linkedList.size() == 0) {
                        i17 = com.tencent.mm.ui.zk.e(f0Var.getActivity(), com.tencent.mm.R.dimen.f479727dj);
                    } else if (linkedList.size() == 1) {
                        i17 = com.tencent.mm.ui.zk.e(f0Var.getActivity(), com.tencent.mm.R.dimen.f479734dr);
                    }
                    if (i17 > 0) {
                        bj5.f0.U6(f0Var, i17);
                    }
                    com.tencent.mm.pluginsdk.ui.MultiSelectContactView b17 = f0Var.V6().b();
                    ri5.j jVar = t0Var.f446341b;
                    b17.d(jVar.f396111f);
                    if (jVar.f396113h.d(jVar)) {
                        f0Var.V6().b().c();
                        f0Var.V6().b().clearFocus();
                        f0Var.hideVKB();
                    }
                }
                eVar = eVar2;
            }
        }
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.x0)) {
            if (linkedList.size() == 0) {
                bj5.f0.U6(f0Var, com.tencent.mm.ui.zk.e(f0Var.getActivity(), com.tencent.mm.R.dimen.f479727dj));
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.b)) {
            f0Var.V6().b().f();
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof wi5.m0)) {
            java.util.List list = ((wi5.m0) dVar3).f446310b;
            int e17 = list.isEmpty() ^ true ? com.tencent.mm.ui.zk.e(f0Var.getActivity(), com.tencent.mm.R.dimen.f479734dr) : com.tencent.mm.ui.zk.e(f0Var.getActivity(), com.tencent.mm.R.dimen.f479727dj);
            if (e17 > 0) {
                bj5.f0.U6(f0Var, e17);
            }
            f0Var.V6().b().e(list);
        }
        return jz5.f0.f302826a;
    }
}
