package b83;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final b83.p f18330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b83.n f18331e;

    public o(b83.n nVar, b83.p pVar) {
        this.f18331e = nVar;
        this.f18330d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchResultService", "start check can suicide or not, owner: %d", java.lang.Integer.valueOf(this.f18330d.hashCode()));
        if (this.f18331e.f18327a == this.f18330d && com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.a() != 0) {
            try {
                java.lang.Thread.sleep(5000L);
                b83.p pVar = this.f18330d;
                synchronized (pVar.f18333b) {
                    if (pVar.f18334c) {
                        pVar.f18332a.execute(this);
                    }
                }
            } catch (java.lang.InterruptedException e17) {
                com.tencent.mars.xlog.Log.w("Tinker.TinkerPatchResultService", "suicide check thread is interrupted", e17);
            }
        }
    }
}
