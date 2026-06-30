package b83;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final b83.p f99863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b83.n f99864e;

    public o(b83.n nVar, b83.p pVar) {
        this.f99864e = nVar;
        this.f99863d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchResultService", "start check can suicide or not, owner: %d", java.lang.Integer.valueOf(this.f99863d.hashCode()));
        if (this.f99864e.f99860a == this.f99863d && com.p314xaae8f345.mm.p1006xc5476f33.hp.p1780xcbed6b1f.C16113x4eb7d20f.a() != 0) {
            try {
                java.lang.Thread.sleep(5000L);
                b83.p pVar = this.f99863d;
                synchronized (pVar.f99866b) {
                    if (pVar.f99867c) {
                        pVar.f99865a.execute(this);
                    }
                }
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Tinker.TinkerPatchResultService", "suicide check thread is interrupted", e17);
            }
        }
    }
}
