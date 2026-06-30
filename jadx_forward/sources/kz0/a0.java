package kz0;

/* loaded from: classes5.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 f395186d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 c1Var) {
        super(2);
        this.f395186d = c1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj3 = n0.e1.f415025a;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.q4.g(this.f395186d, oVar, 8);
        return jz5.f0.f384359a;
    }
}
