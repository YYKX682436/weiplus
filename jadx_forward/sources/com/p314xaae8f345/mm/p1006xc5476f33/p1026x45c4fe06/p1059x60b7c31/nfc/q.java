package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r f163952d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r rVar) {
        this.f163952d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r rVar = this.f163952d;
        synchronized (rVar.f163962t) {
            z17 = rVar.f163963u;
            if (!z17) {
                rVar.f163963u = true;
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE onStartHCEOvertime has finished, return");
            return;
        }
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.class) {
            z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.f163933b;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "startHCE onStartHCEOvertime has stop, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNFCStartHCE", "start HCEService overtime, expect time limit: %d seconds", 10);
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.d.f163933b = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = rVar.f163956n;
        if (lVar != null) {
            fd1.c.a(lVar.mo48798x74292566(), 13007, -2);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", 13007);
        rVar.D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(rVar, 13007, "fail: start HCEService failed", hashMap));
    }
}
