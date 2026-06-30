package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public abstract class s5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5, sd.c
    public void a(sd.b bVar) {
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        if (jSONObject.optLong("liteCallbackId", 0L) != 0) {
            super.a(bVar);
            return;
        }
        java.lang.String u17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).u();
        sd.d dVar = bVar.f488129a;
        sd.o0 o0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) dVar).f488188i;
        int i17 = o0Var != null ? o0Var.f488172r : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d dVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) dVar).f263711J;
        java.lang.String p17 = dVar2 != null ? dVar2.p(u17) : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17)) {
            p17 = u17;
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc b17 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.b(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).s());
        if (b17 != null) {
            b17.f149715o = 1;
        }
        try {
            jSONObject.put("currentUrl", u17);
            jSONObject.put("shareUrl", p17);
            jSONObject.put("webviewId", i17);
            sd.d dVar3 = bVar.f488129a;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) dVar3).K != null) {
                jSONObject.put("preVerifyAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) dVar3).K.b());
            }
            if (getClass().getName().equals(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.w3.class.getName())) {
                jSONObject.put("sendAppMessageScene", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.w3.f264027f);
                jSONObject.put("sourceUserName", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.w3.f264026e);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.w3.f264027f = 0;
            }
        } catch (org.json.JSONException unused) {
        }
        super.a(bVar);
    }
}
