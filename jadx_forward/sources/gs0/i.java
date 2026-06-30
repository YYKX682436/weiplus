package gs0;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.l f356524d;

    public i(gs0.l lVar) {
        this.f356524d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        gs0.l lVar = this.f356524d;
        synchronized (lVar.f356512i) {
            if (!lVar.f356511h && !lVar.f356510g) {
                gs0.l.g(this.f356524d);
                java.lang.String str = this.f356524d.f356527j;
                android.os.SystemClock.elapsedRealtime();
                this.f356524d.hashCode();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f356527j, "encodeFrame() stop encodeFrame " + lVar.hashCode() + ", isRelease:" + lVar.f356511h + ", isFinishEncode:" + lVar.f356510g);
        }
    }
}
