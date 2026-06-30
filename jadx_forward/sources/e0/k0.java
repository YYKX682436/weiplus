package e0;

/* loaded from: classes14.dex */
public final class k0 implements e0.h0, s1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0.i1 f327157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f327158b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f327159c;

    /* renamed from: d, reason: collision with root package name */
    public final float f327160d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f327161e;

    /* renamed from: f, reason: collision with root package name */
    public final int f327162f;

    /* renamed from: g, reason: collision with root package name */
    public final int f327163g;

    /* renamed from: h, reason: collision with root package name */
    public final int f327164h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s1.u0 f327165i;

    public k0(e0.i1 i1Var, int i17, boolean z17, float f17, s1.u0 measureResult, java.util.List visibleItemsInfo, int i18, int i19, int i27, boolean z18, b0.y1 orientation, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measureResult, "measureResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibleItemsInfo, "visibleItemsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orientation, "orientation");
        this.f327157a = i1Var;
        this.f327158b = i17;
        this.f327159c = z17;
        this.f327160d = f17;
        this.f327161e = visibleItemsInfo;
        this.f327162f = i18;
        this.f327163g = i19;
        this.f327164h = i27;
        this.f327165i = measureResult;
    }

    @Override // e0.h0
    public int a() {
        return this.f327164h;
    }

    @Override // e0.h0
    public java.util.List b() {
        return this.f327161e;
    }

    @Override // s1.u0
    public java.util.Map c() {
        return this.f327165i.c();
    }

    @Override // e0.h0
    public int d() {
        return this.f327162f;
    }

    @Override // s1.u0
    public void e() {
        this.f327165i.e();
    }

    @Override // e0.h0
    public int f() {
        return this.f327163g;
    }

    @Override // s1.u0
    /* renamed from: getHeight */
    public int mo126531x1c4fb41d() {
        return this.f327165i.mo126531x1c4fb41d();
    }

    @Override // s1.u0
    /* renamed from: getWidth */
    public int mo126532x755bd410() {
        return this.f327165i.mo126532x755bd410();
    }
}
