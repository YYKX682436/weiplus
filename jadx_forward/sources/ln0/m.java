package ln0;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f401199d;

    public m(ln0.p pVar) {
        this.f401199d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ln0.p pVar = this.f401199d;
        if (pVar.f401212h.compareAndSet(false, true)) {
            pVar.f401214j.c(30000L, 30000L);
            ln0.p.a(pVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper scheduled delayed P2P SDK destroy");
        }
    }
}
