package yd;

/* loaded from: classes7.dex */
public enum c0 {
    INST;


    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f542465e = {"summary.native-heap", "summary.graphics"};

    public static yd.b0 a(android.os.Debug.MemoryInfo memoryInfo) {
        yd.b0 b0Var = new yd.b0();
        if (memoryInfo == null) {
            return b0Var;
        }
        b0Var.f542451a = memoryInfo.getTotalPss() / 1024;
        b0Var.f542452b = memoryInfo.nativePss / 1024;
        b0Var.f542453c = memoryInfo.dalvikPss / 1024;
        b0Var.f542454d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(memoryInfo.getMemoryStat("summary.graphics"), 0) / 1024;
        b0Var.f542455e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(memoryInfo.getMemoryStat("summary.system"), 0) / 1024;
        b0Var.f542456f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(memoryInfo.getMemoryStat("summary.total-swap"), 0) / 1024;
        b0Var.f542457g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(memoryInfo.getMemoryStat("summary.java-heap"), 0) / 1024;
        b0Var.f542458h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(memoryInfo.getMemoryStat("summary.private-other"), 0) / 1024;
        b0Var.f542459i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(memoryInfo.getMemoryStat("summary.code"), 0) / 1024;
        b0Var.f542460j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(memoryInfo.getMemoryStat("summary.stack"), 0) / 1024;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(100);
        java.util.Map<java.lang.String, java.lang.String> memoryStats = memoryInfo.getMemoryStats();
        for (java.lang.String str : memoryStats.keySet()) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && yo.a.b(f542465e, str)) {
                sb6.append(str);
                sb6.append(":");
                java.lang.String str2 = memoryStats.get(str);
                java.util.Objects.requireNonNull(str2);
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str2, 0) / 1024);
                sb6.append("m ");
                sb6.append(java.lang.System.getProperty("line.separator"));
            }
        }
        b0Var.f542461k = sb6.toString();
        return b0Var;
    }

    public yd.b0 h() {
        android.os.Debug.MemoryInfo[] processMemoryInfo;
        int myPid = android.os.Process.myPid();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        return a((activityManager == null || (processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{myPid})) == null || processMemoryInfo.length <= 0) ? null : processMemoryInfo[0]);
    }
}
