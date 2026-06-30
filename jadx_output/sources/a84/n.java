package a84;

/* loaded from: classes4.dex */
public abstract class n {
    public static void a(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkDeleteFlipCardAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (adSnsInfo == null) {
            com.tencent.mars.xlog.Log.e("AdDeleteUtils", "checkDeleteFlipCardAdVideoInfo, adSnsInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeleteFlipCardAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = adSnsInfo.getAdXml();
        if (!adXml.isFlipCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeleteFlipCardAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        java.util.List h17 = adXml.adFlipCardInfo.h();
        if (a84.b0.b(h17)) {
            com.tencent.mars.xlog.Log.e("AdDeleteUtils", "checkDeleteFlipCardAdVideoInfo, mediaList empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeleteFlipCardAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) h17).iterator();
        while (it.hasNext()) {
            r45.jj4 jj4Var = (r45.jj4) it.next();
            if (jj4Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                boolean z17 = jj4Var.f377856e == 6;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                if (z17) {
                    g(jj4Var.f377855d);
                    com.tencent.mars.xlog.Log.i("AdDeleteUtils", "checkDeleteFlipCardAdVideoInfo, mediaId=" + jj4Var.f377855d);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeleteFlipCardAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }

    public static void b(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo) {
        r45.jj4 b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkDeleteLookbookAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (adSnsInfo == null) {
            com.tencent.mars.xlog.Log.e("AdDeleteUtils", "checkDeleteLookbookAdVideoInfo, adSnsInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeleteLookbookAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = adSnsInfo.getAdXml();
        if (!adXml.isLookbookCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeleteLookbookAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        java.util.List<v74.q> c17 = adXml.adLookbookInfo.c();
        if (a84.b0.b(c17)) {
            com.tencent.mars.xlog.Log.e("AdDeleteUtils", "checkDeleteLookbookAdVideoInfo, itemList empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeleteLookbookAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        for (v74.q qVar : c17) {
            if (qVar != null && qVar.c() && (b17 = qVar.b()) != null) {
                g(b17.f377855d);
                com.tencent.mars.xlog.Log.i("AdDeleteUtils", "checkDeleteLookbookAdVideoInfo, mediaId=" + b17.f377855d);
            }
        }
        r45.jj4 f17 = adXml.adLookbookInfo.f();
        if (f17 != null) {
            g(f17.f377855d);
            com.tencent.mars.xlog.Log.i("AdDeleteUtils", "checkDeleteLookbookAdVideoInfo splashCard, mediaId=" + f17.f377855d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeleteLookbookAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }

    public static void c(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo) {
        s34.a1 a1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (adSnsInfo == null) {
            com.tencent.mars.xlog.Log.e("AdDeleteUtils", "checkDeleteSlideFullCardVideoInfo, adSnsInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = adSnsInfo.getAdXml();
        if (!adXml.isSlideFullCard() || (a1Var = adXml.adSliderFullCardInfo) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        java.util.List<s34.x0> list = a1Var.resInfoList;
        if (a84.b0.b(list)) {
            com.tencent.mars.xlog.Log.e("AdDeleteUtils", "checkDeleteSlideFullCardVideoInfo, resInfoList is null or empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (s34.x0 x0Var : list) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteSlideFullCardVideoInternal", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            if (x0Var != null) {
                try {
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("AdDeleteUtils", "deleteSlideFullCardVideoInternal, exp is " + th6);
                }
                if (x0Var.a()) {
                    java.lang.String str = x0Var.f402828e.f377855d;
                    if (arrayList.contains(str)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteSlideFullCardVideoInternal", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
                    } else {
                        g(str);
                        arrayList.add(str);
                        com.tencent.mars.xlog.Log.i("AdDeleteUtils", "deleteSlideFullCardVideoInternal, mediaId is " + str);
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteSlideFullCardVideoInternal", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }

    public static boolean d(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        try {
            boolean e17 = e(com.tencent.mm.plugin.sns.model.l4.Vi().y0(j17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return e17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeleteUtils", "deleteAd0, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return false;
        }
    }

    public static boolean e(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        try {
            if (adSnsInfo == null) {
                com.tencent.mars.xlog.Log.e("AdDeleteUtils", "deleteAd, snsInfo==null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
                return false;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            f(adSnsInfo);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            long j17 = adSnsInfo.field_snsId;
            boolean delete = com.tencent.mm.plugin.sns.model.l4.Vi().delete(j17);
            com.tencent.mm.plugin.sns.model.l4.Aj().y0(j17);
            com.tencent.mm.plugin.sns.storage.u1.a(j17);
            int i17 = (int) (currentTimeMillis2 - currentTimeMillis);
            int currentTimeMillis3 = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
            java.lang.String t07 = ca4.z0.t0(adSnsInfo.field_snsId);
            i64.z0.b(t07);
            r34.e.f368998a.a(adSnsInfo.field_snsId);
            com.tencent.mars.xlog.Log.i("AdDeleteUtils", "deleteAd, snsId=" + t07 + ", ret=" + delete + ", delVideoInfoCost=" + i17 + ", totalCost=" + currentTimeMillis3);
            if (delete) {
                i64.u1.a(23, 1);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return delete;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeleteUtils", "deleteAd, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return false;
        }
    }

    public static void f(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo) {
        r45.a90 a90Var;
        boolean z17;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeleteUtils", "deleteAdVideoInfo, exp=" + th6.toString());
        }
        if (!h()) {
            com.tencent.mars.xlog.Log.e("AdDeleteUtils", "deleteAdVideoInfo, expt closed!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = adSnsInfo.getTimeLine();
        c(adSnsInfo);
        b(adSnsInfo);
        a(adSnsInfo);
        if (timeLine != null && (a90Var = timeLine.ContentObj) != null) {
            int i17 = a90Var.f369837e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVideoAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            if (i17 != 5 && i17 != 15) {
                z17 = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
                if (z17 && (linkedList = timeLine.ContentObj.f369840h) != null && linkedList.size() >= 1) {
                    r45.jj4 jj4Var = (r45.jj4) timeLine.ContentObj.f369840h.get(0);
                    g(jj4Var.f377855d);
                    com.tencent.mars.xlog.Log.i("AdDeleteUtils", "deleteAdVideoInfo, snsId=" + ca4.z0.t0(adSnsInfo.field_snsId) + ", rawMediaId=" + jj4Var.f377855d + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            }
            z17 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            if (z17) {
                r45.jj4 jj4Var2 = (r45.jj4) timeLine.ContentObj.f369840h.get(0);
                g(jj4Var2.f377855d);
                com.tencent.mars.xlog.Log.i("AdDeleteUtils", "deleteAdVideoInfo, snsId=" + ca4.z0.t0(adSnsInfo.field_snsId) + ", rawMediaId=" + jj4Var2.f377855d + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }

    public static void g(java.lang.String str) {
        boolean contains;
        java.lang.String str2;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDelVideoInfoByMediaId", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDelVideoInfoByMediaId", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isMediaIdHasH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMediaIdHasH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            contains = false;
        } else {
            contains = str.contains("_hvec");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMediaIdHasH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        }
        if (contains) {
            str2 = l44.c0.h(str, false);
        } else {
            str2 = str;
            str = l44.c0.h(str, true);
        }
        boolean d17 = t21.o2.Ui().d(str);
        i(d17, true);
        com.tencent.mars.xlog.Log.i("AdDeleteUtils", "delVideoInfoByMediaId, mediaIdHasFlag=" + str + ", ret=" + d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDelNoFlagVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        try {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_del_noflag_videoinfo, 0) > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDelNoFlagVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeleteUtils", "isDelNoFlagVideoInfo, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDelNoFlagVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            z17 = false;
        }
        if (z17) {
            boolean d18 = t21.o2.Ui().d(str2);
            com.tencent.mars.xlog.Log.i("AdDeleteUtils", "delVideoInfoByMediaId, mediaIdNoFlag=" + str2 + ", ret=" + d18);
            i(d18, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDelVideoInfoByMediaId", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }

    public static boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDeleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_del_videoinfo, 1);
            com.tencent.mars.xlog.Log.i("AdDeleteUtils", "isDeleteAdVideoInfo, expt=" + Ni);
            boolean z17 = Ni > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDeleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeleteUtils", "isDeleteAdVideoInfo, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDeleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return true;
        }
    }

    public static void i(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportVideoInfoDelResult", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (z18) {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1907, 25);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1907, 26);
            }
        } else if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1907, 27);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1907, 28);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideoInfoDelResult", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }
}
