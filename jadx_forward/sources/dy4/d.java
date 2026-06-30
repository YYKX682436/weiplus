package dy4;

/* loaded from: classes8.dex */
public final class d implements sf.f {

    /* renamed from: a, reason: collision with root package name */
    public final nw4.k f326146a;

    /* renamed from: b, reason: collision with root package name */
    public final nw4.y2 f326147b;

    public d(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f326146a = env;
        this.f326147b = msg;
    }

    @Override // sf.f
    public org.json.JSONObject c() {
        org.json.JSONObject rawParams = this.f326147b.f422547d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rawParams, "rawParams");
        return rawParams;
    }

    @Override // sf.f
    public void e(sf.e eVar) {
        java.lang.Object obj = this.f326146a.f422393a;
        if (obj instanceof dy4.c) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.video.samelayer.IWebViewUILifeCycle");
            ((dy4.c) obj).Q3(eVar);
        }
    }

    @Override // sf.f
    public void f() {
    }

    @Override // sf.f
    public java.lang.String g(java.lang.String str) {
        nw4.g gVar = this.f326146a.f422396d;
        nw4.y2 y2Var = this.f326147b;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ':' + str, null);
        return null;
    }

    @Override // sf.f
    /* renamed from: getAppId */
    public java.lang.String mo50271x74292566() {
        return "";
    }

    @Override // sf.f
    /* renamed from: getContext */
    public android.content.Context mo50272x76847179() {
        return this.f326146a.f422393a;
    }

    @Override // sf.f
    public java.lang.String h(java.lang.String str, java.util.Map map) {
        nw4.g gVar = this.f326146a.f422396d;
        nw4.y2 y2Var = this.f326147b;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ':' + str, map);
        return null;
    }

    @Override // sf.f
    public void i(sf.e eVar) {
        java.lang.Object obj = this.f326146a.f422393a;
        if (!(obj instanceof dy4.c) || eVar == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.video.samelayer.IWebViewUILifeCycle");
        ((dy4.c) obj).g6(eVar);
    }

    @Override // sf.f
    public boolean j() {
        return false;
    }

    @Override // sf.f
    public boolean k() {
        java.lang.String optString = c().optString("action", "");
        if (optString != null) {
            return r26.i0.y(optString, "insert", false);
        }
        return false;
    }

    @Override // sf.f
    public java.lang.String l() {
        java.lang.String function = this.f326147b.f422552i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(function, "function");
        return function;
    }

    @Override // sf.f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m() {
        return null;
    }
}
