package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class uc implements com.tencent.mm.plugin.appbrand.page.cd {

    /* renamed from: a, reason: collision with root package name */
    public boolean f87147a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f87148b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f87149c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wc f87150d;

    public uc(com.tencent.mm.plugin.appbrand.page.wc wcVar) {
        this.f87150d = wcVar;
    }

    public final java.lang.String a() {
        return com.tencent.luggage.sdk.jsapi.component.o.f47357i0 + java.lang.String.format(java.util.Locale.US, "%s/%d/", this.f87150d.H(), java.lang.Integer.valueOf(this.f87150d.J().E0().f305852r.pkgVersion));
    }

    public void b(boolean z17) {
        java.net.URL url;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.appbrand.page.wc wcVar = this.f87150d;
        com.tencent.mars.xlog.Log.i("Luggage.MPPageViewRenderer", "injectEnvFields preload=%b, hash=%d, viewEngine.hash=%d", valueOf, java.lang.Integer.valueOf(wcVar.hashCode()), java.lang.Integer.valueOf(wcVar.f0().hashCode()));
        if (z17) {
            ((com.tencent.luggage.sdk.jsapi.component.b) wcVar.F()).D0(((com.tencent.luggage.sdk.jsapi.component.b) wcVar.F()).A0());
            c();
            return;
        }
        java.net.URL url2 = null;
        if (!android.text.TextUtils.isEmpty("(function (global) {\n        if (!Object.assign) {\n            Object.defineProperty(Object, \"assign\", {\n                enumerable: false,\n                configurable: true,\n                writable: true,\n                value: function (target, firstSource) {\n                    \"use strict\";\n                    if (target === undefined || target === null)\n                        throw new TypeError(\"Cannot convert first argument to object\");\n                    var to = Object(target);\n                    for (var i = 1; i < arguments.length; i++) {\n                        var nextSource = arguments[i];\n                        if (nextSource === undefined || nextSource === null) continue;\n                        var keysArray = Object.keys(Object(nextSource));\n                        for (var nextIndex = 0, len = keysArray.length; nextIndex < len; nextIndex++) {\n                            var nextKey = keysArray[nextIndex];\n                            var desc = Object.getOwnPropertyDescriptor(nextSource, nextKey);\n                            if (desc !== undefined && desc.enumerable) to[nextKey] = nextSource[nextKey];\n                        }\n                    }\n                    return to;\n                }\n            });\n        }\n})(this);")) {
            ((com.tencent.luggage.sdk.jsapi.component.b) wcVar.F()).getJsRuntime().evaluateJavascript("(function (global) {\n        if (!Object.assign) {\n            Object.defineProperty(Object, \"assign\", {\n                enumerable: false,\n                configurable: true,\n                writable: true,\n                value: function (target, firstSource) {\n                    \"use strict\";\n                    if (target === undefined || target === null)\n                        throw new TypeError(\"Cannot convert first argument to object\");\n                    var to = Object(target);\n                    for (var i = 1; i < arguments.length; i++) {\n                        var nextSource = arguments[i];\n                        if (nextSource === undefined || nextSource === null) continue;\n                        var keysArray = Object.keys(Object(nextSource));\n                        for (var nextIndex = 0, len = keysArray.length; nextIndex < len; nextIndex++) {\n                            var nextKey = keysArray[nextIndex];\n                            var desc = Object.getOwnPropertyDescriptor(nextSource, nextKey);\n                            if (desc !== undefined && desc.enumerable) to[nextKey] = nextSource[nextKey];\n                        }\n                    }\n                    return to;\n                }\n            });\n        }\n})(this);", null);
        } else if (((com.tencent.luggage.sdk.jsapi.component.b) wcVar.F()).a0()) {
            throw new java.lang.IllegalAccessError("Cannot find object_polyfill.js");
        }
        wcVar.f0().evaluateJavascript(java.lang.String.format(java.util.Locale.US, "history.pushState({},\"\",\"%s\");", a() + "page-frame.html"), null);
        wcVar.f0().X(";(function(){return window.devicePixelRatio})();", new com.tencent.mm.plugin.appbrand.page.qc(this));
        org.json.JSONObject a17 = cf.f.a(wcVar.J().C0().U0());
        try {
            a17.put("isFirstPage", ((com.tencent.luggage.sdk.jsapi.component.b) wcVar.F()).j2());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("Luggage.AbstractMPPageViewRenderer", "generateWxConfig appId[%s] put isFirstPage e=%s", wcVar.H(), e17);
        }
        try {
            a17.put("prerender", wcVar.J().u0().W1 == com.tencent.luggage.sdk.launching.p.PRE_RENDER);
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("Luggage.AbstractMPPageViewRenderer", "generateWxConfig appId[%s] put prerender e=%s", wcVar.H(), e18);
        }
        a17.remove("permission");
        a17.remove("subpackages");
        a17.remove("pages");
        java.lang.String jSONObject = a17.toString();
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String format = java.lang.String.format(locale, ";if(typeof __wxConfig==='undefined'){var __wxConfig={};};Object.assign(__wxConfig, %s);", jSONObject);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.page.vc vcVar = new com.tencent.mm.plugin.appbrand.page.vc(null);
        wcVar.D = vcVar;
        vcVar.f87182a = jSONObject;
        vcVar.f87183b = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("Luggage.MPPageViewRenderer", "injectEnvFields, evaluate assignWxConfig start, hash=%d", java.lang.Integer.valueOf(wcVar.hashCode()));
        com.tencent.mm.plugin.appbrand.page.dd f07 = wcVar.f0();
        try {
            url = new java.net.URL("https", com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyj), "assignWxConfig");
        } catch (java.net.MalformedURLException unused) {
            url = null;
        }
        f07.R(url, format, new com.tencent.mm.plugin.appbrand.page.rc(this));
        c();
        if (wcVar.J().E0().f47296w && !wcVar.J().s2()) {
            wcVar.P("WAVConsole.js", ((com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) ((com.tencent.luggage.sdk.jsapi.component.b) wcVar.F()).q(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class)).M("WAVConsole.js"));
        }
        if (com.tencent.mm.plugin.appbrand.performance.h.f(wcVar.J())) {
            wcVar.P("WAPerf.js", ((com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) ((com.tencent.luggage.sdk.jsapi.component.b) wcVar.F()).q(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class)).M("WAPerf.js"));
        }
        if ((wcVar.J().s2() || wcVar.J().N0()) && !wcVar.F) {
            wcVar.P("WARemoteDebug.js", ((com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) ((com.tencent.luggage.sdk.jsapi.component.b) wcVar.F()).q(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class)).M("WARemoteDebug.js"));
            wcVar.F = true;
        }
        java.lang.String format2 = java.lang.String.format(locale, ";(function(){ if(__wxConfig.preload) { %s; return true; } else { return false; }})();", com.tencent.mm.plugin.appbrand.jsapi.jf.c("onWxConfigReady", "", 0, 0));
        com.tencent.mars.xlog.Log.i("Luggage.MPPageViewRenderer", "injectEnvFields, evaluate onWxConfigReady start, hash=%d", java.lang.Integer.valueOf(wcVar.hashCode()));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.page.dd f08 = wcVar.f0();
        try {
            url2 = new java.net.URL("https", com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyj), "onWxConfigReady");
        } catch (java.net.MalformedURLException unused2) {
        }
        f08.R(url2, format2, new com.tencent.mm.plugin.appbrand.page.sc(this, currentTimeMillis2));
        wcVar.f87221z = false;
        if (!wcVar.f86373h) {
            try {
                wcVar.N("injectAppSharedPageFrameScript").d();
                wcVar.f86373h = true;
            } catch (com.tencent.mm.plugin.appbrand.appcache.t6 unused3) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0096, code lost:
    
        if (n3.x0.b(r1) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r10 = this;
            com.tencent.mm.plugin.appbrand.page.wc r0 = r10.f87150d
            boolean r1 = r0.f86385w
            java.lang.String r2 = "Luggage.AbstractMPPageViewRenderer"
            r3 = 1
            if (r1 == 0) goto La
            goto L1b
        La:
            java.lang.String r1 = "injectPageInfoReport"
            com.tencent.mars.xlog.Log.i(r2, r1)
            r0.f86385w = r3
            java.lang.String r1 = "wxa_library/wx_assistant_page_info.js"
            java.lang.String r4 = ik1.f.e(r1)
            r0.P(r1, r4)
        L1b:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.tencent.mm.plugin.appbrand.jsapi.l r4 = r0.F()
            com.tencent.luggage.sdk.jsapi.component.b r4 = (com.tencent.luggage.sdk.jsapi.component.b) r4
            xi1.g r4 = r4.getWindowAndroid()
            android.util.DisplayMetrics r4 = r4.getVDisplayMetrics()
            int r5 = r4.widthPixels
            int r6 = r4.heightPixels
            float r7 = (float) r5
            float r8 = r4.density
            float r7 = r7 / r8
            double r7 = (double) r7
            double r7 = java.lang.Math.ceil(r7)
            int r7 = (int) r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.tencent.mm.plugin.appbrand.jsapi.l r8 = r0.F()
            com.tencent.luggage.sdk.jsapi.component.b r8 = (com.tencent.luggage.sdk.jsapi.component.b) r8
            java.lang.String r9 = "width"
            r8.K0(r1, r9, r7)
            float r4 = r4.density
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            com.tencent.mm.plugin.appbrand.jsapi.l r7 = r0.F()
            com.tencent.luggage.sdk.jsapi.component.b r7 = (com.tencent.luggage.sdk.jsapi.component.b) r7
            java.lang.String r8 = "pixelRatio"
            r7.K0(r1, r8, r4)
            java.lang.String r4 = r1.toString()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r7 = "__deviceInfo__:%s"
            com.tencent.mars.xlog.Log.i(r2, r7, r4)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}
            java.lang.String r4 = ";if(typeof __deviceInfo__ ==='undefined'){ var __deviceInfo__ = %s; } else {Object.assign(__deviceInfo__, %s)};"
            java.lang.String r1 = java.lang.String.format(r2, r4, r1)
            com.tencent.mm.plugin.appbrand.jsapi.l r2 = r0.F()
            com.tencent.luggage.sdk.jsapi.component.b r2 = (com.tencent.luggage.sdk.jsapi.component.b) r2
            com.tencent.mm.plugin.appbrand.jsruntime.t r2 = r2.getJsRuntime()
            r4 = 0
            r2.evaluateJavascript(r1, r4)
            android.view.ViewGroup r1 = r0.f86371f
            if (r1 == 0) goto L98
            java.util.WeakHashMap r2 = n3.l1.f334362a
            boolean r1 = n3.x0.b(r1)
            if (r1 != 0) goto L9d
        L98:
            com.tencent.mm.plugin.appbrand.page.fb r1 = r0.f86372g
            r1.N(r5, r6)
        L9d:
            boolean r1 = r10.f87149c
            if (r1 != 0) goto Lb1
            boolean r1 = r0.f86380r
            if (r1 == 0) goto Laf
            java.lang.String r1 = "wxa_library/webview_pf.js"
            java.lang.String r2 = ik1.f.e(r1)
            r0.P(r1, r2)
        Laf:
            r10.f87149c = r3
        Lb1:
            boolean r1 = r10.f87147a
            if (r1 != 0) goto Lc1
            java.lang.String r1 = "wxa_library/android-webview.js"
            java.lang.String r2 = ik1.f.e(r1)
            r0.P(r1, r2)
            r10.f87147a = r3
        Lc1:
            boolean r1 = r10.f87148b
            if (r1 != 0) goto Ld4
            com.tencent.mm.plugin.appbrand.page.hb r1 = r0.O()
            java.lang.String r2 = "WAWebview.js"
            java.lang.String r1 = r1.a(r2)
            r0.P(r2, r1)
            r10.f87148b = r3
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.uc.c():void");
    }
}
