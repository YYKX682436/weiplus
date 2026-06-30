package lu5;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile p3325xe03a0797.p3326xc267989b.p0 f402992a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Class f402993b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Field f402994c;

    static {
        java.lang.Class cls;
        java.lang.reflect.Field field = null;
        try {
            try {
                cls = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390.class;
                int i17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390.f392012d;
            } catch (java.lang.ClassNotFoundException unused) {
                cls = java.lang.Class.forName("kotlinx.coroutines.DispatchedContinuation");
            }
        } catch (java.lang.ClassNotFoundException unused2) {
            cls = null;
        }
        f402993b = cls;
        if (cls != null) {
            try {
                java.lang.reflect.Field field2 = cls.getField("continuation");
                if (field2 != null) {
                    field2.setAccessible(true);
                    field = field2;
                }
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
        f402994c = field;
    }
}
