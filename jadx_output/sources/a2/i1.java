package a2;

/* loaded from: classes14.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f743a = p2.u.b(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f744b = p2.u.b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f745c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f746d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f747e = 0;

    static {
        int i17 = e1.y.f246321l;
        f745c = e1.y.f246319j;
        f746d = e1.y.f246311b;
    }

    public static final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, float f17) {
        return ((double) f17) < 0.5d ? obj : obj2;
    }

    public static final long b(long j17, long j18, float f17) {
        if (p2.u.c(j17) || p2.u.c(j18)) {
            return ((p2.t) a(new p2.t(j17), new p2.t(j18), f17)).f351402a;
        }
        if (!((p2.u.c(j17) || p2.u.c(j18)) ? false : true)) {
            throw new java.lang.IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (p2.v.a(p2.t.b(j17), p2.t.b(j18))) {
            return p2.u.d(1095216660480L & j17, q2.a.a(p2.t.c(j17), p2.t.c(j18), f17));
        }
        throw new java.lang.IllegalArgumentException(("Cannot perform operation for " + ((java.lang.Object) p2.v.b(p2.t.b(j17))) + " and " + ((java.lang.Object) p2.v.b(p2.t.b(j18)))).toString());
    }
}
