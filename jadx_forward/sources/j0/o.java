package j0;

/* loaded from: classes14.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.d f378003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f378004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f378005f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a2.d dVar, java.util.List list, int i17) {
        super(2);
        this.f378003d = dVar;
        this.f378004e = list;
        this.f378005f = i17;
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
        j0.t1.a(this.f378003d, this.f378004e, oVar, (this.f378005f & 14) | 64);
        return jz5.f0.f384359a;
    }
}
