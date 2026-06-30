package vg0;

/* loaded from: classes8.dex */
public final class i implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f517987a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f517988b;

    public i(java.lang.ref.WeakReference callbackRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackRef, "callbackRef");
        this.f517987a = callbackRef;
        this.f517988b = "onSetInputWord";
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.Object obj = map != null ? map.get("query") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        tg0.q1 q1Var = (tg0.q1) this.f517987a.get();
        if (q1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onSetInputWord, ".concat(str));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = ((rx4.e) q1Var).f482667a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.f4((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5) activityC0065xcd7aa112, str));
        }
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f517988b;
    }
}
