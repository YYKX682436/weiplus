package qd2;

/* loaded from: classes2.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public int f443270a;

    /* renamed from: b, reason: collision with root package name */
    public final android.hardware.SensorManager f443271b;

    /* renamed from: c, reason: collision with root package name */
    public final android.hardware.Sensor f443272c;

    /* renamed from: d, reason: collision with root package name */
    public final android.hardware.SensorEventListener f443273d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f443274e;

    /* renamed from: f, reason: collision with root package name */
    public final int f443275f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f443276g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f443277h;

    public g0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f443270a = -1;
        this.f443276g = new float[3];
        this.f443277h = jz5.h.b(qd2.f0.f443257d);
        java.lang.Object systemService = context.getSystemService("sensor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) systemService;
        this.f443271b = sensorManager;
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f443272c = defaultSensor;
        this.f443275f = 3;
        this.f443273d = defaultSensor != null ? new qd2.e0(this) : null;
    }
}
