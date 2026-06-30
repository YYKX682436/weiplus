package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public abstract class l4 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f173071a = 0;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n4 n4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n4.f173089a;
    }

    public static final void a(pl1.i iVar, pl1.i newParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newParams, "newParams");
        java.lang.String str = newParams.N;
        if (str != null) {
            iVar.N = str;
        }
        java.lang.String str2 = newParams.O;
        if (str2 != null) {
            iVar.O = str2;
        }
    }

    public static final java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4 v4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, pl1.i iVar) {
        java.lang.String a17;
        java.lang.String a18;
        if (v4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.EncryptInputLogic", "encrypt, encryptException is null");
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k4("env error");
        }
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.EncryptInputLogic", "encrypt, env is null");
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k4("env error");
        }
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.EncryptInputLogic", "encrypt, params is null");
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k4("env error");
        }
        java.lang.String str = iVar.N;
        if (str == null) {
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k4("need certPath");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f4 f4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f4) v4Var;
        synchronized (f4Var) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, f4Var.f172984b)) {
                a17 = f4Var.f172985c;
                if (a17 == null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.AppBrand.BaseInputEncryptExtension#");
                    java.lang.Integer num = f4Var.f172983a;
                    sb6.append(num != null ? num.intValue() : f4Var.hashCode());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(sb6.toString(), "readCertPem, cachedCertPem is null");
                    throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k4("certPath is illegal");
                }
            } else {
                try {
                    a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n4.f173089a.a(lVar, str);
                    f4Var.f172985c = a17;
                    f4Var.f172984b = str;
                } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o4 e17) {
                    throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k4(e17.getMessage());
                }
            }
            java.lang.String mo53490x652bd76e = v4Var.mo53490x652bd76e();
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.f173174d;
            if ("encrypt-bankcard".equalsIgnoreCase(mo53490x652bd76e)) {
                java.lang.String a19 = v4Var.a();
                a18 = a19 != null ? r26.i0.t(a19, " ", "", false) : null;
            } else {
                a18 = v4Var.a();
            }
            java.lang.String str2 = iVar.O;
            if (str2 == null) {
                str2 = "";
            }
            if (a18 == null || a18.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.EncryptInputLogic", "encrypt, inputValue is empty, not need");
                return null;
            }
            java.lang.String m121933x582422a6 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121933x582422a6(a17, a18, str2);
            if (!(m121933x582422a6 == null || m121933x582422a6.length() == 0)) {
                return m121933x582422a6;
            }
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k4("sdk error:" + com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121936x75feee5c());
        }
    }

    public static final void c(org.json.JSONObject data, pl1.i params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        org.json.JSONObject optJSONObject = data.optJSONObject("encrypt");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.EncryptInputLogic", "prepareInvokeParams, encryptJsonObj is null");
            return;
        }
        if (optJSONObject.has("certPath") && !optJSONObject.isNull("certPath")) {
            params.N = optJSONObject.optString("certPath");
        }
        if (!optJSONObject.has("extra") || optJSONObject.isNull("extra")) {
            return;
        }
        params.O = optJSONObject.optString("extra");
    }

    public static final void d(org.json.JSONObject data, pl1.i params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        org.json.JSONObject optJSONObject = data.optJSONObject("encrypt");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.EncryptInputLogic", "prepareSameLayerInvokeParams, encryptJsonObj is null");
            return;
        }
        if (optJSONObject.has("cert-path") && !optJSONObject.isNull("cert-path")) {
            params.N = optJSONObject.optString("cert-path");
        }
        if (!optJSONObject.has("extra") || optJSONObject.isNull("extra")) {
            return;
        }
        params.O = optJSONObject.optString("extra");
    }
}
