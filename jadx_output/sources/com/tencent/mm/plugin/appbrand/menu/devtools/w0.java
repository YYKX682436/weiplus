package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class w0 implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.o6 runtime = ((com.tencent.mm.plugin.appbrand.page.n7) v5Var).getRuntime();
        if (runtime == null || runtime.C0() == null) {
            return;
        }
        if (com.eclipsesource.mmv8.V8.isV8TracingRunning()) {
            runtime.C0().getF147808e().evaluateJavascript("(function(){if(!stopV8Tracing)return false;return stopV8Tracing();})()", new com.tencent.mm.plugin.appbrand.menu.devtools.v0(this, context));
            java.util.List d17 = d(runtime);
            if (d17 != null) {
                java.util.Iterator it = ((java.util.ArrayList) d17).iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.appbrand.jsruntime.c0) it.next()).evaluateJavascript("(function(){if(!stopV8Tracing)return false;return stopV8Tracing();})()", new com.tencent.mm.plugin.appbrand.menu.devtools.v0(this, context));
                }
                return;
            }
            return;
        }
        runtime.C0().getF147808e().evaluateJavascript("(function(){if(!startV8Tracing)return false;return startV8Tracing();})()", new com.tencent.mm.plugin.appbrand.menu.devtools.t0(this, context));
        java.util.List d18 = d(runtime);
        if (d18 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) d18;
            com.tencent.mars.xlog.Log.i("MiroMsg.V8Tracing", "hy: trigger worker v8 tracing: %d", java.lang.Integer.valueOf(arrayList.size()));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.jsruntime.c0) it6.next()).evaluateJavascript("(function(){if(!startV8Tracing)return false;return startV8Tracing();})()", new com.tencent.mm.plugin.appbrand.menu.devtools.t0(this, context));
            }
        }
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return com.eclipsesource.mmv8.V8.isV8TracingRunning() ? "Stop V8 Tracing" : "Start V8 Tracing";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192974b || com.tencent.mm.plugin.appbrand.m6.a(str).f85722o;
    }

    public final java.util.List d(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime.C0() == null) {
            com.tencent.mars.xlog.Log.e("MiroMsg.V8Tracing", "hy: service released. abort walking through workers");
            return null;
        }
        com.tencent.mm.plugin.appbrand.x9 c17 = appBrandRuntime.C0().c1();
        if (c17 != null) {
            return c17.d();
        }
        return null;
    }
}
