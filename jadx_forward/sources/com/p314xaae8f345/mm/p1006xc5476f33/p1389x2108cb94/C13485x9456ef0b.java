package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* renamed from: com.tencent.mm.plugin.expansions.ExpansionsClassLoaderInitializer */
/* loaded from: classes12.dex */
public final class C13485x9456ef0b {
    private static final java.lang.String TAG = "MicroMsg.ExpansionsClassLoaderInitializer";

    /* renamed from: initializeClassLoader */
    public void m55147x1796cdfb(android.app.Application application, java.lang.ClassLoader classLoader) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.y.a(TAG, "[+] Enter initializeClassLoader.");
        java.lang.String str2 = null;
        if (application != null) {
            int myPid = android.os.Process.myPid();
            java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = ((android.app.ActivityManager) application.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                android.app.ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid && (str = next.processName) != null && !str.equals("")) {
                    str2 = next.processName;
                    break;
                }
            }
        }
        if (str2.endsWith(":push")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.y.a(TAG, "[!] push process needn't initialize Expansions.");
        } else if (str2.endsWith(":isolated_process0")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.y.a(TAG, "[!] tbs isolated process cannot initialize Expansions.");
        } else {
            byte[] bArr = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f181284a;
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55128x7d80d2b7();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.y.a(TAG, "[+] Exit initializeClassLoader.");
    }
}
