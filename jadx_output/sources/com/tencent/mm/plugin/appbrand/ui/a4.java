package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class a4 implements java.lang.Runnable {
    public a4(int i17, java.lang.String str) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("AppBrandDebugUI", "CommLib patch test phase 2: legacy(WABSPatch)");
        com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper.sForceUseWeAppCoreImpl = java.lang.Boolean.FALSE;
        new com.tencent.mm.plugin.appbrand.appcache.r4(1510, "afcf1f7adee4c622af90323683ccb73f", false).run();
    }
}
