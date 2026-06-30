package ud1;

/* loaded from: classes7.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f76954x366c91de = -2;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f76955x24728b = "saveInitialRenderingCache";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar;
        ri1.a aVar = v5Var != null ? (ri1.a) v5Var.q(ri1.a.class) : null;
        if (aVar == null) {
            if (v5Var != null) {
                v5Var.a(i17, o("fail:not supported"));
                return;
            }
            return;
        }
        if (jSONObject == null) {
            v5Var.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, v5Var.X1());
        try {
            java.lang.String string = jSONObject.getString("content");
            java.lang.String optString2 = jSONObject.optString("webviewData", null);
            java.lang.String optString3 = jSONObject.optString("appserviceData", null);
            ri1.p pVar = (ri1.p) aVar;
            if (pVar.f477569e) {
                if (!(optString == null || optString.length() == 0)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("save path[");
                    sb6.append(optString);
                    sb6.append("] content[");
                    sb6.append(string != null ? string.length() : -1);
                    sb6.append("] webviewData[");
                    sb6.append(optString2 != null ? optString2.length() : -1);
                    sb6.append("] serviceData[");
                    sb6.append(optString3 != null ? optString3.length() : -1);
                    sb6.append(']');
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WebRenderingCacheProviderNewImpl", sb6.toString());
                    if (string == null) {
                        com.p314xaae8f345.mm.vfs.w6.h(pVar.c(optString));
                        new ri1.n();
                        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, pVar.b(optString), ri1.n.class, null);
                    } else {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = pVar.f477573i;
                        r45.o8 o8Var = new r45.o8();
                        o8Var.f463548d = string;
                        o8Var.f463549e = optString2;
                        o8Var.f463550f = optString3;
                        java.lang.String c17 = pVar.c(optString);
                        try {
                            com.p314xaae8f345.mm.vfs.w6.R(c17, o8Var.mo14344x5f01b1f6());
                            new ri1.l();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1172x7e5810c1.C12531x2a8ddffe b17 = pVar.b(optString);
                            b17.f168771h = c17;
                            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, b17, ri1.l.class, null);
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WebRenderingCacheProviderNewImpl", "saveRenderingCache appId[" + pVar.f477568d.f156336n + "] path[" + optString + "] e=" + e17);
                        }
                        concurrentHashMap.put(optString, o8Var);
                    }
                    v5Var.a(i17, o("ok"));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WebRenderingCacheProviderNewImpl", "saveRenderingCache disabled appId[" + pVar.f477568d.f156336n + "] path[" + optString + ']');
            v5Var.a(i17, o("ok"));
        } catch (org.json.JSONException unused) {
            v5Var.a(i17, o("fail:invalid data"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return false;
    }
}
