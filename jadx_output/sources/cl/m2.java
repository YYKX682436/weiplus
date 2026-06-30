package cl;

/* loaded from: classes7.dex */
public class m2 {

    /* renamed from: c, reason: collision with root package name */
    public static cl.m2 f42699c;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f42701b = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f42700a = new java.util.concurrent.ConcurrentHashMap(100);

    public static cl.m2 a() {
        if (f42699c == null) {
            synchronized (cl.m2.class) {
                if (f42699c == null) {
                    f42699c = new cl.m2();
                }
            }
        }
        return f42699c;
    }
}
