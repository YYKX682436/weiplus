package com.tencent.mm.app;

/* loaded from: classes12.dex */
public abstract class f6 {
    public static void a(android.content.Context context) {
        android.os.Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SetupBaseBuildInfo", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SetupBaseBuildInfo", "meta bundle is null!!!!");
        } else {
            java.lang.String str = lp0.a.f320247a;
            lp0.a.f320247a = bundle.getBoolean("com.tencent.mm.BuildInfo.PATCH_ENABLED") ? "true" : "false";
            lp0.a.f320248b = bundle.getString("com.tencent.mm.BuildInfo.BUILD_REV");
            lp0.a.f320249c = "0x" + java.lang.Integer.toHexString(bundle.getInt("com.tencent.mm.BuildInfo.CLIENT_VERSION"));
            lp0.a.f320251e = bundle.getString("com.tencent.mm.BuildInfo.BUILD_TIME");
            bundle.getString("com.tencent.mm.BuildInfo.BUILD_HOSTNAME");
            lp0.a.f320252f = bundle.getString("com.tencent.mm.BuildInfo.BUILD_TAG");
            bundle.getString("com.tencent.mm.BuildInfo.BUILD_OWNER");
            lp0.a.f320253g = bundle.getString("com.tencent.mm.BuildInfo.BUILD_COMMAND");
            bundle.getString("com.tencent.mm.BuildInfo.BUILD_SVNPATH");
            lp0.a.f320255i = bundle.getBoolean("com.tencent.mm.BuildInfo.BUILD_IS_ARM64", false);
            lp0.a.f320256j = bundle.getString(com.tencent.tinker.loader.shareutil.ShareConstants.TINKER_ID);
        }
        com.tencent.mm.sdk.platformtools.z.f193105a = com.tencent.mm.boot.BuildConfig.BUILD_TAG;
        com.tencent.mm.sdk.platformtools.z.f193106b = "null";
        com.tencent.mm.sdk.platformtools.z.f193107c = com.tencent.mm.boot.BuildConfig.TIME;
        com.tencent.mm.sdk.platformtools.z.f193108d = "null";
        com.tencent.mm.sdk.platformtools.z.f193109e = com.tencent.mm.boot.BuildConfig.REV;
        com.tencent.mm.sdk.platformtools.z.f193110f = com.tencent.mm.boot.BuildConfig.SVNPATH;
        java.lang.String str2 = lp0.a.f320247a;
        com.tencent.mm.sdk.platformtools.z.f193111g = "0x28004A36";
        com.tencent.mm.sdk.platformtools.z.f193112h = java.lang.Integer.decode("0x28004A36").intValue();
        com.tencent.mm.sdk.platformtools.z.f193113i = true;
        com.tencent.mm.sdk.platformtools.z.f193114j = com.tencent.mm.boot.BuildConfig.MATRIX_VERSION;
        com.tencent.mm.sdk.platformtools.z.f193115k = lp0.a.f320255i;
        com.tencent.mm.sdk.platformtools.z.f193116l = "default";
        com.tencent.mm.sdk.platformtools.z.f193117m = "";
        com.tencent.mm.sdk.platformtools.z.f193118n = com.tencent.mm.boot.BuildConfig.FLUTTER_SDK_VERSION;
        com.tencent.mm.sdk.platformtools.z.f193119o = a03.h.b();
        com.tencent.mm.sdk.platformtools.z.f193120p = com.tencent.mm.boot.BuildConfig.BUILD_RAND_ID;
        com.tencent.mm.sdk.platformtools.z.f193121q = com.tencent.mm.boot.BuildConfig.MAAS_VERSION_INT;
        com.tencent.mm.sdk.platformtools.z.f193122r = -1;
        com.tencent.mm.sdk.platformtools.z.f193123s = true;
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        for (java.lang.reflect.Field field : com.tencent.mm.boot.BuildConfig.class.getFields()) {
            try {
                field.getName();
                field.get(null);
                arrayMap.put(field.getName(), field.get(null));
            } catch (java.lang.IllegalAccessException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SetupBaseBuildInfo", e18, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.sdk.platformtools.z1 z1Var = com.tencent.mm.sdk.platformtools.z.f193124t;
        if (!z1Var.f193128b) {
            z1Var.f193127a.putAll(arrayMap);
        }
        z1Var.f193128b = true;
    }
}
