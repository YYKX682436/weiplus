package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class h6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.widget.input.h6 f91482a = new com.tencent.mm.plugin.appbrand.widget.input.h6();

    static {
        com.tencent.mm.plugin.appbrand.widget.input.n4 n4Var = com.tencent.mm.plugin.appbrand.widget.input.n4.f91556a;
    }

    public static final void c(org.json.JSONObject data, pl1.i params) {
        org.json.JSONArray optJSONArray;
        int length;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(params, "params");
        if (params instanceof pl1.f) {
            if (data.has("viewId")) {
                ((pl1.f) params).X = java.lang.Integer.valueOf(data.optInt("viewId"));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SecureInputLogic", "prepareInvokeParams, viewId is null");
            }
        }
        org.json.JSONObject optJSONObject = data.optJSONObject("safePassword");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SecureInputLogic", "prepareInvokeParams, safePasswordJsonObj is null");
            return;
        }
        if (optJSONObject.has("certPath") && !optJSONObject.isNull("certPath")) {
            params.H = optJSONObject.optString("certPath");
        }
        if (optJSONObject.has("passwordLength") && !optJSONObject.isNull("passwordLength")) {
            params.I = java.lang.Integer.valueOf(optJSONObject.optInt("passwordLength"));
        }
        if (optJSONObject.has("salt") && !optJSONObject.isNull("salt")) {
            params.f356615J = optJSONObject.optString("salt");
        }
        if (optJSONObject.has(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP) && !optJSONObject.isNull(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            params.K = java.lang.Long.valueOf(optJSONObject.optLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP));
        }
        if (optJSONObject.has("nonce") && !optJSONObject.isNull("nonce")) {
            params.L = java.lang.Long.valueOf(optJSONObject.optLong("nonce"));
        }
        if (!optJSONObject.has("customHash") || (optJSONArray = optJSONObject.optJSONArray("customHash")) == null || (length = optJSONArray.length()) <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String optString = optJSONArray.optString(i17);
            if (!android.text.TextUtils.isEmpty(optString)) {
                kotlin.jvm.internal.o.d(optString);
                arrayList.add(optString);
            }
        }
        params.M = arrayList;
    }

    public static final void d(org.json.JSONObject data, pl1.i params) {
        org.json.JSONArray optJSONArray;
        int length;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(params, "params");
        if (params instanceof pl1.f) {
            if (data.has("view-id")) {
                ((pl1.f) params).X = java.lang.Integer.valueOf(data.optInt("view-id"));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SecureInputLogic", "prepareInvokeSameLayerParams, viewId is null");
            }
        }
        org.json.JSONObject optJSONObject = data.optJSONObject("safe-password");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SecureInputLogic", "prepareInvokeSameLayerParams, safePasswordJsonObj is null");
            return;
        }
        if (optJSONObject.has("cert-path") && !optJSONObject.isNull("cert-path")) {
            params.H = optJSONObject.optString("cert-path");
        }
        if (optJSONObject.has("password-length") && !optJSONObject.isNull("password-length")) {
            params.I = java.lang.Integer.valueOf(optJSONObject.optInt("password-length"));
        }
        if (optJSONObject.has("salt") && !optJSONObject.isNull("salt")) {
            params.f356615J = optJSONObject.optString("salt");
        }
        if (optJSONObject.has(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP) && !optJSONObject.isNull(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            params.K = java.lang.Long.valueOf(optJSONObject.optLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP));
        }
        if (optJSONObject.has("nonce") && !optJSONObject.isNull("nonce")) {
            params.L = java.lang.Long.valueOf(optJSONObject.optLong("nonce"));
        }
        if (!optJSONObject.has("custom-hash") || (optJSONArray = optJSONObject.optJSONArray("custom-hash")) == null || (length = optJSONArray.length()) <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String optString = optJSONArray.optString(i17);
            if (!android.text.TextUtils.isEmpty(optString)) {
                kotlin.jvm.internal.o.d(optString);
                arrayList.add(optString);
            }
        }
        params.M = arrayList;
    }

    public final void a(pl1.i iVar, pl1.i newParams) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        kotlin.jvm.internal.o.g(newParams, "newParams");
        java.lang.Integer num = newParams.I;
        if (num != null) {
            iVar.I = num;
        }
        java.lang.String str = newParams.f356615J;
        if (str != null) {
            iVar.f356615J = str;
        }
        java.lang.Long l17 = newParams.K;
        if (l17 != null) {
            iVar.K = l17;
        }
        java.lang.Long l18 = newParams.L;
        if (l18 != null) {
            iVar.L = l18;
        }
        java.util.List safePasswordCompatList = newParams.M;
        kotlin.jvm.internal.o.f(safePasswordCompatList, "safePasswordCompatList");
        if (!safePasswordCompatList.isEmpty()) {
            iVar.M = newParams.M;
        }
    }

    public final java.lang.String b(com.tenpay.miniapp.MiniAppSecureEditText secureInput, java.util.List rawSafePasswordCompatList, long j17, long j18) {
        java.lang.Iterable iterable;
        kotlin.jvm.internal.o.g(secureInput, "secureInput");
        kotlin.jvm.internal.o.g(rawSafePasswordCompatList, "rawSafePasswordCompatList");
        secureInput.beginCustomHash();
        if (rawSafePasswordCompatList.isEmpty()) {
            iterable = kz5.p0.f313996d;
        } else {
            int size = rawSafePasswordCompatList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            int i17 = 0;
            while (i17 < size) {
                java.lang.String str = (java.lang.String) rawSafePasswordCompatList.get(i17);
                if (kotlin.jvm.internal.o.b("sm3", str)) {
                    arrayList.add(com.tencent.mm.plugin.appbrand.widget.input.b6.f91370d);
                } else if (kotlin.jvm.internal.o.b("sha256", str)) {
                    arrayList.add(com.tencent.mm.plugin.appbrand.widget.input.c6.f91382d);
                } else if (kotlin.jvm.internal.o.b("sha1", str)) {
                    arrayList.add(com.tencent.mm.plugin.appbrand.widget.input.d6.f91402d);
                } else if (kotlin.jvm.internal.o.b("md5", str)) {
                    arrayList.add(com.tencent.mm.plugin.appbrand.widget.input.e6.f91430d);
                } else if (kotlin.jvm.internal.o.b("addSaltBefore", str)) {
                    i17++;
                    arrayList.add(new com.tencent.mm.plugin.appbrand.widget.input.f6((java.lang.String) rawSafePasswordCompatList.get(i17)));
                } else if (kotlin.jvm.internal.o.b("addSaltAfter", str)) {
                    i17++;
                    arrayList.add(new com.tencent.mm.plugin.appbrand.widget.input.g6((java.lang.String) rawSafePasswordCompatList.get(i17)));
                }
                i17++;
            }
            iterable = arrayList;
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((yz5.l) it.next()).invoke(secureInput);
        }
        return secureInput.endCustomHashAndEncrypt(j17, j18);
    }
}
