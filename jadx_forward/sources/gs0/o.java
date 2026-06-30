package gs0;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.p f356537d;

    public o(gs0.p pVar) {
        this.f356537d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gs0.p pVar = this.f356537d;
        synchronized (pVar.f356512i) {
            if (pVar.f356511h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pVar.f356538j, "releaseEncoder(), already finished " + pVar.hashCode());
                return;
            }
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356537d.f356538j, "releaseEncoder() start " + this.f356537d.hashCode());
            yz5.a aVar = this.f356537d.f356507d;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            this.f356537d.f356541m.quitSafely();
            this.f356537d.f356539k.y();
            this.f356537d.f356539k.q();
            this.f356537d.c().release();
            this.f356537d.f356511h = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 166L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356537d.f356538j, "releaseEncoder() finish: time:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + ", " + this.f356537d.hashCode());
        }
    }
}
