package yd1;

/* loaded from: classes7.dex */
public class p implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f542550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f542551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd1.t f542552c;

    public p(yd1.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f542552c = tVar;
        this.f542550a = c0Var;
        this.f542551b = i17;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            jSONObject.put("errCode", i18);
            jSONObject.put("errMsg", this.f542552c.k() + ":" + str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", "getMediaTrack result, %s", jSONObject.toString());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", e17, e17.getMessage(), new java.lang.Object[0]);
        }
        this.f542550a.a(this.f542551b, jSONObject.toString());
    }
}
