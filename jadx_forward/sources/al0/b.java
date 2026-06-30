package al0;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 f87239d;

    public b(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 c4549xd1736fd9) {
        this.f87239d = null;
        this.f87239d = c4549xd1736fd9;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (al0.h.f87262c) {
            al0.d dVar = (al0.d) al0.h.f87260a.get(this.f87239d.hashCode());
            if (dVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WakeLockManager", "wakerlock held too long: [%d,%d] @[%s] force to unlock it. state: %s", java.lang.Integer.valueOf(this.f87239d.hashCode()), java.lang.Integer.valueOf(this.f87239d.m40011x165a30a0()), this.f87239d.m40010x1263ebba(), dVar.a());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WakeLockManager", "wakerlock held too long: [%d,%d] @[%s] force to unlock it. state: %s", java.lang.Integer.valueOf(this.f87239d.hashCode()), java.lang.Integer.valueOf(this.f87239d.m40011x165a30a0()), this.f87239d.m40010x1263ebba(), "#lost-trace-state#");
            }
            this.f87239d.mo40017xcdd95364();
        }
    }
}
