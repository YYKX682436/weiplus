package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f165543a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f165544b;

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, final int i17, final java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.NativeTransLogic", "initNativeTransComponentId componentId: %d appId:%s , stack: %s", java.lang.Integer.valueOf(i17), str, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        tVar.mo14660x738236e6("if (typeof ntrans !== 'undefined') { ntrans.id = " + i17 + "; };(function(){ return typeof ntrans })();", new android.webkit.ValueCallback() { // from class: com.tencent.mm.plugin.appbrand.jsruntime.m1$$a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.NativeTransLogic", "initNativeTransComponentId componentId:%d, appId:%s, typeof ntrans:%s", java.lang.Integer.valueOf(i17), str, (java.lang.String) obj);
            }
        });
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, final int i17, final int i18, final java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.NativeTransLogic", "initNativeTransServiceId serviceId:%d, componentId:%d, appId:%s, stack:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        tVar.mo14660x738236e6("if (typeof ntrans !== 'undefined') { ntrans.serviceId = " + i17 + "; };(function(){ return typeof ntrans})();", new android.webkit.ValueCallback() { // from class: com.tencent.mm.plugin.appbrand.jsruntime.m1$$c
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.NativeTransLogic", "initNativeTransServiceId, serviceId:%d, componentId:%d, appId:%s, typeof ntrans:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, (java.lang.String) obj);
            }
        });
    }

    public static boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        if (f165544b == null) {
            f165544b = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(yVar.x().qe("nativeTrans")));
        }
        return f165544b.booleanValue();
    }

    public static synchronized boolean d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.m1.class) {
            if (e9Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n1.f165555a.a(1355L, 6L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.NativeTransLogic", "isServiceOpen component null");
                return false;
            }
            boolean c17 = c(e9Var);
            if (c17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n1.f165555a.a(1355L, 4L);
            } else if (!c17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n1.f165555a.a(1355L, 5L);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.NativeTransLogic", "isServiceOpen isExprOpen:%b isLibMatch:%b", java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(c17));
            return c17;
        }
    }

    public static synchronized boolean e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        boolean z17;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.m1.class) {
            if (f165543a == null) {
                f165543a = java.lang.Boolean.valueOf(com.p314xaae8f345.p3210x3857dc.a3.k(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654));
            }
            boolean booleanValue = java.lang.Boolean.valueOf(f165543a.booleanValue()).booleanValue();
            boolean c17 = c(v5Var);
            if (booleanValue && c17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n1.f165555a.a(1355L, 0L);
            } else if (!booleanValue) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n1.f165555a.a(1355L, 1L);
            } else if (!c17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n1.f165555a.a(1355L, 2L);
            } else if (!c17 && !booleanValue) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n1.f165555a.a(1355L, 3L);
            }
            z17 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.NativeTransLogic", "isWebViewOpen exprOpen:%b webviewMatch:%b libMatch:%b", java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(c17));
            if (booleanValue && c17) {
                z17 = true;
            }
        }
        return z17;
    }
}
