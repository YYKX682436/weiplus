package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class d extends nh1.a {
    public d() {
        super(24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if ((r0.length() == 0) != false) goto L21;
     */
    @Override // nh1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r6, com.tencent.mm.plugin.appbrand.page.v5 r7, db5.g4 r8, java.lang.String r9) {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.page.n7 r7 = (com.tencent.mm.plugin.appbrand.page.n7) r7
            com.tencent.mm.plugin.appbrand.menu.h1 r7 = com.tencent.mm.plugin.appbrand.menu.h1.f85963a
            java.lang.String r7 = com.tencent.mm.sdk.platformtools.m2.d()
            jz5.g r9 = com.tencent.mm.plugin.appbrand.menu.h1.f85965c
            r0 = r9
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r1 = 0
            if (r0 == 0) goto L47
            java.lang.String r0 = r0.optString(r7)
            if (r0 == 0) goto L47
            int r2 = r0.length()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L26
            r2 = r3
            goto L27
        L26:
            r2 = r4
        L27:
            if (r2 == 0) goto L3b
            jz5.n r9 = (jz5.n) r9
            java.lang.Object r9 = r9.getValue()
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            if (r9 == 0) goto L3a
            java.lang.String r0 = "en"
            java.lang.String r0 = r9.optString(r0)
            goto L3b
        L3a:
            r0 = r1
        L3b:
            if (r0 == 0) goto L47
            int r9 = r0.length()
            if (r9 != 0) goto L44
            goto L45
        L44:
            r3 = r4
        L45:
            if (r3 == 0) goto L48
        L47:
            r0 = r1
        L48:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "feedbackWording#get, curLang: "
            r9.<init>(r2)
            r9.append(r7)
            java.lang.String r7 = ", "
            r9.append(r7)
            r9.append(r0)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = "MicroMsg.AppBrand.TradeGuaranteeMenuSetting"
            com.tencent.mars.xlog.Log.i(r9, r7)
            r7 = 2131689644(0x7f0f00ac, float:1.900831E38)
            int r9 = r5.f337084a
            if (r0 == 0) goto La5
            boolean r2 = com.tencent.mm.ui.bk.C()
            if (r2 == 0) goto L7b
            jz5.g r2 = com.tencent.mm.plugin.appbrand.menu.h1.f85968f
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            goto L85
        L7b:
            jz5.g r2 = com.tencent.mm.plugin.appbrand.menu.h1.f85967e
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
        L85:
            l01.b r3 = l01.d0.f314761a
            android.graphics.Bitmap r1 = r3.f(r2, r1)
            if (r1 != 0) goto L98
            java.lang.String r6 = "MicroMsg.MenuDelegate_Complaint"
            java.lang.String r1 = "attachTo, feedbackIcon is null"
            com.tencent.mars.xlog.Log.i(r6, r1)
            r8.g(r9, r0, r7)
            goto Laf
        L98:
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r6 = r6.getResources()
            r7.<init>(r6, r1)
            r8.m(r9, r0, r7)
            goto Laf
        La5:
            r0 = 2131755841(0x7f100341, float:1.9142573E38)
            java.lang.String r6 = r6.getString(r0)
            r8.g(r9, r6, r7)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.menu.d.a(android.content.Context, com.tencent.mm.plugin.appbrand.page.v5, db5.g4, java.lang.String):void");
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.hc hcVar;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        if (k01.j.f303039a.b(null, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_Complaint", "MenuDelegate_Complaint perform click, send event");
            le1.a aVar = new le1.a();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("event", 24);
            aVar.u(n7Var.getRuntime().C0());
            aVar.t(hashMap);
            aVar.m();
            return;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = n7Var.getRuntime().E0();
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.complaint.c.b(n7Var);
        k91.z5 z5Var = new k91.z5();
        com.tencent.mm.plugin.appbrand.o6 host = n7Var.getRuntime();
        wa1.a aVar2 = wa1.b.f444100a;
        kotlin.jvm.internal.o.g(host, "host");
        com.tencent.mm.plugin.appbrand.o6 o6Var = (!aVar2.c(host) || (hcVar = host.f74796e) == null) ? null : (com.tencent.mm.plugin.appbrand.o6) hcVar.getActiveRuntime();
        z5Var.f305863a = E0.f305842e;
        z5Var.f305864b = o6Var == null ? "" : o6Var.f74803n;
        z5Var.f305872j = 3;
        z5Var.f305873k = n7Var.a2() == null ? "" : n7Var.Y1();
        z5Var.f305870h = E0.f305852r.f75399d;
        z5Var.f305869g = E0.f305852r.pkgVersion;
        z5Var.f305875m = b17;
        if (com.tencent.mm.plugin.appbrand.report.quality.e.b(n7Var.getAppId(), true) != null) {
            z5Var.f305876n = com.tencent.mm.plugin.appbrand.report.quality.e.b(n7Var.getAppId(), true).f88134d;
        }
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = n7Var.x();
        if (x17 != null) {
            z5Var.f305879q = x17.i() + "";
            z5Var.f305880r = x17.W0();
        }
        com.tencent.mm.plugin.appbrand.config.WxaExposedParams a17 = z5Var.a();
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(n7Var.getAppId(), new ld1.c(n7Var));
        android.content.Intent intent = new android.content.Intent();
        java.lang.String a18 = com.tencent.mm.plugin.appbrand.v9.a(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_Complaint", "feedbackUrl:%s, wxaExposedParams:%s", a18, a17.toString());
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, context.getString(com.tencent.mm.R.string.f490254ph));
        intent.putExtra("rawUrl", a18);
        intent.putExtra("forceHideShare", true);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.appbrand.report.v0.e(n7Var.getAppId(), n7Var.X1(), 31, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
