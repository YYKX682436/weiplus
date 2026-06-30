package com.p314xaae8f345.mm.p2499xd05e7f95;

/* renamed from: com.tencent.mm.recovery.RecoveryInitializer */
/* loaded from: classes12.dex */
public class C19819x7bfc77ed {

    /* renamed from: RECOVERY_SETTING_DEBUG */
    private static final int f39065x538e103a = 30000;
    private static final java.lang.String TAG = "MicroMsg.recovery.initializer";

    /* renamed from: init */
    public static boolean m77342x316510(android.content.Context context) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("getRemoteService", "(Lcom/google/android/gms/common/internal/IAccountAccessor;Ljava/util/Set;)V"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("com/google/android/gms/common/internal/BaseGmsClient", arrayList);
        xj0.a.h().k(hashMap, new y45.k(context));
        if (d55.n0.c(context, ":recovery")) {
            java.lang.Thread.setDefaultUncaughtExceptionHandler(new y45.g(context));
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.u(context);
                km0.c cVar = new km0.c(":recovery", com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a());
                ku5.u.a(cVar.f390522c, new com.p314xaae8f345.mm.p642xad8b531f.p3());
                cVar.f390525f = com.p314xaae8f345.mm.p642xad8b531f.s.b(cVar.f390522c);
                gm0.j1.g(cVar);
                android.content.Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                com.p314xaae8f345.mm.vfs.b3.E = applicationContext;
                c01.je.h();
                com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.m40120x6c4ebec7(new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295());
                com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4550xb1ac21b4.m40029xe9f5beed(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.m40102xb2516f8a(new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4555x3339adb8());
                com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.m40107x316510(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.os.Handler(android.os.Looper.getMainLooper()));
                y45.C30750x321854 c30750x321854 = new y45.C30750x321854(context);
                ak0.a aVar = ak0.o.f87075a;
                ak0.j.f87072b.add(new nq1.b0(c30750x321854));
                d55.r0.a().e("diagnostic_mmkv_reset", new y45.d("diagnostic_storage"));
                d55.r0.a().e("jectl_mmkv_reset", new y45.e("jectl_config"));
                com.p314xaae8f345.mm.app.v5 a17 = com.p314xaae8f345.mm.app.v5.a(cVar.f390522c);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f135401e)) {
                    cVar.f390525f.e(a17.f135401e);
                }
            } catch (java.lang.Throwable th6) {
                d55.u.c(TAG, "recovery process init error", th6, new java.lang.Object[0]);
                d55.u.a(context);
            }
            return false;
        }
        if (!d55.n0.c(context, "")) {
            return true;
        }
        d55.a0 a0Var = new d55.a0(context);
        a0Var.f308092e = 0L;
        a0Var.a();
        d55.r0 a18 = d55.r0.a();
        if (context != null) {
            a18.f308147a = context;
        } else {
            a18.getClass();
        }
        y45.j jVar = new y45.j();
        if (a18.f308148b == null) {
            a18.f308148b = new d55.d0(a18.b());
        }
        d55.b0 b0Var = (d55.b0) a18.f308148b;
        jVar.f308086a = b0Var.f308107q;
        b0Var.f308099f.set(jVar);
        y45.i iVar = new y45.i();
        if (a18.f308148b == null) {
            a18.f308148b = new d55.d0(a18.b());
        }
        java.util.List list = (java.util.List) ((d55.b0) a18.f308148b).f308100g.get(1);
        if (list != null) {
            list.add(iVar);
        }
        y45.h hVar = new y45.h();
        if (a18.f308148b == null) {
            a18.f308148b = new d55.d0(a18.b());
        }
        java.util.List list2 = (java.util.List) ((d55.b0) a18.f308148b).f308100g.get(2);
        if (list2 != null) {
            list2.add(hVar);
        }
        if (d55.r0.d(context)) {
            return true;
        }
        try {
            z17 = m77343xf743636d(context);
        } catch (java.lang.Throwable th7) {
            d55.u.c(TAG, "check isStartWithActivity error", th7, new java.lang.Object[0]);
            z17 = false;
        }
        if (!z17) {
            d55.u.b(TAG, "isStartWithActivity = false, skip recovery detect", new java.lang.Object[0]);
            return true;
        }
        d55.r0 a19 = d55.r0.a();
        if (d55.n0.c(a19.b(), "")) {
            android.content.Context b17 = a19.b();
            android.os.Bundle bundle = new android.os.Bundle();
            android.content.SharedPreferences sharedPreferences = b17.getSharedPreferences("recovery_enable", 4);
            if (sharedPreferences == null) {
                throw new java.lang.IllegalStateException("Persis#load() has not yet been called");
            }
            if (bundle.containsKey("enable") ? bundle.getBoolean("enable") : sharedPreferences.getBoolean("enable", true)) {
                if (a19.f308148b == null) {
                    a19.f308148b = new d55.d0(a19.b());
                }
                ((d55.d0) a19.f308148b).j();
            } else {
                d55.o0.a(4, "MicroMsg.recovery", "Recovery is disabled, skip");
            }
        } else {
            d55.o0.a(4, "MicroMsg.recovery", "not main proc, skip");
        }
        return true;
    }

    /* renamed from: isStartWithActivity */
    private static boolean m77343xf743636d(android.content.Context context) {
        boolean z17;
        boolean z18;
        boolean z19;
        java.io.BufferedReader bufferedReader;
        java.lang.String readLine;
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(Integer.MAX_VALUE)) != null) {
            for (android.app.ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                if (runningTaskInfo.numActivities > 0) {
                    java.lang.String packageName = context.getPackageName();
                    android.content.ComponentName componentName = runningTaskInfo.topActivity;
                    if (componentName != null && packageName.equals(componentName.getPackageName())) {
                        z17 = true;
                        break;
                    }
                }
            }
        }
        z17 = false;
        android.app.ActivityManager activityManager2 = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        if (activityManager2 != null) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager2.getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.startsWith(context.getPackageName())) {
                    d55.o0.a(5, "MicroMsg.recovery.utils", "app importance = " + runningAppProcessInfo.importance);
                    if (runningAppProcessInfo.importance <= 100) {
                        z18 = true;
                        break;
                    }
                }
            }
        }
        z18 = false;
        if (!z18) {
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/self/cgroup")));
            } catch (java.lang.Throwable unused) {
            }
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine != null && !readLine.contains("top-app") && !readLine.contains("foreground")) {
                        if (readLine.contains("background")) {
                            break;
                        }
                    }
                    bufferedReader.close();
                    z19 = true;
                    break;
                } finally {
                }
            } while (!readLine.contains("restricted"));
            bufferedReader.close();
        }
        z19 = false;
        d55.o0.a(5, "MicroMsg.recovery", "isTopActivity = " + z17 + ", appImportanceForeground = " + z18 + ", cgroupForeground = " + z19);
        return z17 && (z18 || z19);
    }
}
