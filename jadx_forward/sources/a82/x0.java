package a82;

/* loaded from: classes12.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f83748a;

    /* renamed from: b, reason: collision with root package name */
    public int f83749b;

    /* renamed from: c, reason: collision with root package name */
    public int f83750c;

    /* renamed from: d, reason: collision with root package name */
    public int f83751d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f83752e;

    /* renamed from: f, reason: collision with root package name */
    public int f83753f;

    /* renamed from: g, reason: collision with root package name */
    public int f83754g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f83755h;

    /* renamed from: i, reason: collision with root package name */
    public int f83756i;

    /* renamed from: j, reason: collision with root package name */
    public int f83757j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f83758k;

    /* renamed from: l, reason: collision with root package name */
    public int f83759l;

    /* renamed from: m, reason: collision with root package name */
    public int f83760m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f83761n;

    /* renamed from: o, reason: collision with root package name */
    public long f83762o;

    /* renamed from: p, reason: collision with root package name */
    public long f83763p;

    public x0(java.lang.String str) {
        this.f83748a = str;
    }

    public final java.lang.String a() {
        return this.f83748a;
    }

    public final void b(int i17) {
        this.f83753f = i17;
    }

    public final void c(int i17) {
        this.f83759l = i17;
    }

    /* renamed from: equals */
    public boolean m841xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a82.x0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f83748a, ((a82.x0) obj).f83748a);
    }

    /* renamed from: hashCode */
    public int m842x8cdac1b() {
        java.lang.String str = this.f83748a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m843x9616526c() {
        return "ReportDataItem(dataId=" + this.f83748a + ')';
    }
}
