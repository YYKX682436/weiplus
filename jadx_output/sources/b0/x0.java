package b0;

/* loaded from: classes14.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1.f f16581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.y1 f16582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u26.y0 f16583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f16584g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(q1.f fVar, b0.y1 y1Var, u26.y0 y0Var, boolean z17) {
        super(1);
        this.f16581d = fVar;
        this.f16582e = y1Var;
        this.f16583f = y0Var;
        this.f16584g = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        p1.s event = (p1.s) obj;
        kotlin.jvm.internal.o.g(event, "event");
        q1.g.a(this.f16581d, event);
        long f17 = p1.m.f(event, false);
        float d17 = this.f16582e == b0.y1.Vertical ? d1.e.d(f17) : d1.e.c(f17);
        event.a();
        if (this.f16584g) {
            d17 *= -1;
        }
        this.f16583f.e(new b0.t(d17, event.f350881c, null));
        return jz5.f0.f302826a;
    }
}
