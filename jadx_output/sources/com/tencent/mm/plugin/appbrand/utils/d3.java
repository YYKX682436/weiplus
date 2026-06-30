package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedList f90406a = new java.util.LinkedList();

    public static void a(java.lang.String str, com.tencent.mm.plugin.appbrand.utils.b3 b3Var, java.lang.String str2, long j17) {
        if (str2 == null || !str2.contains("11111")) {
            if (b3Var != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsValidationInjector", "hy: file %s inject failed!", str);
                b3Var.b(str2);
                return;
            }
            return;
        }
        if (b3Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsValidationInjector", "hy: file %s inject success! cost:%d", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
            b3Var.onSuccess(str2);
        }
    }

    public static void b(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, java.net.URL url, java.lang.String str, com.tencent.mm.plugin.appbrand.utils.b3 b3Var) {
        boolean z17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (b3Var != null) {
                b3Var.b("isNullOrNil script");
                return;
            }
            return;
        }
        if (tVar == null) {
            if (b3Var != null) {
                b3Var.b("wv is null");
                return;
            }
            return;
        }
        java.util.LinkedList linkedList = f90406a;
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = true;
                    break;
                } else if (str.startsWith((java.lang.String) it.next())) {
                    z17 = false;
                    break;
                }
            }
        }
        if (z17) {
            str = str + java.lang.String.format(java.util.Locale.ENGLISH, "\n;(function(){return %d;})();", 11111);
        }
        com.tencent.mm.plugin.appbrand.utils.x2 x2Var = new com.tencent.mm.plugin.appbrand.utils.x2(b3Var);
        if (url == null) {
            tVar.evaluateJavascript(str, x2Var);
        } else {
            tVar.R(url, str, x2Var);
        }
    }
}
