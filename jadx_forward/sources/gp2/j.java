package gp2;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gp2.l0 l0Var) {
        super(2);
        this.f355763d = l0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85380p8).mo141623x754a37bb()).r()).intValue() == 1) {
            pm0.v.X(new gp2.i(this.f355763d, longValue, longValue2));
        }
        return jz5.f0.f384359a;
    }
}
