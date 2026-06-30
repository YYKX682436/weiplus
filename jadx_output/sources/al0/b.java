package al0;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mars.comm.MMWakerLock f5706d;

    public b(com.tencent.mars.comm.MMWakerLock mMWakerLock) {
        this.f5706d = null;
        this.f5706d = mMWakerLock;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (al0.h.f5729c) {
            al0.d dVar = (al0.d) al0.h.f5727a.get(this.f5706d.hashCode());
            if (dVar != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WakeLockManager", "wakerlock held too long: [%d,%d] @[%s] force to unlock it. state: %s", java.lang.Integer.valueOf(this.f5706d.hashCode()), java.lang.Integer.valueOf(this.f5706d.innerWakeLockHashCode()), this.f5706d.getCreatePosStackLine(), dVar.a());
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.WakeLockManager", "wakerlock held too long: [%d,%d] @[%s] force to unlock it. state: %s", java.lang.Integer.valueOf(this.f5706d.hashCode()), java.lang.Integer.valueOf(this.f5706d.innerWakeLockHashCode()), this.f5706d.getCreatePosStackLine(), "#lost-trace-state#");
            }
            this.f5706d.unLock();
        }
    }
}
