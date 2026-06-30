package j22;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f378782a = -1;

    public static final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b bVar) {
        if (bVar == null) {
            return "";
        }
        r45.kj0 kj0Var = bVar.f179070a;
        java.lang.String str = kj0Var != null ? kj0Var.f460267o : null;
        java.lang.String str2 = str != null ? str : "";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return str2;
        }
        if (bVar.f179072c) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kj0Var != null ? kj0Var.f460261f : null) ? "H5" : "Toptic";
        }
        return "null";
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b bVar, int i17, int i18, java.lang.String reportType) {
        r45.kj0 kj0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportType, "reportType");
        int i19 = 0;
        if (bVar != null && (kj0Var = bVar.f179070a) != null && kj0Var.f460264i == 1) {
            i19 = 1;
        }
        java.lang.String a17 = a(bVar);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "emoje_store_emoji_banner");
        hashMap.put("emoje_store_tab", java.lang.Integer.valueOf(i18));
        hashMap.put("banner_type", java.lang.Integer.valueOf(i19));
        hashMap.put("bannerid", a17);
        hashMap.put("banner_index", java.lang.Integer.valueOf(i17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(reportType, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13370x510fae49.f180020q, hashMap, 10, false);
    }

    public static final void c(java.lang.String actionType, java.lang.String eleId, java.lang.String eleInfo, java.lang.String pageInfo, java.lang.String pageId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eleId, "eleId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eleInfo, "eleInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageInfo, "pageInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageId, "pageId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6415xb0a6a5a4 c6415xb0a6a5a4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6415xb0a6a5a4();
        c6415xb0a6a5a4.f137585s = c6415xb0a6a5a4.b("action_type", actionType, true);
        c6415xb0a6a5a4.f137583q = c6415xb0a6a5a4.b("eleid", eleId, true);
        c6415xb0a6a5a4.f137584r = c6415xb0a6a5a4.b("ele_info", r26.i0.t(eleInfo, ",", ";", false), true);
        c6415xb0a6a5a4.f137582p = c6415xb0a6a5a4.b("page_info", r26.i0.t(pageInfo, ",", ";", false), true);
        c6415xb0a6a5a4.f137577k = c6415xb0a6a5a4.b("pageid", pageId, true);
        c6415xb0a6a5a4.k();
    }

    public static final void d(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, int i17, int i18, long j17, int i19) {
        if (c21053xdbf1e5f4 == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6387x63cf53b0 c6387x63cf53b0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6387x63cf53b0();
        c6387x63cf53b0.f137316d = i18;
        c6387x63cf53b0.f137317e = i17;
        c6387x63cf53b0.f137318f = c6387x63cf53b0.b("MD5Key", c21053xdbf1e5f4.f68671x4b6e68b9.toString(), true);
        c6387x63cf53b0.f137319g = c6387x63cf53b0.b("SearchID", java.lang.String.valueOf(j17), true);
        c6387x63cf53b0.f137320h = c6387x63cf53b0.b("DesignerId", c21053xdbf1e5f4.f68657xb76d85ab, true);
        c6387x63cf53b0.f137321i = c6387x63cf53b0.b("Pid", c21053xdbf1e5f4.f68663x861009b5, true);
        c6387x63cf53b0.f137322j = i19;
        c6387x63cf53b0.f137323k = c6387x63cf53b0.b("sessionid", java.lang.String.valueOf(f378782a), true);
        c6387x63cf53b0.k();
    }

    public static final void e(r45.ri0 ri0Var, int i17, int i18, long j17, int i19) {
        if (ri0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6387x63cf53b0 c6387x63cf53b0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6387x63cf53b0();
        c6387x63cf53b0.f137316d = i18;
        c6387x63cf53b0.f137317e = i17;
        c6387x63cf53b0.f137318f = c6387x63cf53b0.b("MD5Key", ri0Var.f466419d.toString(), true);
        c6387x63cf53b0.f137319g = c6387x63cf53b0.b("SearchID", java.lang.String.valueOf(j17), true);
        c6387x63cf53b0.f137320h = c6387x63cf53b0.b("DesignerId", ri0Var.f466422g, true);
        c6387x63cf53b0.f137321i = c6387x63cf53b0.b("Pid", ri0Var.f466425m, true);
        c6387x63cf53b0.f137322j = i19;
        c6387x63cf53b0.f137323k = c6387x63cf53b0.b("sessionid", java.lang.String.valueOf(f378782a), true);
        c6387x63cf53b0.k();
    }
}
