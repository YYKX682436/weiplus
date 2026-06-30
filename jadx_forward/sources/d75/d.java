package d75;

/* loaded from: classes13.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.Object a(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = d75.e.f308424b;
        java.lang.Object obj = concurrentHashMap.get(key);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            concurrentHashMap.remove(key);
        }
        return obj;
    }
}
