package cl;

/* loaded from: classes7.dex */
public class m2 {

    /* renamed from: c, reason: collision with root package name */
    public static cl.m2 f124232c;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f124234b = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f124233a = new java.util.concurrent.ConcurrentHashMap(100);

    public static cl.m2 a() {
        if (f124232c == null) {
            synchronized (cl.m2.class) {
                if (f124232c == null) {
                    f124232c = new cl.m2();
                }
            }
        }
        return f124232c;
    }
}
