package a0;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.r f148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f150g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f151h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f152i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f153m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g1.n f154n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z17, e1.r rVar, long j17, float f17, float f18, long j18, long j19, g1.n nVar) {
        super(1);
        this.f147d = z17;
        this.f148e = rVar;
        this.f149f = j17;
        this.f150g = f17;
        this.f151h = f18;
        this.f152i = j18;
        this.f153m = j19;
        this.f154n = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.f onDrawWithContent = (g1.f) obj;
        kotlin.jvm.internal.o.g(onDrawWithContent, "$this$onDrawWithContent");
        u1.o0 o0Var = (u1.o0) onDrawWithContent;
        o0Var.b();
        if (this.f147d) {
            g1.h.i(onDrawWithContent, this.f148e, 0L, 0L, this.f149f, 0.0f, null, null, 0, 246, null);
        } else {
            long j17 = this.f149f;
            float b17 = d1.a.b(j17);
            float f17 = this.f150g;
            if (b17 < f17) {
                float f18 = this.f151h;
                float d17 = d1.k.d(o0Var.a());
                float f19 = this.f151h;
                float f27 = d17 - f19;
                float b18 = d1.k.b(o0Var.a()) - f19;
                e1.r rVar = this.f148e;
                long j18 = this.f149f;
                g1.b bVar = (g1.b) o0Var.p();
                long b19 = bVar.b();
                bVar.a().c();
                ((g1.d) bVar.f267504a).a(f18, f18, f27, b18, 0);
                g1.h.i(onDrawWithContent, rVar, 0L, 0L, j18, 0.0f, null, null, 0, 246, null);
                bVar.a().b();
                bVar.c(b19);
            } else {
                g1.h.i(onDrawWithContent, this.f148e, this.f152i, this.f153m, a0.j.c(j17, f17), 0.0f, this.f154n, null, 0, 208, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
