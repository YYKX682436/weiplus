package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class o7 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f274439a = {"vfat", "exfat", "fuse", "sdcardfs"};

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f274440b = {"/mnt/secure", "/mnt/asec", "/mnt/obb", "/dev/mapper", "/data/"};

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f274441c = {"/dev/block/vold"};

    public static java.lang.String a(java.lang.String str) {
        java.lang.String str2 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        java.util.ArrayList d17 = d();
        java.util.Iterator it = d17.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n7 n7Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) it.next();
            if (str.equals(n7Var.f274409b)) {
                str2 = n7Var.f274410c;
                break;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdcardUtil", "getFileSystem[%s] is [%s]", str, str2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !str.contains("emulated")) {
            return str2;
        }
        java.lang.String substring = str.substring(str.lastIndexOf(47) + 1);
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(substring, -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdcardUtil", "getFileSystem multiuser uid[%s][%d]", substring, java.lang.Integer.valueOf(P));
        if (P == -1) {
            return str2;
        }
        java.lang.String substring2 = str.substring(0, (str.length() - substring.length()) - 1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(substring2)) {
            return str2;
        }
        java.util.Iterator it6 = d17.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n7 n7Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) it6.next();
            if (substring2.equals(n7Var2.f274409b)) {
                java.lang.String str3 = n7Var2.f274410c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdcardUtil", "getFileSystem[%s] fix[%s] is [%s]", str, substring2, str3);
                return str3;
            }
        }
        return str2;
    }

    public static java.util.ArrayList b() {
        boolean z17;
        boolean z18;
        java.util.ArrayList d17 = d();
        int size = d17.size();
        java.util.List asList = java.util.Arrays.asList(f274439a);
        java.util.List asList2 = java.util.Arrays.asList(f274440b);
        java.util.List asList3 = java.util.Arrays.asList(f274441c);
        int i17 = size - 1;
        while (true) {
            boolean z19 = false;
            if (i17 < 0) {
                break;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n7 n7Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) d17.get(i17);
            if (asList.contains(n7Var.f274410c)) {
                java.util.Iterator it = asList2.iterator();
                boolean z27 = false;
                while (it.hasNext()) {
                    z27 |= n7Var.f274409b.startsWith((java.lang.String) it.next());
                }
                if (z27) {
                    d17.remove(i17);
                } else if (n7Var.f274410c.equals("fuse") || n7Var.f274410c.equals("sdcardfs")) {
                    if (n7Var.f274408a.startsWith("/data/")) {
                        d17.remove(i17);
                    }
                } else if (!n7Var.f274410c.equals("fuse") && !n7Var.f274410c.equals("sdcardfs")) {
                    java.util.Iterator it6 = asList3.iterator();
                    while (it6.hasNext()) {
                        z19 |= n7Var.f274408a.startsWith((java.lang.String) it6.next());
                    }
                    if (!z19) {
                        d17.remove(i17);
                    }
                }
            } else {
                d17.remove(i17);
            }
            i17--;
        }
        java.lang.String path = android.os.Environment.getExternalStorageDirectory().getPath();
        int size2 = d17.size() - 1;
        while (true) {
            if (size2 < 0) {
                z17 = false;
                break;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n7 n7Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) d17.get(size2);
            if (n7Var2.f274409b.equals(path)) {
                d17.remove(size2);
                d17.add(0, n7Var2);
                z17 = true;
                break;
            }
            size2--;
        }
        if (!z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n7 n7Var3 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n7();
            n7Var3.f274409b = path;
            n7Var3.f274410c = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
            n7Var3.f274408a = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
            d17.add(0, n7Var3);
        }
        for (int size3 = d17.size() - 1; size3 >= 0; size3--) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n7 n7Var4 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) d17.get(size3);
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(n7Var4.f274409b);
            if (!r6Var.m() || !r6Var.y()) {
                n7Var4.m77793x9616526c();
                d17.remove(size3);
            }
        }
        for (int size4 = d17.size() - 1; size4 >= 0; size4--) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n7 n7Var5 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) d17.get(size4);
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(n7Var5.f274409b, "test_writable");
            java.io.OutputStream outputStream = null;
            try {
                try {
                    r6Var2.k();
                    outputStream = com.p314xaae8f345.mm.vfs.w6.H(r6Var2);
                    outputStream.write("test".getBytes());
                    outputStream.flush();
                    outputStream.close();
                    z18 = r6Var2.l();
                    try {
                        outputStream.close();
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SdcardUtil", e17, "", new java.lang.Object[0]);
                    }
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdcardUtil", "createNewFile: " + e18.getMessage() + " dir: " + n7Var5.f274409b);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (java.io.IOException e19) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SdcardUtil", e19, "", new java.lang.Object[0]);
                        }
                    }
                    z18 = false;
                }
                n7Var5.f274415h = z18;
                if (!z18) {
                    n7Var5.m77793x9616526c();
                    d17.remove(size4);
                }
            } catch (java.lang.Throwable th6) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException e27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SdcardUtil", e27, "", new java.lang.Object[0]);
                    }
                }
                throw th6;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!d17.isEmpty()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n7 n7Var6 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) d17.remove(0);
            for (int size5 = d17.size() - 1; size5 >= 0; size5--) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n7 n7Var7 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) d17.get(size5);
                if (n7Var6.f274408a.equals(n7Var7.f274408a)) {
                    d17.remove(size5);
                    if (!n7Var6.f274415h && n7Var7.f274415h) {
                        n7Var6 = n7Var7;
                    }
                }
            }
            arrayList.add(n7Var6);
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            e((com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) it7.next());
        }
        d17.clear();
        while (!arrayList.isEmpty()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n7 n7Var8 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) arrayList.remove(0);
            d17.add(n7Var8);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n7 n7Var9 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) arrayList.get(size6);
                if (n7Var8.m77792xb2c87fbf(n7Var9)) {
                    n7Var8.m77793x9616526c();
                    n7Var9.m77793x9616526c();
                    arrayList.remove(size6);
                }
            }
        }
        return d17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f0, code lost:
    
        if (r6.f274413f >= r7.f274413f) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.o7.c():boolean");
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0082: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:38:0x0082 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList d() {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.SdcardUtil"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            com.tencent.mm.vfs.z6 r6 = new com.tencent.mm.vfs.z6     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            java.lang.String r7 = "/proc/mounts"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66
        L17:
            java.lang.String r4 = r5.readLine()     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            if (r4 == 0) goto L57
            java.lang.String r6 = "\\s+"
            java.lang.String[] r6 = r4.split(r6)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            if (r6 == 0) goto L41
            int r7 = r6.length     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            r8 = 3
            if (r7 >= r8) goto L2a
            goto L41
        L2a:
            com.tencent.mm.sdk.platformtools.n7 r4 = new com.tencent.mm.sdk.platformtools.n7     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            r4.<init>()     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            r7 = r6[r3]     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            r4.f274408a = r7     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            r7 = 1
            r7 = r6[r7]     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            r4.f274409b = r7     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            r7 = 2
            r6 = r6[r7]     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            r4.f274410c = r6     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            r2.add(r4)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            goto L17
        L41:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            r6.<init>()     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            java.lang.String r7 = "splite failed for line: "
            r6.append(r7)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            r6.append(r4)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r4)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L81
            goto L17
        L57:
            r5.close()     // Catch: java.io.IOException -> L5b
            goto L80
        L5b:
            r4 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r4, r0, r3)
            goto L80
        L62:
            r4 = move-exception
            goto L6a
        L64:
            r2 = move-exception
            goto L83
        L66:
            r5 = move-exception
            r9 = r5
            r5 = r4
            r4 = r9
        L6a:
            java.lang.String r6 = "parseProcMounts"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L81
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r6, r4)     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L80
            r5.close()     // Catch: java.io.IOException -> L7a
            goto L80
        L7a:
            r4 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r4, r0, r3)
        L80:
            return r2
        L81:
            r2 = move-exception
            r4 = r5
        L83:
            if (r4 == 0) goto L8f
            r4.close()     // Catch: java.io.IOException -> L89
            goto L8f
        L89:
            r4 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r4, r0, r3)
        L8f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.o7.d():java.util.ArrayList");
    }

    public static void e(com.p314xaae8f345.mm.sdk.p2603x2137b148.n7 n7Var) {
        try {
            android.os.StatFs statFs = new android.os.StatFs(n7Var.f274409b);
            n7Var.f274414g = statFs.getBlockSize();
            n7Var.f274413f = statFs.getAvailableBlocks();
            n7Var.f274411d = statFs.getBlockCount();
            n7Var.f274412e = statFs.getFreeBlocks();
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdcardUtil", "statFsForStatMountParse", e17);
        }
    }
}
