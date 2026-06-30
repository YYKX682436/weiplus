package av4;

/* loaded from: classes.dex */
public final class c0 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f14277a;

    public c0(nw4.k kVar) {
        this.f14277a = kVar;
    }

    @Override // l81.e1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.OpenWeAppForWebSearchJSApi", "onAppBrandProcessDied, notify WebView appeared");
        av4.e0 e0Var = av4.e0.f14283d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isFinish", true);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "processDied");
        av4.e0.e(e0Var, this.f14277a, "onWeAppViewDidAppear", jSONObject);
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.OpenWeAppForWebSearchJSApi", "onAppBrandPreconditionError, notify WebView appeared");
        av4.e0 e0Var = av4.e0.f14283d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isFinish", true);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "preconditionError");
        av4.e0.e(e0Var, this.f14277a, "onWeAppViewDidAppear", jSONObject);
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.OpenWeAppForWebSearchJSApi", "onAppBrandUIEnter - WeApp appeared, notify WebView disappeared");
        av4.e0.e(av4.e0.f14283d, this.f14277a, "onWeAppViewDidDisappear", new org.json.JSONObject());
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.OpenWeAppForWebSearchJSApi", "onAppBrandUIExit isFinish:" + z17 + " - WeApp disappeared, notify WebView appeared");
        av4.e0 e0Var = av4.e0.f14283d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isFinish", z17);
        av4.e0.e(e0Var, this.f14277a, "onWeAppViewDidAppear", jSONObject);
    }
}
