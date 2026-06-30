package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class v3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.v3 f102621a = new com.tencent.mm.plugin.finder.assist.v3();

    public final void a(r45.qt2 qt2Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, java.lang.String actionValue) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(actionValue, "actionValue");
        com.tencent.mars.xlog.Log.i("FinderLiveFeedExptReportUtil", "doExtStatsReport actionValue: ".concat(actionValue));
        r45.jn0 jn0Var = new r45.jn0();
        jn0Var.set(0, java.lang.Long.valueOf(feed.getFeedObject().getId()));
        jn0Var.set(1, feed.getFeedObject().field_username);
        jn0Var.set(2, feed.g0());
        jn0Var.set(3, actionValue);
        ((j40.m) ((m40.h0) i95.n0.c(m40.h0.class))).wi(qt2Var, 18054, jn0Var);
    }

    public final void b(r45.qt2 qt2Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, java.util.List actionValue) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(actionValue, "actionValue");
        com.tencent.mars.xlog.Log.i("FinderLiveFeedExptReportUtil", "doExtStatsReport actionValue: " + actionValue);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = actionValue.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            r45.jn0 jn0Var = new r45.jn0();
            jn0Var.set(0, java.lang.Long.valueOf(feed.getFeedObject().getId()));
            jn0Var.set(1, feed.getFeedObject().field_username);
            jn0Var.set(2, feed.g0());
            jn0Var.set(3, str);
            linkedList.add(jn0Var);
        }
        ((j40.m) ((m40.h0) i95.n0.c(m40.h0.class))).getClass();
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Jj(qt2Var, 18054, linkedList);
    }

    public final void c(r45.qt2 qt2Var, ml2.u1 eid, java.util.HashMap reportMap) {
        kotlin.jvm.internal.o.g(eid, "eid");
        kotlin.jvm.internal.o.g(reportMap, "reportMap");
        com.tencent.mars.xlog.Log.i("FinderLiveFeedExptReportUtil", "report23057 map: " + reportMap);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, eid, reportMap, qt2Var != null ? qt2Var.getString(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)).toString() : null, null, null, false, 112, null);
    }

    public final void d(r45.qt2 qt2Var, ml2.t1 eid, java.util.HashMap reportMap) {
        kotlin.jvm.internal.o.g(eid, "eid");
        kotlin.jvm.internal.o.g(reportMap, "reportMap");
        com.tencent.mars.xlog.Log.i("FinderLiveFeedExptReportUtil", "report23059 map: " + reportMap);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, eid, reportMap, qt2Var != null ? qt2Var.getString(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)).toString() : null, null, null, false, 112, null);
    }

    public final void e(r45.y23 product, int i17) {
        kotlin.jvm.internal.o.g(product, "product");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("reason_type", 1);
        jSONObject.put("click_type", i17);
        jSONObject.put("buy_btn_word", product.getString(15));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Dj((ml2.r0) c17, ml2.f4.f327432f, null, java.lang.String.valueOf(product.getLong(0)), null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
    }

    public final void f(r45.y23 product) {
        kotlin.jvm.internal.o.g(product, "product");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("reason_type", 1);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Dj((ml2.r0) c17, ml2.f4.f327431e, null, java.lang.String.valueOf(product.getLong(0)), null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
    }
}
