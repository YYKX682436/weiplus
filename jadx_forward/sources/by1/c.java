package by1;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final by1.b f117886b = new by1.b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f117887c = jz5.h.b(by1.a.f117885d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f117888a = new java.util.concurrent.ConcurrentHashMap();

    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final by1.d a(java.lang.Object key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.Object obj = this.f117888a.get(key);
        if (obj instanceof by1.d) {
            return (by1.d) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final by1.d b(java.lang.Object key, by1.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "default");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f117888a;
        java.lang.Object obj = concurrentHashMap.get(key);
        if (obj == null) {
            java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(key, dVar);
            if (putIfAbsent != 0) {
                dVar = putIfAbsent;
            }
            obj = dVar;
        }
        return (by1.d) obj;
    }
}
