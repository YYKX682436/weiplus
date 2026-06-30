package m54;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.f f405798a = new m54.f();

    public static final void a(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.Context context, m54.y yVar, android.content.Intent intent, yz5.l lVar) {
        long j18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launch", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
        if (str == null || context == null || intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.LandPageLauncher", "the dynamicCanvasInfo, context is null ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launch", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
            return;
        }
        try {
            java.lang.String str5 = "";
            java.lang.String d17 = m54.j.d(m54.j.f405815a, j17, str, str4 == null ? "" : str4, null, str3, 8, null);
            m54.f fVar = f405798a;
            java.lang.String d18 = fVar.d(j17, str, str4 == null ? "" : str4, d17);
            intent.putExtra("sns_landing_page_dynamic_canvas_query_key", d17);
            intent.putExtra("sns_landing_page_canvas_dynamicinfo", str);
            if (str4 != null) {
                str5 = str4;
            }
            intent.putExtra("sns_landing_pages_ux_info", str5);
            intent.putExtra("sns_landing_pages_pageid", j17);
            intent.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
            if (yVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLocalCacheTime", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalCacheTime", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
                j18 = yVar.f405850c;
            } else {
                j18 = 0;
            }
            intent.putExtra("sns_landing_pages_local_cache_time", j18);
            intent.putExtra("sns_landing_page_canvas_ext_dynamicinfo", str2);
            android.os.Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new android.os.Bundle();
            }
            fVar.c(context, true, false, extras, d18, lVar);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.LandPageLauncher", "launch canvas: there is an exception " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launch", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
    }

    public final void b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, android.content.Intent intent, yz5.l lVar) {
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launchDynamicPage", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
        m54.j jVar = m54.j.f405815a;
        java.lang.String d17 = m54.j.d(jVar, j17, str, str4, null, str3, 8, null);
        java.lang.String d18 = d(j17, str, str4, d17);
        m54.y c17 = jVar.c(d17);
        intent.putExtra("sns_landing_page_dynamic_canvas_query_key", d17);
        intent.putExtra("sns_landing_page_canvas_dynamicinfo", str);
        intent.putExtra("sns_landing_pages_ux_info", str4);
        intent.putExtra("sns_landing_pages_pageid", j17);
        intent.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLocalCacheTime", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLocalCacheTime", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        intent.putExtra("sns_landing_pages_local_cache_time", java.lang.Long.valueOf(c17.f405850c));
        intent.putExtra("sns_landing_page_canvas_ext_dynamicinfo", str2);
        if (m54.j.g(c17)) {
            android.os.Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new android.os.Bundle();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launchDynamicPageWithDefaultCall", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
            try {
                if (m54.j.h(c17)) {
                    m54.f fVar = f405798a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launchDynamicPageReally$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
                    fVar.c(abstractActivityC21394xb3d2c0cf, true, false, extras, d18, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launchDynamicPageReally$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
                } else if (lVar != null) {
                    lVar.mo146xb9724478(c17);
                }
            } catch (java.lang.Throwable th6) {
                ca4.q.c("SnsAd.LandPageLauncher", th6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launchDynamicPageWithDefaultCall", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
            str5 = "launchDynamicPage";
        } else {
            android.os.Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                extras2 = new android.os.Bundle();
            }
            android.os.Bundle bundle = extras2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launchDynamicPageSky", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
            p3325xe03a0797.p3326xc267989b.y0 b17 = v65.m.b(abstractActivityC21394xb3d2c0cf);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a.mo7096x348d9a(new m54.c(p3325xe03a0797.p3326xc267989b.q0.f392100d)), null, new m54.d(h0Var, abstractActivityC21394xb3d2c0cf, j17, str, str4, i17, str3, bundle, d18, lVar, null), 2, null)).p(new m54.e(h0Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launchDynamicPageSky", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
            str5 = "launchDynamicPage";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|2|3|(17:8|(1:10)(2:102|(1:104)(15:105|12|(1:14)|15|(1:17)|18|(7:20|21|22|(1:24)(1:99)|(1:26)(1:98)|27|28)(1:101)|29|(1:31)|32|33|34|(2:39|(15:41|42|(1:92)(1:46)|(1:48)(1:91)|49|(1:90)(1:53)|54|(1:56)(4:83|84|(1:86)|87)|57|(1:82)(1:61)|(1:63)|64|(1:66)|67|(2:69|70)(3:(2:73|(1:80)(1:77))(1:81)|78|79))(17:93|(1:44)|92|(0)(0)|49|(1:51)|90|54|(0)(0)|57|(1:59)|82|(0)|64|(0)|67|(0)(0)))|94|(0)(0)))|11|12|(0)|15|(0)|18|(0)(0)|29|(0)|32|33|34|(3:36|39|(0)(0))|94|(0)(0))|106|(0)(0)|11|12|(0)|15|(0)|18|(0)(0)|29|(0)|32|33|34|(0)|94|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x011b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011c, code lost:
    
        ca4.q.c("getCanvasDynamicExtInfoJsonObj", r0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCanvasDynamicExtInfoJsonObj", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0045 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:3:0x0019, B:5:0x002f, B:10:0x003b, B:102:0x0045, B:104:0x0057, B:105:0x005b), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:3:0x0019, B:5:0x002f, B:10:0x003b, B:102:0x0045, B:104:0x0057, B:105:0x005b), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102 A[Catch: all -> 0x011b, TryCatch #2 {all -> 0x011b, blocks: (B:34:0x00fc, B:36:0x0102, B:41:0x010e, B:93:0x0112), top: B:33:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e A[Catch: all -> 0x011b, TryCatch #2 {all -> 0x011b, blocks: (B:34:0x00fc, B:36:0x0102, B:41:0x010e, B:93:0x0112), top: B:33:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112 A[Catch: all -> 0x011b, TRY_LEAVE, TryCatch #2 {all -> 0x011b, blocks: (B:34:0x00fc, B:36:0x0102, B:41:0x010e, B:93:0x0112), top: B:33:0x00fc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r18, boolean r19, boolean r20, android.os.Bundle r21, java.lang.String r22, yz5.l r23) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m54.f.c(android.content.Context, boolean, boolean, android.os.Bundle, java.lang.String, yz5.l):void");
    }

    public final java.lang.String d(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeQueryJson", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
        cl0.g gVar = new cl0.g();
        gVar.h("canvasId", java.lang.String.valueOf(j17));
        gVar.h("dynamicInfo", str);
        gVar.h("uxInfo", str2);
        gVar.h("canvasKey", str3);
        gVar.p("startTime", java.lang.System.currentTimeMillis());
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeQueryJson", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
        return gVar2;
    }
}
