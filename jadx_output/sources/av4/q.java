package av4;

/* loaded from: classes8.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public av4.j f14326a;

    /* renamed from: b, reason: collision with root package name */
    public av4.q f14327b;

    public q(av4.j jVar) {
        this.f14326a = jVar;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView2;
        r45.e64 i17;
        ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).getClass();
        org.json.JSONObject jSONObject = null;
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227168s) && (i17 = su4.r2.i()) != null) {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("latitude", java.lang.Float.valueOf(i17.f373047e));
            jSONObject.put("longitude", java.lang.Float.valueOf(i17.f373046d));
            jSONObject.put("precision", i17.f373048f);
            jSONObject.put("macAddr", i17.f373049g);
            jSONObject.put("cellId", i17.f373050h);
            jSONObject.put("gpsSource", i17.f373051i);
            jSONObject.put("address", i17.f373052m);
        }
        if (jSONObject == null) {
            av4.j jVar = this.f14326a;
            if (jVar != null && (webView = jVar.getWebView()) != null) {
                java.lang.String jSONObject2 = f().toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onCurrentLocationReady", jSONObject2);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onCurrentLocationReady", "onCurrentLocationReady", jSONObject2}, 3));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(webView, format));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
            java.lang.String jSONObject3 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        }
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        jSONObject4.put("json", jSONObject.toString());
        jSONObject4.put("ret", 0);
        av4.j jVar2 = this.f14326a;
        if (jVar2 != null && (webView2 = jVar2.getWebView()) != null) {
            java.lang.String jSONObject5 = jSONObject4.toString();
            kotlin.jvm.internal.o.f(jSONObject5, "toString(...)");
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onCurrentLocationReady", jSONObject5);
                java.lang.String format2 = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onCurrentLocationReady", "onCurrentLocationReady", jSONObject5}, 3));
                kotlin.jvm.internal.o.f(format2, "format(...)");
                pm0.v.X(new av4.t0(webView2, format2));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e18, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
        java.lang.String jSONObject6 = g().toString();
        kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
        return jSONObject6;
    }

    public boolean b(int i17, java.lang.String feature, int i18) {
        kotlin.jvm.internal.o.g(feature, "feature");
        return false;
    }

    public java.lang.String c(java.lang.String str) {
        java.lang.String jSONObject = f().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    public abstract boolean d();

    public final void e(com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView, int i17) {
        if (baseWebSearchWebView != null) {
            org.json.JSONObject g17 = g();
            g17.put("height", i17);
            java.lang.String jSONObject = g17.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onGetKeyboardHeight", jSONObject);
                java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onGetKeyboardHeight", "onGetKeyboardHeight", jSONObject}, 3));
                kotlin.jvm.internal.o.f(format, "format(...)");
                pm0.v.X(new av4.t0(baseWebSearchWebView, format));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
    }

    public final org.json.JSONObject f() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("ret", -1);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public final org.json.JSONObject g() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("ret", 0);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getCurrentLocation(java.lang.String str) {
        try {
            boolean z17 = true;
            if (new org.json.JSONObject(str).optInt("needUpdate", 0) != 1) {
                z17 = false;
            }
            if (!z17) {
                return a();
            }
            su4.e1 e1Var = (su4.e1) i95.n0.c(su4.e1.class);
            av4.p pVar = new av4.p(this);
            ((sg0.a3) e1Var).getClass();
            sg0.z2 z2Var = new sg0.z2(pVar);
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().k(z2Var, false);
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getExpConfig(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("key", "");
            java.lang.String j17 = j62.e.g().j(optString, jSONObject.optString("defValue", ""), jSONObject.optInt("skipReport", -1) <= 0, true);
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt(0);
            com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt(0);
            if (optString != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MultiProcessWebSearchJSApi", "getExptInfo, ret: " + j62.e.g().b(optString, pInt, pInt2));
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.putOpt("ret", "0");
            jSONObject2.putOpt("configResult", j17);
            jSONObject2.putOpt("exptId", pInt);
            jSONObject2.putOpt("groupId", pInt2);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MultiProcessWebSearchJSApi", "getExpConfig, key:" + optString + ", returnJsonObj: " + jSONObject2);
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject4 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getKeyboardHeight(java.lang.String str) {
        org.json.JSONObject g17 = g();
        av4.j jVar = this.f14326a;
        g17.put("height", jVar != null ? jVar.z2() : 0);
        java.lang.String jSONObject = g17.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getPermanentData(java.lang.String str) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MultiProcessWebSearchJSApi", "getPermanentData " + str);
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("key", "");
            java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u(optString, "");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("ret", 0);
            jSONObject.put("key", optString);
            jSONObject.put("value", u17);
            av4.j jVar = this.f14326a;
            if (jVar != null && (webView2 = jVar.getWebView()) != null) {
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onPermanentDataReady", jSONObject2);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onPermanentDataReady", "onPermanentDataReady", jSONObject2}, 3));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(webView2, format));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
            java.lang.String jSONObject3 = g().toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception unused) {
            av4.j jVar2 = this.f14326a;
            if (jVar2 != null && (webView = jVar2.getWebView()) != null) {
                java.lang.String jSONObject4 = f().toString();
                kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onPermanentDataReady", jSONObject4);
                    java.lang.String format2 = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onPermanentDataReady", "onPermanentDataReady", jSONObject4}, 3));
                    kotlin.jvm.internal.o.f(format2, "format(...)");
                    pm0.v.X(new av4.t0(webView, format2));
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e18, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
            java.lang.String jSONObject5 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject5, "toString(...)");
            return jSONObject5;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String isActivityResume(java.lang.String str) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        android.content.Context context;
        av4.j jVar = this.f14326a;
        if (jVar != null && (webView = jVar.getWebView()) != null && (context = webView.getContext()) != null && (context instanceof android.content.MutableContextWrapper)) {
            android.content.Context baseContext = ((android.content.MutableContextWrapper) context).getBaseContext();
            if ((baseContext instanceof androidx.appcompat.app.AppCompatActivity) && ((androidx.appcompat.app.AppCompatActivity) baseContext).mo133getLifecycle().b() == androidx.lifecycle.n.RESUMED) {
                java.lang.String jSONObject = g().toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
        }
        java.lang.String jSONObject2 = f().toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String isAppForeground(java.lang.String str) {
        return g().put("isAppForeground", d() ? 1 : 0).toString();
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String isSupportFeature(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            java.lang.String optString = jSONObject.optString("feature", "");
            int optInt2 = jSONObject.optInt("version", 0);
            kotlin.jvm.internal.o.d(optString);
            java.lang.String jSONObject2 = b(optInt, optString, optInt2) ? g().toString() : f().toString();
            kotlin.jvm.internal.o.d(jSONObject2);
            return jSONObject2;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject3 = f().toString();
            kotlin.jvm.internal.o.d(jSONObject3);
            return jSONObject3;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String removePermanentData(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MultiProcessWebSearchJSApi", "removePermanentData " + str);
        try {
            ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().remove(new org.json.JSONObject(str).optString("key", ""));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String savePermanentData(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("key", "");
            java.lang.String optString2 = jSONObject.optString("value", "");
            boolean D = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D(optString, optString2);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.MultiProcessWebSearchJSApi", "savePermanentData key:" + optString + " value:" + optString2 + " result:" + D);
            return D ? g().toString() : f().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }
}
