package gs0;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.p f356536d;

    public n(gs0.p pVar) {
        this.f356536d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gs0.p pVar = this.f356536d;
        synchronized (pVar.f356512i) {
            if (pVar.f356510g || pVar.f356511h || 0 == pVar.f356540l) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pVar.f356538j, "finishEncode() already finish " + pVar.hashCode() + ", isFinishEncode:" + pVar.f356510g + ", isRelease:" + pVar.f356511h + ", startTime:" + pVar.f356540l);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356536d.f356538j, "finishEncode() hash:" + this.f356536d.hashCode() + "  isFinishEncode:" + this.f356536d.f356510g + "  startTime:" + this.f356536d.f356540l);
            this.f356536d.f356539k.w();
            this.f356536d.f356510g = true;
        }
    }
}
