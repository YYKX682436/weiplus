package tq4;

/* loaded from: classes14.dex */
public final class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.q7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tq4.b f502766d;

    public a(tq4.b bVar) {
        this.f502766d = bVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.q7
    public final void f1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenSensorController", "Sensor callback: on=" + z17);
        if (z17) {
            this.f502766d.a();
            return;
        }
        tq4.b bVar = this.f502766d;
        synchronized (bVar) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            android.os.PowerManager powerManager = (android.os.PowerManager) systemService;
            android.os.PowerManager.WakeLock wakeLock = bVar.f502767a;
            if (wakeLock == null) {
                wakeLock = powerManager.newWakeLock(32, "wechat:screen multi-talk");
                bVar.f502767a = wakeLock;
            }
            android.os.PowerManager.WakeLock wakeLock2 = wakeLock;
            if (wakeLock2.isHeld()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenSensorController", "repeatedly acquire screen off wakelock from object: %s, drop this call.", bVar.toString());
            } else {
                yj0.a.c(wakeLock2, "com/tencent/mm/plugin/voip/screen/ScreenSensorController", "turnOff", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                wakeLock2.acquire();
                yj0.a.f(wakeLock2, "com/tencent/mm/plugin/voip/screen/ScreenSensorController", "turnOff", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenSensorController", "after acquire screen off wakelock from object: %s, isHeld: %s", bVar.toString(), java.lang.Boolean.valueOf(wakeLock2.isHeld()));
            }
        }
    }
}
