package yf5;

/* loaded from: classes11.dex */
public class x extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.l4 f543528d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f543529e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f543530f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f543531g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f543532h;

    /* renamed from: i, reason: collision with root package name */
    public int f543533i;

    /* renamed from: m, reason: collision with root package name */
    public int f543534m;

    /* renamed from: n, reason: collision with root package name */
    public int f543535n;

    /* renamed from: o, reason: collision with root package name */
    public int f543536o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f543537p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f543538q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f543539r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f543540s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f543541t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f543542u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f543543v;

    /* renamed from: w, reason: collision with root package name */
    public r45.fh7 f543544w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f543545x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f543546y;

    /* renamed from: z, reason: collision with root package name */
    public int f543547z = -1;

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        yf5.x xVar = (yf5.x) obj;
        return java.util.Objects.equals(this.f543528d.h1(), xVar.f543528d.h1()) && java.util.Objects.equals(this.f543529e, xVar.f543529e) && java.util.Objects.equals(this.f543530f, xVar.f543530f) && java.util.Objects.equals(this.f543531g, xVar.f543531g) && java.util.Objects.equals(this.f543532h, xVar.f543532h) && this.f543538q == xVar.f543538q && this.f543545x == xVar.f543545x && java.util.Objects.equals(this.f543546y, xVar.f543546y) && this.f543547z == xVar.f543547z && this.f543528d.d1() == xVar.f543528d.d1();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        yf5.x xVar = (yf5.x) obj;
        int compare = java.lang.Long.compare(xVar.f543528d.G0(), this.f543528d.G0());
        if (compare != 0) {
            return compare;
        }
        java.lang.String h17 = this.f543528d.h1();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (h17 == null) {
            h17 = "";
        }
        java.lang.String h18 = xVar.f543528d.h1();
        return h17.compareTo(h18 != null ? h18 : "");
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String h17 = this.f543528d.h1();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return h17 == null ? "" : h17;
    }
}
