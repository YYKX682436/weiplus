package sc1;

/* loaded from: classes7.dex */
public abstract class n1 {
    public static android.os.Bundle a(org.json.JSONObject jSONObject) {
        java.util.Objects.toString(jSONObject);
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15498x8f853862)) {
                bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15498x8f853862, jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15498x8f853862));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15498x8f853862, e17.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("mode")) {
                bundle.putInt("mode", jSONObject.getInt("mode"));
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "mode", e18.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15485x340d78e6)) {
                bundle.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15485x340d78e6, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15485x340d78e6));
            }
        } catch (org.json.JSONException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15485x340d78e6, e19.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("muted")) {
                bundle.putBoolean("muted", jSONObject.getBoolean("muted"));
            }
        } catch (org.json.JSONException e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "muted", e27.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15492xaf45612e)) {
                bundle.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15492xaf45612e, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15492xaf45612e));
            }
        } catch (org.json.JSONException e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15492xaf45612e, e28.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15493xb067d9d3)) {
                bundle.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15493xb067d9d3, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15493xb067d9d3));
            }
        } catch (org.json.JSONException e29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15493xb067d9d3, e29.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("orientation")) {
                bundle.putString("orientation", jSONObject.getString("orientation"));
            }
        } catch (org.json.JSONException e37) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "orientation", e37.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15495x767d9974)) {
                bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15495x767d9974, jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15495x767d9974));
            }
        } catch (org.json.JSONException e38) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15495x767d9974, e38.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15490x250b3437)) {
                bundle.putFloat(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15490x250b3437, java.math.BigDecimal.valueOf(jSONObject.getDouble(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15490x250b3437)).floatValue());
            }
        } catch (org.json.JSONException e39) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15490x250b3437, e39.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15489xf7001dc9)) {
                bundle.putFloat(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15489xf7001dc9, java.math.BigDecimal.valueOf(jSONObject.getDouble(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15489xf7001dc9)).floatValue());
            }
        } catch (org.json.JSONException e47) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15489xf7001dc9, e47.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15488x8a0bb66c)) {
                bundle.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15488x8a0bb66c, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15488x8a0bb66c));
            }
        } catch (org.json.JSONException e48) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15488x8a0bb66c, e48.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("needAudioVolume")) {
                bundle.putBoolean("needAudioVolume", jSONObject.getBoolean("needAudioVolume"));
            }
        } catch (org.json.JSONException e49) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "needAudioVolume", e49.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("debug")) {
                bundle.putBoolean("debug", jSONObject.getBoolean("debug"));
            }
        } catch (org.json.JSONException e57) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "debug", e57.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15499x6ed1e11)) {
                bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15499x6ed1e11, jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15499x6ed1e11));
            }
        } catch (org.json.JSONException e58) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15499x6ed1e11, e58.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("needEvent")) {
                bundle.putBoolean("needEvent", jSONObject.getBoolean("needEvent"));
            }
        } catch (org.json.JSONException e59) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "needEvent", e59.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("autoPauseIfNavigate")) {
                bundle.putBoolean("autoPauseIfNavigate", jSONObject.getBoolean("autoPauseIfNavigate"));
            }
        } catch (org.json.JSONException e66) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "autoPauseIfNavigate", e66.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("autoPauseIfOpenNative")) {
                bundle.putBoolean("autoPauseIfOpenNative", jSONObject.getBoolean("autoPauseIfOpenNative"));
            }
        } catch (org.json.JSONException e67) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "autoPauseIfOpenNative", e67.getLocalizedMessage());
        }
        return bundle;
    }

    public static android.os.Bundle b(org.json.JSONObject jSONObject) {
        java.util.Objects.toString(jSONObject);
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15527x23c7cca2)) {
                bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15527x23c7cca2, jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15527x23c7cca2));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15527x23c7cca2, e17.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("mode")) {
                bundle.putInt("mode", jSONObject.getInt("mode"));
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "mode", e18.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15504xe60534b2)) {
                bundle.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15504xe60534b2, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15504xe60534b2));
            }
        } catch (org.json.JSONException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15504xe60534b2, e19.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15501x3b90325e)) {
                bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15501x3b90325e, jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15501x3b90325e));
            }
        } catch (org.json.JSONException e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15501x3b90325e, e27.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("muted")) {
                bundle.putBoolean("muted", jSONObject.getBoolean("muted"));
            }
        } catch (org.json.JSONException e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "muted", e28.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15512xcf452269)) {
                bundle.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15512xcf452269, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15512xcf452269));
            }
        } catch (org.json.JSONException e29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15512xcf452269, e29.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15514x177e2563)) {
                bundle.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15514x177e2563, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15514x177e2563));
            }
        } catch (org.json.JSONException e37) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15514x177e2563, e37.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("enableAGC")) {
                bundle.putBoolean("enableAGC", jSONObject.getBoolean("enableAGC"));
            }
        } catch (org.json.JSONException e38) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "enableAGC", e38.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("enableANS")) {
                bundle.putBoolean("enableANS", jSONObject.getBoolean("enableANS"));
            }
        } catch (org.json.JSONException e39) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "enableANS", e39.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15513x5b9d646d)) {
                bundle.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15513x5b9d646d, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15513x5b9d646d));
            }
        } catch (org.json.JSONException e47) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15513x5b9d646d, e47.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15503xa86a533e)) {
                bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15503xa86a533e, jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15503xa86a533e));
            }
        } catch (org.json.JSONException e48) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15503xa86a533e, e48.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15502x19f34386)) {
                bundle.putInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15502x19f34386, jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15502x19f34386));
            }
        } catch (org.json.JSONException e49) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15502x19f34386, e49.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b)) {
                bundle.putInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b, jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b));
            }
        } catch (org.json.JSONException e57) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b, e57.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122)) {
                bundle.putInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122, jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122));
            }
        } catch (org.json.JSONException e58) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122, e58.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15516x6a3cecc2)) {
                bundle.putInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15516x6a3cecc2, jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15516x6a3cecc2));
            }
        } catch (org.json.JSONException e59) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15516x6a3cecc2, e59.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("orientation")) {
                bundle.putString("orientation", jSONObject.getString("orientation"));
            }
        } catch (org.json.JSONException e66) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "orientation", e66.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15506x7f57ec74)) {
                bundle.putInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15506x7f57ec74, jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15506x7f57ec74));
            }
        } catch (org.json.JSONException e67) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15506x7f57ec74, e67.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15507x3fdf4e06)) {
                bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15507x3fdf4e06, jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15507x3fdf4e06));
            }
        } catch (org.json.JSONException e68) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15507x3fdf4e06, e68.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac)) {
                bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac, jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac));
            }
        } catch (org.json.JSONException e69) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac, e69.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15536x1eab9ee8)) {
                bundle.putInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15536x1eab9ee8, jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15536x1eab9ee8));
            }
        } catch (org.json.JSONException e76) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15536x1eab9ee8, e76.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15500x7e6ef050)) {
                bundle.putInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15500x7e6ef050, jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15500x7e6ef050));
            }
        } catch (org.json.JSONException e77) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15500x7e6ef050, e77.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15520xfb34d948)) {
                bundle.putInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15520xfb34d948, jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15520xfb34d948));
            }
        } catch (org.json.JSONException e78) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15520xfb34d948, e78.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15519x2395a65a)) {
                bundle.putInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15519x2395a65a, jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15519x2395a65a));
            }
        } catch (org.json.JSONException e79) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15519x2395a65a, e79.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb)) {
                bundle.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb));
            }
        } catch (org.json.JSONException e86) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb, e86.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("debug")) {
                bundle.putBoolean("debug", jSONObject.getBoolean("debug"));
            }
        } catch (org.json.JSONException e87) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "debug", e87.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15521x925d47b7)) {
                bundle.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15521x925d47b7, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15521x925d47b7));
            }
        } catch (org.json.JSONException e88) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15521x925d47b7, e88.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15528xbcc7e6e0)) {
                bundle.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15528xbcc7e6e0, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15528xbcc7e6e0));
            }
        } catch (org.json.JSONException e89) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15528xbcc7e6e0, e89.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15518x900fc92b)) {
                bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15518x900fc92b, jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15518x900fc92b));
            }
        } catch (org.json.JSONException e96) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15518x900fc92b, e96.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15533x8a34d31a)) {
                bundle.putFloat(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15533x8a34d31a, java.math.BigDecimal.valueOf(jSONObject.getDouble(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15533x8a34d31a)).floatValue());
            }
        } catch (org.json.JSONException e97) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15533x8a34d31a, e97.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15534xba22dbc2)) {
                bundle.putFloat(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15534xba22dbc2, java.math.BigDecimal.valueOf(jSONObject.getDouble(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15534xba22dbc2)).floatValue());
            }
        } catch (org.json.JSONException e98) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15534xba22dbc2, e98.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15535xbd025cf3)) {
                bundle.putFloat(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15535xbd025cf3, java.math.BigDecimal.valueOf(jSONObject.getDouble(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15535xbd025cf3)).floatValue());
            }
        } catch (org.json.JSONException e99) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15535xbd025cf3, e99.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15509x87ec77fa)) {
                bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15509x87ec77fa, jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15509x87ec77fa));
            }
        } catch (org.json.JSONException e100) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15509x87ec77fa, e100.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15524xdb7067b2)) {
                bundle.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15524xdb7067b2, jSONObject.getBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15524xdb7067b2));
            }
        } catch (org.json.JSONException e101) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15524xdb7067b2, e101.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("needAudioVolume")) {
                bundle.putBoolean("needAudioVolume", jSONObject.getBoolean("needAudioVolume"));
            }
        } catch (org.json.JSONException e102) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "needAudioVolume", e102.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15531x649328bc)) {
                bundle.putInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15531x649328bc, jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15531x649328bc));
            }
        } catch (org.json.JSONException e103) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15531x649328bc, e103.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1)) {
                bundle.putInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1));
            }
        } catch (org.json.JSONException e104) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, e104.getLocalizedMessage());
        }
        return bundle;
    }
}
