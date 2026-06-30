package yd1;

/* loaded from: classes7.dex */
public class d implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f542522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f542523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f542524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yd1.h f542525d;

    public d(yd1.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, org.json.JSONObject jSONObject) {
        this.f542525d = hVar;
        this.f542522a = c0Var;
        this.f542523b = i17;
        this.f542524c = jSONObject;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        org.json.JSONObject jSONObject2 = this.f542524c;
        int i19 = this.f542523b;
        yd1.h hVar = this.f542525d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f542522a;
        try {
            if (i18 != 0) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("errCode", i18);
                jSONObject3.put("errMsg", hVar.k() + ":fail:" + str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "editForMediaSdk result, %s", jSONObject3.toString());
                c0Var.a(i19, jSONObject3.toString());
            } else {
                jSONObject2.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, jSONObject.optString("wxaFilePath", ""));
                hVar.J(c0Var, jSONObject2, new yd1.c(this));
            }
        } catch (org.json.JSONException e17) {
            c0Var.a(i19, hVar.o(java.lang.String.format("fail: editForMediaSdk format result failed, %s", e17.getMessage())));
        }
    }
}
