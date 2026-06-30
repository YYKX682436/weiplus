package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class nf {
    public static java.lang.String a(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SourceMapUtil", "hy: getting sourcemap %s, %s", str, str2);
        if (appBrandRuntime == null || str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SourceMapUtil", "runtime or jsRuntime or filePath is null.");
            return "";
        }
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(appBrandRuntime.f74805p.f77281g)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SourceMapUtil", "current running type is ReleaseType do not need to inject sourceMap.");
            return "";
        }
        java.lang.String p17 = com.tencent.mm.plugin.appbrand.appcache.la.p(appBrandRuntime, str.concat(".map"));
        if (p17.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SourceMapUtil", "sourceMap of the script(%s) is null or nil.", str);
            return "";
        }
        return java.lang.String.format("typeof __wxSourceMap !== 'undefined' && (__wxSourceMap['%s'] = %s)", str2 + str, p17);
    }

    public static void b(com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        com.tencent.mm.plugin.appbrand.utils.d3.b(tVar, null, c(yVar), new com.tencent.mm.plugin.appbrand.mf());
        tVar.evaluateJavascript(java.lang.String.format("typeof __wxSourceMap !== 'undefined' && (__wxSourceMap.__system = 'Android %s')", android.os.Build.VERSION.RELEASE), null);
    }

    public static java.lang.String c(com.tencent.mm.plugin.appbrand.y yVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SourceMapUtil", "hy: injecting sourcemap.js");
        if (yVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SourceMapUtil", "hy: not valid runtime");
            return "";
        }
        if (yVar.t3() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SourceMapUtil", "hy: runtime not prepared. do not try to inject sourcemap.js. maybe preloading");
            return "";
        }
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(yVar.t3().f74805p.f77281g)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SourceMapUtil", "current running type is ReleaseType do not need to inject sourceMap.");
            return "";
        }
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) yVar.q(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class);
        if (iCommLibReader != null) {
            return iCommLibReader.M("WASourceMap.js");
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SourceMapUtil", "execSourceMapScript NULL reader");
        return "";
    }
}
