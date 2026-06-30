package ma1;

/* loaded from: classes7.dex */
public class f extends ma1.d {
    /* JADX WARN: Removed duplicated region for block: B:10:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0091  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r12, org.json.JSONObject r13, int r14) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ma1.f.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, int i18, int i19, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameJsApiScreenRecorderEdit", "hy: fail errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("errCode", java.lang.Integer.valueOf(i19));
        e9Var.a(i17, p(java.lang.String.format("fail: errType: %d, errCode: %d, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str), hashMap));
    }

    public void G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, ma1.c cVar, java.lang.String str, org.json.JSONArray jSONArray, ta1.n0 n0Var, org.json.JSONObject jSONObject) {
        java.lang.String str2 = cVar.f406686b;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            F(c0Var, i17, 1, 802, "clipped file lost");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("errCode", 0);
        hashMap.put("videoPath", str2);
        c0Var.a(i17, p("ok", hashMap));
    }
}
