package bj5;

/* loaded from: classes.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.d1 f102771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(bj5.d1 d1Var) {
        super(1);
        this.f102771d = d1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        bj5.d1 d1Var = this.f102771d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            d1Var.W6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = d1Var.P6();
            if (P6 != null) {
                P6.mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new bj5.t0(d1Var));
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.e)) {
            if (state.e()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = d1Var.P6();
                if (P62 != null) {
                    P62.m78548x39037dd1();
                    P62.mo74406x9c8c0d33(new bj5.z0(d1Var), com.p314xaae8f345.mm.R.raw.f78354xfa054953);
                }
            } else {
                d1Var.W6();
            }
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof wi5.b)) {
            if (state.e()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P63 = d1Var.P6();
                if (P63 != null) {
                    P63.m78548x39037dd1();
                    P63.mo74406x9c8c0d33(new bj5.z0(d1Var), com.p314xaae8f345.mm.R.raw.f78354xfa054953);
                }
            } else {
                d1Var.W6();
            }
        }
        return jz5.f0.f384359a;
    }
}
