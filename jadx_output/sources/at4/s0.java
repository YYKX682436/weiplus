package at4;

/* loaded from: classes9.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f13947a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f13948b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f13949c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f13950d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f13951e;

    public void a(org.json.JSONObject jSONObject) {
        this.f13947a = jSONObject.optString("url");
        this.f13948b = jSONObject.optString("wording");
        this.f13949c = jSONObject.optString("icon");
        this.f13950d = jSONObject.optString("btn_text");
        jSONObject.optInt("type");
        this.f13951e = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        jSONObject.optString("small_title");
    }
}
