package cf1;

/* loaded from: classes15.dex */
public final class e implements q9.l {

    /* renamed from: a, reason: collision with root package name */
    public final r9.e f122421a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122422b;

    /* renamed from: c, reason: collision with root package name */
    public final int f122423c;

    /* renamed from: d, reason: collision with root package name */
    public final int f122424d;

    /* renamed from: e, reason: collision with root package name */
    public final int f122425e;

    /* renamed from: f, reason: collision with root package name */
    public final float f122426f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f122427g;

    /* renamed from: h, reason: collision with root package name */
    public volatile double f122428h;

    public e(r9.e bandwidthMeter, int i17, int i18, int i19, int i27, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bandwidthMeter, "bandwidthMeter");
        this.f122421a = bandwidthMeter;
        this.f122422b = i17;
        this.f122423c = i18;
        this.f122424d = i19;
        this.f122425e = i27;
        this.f122426f = f17;
        this.f122427g = new java.util.ArrayList();
        this.f122428h = -1.0d;
    }

    @Override // q9.l
    public q9.m a(d9.k0 group, int[] tracks) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(group, "group");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tracks, "tracks");
        cf1.f fVar = new cf1.f(group, tracks, this.f122421a, this.f122422b, this.f122423c, this.f122424d, this.f122425e, this.f122426f);
        fVar.f122436n = this.f122428h;
        this.f122427g.add(fVar);
        return fVar;
    }
}
