package vf;

/* loaded from: classes7.dex */
public abstract class a {
    public static android.os.Bundle a(org.json.JSONObject jSONObject) {
        android.os.Bundle a17 = sc1.n1.a(jSONObject);
        try {
            if (jSONObject.has("referrer")) {
                a17.putString("referrer", jSONObject.getString("referrer"));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "referrer", e17.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15486x7e8b3a17)) {
                a17.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15486x7e8b3a17, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15486x7e8b3a17));
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15486x7e8b3a17, e18.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15484xa8ac2395)) {
                a17.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15484xa8ac2395, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15484xa8ac2395));
            }
        } catch (org.json.JSONException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15484xa8ac2395, e19.getLocalizedMessage());
        }
        return a17;
    }

    public static android.os.Bundle b(org.json.JSONObject jSONObject) {
        android.os.Bundle b17 = sc1.n1.b(jSONObject);
        try {
            if (jSONObject.has("customEffect")) {
                b17.putBoolean("customEffect", jSONObject.getBoolean("customEffect"));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "customEffect", e17.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("skinWhiteness")) {
                b17.putFloat("skinWhiteness", java.math.BigDecimal.valueOf(jSONObject.getDouble("skinWhiteness")).floatValue());
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "skinWhiteness", e18.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("skinSmoothness")) {
                b17.putFloat("skinSmoothness", java.math.BigDecimal.valueOf(jSONObject.getDouble("skinSmoothness")).floatValue());
            }
        } catch (org.json.JSONException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "skinSmoothness", e19.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("faceThinness")) {
                b17.putFloat("faceThinness", java.math.BigDecimal.valueOf(jSONObject.getDouble("faceThinness")).floatValue());
            }
        } catch (org.json.JSONException e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "faceThinness", e27.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("eyeBigness")) {
                b17.putFloat("eyeBigness", java.math.BigDecimal.valueOf(jSONObject.getDouble("eyeBigness")).floatValue());
            }
        } catch (org.json.JSONException e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "eyeBigness", e28.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15484xa8ac2395)) {
                b17.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15484xa8ac2395, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15484xa8ac2395));
            }
        } catch (org.json.JSONException e29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15484xa8ac2395, e29.getLocalizedMessage());
        }
        return b17;
    }
}
