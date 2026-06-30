package a44;

/* loaded from: classes4.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.content.Context context) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkHideDownload", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        if (!e(snsInfo)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHideDownload", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return true;
        }
        if (snsInfo == null || (adXml = snsInfo.getAdXml()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHideDownload", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return true;
        }
        a44.a aVar = adXml.adCheckDownloadAppInfo;
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSupportAndroid", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.Integer num = aVar.f1229e;
        boolean z17 = (num != null && num.intValue() == 0) || (num != null && num.intValue() == 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportAndroid", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        if (!z17) {
            a44.a aVar2 = adXml.adCheckDownloadAppInfo;
            aVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWarningAndroid", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWarningAndroid", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar2.f1230f)) {
                com.tencent.mars.xlog.Log.w("AdDownloadHelper", "checkHideDownload, is not support Android");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHideDownload", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
                return true;
            }
        }
        if (!za4.k.g().m(context, adXml.adCheckDownloadAppInfo.l())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHideDownload", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        com.tencent.mars.xlog.Log.w("AdDownloadHelper", "checkHideDownload, isPkgInstalled");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkHideDownload", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        return true;
    }

    public final boolean b(h44.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkJumpDownloadHalfScreenParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        if (bVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkJumpDownloadHalfScreenParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        if (bVar.d() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkJumpDownloadHalfScreenParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkJumpDownloadHalfScreenParamsValid, appId is ");
        sb6.append(bVar.b());
        sb6.append(", packageName is ");
        sb6.append(bVar.f());
        sb6.append(", downloadUrl is ");
        k44.g d17 = bVar.d();
        sb6.append(d17 != null ? d17.b() : null);
        sb6.append(", md5 is ");
        k44.g d18 = bVar.d();
        sb6.append(d18 != null ? d18.c() : null);
        com.tencent.mars.xlog.Log.i("AdDownloadHelper", sb6.toString());
        java.lang.String[] strArr = new java.lang.String[4];
        strArr[0] = bVar.b();
        strArr[1] = bVar.f();
        k44.g d19 = bVar.d();
        strArr[2] = d19 != null ? d19.b() : null;
        k44.g d27 = bVar.d();
        strArr[3] = d27 != null ? d27.c() : null;
        if (com.tencent.mm.sdk.platformtools.t8.N0(strArr)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkJumpDownloadHalfScreenParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkJumpDownloadHalfScreenParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        return true;
    }

    public final boolean c(a44.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowComplianceParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        if (aVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowComplianceParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        java.lang.String n17 = aVar.n();
        if (!(n17 == null || n17.length() == 0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowComplianceParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        java.lang.String e17 = aVar.e();
        if (e17 == null || e17.length() == 0) {
            java.lang.String h17 = aVar.h();
            if (h17 == null || h17.length() == 0) {
                java.lang.String m17 = aVar.m();
                if (m17 == null || m17.length() == 0) {
                    java.lang.String b17 = aVar.b();
                    if (b17 == null || b17.length() == 0) {
                        java.lang.String g17 = aVar.g();
                        if (g17 == null || g17.length() == 0) {
                            java.lang.String a17 = aVar.a();
                            if (a17 == null || a17.length() == 0) {
                                java.lang.String o17 = aVar.o();
                                if (o17 == null || o17.length() == 0) {
                                    java.lang.String f17 = aVar.f();
                                    if (f17 == null || f17.length() == 0) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecordUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
                                        java.lang.String str = aVar.f1239o;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecordUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
                                        if (str == null || str.length() == 0) {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowComplianceParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowComplianceParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        return true;
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadInfoRequestTimeMap", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDownloadInfoRequestTimeMap$cp", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        java.util.HashMap hashMap = a44.k.f1286h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDownloadInfoRequestTimeMap$cp", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadInfoRequestTimeMap", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        hashMap.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
    }

    public final boolean e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        if (snsInfo == null || !snsInfo.isAd()) {
            com.tencent.mars.xlog.Log.w("AdDownloadHelper", "isAdDownloadType, snsInfo is not ad");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        if (snsInfo.getAdXml().adCheckDownloadAppInfo == null) {
            com.tencent.mars.xlog.Log.w("AdDownloadHelper", "isAdDownloadType, adCheckDownloadAppInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.N0(snsInfo.getAdXml().adCheckDownloadAppInfo.k(), snsInfo.getAdXml().adCheckDownloadAppInfo.l())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return true;
        }
        com.tencent.mars.xlog.Log.w("AdDownloadHelper", "isAdDownloadType, openSdkAppIdAndroid or packageName or appPageUrlAndroid or channelId is null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0192 A[Catch: JSONException -> 0x018d, TRY_LEAVE, TryCatch #0 {JSONException -> 0x018d, blocks: (B:26:0x0184, B:18:0x0192), top: B:25:0x0184 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(a44.a r13, r45.oy r14) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a44.b.f(a44.a, r45.oy):void");
    }
}
