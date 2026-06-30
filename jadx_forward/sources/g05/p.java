package g05;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g05.r f349015d;

    public p(g05.r rVar) {
        this.f349015d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g05.j jVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "onMainSessionExposed, try preload bizHandle:" + this.f349015d.f349023m);
        java.lang.ref.WeakReference weakReference = this.f349015d.f349021h;
        boolean z17 = false;
        if (weakReference != null && (jVar = (g05.j) weakReference.get()) != null && ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k) jVar).f280857g) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).q(new g05.o(this.f349015d));
    }
}
