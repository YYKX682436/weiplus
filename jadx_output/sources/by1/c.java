package by1;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final by1.b f36353b = new by1.b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f36354c = jz5.h.b(by1.a.f36352d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f36355a = new java.util.concurrent.ConcurrentHashMap();

    public c(kotlin.jvm.internal.i iVar) {
    }

    public final by1.d a(java.lang.Object key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.Object obj = this.f36355a.get(key);
        if (obj instanceof by1.d) {
            return (by1.d) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final by1.d b(java.lang.Object key, by1.d dVar) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(dVar, "default");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f36355a;
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
