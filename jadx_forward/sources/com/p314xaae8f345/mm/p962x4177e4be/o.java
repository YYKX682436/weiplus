package com.p314xaae8f345.mm.p962x4177e4be;

/* loaded from: classes10.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p962x4177e4be.r f153249d;

    public o(com.p314xaae8f345.mm.p962x4177e4be.r rVar) {
        this.f153249d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p962x4177e4be.r rVar = this.f153249d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranscoder", "waitEncoderFinish: %s %s %s ", rVar.f153268l, java.lang.Boolean.valueOf(rVar.f153267k), rVar.f153270n);
        if (!rVar.f153267k) {
            com.p314xaae8f345.mm.p962x4177e4be.p pVar = rVar.f153270n;
            if (pVar != null) {
                try {
                    pVar.mo50299x35224f();
                    rVar.f153270n.m77782x31dd2a();
                    rVar.f153270n = null;
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoTranscoder", e17, "waitEncoderFinish, join error: %s", e17.getMessage());
                    return;
                }
            }
            return;
        }
        com.p314xaae8f345.mm.p962x4177e4be.q qVar = rVar.f153268l;
        if (qVar != null) {
            qVar.f153254g = true;
            try {
                java.util.concurrent.Future future = qVar.f531374d;
                if (future == null || future.isCancelled()) {
                    return;
                }
                qVar.f531374d.get();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoTranscoder", e18, "waitEncoderFinish, join error: %s", e18.getMessage());
            }
        }
    }
}
