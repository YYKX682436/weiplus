package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final /* synthetic */ class r9$$f implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        rj1.n nVar = (rj1.n) com.tencent.mm.plugin.appbrand.app.r9.fj(rj1.n.class);
        if (nVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TipsMsgStorage", "[delete] clean expire message.");
            android.database.Cursor all = nVar.getAll();
            while (all.moveToNext()) {
                try {
                    com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo = new com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo();
                    tipsMsgInfo.convertFrom(all);
                    if (tipsMsgInfo.field_expireTime < com.tencent.mm.sdk.platformtools.t8.i1()) {
                        rj1.m.b(tipsMsgInfo, 4);
                        rj1.m.a(tipsMsgInfo);
                        com.tencent.mars.xlog.Log.i("MicroMsg.TipsMsgStorage", "[delete] clean expire message. info = " + tipsMsgInfo);
                    }
                } catch (java.lang.Throwable th6) {
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        vz5.b.a(all, th6);
                        throw th7;
                    }
                }
            }
            vz5.b.a(all, null);
        }
    }
}
