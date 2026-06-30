package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f90415a = {"app-service.js", "common.app.js", "appservice.app.js", "game.js"};

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f90416b;

    public static java.lang.String a() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(f90416b)) {
            f90416b = com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getAbsolutePath() + "/wasae.dat";
        }
        return f90416b;
    }

    public static void b(com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, java.lang.String str, java.lang.String[] strArr, com.tencent.mm.plugin.appbrand.utils.b3 b3Var) {
        com.tencent.mm.plugin.appbrand.appcache.y3 y3Var;
        java.lang.String str2;
        int i17;
        if (e9Var == null || tVar == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String appId = e9Var.getAppId();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
        java.util.Objects.requireNonNull(l0Var);
        com.tencent.mm.plugin.appbrand.appcache.y3 M0 = e9Var.M0();
        java.util.Objects.requireNonNull(M0);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsValidationInjectorWC", "batchInjectUsrJsFiles start assemble requests, appId:%s, key:%s, paths.size:%d", appId, str, java.lang.Integer.valueOf(strArr.length));
        java.lang.String g17 = g(e9Var, com.tencent.mm.plugin.appbrand.utils.i3.USR);
        boolean b17 = com.tencent.mm.plugin.appbrand.appcache.g0.b(e9Var.t3().f74805p.f77281g);
        int length = strArr.length;
        int i18 = 0;
        while (i18 < length) {
            java.lang.String str3 = strArr[i18];
            if (!android.text.TextUtils.isEmpty(str3)) {
                com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo = M0.openReadPartialInfo(str3);
                if (openReadPartialInfo == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsValidationInjectorWC", "batchInjectUsrJsFiles for appId(%s) path(%s) not found", appId, str3);
                } else {
                    y3Var = M0;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(g17);
                    i17 = length;
                    sb6.append(com.tencent.mm.plugin.appbrand.appstorage.l1.i(str3));
                    java.lang.String sb7 = sb6.toString();
                    if (!b17) {
                        java.lang.String a17 = com.tencent.mm.plugin.appbrand.nf.a(e9Var.t3(), str3, g17);
                        if (!android.text.TextUtils.isEmpty(a17)) {
                            str2 = g17;
                            com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new com.eclipsesource.mmv8.V8ScriptEvaluateRequest();
                            v8ScriptEvaluateRequest.scriptText = a17;
                            v8ScriptEvaluateRequest.scriptType = 3;
                            linkedList.addLast(v8ScriptEvaluateRequest);
                            linkedList2.addLast(d(str3, openReadPartialInfo, sb7));
                            i18++;
                            M0 = y3Var;
                            length = i17;
                            g17 = str2;
                        }
                    }
                    str2 = g17;
                    linkedList2.addLast(d(str3, openReadPartialInfo, sb7));
                    i18++;
                    M0 = y3Var;
                    length = i17;
                    g17 = str2;
                }
            }
            y3Var = M0;
            str2 = g17;
            i17 = length;
            i18++;
            M0 = y3Var;
            length = i17;
            g17 = str2;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedList.size() + linkedList2.size() + 1);
        arrayList.addAll(linkedList);
        arrayList.addAll(linkedList2);
        arrayList.add(c());
        com.tencent.mars.xlog.Log.i("MicroMsg.JsValidationInjectorWC", "batchInjectUsrJsFiles start invoke batchEvaluateJavascript, appId:%s, key:%s, paths.size:%d", appId, str, java.lang.Integer.valueOf(strArr.length));
        l0Var.l0(arrayList, a(), new com.tencent.mm.plugin.appbrand.utils.g3(str, b3Var, currentTimeMillis));
    }

    public static com.eclipsesource.mmv8.V8ScriptEvaluateRequest c() {
        com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new com.eclipsesource.mmv8.V8ScriptEvaluateRequest();
        v8ScriptEvaluateRequest.scriptType = 3;
        v8ScriptEvaluateRequest.scriptText = java.lang.String.format(java.util.Locale.ENGLISH, "\n;(function(){return %d;})();", 11111);
        return v8ScriptEvaluateRequest;
    }

    public static com.eclipsesource.mmv8.V8ScriptEvaluateRequest d(java.lang.String str, com.tencent.mm.plugin.appbrand.appcache.x3 x3Var, java.lang.String str2) {
        java.lang.String str3 = com.tencent.mm.plugin.appbrand.appstorage.l1.i(x3Var.f76045f).replace('/', '_') + "_" + x3Var.f76040a;
        java.lang.String str4 = x3Var.f76042c;
        com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new com.eclipsesource.mmv8.V8ScriptEvaluateRequest();
        v8ScriptEvaluateRequest.scriptType = 2;
        com.eclipsesource.mmv8.V8ScriptWxaFileDescriptor v8ScriptWxaFileDescriptor = new com.eclipsesource.mmv8.V8ScriptWxaFileDescriptor();
        v8ScriptEvaluateRequest.scriptWxaFd = v8ScriptWxaFileDescriptor;
        v8ScriptWxaFileDescriptor.wxaPkgPath = x3Var.f76044e;
        v8ScriptWxaFileDescriptor.wxaFileName = x3Var.f76045f;
        v8ScriptEvaluateRequest.scriptName = str2;
        v8ScriptEvaluateRequest.lineNumber = 0;
        v8ScriptEvaluateRequest.cacheCategory = str3;
        v8ScriptEvaluateRequest.cacheKey = str4;
        v8ScriptEvaluateRequest.cacheType = 0;
        return v8ScriptEvaluateRequest;
    }

    public static void e(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, java.lang.String str) {
        try {
            tVar.R(new java.net.URL(str + "break.js"), "breakprogram();", null);
        } catch (java.net.MalformedURLException unused) {
        }
    }

    public static void f(com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        com.tencent.mm.plugin.appbrand.jsruntime.w wVar = (com.tencent.mm.plugin.appbrand.jsruntime.w) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.w.class);
        if (wVar == null) {
            return;
        }
        cl.a aVar = (cl.a) ((com.tencent.mm.plugin.appbrand.jsruntime.n) wVar).n0().f42724b;
        aVar.f42588u.add(new cl.l1(new cl.q1(aVar.f42568a, aVar)));
    }

    public static java.lang.String g(com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.plugin.appbrand.utils.i3 i3Var) {
        return i3Var == com.tencent.mm.plugin.appbrand.utils.i3.LIB ? e9Var.X0() : i3Var == com.tencent.mm.plugin.appbrand.utils.i3.USR ? e9Var.b1() : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(com.tencent.mm.plugin.appbrand.e9 r16, com.tencent.mm.plugin.appbrand.jsruntime.t r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, com.tencent.mm.plugin.appbrand.utils.i3 r23, com.tencent.mm.plugin.appbrand.utils.b3 r24) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.utils.e3.h(com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsruntime.t, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, com.tencent.mm.plugin.appbrand.utils.i3, com.tencent.mm.plugin.appbrand.utils.b3):void");
    }

    public static void i(com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.utils.i3 i3Var, com.tencent.mm.plugin.appbrand.utils.b3 b3Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (b3Var != null) {
                b3Var.b("isNullOrNil script");
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.w wVar = (com.tencent.mm.plugin.appbrand.jsruntime.w) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.w.class);
        if (wVar == null) {
            return;
        }
        java.lang.String str3 = str2 + java.lang.String.format(java.util.Locale.ENGLISH, "\n;(function(){return %d;})();", 11111);
        try {
            java.lang.String url = new java.net.URL(g(e9Var, i3Var) + str).toString();
            cl.q0 n07 = ((com.tencent.mm.plugin.appbrand.jsruntime.n) wVar).n0();
            n07.getClass();
            ((cl.a) n07.f42724b).h(new cl.a1(n07, str3, url), false);
        } catch (java.net.MalformedURLException unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:7|(10:11|12|13|14|15|16|17|18|19|(2:21|22)(4:24|(1:26)(1:29)|27|28))|47|13|14|15|16|17|18|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.JsValidationInjectorWC", "createEvalRequestForAssetFd, convert scriptFd to v8Fd, get exception:%s", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(com.tencent.mm.plugin.appbrand.e9 r15, com.tencent.mm.plugin.appbrand.jsruntime.t r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, android.content.res.AssetFileDescriptor r21, com.tencent.mm.plugin.appbrand.utils.i3 r22, com.tencent.mm.plugin.appbrand.utils.b3 r23) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.utils.e3.j(com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsruntime.t, java.lang.String, java.lang.String, java.lang.String, int, android.content.res.AssetFileDescriptor, com.tencent.mm.plugin.appbrand.utils.i3, com.tencent.mm.plugin.appbrand.utils.b3):void");
    }
}
