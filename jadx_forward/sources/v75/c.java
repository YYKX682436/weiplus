package v75;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final v75.c f515486a = new v75.c();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f515487b = jz5.h.b(v75.a.f515484d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f515488c = jz5.h.b(v75.b.f515485d);

    public final float a() {
        java.lang.Class cls = (java.lang.Class) ((jz5.n) f515487b).mo141623x754a37bb();
        if (cls == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Honor..DeviceHealthDetect", "This device does not support get TouchDetect result");
            return -1.0f;
        }
        try {
            java.lang.reflect.Method method = cls.getMethod("getDetectResult", new java.lang.Class[0]);
            if (method == null) {
                return -5.0f;
            }
            java.lang.Object invoke = method.invoke(((jz5.n) f515488c).mo141623x754a37bb(), new java.lang.Object[0]);
            if (invoke == null) {
                return -3.0f;
            }
            java.lang.Class<?> cls2 = invoke.getClass();
            java.lang.reflect.Method method2 = cls2.getMethod("getErrorCode", new java.lang.Class[0]);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(method2 != null ? method2.invoke(invoke, new java.lang.Object[0]) : null, 0)) {
                return -3.0f;
            }
            java.lang.reflect.Method method3 = cls2.getMethod("getResult", new java.lang.Class[0]);
            java.lang.Object invoke2 = method3 != null ? method3.invoke(invoke, new java.lang.Object[0]) : null;
            java.lang.Float f17 = invoke2 instanceof java.lang.Float ? (java.lang.Float) invoke2 : null;
            if (f17 == null) {
                return -4.0f;
            }
            float floatValue = f17.floatValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Honor..DeviceHealthDetect", "device health result:" + floatValue);
            return floatValue;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Honor..DeviceHealthDetect", th6, "old version of touch detect api ", new java.lang.Object[0]);
            return -2.0f;
        }
    }
}
