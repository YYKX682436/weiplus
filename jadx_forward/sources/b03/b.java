package b03;

/* loaded from: classes11.dex */
public final class b extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b03.l f98357b;

    public b(b03.l lVar) {
        this.f98357b = lVar;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f98357b.f98375e, "backgroundCallback onEnterBackground");
        b03.l lVar = this.f98357b;
        if (lVar.f98374d != null) {
            synchronized (lVar.f98378h) {
                wu5.c cVar = lVar.f98377g;
                if (cVar != null) {
                    cVar.cancel(false);
                    lVar.f98377g = null;
                }
            }
        }
        this.f98357b.a(0L, b03.b0.f98359e);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        b03.l lVar = this.f98357b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f98375e, "backgroundCallback onExitBackground");
        lVar.b();
        if (lVar.f98373c) {
            ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).aj(true);
        }
    }
}
