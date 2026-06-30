package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f287757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f287758e;

    public x(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2) {
        this.f287757d = dVar;
        this.f287758e = dVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f287757d;
        java.lang.String str = dVar.f68099xfeae815;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = this.f287758e;
        boolean z17 = false;
        long d17 = com.p314xaae8f345.mm.vfs.w6.d(str, dVar2.f68099xfeae815, false);
        if (d17 > 0) {
            dVar2.f68109x90a9378 = d17;
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6.n7(dVar2)) {
                dVar2.f68112x10a0fed7 = 199L;
            }
            z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(dVar2, new java.lang.String[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp copyAttachFromLocal size[%d], id[%d, %d], ret[%b], new status[%d], take[%d]ms", java.lang.Long.valueOf(d17), java.lang.Long.valueOf(dVar.f68106x315a5445), java.lang.Long.valueOf(dVar2.f68106x315a5445), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(dVar2.f68112x10a0fed7), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
