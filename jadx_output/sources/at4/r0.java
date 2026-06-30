package at4;

/* loaded from: classes9.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13935a;

    /* renamed from: b, reason: collision with root package name */
    public int f13936b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f13937c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f13938d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f13939e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f13940f = new java.util.ArrayList();

    public static at4.r0 a(org.json.JSONObject jSONObject) {
        org.json.JSONArray optJSONArray;
        if (jSONObject == null) {
            return null;
        }
        at4.r0 r0Var = new at4.r0();
        jSONObject.optInt("block_layer_report_id");
        r0Var.f13935a = jSONObject.optBoolean("is_show");
        r0Var.f13936b = jSONObject.optInt("action_type");
        r0Var.f13937c = jSONObject.optString("tiny_app_username");
        r0Var.f13938d = jSONObject.optString("tiny_app_path");
        r0Var.f13939e = jSONObject.optString("url");
        if (jSONObject.has("text_info_array") && (optJSONArray = jSONObject.optJSONArray("text_info_array")) != null) {
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                at4.q0 q0Var = new at4.q0();
                q0Var.f13927a = optJSONObject.optString("main_wording");
                q0Var.f13928b = optJSONObject.optString("reminder_content");
                q0Var.f13929c = optJSONObject.optString("action_btn_text");
                q0Var.f13930d = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE);
                ((java.util.ArrayList) r0Var.f13940f).add(q0Var);
            }
        }
        return r0Var;
    }
}
