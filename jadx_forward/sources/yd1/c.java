package yd1;

/* loaded from: classes7.dex */
public class c implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yd1.d f542521a;

    public c(yd1.d dVar) {
        this.f542521a = dVar;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        yd1.d dVar = this.f542521a;
        yd1.h.H(dVar.f542525d, dVar.f542522a, i17, i18, str, jSONObject, jSONObject2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "editFormatResult result, %s", jSONObject2.toString());
        dVar.f542522a.a(dVar.f542523b, jSONObject2.toString());
    }
}
