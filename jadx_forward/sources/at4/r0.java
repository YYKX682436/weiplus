package at4;

/* loaded from: classes9.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f95468a;

    /* renamed from: b, reason: collision with root package name */
    public int f95469b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f95470c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f95471d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f95472e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f95473f = new java.util.ArrayList();

    public static at4.r0 a(org.json.JSONObject jSONObject) {
        org.json.JSONArray optJSONArray;
        if (jSONObject == null) {
            return null;
        }
        at4.r0 r0Var = new at4.r0();
        jSONObject.optInt("block_layer_report_id");
        r0Var.f95468a = jSONObject.optBoolean("is_show");
        r0Var.f95469b = jSONObject.optInt("action_type");
        r0Var.f95470c = jSONObject.optString("tiny_app_username");
        r0Var.f95471d = jSONObject.optString("tiny_app_path");
        r0Var.f95472e = jSONObject.optString("url");
        if (jSONObject.has("text_info_array") && (optJSONArray = jSONObject.optJSONArray("text_info_array")) != null) {
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                at4.q0 q0Var = new at4.q0();
                q0Var.f95460a = optJSONObject.optString("main_wording");
                q0Var.f95461b = optJSONObject.optString("reminder_content");
                q0Var.f95462c = optJSONObject.optString("action_btn_text");
                q0Var.f95463d = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68);
                ((java.util.ArrayList) r0Var.f95473f).add(q0Var);
            }
        }
        return r0Var;
    }
}
