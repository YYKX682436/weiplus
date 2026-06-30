package z;

/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final z.w2 f550289a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f550290b;

    /* renamed from: c, reason: collision with root package name */
    public final long f550291c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f550292d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f550293e;

    /* renamed from: f, reason: collision with root package name */
    public z.w f550294f;

    /* renamed from: g, reason: collision with root package name */
    public long f550295g;

    /* renamed from: h, reason: collision with root package name */
    public long f550296h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.v2 f550297i;

    public o(java.lang.Object obj, z.w2 typeConverter, z.w initialVelocityVector, long j17, java.lang.Object obj2, long j18, boolean z17, yz5.a onCancel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeConverter, "typeConverter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocityVector, "initialVelocityVector");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCancel, "onCancel");
        this.f550289a = typeConverter;
        this.f550290b = obj2;
        this.f550291c = j18;
        this.f550292d = onCancel;
        this.f550293e = n0.s4.c(obj, null, 2, null);
        this.f550294f = z.x.a(initialVelocityVector);
        this.f550295g = j17;
        this.f550296h = Long.MIN_VALUE;
        this.f550297i = n0.s4.c(java.lang.Boolean.valueOf(z17), null, 2, null);
    }

    public final void a() {
        ((n0.q4) this.f550297i).mo148714x53d8522f(java.lang.Boolean.FALSE);
        this.f550292d.mo152xb9724478();
    }

    public final java.lang.Object b() {
        return this.f550293e.mo128745x754a37bb();
    }

    public final java.lang.Object c() {
        return ((z.x2) this.f550289a).f550407b.mo146xb9724478(this.f550294f);
    }

    public final boolean d() {
        return ((java.lang.Boolean) this.f550297i.mo128745x754a37bb()).booleanValue();
    }
}
