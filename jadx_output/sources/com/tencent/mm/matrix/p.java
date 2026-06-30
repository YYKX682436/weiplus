package com.tencent.mm.matrix;

/* loaded from: classes5.dex */
public class p implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = android.os.Build.BRAND;
        boolean z17 = false;
        if ((!str.toLowerCase().contains("lenovo") || !wo.w0.m().toLowerCase().contains("tb")) && !str.toLowerCase().contains("royole")) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MatrixDelegate", "cameraCacheDevice = " + z17);
        if (z17) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_camera_util_use_cache_new", z17);
        com.tencent.mm.sdk.platformtools.o4.L().G("clicfg_voip_camera_info_use_cache_new", z17);
    }
}
