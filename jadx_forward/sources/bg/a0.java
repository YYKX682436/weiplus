package bg;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f101272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg.f f101273e;

    public a0(bg.f fVar, android.view.Surface surface) {
        this.f101273e = fVar;
        this.f101272d = surface;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f101273e;
        android.view.Surface sameLayerSurface = this.f101272d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "*** handler(%s) handlePluginReady", fVar.q());
        fVar.f101309t = false;
        fVar.f101310u = false;
        fVar.f101311v = false;
        fVar.f101312w = false;
        fVar.f101296g = sameLayerSurface;
        if (fVar.f101297h != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "handlePluginReady, setSurface:%s", sameLayerSurface);
            fVar.f101297h.mo1864x42c875eb(fVar.f101296g);
            if (fVar.V) {
                fVar.K(true, true);
                fVar.I1 = false;
                fVar.V = false;
            }
        }
        bg.a aVar = fVar.E1;
        if (aVar != null) {
            lm1.t tVar = (lm1.t) aVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sameLayerSurface, "sameLayerSurface");
            sameLayerSurface.toString();
            tVar.f400894c = sameLayerSurface;
            tVar.a();
        }
        synchronized (fVar.f101305p1) {
            if (!fVar.f101305p1.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "flushPendingTasks, size:%d", java.lang.Integer.valueOf(fVar.f101305p1.size()));
                java.util.Iterator it = fVar.f101305p1.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
                fVar.f101305p1.clear();
            }
        }
    }
}
