package ak0;

/* loaded from: classes13.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedQueue f87074a = new java.util.concurrent.ConcurrentLinkedQueue();

    public static void a() {
        tv5.b bVar = ((ak0.x) ak0.o.b()).f87085c;
        if (bVar == null) {
            throw new java.lang.IllegalStateException("Tinker instance in core is not initialized.");
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104725xcca2ff7f(bVar.f503901a);
    }

    public static void b() {
        ak0.o.b();
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104761xd655e5e6(ak0.o.a());
        tv5.b.b(ak0.o.a()).f503910j = 0;
    }

    public static void c() {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) ak0.o.f87076b.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.uid == android.os.Process.myUid() && runningAppProcessInfo.pid != android.os.Process.myPid()) {
                int i17 = runningAppProcessInfo.pid;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
        com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7 abstractC26587x7a37b8e7 = xVar.f87083a;
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104723x268370c1(abstractC26587x7a37b8e7.m104434x367a4c1a(), file, new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429(abstractC26587x7a37b8e7.m104434x367a4c1a())) == 0) {
            tv5.b bVar = xVar.f87085c;
            if (bVar == null) {
                throw new java.lang.IllegalStateException("Tinker instance in core is not initialized.");
            }
            int a17 = bVar.f503903c.a(file.getAbsolutePath());
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
