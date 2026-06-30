package ak0;

/* loaded from: classes13.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedQueue f5541a = new java.util.concurrent.ConcurrentLinkedQueue();

    public static void a() {
        tv5.b bVar = ((ak0.x) ak0.o.b()).f5552c;
        if (bVar == null) {
            throw new java.lang.IllegalStateException("Tinker instance in core is not initialized.");
        }
        com.tencent.tinker.loader.shareutil.ShareTinkerInternals.cleanPatch(bVar.f422368a);
    }

    public static void b() {
        ak0.o.b();
        com.tencent.tinker.loader.shareutil.ShareTinkerInternals.setTinkerDisableWithSharedPreferences(ak0.o.a());
        tv5.b.b(ak0.o.a()).f422377j = 0;
    }

    public static void c() {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) ak0.o.f5543b.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.uid == android.os.Process.myUid() && runningAppProcessInfo.pid != android.os.Process.myPid()) {
                int i17 = runningAppProcessInfo.pid;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/hotpatch/HotPatchHelper$Operations", "killAllOtherProcesses", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/hotpatch/HotPatchHelper$Operations", "killAllOtherProcesses", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }
    }

    public static int d(java.io.File file) {
        ak0.x xVar = (ak0.x) ak0.o.b();
        com.tencent.tinker.entry.ApplicationLike applicationLike = xVar.f5550a;
        if (com.tencent.tinker.loader.shareutil.ShareTinkerInternals.checkSignatureAndTinkerID(applicationLike.getApplication(), file, new com.tencent.tinker.loader.shareutil.ShareSecurityCheck(applicationLike.getApplication())) == 0) {
            tv5.b bVar = xVar.f5552c;
            if (bVar == null) {
                throw new java.lang.IllegalStateException("Tinker instance in core is not initialized.");
            }
            int a17 = bVar.f422370c.a(file.getAbsolutePath());
            if (a17 == 0) {
                return 0;
            }
            if (a17 == -3) {
                return 1;
            }
            if (a17 == -6) {
                return 2;
            }
        }
        return -1;
    }
}
