package l83;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l83.h f398635d;

    public f(l83.h hVar) {
        this.f398635d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            l83.h.a(this.f398635d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallRecorder", "start record error: %s", e17.getMessage());
            m83.d Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
            if (Zi.F == 0) {
                Zi.F = 1;
            }
        }
    }
}
