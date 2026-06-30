package i72;

/* loaded from: classes14.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i72.m f370954d;

    public i(i72.m mVar) {
        this.f370954d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f370954d.f370960d.f181640u) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.n0 n0Var = this.f370954d.f370957a;
            if (n0Var == null) {
                return;
            }
            n0Var.c(null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.b();
            b17.getClass();
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.f181571c) {
                java.util.List list = b17.f181572a;
                if (list != null) {
                    list.clear();
                }
            }
            android.graphics.SurfaceTexture surfaceTexture = this.f370954d.f370960d.f181631i;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.f370954d.f370957a.b();
            i72.m mVar = this.f370954d;
            mVar.f370957a = null;
            mVar.f370960d.f181635p = false;
        }
    }
}
