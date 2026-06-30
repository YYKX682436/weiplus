package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.a f234533e = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.a();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f234534f = false;

    /* renamed from: g, reason: collision with root package name */
    public static int f234535g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.app.ActivityManager f234536d = (android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);

    @Override // java.lang.Runnable
    public void run() {
        android.os.Debug.MemoryInfo[] memoryInfoArr;
        android.app.ActivityManager activityManager = this.f234536d;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < runningAppProcesses.size(); i17++) {
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i17);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z8 z8Var = yp5.a.f545942a;
            if (android.os.Process.myUid() == runningAppProcessInfo.uid && !android.text.TextUtils.isEmpty(runningAppProcessInfo.processName) && runningAppProcessInfo.processName.startsWith("com.tencent.mm")) {
                ob0.s3 s3Var = new ob0.s3();
                s3Var.f425477a = runningAppProcesses.get(i17).pid;
                s3Var.f425478b = runningAppProcesses.get(i17).processName;
                arrayList.add(s3Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppbrandMemoryMonitor", "info with uid [%s] & process name [%s] is not current app [%s][%s]", java.lang.Integer.valueOf(runningAppProcesses.get(i17).uid), runningAppProcesses.get(i17).processName, java.lang.Integer.valueOf(android.os.Process.myUid()), "com.tencent.mm");
            }
        }
        int size = arrayList.size();
        ob0.s3[] s3VarArr = new ob0.s3[size];
        arrayList.toArray(s3VarArr);
        try {
            int[] iArr = new int[size];
            for (int i18 = 0; i18 < size; i18++) {
                iArr[i18] = s3VarArr[i18].f425477a;
            }
            memoryInfoArr = activityManager.getProcessMemoryInfo(iArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AppbrandMemoryMonitor", e17, "", new java.lang.Object[0]);
            memoryInfoArr = null;
        }
        if (memoryInfoArr != null) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                iz5.a.a(size, memoryInfoArr.length);
            }
            int i19 = 0;
            for (int i27 = 0; i27 < java.lang.Math.min(memoryInfoArr.length, size); i27++) {
                android.os.Debug.MemoryInfo memoryInfo = memoryInfoArr[i27];
                if (memoryInfo != null) {
                    memoryInfo.getTotalPss();
                    s3VarArr[i27].f425501y = memoryInfoArr[i27].getTotalPss();
                    i19 += s3VarArr[i27].f425501y;
                }
            }
            if (i19 > f234535g) {
                f234534f = true;
            } else {
                f234534f = false;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppbrandMemoryMonitor", "pidMemInfoArray2 == null");
        }
        ((ku5.t0) ku5.t0.f394148d).l(this, 300000L, "AppbrandMemoryMonitor");
    }
}
