package ap1;

/* loaded from: classes5.dex */
public final class c2 extends j75.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f12624e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12625f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12626g;

    /* renamed from: h, reason: collision with root package name */
    public final long f12627h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12628i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f12629m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f12630n;

    /* renamed from: o, reason: collision with root package name */
    public long f12631o;

    public c2(java.lang.String title, boolean z17, int i17, long j17) {
        kotlin.jvm.internal.o.g(title, "title");
        this.f12624e = title;
        this.f12625f = z17;
        this.f12626g = i17;
        this.f12627h = j17;
        this.f12629m = kz5.p0.f313996d;
        this.f12630n = new java.util.HashSet();
    }

    @Override // j75.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public final boolean d(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        return this.f12630n.contains(username);
    }
}
