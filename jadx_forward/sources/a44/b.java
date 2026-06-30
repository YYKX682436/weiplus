package a44;

/* loaded from: classes4.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkHideDownload", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        if (!e(c17933xe8d1b226)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHideDownload", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return true;
        }
        if (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHideDownload", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return true;
        }
        a44.a aVar = m70354x74235b3e.f38161xc4fcf362;
        aVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSupportAndroid", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        java.lang.Integer num = aVar.f82762e;
        boolean z17 = (num != null && num.intValue() == 0) || (num != null && num.intValue() == 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSupportAndroid", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
        if (!z17) {
            a44.a aVar2 = m70354x74235b3e.f38161xc4fcf362;
            aVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWarningAndroid", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWarningAndroid", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.f82763f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdDownloadHelper", "checkHideDownload, is not support Android");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHideDownload", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
                return true;
            }
        }
        if (!za4.k.g().m(context, m70354x74235b3e.f38161xc4fcf362.l())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHideDownload", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdDownloadHelper", "checkHideDownload, isPkgInstalled");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHideDownload", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        return true;
    }

    public final boolean b(h44.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkJumpDownloadHalfScreenParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        if (bVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkJumpDownloadHalfScreenParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        if (bVar.d() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkJumpDownloadHalfScreenParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDownloadHelper", sb6.toString());
        java.lang.String[] strArr = new java.lang.String[4];
        strArr[0] = bVar.b();
        strArr[1] = bVar.f();
        k44.g d19 = bVar.d();
        strArr[2] = d19 != null ? d19.b() : null;
        k44.g d27 = bVar.d();
        strArr[3] = d27 != null ? d27.c() : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkJumpDownloadHalfScreenParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkJumpDownloadHalfScreenParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        return true;
    }

    public final boolean c(a44.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkShowComplianceParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        if (aVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowComplianceParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        java.lang.String n17 = aVar.n();
        if (!(n17 == null || n17.length() == 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowComplianceParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
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
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecordUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
                                        java.lang.String str = aVar.f82772o;
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecordUrl", "com.tencent.mm.plugin.sns.ad.download.AdCheckDownloadAppInfo");
                                        if (str == null || str.length() == 0) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowComplianceParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowComplianceParamsValid", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        return true;
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownloadInfoRequestTimeMap", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getDownloadInfoRequestTimeMap$cp", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        java.util.HashMap hashMap = a44.k.f82819h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getDownloadInfoRequestTimeMap$cp", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadInfoRequestTimeMap", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        hashMap.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
    }

    public final boolean e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
        if (c17933xe8d1b226 == null || !c17933xe8d1b226.m70377x3172ed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdDownloadHelper", "isAdDownloadType, snsInfo is not ad");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        if (c17933xe8d1b226.m70354x74235b3e().f38161xc4fcf362 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdDownloadHelper", "isAdDownloadType, adCheckDownloadAppInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(c17933xe8d1b226.m70354x74235b3e().f38161xc4fcf362.k(), c17933xe8d1b226.m70354x74235b3e().f38161xc4fcf362.l())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdDownloadHelper", "isAdDownloadType, openSdkAppIdAndroid or packageName or appPageUrlAndroid or channelId is null");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdDownloadType", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$Companion");
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
