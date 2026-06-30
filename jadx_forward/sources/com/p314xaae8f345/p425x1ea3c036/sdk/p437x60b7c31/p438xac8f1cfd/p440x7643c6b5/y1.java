package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public class y1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ag {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ag
    public void a(org.json.JSONObject config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        super.a(config);
        try {
            config.put("isIsolateContext", java.lang.Boolean.TRUE);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WASnapshotConfigProvider", e17, "put with key(isIsolateContext)", new java.lang.Object[0]);
        }
    }
}
