package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class a1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f35162x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f35163x24728b = "returnTakeScreenshot";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null) {
            return;
        }
        java.lang.String enterPath = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j1.a(jSONObject != null ? jSONObject.optString("url") : null, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = e9Var.mo32091x9a3f0ba2();
        if (mo32091x9a3f0ba2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.g0 g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.g0) mo32091x9a3f0ba2.k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.g0.class);
            if (g0Var == null) {
                g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.g0();
                mo32091x9a3f0ba2.l(g0Var);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterPath, "enterPath");
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = g0Var.f170019d;
            java.util.ArrayList arrayList = new java.util.ArrayList(copyOnWriteArraySet);
            copyOnWriteArraySet.clear();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.h0) it.next();
                h0Var.getClass();
                h0Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j1.a(enterPath, h0Var.f170023b));
            }
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
        e9Var.a(i17, u(str2, jSONObject2));
    }
}
