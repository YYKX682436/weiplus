package yd1;

/* loaded from: classes7.dex */
public class a implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f542515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f542516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd1.h f542517c;

    public a(yd1.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f542517c = hVar;
        this.f542515a = c0Var;
        this.f542516b = i17;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        yd1.h.H(this.f542517c, this.f542515a, i17, i18, str, jSONObject, jSONObject2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "editFormatResult result, %s", jSONObject2.toString());
        this.f542515a.a(this.f542516b, jSONObject2.toString());
    }
}
