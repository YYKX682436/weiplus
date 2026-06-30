package od1;

/* loaded from: classes.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f73046x366c91de = -2;

    /* renamed from: NAME */
    private static final java.lang.String f73047x24728b = "setAuditsTraceInfo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null) {
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306) : null;
        if (optJSONArray == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = optJSONArray.length();
        for (int i18 = 0; i18 < length; i18++) {
            java.lang.String string = optJSONArray.getString(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            arrayList.add(string);
        }
        boolean g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.g(e9Var.mo48798x74292566(), arrayList);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("resp", java.lang.Boolean.valueOf(g17));
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        e9Var.a(i17, t("ok", hashMap));
    }
}
