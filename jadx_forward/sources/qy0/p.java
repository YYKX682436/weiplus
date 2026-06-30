package qy0;

/* loaded from: classes5.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f449165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f449166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.l f449167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f449168g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(qy0.d0 d0Var, int i17, dz0.l lVar, java.util.List list) {
        super(2);
        this.f449165d = d0Var;
        this.f449166e = i17;
        this.f449167f = lVar;
        this.f449168g = list;
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
        tz0.a0.a(u0.j.b(oVar, -1465541417, true, new qy0.o(this.f449165d, this.f449166e, this.f449167f, this.f449168g)), oVar, 6);
        return jz5.f0.f384359a;
    }
}
