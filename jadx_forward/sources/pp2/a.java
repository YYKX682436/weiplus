package pp2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final pp2.a f438999a = new pp2.a();

    public final void a(java.lang.String contextId, int i17, java.lang.String feedId, java.lang.String liveId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId, "liveId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderLiveEntrance");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6421x552c6235 c6421x552c6235 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6421x552c6235();
        c6421x552c6235.f137629d = 1L;
        c6421x552c6235.f137635j = c6421x552c6235.b("ContextId", contextId, true);
        c6421x552c6235.f137630e = i17;
        c6421x552c6235.f137631f = c6421x552c6235.b("FeedID", feedId, true);
        c6421x552c6235.f137632g = c6421x552c6235.b("LiveID", liveId, true);
        c6421x552c6235.f137633h = c6421x552c6235.b("RedDotTipsID", L0 != null ? L0.f65880x11c19d58 : null, true);
        if (L0 != null) {
            org.json.JSONObject g17 = pm0.b0.g(L0.W0());
            g17.put("object_id", pm0.v.u(L0.W0().m75942xfb822ef2(0)));
            java.lang.String jSONObject = g17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            c6421x552c6235.f137636k = c6421x552c6235.b("ReportExtInfo", r26.i0.t(jSONObject, ",", ";", false), true);
        }
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6421x552c6235.f137634i = c6421x552c6235.b("SessionID", Ri, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EnterFinderLiveFromRedDotReport", "report " + c6421x552c6235.n());
        c6421x552c6235.k();
    }
}
