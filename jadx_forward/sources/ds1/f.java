package ds1;

/* loaded from: classes7.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds1.j f324370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324371e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ds1.j jVar, java.lang.String str) {
        super(0);
        this.f324370d = jVar;
        this.f324371e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f324370d.getClass();
        java.lang.String str = this.f324371e;
        if (str != null) {
            ts1.o oVar = new ts1.o(str, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.i(str, false), nu4.b0.P, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175980c, null, null, null, null, false, null, null, 2032, null);
            oVar.d();
            oVar.f();
            oVar.n();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y3.a(oVar.f(), oVar.n())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] onUrlExposed cache expired");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21075, 500, str, "", 3, 0);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                jSONArray.put(str);
                jSONObject.put("pageUrlList", jSONArray);
                od.l lVar = fs1.j.f347826f;
                if (lVar != null) {
                    lVar.f426051c.a(new od.d("urlExposed", jSONObject));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
