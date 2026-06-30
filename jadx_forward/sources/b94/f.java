package b94;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b94.d f100155a;

    /* renamed from: b, reason: collision with root package name */
    public final android.hardware.SensorManager f100156b;

    /* renamed from: c, reason: collision with root package name */
    public final android.hardware.Sensor f100157c;

    /* renamed from: d, reason: collision with root package name */
    public b94.e f100158d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f100159e;

    public f(android.content.Context context, b94.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f100155a = dVar;
        java.lang.Object systemService = context.getSystemService("sensor");
        android.hardware.SensorManager sensorManager = systemService instanceof android.hardware.SensorManager ? (android.hardware.SensorManager) systemService : null;
        this.f100156b = sensorManager;
        this.f100157c = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
    }
}
