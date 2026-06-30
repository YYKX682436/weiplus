package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public abstract class l4 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f91538a = 0;

    static {
        com.tencent.mm.plugin.appbrand.widget.input.n4 n4Var = com.tencent.mm.plugin.appbrand.widget.input.n4.f91556a;
    }

    public static final void a(pl1.i iVar, pl1.i newParams) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        kotlin.jvm.internal.o.g(newParams, "newParams");
        java.lang.String str = newParams.N;
        if (str != null) {
            iVar.N = str;
        }
        java.lang.String str2 = newParams.O;
        if (str2 != null) {
            iVar.O = str2;
        }
    }

    public static final java.lang.String b(com.tencent.mm.plugin.appbrand.widget.input.v4 v4Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, pl1.i iVar) {
        java.lang.String a17;
        java.lang.String a18;
        if (v4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.EncryptInputLogic", "encrypt, encryptException is null");
            throw new com.tencent.mm.plugin.appbrand.widget.input.k4("env error");
        }
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.EncryptInputLogic", "encrypt, env is null");
            throw new com.tencent.mm.plugin.appbrand.widget.input.k4("env error");
        }
        if (iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.EncryptInputLogic", "encrypt, params is null");
            throw new com.tencent.mm.plugin.appbrand.widget.input.k4("env error");
        }
        java.lang.String str = iVar.N;
        if (str == null) {
            throw new com.tencent.mm.plugin.appbrand.widget.input.k4("need certPath");
        }
        com.tencent.mm.plugin.appbrand.widget.input.f4 f4Var = (com.tencent.mm.plugin.appbrand.widget.input.f4) v4Var;
        synchronized (f4Var) {
            if (kotlin.jvm.internal.o.b(str, f4Var.f91451b)) {
                a17 = f4Var.f91452c;
                if (a17 == null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.AppBrand.BaseInputEncryptExtension#");
                    java.lang.Integer num = f4Var.f91450a;
                    sb6.append(num != null ? num.intValue() : f4Var.hashCode());
                    com.tencent.mars.xlog.Log.e(sb6.toString(), "readCertPem, cachedCertPem is null");
                    throw new com.tencent.mm.plugin.appbrand.widget.input.k4("certPath is illegal");
                }
            } else {
                try {
                    a17 = com.tencent.mm.plugin.appbrand.widget.input.n4.f91556a.a(lVar, str);
                    f4Var.f91452c = a17;
                    f4Var.f91451b = str;
                } catch (com.tencent.mm.plugin.appbrand.widget.input.o4 e17) {
                    throw new com.tencent.mm.plugin.appbrand.widget.input.k4(e17.getMessage());
                }
            }
            java.lang.String inputType = v4Var.getInputType();
            java.util.Map map = com.tencent.mm.plugin.appbrand.widget.input.r1.f91641d;
            if ("encrypt-bankcard".equalsIgnoreCase(inputType)) {
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
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.EncryptInputLogic", "encrypt, inputValue is empty, not need");
                return null;
            }
            java.lang.String encryptGenericDataWithCert = com.tenpay.ndk.WxSmCryptoUtil.getInstance().encryptGenericDataWithCert(a17, a18, str2);
            if (!(encryptGenericDataWithCert == null || encryptGenericDataWithCert.length() == 0)) {
                return encryptGenericDataWithCert;
            }
            throw new com.tencent.mm.plugin.appbrand.widget.input.k4("sdk error:" + com.tenpay.ndk.WxSmCryptoUtil.getInstance().getLastError());
        }
    }

    public static final void c(org.json.JSONObject data, pl1.i params) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(params, "params");
        org.json.JSONObject optJSONObject = data.optJSONObject("encrypt");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.EncryptInputLogic", "prepareInvokeParams, encryptJsonObj is null");
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
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(params, "params");
        org.json.JSONObject optJSONObject = data.optJSONObject("encrypt");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.EncryptInputLogic", "prepareSameLayerInvokeParams, encryptJsonObj is null");
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
