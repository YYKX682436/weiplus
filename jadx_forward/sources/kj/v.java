package kj;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f389806d;

    public v(boolean z17) {
        this.f389806d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f389806d;
        boolean z18 = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.f134539f;
        int i17 = 0;
        while (i17 < 40) {
            i17++;
            try {
                if (com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.h()) {
                    com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.k(true, z17);
                    return;
                }
                java.lang.Thread.sleep(500L);
            } catch (java.lang.Throwable th6) {
                oj.j.b("SignalAnrTracer", "checkErrorStateCycle error, e : " + th6.getMessage(), new java.lang.Object[0]);
                return;
            }
        }
    }
}
