package bs2;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a */
    public static final bs2.o f105462a = new bs2.o();

    public final void a(bs2.n opType, bs2.h0 h0Var, int i17, bs2.f0 extInfo, r45.fx2 serverConfig, int i18, java.lang.String clearSource) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opType, "opType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serverConfig, "serverConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clearSource, "clearSource");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6564xaf1ac362 c6564xaf1ac362 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6564xaf1ac362();
        c6564xaf1ac362.p(opType.name());
        if (h0Var == null || (str = h0Var.name()) == null) {
            str = "";
        }
        c6564xaf1ac362.q(str);
        c6564xaf1ac362.f139165f = i17;
        c6564xaf1ac362.f139166g = extInfo.f105370b;
        c6564xaf1ac362.f139167h = c6564xaf1ac362.b("entranceRedDotObjectId", pm0.v.u(extInfo.f105369a), true);
        c6564xaf1ac362.f139168i = extInfo.f105371c;
        c6564xaf1ac362.f139169j = extInfo.f105372d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("new_follow_reddot_prefetch_interval", serverConfig.m75939xb282bd08(20));
        jSONObject.put("new_friend_reddot_prefetch_interval", serverConfig.m75939xb282bd08(21));
        jSONObject.put("new_hot_reddot_prefetch_interval", serverConfig.m75939xb282bd08(22));
        jSONObject.put("follow_outter_prefetch_valid_time", serverConfig.m75939xb282bd08(24));
        jSONObject.put("friend_outter_prefetch_valid_time", serverConfig.m75939xb282bd08(25));
        jSONObject.put("hot_outter_prefetch_valid_time", serverConfig.m75939xb282bd08(26));
        jSONObject.put("follow_no_reddot_prefetch_outter_interval", serverConfig.m75939xb282bd08(4));
        jSONObject.put("friend_no_reddot_prefetch_outter_interval", serverConfig.m75939xb282bd08(5));
        jSONObject.put("hot_no_reddot_prefetch_outter_interval", serverConfig.m75939xb282bd08(6));
        jSONObject.put("follow_reddot_prefetch_inner_interval", serverConfig.m75939xb282bd08(8));
        jSONObject.put("friend_reddot_prefetch_inner_interval", serverConfig.m75939xb282bd08(9));
        jSONObject.put("hot_reddot_prefetch_inner_interval", serverConfig.m75939xb282bd08(10));
        jSONObject.put("follow_no_reddot_prefetch_inner_interval", serverConfig.m75939xb282bd08(12));
        jSONObject.put("friend_no_reddot_prefetch_inner_interval", serverConfig.m75939xb282bd08(13));
        jSONObject.put("hot_no_reddot_prefetch_inner_interval", serverConfig.m75939xb282bd08(14));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6564xaf1ac362.f139170k = c6564xaf1ac362.b("serverConfig", r26.i0.t(jSONObject2, ",", ";", false), true);
        c6564xaf1ac362.f139171l = i18;
        c6564xaf1ac362.f139172m = c6564xaf1ac362.b("clearCacheSource", clearSource, true);
        c6564xaf1ac362.f139173n = 4L;
        c6564xaf1ac362.k();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6564xaf1ac362);
    }
}
