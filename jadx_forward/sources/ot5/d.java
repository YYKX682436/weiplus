package ot5;

/* loaded from: classes12.dex */
public abstract class d {
    public static java.lang.String a(java.lang.String str) {
        try {
            java.lang.reflect.Method method = java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class);
            method.setAccessible(true);
            java.lang.String str2 = (java.lang.String) method.invoke(null, str);
            return str2 == null ? "" : str2;
        } catch (java.lang.Throwable th6) {
            ot5.g.d("DeviceUtil", " getBuildPropByReflect: " + th6);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(boolean r6) {
        /*
            java.lang.String r0 = "DeviceUtil"
            java.lang.String r1 = ""
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "/proc/version"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L89
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            r4.<init>(r2)
            r5 = 8192(0x2000, float:1.148E-41)
            r3.<init>(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
        L1c:
            java.lang.String r5 = r3.readLine()     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L26
            r4.append(r5)     // Catch: java.lang.Throwable -> L3b
            goto L1c
        L26:
            r3.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r3 = move-exception
            ot5.g.a(r0, r3)
        L2e:
            r2.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r2 = move-exception
        L33:
            ot5.g.a(r0, r2)
        L36:
            java.lang.String r2 = r4.toString()
            goto L4d
        L3b:
            r5 = move-exception
            ot5.g.a(r0, r5)     // Catch: java.lang.Throwable -> L77
            r3.close()     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r3 = move-exception
            ot5.g.a(r0, r3)
        L47:
            r2.close()     // Catch: java.lang.Throwable -> L4b
            goto L36
        L4b:
            r2 = move-exception
            goto L33
        L4d:
            if (r6 != 0) goto L51
            r1 = r2
            goto L76
        L51:
            if (r2 == 0) goto L76
            boolean r6 = r2.equals(r1)
            if (r6 != 0) goto L76
            java.lang.String r6 = "version "
            int r6 = r2.indexOf(r6)     // Catch: java.lang.Throwable -> L72
            int r6 = r6 + 8
            java.lang.String r6 = r2.substring(r6)     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = " "
            int r2 = r6.indexOf(r2)     // Catch: java.lang.Throwable -> L72
            r3 = 0
            java.lang.String r1 = r6.substring(r3, r2)     // Catch: java.lang.Throwable -> L72
            goto L76
        L72:
            r6 = move-exception
            ot5.g.a(r0, r6)
        L76:
            return r1
        L77:
            r6 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L7c
            goto L80
        L7c:
            r1 = move-exception
            ot5.g.a(r0, r1)
        L80:
            r2.close()     // Catch: java.lang.Throwable -> L84
            goto L88
        L84:
            r1 = move-exception
            ot5.g.a(r0, r1)
        L88:
            throw r6
        L89:
            r6 = move-exception
            ot5.g.a(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ot5.d.b(boolean):java.lang.String");
    }

    public static java.lang.String c(boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.io.BufferedReader bufferedReader;
        if (z17) {
            str = "/sys/block/mmcblk0/device/";
            str2 = "MMC";
        } else {
            str = "/sys/block/mmcblk1/device/";
            str2 = "SD";
        }
        java.io.BufferedReader bufferedReader2 = null;
        try {
            try {
                java.io.BufferedReader bufferedReader3 = new java.io.BufferedReader(new java.io.FileReader(str.concat("type")));
                try {
                    java.lang.String readLine = bufferedReader3.readLine();
                    if (readLine != null && readLine.toUpperCase().equals(str2)) {
                        bufferedReader = new java.io.BufferedReader(new java.io.FileReader(str.concat("cid")));
                        try {
                            java.lang.String readLine2 = bufferedReader.readLine();
                            if (readLine2 != null) {
                                java.lang.String trim = readLine2.trim();
                                try {
                                    bufferedReader3.close();
                                } catch (java.io.IOException unused) {
                                }
                                try {
                                    bufferedReader.close();
                                } catch (java.io.IOException unused2) {
                                }
                                return trim;
                            }
                            bufferedReader2 = bufferedReader;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            bufferedReader2 = bufferedReader3;
                            try {
                                ot5.g.d("DeviceUtil", "getSDCid(): " + th);
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (java.io.IOException unused3) {
                                    }
                                }
                                if (bufferedReader == null) {
                                    return "";
                                }
                                bufferedReader.close();
                                return "";
                            } finally {
                            }
                        }
                    }
                    try {
                        bufferedReader3.close();
                    } catch (java.io.IOException unused4) {
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    bufferedReader = null;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                bufferedReader = null;
            }
            if (bufferedReader2 == null) {
                return "";
            }
            bufferedReader2.close();
            return "";
        } catch (java.io.IOException unused5) {
            return "";
        }
    }
}
