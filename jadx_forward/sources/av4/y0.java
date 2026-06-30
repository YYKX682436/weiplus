package av4;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final av4.y0 f95883a = new av4.y0();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e webView, java.lang.String funcName, org.json.JSONObject paramsObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsObj, "paramsObj");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "notifyJsEvent " + funcName + ' ' + paramsObj);
            pm0.v.X(new av4.u0(funcName, webView, "javascript:window['" + funcName + "'] && " + funcName + '(' + paramsObj + ')'));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e webView, java.lang.String funcName, java.lang.String params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEventFromFlutter: ".concat(funcName));
            pm0.v.X(new av4.v0(webView, "javascript:window['" + funcName + "'] && " + funcName + '(' + params + ')'));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApiNotifier", "notifyJsEventFromFlutter error, funcName: " + funcName + ", error: " + e17.getMessage());
        }
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e webView, java.lang.String funcName, org.json.JSONObject paramsObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsObj, "paramsObj");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<java.lang.String> keys = paramsObj.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
            linkedHashMap.put(next, paramsObj.opt(next));
        }
        pm0.v.X(new av4.x0(funcName, nw4.x2.c(funcName, linkedHashMap, false, webView.m81403xce19f7b8()), webView));
    }
}
