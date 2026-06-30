package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f84010a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f84011b;

    public static void a(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, final int i17, final java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.NativeTransLogic", "initNativeTransComponentId componentId: %d appId:%s , stack: %s", java.lang.Integer.valueOf(i17), str, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        tVar.evaluateJavascript("if (typeof ntrans !== 'undefined') { ntrans.id = " + i17 + "; };(function(){ return typeof ntrans })();", new android.webkit.ValueCallback() { // from class: com.tencent.mm.plugin.appbrand.jsruntime.m1$$a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.tencent.mars.xlog.Log.i("Luggage.NativeTransLogic", "initNativeTransComponentId componentId:%d, appId:%s, typeof ntrans:%s", java.lang.Integer.valueOf(i17), str, (java.lang.String) obj);
            }
        });
    }

    public static void b(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, final int i17, final int i18, final java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.NativeTransLogic", "initNativeTransServiceId serviceId:%d, componentId:%d, appId:%s, stack:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        tVar.evaluateJavascript("if (typeof ntrans !== 'undefined') { ntrans.serviceId = " + i17 + "; };(function(){ return typeof ntrans})();", new android.webkit.ValueCallback() { // from class: com.tencent.mm.plugin.appbrand.jsruntime.m1$$c
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.tencent.mars.xlog.Log.i("Luggage.NativeTransLogic", "initNativeTransServiceId, serviceId:%d, componentId:%d, appId:%s, typeof ntrans:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, (java.lang.String) obj);
            }
        });
    }

    public static boolean c(com.tencent.mm.plugin.appbrand.y yVar) {
        if (f84011b == null) {
            f84011b = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(yVar.x().qe("nativeTrans")));
        }
        return f84011b.booleanValue();
    }

    public static synchronized boolean d(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        synchronized (com.tencent.mm.plugin.appbrand.jsruntime.m1.class) {
            if (e9Var == null) {
                com.tencent.mm.plugin.appbrand.jsruntime.n1.f84022a.a(1355L, 6L);
                com.tencent.mars.xlog.Log.i("Luggage.NativeTransLogic", "isServiceOpen component null");
                return false;
            }
            boolean c17 = c(e9Var);
            if (c17) {
                com.tencent.mm.plugin.appbrand.jsruntime.n1.f84022a.a(1355L, 4L);
            } else if (!c17) {
                com.tencent.mm.plugin.appbrand.jsruntime.n1.f84022a.a(1355L, 5L);
            }
            com.tencent.mars.xlog.Log.i("Luggage.NativeTransLogic", "isServiceOpen isExprOpen:%b isLibMatch:%b", java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(c17));
            return c17;
        }
    }

    public static synchronized boolean e(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        boolean z17;
        synchronized (com.tencent.mm.plugin.appbrand.jsruntime.m1.class) {
            if (f84010a == null) {
                f84010a = java.lang.Boolean.valueOf(com.tencent.xweb.a3.k(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION));
            }
            boolean booleanValue = java.lang.Boolean.valueOf(f84010a.booleanValue()).booleanValue();
            boolean c17 = c(v5Var);
            if (booleanValue && c17) {
                com.tencent.mm.plugin.appbrand.jsruntime.n1.f84022a.a(1355L, 0L);
            } else if (!booleanValue) {
                com.tencent.mm.plugin.appbrand.jsruntime.n1.f84022a.a(1355L, 1L);
            } else if (!c17) {
                com.tencent.mm.plugin.appbrand.jsruntime.n1.f84022a.a(1355L, 2L);
            } else if (!c17 && !booleanValue) {
                com.tencent.mm.plugin.appbrand.jsruntime.n1.f84022a.a(1355L, 3L);
            }
            z17 = false;
            com.tencent.mars.xlog.Log.i("Luggage.NativeTransLogic", "isWebViewOpen exprOpen:%b webviewMatch:%b libMatch:%b", java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(c17));
            if (booleanValue && c17) {
                z17 = true;
            }
        }
        return z17;
    }
}
