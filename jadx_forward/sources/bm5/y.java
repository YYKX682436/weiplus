package bm5;

/* loaded from: classes12.dex */
public final class y {

    /* renamed from: i, reason: collision with root package name */
    public static final bm5.x f104289i = new bm5.x(null);

    /* renamed from: j, reason: collision with root package name */
    public static final bm5.y f104290j = new bm5.y(null, 0, 0, 0, "", bm5.v.f104283p, bm5.f0.f104094f);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f104291a;

    /* renamed from: b, reason: collision with root package name */
    public final long f104292b;

    /* renamed from: c, reason: collision with root package name */
    public final long f104293c;

    /* renamed from: d, reason: collision with root package name */
    public final long f104294d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f104295e;

    /* renamed from: f, reason: collision with root package name */
    public final bm5.v f104296f;

    /* renamed from: g, reason: collision with root package name */
    public final bm5.f0 f104297g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f104298h;

    public y(java.lang.String str, long j17, long j18, long j19, java.lang.String str2, bm5.v businessType, bm5.f0 resType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
        this.f104291a = str;
        this.f104292b = j17;
        this.f104293c = j18;
        this.f104294d = j19;
        this.f104295e = str2;
        this.f104296f = businessType;
        this.f104297g = resType;
        this.f104298h = c() != 0;
    }

    public static final bm5.y a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bm5.f0 f0Var) {
        return f104289i.a(f9Var, f0Var);
    }

    public static final bm5.y b(java.lang.String str, long j17, long j18, long j19, java.lang.String str2, bm5.v vVar, bm5.f0 f0Var) {
        return f104289i.c(str, j17, j18, j19, str2, vVar, f0Var);
    }

    public final int c() {
        if (this.f104296f == bm5.v.f104283p) {
            return -10003;
        }
        if (this.f104297g == bm5.f0.f104094f) {
            return -10003;
        }
        java.lang.String str = this.f104291a;
        if (str == null || str.length() == 0) {
            return -10003;
        }
        return (this.f104292b > 0 || this.f104293c > 0) ? 0 : -10003;
    }
}
