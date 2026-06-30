package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class v extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j4.f34369x24728b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Predownload.WebViewJsApiBatchPreloadMiniProgram", "invokeInOwn");
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        if (jSONObject == null) {
            return;
        }
        java.lang.String mo52328xed046e09 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1181xed046e09.InterfaceC12555xd3034a9a) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1181xed046e09.InterfaceC12555xd3034a9a.class)).mo52328xed046e09(jSONObject, true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo52328xed046e09)) {
            bVar.c("error", null);
        } else if ("ok".equalsIgnoreCase(mo52328xed046e09)) {
            bVar.a();
        } else {
            bVar.c(mo52328xed046e09, null);
        }
    }
}
