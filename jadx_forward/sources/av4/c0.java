package av4;

/* loaded from: classes.dex */
public final class c0 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f95810a;

    public c0(nw4.k kVar) {
        this.f95810a = kVar;
    }

    @Override // l81.e1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.OpenWeAppForWebSearchJSApi", "onAppBrandProcessDied, notify WebView appeared");
        av4.e0 e0Var = av4.e0.f95816d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isFinish", true);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "processDied");
        av4.e0.e(e0Var, this.f95810a, "onWeAppViewDidAppear", jSONObject);
    }

    @Override // l81.e1
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.OpenWeAppForWebSearchJSApi", "onAppBrandPreconditionError, notify WebView appeared");
        av4.e0 e0Var = av4.e0.f95816d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isFinish", true);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "preconditionError");
        av4.e0.e(e0Var, this.f95810a, "onWeAppViewDidAppear", jSONObject);
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.OpenWeAppForWebSearchJSApi", "onAppBrandUIEnter - WeApp appeared, notify WebView disappeared");
        av4.e0.e(av4.e0.f95816d, this.f95810a, "onWeAppViewDidDisappear", new org.json.JSONObject());
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.OpenWeAppForWebSearchJSApi", "onAppBrandUIExit isFinish:" + z17 + " - WeApp disappeared, notify WebView appeared");
        av4.e0 e0Var = av4.e0.f95816d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isFinish", z17);
        av4.e0.e(e0Var, this.f95810a, "onWeAppViewDidAppear", jSONObject);
    }
}
