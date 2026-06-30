package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* renamed from: com.tencent.mm.plugin.appbrand.app.r9$$f */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC11651x660ec7f implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        rj1.n nVar = (rj1.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(rj1.n.class);
        if (nVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TipsMsgStorage", "[delete] clean expire message.");
            android.database.Cursor mo78085xb5882a6b = nVar.mo78085xb5882a6b();
            while (mo78085xb5882a6b.moveToNext()) {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557 c12627x488d3557 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557();
                    c12627x488d3557.mo9015xbf5d97fd(mo78085xb5882a6b);
                    if (c12627x488d3557.f67163x876650f1 < com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()) {
                        rj1.m.b(c12627x488d3557, 4);
                        rj1.m.a(c12627x488d3557);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TipsMsgStorage", "[delete] clean expire message. info = " + c12627x488d3557);
                    }
                } catch (java.lang.Throwable th6) {
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        vz5.b.a(mo78085xb5882a6b, th6);
                        throw th7;
                    }
                }
            }
            vz5.b.a(mo78085xb5882a6b, null);
        }
    }
}
