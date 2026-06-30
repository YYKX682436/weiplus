package s2;

/* loaded from: classes13.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f483780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n0.e5 e5Var) {
        super(2);
        this.f483780d = e5Var;
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
        n0.h3 h3Var = s2.v.f483787a;
        ((yz5.p) this.f483780d.mo128745x754a37bb()).mo149xb9724478(oVar, 0);
        return jz5.f0.f384359a;
    }
}
