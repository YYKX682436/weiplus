package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {
    public s(com.tencent.mm.plugin.appbrand.p pVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a("/sdcard/test_zip.zip");
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            i17 = com.tencent.mm.plugin.appbrand.appstorage.l1.j(new java.util.zip.ZipInputStream(com.tencent.mm.vfs.w6.D(a17, com.tencent.mm.vfs.a3.f212781a.m(a17, null))), "/sdcard/test_zip/");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("[ZIP]", "unzip Java ex=%s", e17);
            i17 = -1;
        }
        com.tencent.mars.xlog.Log.i("[ZIP]", "unzip Java %d, cost %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
