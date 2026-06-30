package mc;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public android.hardware.SensorManager f407059a;

    /* renamed from: b, reason: collision with root package name */
    public mc.j f407060b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f407061c = false;

    /* renamed from: d, reason: collision with root package name */
    public mc.l f407062d;

    public final void a() {
        android.hardware.SensorManager sensorManager;
        if (!this.f407061c || (sensorManager = this.f407059a) == null) {
            return;
        }
        this.f407061c = false;
        sensorManager.unregisterListener(this.f407060b);
        this.f407062d = null;
    }
}
