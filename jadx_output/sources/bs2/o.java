package bs2;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a */
    public static final bs2.o f23929a = new bs2.o();

    public final void a(bs2.n opType, bs2.h0 h0Var, int i17, bs2.f0 extInfo, r45.fx2 serverConfig, int i18, java.lang.String clearSource) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(opType, "opType");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(serverConfig, "serverConfig");
        kotlin.jvm.internal.o.g(clearSource, "clearSource");
        com.tencent.mm.autogen.mmdata.rpt.FinderPreloadDataStruct finderPreloadDataStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPreloadDataStruct();
        finderPreloadDataStruct.p(opType.name());
        if (h0Var == null || (str = h0Var.name()) == null) {
            str = "";
        }
        finderPreloadDataStruct.q(str);
        finderPreloadDataStruct.f57632f = i17;
        finderPreloadDataStruct.f57633g = extInfo.f23837b;
        finderPreloadDataStruct.f57634h = finderPreloadDataStruct.b("entranceRedDotObjectId", pm0.v.u(extInfo.f23836a), true);
        finderPreloadDataStruct.f57635i = extInfo.f23838c;
        finderPreloadDataStruct.f57636j = extInfo.f23839d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("new_follow_reddot_prefetch_interval", serverConfig.getInteger(20));
        jSONObject.put("new_friend_reddot_prefetch_interval", serverConfig.getInteger(21));
        jSONObject.put("new_hot_reddot_prefetch_interval", serverConfig.getInteger(22));
        jSONObject.put("follow_outter_prefetch_valid_time", serverConfig.getInteger(24));
        jSONObject.put("friend_outter_prefetch_valid_time", serverConfig.getInteger(25));
        jSONObject.put("hot_outter_prefetch_valid_time", serverConfig.getInteger(26));
        jSONObject.put("follow_no_reddot_prefetch_outter_interval", serverConfig.getInteger(4));
        jSONObject.put("friend_no_reddot_prefetch_outter_interval", serverConfig.getInteger(5));
        jSONObject.put("hot_no_reddot_prefetch_outter_interval", serverConfig.getInteger(6));
        jSONObject.put("follow_reddot_prefetch_inner_interval", serverConfig.getInteger(8));
        jSONObject.put("friend_reddot_prefetch_inner_interval", serverConfig.getInteger(9));
        jSONObject.put("hot_reddot_prefetch_inner_interval", serverConfig.getInteger(10));
        jSONObject.put("follow_no_reddot_prefetch_inner_interval", serverConfig.getInteger(12));
        jSONObject.put("friend_no_reddot_prefetch_inner_interval", serverConfig.getInteger(13));
        jSONObject.put("hot_no_reddot_prefetch_inner_interval", serverConfig.getInteger(14));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        finderPreloadDataStruct.f57637k = finderPreloadDataStruct.b("serverConfig", r26.i0.t(jSONObject2, ",", ";", false), true);
        finderPreloadDataStruct.f57638l = i18;
        finderPreloadDataStruct.f57639m = finderPreloadDataStruct.b("clearCacheSource", clearSource, true);
        finderPreloadDataStruct.f57640n = 4L;
        finderPreloadDataStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderPreloadDataStruct);
    }
}
