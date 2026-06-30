package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f129093i;

    public x(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar) {
        this.f129093i = yVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 t(java.util.Map map) {
        t(map);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0
    /* renamed from: w */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 t(java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(map);
        ze.n t37 = this.f129093i.t3();
        try {
            android.util.Pair e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.j.e((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) t37.x0().m52169xfdaa7672().mo14682x9dee9c37());
            int intValue = ((java.lang.Integer) e17.first).intValue();
            java.lang.String str = (java.lang.String) e17.second;
            jSONObject.put("targetAction", intValue);
            jSONObject.put("targetPagePath", str);
            jSONObject.put("usedState", t37.l2().f169325h);
            jSONObject.put("isEntrance", t37.x0().mo51924x62662257().g().c(t37.x0().m52170xad58292c()));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillEventOnAppEnterBackground ex = %s", e18);
        }
        this.f163907f = jSONObject.toString();
        return this;
    }
}
