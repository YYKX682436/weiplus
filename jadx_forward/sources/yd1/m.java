package yd1;

/* loaded from: classes7.dex */
public class m implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yd1.j f542541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f542542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542543c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f542544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yd1.o f542546f;

    public m(yd1.o oVar, yd1.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, java.lang.String str, int i17, java.lang.String str2) {
        this.f542546f = oVar;
        this.f542541a = jVar;
        this.f542542b = c0Var;
        this.f542543c = str;
        this.f542544d = i17;
        this.f542545e = str2;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            jSONObject.put("errCode", i18);
            jSONObject.put("errMsg", this.f542546f.k() + ":" + str);
            if (i18 == 0) {
                ik1.b0 b0Var = new ik1.b0();
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f542541a.f542536a);
                if (this.f542542b.mo50354x59eafec1().mo49619x6aa75256(r6Var, this.f542543c, true, b0Var) != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                    this.f542542b.a(this.f542544d, this.f542546f.o(java.lang.String.format("fail: createTempFileFrom fail %s", this.f542545e)));
                    return;
                } else {
                    jSONObject.put("tempFilePath", b0Var.f373357a);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "exportMediaContainer, fileName: %s, tempFile: [%s %s %s]", this.f542545e, b0Var.f373357a, r6Var.u(), r6Var.o());
                }
            } else {
                com.p314xaae8f345.mm.vfs.w6.h(this.f542541a.f542536a);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "exportMediaContainer result: %s", jSONObject.toString());
        } catch (org.json.JSONException unused) {
        }
        this.f542542b.a(this.f542544d, jSONObject.toString());
    }
}
