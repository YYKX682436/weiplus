package ta4;

/* loaded from: classes4.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.y0 f498396a = new ta4.y0();

    /* renamed from: b, reason: collision with root package name */
    public static int f498397b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f498398c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f498399d;

    public static void e(ta4.y0 y0Var, int i17, java.lang.String snsLocalId, int i18, java.lang.String str, java.util.Map map, int i19, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportActionWithUdfKv$default", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        if ((i19 & 8) != 0) {
            str = "";
        }
        java.lang.String commentator = str;
        y0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportActionWithUdfKv", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsLocalId, "snsLocalId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentator, "commentator");
        y0Var.c(i17, snsLocalId, i18, commentator, map);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportActionWithUdfKv", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportActionWithUdfKv$default", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
    }

    public final java.util.Map a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildSnsTextUdfKv", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (i17 > 0) {
            linkedHashMap.put("bubpulltype", java.lang.Integer.valueOf(i17));
        }
        linkedHashMap.put("txtselecttype", java.lang.Integer.valueOf(i18));
        linkedHashMap.put("txttype", java.lang.Integer.valueOf(f498398c ? 2 : 1));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildSnsTextUdfKv", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        return linkedHashMap;
    }

    public final java.lang.String b(java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildUdfKvString", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        cl0.g gVar = new cl0.g();
        for (java.util.Map.Entry entry : map.entrySet()) {
            gVar.h((java.lang.String) entry.getKey(), entry.getValue());
        }
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildUdfKvString", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        return t17;
    }

    public final void c(int i17, java.lang.String str, int i18, java.lang.String str2, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doReport", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doReport", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
            return;
        }
        f498399d = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(str);
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doReport", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
            return;
        }
        java.lang.String t07 = ca4.z0.t0(b17.f68891x29d1292e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMenuActionReporter", "reportAction " + t07 + ", " + i17 + ' ' + i18);
        if (i18 == 1 && i17 == 10) {
            i17 = f498398c ? 11 : 10;
        }
        try {
            cl0.g gVar = new cl0.g();
            gVar.o("contenttype", i18);
            gVar.o("sendtype", b17.f68895x2262335f);
            gVar.h("feedid", t07);
            gVar.h("feedUsername", b17.m70374x6bf53a6c());
            gVar.h("commentator", str2);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7045x4dfd4a25 c7045x4dfd4a25 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7045x4dfd4a25();
            c7045x4dfd4a25.f143611f = i17;
            c7045x4dfd4a25.f143609d = f498397b;
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            c7045x4dfd4a25.f143610e = c7045x4dfd4a25.b("snsinfo_", r26.i0.t(gVar2, ",", ";", false), true);
            if (!(map == null || map.isEmpty())) {
                c7045x4dfd4a25.f143613h = c7045x4dfd4a25.b("udf_kv", f498396a.b(map), true);
            }
            c7045x4dfd4a25.k();
        } catch (cl0.f e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMenuActionReporter", "reportAction error " + e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doReport", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
    }

    public final void d(int i17, java.lang.String snsLocalId, int i18, java.lang.String commentator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAction", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsLocalId, "snsLocalId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentator, "commentator");
        c(i17, snsLocalId, i18, commentator, a(1, 1));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAction", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
    }
}
