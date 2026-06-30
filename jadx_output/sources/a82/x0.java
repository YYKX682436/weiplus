package a82;

/* loaded from: classes12.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f2215a;

    /* renamed from: b, reason: collision with root package name */
    public int f2216b;

    /* renamed from: c, reason: collision with root package name */
    public int f2217c;

    /* renamed from: d, reason: collision with root package name */
    public int f2218d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f2219e;

    /* renamed from: f, reason: collision with root package name */
    public int f2220f;

    /* renamed from: g, reason: collision with root package name */
    public int f2221g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f2222h;

    /* renamed from: i, reason: collision with root package name */
    public int f2223i;

    /* renamed from: j, reason: collision with root package name */
    public int f2224j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f2225k;

    /* renamed from: l, reason: collision with root package name */
    public int f2226l;

    /* renamed from: m, reason: collision with root package name */
    public int f2227m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f2228n;

    /* renamed from: o, reason: collision with root package name */
    public long f2229o;

    /* renamed from: p, reason: collision with root package name */
    public long f2230p;

    public x0(java.lang.String str) {
        this.f2215a = str;
    }

    public final java.lang.String a() {
        return this.f2215a;
    }

    public final void b(int i17) {
        this.f2220f = i17;
    }

    public final void c(int i17) {
        this.f2226l = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a82.x0) && kotlin.jvm.internal.o.b(this.f2215a, ((a82.x0) obj).f2215a);
    }

    public int hashCode() {
        java.lang.String str = this.f2215a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "ReportDataItem(dataId=" + this.f2215a + ')';
    }
}
