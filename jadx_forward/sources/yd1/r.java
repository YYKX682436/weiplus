package yd1;

/* loaded from: classes7.dex */
public class r implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f542556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f542557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd1.t f542558c;

    public r(yd1.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f542558c = tVar;
        this.f542556a = c0Var;
        this.f542557b = i17;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            jSONObject.put("errCode", i18);
            jSONObject.put("errMsg", this.f542558c.k() + ":" + str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", "updateMediaTrack result, %s", jSONObject.toString());
        } catch (org.json.JSONException unused) {
        }
        this.f542556a.a(this.f542557b, jSONObject.toString());
    }
}
