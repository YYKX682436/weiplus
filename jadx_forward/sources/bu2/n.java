package bu2;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final bu2.n f106083a = new bu2.n();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 f106084b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c0(200);

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 f106085c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c0(200);

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 f106086d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c0(200);

    public final void a(long j17, long j18, java.util.List comments) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 c0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comments, "comments");
        synchronized (this) {
            synchronized (f106083a) {
                c0Var = f106084b;
                c0Var.e(new bu2.k(j17, j18));
                f106085c.e(new bu2.k(j17, j18));
            }
        }
    }

    public final void b(long j17, long j18, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, boolean z18, boolean z19, r45.uy0 uy0Var, r45.xq2 xq2Var, r45.vy0 vy0Var) {
        synchronized (this) {
        }
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentCache", "clearCache all");
        synchronized (this) {
            f106084b.a();
            f106085c.a();
            f106086d.a();
        }
    }

    public final void d(long j17) {
        synchronized (this) {
            java.util.Iterator it = f106084b.f274024b.entrySet().iterator();
            while (it.hasNext()) {
                if (((bu2.k) ((java.util.Map.Entry) it.next()).getKey()).f106071a == j17) {
                    it.remove();
                }
            }
            java.util.Iterator it6 = f106085c.f274024b.entrySet().iterator();
            while (it6.hasNext()) {
                if (((bu2.k) ((java.util.Map.Entry) it6.next()).getKey()).f106071a == j17) {
                    it6.remove();
                }
            }
            f106086d.e(java.lang.Long.valueOf(j17));
        }
    }

    public final java.util.List e(long j17, long j18) {
        java.util.List list;
        synchronized (this) {
            list = (java.util.List) f106084b.b(new bu2.k(j17, j18));
        }
        return list;
    }

    public final bu2.l f(long j17, long j18) {
        bu2.l lVar;
        synchronized (this) {
            lVar = (bu2.l) f106085c.b(new bu2.k(j17, j18));
        }
        return lVar;
    }
}
