package com.tencent.mm.plugin.expansions;

/* loaded from: classes12.dex */
public final class ExpansionsClassLoaderInitializer {
    private static final java.lang.String TAG = "MicroMsg.ExpansionsClassLoaderInitializer";

    public void initializeClassLoader(android.app.Application application, java.lang.ClassLoader classLoader) {
        java.lang.String str;
        com.tencent.mm.plugin.expansions.y.a(TAG, "[+] Enter initializeClassLoader.");
        java.lang.String str2 = null;
        if (application != null) {
            int myPid = android.os.Process.myPid();
            java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = ((android.app.ActivityManager) application.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses().iterator();
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
            com.tencent.mm.plugin.expansions.y.a(TAG, "[!] push process needn't initialize Expansions.");
        } else if (str2.endsWith(":isolated_process0")) {
            com.tencent.mm.plugin.expansions.y.a(TAG, "[!] tbs isolated process cannot initialize Expansions.");
        } else {
            byte[] bArr = com.tencent.mm.plugin.expansions.i0.f99751a;
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mm.plugin.expansions.Delivery.isEnabled();
        }
        com.tencent.mm.plugin.expansions.y.a(TAG, "[+] Exit initializeClassLoader.");
    }
}
