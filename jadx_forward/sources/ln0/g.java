package ln0;

/* loaded from: classes16.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f401182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401183e;

    public g(ln0.p pVar, java.lang.String str) {
        this.f401182d = pVar;
        this.f401183e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ln0.p pVar = this.f401182d;
        java.lang.String str = this.f401183e;
        ln0.q d17 = pVar.d(str);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper resetP2pStat: params not found for streamId=" + str);
        } else {
            d17.f401232p = 0L;
            d17.f401233q = 0L;
            d17.f401234r = 0L;
            d17.f401235s = 0L;
            d17.f401236t = 0L;
            d17.f401237u = 0L;
            d17.f401238v = 0L;
            d17.f401239w = 0L;
            d17.f401240x = 0L;
            d17.f401241y = 0L;
            d17.f401242z = 0L;
            d17.A = 0L;
            d17.B = 0L;
            d17.C = 0L;
            d17.D = 0L;
            d17.E = 0L;
            d17.F = 0L;
            d17.G = 0L;
            d17.H = 0L;
            d17.I = 0L;
            d17.f401216J = 0L;
            d17.K = 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper resetP2pStat streamId=" + str);
        }
        pVar.f401213i.d();
        pVar.f401213i.c(0L, 20000L);
    }
}
