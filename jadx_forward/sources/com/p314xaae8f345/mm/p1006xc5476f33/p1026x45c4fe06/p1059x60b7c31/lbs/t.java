package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class t implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1 f163014d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1 k1Var) {
        this.f163014d = k1Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (bVar == u81.b.DESTROYED) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.DESTROYED, uninit");
            this.f163014d.j();
            return;
        }
        if (bVar == u81.b.SUSPEND) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.SUSPEND, suspendListening");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1 k1Var = this.f163014d;
            k1Var.f162972o = false;
            k1Var.l(3);
            return;
        }
        if (bVar == u81.b.FOREGROUND) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.FOREGROUND, resumeListening");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1 k1Var2 = this.f163014d;
            if (k1Var2.f162972o) {
                k1Var2.f162972o = false;
                return;
            } else {
                k1Var2.l(4);
                return;
            }
        }
        if (bVar == u81.b.BACKGROUND) {
            if (this.f163014d.f162974q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.BACKGROUND, do nothing");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "AppRunningState.BACKGROUND, stopListening");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1 k1Var3 = this.f163014d;
            k1Var3.f162972o = false;
            k1Var3.l(2);
        }
    }
}
