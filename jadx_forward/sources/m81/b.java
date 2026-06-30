package m81;

/* loaded from: classes7.dex */
public abstract class b extends com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f406221l;

    /* renamed from: m, reason: collision with root package name */
    public final int f406222m;

    /* renamed from: n, reason: collision with root package name */
    public final int f406223n;

    /* renamed from: o, reason: collision with root package name */
    public volatile r45.y50 f406224o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f406225p;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18) {
        super(str, str2, java.lang.String.valueOf(i17), "AppBrandWxaPkgDownloader", str3, "GET", 1, 2, 0);
        this.f406225p = new java.util.LinkedList();
        this.f406221l = str4;
        this.f406222m = i17;
        this.f406223n = i18;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        this.f271252h = (int) timeUnit.toMillis(15L);
        this.f271253i = (int) timeUnit.toMillis(30L);
    }

    public java.util.List d() {
        return java.util.Collections.singletonList(this.f271247c);
    }

    public final boolean e() {
        if (!this.f406225p.isEmpty()) {
            return true;
        }
        r45.y50 y50Var = this.f406224o;
        return y50Var != null && y50Var.f472332f == 1;
    }
}
