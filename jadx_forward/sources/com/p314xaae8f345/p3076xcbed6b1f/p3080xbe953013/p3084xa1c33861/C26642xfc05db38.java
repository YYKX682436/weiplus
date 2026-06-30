package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.ShareTinkerInternals */
/* loaded from: classes13.dex */
public class C26642xfc05db38 {

    /* renamed from: PATCH_PROCESS_NAME */
    private static final java.lang.String f55925x7cb15d32 = ":patch";

    /* renamed from: SAFEMODE_COUNT_REC_PREFIX */
    private static final java.lang.String f55926xfe53a840 = "safemode_count_rec_";
    private static final java.lang.String TAG = "Tinker.TinkerInternals";

    /* renamed from: VM_IS_ART */
    private static final boolean f55927x30775836 = m104755x7b9a1122(java.lang.System.getProperty("java.vm.version"));

    /* renamed from: VM_IS_JIT */
    private static final boolean f55928x307778e8 = m104757x495f48b1();

    /* renamed from: isPatchProcess */
    private static java.lang.Boolean f55931x26fd2751 = null;

    /* renamed from: isARKHotRunning */
    private static java.lang.Boolean f55930xc6d019a2 = null;

    /* renamed from: processName */
    private static final java.lang.String[] f55932xc0f3d9a = {null};

    /* renamed from: tinkerID */
    private static java.lang.String f55933x863f287a = null;

    /* renamed from: currentInstructionSet */
    private static java.lang.String f55929x8cea66cd = null;

