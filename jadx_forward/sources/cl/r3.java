package cl;

/* loaded from: classes7.dex */
public abstract class r3 {

    /* renamed from: a, reason: collision with root package name */
    public static int f124286a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static int f124287b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static cl.q3 f124288c;

    public static int a(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.String str3 = str2 + "=";
        if (str.indexOf(str3) >= 0) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str.replaceFirst(str3, ""), i17);
        }
        return Integer.MIN_VALUE;
    }

    public static void b() {
        java.lang.String m16067x746d94d1 = com.p159x477cd522.p160x333422.V8.m16067x746d94d1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8GCReporter", "initV8GCSpaceSizeFromFlags : %s", m16067x746d94d1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m16067x746d94d1)) {
            f124286a = 1;
            f124287b = 8;
            return;
        }
        java.lang.String[] split = m16067x746d94d1.split(" ", -1);
        for (int i17 = 0; i17 < split.length; i17++) {
            int a17 = a(split[i17], "--min_semi_space_size", 1);
            if (a17 != Integer.MIN_VALUE) {
                f124286a = a17;
            } else {
                int a18 = a(split[i17], "--max_semi_space_size", 8);
                if (a18 != Integer.MIN_VALUE) {
                    f124287b = a18;
                }
            }
        }
    }

    public static void c(int i17, long j17, int i18, java.lang.String str, int i19, int i27, int i28) {
        if (f124288c != null) {
            java.lang.Object[] objArr = new java.lang.Object[9];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = java.lang.Long.valueOf(j17);
            int i29 = f124286a;
            if (i29 <= 0) {
                b();
                i29 = f124286a;
            }
            objArr[2] = java.lang.Integer.valueOf(i29);
            int i37 = f124287b;
            if (i37 <= 0) {
                b();
                i37 = f124287b;
            }
            objArr[3] = java.lang.Integer.valueOf(i37);
            objArr[4] = java.lang.Integer.valueOf(i18);
            objArr[5] = str;
            objArr[6] = java.lang.Integer.valueOf(i19);
            objArr[7] = java.lang.Integer.valueOf(i27);
            objArr[8] = java.lang.Integer.valueOf(i28);
            java.lang.String format = java.lang.String.format("%d,%d,%d,%d,%d,%s,%d,%d,%d", objArr);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.m0) f124288c).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(17693, format);
        }
    }
}
