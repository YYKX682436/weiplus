package cr0;

/* loaded from: classes4.dex */
public abstract class s2 {
    public static final android.hardware.Sensor a(android.content.Context context, int i17) {
        java.lang.Object invoke;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("sensor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        for (android.hardware.Sensor sensor : ((android.hardware.SensorManager) systemService).getSensorList(-1)) {
            try {
                invoke = sensor.getClass().getDeclaredMethod("getHandle", new java.lang.Class[0]).invoke(sensor, new java.lang.Object[0]);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type kotlin.Int");
            } catch (java.lang.Throwable unused) {
            }
            if (i17 == ((java.lang.Integer) invoke).intValue()) {
                return sensor;
            }
        }
        return null;
    }
}
