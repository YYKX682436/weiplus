package b83;

/* loaded from: classes15.dex */
public class n extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f99859b = java.util.concurrent.Executors.newSingleThreadExecutor(new b83.ThreadFactoryC1333x328cb5());

    /* renamed from: a, reason: collision with root package name */
    public volatile b83.p f99860a = null;

    public n(b83.k kVar) {
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        f99859b.execute(new java.lang.Runnable() { // from class: b83.n$$b
            @Override // java.lang.Runnable
            public final void run() {
                b83.n nVar = b83.n.this;
                nVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchResultService", "async suicide: foreground in");
                b83.p pVar = nVar.f99860a;
                nVar.f99860a = null;
                if (pVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchResultService", "kill check executor %d", java.lang.Integer.valueOf(pVar.hashCode()));
                    synchronized (pVar.f99866b) {
                        pVar.f99867c = false;
                        pVar.f99865a.shutdownNow();
                    }
                }
            }
        });
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        f99859b.execute(new java.lang.Runnable() { // from class: b83.n$$a
            @Override // java.lang.Runnable
            public final void run() {
                b83.n nVar = b83.n.this;
                nVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchResultService", "async suicide: foreground out");
                if (com.p314xaae8f345.mm.p1006xc5476f33.hp.p1780xcbed6b1f.C16113x4eb7d20f.a() == 0) {
                    return;
                }
                b83.p pVar = nVar.f99860a;
                if (pVar != null) {
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Tinker.TinkerPatchResultService", "kill unexpected check executor %d", java.lang.Integer.valueOf(pVar.hashCode()));
                    synchronized (pVar.f99866b) {
                        pVar.f99867c = false;
                        pVar.f99865a.shutdownNow();
                    }
                }
                b83.p pVar2 = new b83.p(null);
                nVar.f99860a = pVar2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchResultService", "start check executor %d", java.lang.Integer.valueOf(pVar2.hashCode()));
                b83.o oVar = new b83.o(nVar, pVar2);
                synchronized (pVar2.f99866b) {
                    if (pVar2.f99867c) {
                        pVar2.f99865a.execute(oVar);
                    }
                }
            }
        });
    }
}
