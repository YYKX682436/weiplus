package a0;

/* loaded from: classes14.dex */
public final class g3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f81675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f81676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f81677f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0.m3 f81678g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f81679h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(boolean z17, boolean z18, boolean z19, a0.m3 m3Var, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        super(1);
        this.f81675d = z17;
        this.f81676e = z18;
        this.f81677f = z19;
        this.f81678g = m3Var;
        this.f81679h = y0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(semantics, "$this$semantics");
        a0.m3 m3Var = this.f81678g;
        y1.j jVar = new y1.j(new a0.e3(m3Var), new a0.f3(m3Var), this.f81675d);
        boolean z17 = this.f81676e;
        if (z17) {
            y1.m0.g(semantics, jVar);
        } else {
            y1.m0.e(semantics, jVar);
        }
        if (this.f81677f) {
            y1.m0.c(semantics, null, new a0.d3(this.f81679h, z17, m3Var), 1, null);
        }
        return jz5.f0.f384359a;
    }
}
