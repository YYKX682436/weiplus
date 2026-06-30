package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir2.z1 f188065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ir2.z1 z1Var) {
        super(1);
        this.f188065d = z1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ir2.v1 state = (ir2.v1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        ir2.z1 z1Var = this.f188065d;
        z1Var.getClass();
        boolean z17 = state instanceof ir2.u1;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = z1Var.f375788d;
        if (z17) {
            c22801x87cbdc00.mo15404x8041b4e4(((ir2.u1) state).f375760a.a());
        } else if (state instanceof ir2.t1) {
            if (z1Var.f375789e) {
                c22801x87cbdc00.mo56054xc12c74c0(((ir2.t1) state).f375756a.a());
            } else {
                c22801x87cbdc00.mo15403x2053b072(((ir2.t1) state).f375756a.a());
            }
        }
        return jz5.f0.f384359a;
    }
}
