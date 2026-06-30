package ut;

/* loaded from: classes12.dex */
public final class n0 implements com.p314xaae8f345.mm.p947xba6de98f.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f512221a;

    public n0(ut.q0 q0Var) {
        this.f512221a = q0Var;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void b(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        if (n1Var != null) {
            if (n1Var.f152636a == com.p314xaae8f345.mm.p947xba6de98f.m1.f152613i) {
                ut.q0 q0Var = this.f512221a;
                java.lang.Integer e17 = qi3.c.e(q0Var, false, 1, null);
                if (e17 != null) {
                    e17.intValue();
                    sx.b0 b0Var = (sx.b0) i95.n0.c(sx.b0.class);
                    dn.m mVar = n1Var.f152639d;
                    java.lang.String str = mVar != null ? mVar.f69601xaca5bdda : null;
                    if (str == null) {
                        str = "";
                    }
                    ((rx.f) b0Var).Bi(str);
                    e17.intValue();
                    return;
                }
                if (q0Var.f445210f == qi3.g0.f445242h) {
                    dn.g gVar = n1Var.f152640e;
                    float f17 = gVar != null ? (float) gVar.f69496x83ec3dd : 0.0f;
                    if (gVar != null) {
                        java.lang.Long valueOf = java.lang.Long.valueOf(gVar.f69500x8ab84c59);
                        java.lang.Long l17 = valueOf.longValue() != 0 ? valueOf : null;
                        if (l17 != null) {
                            float longValue = (float) l17.longValue();
                            if (f17 < longValue) {
                                q0Var.d0(((f17 / longValue) * 50.0f) + 40.0f, true);
                            }
                        }
                    }
                }
            }
        }
    }
}
