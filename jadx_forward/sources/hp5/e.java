package hp5;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f364480a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f364482c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f364483d;

    /* renamed from: b, reason: collision with root package name */
    public long f364481b = -1;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f364484e = jz5.h.b(hp5.c.f364478d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f364485f = jz5.h.b(hp5.d.f364479d);

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.q7 f364486g = new hp5.b(this);

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPSensorController", "disable()");
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716) ((jz5.n) this.f364484e).mo141623x754a37bb()).a();
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.s7) ((jz5.n) this.f364485f).mo141623x754a37bb()).b();
        b();
    }

    public final synchronized void b() {
        android.os.PowerManager.WakeLock wakeLock = this.f364480a;
        if (wakeLock == null || !wakeLock.isHeld()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPMPSensorController", "repeatedly release screen off wakelock from object: %s, drop this call.", toString());
        } else {
            yj0.a.c(wakeLock, "com/tencent/mm/voipmp/v2/sensor/VoIPMPSensorController", "turnOn", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            yj0.a.f(wakeLock, "com/tencent/mm/voipmp/v2/sensor/VoIPMPSensorController", "turnOn", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPSensorController", "after release screen off wakelock from object: %s, isHeld: %s", toString(), java.lang.Boolean.valueOf(wakeLock.isHeld()));
            this.f364480a = null;
        }
    }
}
