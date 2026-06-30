package bg;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f19739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg.f f19740e;

    public a0(bg.f fVar, android.view.Surface surface) {
        this.f19740e = fVar;
        this.f19739d = surface;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19740e;
        android.view.Surface sameLayerSurface = this.f19739d;
        com.tencent.mars.xlog.Log.i(fVar.A(), "*** handler(%s) handlePluginReady", fVar.q());
        fVar.f19776t = false;
        fVar.f19777u = false;
        fVar.f19778v = false;
        fVar.f19779w = false;
        fVar.f19763g = sameLayerSurface;
        if (fVar.f19764h != null) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "handlePluginReady, setSurface:%s", sameLayerSurface);
            fVar.f19764h.setSurface(fVar.f19763g);
            if (fVar.V) {
                fVar.K(true, true);
                fVar.I1 = false;
                fVar.V = false;
            }
        }
        bg.a aVar = fVar.E1;
        if (aVar != null) {
            lm1.t tVar = (lm1.t) aVar;
            kotlin.jvm.internal.o.g(sameLayerSurface, "sameLayerSurface");
            sameLayerSurface.toString();
            tVar.f319361c = sameLayerSurface;
            tVar.a();
        }
        synchronized (fVar.f19772p1) {
            if (!fVar.f19772p1.isEmpty()) {
                com.tencent.mars.xlog.Log.i(fVar.A(), "flushPendingTasks, size:%d", java.lang.Integer.valueOf(fVar.f19772p1.size()));
                java.util.Iterator it = fVar.f19772p1.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
                fVar.f19772p1.clear();
            }
        }
    }
}
