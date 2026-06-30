package k0;

/* loaded from: classes14.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.f f384448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f384449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(p2.f fVar, n0.v2 v2Var) {
        super(1);
        this.f384448d = fVar;
        this.f384449e = v2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        z0.t tVar;
        yz5.a center = (yz5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(center, "center");
        z0.p pVar = z0.p.f550454d;
        a0.j2 style = a0.j2.f81721d;
        k0.e1 e1Var = new k0.e1(center);
        k0.f1 f1Var = new k0.f1(this.f384448d, this.f384449e);
        y1.o0 o0Var = a0.i2.f81710a;
        a0.x1 x1Var = a0.x1.f81865d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3 e3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 28) {
            if (!(i17 >= 28)) {
                throw new java.lang.UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            }
            tVar = z0.m.b(pVar, null, new a0.h2(e1Var, x1Var, Float.NaN, f1Var, i17 == 28 ? a0.u2.f81842a : a0.w2.f81861a, style), 1, null);
        } else {
            tVar = pVar;
        }
        return p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.a(pVar, e3Var, tVar);
    }
}
