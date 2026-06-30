package ro5;

/* loaded from: classes14.dex */
public final class a implements bp5.h {

    /* renamed from: d, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer f479661d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f479662e;

    /* renamed from: f, reason: collision with root package name */
    public long f479663f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f479664g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.Size f479665h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f479666i;

    public a(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer flutterTexture, android.view.Surface surface, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterTexture, "flutterTexture");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f479661d = flutterTexture;
        this.f479662e = surface;
        this.f479663f = j17;
        this.f479664g = z17;
        this.f479665h = new android.util.Size(0, 0);
    }

    public final void a(int i17, int i18) {
        this.f479661d.mo138098x76500f83(i17, i18);
        this.f479666i = true;
        this.f479665h = new android.util.Size(i17, i18);
    }

    @Override // bp5.h
    /* renamed from: getImpellerEnabled */
    public boolean mo11014xf13d6265() {
        return this.f479664g;
    }

    @Override // bp5.h
    public boolean getNeedRecreate() {
        return this.f479666i;
    }

    @Override // bp5.h
    /* renamed from: getRenderSize */
    public android.util.Size getSize() {
        return this.f479665h;
    }

    @Override // bp5.h
    /* renamed from: getRenderTarget */
    public java.lang.Object mo11009x8dd3293d() {
        return this.f479661d.mo138084xcf572877();
    }

    @Override // bp5.h
    /* renamed from: setNeedRecreate */
    public void mo11010xc3db8127(boolean z17) {
        this.f479666i = z17;
    }
}
