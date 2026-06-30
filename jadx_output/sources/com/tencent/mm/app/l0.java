package com.tencent.mm.app;

/* loaded from: classes5.dex */
public abstract class l0 {
    public static java.lang.String a(java.lang.String str) {
        java.lang.String[] split = str.split("\n");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < java.lang.Math.min(split.length, 30); i17++) {
            if (split[i17].trim().replaceAll("\t", "").startsWith("at ")) {
                sb6.append(split[i17].replaceAll("at ", "").trim());
            }
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(sb6.toString().trim().replaceAll("\\([^\\(\\)]+\\)", ""));
        com.tencent.mars.xlog.Log.i("MicroMsg.CrashMD5Helper", "calculate hash md5: %s", a17);
        return a17;
    }

    public static java.util.List b() {
        java.util.List b17 = com.tencent.mm.sdk.platformtools.h2.b(com.tencent.mm.sdk.platformtools.o4.M("MMKVName_CrashMD5Helper").getString("MMKVKey_CrashMD5", "").split(","));
        com.tencent.mars.xlog.Log.i("MicroMsg.CrashMD5Helper", "getRecentCrashMd5 md5: %s", com.tencent.mm.sdk.platformtools.h2.a(b17, ","));
        return b17;
    }

    public static void c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CrashMD5Helper", "recordCrashMd5 md5: %s", str);
        java.util.ArrayList arrayList = (java.util.ArrayList) b();
        arrayList.remove(str);
        arrayList.add(0, str);
        java.util.List subList = arrayList.subList(0, java.lang.Math.min(arrayList.size(), 3));
        com.tencent.mars.xlog.Log.i("MicroMsg.CrashMD5Helper", "writeMd5String md5s: %s", com.tencent.mm.sdk.platformtools.h2.a(subList, ","));
        com.tencent.mm.sdk.platformtools.o4.M("MMKVName_CrashMD5Helper").putString("MMKVKey_CrashMD5", com.tencent.mm.sdk.platformtools.h2.a(subList, ","));
    }
}
