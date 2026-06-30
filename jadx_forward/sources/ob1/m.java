package ob1;

/* loaded from: classes7.dex */
public class m {

    /* renamed from: e, reason: collision with root package name */
    public static final ob1.m f425551e = new ob1.m(0, "", jc1.f.f380445a, null);

    /* renamed from: f, reason: collision with root package name */
    public static final ob1.m f425552f = new ob1.m(-1, "fail:internal error", jc1.c.H, null);

    /* renamed from: g, reason: collision with root package name */
    public static final ob1.m f425553g;

    /* renamed from: h, reason: collision with root package name */
    public static final ob1.m f425554h;

    /* renamed from: i, reason: collision with root package name */
    public static final ob1.m f425555i;

    /* renamed from: j, reason: collision with root package name */
    public static final ob1.m f425556j;

    /* renamed from: k, reason: collision with root package name */
    public static final ob1.m f425557k;

    /* renamed from: l, reason: collision with root package name */
    public static final ob1.m f425558l;

    /* renamed from: m, reason: collision with root package name */
    public static final ob1.m f425559m;

    /* renamed from: n, reason: collision with root package name */
    public static final ob1.m f425560n;

    /* renamed from: o, reason: collision with root package name */
    public static final ob1.m f425561o;

    /* renamed from: p, reason: collision with root package name */
    public static final ob1.m f425562p;

    /* renamed from: q, reason: collision with root package name */
    public static final ob1.m f425563q;

    /* renamed from: r, reason: collision with root package name */
    public static final ob1.m f425564r;

    /* renamed from: s, reason: collision with root package name */
    public static final ob1.m f425565s;

    /* renamed from: t, reason: collision with root package name */
    public static final ob1.m f425566t;

    /* renamed from: u, reason: collision with root package name */
    public static final ob1.m f425567u;

    /* renamed from: v, reason: collision with root package name */
    public static final ob1.m f425568v;

    /* renamed from: w, reason: collision with root package name */
    public static final ob1.m f425569w;

    /* renamed from: x, reason: collision with root package name */
    public static final ob1.m f425570x;

    /* renamed from: a, reason: collision with root package name */
    public final int f425571a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f425572b;

    /* renamed from: c, reason: collision with root package name */
    public final jc1.d f425573c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f425574d;

    static {
        jc1.d dVar = jc1.c.f380413d;
        f425553g = new ob1.m(-1, "fail:internal error", dVar, null);
        f425554h = new ob1.m(10000, "fail:not init", jc1.c.f380410a, null);
        f425555i = new ob1.m(10001, "fail:not available", jc1.c.f380411b, null);
        f425556j = new ob1.m(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, "fail:no service", jc1.c.f380412c, null);
        f425557k = new ob1.m(10005, "fail:no characteristic", jc1.c.f380409J, null);
        f425558l = new ob1.m(10006, "fail:no connection", jc1.c.K, null);
        jc1.d dVar2 = jc1.c.L;
        f425559m = new ob1.m(10007, "fail:property not support", dVar2, null);
        f425560n = new ob1.m(10008, "fail:system error", dVar, null);
        f425561o = new ob1.m(10009, "fail:system not support", jc1.c.f380414e, null);
        f425562p = new ob1.m(10008, "fail:no descriptor", dVar, null);
        f425563q = new ob1.m(10008, "fail:fail to set descriptor", dVar, null);
        f425564r = new ob1.m(10008, "fail:fail to write descriptor", dVar, null);
        f425565s = new ob1.m(10012, "fail:operate time out", jc1.c.M, null);
        f425566t = new ob1.m(-1, "fail:already connect", jc1.c.N, null);
        f425567u = new ob1.m(10013, "fail:invalid data", jc1.f.f380452h, null);
        f425568v = new ob1.m(10014, "fail:need pin", jc1.c.P, null);
        f425569w = new ob1.m(-1, "fail:location permission is denied", jc1.c.O, null);
        f425570x = new ob1.m(10007, "fail:The writeType is not supported", dVar2, null);
    }

    public m(int i17, java.lang.String str, jc1.d dVar, java.lang.Object obj) {
        this.f425571a = i17;
        this.f425572b = str;
        this.f425573c = dVar;
        this.f425574d = obj;
    }

    public static ob1.m a(java.lang.String str) {
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        jc1.d dVar = jc1.c.f380413d;
        if (isEmpty) {
            return new ob1.m(-1, "fail:system error", dVar, null);
        }
        return new ob1.m(-1, "fail:system error, " + str, dVar, null);
    }

    public static ob1.m b(java.lang.String str) {
        return new ob1.m(10008, "fail:system error, " + str, jc1.c.f380413d, null);
    }

    /* renamed from: toString */
    public java.lang.String m150967x9616526c() {
        return "Result{errCode=" + this.f425571a + ", errMsg='" + this.f425572b + "', errorInfo=" + this.f425573c + ", retObj=" + this.f425574d + '}';
    }
}
