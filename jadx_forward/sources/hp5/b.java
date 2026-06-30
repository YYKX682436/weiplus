package hp5;

/* loaded from: classes14.dex */
public final class b implements com.p314xaae8f345.mm.sdk.p2603x2137b148.q7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hp5.e f364477d;

    public b(hp5.e eVar) {
        this.f364477d = eVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.q7
    public final void f1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPMPSensorController", "Sensor callback: on=" + z17);
        hp5.e eVar = this.f364477d;
        if (eVar.f364482c) {
            boolean z18 = !z17;
            eVar.f364482c = z18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPSensorController", "onSensorEvent has skip and val is %s", java.lang.Boolean.valueOf(z18));
            return;
        }
        if (!z17) {
            long j17 = eVar.f364481b;
            if (j17 != -1) {
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (android.os.SystemClock.elapsedRealtime() - j17 > 400) {
                    this.f364477d.f364482c = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPSensorController", "onSensorEvent has skip case shake near to small");
                    return;
                }
            }
        }
        hp5.e eVar2 = this.f364477d;
        eVar2.f364482c = false;
        if (z17) {
            eVar2.b();
            return;
        }
        synchronized (eVar2) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            android.os.PowerManager powerManager = (android.os.PowerManager) systemService;
            android.os.PowerManager.WakeLock wakeLock = eVar2.f364480a;
            if (wakeLock == null) {
                wakeLock = powerManager.newWakeLock(32, "wechat:screen multi-talk");
                eVar2.f364480a = wakeLock;
            }
            android.os.PowerManager.WakeLock wakeLock2 = wakeLock;
            if (wakeLock2.isHeld()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPMPSensorController", "repeatedly acquire screen off wakelock from object: %s, drop this call.", eVar2.toString());
            } else {
                yj0.a.c(wakeLock2, "com/tencent/mm/voipmp/v2/sensor/VoIPMPSensorController", "turnOff", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                wakeLock2.acquire();
                yj0.a.f(wakeLock2, "com/tencent/mm/voipmp/v2/sensor/VoIPMPSensorController", "turnOff", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPSensorController", "after acquire screen off wakelock from object: %s, isHeld: %s", eVar2.toString(), java.lang.Boolean.valueOf(wakeLock2.isHeld()));
            }
        }
    }
}
