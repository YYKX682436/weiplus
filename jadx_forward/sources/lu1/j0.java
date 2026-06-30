package lu1;

/* loaded from: classes4.dex */
public abstract class j0 {
    public static r45.nu a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        r45.nu nuVar = new r45.nu();
        nuVar.f463205d = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        nuVar.f463206e = jSONObject.optString("descriptor");
        nuVar.f463207f = jSONObject.optString("phone");
        nuVar.f463208g = jSONObject.optString("country");
        nuVar.f463209h = jSONObject.optString("province");
        nuVar.f463210i = jSONObject.optString("city");
        nuVar.f463211m = jSONObject.optString("address");
        nuVar.f463212n = (float) jSONObject.optDouble("distance");
        nuVar.f463213o = (float) jSONObject.optDouble("longitude");
        nuVar.f463214p = (float) jSONObject.optDouble("latitude");
        nuVar.f463215q = jSONObject.optString("jump_url");
        nuVar.f463216r = jSONObject.optString("app_brand_user_name");
        nuVar.f463217s = jSONObject.optString("app_brand_pass");
        return nuVar;
    }
}
