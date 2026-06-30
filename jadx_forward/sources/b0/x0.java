package b0;

/* loaded from: classes14.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1.f f98114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.y1 f98115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u26.y0 f98116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f98117g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(q1.f fVar, b0.y1 y1Var, u26.y0 y0Var, boolean z17) {
        super(1);
        this.f98114d = fVar;
        this.f98115e = y1Var;
        this.f98116f = y0Var;
        this.f98117g = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p1.s event = (p1.s) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        q1.g.a(this.f98114d, event);
        long f17 = p1.m.f(event, false);
        float d17 = this.f98115e == b0.y1.Vertical ? d1.e.d(f17) : d1.e.c(f17);
        event.a();
        if (this.f98117g) {
            d17 *= -1;
        }
        this.f98116f.e(new b0.t(d17, event.f432414c, null));
        return jz5.f0.f384359a;
    }
}
