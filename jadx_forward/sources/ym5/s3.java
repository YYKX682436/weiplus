package ym5;

/* loaded from: classes2.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f545049a;

    /* renamed from: b, reason: collision with root package name */
    public int f545050b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f545052d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f545053e;

    /* renamed from: h, reason: collision with root package name */
    public int f545056h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f545057i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f545058j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f545059k;

    /* renamed from: l, reason: collision with root package name */
    public int f545060l;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f545051c = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f545054f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f545055g = true;

    public s3(int i17) {
        this.f545049a = i17;
    }

    /* renamed from: equals */
    public boolean m177348xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym5.s3) && this.f545049a == ((ym5.s3) obj).f545049a;
    }

    /* renamed from: hashCode */
    public int m177349x8cdac1b() {
        return java.lang.Integer.hashCode(this.f545049a);
    }

    /* renamed from: toString */
    public java.lang.String m177350x9616526c() {
        return "(actionType=" + this.f545049a + ", reasonType=" + this.f545050b + ", extra=" + this.f545052d + ", hasAnyMore=" + this.f545054f + ", isAnim=" + this.f545055g + ", remainSize=" + this.f545056h + " isFooterVisible=" + this.f545057i + ",extraData=" + this.f545053e + ')';
    }
}