    /* renamed from: changeTestDexToClassN */
    public static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 m104721xf5db5ba6(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 c26632x3b07ed99, int i17) {
        java.lang.String str;
        if (!c26632x3b07ed99.f55762x3abe52d3.startsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55726x3eeb7ee0)) {
            return null;
        }
        if (i17 != 1) {
            str = "classes" + i17 + com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99;
        } else {
            str = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55634xb1d49d29;
        }
        return new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99(str, c26632x3b07ed99.f55761x346425, c26632x3b07ed99.f55755xf2f17c9a, c26632x3b07ed99.f55754xf2f170e2, c26632x3b07ed99.f55756x635e8322, c26632x3b07ed99.f55760x406a9b24, c26632x3b07ed99.f55759x32a83d01, c26632x3b07ed99.f55757x5d084e5a);
    }

    /* renamed from: checkPackageAndTinkerFlag */
    public static int m104722x46f84ee4(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429 c26641x1cdfa429, int i17) {
        if (m104748xb7af0c69(i17)) {
            return 0;
        }
        java.util.HashMap<java.lang.String, java.lang.String> m104717xa17536fe = c26641x1cdfa429.m104717xa17536fe();
        if (!m104750x844b76c6(i17) && m104717xa17536fe.containsKey(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55635xaba64d2e)) {
            return -9;
        }
        if (m104751xfad6425d(i17) || !m104717xa17536fe.containsKey(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55724x80855553)) {
            return (m104752xcc6926bf(i17) || !m104717xa17536fe.containsKey(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55717xce592a77)) ? 0 : -9;
        }
        return -9;
    }

    /* renamed from: checkSignatureAndTinkerID */
    public static int m104723x268370c1(android.content.Context context, java.io.File file, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429 c26641x1cdfa429) {
        if (!c26641x1cdfa429.m104719x3bfad524(file)) {
            return -1;
        }
        java.lang.String m104731xe53d833f = m104731xe53d833f(context);
        if (m104731xe53d833f == null) {
            return -5;
        }
        java.util.HashMap<java.lang.String, java.lang.String> m104718x5ae6f2bb = c26641x1cdfa429.m104718x5ae6f2bb();
        if (m104718x5ae6f2bb == null) {
            return -2;
        }
        java.lang.String str = m104718x5ae6f2bb.get(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55733xe7bec63b);
        if (str == null) {
            return -6;
        }
        if (m104731xe53d833f.equals(str)) {
            return 0;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "tinkerId in patch is not matched with the one in base pack, base: %s, patch: %s.", m104731xe53d833f, str);
        return -7;
    }

    /* renamed from: checkTinkerPackage */
    public static int m104724x63bc27ff(android.content.Context context, int i17, java.io.File file, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429 c26641x1cdfa429) {
        int m104723x268370c1 = m104723x268370c1(context, file, c26641x1cdfa429);
        return m104723x268370c1 == 0 ? m104722x46f84ee4(c26641x1cdfa429, i17) : m104723x268370c1;
    }

    /* renamed from: cleanPatch */
    public static void m104725xcca2ff7f(android.content.Context context) {
        if (context == null) {
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("context is null");
        }
        java.io.File m104679xac1dbbfb = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(context);
        if (!m104679xac1dbbfb.exists()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(TAG, new java.lang.Throwable(), "try to clean patch while there're not any applied patches.", new java.lang.Object[0]);
            return;
        }
        java.io.File m104680x3b463ffc = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104680x3b463ffc(m104679xac1dbbfb.getAbsolutePath());
        if (!m104680x3b463ffc.exists()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(TAG, new java.lang.Throwable(), "try to clean patch while patch info file does not exist.", new java.lang.Object[0]);
            return;
        }
        java.io.File m104681x4bb4abc7 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104681x4bb4abc7(m104679xac1dbbfb.getAbsolutePath());
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17 m104696x91bd9b4d = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17.m104696x91bd9b4d(m104680x3b463ffc, m104681x4bb4abc7);
        if (m104696x91bd9b4d != null) {
            m104696x91bd9b4d.f55906x3867f718 = "";
            m104696x91bd9b4d.f55910x7d3d13d7 = "";
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17.m104698x2e66fab7(m104680x3b463ffc, m104696x91bd9b4d, m104681x4bb4abc7);
        } else {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(TAG, new java.lang.Throwable(), "fail to get patchInfo.", new java.lang.Object[0]);
        }
        m104726xcd396f71(m104679xac1dbbfb, null);
    }

    /* renamed from: cleanPatchDirectoryWithGuard */
    public static void m104726xcd396f71(java.io.File file, java.lang.String str) {
        java.io.File m104675xb39f963e = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104675xb39f963e(file.getAbsolutePath());
        java.io.File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (java.io.File file2 : listFiles) {
                java.lang.String name = file2.getName();
                if (file2.isDirectory() && name.startsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55701x7784d7e2) && !name.equals(str)) {
                    java.io.File file3 = new java.io.File(m104675xb39f963e, name);
                    if (!file3.exists()) {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "clean broken patch directory %s", file2.getAbsolutePath());
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104669xea9e22e2(file2);
                    }
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26628x41f2e85 m104615xf0907b13 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26628x41f2e85.m104615xf0907b13(file3);
                    boolean z17 = m104615xf0907b13 != null;
                    if (z17) {
                        try {
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "clean obsolete patch directory %s", file2.getAbsolutePath());
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104669xea9e22e2(file2);
                        } catch (java.lang.Throwable th6) {
                            try {
                                throw th6;
                            } catch (java.lang.Throwable th7) {
                                if (m104615xf0907b13 != null) {
                                    try {
                                        m104615xf0907b13.close();
                                    } catch (java.lang.Throwable th8) {
                                        th6.addSuppressed(th8);
                                    }
                                }
                                throw th7;
                            }
                        }
                    }
                    if (m104615xf0907b13 != null) {
                        m104615xf0907b13.close();
                    }
                    if (z17) {
                        file3.delete();
                    } else {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "skip cleaning used patch directory %s", file2.getAbsolutePath());
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* renamed from: fastGetPatchPackageMeta */
    public static java.util.Properties m104727x23e4977d(java.io.File file) {
        java.util.zip.ZipFile zipFile;
        java.io.InputStream inputStream;
        java.util.zip.ZipFile zipFile2 = null;
        if (file != null && file.isFile()) {
            ?? r47 = (file.length() > 0L ? 1 : (file.length() == 0L ? 0 : -1));
            try {
                if (r47 != 0) {
                    try {
                        zipFile = new java.util.zip.ZipFile(file);
                        try {
                            java.util.zip.ZipEntry entry = zipFile.getEntry(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55700xe0cd69d);
                            if (entry == null) {
                                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "patch meta entry not found", new java.lang.Object[0]);
                                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104667x41231e09(zipFile);
                                return null;
                            }
                            try {
                                inputStream = zipFile.getInputStream(entry);
                                try {
                                    java.util.Properties properties = new java.util.Properties();
                                    properties.load(inputStream);
                                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(inputStream);
                                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104667x41231e09(zipFile);
                                    return properties;
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(inputStream);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                inputStream = null;
                            }
                        } catch (java.io.IOException e17) {
                            e = e17;
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "fastGetPatchPackageMeta exception:" + e.getMessage(), new java.lang.Object[0]);
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104667x41231e09(zipFile);
                            return null;
                        }
                    } catch (java.io.IOException e18) {
                        e = e18;
                        zipFile = null;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104667x41231e09(zipFile2);
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
                zipFile2 = r47;
            }
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "patchFile is illegal", new java.lang.Object[0]);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        if (r2.equals("x86_64") == false) goto L10;
     */
    /* renamed from: getCurrentInstructionSet */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m104728x98963917() {
        /*
            java.lang.String r0 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.f55929x8cea66cd
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 1
            r1 = 0
            java.lang.String r2 = "dalvik.system.VMRuntime"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "getCurrentInstructionSet"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L25
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L25
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L25
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L25
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.f55929x8cea66cd = r2     // Catch: java.lang.Throwable -> L25
            goto Laa
        L25:
            java.lang.String r2 = android.os.Build.CPU_ABI
            r2.getClass()
            int r3 = r2.hashCode()
            java.lang.String r4 = "mips"
            java.lang.String r5 = "x86"
            java.lang.String r6 = "x86_64"
            java.lang.String r7 = "mips64"
            r8 = -1
            switch(r3) {
                case -1073971299: goto L76;
                case -806050265: goto L6f;
                case -738963905: goto L64;
                case 117110: goto L5b;
                case 3351711: goto L52;
                case 145444210: goto L47;
                case 1431565292: goto L3c;
                default: goto L3a;
            }
        L3a:
            r0 = r8
            goto L7e
        L3c:
            java.lang.String r0 = "arm64-v8a"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L45
            goto L3a
        L45:
            r0 = 6
            goto L7e
        L47:
            java.lang.String r0 = "armeabi-v7a"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L50
            goto L3a
        L50:
            r0 = 5
            goto L7e
        L52:
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L59
            goto L3a
        L59:
            r0 = 4
            goto L7e
        L5b:
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L62
            goto L3a
        L62:
            r0 = 3
            goto L7e
        L64:
            java.lang.String r0 = "armeabi"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L6d
            goto L3a
        L6d:
            r0 = 2
            goto L7e
        L6f:
            boolean r3 = r2.equals(r6)
            if (r3 != 0) goto L7e
            goto L3a
        L76:
            boolean r0 = r2.equals(r7)
            if (r0 != 0) goto L7d
            goto L3a
        L7d:
            r0 = r1
        L7e:
            switch(r0) {
                case 0: goto La8;
                case 1: goto La5;
                case 2: goto La0;
                case 3: goto L9d;
                case 4: goto L9a;
                case 5: goto La0;
                case 6: goto L95;
                default: goto L81;
            }
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported abi: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L95:
            java.lang.String r0 = "arm64"
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.f55929x8cea66cd = r0
            goto Laa
        L9a:
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.f55929x8cea66cd = r4
            goto Laa
        L9d:
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.f55929x8cea66cd = r5
            goto Laa
        La0:
            java.lang.String r0 = "arm"
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.f55929x8cea66cd = r0
            goto Laa
        La5:
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.f55929x8cea66cd = r6
            goto Laa
        La8:
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.f55929x8cea66cd = r7
        Laa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getCurrentInstructionSet:"
            r0.<init>(r2)
            java.lang.String r2 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.f55929x8cea66cd
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Tinker.TinkerInternals"
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.d(r2, r0, r1)
            java.lang.String r0 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.f55929x8cea66cd
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104728x98963917():java.lang.String");
    }

    /* renamed from: getCurrentOatMode */
    public static java.lang.String m104729x2bb556e2(android.content.Context context, java.lang.String str) {
        return str.equals(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55624x33afa6b0) ? m104740xbf883707(context) ? "odex" : com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55690xa7e2e32d : str;
    }

    /* renamed from: getExceptionCauseString */
    public static java.lang.String m104730x7c782a81(java.lang.Throwable th6) {
        if (th6 == null) {
            return "";
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.PrintStream printStream = new java.io.PrintStream(byteArrayOutputStream);
        while (true) {
            try {
                java.lang.Throwable cause = th6.getCause();
                if (cause == null) {
                    th6.printStackTrace(printStream);
                    return m104762x2cbbe58c(byteArrayOutputStream.toString());
                }
                th6 = cause;
            } finally {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(printStream);
            }
        }
    }

    /* renamed from: getManifestTinkerID */
    public static java.lang.String m104731xe53d833f(android.content.Context context) {
        java.lang.String str = f55933x863f287a;
        if (str != null) {
            return str;
        }
        try {
            java.lang.Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55733xe7bec63b);
            if (obj != null) {
                f55933x863f287a = java.lang.String.valueOf(obj);
            } else {
                f55933x863f287a = null;
            }
            return f55933x863f287a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "getManifestTinkerID exception:" + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    /* renamed from: getProcessName */
    public static java.lang.String m104732xe5e58464(android.content.Context context) {
        java.lang.String[] strArr = f55932xc0f3d9a;
        if (strArr[0] == null) {
            synchronized (strArr) {
                if (strArr[0] == null) {
                    strArr[0] = m104733x8ab70b41(context);
                }
            }
        }
        java.lang.String str = strArr[0];
        return str != null ? str : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: getProcessNameInternal */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m104733x8ab70b41(android.content.Context r8) {
        /*
            java.lang.String r0 = "getProcessNameInternal parse cmdline exception:"
            r1 = 28
            r2 = 1
            boolean r1 = m104742x33bbb0c9(r1, r2)
            if (r1 == 0) goto L16
            java.lang.String r1 = android.app.Application.getProcessName()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L16
            return r1
        L16:
            r1 = 18
            boolean r1 = m104742x33bbb0c9(r1, r2)
            java.lang.String r3 = "Tinker.TinkerInternals"
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L5c
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = "currentProcessName"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L44
            java.lang.reflect.Method r1 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104704xfb2fc3fa(r1, r6, r7)     // Catch: java.lang.Throwable -> L44
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r1.invoke(r4, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L5c
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L5c
            return r1
        L44:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "getProcessNameInternal reflect activity thread exception:"
            r2.<init>(r6)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(r3, r1, r2)
        L5c:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L89
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L89
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = "/proc/self/cmdline"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L89
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.US_ASCII     // Catch: java.lang.Throwable -> L89
            r2.<init>(r6, r7)     // Catch: java.lang.Throwable -> L89
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L83
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L87
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L87
            if (r0 != 0) goto L83
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(r1)
            return r2
        L83:
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(r1)
            goto La1
        L87:
            r2 = move-exception
            goto L8b
        L89:
            r2 = move-exception
            r1 = r4
        L8b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lef
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> Lef
            r6.append(r0)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> Lef
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lef
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(r3, r0, r2)     // Catch: java.lang.Throwable -> Lef
            goto L83
        La1:
            if (r8 == 0) goto Lee
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> Ld6
            int r1 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r2 = "activity"
            java.lang.Object r8 = r8.getSystemService(r2)     // Catch: java.lang.Throwable -> Ld6
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8     // Catch: java.lang.Throwable -> Ld6
            if (r8 == 0) goto Lee
            java.util.List r8 = r8.getRunningAppProcesses()     // Catch: java.lang.Throwable -> Ld6
            if (r8 == 0) goto Lee
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Ld6
        Lbf:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> Ld6
            if (r2 == 0) goto Lee
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> Ld6
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Throwable -> Ld6
            int r6 = r2.pid     // Catch: java.lang.Throwable -> Ld6
            if (r6 != r0) goto Lbf
            int r6 = r2.uid     // Catch: java.lang.Throwable -> Ld6
            if (r6 != r1) goto Lbf
            java.lang.String r8 = r2.processName     // Catch: java.lang.Throwable -> Ld6
            return r8
        Ld6:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getProcessNameInternal getRunningAppProcesses exception:"
            r0.<init>(r1)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(r3, r8, r0)
        Lee:
            return r4
        Lef:
            r8 = move-exception
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104733x8ab70b41(android.content.Context):java.lang.String");
    }

    /* renamed from: getSafeModeCount */
    public static int m104734x7e090069(android.content.Context context) {
        java.lang.String str = f55926xfe53a840 + m104732xe5e58464(context);
        java.io.DataInputStream dataInputStream = null;
        try {
            java.io.DataInputStream dataInputStream2 = new java.io.DataInputStream(new java.io.FileInputStream(new java.io.File(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(context), str)));
            try {
                java.lang.String readUTF = dataInputStream2.readUTF();
                if (!"safe_mode_count_1.9.15.3".equals(readUTF)) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "getSafeModeCount: key is not equal, expt: %s, actul: %s, return 0 instead.", "safe_mode_count_1.9.15.3", readUTF);
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(dataInputStream2);
                    return 0;
                }
                int readInt = dataInputStream2.readInt();
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "getSafeModeCount: count: %s", java.lang.Integer.valueOf(readInt));
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(dataInputStream2);
                return readInt;
            } catch (java.lang.Throwable unused) {
                dataInputStream = dataInputStream2;
                try {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "getSafeModeCount: recFileName:" + str + " failed, return 0 instead.", new java.lang.Object[0]);
                    return 0;
                } finally {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(dataInputStream);
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    /* renamed from: getTinkerSwitchSPKey */
    private static java.lang.String m104735xd164b6b9(android.content.Context context) {
        java.lang.String m104731xe53d833f = m104731xe53d833f(context);
        if (m104743x83891ddd(m104731xe53d833f)) {
            m104731xe53d833f = "@@";
        }
        return "tinker_enable_1.9.15.3_" + m104731xe53d833f;
    }

    /* renamed from: getTypeString */
    public static java.lang.String m104736x9973bfe1(int i17) {
        switch (i17) {
            case 1:
                return "patch_file";
            case 2:
                return "patch_info";
            case 3:
                return com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55636x75686f6d;
            case 4:
                return "dex_opt";
            case 5:
                return com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428;
            case 6:
                return "resource";
            default:
                return com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
    }

    /* renamed from: is32BitEnv */
    public static boolean m104737x4a4e0f09() {
        java.lang.String m104728x98963917 = m104728x98963917();
        return "arm".equals(m104728x98963917) || "x86".equals(m104728x98963917) || "mips".equals(m104728x98963917);
    }

    /* renamed from: isAfterAndroidO */
    public static boolean m104738x9cf9bcb2() {
        return android.os.Build.VERSION.SDK_INT > 25;
    }

    /* renamed from: isArkHotRuning */
    public static boolean m104739x6e3ebd34() {
        java.lang.Boolean bool = f55930xc6d019a2;
        if (bool != null) {
            return bool.booleanValue();
        }
        f55930xc6d019a2 = java.lang.Boolean.FALSE;
        try {
            java.lang.reflect.Method declaredMethod = java.lang.ClassLoader.getSystemClassLoader().getParent().loadClass("com.huawei.ark.app.ArkApplicationInfo").getDeclaredMethod("isRunningInArk", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            f55930xc6d019a2 = (java.lang.Boolean) declaredMethod.invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException unused) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "class not found exception", new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException unused2) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "illegal access exception", new java.lang.Object[0]);
        } catch (java.lang.IllegalArgumentException unused3) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "illegal argument exception", new java.lang.Object[0]);
        } catch (java.lang.NoSuchMethodException unused4) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "no such method exception", new java.lang.Object[0]);
        } catch (java.lang.SecurityException unused5) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "security exception", new java.lang.Object[0]);
        } catch (java.lang.reflect.InvocationTargetException unused6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "invocation target exception", new java.lang.Object[0]);
        }
        return f55930xc6d019a2.booleanValue();
    }

    /* renamed from: isInMainProcess */
    public static boolean m104740xbf883707(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        java.lang.String str = applicationInfo != null ? applicationInfo.processName : null;
        if (m104743x83891ddd(str)) {
            str = context.getPackageName();
        }
        java.lang.String m104732xe5e58464 = m104732xe5e58464(context);
        if (m104732xe5e58464 == null || m104732xe5e58464.length() == 0) {
            m104732xe5e58464 = "";
        }
        return str.equals(m104732xe5e58464);
    }

    /* renamed from: isInPatchProcess */
    public static boolean m104741x25198e96(android.content.Context context) {
        java.lang.Boolean bool = f55931x26fd2751;
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(m104732xe5e58464(context).endsWith(f55925x7cb15d32));
        f55931x26fd2751 = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: isNewerOrEqualThanVersion */
    public static boolean m104742x33bbb0c9(int i17, boolean z17) {
        if (!z17) {
            return android.os.Build.VERSION.SDK_INT >= i17;
        }
        int i18 = android.os.Build.VERSION.SDK_INT;
        return i18 >= i17 || (i18 == i17 - 1 && android.os.Build.VERSION.PREVIEW_SDK_INT > 0);
    }

    /* renamed from: isNullOrNil */
    public static boolean m104743x83891ddd(java.lang.String str) {
        return str == null || str.length() <= 0;
    }

    /* renamed from: isOlderOrEqualThanVersion */
    public static boolean m104744x3c3b2bd0(int i17, boolean z17) {
        if (!z17) {
            return android.os.Build.VERSION.SDK_INT <= i17;
        }
        int i18 = android.os.Build.VERSION.SDK_INT;
        return i18 <= i17 || (i18 == i17 - 1 && android.os.Build.VERSION.PREVIEW_SDK_INT > 0);
    }

    /* renamed from: isSystemOTA */
    public static boolean m104745x898a2063(java.lang.String str) {
        java.lang.String str2 = android.os.Build.FINGERPRINT;
        if (str == null || str.equals("") || str2 == null || str2.equals("")) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.d(TAG, "fingerprint empty:" + str + ",current:" + str2, new java.lang.Object[0]);
            return false;
        }
        if (str.equals(str2)) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.d(TAG, "same fingerprint:".concat(str2), new java.lang.Object[0]);
            return false;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.d(TAG, "system OTA,fingerprint not equal:" + str + "," + str2, new java.lang.Object[0]);
        return true;
    }

    /* renamed from: isTinkerEnableWithSharedPreferences */
    public static boolean m104746x7b8798c1(android.content.Context context) {
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55740xd69e5586, 4).getBoolean(m104735xd164b6b9(context), true);
    }

    /* renamed from: isTinkerEnabled */
    public static boolean m104747x96001e18(int i17) {
        return i17 != 0;
    }

    /* renamed from: isTinkerEnabledAll */
    public static boolean m104748xb7af0c69(int i17) {
        return i17 == 15;
    }

    /* renamed from: isTinkerEnabledForArkHot */
    public static boolean m104749x4566a684(int i17) {
        return (i17 & 8) != 0;
    }

    /* renamed from: isTinkerEnabledForDex */
    public static boolean m104750x844b76c6(int i17) {
        return (i17 & 1) != 0;
    }

    /* renamed from: isTinkerEnabledForNativeLib */
    public static boolean m104751xfad6425d(int i17) {
        return (i17 & 2) != 0;
    }

    /* renamed from: isTinkerEnabledForResource */
    public static boolean m104752xcc6926bf(int i17) {
        return (i17 & 4) != 0;
    }

    /* renamed from: isVersionInRange */
    public static boolean m104753x210a0aea(int i17, int i18, boolean z17) {
        return m104742x33bbb0c9(i17, z17) && m104744x3c3b2bd0(i18, z17);
    }

    /* renamed from: isVmArt */
    public static boolean m104754x7b9a1122() {
        return true;
    }

    /* renamed from: isVmJit */
    public static boolean m104756x7b9a31d4() {
        return false;
    }

    /* renamed from: isVmJitInternal */
    private static boolean m104757x495f48b1() {
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.os.SystemProperties").getDeclaredMethod("get", java.lang.String.class);
            java.lang.String str = (java.lang.String) declaredMethod.invoke(null, "dalvik.vm.usejit");
            java.lang.String str2 = (java.lang.String) declaredMethod.invoke(null, "dalvik.vm.usejitprofiles");
            if (!m104743x83891ddd(str) && m104743x83891ddd(str2)) {
                if (str.equals("true")) {
                    return true;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "isVmJitInternal ex:" + th6, new java.lang.Object[0]);
        }
        return false;
    }

    /* renamed from: killAllOtherProcess */
    public static void m104758xa8221e42(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.uid == android.os.Process.myUid() && runningAppProcessInfo.pid != android.os.Process.myPid()) {
                android.os.Process.killProcess(runningAppProcessInfo.pid);
            }
        }
    }

    /* renamed from: killProcessExceptMain */
    public static void m104759x8758b283(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.uid == android.os.Process.myUid() && !runningAppProcessInfo.processName.equals(context.getPackageName())) {
                android.os.Process.killProcess(runningAppProcessInfo.pid);
            }
        }
    }

    /* renamed from: setSafeModeCount */
    public static void m104760x10df66dd(android.content.Context context, int i17) {
        java.lang.String str = f55926xfe53a840 + m104732xe5e58464(context);
        java.io.File file = new java.io.File(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(context), str);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        java.io.DataOutputStream dataOutputStream = null;
        try {
            java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(new java.io.FileOutputStream(file));
            try {
                dataOutputStream2.writeUTF("safe_mode_count_1.9.15.3");
                dataOutputStream2.writeInt(i17);
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "setSafeModeCount: count: %s", java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(dataOutputStream2);
            } catch (java.lang.Throwable unused) {
                dataOutputStream = dataOutputStream2;
                try {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "setSafeModeCount: recFileName:" + str + " failed, return 0 instead.", new java.lang.Object[0]);
                } finally {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(dataOutputStream);
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    /* renamed from: setTinkerDisableWithSharedPreferences */
    public static void m104761xd655e5e6(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55740xd69e5586, 4);
        sharedPreferences.edit().putBoolean(m104735xd164b6b9(context), false).commit();
    }

    /* renamed from: toVisualString */
    public static java.lang.String m104762x2cbbe58c(java.lang.String str) {
        char[] charArray;
        boolean z17;
        if (str == null || (charArray = str.toCharArray()) == null) {
            return null;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= charArray.length) {
                z17 = false;
                break;
            }
            if (charArray[i17] > 127) {
                charArray[i17] = 0;
                z17 = true;
                break;
            }
            i17++;
        }
        return z17 ? new java.lang.String(charArray, 0, i17) : str;
    }

    /* renamed from: isVmArt */
    private static boolean m104755x7b9a1122(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(matcher.group(1));
            return parseInt > 2 || (parseInt == 2 && java.lang.Integer.parseInt(matcher.group(2)) >= 1);
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }
}
