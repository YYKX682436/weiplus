package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class s implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1 f163012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f163013b;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1 k1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        this.f163012a = k1Var;
        this.f163013b = e9Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.i1
    public void a(java.lang.String str) {
        char c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1 c1Var = this.f163012a.f162982v;
        int hashCode = str.hashCode();
        if (hashCode == -1562453447) {
            if (str.equals("StateNotListening")) {
                c17 = 1;
            }
            c17 = 65535;
        } else if (hashCode != -1514425717) {
            if (hashCode == 1073716042 && str.equals("StateListening")) {
                c17 = 0;
            }
            c17 = 65535;
        } else {
            if (str.equals("StateSuspend")) {
                c17 = 2;
            }
            c17 = 65535;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f163013b;
        if (c17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "STATE_LISTENING, start blink");
            if (c1Var != null) {
                c1Var.a(e9Var.t3());
                return;
            }
            return;
        }
        if (c17 != 1) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "STATE_NOT_LISTENING, stop blink");
        if (c1Var != null) {
            c1Var.b(e9Var.t3());
        }
    }
}
