package i06;

/* loaded from: classes11.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final i06.a f368185a = i06.b.a(i06.f.f368163d);

    /* renamed from: b, reason: collision with root package name */
    public static final i06.a f368186b = i06.b.a(i06.g.f368180d);

    static {
        i06.b.a(i06.c.f368143d);
        i06.b.a(i06.e.f368157d);
        i06.b.a(i06.d.f368150d);
    }

    public static final i06.k1 a(java.lang.Class jClass) {
        java.lang.Object putIfAbsent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jClass, "jClass");
        i06.i iVar = (i06.i) f368185a;
        iVar.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = iVar.f368191b;
        java.lang.Object obj = concurrentHashMap.get(jClass);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(jClass, (obj = iVar.f368190a.mo146xb9724478(jClass)))) != null) {
            obj = putIfAbsent;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (i06.k1) obj;
    }
}
