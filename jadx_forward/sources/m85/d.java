package m85;

/* loaded from: classes14.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2615x3a3fddcb.ActivityC21040xa43a551f f406363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p2615x3a3fddcb.ActivityC21040xa43a551f activityC21040xa43a551f) {
        super(2);
        this.f406363d = activityC21040xa43a551f;
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
        m85.h.a(u0.j.b(oVar, 2099685198, true, new m85.c(this.f406363d)), oVar, 6);
        return jz5.f0.f384359a;
    }
}
