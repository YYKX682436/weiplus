package nf1;

/* loaded from: classes7.dex */
public abstract class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.util.Iterator<java.lang.String> keys;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (c0Var == null) {
            return;
        }
        if (jSONObject == null) {
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            java.lang.String str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str2, jSONObject2));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2();
        c12965xc9712d2.f175446d = D();
        java.lang.String optString = jSONObject.optString("scope");
        if (optString == null) {
            optString = "";
        }
        c12965xc9712d2.f175448f = optString;
        c12965xc9712d2.f175453n = jSONObject.optBoolean("needVerifySignature", false);
        c12965xc9712d2.f175451i = jSONObject.optBoolean("is_security_check", false);
        c12965xc9712d2.f175454o = c0Var.mo48798x74292566();
        c12965xc9712d2.f175447e = "";
        r45.y24 y24Var = new r45.y24();
        java.lang.String optString2 = jSONObject.optString("reqUrl");
        if (optString2 == null) {
            optString2 = "";
        }
        y24Var.f472258d = optString2;
        java.lang.String optString3 = jSONObject.optString("reqBody");
        if (optString3 == null) {
            optString3 = "";
        }
        y24Var.f472259e = optString3;
        y24Var.f472260f = jSONObject.optInt("cgiCmdId", 0);
        y24Var.f472262h = jSONObject.optInt(ya.b.f77491x8758c4e1, 0);
        c12965xc9712d2.f175450h = y24Var;
        java.lang.String optString4 = jSONObject.optString("debug_env", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
        c12965xc9712d2.f175457r = optString4.length() > 0 ? ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).b(optString4) : "";
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("debug_cookies");
        if (optJSONObject != null) {
            c12965xc9712d2.f175458s = optJSONObject.optString("route_tag", "");
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("header");
        if (optJSONObject2 != null && (keys = optJSONObject2.keys()) != null) {
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.String optString5 = optJSONObject2.optString(next);
                if (optString5 == null) {
                    optString5 = "";
                }
                java.util.LinkedList linkedList = c12965xc9712d2.f175450h.f472261g;
                r45.cw3 cw3Var = new r45.cw3();
                cw3Var.f453393d = next;
                cw3Var.f453394e = optString5;
                linkedList.push(cw3Var);
            }
        }
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).c(c12965xc9712d2, new nf1.b(this, i17, c0Var));
    }

    public abstract java.lang.String C();

    public abstract int D();
}
