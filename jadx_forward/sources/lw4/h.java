package lw4;

/* loaded from: classes8.dex */
public abstract class h {
    public static java.lang.String a(long j17) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(j17 < 3600000 ? "mm:ss" : "HH:mm:ss");
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT+0:00"));
        return simpleDateFormat.format(java.lang.Long.valueOf(j17));
    }

    public static float b(android.content.Context context) {
        float f17 = ((android.app.Activity) context).getWindow().getAttributes().screenBrightness;
        if (f17 >= 0.0f) {
            return f17;
        }
        try {
            return android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness") / 255.0f;
        } catch (android.provider.Settings.SettingNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FtsVideoPlayerUtils", "ex %s", e17.getMessage());
            return 0.0f;
        }
    }

    public static java.lang.String c(org.json.JSONObject jSONObject) {
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15498x8f853862);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return "";
        }
        try {
            return optJSONArray.getString(0);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FtsVideoPlayerUtils", "ex %s", e17.getMessage());
            return "";
        }
    }

    public static float[] d(org.json.JSONObject jSONObject, android.content.Context context) {
        float[] fArr = new float[5];
        if (jSONObject.has("x")) {
            fArr[0] = i65.a.b(context, jSONObject.optInt("x"));
        } else {
            fArr[0] = Float.MAX_VALUE;
        }
        if (jSONObject.has("y")) {
            fArr[1] = i65.a.b(context, jSONObject.optInt("y"));
        } else {
            fArr[1] = Float.MAX_VALUE;
        }
        if (jSONObject.has("width")) {
            fArr[2] = i65.a.b(context, jSONObject.optInt("width"));
        } else {
            fArr[2] = Float.MAX_VALUE;
        }
        if (jSONObject.has("height")) {
            fArr[3] = i65.a.b(context, jSONObject.optInt("height"));
        } else {
            fArr[3] = Float.MAX_VALUE;
        }
        fArr[4] = 0.0f;
        return fArr;
    }
}
