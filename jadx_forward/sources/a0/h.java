package a0;

/* loaded from: classes14.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f81680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.r f81681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f81682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f81683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f81684h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f81685i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f81686m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g1.n f81687n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z17, e1.r rVar, long j17, float f17, float f18, long j18, long j19, g1.n nVar) {
        super(1);
        this.f81680d = z17;
        this.f81681e = rVar;
        this.f81682f = j17;
        this.f81683g = f17;
        this.f81684h = f18;
        this.f81685i = j18;
        this.f81686m = j19;
        this.f81687n = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g1.f onDrawWithContent = (g1.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDrawWithContent, "$this$onDrawWithContent");
        u1.o0 o0Var = (u1.o0) onDrawWithContent;
        o0Var.b();
        if (this.f81680d) {
            g1.h.i(onDrawWithContent, this.f81681e, 0L, 0L, this.f81682f, 0.0f, null, null, 0, 246, null);
        } else {
            long j17 = this.f81682f;
            float b17 = d1.a.b(j17);
            float f17 = this.f81683g;
            if (b17 < f17) {
                float f18 = this.f81684h;
                float d17 = d1.k.d(o0Var.a());
                float f19 = this.f81684h;
                float f27 = d17 - f19;
                float b18 = d1.k.b(o0Var.a()) - f19;
                e1.r rVar = this.f81681e;
                long j18 = this.f81682f;
                g1.b bVar = (g1.b) o0Var.p();
                long b19 = bVar.b();
                bVar.a().c();
                ((g1.d) bVar.f349037a).a(f18, f18, f27, b18, 0);
                g1.h.i(onDrawWithContent, rVar, 0L, 0L, j18, 0.0f, null, null, 0, 246, null);
                bVar.a().b();
                bVar.c(b19);
            } else {
                g1.h.i(onDrawWithContent, this.f81681e, this.f81685i, this.f81686m, a0.j.c(j17, f17), 0.0f, this.f81687n, null, 0, 208, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
