package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes9.dex */
public class c0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.e5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a f280305a;

    public c0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar) {
        this.f280305a = aVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.e5
    public boolean a(boolean z17) {
        qk.n D0;
        qk.h c17;
        java.util.List list;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = this.f280305a;
        qk.o oVar = aVar.f280279h;
        if (oVar != null && (D0 = oVar.D0(false)) != null && (c17 = D0.c()) != null && (list = c17.f445673b) != null && !list.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((r01.g0) c17.f445673b.get(0)).f449610e);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                c12559xbdae8559.f169323f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p6.f34583x366c91de;
                c12559xbdae8559.f169324g = aVar.f280279h.f66748xdec927b;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Vi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, jSONObject.optString("userName"), null, 0, 0, jSONObject.optString("pagePath"), c12559xbdae8559, aVar.f280279h.f66730x28d45f97);
                return true;
            } catch (org.json.JSONException unused) {
            }
        }
        return false;
    }
}
