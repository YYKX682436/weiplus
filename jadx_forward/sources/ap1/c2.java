package ap1;

/* loaded from: classes5.dex */
public final class c2 extends j75.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f94157e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f94158f;

    /* renamed from: g, reason: collision with root package name */
    public final int f94159g;

    /* renamed from: h, reason: collision with root package name */
    public final long f94160h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f94161i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f94162m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f94163n;

    /* renamed from: o, reason: collision with root package name */
    public long f94164o;

    public c2(java.lang.String title, boolean z17, int i17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f94157e = title;
        this.f94158f = z17;
        this.f94159g = i17;
        this.f94160h = j17;
        this.f94162m = kz5.p0.f395529d;
        this.f94163n = new java.util.HashSet();
    }

    @Override // j75.a
    /* renamed from: clone */
    public java.lang.Object mo8755x5a5dd5d() {
        return super.mo8755x5a5dd5d();
    }

    public final boolean d(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return this.f94163n.contains(username);
    }
}
