package l44;

/* loaded from: classes4.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public static final l44.p3 f397832a = new l44.p3();

    /* renamed from: b, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.r0 f397833b;

    static {
        int i17 = p3325xe03a0797.p3326xc267989b.r0.N0;
        f397833b = new l44.o3(p3325xe03a0797.p3326xc267989b.q0.f392100d);
    }

    public static final void a(l44.p3 p3Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        p3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        if (u3Var != null) {
            try {
                if (u3Var.isShowing()) {
                    u3Var.dismiss();
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
    }

    public static final void d(s34.p1 p1Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openQr", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (p1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openQr", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3325xe03a0797.p3326xc267989b.y0 b17 = v65.m.b(activity);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a.mo7096x348d9a(f397833b), null, new l44.m3(p1Var, activity, h0Var, str, str3, str2, i17, str4, null), 2, null)).p(new l44.n3(h0Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openQr", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
    }

    public final org.json.JSONObject b(l44.j3 reportInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildExtData", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            jSONObject.put("type", reportInfo.f397729e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQrResult", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQrResult", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            jSONObject.put("qrResult", reportInfo.f397730f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQrUrl", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQrUrl", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            java.lang.String str = reportInfo.f397731g;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("qrUrl", str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQrResultUrl", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQrResultUrl", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            java.lang.String str3 = reportInfo.f397732h;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("qrResultUrl", str3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            java.lang.String str4 = reportInfo.f397733i;
            if (str4 != null) {
                str2 = str4;
            }
            jSONObject.put("qrExtInfo", str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDirectJump", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDirectJump", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            jSONObject.put("directJump", 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQrResultUrlType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQrResultUrlType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            int i17 = reportInfo.f397734j;
            if (i17 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQrResultUrlType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQrResultUrlType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
                jSONObject.put("qrResultUrlType", i17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdQrClickHelper", "buildKVData exp:" + e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildExtData", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        return jSONObject;
    }

    public final java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        return "AdQrClickHelper";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169 A[Catch: Exception -> 0x016f, TRY_LEAVE, TryCatch #1 {Exception -> 0x016f, blocks: (B:28:0x0117, B:31:0x0125, B:34:0x0132, B:37:0x0163, B:39:0x0169), top: B:27:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(l44.j3 r24) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.p3.e(l44.j3):void");
    }

    public final int f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toScene", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        int i18 = 2;
        if (i17 != 1 && i17 != 2) {
            i18 = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toScene", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        return i18;
    }
}
