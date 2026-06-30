package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340;

/* loaded from: classes12.dex */
public class f implements km5.e {
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.e eVar) {
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginFace", "hy: null in on interrupt");
            return;
        }
        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) bVar.a(0), -1);
        java.lang.String str = (java.lang.String) bVar.a(1);
        if (str == null) {
            str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginFace", "hy: onInterrupt errCode: %d, errMsg: %s", java.lang.Integer.valueOf(j17), str);
    }
}
