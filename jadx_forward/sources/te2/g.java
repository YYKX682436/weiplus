package te2;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.kv1 f499559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.l f499560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.g f499561f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r45.kv1 kv1Var, te2.l lVar, dk2.g gVar) {
        super(0);
        this.f499559d = kv1Var;
        this.f499560e = lVar;
        this.f499561f = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.f2 f2Var = ml2.f2.f408958g;
        r45.kv1 kv1Var = this.f499559d;
        java.lang.String m75945x2fec8307 = kv1Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        r0Var.Yj(f2Var, m75945x2fec8307);
        te2.l lVar = this.f499560e;
        qo0.c cVar = lVar.f499715g;
        qo0.b bVar = qo0.b.T4;
        android.os.Bundle bundle = new android.os.Bundle();
        if (!dk2.u7.f315714a.g(ce2.i.U1.b(kv1Var))) {
            bundle.putString("PARAM_FINDER_LIVE_ALLOWANCE_GIFT_ICON_URL", kv1Var.m75945x2fec8307(2));
        }
        cVar.mo46557x60d69242(bVar, bundle);
        return p3325xe03a0797.p3326xc267989b.l.d(lVar.f499720o, null, null, new te2.f(lVar, kv1Var, this.f499561f, null), 3, null);
    }
}
