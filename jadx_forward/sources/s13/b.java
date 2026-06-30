package s13;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile java.lang.Object f483667a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile java.lang.reflect.Method f483668b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile java.lang.reflect.Method f483669c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f483670d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f483671e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f483672f = new java.lang.Object();

    public static void a() {
        if (f483669c != null) {
            return;
        }
        synchronized (f483672f) {
            if (f483669c == null) {
                f483669c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15586xfe2b8d7.class.getMethod("recordClick", java.lang.String.class);
            }
        }
    }

    public static void b() {
        if (f483667a == null || f483668b == null) {
            synchronized (f483671e) {
                if (f483667a == null || f483668b == null) {
                    if (f483667a == null) {
                        f483667a = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15587x9e6f975b.class.getMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    }
                    if (f483668b == null) {
                        f483668b = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15587x9e6f975b.class.getMethod("initIfNeeded", android.content.Context.class);
                    }
                }
            }
        }
    }

    public static void c(android.content.Context context) {
        if (context != null && !f483670d) {
            try {
                p13.w wVar = ((s50.m0) ((u50.x) i95.n0.c(u50.x.class))).f484624d;
                if (wVar != null) {
                    if (wVar.f432704k) {
                        try {
                            b();
                            if (f483667a == null || f483668b == null) {
                                return;
                            }
                            f483668b.invoke(f483667a, context);
                        } catch (java.lang.Throwable unused) {
                            f483670d = true;
                        }
                    }
                }
            } catch (java.lang.Throwable unused2) {
            }
        }
    }
}
