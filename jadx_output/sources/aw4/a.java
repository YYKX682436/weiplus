package aw4;

/* loaded from: classes.dex */
public abstract class a implements com.tencent.mm.modelbase.u0, com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public aw4.q f14844d;

    public a(aw4.q qVar) {
        this.f14844d = qVar;
        gm0.j1.d().a(2975, this);
        com.tencent.mm.app.w.INSTANCE.a(this);
    }

    public final int a() {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        aw4.q qVar = this.f14844d;
        if (qVar == null || (webView = qVar.getWebView()) == null) {
            return -1;
        }
        return webView.hashCode();
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        aw4.l b17;
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchData", "onAppBackground " + str);
        aw4.q qVar = this.f14844d;
        if (qVar == null || (b17 = qVar.b()) == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, str);
            jSONObject.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, c01.id.c());
            av4.j jVar = b17.f14326a;
            if (jVar != null && (webView = jVar.getWebView()) != null) {
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onAppBackground", jSONObject2);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onAppBackground", "onAppBackground", jSONObject2}, 3));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(webView, format));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
            kotlin.jvm.internal.o.f(b17.g().toString(), "toString(...)");
        } catch (java.lang.Exception unused) {
            kotlin.jvm.internal.o.f(b17.f().toString(), "toString(...)");
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        aw4.l b17;
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchData", "onAppForeground " + str);
        aw4.q qVar = this.f14844d;
        if (qVar == null || (b17 = qVar.b()) == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, str);
            jSONObject.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, c01.id.c());
            av4.j jVar = b17.f14326a;
            if (jVar != null && (webView = jVar.getWebView()) != null) {
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onAppForeground", jSONObject2);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onAppForeground", "onAppForeground", jSONObject2}, 3));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(webView, format));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
            kotlin.jvm.internal.o.f(b17.g().toString(), "toString(...)");
        } catch (java.lang.Exception unused) {
            kotlin.jvm.internal.o.f(b17.f().toString(), "toString(...)");
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        aw4.l b17;
        java.lang.String str2;
        aw4.l b18;
        if (m1Var instanceof su4.s1) {
            su4.s1 s1Var = (su4.s1) m1Var;
            if (s1Var.f413092h == a()) {
                r45.e97 e97Var = (r45.e97) s1Var.f413089e.f70711b.f70700a;
                if (e97Var != null) {
                    aw4.q qVar = this.f14844d;
                    if (qVar == null || (b18 = qVar.b()) == null) {
                        str2 = null;
                    } else {
                        if (str == null) {
                            str = "";
                        }
                        java.lang.String str3 = e97Var.f373181d;
                        if (str3 == null) {
                            str3 = "";
                        }
                        str2 = b18.m(i18, str, str3, e97Var.f373182e);
                    }
                    if (str2 != null) {
                        return;
                    }
                }
                aw4.q qVar2 = this.f14844d;
                if (qVar2 == null || (b17 = qVar2.b()) == null) {
                    return;
                }
                b17.m(-1, "", "", s1Var.f413091g);
            }
        }
    }
}
