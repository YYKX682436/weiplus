package r46;

/* loaded from: classes13.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f474040a = a(r46.i.class.getClassLoader().getClass());

    public static boolean a(java.lang.Class cls) {
        while (true) {
            if (cls == null) {
                return false;
            }
            if (cls.getName().equals("org.osgi.framework.BundleReference")) {
                return true;
            }
            for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
                if (a(cls2)) {
                    return true;
                }
            }
            cls = cls.getSuperclass();
        }
    }
}
