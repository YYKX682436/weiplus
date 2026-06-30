package dq0;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f323846a;

    /* renamed from: b, reason: collision with root package name */
    public final cf3.d f323847b;

    /* renamed from: c, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer f323848c;

    /* renamed from: d, reason: collision with root package name */
    public long f323849d;

    /* renamed from: e, reason: collision with root package name */
    public long f323850e;

    /* renamed from: f, reason: collision with root package name */
    public long f323851f;

    /* renamed from: g, reason: collision with root package name */
    public long f323852g;

    public k(java.lang.String viewId, cf3.d view, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer, long j17, long j18, long j19, long j27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f323846a = viewId;
        this.f323847b = view;
        this.f323848c = surfaceProducer;
        this.f323849d = j17;
        this.f323850e = j18;
        this.f323851f = j19;
        this.f323852g = j27;
    }

    /* renamed from: equals */
    public boolean m125882xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq0.k)) {
            return false;
        }
        dq0.k kVar = (dq0.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f323846a, kVar.f323846a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f323847b, kVar.f323847b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f323848c, kVar.f323848c) && this.f323849d == kVar.f323849d && this.f323850e == kVar.f323850e && this.f323851f == kVar.f323851f && this.f323852g == kVar.f323852g;
    }

    /* renamed from: hashCode */
    public int m125883x8cdac1b() {
        int hashCode = ((this.f323846a.hashCode() * 31) + this.f323847b.hashCode()) * 31;
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f323848c;
        return ((((((((hashCode + (surfaceProducer == null ? 0 : surfaceProducer.hashCode())) * 31) + java.lang.Long.hashCode(this.f323849d)) * 31) + java.lang.Long.hashCode(this.f323850e)) * 31) + java.lang.Long.hashCode(this.f323851f)) * 31) + java.lang.Long.hashCode(this.f323852g);
    }

    /* renamed from: toString */
    public java.lang.String m125884x9616526c() {
        return "ViewInfo(viewId=" + this.f323846a + ", view=" + this.f323847b + ", textureEntry=" + this.f323848c + ", left=" + this.f323849d + ", top=" + this.f323850e + ", width=" + this.f323851f + ", height=" + this.f323852g + ')';
    }
}
