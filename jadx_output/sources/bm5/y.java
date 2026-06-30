package bm5;

/* loaded from: classes12.dex */
public final class y {

    /* renamed from: i, reason: collision with root package name */
    public static final bm5.x f22756i = new bm5.x(null);

    /* renamed from: j, reason: collision with root package name */
    public static final bm5.y f22757j = new bm5.y(null, 0, 0, 0, "", bm5.v.f22750p, bm5.f0.f22561f);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f22758a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22759b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22760c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22761d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f22762e;

    /* renamed from: f, reason: collision with root package name */
    public final bm5.v f22763f;

    /* renamed from: g, reason: collision with root package name */
    public final bm5.f0 f22764g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22765h;

    public y(java.lang.String str, long j17, long j18, long j19, java.lang.String str2, bm5.v businessType, bm5.f0 resType) {
        kotlin.jvm.internal.o.g(businessType, "businessType");
        kotlin.jvm.internal.o.g(resType, "resType");
        this.f22758a = str;
        this.f22759b = j17;
        this.f22760c = j18;
        this.f22761d = j19;
        this.f22762e = str2;
        this.f22763f = businessType;
        this.f22764g = resType;
        this.f22765h = c() != 0;
    }

    public static final bm5.y a(com.tencent.mm.storage.f9 f9Var, bm5.f0 f0Var) {
        return f22756i.a(f9Var, f0Var);
    }

    public static final bm5.y b(java.lang.String str, long j17, long j18, long j19, java.lang.String str2, bm5.v vVar, bm5.f0 f0Var) {
        return f22756i.c(str, j17, j18, j19, str2, vVar, f0Var);
    }

    public final int c() {
        if (this.f22763f == bm5.v.f22750p) {
            return -10003;
        }
        if (this.f22764g == bm5.f0.f22561f) {
            return -10003;
        }
        java.lang.String str = this.f22758a;
        if (str == null || str.length() == 0) {
            return -10003;
        }
        return (this.f22759b > 0 || this.f22760c > 0) ? 0 : -10003;
    }
}
