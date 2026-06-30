package z;

/* loaded from: classes14.dex */
public final class r implements n0.e5 {

    /* renamed from: d, reason: collision with root package name */
    public final z.w2 f550343d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f550344e;

    /* renamed from: f, reason: collision with root package name */
    public z.w f550345f;

    /* renamed from: g, reason: collision with root package name */
    public long f550346g;

    /* renamed from: h, reason: collision with root package name */
    public long f550347h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f550348i;

    public r(z.w2 typeConverter, java.lang.Object obj, z.w wVar, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeConverter, "typeConverter");
        this.f550343d = typeConverter;
        this.f550344e = n0.s4.c(obj, null, 2, null);
        this.f550345f = wVar != null ? z.x.a(wVar) : z.s.c(typeConverter, obj);
        this.f550346g = j17;
        this.f550347h = j18;
        this.f550348i = z17;
    }

    @Override // n0.e5
    /* renamed from: getValue */
    public java.lang.Object mo128745x754a37bb() {
        return this.f550344e.mo128745x754a37bb();
    }

    /* renamed from: toString */
    public java.lang.String m178184x9616526c() {
        return "AnimationState(value=" + mo128745x754a37bb() + ", velocity=" + ((z.x2) this.f550343d).f550407b.mo146xb9724478(this.f550345f) + ", isRunning=" + this.f550348i + ", lastFrameTimeNanos=" + this.f550346g + ", finishedTimeNanos=" + this.f550347h + ')';
    }

    public /* synthetic */ r(z.w2 w2Var, java.lang.Object obj, z.w wVar, long j17, long j18, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(w2Var, obj, (i17 & 4) != 0 ? null : wVar, (i17 & 8) != 0 ? Long.MIN_VALUE : j17, (i17 & 16) != 0 ? Long.MIN_VALUE : j18, (i17 & 32) != 0 ? false : z17);
    }
}
