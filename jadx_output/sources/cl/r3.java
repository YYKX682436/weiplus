package cl;

/* loaded from: classes7.dex */
public abstract class r3 {

    /* renamed from: a, reason: collision with root package name */
    public static int f42753a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static int f42754b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static cl.q3 f42755c;

    public static int a(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.String str3 = str2 + "=";
        if (str.indexOf(str3) >= 0) {
            return com.tencent.mm.sdk.platformtools.t8.P(str.replaceFirst(str3, ""), i17);
        }
        return Integer.MIN_VALUE;
    }

    public static void b() {
        java.lang.String flags = com.eclipsesource.mmv8.V8.getFlags();
        com.tencent.mars.xlog.Log.i("MicroMsg.V8GCReporter", "initV8GCSpaceSizeFromFlags : %s", flags);
        if (com.tencent.mm.sdk.platformtools.t8.K0(flags)) {
            f42753a = 1;
            f42754b = 8;
            return;
        }
        java.lang.String[] split = flags.split(" ", -1);
        for (int i17 = 0; i17 < split.length; i17++) {
            int a17 = a(split[i17], "--min_semi_space_size", 1);
            if (a17 != Integer.MIN_VALUE) {
                f42753a = a17;
            } else {
                int a18 = a(split[i17], "--max_semi_space_size", 8);
                if (a18 != Integer.MIN_VALUE) {
                    f42754b = a18;
                }
            }
        }
    }

    public static void c(int i17, long j17, int i18, java.lang.String str, int i19, int i27, int i28) {
        if (f42755c != null) {
            java.lang.Object[] objArr = new java.lang.Object[9];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = java.lang.Long.valueOf(j17);
            int i29 = f42753a;
            if (i29 <= 0) {
                b();
                i29 = f42753a;
            }
            objArr[2] = java.lang.Integer.valueOf(i29);
            int i37 = f42754b;
            if (i37 <= 0) {
                b();
                i37 = f42754b;
            }
            objArr[3] = java.lang.Integer.valueOf(i37);
            objArr[4] = java.lang.Integer.valueOf(i18);
            objArr[5] = str;
            objArr[6] = java.lang.Integer.valueOf(i19);
            objArr[7] = java.lang.Integer.valueOf(i27);
            objArr[8] = java.lang.Integer.valueOf(i28);
            java.lang.String format = java.lang.String.format("%d,%d,%d,%d,%d,%s,%d,%d,%d", objArr);
            ((com.tencent.mm.plugin.appbrand.jsruntime.m0) f42755c).getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(17693, format);
        }
    }
}
