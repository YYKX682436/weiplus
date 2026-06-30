package kj;

/* loaded from: classes12.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4714x3758855 f389719d;

    public b0(com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4714x3758855 c4714x3758855) {
        this.f389719d = c4714x3758855;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m41292xb90145c7;
        com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4714x3758855 c4714x3758855 = this.f389719d;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4714x3758855 c4714x37588552 = this.f389719d;
        m41292xb90145c7 = c4714x3758855.m41292xb90145c7(currentThread, c4714x37588552.f134555f, c4714x37588552.f134556g, android.os.Build.VERSION.SDK_INT);
        if (!m41292xb90145c7) {
            oj.j.c("StackTracer", "native init failed!", new java.lang.Object[0]);
            this.f389719d.f();
            return;
        }
        oj.j.c("StackTracer", "native init complete!", new java.lang.Object[0]);
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u) {
            this.f389719d.m41294xf8d730f3();
        } else {
            this.f389719d.m41293x33271cde();
        }
    }
}
