package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class mf implements com.tencent.mm.plugin.appbrand.utils.b3 {
    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.SourceMapUtil", "hy: Inject '%s' Script Failed: %s", "WASourceMap.js", str);
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void onSuccess(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SourceMapUtil", "hy: Inject '%s' Script Success: %s", "WASourceMap.js", str);
    }
}
