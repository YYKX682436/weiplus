package com.tencent.mm.modelvideoh265toh264;

/* loaded from: classes10.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelvideoh265toh264.r f71716d;

    public o(com.tencent.mm.modelvideoh265toh264.r rVar) {
        this.f71716d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelvideoh265toh264.r rVar = this.f71716d;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "waitEncoderFinish: %s %s %s ", rVar.f71735l, java.lang.Boolean.valueOf(rVar.f71734k), rVar.f71737n);
        if (!rVar.f71734k) {
            com.tencent.mm.modelvideoh265toh264.p pVar = rVar.f71737n;
            if (pVar != null) {
                try {
                    pVar.quit();
                    rVar.f71737n.join();
                    rVar.f71737n = null;
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoTranscoder", e17, "waitEncoderFinish, join error: %s", e17.getMessage());
                    return;
                }
            }
            return;
        }
        com.tencent.mm.modelvideoh265toh264.q qVar = rVar.f71735l;
        if (qVar != null) {
            qVar.f71721g = true;
            try {
                java.util.concurrent.Future future = qVar.f449841d;
                if (future == null || future.isCancelled()) {
                    return;
                }
                qVar.f449841d.get();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoTranscoder", e18, "waitEncoderFinish, join error: %s", e18.getMessage());
            }
        }
    }
}
