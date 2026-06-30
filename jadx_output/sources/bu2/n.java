package bu2;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final bu2.n f24550a = new bu2.n();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.c0 f24551b = new com.tencent.mm.sdk.platformtools.c0(200);

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.c0 f24552c = new com.tencent.mm.sdk.platformtools.c0(200);

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.c0 f24553d = new com.tencent.mm.sdk.platformtools.c0(200);

    public final void a(long j17, long j18, java.util.List comments) {
        com.tencent.mm.sdk.platformtools.c0 c0Var;
        kotlin.jvm.internal.o.g(comments, "comments");
        synchronized (this) {
            synchronized (f24550a) {
                c0Var = f24551b;
                c0Var.e(new bu2.k(j17, j18));
                f24552c.e(new bu2.k(j17, j18));
            }
        }
    }

    public final void b(long j17, long j18, int i17, com.tencent.mm.protobuf.g gVar, boolean z17, boolean z18, boolean z19, r45.uy0 uy0Var, r45.xq2 xq2Var, r45.vy0 vy0Var) {
        synchronized (this) {
        }
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentCache", "clearCache all");
        synchronized (this) {
            f24551b.a();
            f24552c.a();
            f24553d.a();
        }
    }

    public final void d(long j17) {
        synchronized (this) {
            java.util.Iterator it = f24551b.f192491b.entrySet().iterator();
            while (it.hasNext()) {
                if (((bu2.k) ((java.util.Map.Entry) it.next()).getKey()).f24538a == j17) {
                    it.remove();
                }
            }
            java.util.Iterator it6 = f24552c.f192491b.entrySet().iterator();
            while (it6.hasNext()) {
                if (((bu2.k) ((java.util.Map.Entry) it6.next()).getKey()).f24538a == j17) {
                    it6.remove();
                }
            }
            f24553d.e(java.lang.Long.valueOf(j17));
        }
    }

    public final java.util.List e(long j17, long j18) {
        java.util.List list;
        synchronized (this) {
            list = (java.util.List) f24551b.b(new bu2.k(j17, j18));
        }
        return list;
    }

    public final bu2.l f(long j17, long j18) {
        bu2.l lVar;
        synchronized (this) {
            lVar = (bu2.l) f24552c.b(new bu2.k(j17, j18));
        }
        return lVar;
    }
}
