package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class h6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h6 f173015a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h6();

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n4 n4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n4.f173089a;
    }

    public static final void c(org.json.JSONObject data, pl1.i params) {
        org.json.JSONArray optJSONArray;
        int length;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        if (params instanceof pl1.f) {
            if (data.has("viewId")) {
                ((pl1.f) params).X = java.lang.Integer.valueOf(data.optInt("viewId"));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SecureInputLogic", "prepareInvokeParams, viewId is null");
            }
        }
        org.json.JSONObject optJSONObject = data.optJSONObject("safePassword");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SecureInputLogic", "prepareInvokeParams, safePasswordJsonObj is null");
            return;
        }
        if (optJSONObject.has("certPath") && !optJSONObject.isNull("certPath")) {
            params.H = optJSONObject.optString("certPath");
        }
        if (optJSONObject.has("passwordLength") && !optJSONObject.isNull("passwordLength")) {
            params.I = java.lang.Integer.valueOf(optJSONObject.optInt("passwordLength"));
        }
        if (optJSONObject.has("salt") && !optJSONObject.isNull("salt")) {
            params.f438148J = optJSONObject.optString("salt");
        }
        if (optJSONObject.has(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6) && !optJSONObject.isNull(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            params.K = java.lang.Long.valueOf(optJSONObject.optLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6));
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
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                arrayList.add(optString);
            }
        }
        params.M = arrayList;
    }

    public static final void d(org.json.JSONObject data, pl1.i params) {
        org.json.JSONArray optJSONArray;
        int length;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        if (params instanceof pl1.f) {
            if (data.has("view-id")) {
                ((pl1.f) params).X = java.lang.Integer.valueOf(data.optInt("view-id"));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SecureInputLogic", "prepareInvokeSameLayerParams, viewId is null");
            }
        }
        org.json.JSONObject optJSONObject = data.optJSONObject("safe-password");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SecureInputLogic", "prepareInvokeSameLayerParams, safePasswordJsonObj is null");
            return;
        }
        if (optJSONObject.has("cert-path") && !optJSONObject.isNull("cert-path")) {
            params.H = optJSONObject.optString("cert-path");
        }
        if (optJSONObject.has("password-length") && !optJSONObject.isNull("password-length")) {
            params.I = java.lang.Integer.valueOf(optJSONObject.optInt("password-length"));
        }
        if (optJSONObject.has("salt") && !optJSONObject.isNull("salt")) {
            params.f438148J = optJSONObject.optString("salt");
        }
        if (optJSONObject.has(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6) && !optJSONObject.isNull(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            params.K = java.lang.Long.valueOf(optJSONObject.optLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6));
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
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                arrayList.add(optString);
            }
        }
        params.M = arrayList;
    }

    public final void a(pl1.i iVar, pl1.i newParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newParams, "newParams");
        java.lang.Integer num = newParams.I;
        if (num != null) {
            iVar.I = num;
        }
        java.lang.String str = newParams.f438148J;
        if (str != null) {
            iVar.f438148J = str;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(safePasswordCompatList, "safePasswordCompatList");
        if (!safePasswordCompatList.isEmpty()) {
            iVar.M = newParams.M;
        }
    }

    public final java.lang.String b(com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8 secureInput, java.util.List rawSafePasswordCompatList, long j17, long j18) {
        java.lang.Iterable iterable;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(secureInput, "secureInput");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawSafePasswordCompatList, "rawSafePasswordCompatList");
        secureInput.m121715xb3ddf5a8();
        if (rawSafePasswordCompatList.isEmpty()) {
            iterable = kz5.p0.f395529d;
        } else {
            int size = rawSafePasswordCompatList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            int i17 = 0;
            while (i17 < size) {
                java.lang.String str = (java.lang.String) rawSafePasswordCompatList.get(i17);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("sm3", str)) {
                    arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b6.f172903d);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("sha256", str)) {
                    arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.c6.f172915d);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("sha1", str)) {
                    arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d6.f172935d);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("md5", str)) {
                    arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e6.f172963d);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("addSaltBefore", str)) {
                    i17++;
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f6((java.lang.String) rawSafePasswordCompatList.get(i17)));
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("addSaltAfter", str)) {
                    i17++;
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.g6((java.lang.String) rawSafePasswordCompatList.get(i17)));
                }
                i17++;
            }
            iterable = arrayList;
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((yz5.l) it.next()).mo146xb9724478(secureInput);
        }
        return secureInput.m121723xb358c388(j17, j18);
    }
}
