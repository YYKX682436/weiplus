package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class ag extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cg {
    public void a(org.json.JSONObject config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bg bgVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cg.f161731a;
        bgVar.a(config, "platform", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        bgVar.a(config, "brand", android.os.Build.BRAND);
        bgVar.a(config, "model", wo.w0.m());
        try {
            config.put("nativeBufferEnabled", java.lang.Boolean.TRUE);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WASnapshotConfigProvider", e17, "put with key(nativeBufferEnabled)", new java.lang.Object[0]);
        }
    }
}
