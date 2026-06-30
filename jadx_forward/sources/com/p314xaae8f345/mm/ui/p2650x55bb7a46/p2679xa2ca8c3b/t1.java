package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class t1 implements com.p314xaae8f345.mm.p2621x8fb0427b.a9 {

    /* renamed from: d, reason: collision with root package name */
    public final ot0.q f287081d;

    public t1(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String U1 = f9Var.U1();
        if (U1 != null) {
            this.f287081d = ot0.q.v(U1);
        } else {
            this.f287081d = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a9
    public boolean U(java.lang.Object obj) {
        ot0.q qVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t1 t1Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t1) obj;
        ot0.q qVar2 = this.f287081d;
        return (qVar2 == null || (qVar = t1Var.f287081d) == null || qVar2.f430215m != qVar.f430215m) ? false : true;
    }
}
