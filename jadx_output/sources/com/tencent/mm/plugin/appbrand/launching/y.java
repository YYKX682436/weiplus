package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes3.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Integer[] f85422a = {1012, 1031, 1048, 1125};

    public static final int a(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, scene: " + i17);
        boolean z17 = false;
        if (!kz5.z.G(f85422a, java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, scene is not related");
            return 0;
        }
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, statObj is null");
            return 9;
        }
        int i18 = bundle.getInt("LaunchCodeScene_ScanScene");
        if (!(1 <= i18 && i18 < 7)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, scanScene(" + i18 + ") is invalid 1");
            return 9;
        }
        if (1 != i18) {
            if (i18 == 2) {
                return 5;
            }
            if (i18 == 3) {
                return 6;
            }
            if (i18 == 4) {
                return 7;
            }
            if (i18 == 5) {
                return 8;
            }
            if (i18 == 6) {
                return 9;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, scanScene(" + i18 + ") is invalid 2");
            return 9;
        }
        int i19 = bundle.getInt("LaunchCodeScene_ChatType");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, chatType: " + i19);
        if (1 <= i19 && i19 < 5) {
            z17 = true;
        }
        if (!z17) {
            java.lang.String string = bundle.getString("LaunchCodeScene_Username");
            if (string == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, chatType is invalid, username is null");
                return 9;
            }
            i19 = k01.d.a(string);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, username: " + string + ", chatType: " + i19);
        }
        if (i19 == 1) {
            return 1;
        }
        if (i19 == 2) {
            return 2;
        }
        if (i19 == 3) {
            return 3;
        }
        if (i19 == 4) {
            return 4;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandLaunchCodeSceneLogic", "parseCodeScene, chatType is invalid");
        return 9;
    }
}
