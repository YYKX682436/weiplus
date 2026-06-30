package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f84582d;

    public e0(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f84582d = appBrandInitConfigWC;
    }

    @Override // java.lang.Runnable
    public void run() {
        rj1.n nVar = (rj1.n) com.tencent.mm.plugin.appbrand.app.r9.fj(rj1.n.class);
        if (nVar != null) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f84582d;
            java.lang.String appId = appBrandInitConfigWC.f77278d;
            kotlin.jvm.internal.o.g(appId, "appId");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.database.Cursor rawQuery = nVar.rawQuery("select * from TipsMsgInfo where appId = '" + appId + '\'', new java.lang.String[0]);
            while (rawQuery.moveToNext()) {
                try {
                    com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo = new com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo();
                    tipsMsgInfo.convertFrom(rawQuery);
                    if (tipsMsgInfo.field_expireTime < com.tencent.mm.sdk.platformtools.t8.i1()) {
                        rj1.m.b(tipsMsgInfo, 4);
                        rj1.m.a(tipsMsgInfo);
                    } else {
                        arrayList.add(tipsMsgInfo);
                    }
                } catch (java.lang.Throwable th6) {
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        vz5.b.a(rawQuery, th6);
                        throw th7;
                    }
                }
            }
            vz5.b.a(rawQuery, null);
            if (arrayList.size() > 0) {
                com.tencent.mm.plugin.appbrand.task.u0.C().O(appBrandInitConfigWC.f77278d, new com.tencent.mm.plugin.appbrand.launching.d0(this, arrayList));
            }
        }
    }
}
