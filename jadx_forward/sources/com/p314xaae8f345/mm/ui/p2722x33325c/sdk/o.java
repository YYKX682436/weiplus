package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* loaded from: classes13.dex */
public abstract class o {
    public static android.os.Bundle a(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (str != null) {
            for (java.lang.String str2 : str.split("&")) {
                java.lang.String[] split = str2.split("=");
                bundle.putString(java.net.URLDecoder.decode(split[0]), java.net.URLDecoder.decode(split[1]));
            }
        }
        return bundle;
    }

    public static java.lang.String b(android.os.Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = true;
        for (java.lang.String str : bundle.keySet()) {
            if (z17) {
                z17 = false;
            } else {
                sb6.append('&');
            }
            sb6.append(java.net.URLEncoder.encode(str) + "=" + java.net.URLEncoder.encode(bundle.getString(str)));
        }
        return sb6.toString();
    }

    public static org.json.JSONObject c(java.lang.String str) {
        if (str.equals("false")) {
            throw new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n("request failed");
        }
        if (str.equals("true")) {
            str = "{value : true}";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        if (jSONObject.has("error")) {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("error");
            throw new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n(jSONObject2.getString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7), jSONObject2.getString("type"), 0);
        }
        if (jSONObject.has(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4) && jSONObject.has("error_msg")) {
            throw new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n(jSONObject.getString("error_msg"), "", java.lang.Integer.parseInt(jSONObject.getString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4)));
        }
        if (jSONObject.has(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4)) {
            throw new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n("request failed", "", java.lang.Integer.parseInt(jSONObject.getString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4)));
        }
        if (jSONObject.has("error_msg")) {
            throw new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n(jSONObject.getString("error_msg"));
        }
        if (jSONObject.has("error_reason")) {
            throw new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n(jSONObject.getString("error_reason"));
        }
        return jSONObject;
    }

    public static java.lang.String d(java.io.InputStream inputStream) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream), 1000);
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (readLine == null) {
                inputStream.close();
                return sb6.toString();
            }
            sb6.append(readLine);
        }
    }
}
