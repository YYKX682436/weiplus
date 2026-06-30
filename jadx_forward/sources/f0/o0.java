package f0;

/* loaded from: classes14.dex */
public final class o0 implements f0.l0, s1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0.w1 f339705a;

    /* renamed from: b, reason: collision with root package name */
    public final int f339706b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f339707c;

    /* renamed from: d, reason: collision with root package name */
    public final float f339708d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f339709e;

    /* renamed from: f, reason: collision with root package name */
    public final int f339710f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1.u0 f339711g;

    public o0(f0.w1 w1Var, int i17, boolean z17, float f17, s1.u0 measureResult, java.util.List visibleItemsInfo, int i18, int i19, int i27, boolean z18, b0.y1 orientation, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measureResult, "measureResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibleItemsInfo, "visibleItemsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orientation, "orientation");
        this.f339705a = w1Var;
        this.f339706b = i17;
        this.f339707c = z17;
        this.f339708d = f17;
        this.f339709e = visibleItemsInfo;
        this.f339710f = i27;
        this.f339711g = measureResult;
    }

    @Override // f0.l0
    public int a() {
        return this.f339710f;
    }

    @Override // f0.l0
    public java.util.List b() {
        return this.f339709e;
    }

    @Override // s1.u0
    public java.util.Map c() {
        return this.f339711g.c();
    }

    @Override // s1.u0
    public void e() {
        this.f339711g.e();
    }

    @Override // s1.u0
    /* renamed from: getHeight */
    public int mo126531x1c4fb41d() {
        return this.f339711g.mo126531x1c4fb41d();
    }

    @Override // s1.u0
    /* renamed from: getWidth */
    public int mo126532x755bd410() {
        return this.f339711g.mo126532x755bd410();
    }
}
