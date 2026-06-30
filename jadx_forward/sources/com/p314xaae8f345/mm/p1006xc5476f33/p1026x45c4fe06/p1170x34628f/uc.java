package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class uc implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.cd {

    /* renamed from: a, reason: collision with root package name */
    public boolean f168680a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f168681b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f168682c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc f168683d;

    public uc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc wcVar) {
        this.f168683d = wcVar;
    }

    public final java.lang.String a() {
        return com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.o.f128890i0 + java.lang.String.format(java.util.Locale.US, "%s/%d/", this.f168683d.H(), java.lang.Integer.valueOf(this.f168683d.J().E0().f387385r.f33456x1c82a56c));
    }

    public void b(boolean z17) {
        java.net.URL url;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc wcVar = this.f168683d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewRenderer", "injectEnvFields preload=%b, hash=%d, viewEngine.hash=%d", valueOf, java.lang.Integer.valueOf(wcVar.hashCode()), java.lang.Integer.valueOf(wcVar.f0().hashCode()));
        if (z17) {
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) wcVar.F()).D0(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) wcVar.F()).A0());
            c();
            return;
        }
        java.net.URL url2 = null;
        if (!android.text.TextUtils.isEmpty("(function (global) {\n        if (!Object.assign) {\n            Object.defineProperty(Object, \"assign\", {\n                enumerable: false,\n                configurable: true,\n                writable: true,\n                value: function (target, firstSource) {\n                    \"use strict\";\n                    if (target === undefined || target === null)\n                        throw new TypeError(\"Cannot convert first argument to object\");\n                    var to = Object(target);\n                    for (var i = 1; i < arguments.length; i++) {\n                        var nextSource = arguments[i];\n                        if (nextSource === undefined || nextSource === null) continue;\n                        var keysArray = Object.keys(Object(nextSource));\n                        for (var nextIndex = 0, len = keysArray.length; nextIndex < len; nextIndex++) {\n                            var nextKey = keysArray[nextIndex];\n                            var desc = Object.getOwnPropertyDescriptor(nextSource, nextKey);\n                            if (desc !== undefined && desc.enumerable) to[nextKey] = nextSource[nextKey];\n                        }\n                    }\n                    return to;\n                }\n            });\n        }\n})(this);")) {
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) wcVar.F()).mo50357xcd94f799().mo14660x738236e6("(function (global) {\n        if (!Object.assign) {\n            Object.defineProperty(Object, \"assign\", {\n                enumerable: false,\n                configurable: true,\n                writable: true,\n                value: function (target, firstSource) {\n                    \"use strict\";\n                    if (target === undefined || target === null)\n                        throw new TypeError(\"Cannot convert first argument to object\");\n                    var to = Object(target);\n                    for (var i = 1; i < arguments.length; i++) {\n                        var nextSource = arguments[i];\n                        if (nextSource === undefined || nextSource === null) continue;\n                        var keysArray = Object.keys(Object(nextSource));\n                        for (var nextIndex = 0, len = keysArray.length; nextIndex < len; nextIndex++) {\n                            var nextKey = keysArray[nextIndex];\n                            var desc = Object.getOwnPropertyDescriptor(nextSource, nextKey);\n                            if (desc !== undefined && desc.enumerable) to[nextKey] = nextSource[nextKey];\n                        }\n                    }\n                    return to;\n                }\n            });\n        }\n})(this);", null);
        } else if (((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) wcVar.F()).a0()) {
            throw new java.lang.IllegalAccessError("Cannot find object_polyfill.js");
        }
        wcVar.f0().mo14660x738236e6(java.lang.String.format(java.util.Locale.US, "history.pushState({},\"\",\"%s\");", a() + "page-frame.html"), null);
        wcVar.f0().X(";(function(){return window.devicePixelRatio})();", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.qc(this));
        org.json.JSONObject a17 = cf.f.a(wcVar.J().C0().U0());
        try {
            a17.put("isFirstPage", ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) wcVar.F()).j2());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AbstractMPPageViewRenderer", "generateWxConfig appId[%s] put isFirstPage e=%s", wcVar.H(), e17);
        }
        try {
            a17.put("prerender", wcVar.J().u0().W1 == com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.PRE_RENDER);
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AbstractMPPageViewRenderer", "generateWxConfig appId[%s] put prerender e=%s", wcVar.H(), e18);
        }
        a17.remove("permission");
        a17.remove("subpackages");
        a17.remove("pages");
        java.lang.String jSONObject = a17.toString();
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String format = java.lang.String.format(locale, ";if(typeof __wxConfig==='undefined'){var __wxConfig={};};Object.assign(__wxConfig, %s);", jSONObject);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.vc vcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.vc(null);
        wcVar.D = vcVar;
        vcVar.f168715a = jSONObject;
        vcVar.f168716b = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewRenderer", "injectEnvFields, evaluate assignWxConfig start, hash=%d", java.lang.Integer.valueOf(wcVar.hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd f07 = wcVar.f0();
        try {
            url = new java.net.URL("https", com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyj), "assignWxConfig");
        } catch (java.net.MalformedURLException unused) {
            url = null;
        }
        f07.R(url, format, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.rc(this));
        c();
        if (wcVar.J().E0().f128829w && !wcVar.J().s2()) {
            wcVar.P("WAVConsole.js", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) wcVar.F()).q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class)).M("WAVConsole.js"));
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.f(wcVar.J())) {
            wcVar.P("WAPerf.js", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) wcVar.F()).q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class)).M("WAPerf.js"));
        }
        if ((wcVar.J().s2() || wcVar.J().N0()) && !wcVar.F) {
            wcVar.P("WARemoteDebug.js", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) wcVar.F()).q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class)).M("WARemoteDebug.js"));
            wcVar.F = true;
        }
        java.lang.String format2 = java.lang.String.format(locale, ";(function(){ if(__wxConfig.preload) { %s; return true; } else { return false; }})();", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.c("onWxConfigReady", "", 0, 0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewRenderer", "injectEnvFields, evaluate onWxConfigReady start, hash=%d", java.lang.Integer.valueOf(wcVar.hashCode()));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd f08 = wcVar.f0();
        try {
            url2 = new java.net.URL("https", com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyj), "onWxConfigReady");
        } catch (java.net.MalformedURLException unused2) {
        }
        f08.R(url2, format2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sc(this, currentTimeMillis2));
        wcVar.f168754z = false;
        if (!wcVar.f167906h) {
            try {
                wcVar.N("injectAppSharedPageFrameScript").d();
                wcVar.f167906h = true;
            } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t6 unused3) {
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
            com.tencent.mm.plugin.appbrand.page.wc r0 = r10.f168683d
            boolean r1 = r0.f167918w
            java.lang.String r2 = "Luggage.AbstractMPPageViewRenderer"
            r3 = 1
            if (r1 == 0) goto La
            goto L1b
        La:
            java.lang.String r1 = "injectPageInfoReport"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            r0.f167918w = r3
            java.lang.String r1 = "wxa_library/wx_assistant_page_info.js"
            java.lang.String r4 = ik1.f.e(r1)
            r0.P(r1, r4)
        L1b:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.tencent.mm.plugin.appbrand.jsapi.l r4 = r0.F()
            com.tencent.luggage.sdk.jsapi.component.b r4 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) r4
            xi1.g r4 = r4.mo50261xee5260a9()
            android.util.DisplayMetrics r4 = r4.mo48807xad90d981()
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
            com.tencent.luggage.sdk.jsapi.component.b r8 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) r8
            java.lang.String r9 = "width"
            r8.K0(r1, r9, r7)
            float r4 = r4.density
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            com.tencent.mm.plugin.appbrand.jsapi.l r7 = r0.F()
            com.tencent.luggage.sdk.jsapi.component.b r7 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) r7
            java.lang.String r8 = "pixelRatio"
            r7.K0(r1, r8, r4)
            java.lang.String r4 = r1.toString()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r7 = "__deviceInfo__:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r7, r4)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}
            java.lang.String r4 = ";if(typeof __deviceInfo__ ==='undefined'){ var __deviceInfo__ = %s; } else {Object.assign(__deviceInfo__, %s)};"
            java.lang.String r1 = java.lang.String.format(r2, r4, r1)
            com.tencent.mm.plugin.appbrand.jsapi.l r2 = r0.F()
            com.tencent.luggage.sdk.jsapi.component.b r2 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) r2
            com.tencent.mm.plugin.appbrand.jsruntime.t r2 = r2.mo50357xcd94f799()
            r4 = 0
            r2.mo14660x738236e6(r1, r4)
            android.view.ViewGroup r1 = r0.f167904f
            if (r1 == 0) goto L98
            java.util.WeakHashMap r2 = n3.l1.f415895a
            boolean r1 = n3.x0.b(r1)
            if (r1 != 0) goto L9d
        L98:
            com.tencent.mm.plugin.appbrand.page.fb r1 = r0.f167905g
            r1.N(r5, r6)
        L9d:
            boolean r1 = r10.f168682c
            if (r1 != 0) goto Lb1
            boolean r1 = r0.f167913r
            if (r1 == 0) goto Laf
            java.lang.String r1 = "wxa_library/webview_pf.js"
            java.lang.String r2 = ik1.f.e(r1)
            r0.P(r1, r2)
        Laf:
            r10.f168682c = r3
        Lb1:
            boolean r1 = r10.f168680a
            if (r1 != 0) goto Lc1
            java.lang.String r1 = "wxa_library/android-webview.js"
            java.lang.String r2 = ik1.f.e(r1)
            r0.P(r1, r2)
            r10.f168680a = r3
        Lc1:
            boolean r1 = r10.f168681b
            if (r1 != 0) goto Ld4
            com.tencent.mm.plugin.appbrand.page.hb r1 = r0.O()
            java.lang.String r2 = "WAWebview.js"
            java.lang.String r1 = r1.a(r2)
            r0.P(r2, r1)
            r10.f168681b = r3
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.uc.c():void");
    }
}
