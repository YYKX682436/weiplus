package ys0;

/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.reflect.Constructor f546658a;

    public static final android.hardware.camera2.CaptureResult.Key a(java.lang.String name, java.lang.Class klass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(klass, "klass");
        try {
            if (f546658a == null) {
                java.lang.reflect.Constructor constructor = android.hardware.camera2.CaptureResult.Key.class.getConstructor(java.lang.String.class, klass.getClass());
                f546658a = constructor;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(constructor);
                constructor.setAccessible(true);
            }
            try {
                java.lang.reflect.Constructor constructor2 = f546658a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(constructor2);
                java.lang.Object newInstance = constructor2.newInstance(name, klass);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type android.hardware.camera2.CaptureResult.Key<T of com.tencent.mm.media.widget.camera2.effect.result.WCResultKeyCreator.resultKey>");
                return (android.hardware.camera2.CaptureResult.Key) newInstance;
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
