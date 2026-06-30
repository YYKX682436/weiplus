package qe5;

/* loaded from: classes12.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f443643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f443644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe5.h f443645f;

    public g(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2, qe5.h hVar) {
        this.f443643d = dVar;
        this.f443644e = dVar2;
        this.f443645f = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f443643d;
        java.lang.String str = dVar.f68099xfeae815;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = this.f443644e;
        boolean z17 = false;
        long d17 = com.p314xaae8f345.mm.vfs.w6.d(str, dVar2.f68099xfeae815, false);
        if (d17 > 0) {
            dVar2.f68109x90a9378 = d17;
            if (this.f443645f.X6(dVar2)) {
                dVar2.f68112x10a0fed7 = 199L;
            }
            z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(dVar2, new java.lang.String[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.AppAttachLocalLogicUIC", "summerapp copyAttachFromLocal size[%d], id[%d, %d], ret[%b], new status[%d], take[%d]ms", java.lang.Long.valueOf(d17), java.lang.Long.valueOf(dVar.f68106x315a5445), java.lang.Long.valueOf(dVar2.f68106x315a5445), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(dVar2.f68112x10a0fed7), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
