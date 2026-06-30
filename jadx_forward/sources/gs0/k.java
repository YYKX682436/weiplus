package gs0;

/* loaded from: classes10.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.l f356526d;

    public k(gs0.l lVar) {
        this.f356526d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gs0.l lVar = this.f356526d;
        synchronized (lVar.f356512i) {
            if (lVar.f356511h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f356527j, "releaseEncoder(), already finished " + lVar.hashCode());
                return;
            }
            try {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356526d.f356527j, "releaseEncoder() start " + this.f356526d.hashCode());
                yz5.a aVar = this.f356526d.f356507d;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
                this.f356526d.f356532o.mo50302x6b17ad39(null);
                this.f356526d.f356531n.quitSafely();
                this.f356526d.f356528k.y();
                this.f356526d.f356528k.q();
                this.f356526d.c().release();
                this.f356526d.f356511h = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 164L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356526d.f356527j, "releaseEncoder() finish: time:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + ", " + this.f356526d.hashCode());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f356526d.f356527j, "release encoder error " + this.f356526d.hashCode() + " \n " + e17.getMessage());
            }
        }
    }
}
