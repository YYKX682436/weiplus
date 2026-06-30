package oj;

/* loaded from: classes12.dex */
public final class o {
    public o(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[] a() {
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[] c4720x9bbc2403Arr;
        char c17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.ActivityManager activityManager = oj.p.f427245a;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (runningAppProcesses == null) {
            oj.j.b("Matrix.MemoryInfoFactory", "ERROR: activityManager.runningAppProcesses - no running process", new java.lang.Object[0]);
            c4720x9bbc2403Arr = new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[0];
        } else {
            oj.j.a("Matrix.MemoryInfoFactory", "processInfoList[" + runningAppProcesses + ']', new java.lang.Object[0]);
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4725x9d1e779d c4725x9d1e779d = new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4725x9d1e779d(memoryInfo.totalMem, memoryInfo.availMem, memoryInfo.lowMemory, memoryInfo.threshold);
            int size = runningAppProcesses.size();
            for (int i17 = 0; i17 < size; i17++) {
                android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i17);
                ih.d d17 = ih.d.d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "Matrix.with()");
                android.app.Application application = d17.f373004b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(application, "Matrix.with().application");
                java.lang.String pkgName = application.getPackageName();
                if (android.os.Process.myUid() == runningAppProcessInfo.uid && !android.text.TextUtils.isEmpty(runningAppProcessInfo.processName)) {
                    java.lang.String str = runningAppProcessInfo.processName;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "processInfo.processName");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pkgName, "pkgName");
                    if (r26.i0.y(str, pkgName, false)) {
                        int i18 = runningAppProcessInfo.pid;
                        java.lang.String str2 = runningAppProcessInfo.processName;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "processInfo.processName");
                        arrayList.add(new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403(new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4722x6f76cf9d(i18, str2, null, false, false, 28, null), null, null, null, c4725x9d1e779d, new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null), new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null), null, 128, null));
                        c17 = ']';
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("info with uid [");
                sb6.append(runningAppProcessInfo.uid);
                sb6.append("] & process name [");
                sb6.append(runningAppProcessInfo.processName);
                sb6.append("] is not current app [");
                sb6.append(android.os.Process.myUid());
                sb6.append("][");
                sb6.append(pkgName);
                c17 = ']';
                sb6.append(']');
                oj.j.b("Matrix.MemoryInfoFactory", sb6.toString(), new java.lang.Object[0]);
            }
            java.lang.Object[] array = arrayList.toArray(new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            c4720x9bbc2403Arr = (com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[]) array;
        }
        android.app.ActivityManager activityManager2 = oj.p.f427245a;
        android.app.ActivityManager activityManager3 = oj.p.f427245a;
        int[] iArr = new int[c4720x9bbc2403Arr.length];
        int length = c4720x9bbc2403Arr.length;
        int i19 = 0;
        int i27 = 0;
        while (i27 < length) {
            com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4722x6f76cf9d c4722x6f76cf9d = c4720x9bbc2403Arr[i27].f134630e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4722x6f76cf9d);
            iArr[i19] = c4722x6f76cf9d.f134641d;
            i27++;
            i19++;
        }
        android.os.Debug.MemoryInfo[] processMemoryInfo = activityManager3.getProcessMemoryInfo(iArr);
        if (processMemoryInfo != null) {
            int length2 = c4720x9bbc2403Arr.length;
            for (int i28 = 0; i28 < length2; i28++) {
                android.os.Debug.MemoryInfo memoryInfo2 = processMemoryInfo[i28];
                if (memoryInfo2 == null) {
                    c4720x9bbc2403Arr[i28].f134635m = new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3584, null);
                } else {
                    com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 c4720x9bbc2403 = c4720x9bbc2403Arr[i28];
                    oj.y yVar = com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e.f134646s;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(memoryInfo2, "pidMemInfoArray[i]");
                    c4720x9bbc2403.f134635m = yVar.a(memoryInfo2);
                }
            }
        }
        oj.j.c("Matrix.MemoryInfoFactory", "getAllProcessPss cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis), new java.lang.Object[0]);
        return c4720x9bbc2403Arr;
    }

    public final com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        oj.y yVar = com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e.f134646s;
        android.os.Debug.MemoryInfo[] processMemoryInfo = oj.p.f427245a.getProcessMemoryInfo(new int[]{java.lang.Integer.valueOf(android.os.Process.myPid()).intValue()});
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(processMemoryInfo, "MemInfoFactory.activityM…ss.myPid()).toIntArray())");
        android.os.Debug.MemoryInfo memoryInfo = (android.os.Debug.MemoryInfo) kz5.z.O(processMemoryInfo);
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 c4720x9bbc2403 = new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403(null, null, null, null, null, memoryInfo != null ? yVar.a(memoryInfo) : new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null), yVar.b(), null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, null);
        c4720x9bbc2403.f134629d = java.lang.System.currentTimeMillis() - currentTimeMillis;
        return c4720x9bbc2403;
    }
}
