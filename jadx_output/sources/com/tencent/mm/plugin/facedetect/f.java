package com.tencent.mm.plugin.facedetect;

/* loaded from: classes12.dex */
public class f implements km5.e {
    public f(com.tencent.mm.plugin.facedetect.e eVar) {
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginFace", "hy: null in on interrupt");
            return;
        }
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) bVar.a(0), -1);
        java.lang.String str = (java.lang.String) bVar.a(1);
        if (str == null) {
            str = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.PluginFace", "hy: onInterrupt errCode: %d, errMsg: %s", java.lang.Integer.valueOf(j17), str);
    }
}
