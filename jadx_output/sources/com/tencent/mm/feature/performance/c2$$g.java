package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final /* synthetic */ class c2$$g implements m3.a {
    @Override // m3.a
    public final void accept(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (com.tencent.mm.sdk.platformtools.x2.f193077g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "mainProc standby, skip");
            return;
        }
        dr0.p1 a17 = dr0.p1.f242489d.a();
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        if (a17.j(str)) {
            com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.ipcinvoker.type.IPCInteger(num.intValue()), com.tencent.mm.feature.performance.u2.class, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "mainProc no exist, skip");
        }
    }
}
