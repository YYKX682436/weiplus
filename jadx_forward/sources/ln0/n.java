package ln0;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f401200d;

    public n(ln0.p pVar) {
        this.f401200d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ln0.p pVar = this.f401200d;
        ln0.p.a(pVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper cancel delayed stop due to new stream");
        pVar.f401214j.d();
        pVar.f401212h.set(false);
    }
}
