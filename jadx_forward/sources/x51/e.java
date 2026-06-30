package x51;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashSet f533522a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final y61.f f533523b = new x51.a();

    public static boolean a(y61.f fVar) {
        long id6 = java.lang.Thread.currentThread().getId();
        boolean a17 = r61.q0.a();
        if (a17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new x51.b(id6, fVar));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddrBookSyncHelper", "canSync:%b, skip", java.lang.Boolean.valueOf(a17));
        return false;
    }
}
