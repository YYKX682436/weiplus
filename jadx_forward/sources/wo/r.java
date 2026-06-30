package wo;

/* loaded from: classes12.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f529325a = -1;

    public static int a() {
        if (f529325a <= 0) {
            synchronized (wo.r.class) {
                if (f529325a <= 0) {
                    return b();
                }
            }
        }
        return f529325a;
    }

    public static int b() {
        int i17 = wo.t.g() ? 7 : wo.t.f() ? 3 : 1;
        wo.u uVar = wo.v1.f529354a;
        boolean z17 = uVar.f529336a;
        if (z17 && uVar.f529338c == 0) {
            i17 &= -3;
        }
        if (z17 && uVar.f529337b == 0) {
            i17 &= -5;
        }
        int d17 = wo.t.d();
        if (d17 > 16) {
            d17 = 15;
        } else if (d17 < 1) {
            d17 = 1;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(e(), 0) / 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CpuChecker", "nCores: " + d17 + ", nFreq: " + P);
        if (d17 >= 8) {
            P *= 5;
        } else if (d17 >= 4) {
            P *= 2;
        } else if (d17 > 1) {
            P = (P * 3) >> 1;
        }
        int i18 = P / 100;
        if (i18 > 200) {
            i18 = 200;
        } else if (i18 < 5) {
            i18 = 5;
        }
        f529325a = (((d17 << 4) + i17) << 8) + ((i18 > 5 || d17 < 4) ? i18 : 15);
        return f529325a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] c() {
        /*
            int r0 = wo.t.d()
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r0) goto L88
            r1[r3] = r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "e = "
            java.lang.String r6 = "MicroMsg.CpuChecker"
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            r8 = 0
            if (r7 == 0) goto L2b
            goto L5f
        L2b:
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L4c
            java.lang.String r9 = "r"
            r7.<init>(r4, r9)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = r7.readLine()     // Catch: java.lang.Throwable -> L4d
            r7.close()     // Catch: java.lang.Exception -> L3b
            goto L5f
        L3b:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
        L41:
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r4)
            goto L5f
        L4c:
            r7 = r8
        L4d:
            java.lang.String r4 = "cat file fail"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r4)     // Catch: java.lang.Throwable -> L70
            if (r7 == 0) goto L5f
            r7.close()     // Catch: java.lang.Exception -> L58
            goto L5f
        L58:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
            goto L41
        L5f:
            boolean r4 = android.text.TextUtils.isEmpty(r8)
            if (r4 != 0) goto L6d
            int r4 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.Exception -> L6d
            int r4 = r4 / 1000
            r1[r3] = r4     // Catch: java.lang.Exception -> L6d
        L6d:
            int r3 = r3 + 1
            goto L8
        L70:
            r0 = move-exception
            if (r7 == 0) goto L87
            r7.close()     // Catch: java.lang.Exception -> L77
            goto L87
        L77:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r1)
        L87:
            throw r0
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.r.c():int[]");
    }

    public static java.lang.String d() {
        java.lang.Throwable th6;
        java.io.BufferedReader bufferedReader;
        java.lang.Exception e17;
        try {
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.FileReader("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"));
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        throw new java.lang.NullPointerException("null was returned while reading scaling_cur_freq.");
                    }
                    java.lang.String trim = readLine.trim();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
                    return trim;
                } catch (java.lang.Exception e18) {
                    e17 = e18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CpuChecker", e17, "unexpected exception occurred.", new java.lang.Object[0]);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
                    return "0";
                }
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(null);
                throw th6;
            }
        } catch (java.lang.Exception e19) {
            bufferedReader = null;
            e17 = e19;
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(null);
            throw th6;
        }
    }

    public static java.lang.String e() {
        java.io.BufferedReader bufferedReader;
        java.lang.Throwable th6;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
            try {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    return readLine.trim();
                }
                throw new java.lang.NullPointerException("null was returned while reading cpuinfo_max_freq.");
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CpuChecker", th6, "unexpected exception occurred.", new java.lang.Object[0]);
                    return "0";
                } finally {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
                }
            }
        } catch (java.lang.Throwable th8) {
            bufferedReader = null;
            th6 = th8;
        }
    }
}
