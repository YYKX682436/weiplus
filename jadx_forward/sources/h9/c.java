package h9;

/* loaded from: classes15.dex */
public final class c implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f361130d;

    /* renamed from: e, reason: collision with root package name */
    public final long f361131e;

    /* renamed from: f, reason: collision with root package name */
    public final int f361132f;

    /* renamed from: g, reason: collision with root package name */
    public final long f361133g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f361134h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f361135i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f361136m;

    /* renamed from: n, reason: collision with root package name */
    public final long f361137n;

    /* renamed from: o, reason: collision with root package name */
    public final long f361138o;

    public c(java.lang.String str, long j17, int i17, long j18, boolean z17, java.lang.String str2, java.lang.String str3, long j19, long j27) {
        this.f361130d = str;
        this.f361131e = j17;
        this.f361132f = i17;
        this.f361133g = j18;
        this.f361134h = z17;
        this.f361135i = str2;
        this.f361136m = str3;
        this.f361137n = j19;
        this.f361138o = j27;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        java.lang.Long l17 = (java.lang.Long) obj;
        long longValue = l17.longValue();
        long j17 = this.f361133g;
        if (j17 > longValue) {
            return 1;
        }
        return j17 < l17.longValue() ? -1 : 0;
    }
}
