package xs0;

/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.reflect.Constructor f537828a;

    public static final android.hardware.camera2.CaptureRequest.Key a(java.lang.String name, java.lang.Class klass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(klass, "klass");
        try {
            if (f537828a == null) {
                java.lang.reflect.Constructor constructor = android.hardware.camera2.CaptureRequest.Key.class.getConstructor(java.lang.String.class, klass.getClass());
                f537828a = constructor;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(constructor);
                constructor.setAccessible(true);
            }
            try {
                java.lang.reflect.Constructor constructor2 = f537828a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(constructor2);
                return (android.hardware.camera2.CaptureRequest.Key) constructor2.newInstance(name, klass);
            } catch (java.lang.Exception e17) {
                e17.getMessage();
                return null;
            }
        } catch (java.lang.NoSuchMethodException e18) {
            e18.getMessage();
            return null;
        }
    }
}
