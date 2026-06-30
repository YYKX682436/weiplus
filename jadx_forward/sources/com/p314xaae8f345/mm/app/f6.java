package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public abstract class f6 {
    public static void a(android.content.Context context) {
        android.os.Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SetupBaseBuildInfo", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SetupBaseBuildInfo", "meta bundle is null!!!!");
        } else {
            java.lang.String str = lp0.a.f401780a;
            lp0.a.f401780a = bundle.getBoolean("com.tencent.mm.BuildInfo.PATCH_ENABLED") ? "true" : "false";
            lp0.a.f401781b = bundle.getString("com.tencent.mm.BuildInfo.BUILD_REV");
            lp0.a.f401782c = "0x" + java.lang.Integer.toHexString(bundle.getInt("com.tencent.mm.BuildInfo.CLIENT_VERSION"));
            lp0.a.f401784e = bundle.getString("com.tencent.mm.BuildInfo.BUILD_TIME");
            bundle.getString("com.tencent.mm.BuildInfo.BUILD_HOSTNAME");
            lp0.a.f401785f = bundle.getString("com.tencent.mm.BuildInfo.BUILD_TAG");
            bundle.getString("com.tencent.mm.BuildInfo.BUILD_OWNER");
            lp0.a.f401786g = bundle.getString("com.tencent.mm.BuildInfo.BUILD_COMMAND");
            bundle.getString("com.tencent.mm.BuildInfo.BUILD_SVNPATH");
            lp0.a.f401788i = bundle.getBoolean("com.tencent.mm.BuildInfo.BUILD_IS_ARM64", false);
            lp0.a.f401789j = bundle.getString(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55733xe7bec63b);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a = com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.f21508x52aa6a09;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274639b = "null";
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274640c = com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.f21564x274acd;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274641d = "null";
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e = com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.REV;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274643f = com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.f21563xbdd680f0;
        java.lang.String str2 = lp0.a.f401780a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g = "0x28004A36";
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h = java.lang.Integer.decode("0x28004A36").intValue();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274646i = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274647j = com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.f21554x234d8a3a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k = lp0.a.f401788i;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274649l = "default";
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274650m = "";
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274651n = com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.f21540x67d8ddd0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274652o = a03.h.b();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274653p = com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.f21507x5a9ac284;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274654q = com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.f21553xdbc739cf;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274655r = -1;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274656s = true;
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        for (java.lang.reflect.Field field : com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.class.getFields()) {
            try {
                field.getName();
                field.get(null);
                arrayMap.put(field.getName(), field.get(null));
            } catch (java.lang.IllegalAccessException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SetupBaseBuildInfo", e18, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z1 z1Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274657t;
        if (!z1Var.f274661b) {
            z1Var.f274660a.putAll(arrayMap);
        }
        z1Var.f274661b = true;
    }
}
