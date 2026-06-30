package a84;

/* loaded from: classes4.dex */
public abstract class a0 {
    public static void a(android.content.Context context, java.lang.String str, ab4.n0 n0Var, int i17, long j17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adLandingJumpWebPageUI", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
        b(context, str, n0Var, i17, j17, str2, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adLandingJumpWebPageUI", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
    }

    public static void b(android.content.Context context, java.lang.String str, ab4.n0 n0Var, int i17, long j17, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adLandingJumpWebPageUI", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
        try {
            android.content.Intent intent = new android.content.Intent();
            if (android.text.TextUtils.isEmpty(n0Var.m()) || android.text.TextUtils.isEmpty(n0Var.c())) {
                str3 = str;
            } else {
                str3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.b(str, "traceid=" + n0Var.m() + "&aid=" + n0Var.c());
            }
            java.lang.String n17 = n0Var.n();
            if (android.text.TextUtils.isEmpty(n17)) {
                n17 = n0Var.o();
                com.tencent.mars.xlog.Log.i("AdLandingPageH5Jumper", "adLandingJumpWebPageUI, use orig_UxInfo:" + n17);
            } else {
                com.tencent.mars.xlog.Log.i("AdLandingPageH5Jumper", "adLandingJumpWebPageUI, use updated_UxInfo:" + n17);
            }
            if (z17) {
                str3 = ca4.z0.b(str3, n17);
                ca4.z0.c(intent, n17);
            }
            java.lang.String e17 = f44.a.e(str3);
            com.tencent.mars.xlog.Log.i("AdLandingPageH5Jumper", "open url %s", e17);
            intent.putExtra("rawUrl", e17);
            intent.putExtra("useJs", true);
            intent.putExtra("type", -255);
            if (n0Var.d() == 0) {
                com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i17, 7, j17, 0, 0, 0, 0, 0);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("KSnsAdTag", snsAdClick);
                if (!android.text.TextUtils.isEmpty(n17)) {
                    bundle.putString("KAnsUxInfo", n17);
                }
                intent.putExtra("jsapiargs", bundle);
            }
            if ((context instanceof android.app.Activity) && n0Var.d() == 2) {
                java.lang.String stringExtra = ((android.app.Activity) context).getIntent().getStringExtra("sns_landing_pages_sessionId");
                java.lang.String stringExtra2 = ((android.app.Activity) context).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000);
                    java.lang.Object[] objArr = new java.lang.Object[4];
                    if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                        stringExtra2 = "";
                    }
                    objArr[0] = stringExtra2;
                    objArr[1] = stringExtra;
                    objArr[2] = str2;
                    objArr[3] = valueOf;
                    java.lang.String format = java.lang.String.format("official_mall_%s_%s_%s_%s", objArr);
                    intent.putExtra("prePublishId", format);
                    intent.putExtra("KPublisherId", format);
                    intent.putExtra("pay_channel", 47);
                }
            }
            ca4.z0.a(intent, 84);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageH5Jumper", "adLandingJumpWebPageUI exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adLandingJumpWebPageUI", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
    }

    public static void c(android.content.Context context, java.lang.String str, ab4.n0 n0Var, int i17, long j17) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpHalfStyleH5ForFinder", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
        if (android.text.TextUtils.isEmpty(n0Var.m()) || android.text.TextUtils.isEmpty(n0Var.c())) {
            str2 = str;
        } else {
            str2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.b(str, "traceid=" + n0Var.m() + "&aid=" + n0Var.c());
        }
        java.lang.String n17 = n0Var.n();
        if (android.text.TextUtils.isEmpty(n17)) {
            n17 = n0Var.o();
            com.tencent.mars.xlog.Log.i("AdLandingPageH5Jumper", "jumpHalfEggCardH5, use orig_UxInfo:" + n17);
        } else {
            com.tencent.mars.xlog.Log.i("AdLandingPageH5Jumper", "jumpHalfEggCardH5, use updated_UxInfo:" + n17);
        }
        java.lang.String url = f44.a.e(ca4.z0.b(str2, n17));
        com.tencent.mars.xlog.Log.i("AdLandingPageH5Jumper", "jumpHalfStyleH5ForFinder, source=" + i17 + ", snsId=" + ca4.z0.t0(j17) + ", url=" + url);
        ((j40.p) ((zy2.r7) i95.n0.c(zy2.r7.class))).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        finderJumpInfo.setJumpinfo_type(2);
        com.tencent.mm.protocal.protobuf.Html5Info html5Info = new com.tencent.mm.protocal.protobuf.Html5Info();
        html5Info.setUrl(url);
        html5Info.setStyle(1);
        finderJumpInfo.setHtml5_info(html5Info);
        com.tencent.mm.plugin.finder.webview.t.a(context, url, new xc2.p0(finderJumpInfo), null, new oy2.p(0, 0.75f, false, null, null, null, 61, null), 89, "", null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpHalfStyleH5ForFinder", "com.tencent.mm.plugin.sns.ad.utils.AdLandingPageH5Jumper");
    }
}
