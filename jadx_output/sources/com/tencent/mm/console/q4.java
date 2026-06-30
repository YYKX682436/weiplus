package com.tencent.mm.console;

/* loaded from: classes7.dex */
public class q4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        int intExtra = intent.getIntExtra("pid", 0);
        if (intExtra == 0) {
            return;
        }
        java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses().iterator();
        while (it.hasNext()) {
            if (it.next().pid == intExtra) {
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "进程重启: " + intExtra, 1).show();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(intExtra));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/console/Shell$87", "exec", "(Landroid/content/Intent;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/console/Shell$87", "exec", "(Landroid/content/Intent;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                return;
            }
        }
    }
}
