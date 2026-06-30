package at4;

/* loaded from: classes9.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f13987a;

    /* renamed from: b, reason: collision with root package name */
    public int f13988b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f13989c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f13990d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f13991e;

    public static at4.x0 a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        at4.x0 x0Var = new at4.x0();
        x0Var.f13987a = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        jSONObject.optString("desc");
        jSONObject.optString("logo_url");
        x0Var.f13988b = jSONObject.optInt("jump_type", 0);
        x0Var.f13989c = jSONObject.optString("jump_url");
        x0Var.f13990d = jSONObject.optString(dm.i4.COL_USERNAME);
        x0Var.f13991e = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        return x0Var;
    }
}
