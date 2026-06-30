package m50;

/* loaded from: classes.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m50.x f405031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m50.x xVar) {
        super(0);
        this.f405031d = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        m50.x xVar = this.f405031d;
        co.a c76 = xVar.c7();
        if (c76.m75942xfb822ef2(c76.f125235d + 0) <= 0) {
            co.a c77 = xVar.c7();
            if (c77.m75942xfb822ef2(c77.f125235d + 2) == 0) {
                return null;
            }
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        co.a c78 = xVar.c7();
        java.lang.String m75945x2fec8307 = c78.m75945x2fec8307(c78.f125235d + 1);
        co.a c79 = xVar.c7();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(m75945x2fec8307, c79.m75942xfb822ef2(c79.f125235d + 0));
        if (k17 != null) {
            return k17;
        }
        co.a c710 = xVar.c7();
        java.lang.String m75945x2fec83072 = c710.m75945x2fec8307(c710.f125235d + 1);
        co.a c711 = xVar.c7();
        return e0Var.l(m75945x2fec83072, c711.m75942xfb822ef2(c711.f125235d + 2));
    }
}
