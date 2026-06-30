package tq4;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f502767a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 f502768b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.q7 f502769c;

    public b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f502768b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716(context);
        this.f502769c = new tq4.a(this);
    }

    public final synchronized void a() {
        android.os.PowerManager.WakeLock wakeLock = this.f502767a;
        if (wakeLock == null || !wakeLock.isHeld()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenSensorController", "repeatedly release screen off wakelock from object: %s, drop this call.", toString());
        } else {
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/voip/screen/ScreenSensorController", "turnOn", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/voip/screen/ScreenSensorController", "turnOn", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenSensorController", "after release screen off wakelock from object: %s, isHeld: %s", toString(), java.lang.Boolean.valueOf(wakeLock.isHeld()));
            this.f502767a = null;
        }
    }
}
