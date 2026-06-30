package pl4;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl4.k f438246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f438247e;

    public i(pl4.k kVar, boolean z17) {
        this.f438246d = kVar;
        this.f438247e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pl4.k kVar = this.f438246d;
        boolean z17 = this.f438247e;
        synchronized (kVar.f438254e) {
            if (kVar.f438260k) {
                kVar.f438262m = false;
                kVar.f438260k = false;
                kVar.f438264o = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "stopDownload " + kVar.f438251b);
                if (z17) {
                    com.p314xaae8f345.p2917x47247089.p2918x58d9bd6.p2919x6cb1a5ac.C25465x5bc08976 c25465x5bc08976 = kVar.f438255f;
                    kVar.f438255f = null;
                    if (c25465x5bc08976 != null) {
                        c25465x5bc08976.a();
                    }
                }
                ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37741x70920b1f(kVar.f438251b);
            }
        }
    }
}
