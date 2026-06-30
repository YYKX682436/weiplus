package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* renamed from: com.tencent.mm.plugin.emoji.model.FlutterEmotionLogic$2 */
/* loaded from: classes15.dex */
class C13264x9cb2f2ad extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4> {
    public C13264x9cb2f2ad(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.d0 d0Var, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f39173x3fe91575 = 449099204;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 c5327x7bab71d4) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 c5327x7bab71d42 = c5327x7bab71d4;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            am.t4 t4Var = c5327x7bab71d42.f135640g;
            jSONObject.put("ProductID", t4Var.f89512a);
            jSONObject.put("Progress", t4Var.f89514c);
            jSONObject.put("Status", t4Var.f89513b);
            jSONObject.put("CDNClientID", t4Var.f89515d);
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5558x9e5ff5f c5558x9e5ff5f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5558x9e5ff5f();
        am.xd xdVar = c5558x9e5ff5f.f135877g;
        xdVar.f89907a = true;
        xdVar.f89908b = new c01.e9("onEmotionDownloadCallback", jSONObject.toString());
        c5558x9e5ff5f.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.c0(this));
        return false;
    }
}
