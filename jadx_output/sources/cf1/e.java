package cf1;

/* loaded from: classes15.dex */
public final class e implements q9.l {

    /* renamed from: a, reason: collision with root package name */
    public final r9.e f40888a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40889b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40890c;

    /* renamed from: d, reason: collision with root package name */
    public final int f40891d;

    /* renamed from: e, reason: collision with root package name */
    public final int f40892e;

    /* renamed from: f, reason: collision with root package name */
    public final float f40893f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f40894g;

    /* renamed from: h, reason: collision with root package name */
    public volatile double f40895h;

    public e(r9.e bandwidthMeter, int i17, int i18, int i19, int i27, float f17) {
        kotlin.jvm.internal.o.g(bandwidthMeter, "bandwidthMeter");
        this.f40888a = bandwidthMeter;
        this.f40889b = i17;
        this.f40890c = i18;
        this.f40891d = i19;
        this.f40892e = i27;
        this.f40893f = f17;
        this.f40894g = new java.util.ArrayList();
        this.f40895h = -1.0d;
    }

    @Override // q9.l
    public q9.m a(d9.k0 group, int[] tracks) {
        kotlin.jvm.internal.o.g(group, "group");
        kotlin.jvm.internal.o.g(tracks, "tracks");
        cf1.f fVar = new cf1.f(group, tracks, this.f40888a, this.f40889b, this.f40890c, this.f40891d, this.f40892e, this.f40893f);
        fVar.f40903n = this.f40895h;
        this.f40894g.add(fVar);
        return fVar;
    }
}
