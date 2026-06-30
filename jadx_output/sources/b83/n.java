package b83;

/* loaded from: classes15.dex */
public class n extends com.tencent.matrix.lifecycle.h {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f18326b = java.util.concurrent.Executors.newSingleThreadExecutor(new b83.n$$c());

    /* renamed from: a, reason: collision with root package name */
    public volatile b83.p f18327a = null;

    public n(b83.k kVar) {
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        f18326b.execute(new java.lang.Runnable() { // from class: b83.n$$b
            @Override // java.lang.Runnable
            public final void run() {
                b83.n nVar = b83.n.this;
                nVar.getClass();
                com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchResultService", "async suicide: foreground in");
                b83.p pVar = nVar.f18327a;
                nVar.f18327a = null;
                if (pVar != null) {
                    com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchResultService", "kill check executor %d", java.lang.Integer.valueOf(pVar.hashCode()));
                    synchronized (pVar.f18333b) {
                        pVar.f18334c = false;
                        pVar.f18332a.shutdownNow();
                    }
                }
            }
        });
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        f18326b.execute(new java.lang.Runnable() { // from class: b83.n$$a
            @Override // java.lang.Runnable
            public final void run() {
                b83.n nVar = b83.n.this;
                nVar.getClass();
                com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchResultService", "async suicide: foreground out");
                if (com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.a() == 0) {
                    return;
                }
                b83.p pVar = nVar.f18327a;
                if (pVar != null) {
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    com.tencent.mars.xlog.Log.w("Tinker.TinkerPatchResultService", "kill unexpected check executor %d", java.lang.Integer.valueOf(pVar.hashCode()));
                    synchronized (pVar.f18333b) {
                        pVar.f18334c = false;
                        pVar.f18332a.shutdownNow();
                    }
                }
                b83.p pVar2 = new b83.p(null);
                nVar.f18327a = pVar2;
                com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchResultService", "start check executor %d", java.lang.Integer.valueOf(pVar2.hashCode()));
                b83.o oVar = new b83.o(nVar, pVar2);
                synchronized (pVar2.f18333b) {
                    if (pVar2.f18334c) {
                        pVar2.f18332a.execute(oVar);
                    }
                }
            }
        });
    }
}
