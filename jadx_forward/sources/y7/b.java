package y7;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.io.FileFilter f541199a = new y7.a();

    public static int a(byte[] bArr, int i17) {
        byte b17;
        while (i17 < bArr.length && (b17 = bArr[i17]) != 10) {
            if (java.lang.Character.isDigit(b17)) {
                int i18 = i17 + 1;
                while (i18 < bArr.length && java.lang.Character.isDigit(bArr[i18])) {
                    i18++;
                }
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(new java.lang.String(bArr, 0, i17, i18 - i17), 0);
            }
            i17++;
        }
        return -1;
    }

    public static int b() {
        int i17;
        int i18 = 0;
        int i19 = -1;
        for (int i27 = 0; i27 < d(); i27++) {
            try {
                java.io.File file = new java.io.File("/sys/devices/system/cpu/cpu" + i27 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    try {
                        com.p314xaae8f345.mm.vfs.w6.E(file.getPath()).read(bArr);
                        int i28 = 0;
                        while (java.lang.Character.isDigit(bArr[i28]) && i28 < 128) {
                            i28++;
                        }
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(new java.lang.String(bArr, 0, i28), 0));
                        if (valueOf.intValue() > i19) {
                            i19 = valueOf.intValue();
                        }
                    } catch (java.lang.NumberFormatException unused) {
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
            } catch (java.io.IOException unused2) {
                return -1;
            }
        }
        if (i19 == -1) {
            java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E("/proc/cpuinfo");
            try {
                byte[] bArr2 = new byte[1024];
                try {
                    int read = E.read(bArr2);
                    loop2: while (i18 < read) {
                        byte b17 = bArr2[i18];
                        if (b17 == 10 || i18 == 0) {
                            if (b17 == 10) {
                                i18++;
                            }
                            for (int i29 = i18; i29 < read; i29++) {
                                int i37 = i29 - i18;
                                if (bArr2[i29] != "cpu MHz".charAt(i37)) {
                                    break;
                                }
                                if (i37 == 6) {
                                    i17 = a(bArr2, i29);
                                    break loop2;
                                }
                            }
                        }
                        i18++;
                    }
                } catch (java.io.IOException | java.lang.NumberFormatException unused3) {
                }
                i17 = -1;
                int i38 = i17 * 1000;
                if (i38 > i19) {
                    i19 = i38;
                }
                E.close();
            } finally {
                E.close();
            }
        }
        return i19;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.String r3) {
        /*
            r0 = -1
            r1 = 0
            java.io.InputStream r1 = com.p314xaae8f345.mm.vfs.w6.E(r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b
            r3.close()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b
            if (r2 == 0) goto L2e
            java.lang.String r3 = "0-[\\d]+$"
            boolean r3 = r2.matches(r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b
            if (r3 != 0) goto L22
            goto L2e
        L22:
            r3 = 2
            java.lang.String r3 = r2.substring(r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b
            r2 = 0
            int r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r3, r2)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L3b
            int r0 = r3 + 1
        L2e:
            if (r1 == 0) goto L33
            r1.close()     // Catch: java.io.IOException -> L33
        L33:
            return r0
        L34:
            r3 = move-exception
            if (r1 == 0) goto L3a
            r1.close()     // Catch: java.io.IOException -> L3a
        L3a:
            throw r3
        L3b:
            if (r1 == 0) goto L40
            r1.close()     // Catch: java.io.IOException -> L40
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.b.c(java.lang.String):int");
    }

    public static int d() {
        try {
            int c17 = c("/sys/devices/system/cpu/possible");
            if (c17 == -1) {
                c17 = c("/sys/devices/system/cpu/present");
            }
            return c17 == -1 ? new java.io.File("/sys/devices/system/cpu/").listFiles(f541199a).length : c17;
        } catch (java.lang.NullPointerException | java.lang.SecurityException unused) {
            return -1;
        }
    }

    public static long e(android.content.Context context) {
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}
