package fp;

/* loaded from: classes12.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f346710a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f346711b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f346712c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Boolean f346713d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Boolean f346714e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f346715f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f346716g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.Boolean f346717h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.Boolean f346718i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.Boolean f346719j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Boolean f346720k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.Boolean f346721l;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.Boolean f346722m;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.Boolean f346723n;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.Boolean f346724o;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.Boolean f346725p;

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.Boolean f346726q;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.Boolean f346727r;

    static {
        java.lang.String str = android.os.Build.MANUFACTURER;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        f346710a = str.toLowerCase();
    }

    public static java.lang.String a() {
        java.lang.String str;
        if (h()) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("android.os.FtBuild");
                str = (java.lang.String) cls.getMethod("getProductVersion", new java.lang.Class[0]).invoke(cls, new java.lang.Object[0]);
            } catch (java.lang.Exception unused) {
                str = "";
            }
        } else {
            str = null;
        }
        return android.text.TextUtils.isEmpty(str) ? "empty" : str;
    }

    public static boolean b() {
        if (f346721l == null) {
            f346721l = f346710a.contains("honor") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f346721l.booleanValue();
    }

    public static boolean c() {
        if (f346720k == null) {
            f346720k = f346710a.contains("huawei") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f346720k.booleanValue();
    }

    public static boolean d() {
        if (f346725p == null) {
            f346725p = f346710a.contains("oneplus") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f346725p.booleanValue();
    }

    public static boolean e() {
        if (f346714e == null) {
            f346714e = f346710a.contains("oppo") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f346714e.booleanValue();
    }

    public static boolean f() {
        if (f346715f == null) {
            f346715f = f346710a.contains("realme") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f346715f.booleanValue();
    }

    public static boolean g() {
        if (f346712c == null) {
            f346712c = f346710a.contains("samsung") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f346712c.booleanValue();
    }

    public static boolean h() {
        if (f346718i == null) {
            f346718i = f346710a.contains("vivo") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f346718i.booleanValue();
    }

    public static boolean i() {
        if (f346719j == null) {
            java.lang.String str = f346710a;
            f346719j = (str.contains("xiaomi") || str.contains("redmi")) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f346719j.booleanValue();
    }

    public static boolean j() {
        if (f346727r == null) {
            java.lang.String str = f346710a;
            f346727r = (str.contains("zte") || str.contains("nubia") || str.contains("vertu") || str.contains("leia inc")) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f346727r.booleanValue();
    }
}
