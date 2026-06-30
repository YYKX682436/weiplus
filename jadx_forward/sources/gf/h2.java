package gf;

/* loaded from: classes7.dex */
public final class h2 implements java.lang.Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final gf.g2 f352620e = new gf.g2(null);

    /* renamed from: f, reason: collision with root package name */
    public static final gf.h2 f352621f = new gf.h2(0);

    /* renamed from: g, reason: collision with root package name */
    public static final gf.h2 f352622g = new gf.h2(Integer.MAX_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public static final gf.h2 f352623h = new gf.h2(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h >> 8);

    /* renamed from: d, reason: collision with root package name */
    public final int f352624d;

    public h2(int i17) {
        this.f352624d = i17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        gf.h2 other = (gf.h2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return this.f352624d - other.f352624d;
    }

    /* renamed from: toString */
    public java.lang.String m131408x9616526c() {
        return "WxClientVersion(" + java.lang.Integer.toHexString(this.f352624d) + ')';
    }
}
