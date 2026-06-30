package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes5.dex */
public class p implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = android.os.Build.BRAND;
        boolean z17 = false;
        if ((!str.toLowerCase().contains("lenovo") || !wo.w0.m().toLowerCase().contains("tb")) && !str.toLowerCase().contains("royole")) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "cameraCacheDevice = " + z17);
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_camera_util_use_cache_new", z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_voip_camera_info_use_cache_new", z17);
    }
}
