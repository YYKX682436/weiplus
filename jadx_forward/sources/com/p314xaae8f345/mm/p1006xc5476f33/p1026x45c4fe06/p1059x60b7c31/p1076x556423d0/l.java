package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

/* loaded from: classes7.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o {

    /* renamed from: CTRL_INDEX */
    private static final int f34006x366c91de = 970;

    /* renamed from: NAME */
    private static final java.lang.String f34007x24728b = "openChannelsActivity";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, int i17, android.content.Context context, org.json.JSONObject extInfoWrapperJsonObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfoWrapperJsonObj, "extInfoWrapperJsonObj");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12057x94e6f9c1 c12057x94e6f9c1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12057x94e6f9c1(extInfoWrapperJsonObj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.k(env, i17, this);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12057x94e6f9c1, kVar, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public java.lang.String E() {
        return "openFinderFeed";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.o
    public boolean J(org.json.JSONObject extInfoJsonObj, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfoJsonObj, "extInfoJsonObj");
        try {
            extInfoJsonObj.put("feedID", extInfoJsonObj.optString("feedId"));
            extInfoJsonObj.put("nonceID", extInfoJsonObj.optString("nonceId"));
            extInfoJsonObj.put("shareScene", 18);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "preProcessExtInfo, fail since " + e17);
            return false;
        }
    }
}
