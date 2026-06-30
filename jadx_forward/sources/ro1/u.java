package ro1;

/* loaded from: classes5.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ro1.u f479546d = new ro1.u();

    public u() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b17 = oo1.o.f428684a.b();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        java.lang.String[] b18 = b17.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "allKeys(...)");
        for (java.lang.String str : b18) {
            po1.d b19 = po1.d.f438827i.b(b17.t(str));
            if (b19 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                concurrentHashMap.put(str, b19);
            }
        }
        return concurrentHashMap;
    }
}
