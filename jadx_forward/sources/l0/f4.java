package l0;

/* loaded from: classes14.dex */
public final class f4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f395725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f395726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f395727f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f395728g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(java.lang.Float f17, yz5.p pVar, int i17, long j17) {
        super(2);
        this.f395725d = f17;
        this.f395726e = pVar;
        this.f395727f = i17;
        this.f395728g = j17;
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
        int i17 = this.f395727f;
        yz5.p pVar = this.f395726e;
        java.lang.Float f17 = this.f395725d;
        if (f17 != null) {
            n0.y0 y0Var2 = (n0.y0) oVar;
            y0Var2.U(-452622131);
            n0.n1.a(new n0.i3[]{l0.n.f395917a.b(f17)}, pVar, oVar, ((i17 >> 6) & 112) | 8);
            y0Var2.o(false);
        } else {
            n0.y0 y0Var3 = (n0.y0) oVar;
            y0Var3.U(-452621951);
            n0.n1.a(new n0.i3[]{l0.n.f395917a.b(java.lang.Float.valueOf(e1.y.d(this.f395728g)))}, pVar, oVar, ((i17 >> 6) & 112) | 8);
            y0Var3.o(false);
        }
        return jz5.f0.f384359a;
    }
}
