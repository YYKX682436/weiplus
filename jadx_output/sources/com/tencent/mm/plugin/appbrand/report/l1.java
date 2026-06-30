package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public enum l1 {
    /* JADX INFO: Fake field, exist only in values array */
    X5,
    Sys,
    XWalk,
    Skyline,
    Invalid;

    public static com.tencent.mm.plugin.appbrand.report.l1 a(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        boolean isXWalkKernel;
        boolean z17;
        com.tencent.mm.plugin.appbrand.report.l1 l1Var = Invalid;
        if (n7Var == null) {
            z17 = com.tencent.xweb.WebView.x0();
            isXWalkKernel = com.tencent.xweb.WebView.y0();
        } else {
            if (n7Var.p2()) {
                return Skyline;
            }
            com.tencent.mm.plugin.appbrand.page.w9 S3 = n7Var.S3();
            if (S3 == null) {
                return l1Var;
            }
            boolean isSysKernel = S3.isSysKernel();
            isXWalkKernel = S3.isXWalkKernel();
            z17 = isSysKernel;
        }
        boolean[] zArr = {z17, isXWalkKernel, false};
        int i17 = 0;
        for (int i18 = 0; i18 < 3; i18++) {
            if (zArr[i18]) {
                i17++;
            }
        }
        if (i17 == 1) {
            return isXWalkKernel ? XWalk : Sys;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return l1Var;
    }
}
