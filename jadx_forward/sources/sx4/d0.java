package sx4;

/* loaded from: classes8.dex */
public class d0 {

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.HashMap f495114t = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public long f495115a;

    /* renamed from: b, reason: collision with root package name */
    public long f495116b;

    /* renamed from: c, reason: collision with root package name */
    public long f495117c;

    /* renamed from: d, reason: collision with root package name */
    public long f495118d;

    /* renamed from: e, reason: collision with root package name */
    public long f495119e;

    /* renamed from: f, reason: collision with root package name */
    public long f495120f;

    /* renamed from: g, reason: collision with root package name */
    public long f495121g;

    /* renamed from: h, reason: collision with root package name */
    public long f495122h;

    /* renamed from: i, reason: collision with root package name */
    public long f495123i;

    /* renamed from: j, reason: collision with root package name */
    public long f495124j;

    /* renamed from: k, reason: collision with root package name */
    public long f495125k;

    /* renamed from: l, reason: collision with root package name */
    public long f495126l;

    /* renamed from: m, reason: collision with root package name */
    public long f495127m;

    /* renamed from: n, reason: collision with root package name */
    public long f495128n;

    /* renamed from: o, reason: collision with root package name */
    public long f495129o;

    /* renamed from: p, reason: collision with root package name */
    public long f495130p;

    /* renamed from: q, reason: collision with root package name */
    public long f495131q;

    /* renamed from: r, reason: collision with root package name */
    public long f495132r;

    /* renamed from: s, reason: collision with root package name */
    public long f495133s;

    public static sx4.d0 a(java.lang.String str) {
        java.util.HashMap hashMap = f495114t;
        if (hashMap.containsKey(str)) {
            hashMap.remove(str);
        }
        sx4.d0 d0Var = new sx4.d0();
        hashMap.put(str, d0Var);
        return d0Var;
    }

    public static sx4.d0 b(java.lang.String str) {
        java.util.HashMap hashMap = f495114t;
        if (hashMap.containsKey(str)) {
            return (sx4.d0) hashMap.get(str);
        }
        sx4.d0 d0Var = new sx4.d0();
        hashMap.put(str, d0Var);
        return d0Var;
    }

    public static sx4.d0 c(java.lang.String str) {
        return (sx4.d0) f495114t.get(str);
    }

    public static boolean d() {
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s();
    }

    public static void e(java.lang.String str, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(10, str, j17);
        } else if (c(str) != null) {
            c(str).f495124j = j17;
        }
    }

    public static void f(java.lang.String str, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(11, str, j17);
            return;
        }
        sx4.d0 c17 = c(str);
        if (c17 != null) {
            c17.f495125k = j17;
            c17.f495130p = j17;
        }
    }

    public static void g(java.lang.String str, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(6, str, j17);
        } else if (c(str) != null) {
            c(str).f495121g = j17;
        }
    }

    public static void h(java.lang.String str, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(5, str, j17);
        } else if (c(str) != null) {
            c(str).f495120f = j17;
        }
    }

    public static void i(java.lang.String str, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(1, str, j17);
        } else if (c(str) != null) {
            c(str).f495116b = j17;
        }
    }

    public static void j(java.lang.String str, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(9, str, j17);
        } else if (c(str) != null) {
            c(str).f495115a = j17;
            try {
                jj0.a.a().b(6, java.net.URLEncoder.encode(str), "", 0L);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void k(int i17, java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0 j0Var = (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", i17);
        bundle.putString("url", str);
        bundle.putLong("time", j17);
        ((h80.k) j0Var).getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle, sx4.c0.class, null);
    }

    public static void l(java.lang.String str, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(8, str, j17);
        } else if (c(str) != null) {
            c(str).f495123i = j17;
        }
    }

    public static void m(java.lang.String str, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!d()) {
            k(7, str, j17);
        } else if (c(str) != null) {
            c(str).f495122h = j17;
        }
    }
}
