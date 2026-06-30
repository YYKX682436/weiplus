package sb4;

/* loaded from: classes4.dex */
public abstract class z extends android.widget.BaseAdapter implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f487124d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static boolean f487125e = false;

    /* renamed from: f, reason: collision with root package name */
    public static final int f487126f = 2;

    public static /* synthetic */ java.util.HashMap a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        java.util.HashMap hashMap = f487124d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return hashMap;
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addClickInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new sb4.a0(c17933xe8d1b226));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addClickInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    public static void d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addToPreauth", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        r45.a90 a90Var = c19807x593d1720.f39014x86965dde;
        if (a90Var == null || android.text.TextUtils.isEmpty(a90Var.f451372g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addToPreauth", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            return;
        }
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        r45.a90 a90Var2 = c19807x593d1720.f39014x86965dde;
        java.lang.String str = a90Var2.f451372g;
        int i17 = f487126f;
        r45.y8 y8Var = c19807x593d1720.f39012x33e0f24f;
        ((yq1.x0) m0Var).e(str, i17, y8Var != null ? y8Var.f472379d : "", a90Var2.f451371f, a90Var2.f451369d, "timeline", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addToPreauth", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    public static void f(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        r45.hh4 hh4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addToPreload", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        if (android.text.TextUtils.isEmpty(c19807x593d1720.f39014x86965dde.f451372g) || !c19807x593d1720.f39014x86965dde.f451372g.contains(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addToPreload", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            return;
        }
        r45.hh4 hh4Var2 = c19807x593d1720.f39014x86965dde.f451376n;
        int i17 = hh4Var2 != null ? hh4Var2.f457682d : -1;
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        java.lang.String str = c19807x593d1720.f39014x86965dde.f451372g;
        int i18 = f487126f;
        ((yq1.z) a0Var).c(str, i17, i18, c19807x593d1720.f39033x11f29a7f, c19807x593d1720.Id, null, null, c19807x593d1720.f39018xf3f56116, java.lang.Integer.valueOf(c19807x593d1720.f39015xc86e6609), java.lang.Long.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).h("__sns_timeline__")));
        if (!f487125e && i17 != -1) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(24)) {
                f487125e = true;
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).u(i18);
            }
        }
        if (i17 == 16 && (hh4Var = c19807x593d1720.f39014x86965dde.f451376n) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hh4Var.f457691p)) {
            rv.r2 r2Var = (rv.r2) i95.n0.c(rv.r2.class);
            java.lang.String str2 = c19807x593d1720.f39014x86965dde.f451376n.f457691p;
            ((qv.k) r2Var).getClass();
            java.lang.String b17 = qk.c.b(str2, 4, true);
            java.lang.String b18 = tv.a.b(b17);
            if (!com.p314xaae8f345.mm.vfs.w6.j(b18)) {
                o11.f fVar = new o11.f();
                fVar.f423611b = true;
                fVar.f423615f = b18;
                n11.a.b().d(b17, fVar.a(), null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addToPreload", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    public static void g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recordScan", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new sb4.c0(c17933xe8d1b226, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordScan", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    public static void h(java.util.List list, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useSdkRouteReport", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        if (list == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useSdkRouteReport", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            return;
        }
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.util.Map map = (java.util.Map) it.next();
                java.util.Map h17 = p52.h.f433549a.h((java.util.Map) map.get("event_params"), i17);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Pj(((java.lang.Long) map.get("event_time")).longValue(), (java.lang.String) map.get("event_id"), h17, 26236, false);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineVendingAdapter", "err !!!" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useSdkRouteReport", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }
}
