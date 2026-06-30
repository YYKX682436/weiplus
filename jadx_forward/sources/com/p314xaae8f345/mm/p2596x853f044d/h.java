package com.p314xaae8f345.mm.p2596x853f044d;

/* loaded from: classes12.dex */
public abstract class h {
    public static boolean a(java.lang.String str) {
        java.lang.String absolutePath;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("key_is_migrated_");
        java.io.File file = new java.io.File(str);
        try {
            absolutePath = file.getCanonicalPath();
        } catch (java.lang.Throwable th6) {
            java.lang.Object[] objArr = {str};
            com.p314xaae8f345.mm.p2596x853f044d.a aVar = (com.p314xaae8f345.mm.p2596x853f044d.a) com.p314xaae8f345.mm.p2596x853f044d.g.f273882e;
            aVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExtStorageMigrateStatus", th6, "[-] Fail to get canonical path for: %s", objArr);
            aVar.a(6, "MicroMsg.ExtStorageMigrateStatus", th6, "[-] Fail to get canonical path for: %s", objArr);
            absolutePath = file.getAbsolutePath();
        }
        sb6.append(absolutePath);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("extmig_status_memo_storage").getBoolean(sb6.toString(), false);
    }
}
