package yd1;

/* loaded from: classes7.dex */
public class l implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f542538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f542539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd1.o f542540c;

    public l(yd1.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f542540c = oVar;
        this.f542538a = c0Var;
        this.f542539b = i17;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            jSONObject.put("errCode", i18);
            jSONObject.put("errMsg", this.f542540c.k() + ":" + str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "createMediaContainer result, %s", jSONObject.toString());
        } catch (org.json.JSONException unused) {
        }
        this.f542538a.a(this.f542539b, jSONObject.toString());
    }
}
