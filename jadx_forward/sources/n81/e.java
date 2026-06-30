package n81;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f417147a;

    /* renamed from: b, reason: collision with root package name */
    public final long f417148b;

    /* renamed from: c, reason: collision with root package name */
    public final int f417149c;

    public e(java.lang.String appId, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f417147a = appId;
        this.f417148b = j17;
        this.f417149c = i17;
    }

    /* renamed from: equals */
    public boolean m149215xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n81.e)) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f417147a, ((n81.e) obj).f417147a);
    }

    /* renamed from: hashCode */
    public int m149216x8cdac1b() {
        return this.f417147a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149217x9616526c() {
        return "AppBrandInfo(appId=" + this.f417147a + ", lastLaunchTime=" + this.f417148b + ", serviceType=" + this.f417149c + ')';
    }
}
