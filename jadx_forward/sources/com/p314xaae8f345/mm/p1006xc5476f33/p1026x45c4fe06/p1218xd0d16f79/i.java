package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79;

/* loaded from: classes7.dex */
public class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f35311x366c91de = 621;

    /* renamed from: NAME */
    public static final java.lang.String f35312x24728b = "showShareActionSheet";

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f172504g;

    public static void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.i iVar) {
        iVar.getClass();
        try {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = iVar.f172504g;
            if (k0Var != null) {
                k0Var.u();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowShareActionSheet", "hideActionSheet exception:%s", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar).V0() : lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) lVar : null;
        if (V0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowShareActionSheet", "fail, page view is null");
            lVar.a(i17, o("fail:page don't exist"));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowShareActionSheet", "weishi show share action sheet");
            V0.mo32091x9a3f0ba2().m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.d(this, V0));
            lVar.a(i17, o("ok"));
        }
    }
}
