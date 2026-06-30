package fe1;

/* loaded from: classes15.dex */
public final class l extends fe1.a {

    /* renamed from: CTRL_INDEX */
    public static final int f69742x366c91de = 1581;

    /* renamed from: NAME */
    public static final java.lang.String f69743x24728b = "getTransitCardInfo";

    @Override // fe1.a
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject data, int i17, fe1.v manager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String optString = data.optString("issuerID", "");
        org.json.JSONArray optJSONArray = data.optJSONArray("fields");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.TransitCard.JsApiGetCardInfo", "execute, issuerID is empty");
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            ie1.b bVar = ie1.b.f372511a;
            java.lang.String mo48798x74292566 = env.mo48798x74292566();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
            bVar.a(f69743x24728b, false, currentTimeMillis, currentTimeMillis2, 10011, "issuerID is required", "", mo48798x74292566);
            env.a(i17, de1.b.a(this, 10011, "fail:issuerID is required", kz5.c1.i(new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, 10011))));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.String optString2 = optJSONArray.optString(i18, "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                if (optString2.length() > 0) {
                    arrayList.add(optString2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(kz5.c0.i("cardNo", "balance", "validateDate", "transactionRecords"));
        }
        fe1.k kVar = new fe1.k(currentTimeMillis, optString, env, this, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.C12255x4bc520d9 c12255x4bc520d9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.C12255x4bc520d9(manager.f343035a, optString, arrayList);
        c12255x4bc520d9.F(kVar);
        c12255x4bc520d9.d();
    }
}
