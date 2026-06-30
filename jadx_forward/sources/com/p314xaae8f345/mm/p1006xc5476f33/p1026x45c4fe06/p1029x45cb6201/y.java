package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z f157590d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z zVar) {
        this.f157590d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z zVar = this.f157590d;
        long j17 = zVar.f157617f;
        if (j17 > 0) {
            long j18 = zVar.f157618g;
            if (j18 > 0 && j18 <= j17) {
                yz5.p pVar = zVar.f157616e;
                if (pVar == null) {
                    return;
                }
                pVar.mo149xb9724478(java.lang.Long.valueOf(j18), java.lang.Long.valueOf(zVar.f157617f));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChromiumCronetDownloadCallback", "notifyProgressChange invalid bodyLength=" + zVar.f157617f + " currentWriteByte=" + zVar.f157618g);
    }
}
