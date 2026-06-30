package pb1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pb1.i f434666d;

    public d(pb1.i iVar) {
        this.f434666d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f434666d.f434673a, "run#mScanWorkaroundTask");
        pb1.h hVar = this.f434666d.f434683k;
        if (!this.f434666d.f434677e.get() || hVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f434666d.f434673a, "run#mScanWorkaroundTask, stopBleScan");
        ob1.m mVar = ob1.m.f425551e;
        if (this.f434666d.d().f425571a == 0) {
            synchronized (this.f434666d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f434666d.f434673a, "run#mScanWorkaroundTask, startBleScanLocked");
                pb1.i iVar = this.f434666d;
                ob1.d dVar = pb1.h.f434669d;
                if (dVar != hVar.f434670a) {
                    hVar = new pb1.h(dVar, hVar.f434671b, hVar.f434672c);
                }
                iVar.c(hVar);
            }
        }
    }
}
