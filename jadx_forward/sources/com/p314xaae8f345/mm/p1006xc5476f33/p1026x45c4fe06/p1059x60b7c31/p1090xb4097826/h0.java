package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes7.dex */
public class h0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34296x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34297x24728b = "openFinderProfile";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (!(lVar.getF229340d() instanceof android.app.Activity)) {
            lVar.a(i17, "fail");
            return;
        }
        if (jSONObject == null) {
            lVar.a(i17, "fail:data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            lVar.a(i17, "fail:username is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", optString);
        android.content.Context f229340d = lVar.getF229340d();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f542005a;
            if (f229340d == null) {
                f229340d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f229340d);
            e1Var.w(f229340d, intent);
        } else {
            if (f229340d == null) {
                f229340d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12133x3b5ffe3b c12133x3b5ffe3b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12133x3b5ffe3b(intent);
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(f229340d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12133x3b5ffe3b, null, null);
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str2, jSONObject2));
    }
}
