package bj5;

/* loaded from: classes.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.f0 f102710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(bj5.f0 f0Var) {
        super(1);
        this.f102710d = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        java.util.LinkedList linkedList = state.f527852o;
        int i17 = 0;
        j75.e eVar = null;
        bj5.f0 f0Var = this.f102710d;
        if (h0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiSelectAtSomeOneMvvmListUIC", "InitAction");
            f0Var.V6().b().setVisibility(0);
            android.view.View findViewById = f0Var.V6().b().findViewById(com.p314xaae8f345.mm.R.id.m7g);
            if (findViewById != null) {
                findViewById.setBackground(null);
            }
            android.view.View findViewById2 = f0Var.V6().b().findViewById(com.p314xaae8f345.mm.R.id.f567597k12);
            if (findViewById2 != null) {
                findViewById2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ahm);
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                f0Var.V6().b().d((java.lang.String) it.next());
            }
        }
        wi5.t0 t0Var = (wi5.t0) state.a(wi5.t0.class);
        if (t0Var != null) {
            j75.e eVar2 = t0Var.f379600a;
            if (eVar2 != null && (eVar2 instanceof wi5.w0)) {
                if (((wi5.w0) eVar2).f527891b == wi5.u0.f527878d) {
                    if (linkedList.size() == 0) {
                        i17 = com.p314xaae8f345.mm.ui.zk.e(f0Var.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
                    } else if (linkedList.size() == 1) {
                        i17 = com.p314xaae8f345.mm.ui.zk.e(f0Var.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr);
                    }
                    if (i17 > 0) {
                        bj5.f0.U6(f0Var, i17);
                    }
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 b17 = f0Var.V6().b();
                    ri5.j jVar = t0Var.f527874b;
                    b17.d(jVar.f477644f);
                    if (jVar.f477646h.d(jVar)) {
                        f0Var.V6().b().c();
                        f0Var.V6().b().clearFocus();
                        f0Var.m174141x36654fab();
                    }
                }
                eVar = eVar2;
            }
        }
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.x0)) {
            if (linkedList.size() == 0) {
                bj5.f0.U6(f0Var, com.p314xaae8f345.mm.ui.zk.e(f0Var.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj));
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.b)) {
            f0Var.V6().b().f();
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof wi5.m0)) {
            java.util.List list = ((wi5.m0) dVar3).f527843b;
            int e17 = list.isEmpty() ^ true ? com.p314xaae8f345.mm.ui.zk.e(f0Var.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr) : com.p314xaae8f345.mm.ui.zk.e(f0Var.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
            if (e17 > 0) {
                bj5.f0.U6(f0Var, e17);
            }
            f0Var.V6().b().e(list);
        }
        return jz5.f0.f384359a;
    }
}
