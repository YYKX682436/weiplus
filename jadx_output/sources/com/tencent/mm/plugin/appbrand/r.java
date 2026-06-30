package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {
    public r(com.tencent.mm.plugin.appbrand.p pVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("[ZIP]", "unzip JNI %d, cost %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.appstorage.ZipJNI.unzip("/sdcard/test_zip.zip", "/sdcard/test_zip/", null)), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - java.lang.System.currentTimeMillis()));
    }
}
