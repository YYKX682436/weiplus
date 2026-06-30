package com.p314xaae8f345.mm.p930xc01b152a;

/* renamed from: com.tencent.mm.mm7zip.SevenZip */
/* loaded from: classes13.dex */
public class C11077x5bf56bf4 {

    /* renamed from: PROPERTY_BUILD_REF */
    private static final java.lang.String f32414x7f0ba518 = "build.ref";

    /* renamed from: PROPERTY_SEVENZIPJBINDING_LIB_HASH */
    private static final java.lang.String f32415x4fead42e = "lib.%s.hash";

    /* renamed from: PROPERTY_SEVENZIPJBINDING_LIB_NAME */
    private static final java.lang.String f32416x4fed8dab = "lib.%s.name";

    /* renamed from: SEVENZIPJBINDING_LIB_PROPERTIES */
    private static final java.lang.String f32417xf860cebd = "build.ref=000000000000\n\nlib.1.name=lib7-Zip-JBinding.so\nlib.1.hash=0000000000000000000000000000000000000000\n";

    /* renamed from: SEVENZIPJBINDING_LIB_PROPERTIES_FILENAME */
    private static final java.lang.String f32418xef1ee949 = "sevenzipjbinding-lib.properties";

    /* renamed from: SEVENZIPJBINDING_MANIFEST_MF */
    public static final java.lang.String f32419x769ffc39 = "Manifest-Version: 1.0\nImplementation-Vendor: sevenzipjbind.sf.net\nImplementation-Title: 7-Zip-JBinding native lib (Linux-arm)\nImplementation-Version: 16.02-2.02\nBuilt-By: Boris Brodski\nCMake: 3.3.2\nCreated-By: 1.6.0_33-b03 (Sun Microsystems Inc.)\nBuilt-Date: 2020-01-20 21:44:51Z\n";

    /* renamed from: SEVENZIPJBINDING_PLATFORMS_PROPRETIES_FILENAME */
    private static final java.lang.String f32420x9f63f9de = "/sevenzipjbinding-platforms.properties";

    /* renamed from: SEVENZIPJBINDING_PLATFORM_PROPERTIES */
    private static final java.lang.String f32421xcb3e3f0f = "platform.1=Linux-arm";

    /* renamed from: SEVENZIPJBINDING_VERSION */
    private static final java.lang.String f32422xbae37f48 = "16.02-2.02";

    /* renamed from: SYSTEM_PROPERTY_SEVEN_ZIP_NO_DO_PRIVILEGED_INITIALIZATION */
    private static final java.lang.String f32423xa7b22f2c = "sevenzip.no_doprivileged_initialization";

    /* renamed from: SYSTEM_PROPERTY_TMP */
    private static final java.lang.String f32424x3109179d = "java.io.tmpdir";

    /* renamed from: autoInitializationWillOccur */
    private static boolean f32425x690c87cb = true;

    /* renamed from: availablePlatforms */
    private static java.util.List<java.lang.String> f32426xc8e54d97;

    /* renamed from: initializationSuccessful */
    private static boolean f32427x658ab75a;

    /* renamed from: lastInitializationException */
    private static com.p314xaae8f345.mm.p930xc01b152a.C11079xf16801e4 f32428xe595e819;

    /* renamed from: temporaryArtifacts */
    private static java.io.File[] f32429xad8ae190;

    /* renamed from: usedPlatform */
    private static java.lang.String f32430x2639ab50;

    /* renamed from: _hellAccFlag_ */
    private byte f32431x7f11beae;

    /* renamed from: com.tencent.mm.mm7zip.SevenZip$ArchiveOpenCryptoCallback */
    /* loaded from: classes13.dex */
    public static final class ArchiveOpenCryptoCallback implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11034x4815cb88, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11036xbce10d94 {

        /* renamed from: passwordForOpen */
        private final java.lang.String f32434x76116398;

        public ArchiveOpenCryptoCallback(java.lang.String str) {
            this.f32434x76116398 = str;
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11036xbce10d94
        /* renamed from: cryptoGetTextPassword */
        public java.lang.String mo47568xf3dd865d() {
            return this.f32434x76116398;
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11034x4815cb88
        /* renamed from: setCompleted */
        public void mo47564x8222809(java.lang.Long l17, java.lang.Long l18) {
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11034x4815cb88
        /* renamed from: setTotal */
        public void mo47565x53c29c02(java.lang.Long l17, java.lang.Long l18) {
        }
    }

    /* renamed from: com.tencent.mm.mm7zip.SevenZip$DummyOpenArchiveCallback */
    /* loaded from: classes13.dex */
    public static class DummyOpenArchiveCallback implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11034x4815cb88, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11036xbce10d94 {
        private DummyOpenArchiveCallback() {
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11036xbce10d94
        /* renamed from: cryptoGetTextPassword */
        public java.lang.String mo47568xf3dd865d() {
            throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("No password was provided for opening protected archive.");
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11034x4815cb88
        /* renamed from: setCompleted */
        public void mo47564x8222809(java.lang.Long l17, java.lang.Long l18) {
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11034x4815cb88
        /* renamed from: setTotal */
        public void mo47565x53c29c02(java.lang.Long l17, java.lang.Long l18) {
        }
    }

    /* renamed from: com.tencent.mm.mm7zip.SevenZip$Version */
    /* loaded from: classes13.dex */
    public static class Version {

        /* renamed from: build */
        public int f32435x59bc66e;

        /* renamed from: copyright */
        public java.lang.String f32436x5ac573c7;

        /* renamed from: date */
        public java.lang.String f32437x2eefae;

        /* renamed from: major */
        public int f32438x62db5b9;

        /* renamed from: minor */
        public int f32439x63167b5;

        /* renamed from: version */
        public java.lang.String f32440x14f51cd8;
    }

    private C11077x5bf56bf4() {
    }

    /* renamed from: access$000 */
    public static /* synthetic */ java.lang.String m47646xbbd77af0() {
        return m47678x71fb4980();
    }

    /* renamed from: applyTemporaryArtifacts */
    private static void m47647x8355619e(java.io.File file, java.util.List<java.io.File> list) {
        java.io.File[] fileArr = new java.io.File[list.size() + 1];
        f32429xad8ae190 = fileArr;
        list.toArray(fileArr);
        f32429xad8ae190[r2.length - 1] = file;
    }

    /* renamed from: byteArrayToHex */
    private static java.lang.String m47648x9b7df6ef(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (byte b17 : bArr) {
            sb6.append(java.lang.Integer.toHexString(b17 & 255));
        }
        return sb6.toString();
    }

    /* renamed from: callNativeOpenArchive */
    private static com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 m47649xe0e2cbc3(com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 enumC11029xdd1ddb39, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11038x35e1246e interfaceC11038x35e1246e, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11034x4815cb88 interfaceC11034x4815cb88) {
        if (interfaceC11038x35e1246e != null) {
            return m47680xa138be81(enumC11029xdd1ddb39, interfaceC11038x35e1246e, interfaceC11034x4815cb88);
        }
        throw new java.lang.NullPointerException("SevenZip.callNativeOpenArchive(...): inStream parameter is null");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0045: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:27:0x0045 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[SYNTHETIC] */
    /* renamed from: copyLibraryToFS */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m47650xea61552e(java.io.File r6, java.io.InputStream r7) {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r0 = 65536(0x10000, float:9.1835E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L44
        La:
            int r2 = r7.read(r0)     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L44
            if (r2 <= 0) goto L15
            r3 = 0
            r1.write(r0, r3, r2)     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L44
            goto La
        L15:
            r7.close()     // Catch: java.io.IOException -> L18
        L18:
            r1.close()     // Catch: java.io.IOException -> L1b
        L1b:
            return
        L1c:
            r0 = move-exception
            goto L24
        L1e:
            r6 = move-exception
            goto L46
        L20:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L24:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r3.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "Error initializing SevenZipJBinding native library: can't copy native library out of a resource file to the temporary location: '"
            r3.append(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L44
            r3.append(r6)     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = "'"
            r3.append(r6)     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L44
            r2.<init>(r6, r0)     // Catch: java.lang.Throwable -> L44
            throw r2     // Catch: java.lang.Throwable -> L44
        L44:
            r6 = move-exception
            r0 = r1
        L46:
            r7.close()     // Catch: java.io.IOException -> L49
        L49:
            if (r0 == 0) goto L4e
            r0.close()     // Catch: java.io.IOException -> L4e
        L4e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.m47650xea61552e(java.io.File, java.io.InputStream):void");
    }

    /* renamed from: determineAndSetUsedPlatform */
    private static void m47651xc97917ae(java.lang.String str) {
        if (str == null) {
            f32430x2639ab50 = m47655x9e4ef258();
        } else {
            f32430x2639ab50 = str;
        }
    }

    /* renamed from: ensureLibraryIsInitialized */
    private static void m47652x321e5bad() {
        if (f32425x690c87cb) {
            f32425x690c87cb = false;
            try {
                m47663xce934cfa();
            } catch (com.p314xaae8f345.mm.p930xc01b152a.C11079xf16801e4 e17) {
                f32428xe595e819 = e17;
                throw new java.lang.RuntimeException("SevenZipJBinding couldn't be initialized automaticly using initialization from platform depended JAR and the default temporary directory. Please, make sure the correct 'sevenzipjbinding-<Platform>.jar' file is on the class path or consider initializing SevenZipJBinding manualy using one of the offered initialization methods: 'com.tencent.mm.mm7zip.SevenZip.init*()'", e17);
            }
        }
        if (!f32427x658ab75a) {
            throw new java.lang.RuntimeException("SevenZipJBinding wasn't initialized successfully last time.", f32428xe595e819);
        }
    }

    /* renamed from: getLastInitializationException */
    public static synchronized java.lang.Throwable m47653x6c295ae3() {
        com.p314xaae8f345.mm.p930xc01b152a.C11079xf16801e4 c11079xf16801e4;
        synchronized (com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.class) {
            c11079xf16801e4 = f32428xe595e819;
        }
        return c11079xf16801e4;
    }

    /* renamed from: getOrGenerateBuildRef */
    private static java.lang.String m47654x1ae47dd3(java.util.Properties properties) {
        java.lang.String property = properties.getProperty(f32414x7f0ba518);
        return property == null ? java.lang.Integer.toString(new java.util.Random().nextInt(10000000)) : property;
    }

    /* renamed from: getPlatformBestMatch */
    public static java.lang.String m47655x9e4ef258() {
        java.util.List<java.lang.String> m47656x6a34ae27 = m47656x6a34ae27();
        if (m47656x6a34ae27.size() == 1) {
            return m47656x6a34ae27.get(0);
        }
        java.lang.String property = java.lang.System.getProperty("os.arch");
        java.lang.String str = java.lang.System.getProperty("os.name").split(" ")[0];
        if (m47656x6a34ae27.contains(str + "-" + property)) {
            return str + "-" + property;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Can't find suited platform for os.arch=");
        sb6.append(property);
        sb6.append(", os.name=");
        sb6.append(str);
        sb6.append("... Available list of platforms: ");
        java.util.Iterator<java.lang.String> it = m47656x6a34ae27.iterator();
        while (it.hasNext()) {
            sb6.append(it.next());
            sb6.append(", ");
        }
        sb6.setLength(sb6.length() - 2);
        m47689x22d5abd9(sb6.toString());
        return null;
    }

    /* renamed from: getPlatformList */
    public static synchronized java.util.List<java.lang.String> m47656x6a34ae27() {
        synchronized (com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.class) {
            java.util.List<java.lang.String> list = f32426xc8e54d97;
            if (list != null) {
                return list;
            }
            java.io.InputStream byteArrayInputStream = java.lang.System.getProperty("java.vendor", com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a).equals("The Android Project") ? new java.io.ByteArrayInputStream(f32421xcb3e3f0f.getBytes()) : com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.class.getResourceAsStream(f32420x9f63f9de);
            if (byteArrayInputStream == null) {
                throw new com.p314xaae8f345.mm.p930xc01b152a.C11079xf16801e4("Can not find 7-Zip-JBinding platform property file /sevenzipjbinding-platforms.properties. Make sure the 'sevenzipjbinding-<Platform>.jar' file is on the class path or consider initializing SevenZipJBinding manualy using one of the offered initialization methods: 'com.tencent.mm.mm7zip.SevenZip.init*()'");
            }
            java.util.Properties properties = new java.util.Properties();
            try {
                properties.load(byteArrayInputStream);
            } catch (java.io.IOException e17) {
                m47688x22d5abd9(e17, "Error loading existing property file /sevenzipjbinding-platforms.properties");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i17 = 1;
            while (true) {
                java.lang.String property = properties.getProperty("platform." + i17);
                if (property == null) {
                    f32426xc8e54d97 = arrayList;
                    return arrayList;
                }
                arrayList.add(property);
                i17++;
            }
        }
    }

    /* renamed from: getSevenZipJBindingVersion */
    public static java.lang.String m47657x53b356f3() {
        return f32422xbae37f48;
    }

    /* renamed from: getSevenZipVersion */
    public static com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.Version m47658xeec7c82e() {
        m47652x321e5bad();
        com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.Version version = new com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.Version();
        version.f32438x62db5b9 = m47675x4a51d920();
        version.f32439x63167b5 = m47676x4a558b1c();
        version.f32435x59bc66e = m47672x49bfe9d5();
        version.f32440x14f51cd8 = m47677xe09e027f();
        version.f32437x2eefae = m47674xd0d54367();
        version.f32436x5ac573c7 = m47673xdfcb8bae();
        return version;
    }

    /* renamed from: getTemporaryArtifacts */
    public static synchronized java.io.File[] m47659xc0e74386() {
        java.io.File[] fileArr;
        synchronized (com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.class) {
            fileArr = f32429xad8ae190;
        }
        return fileArr;
    }

    /* renamed from: getUsedPlatform */
    public static synchronized java.lang.String m47660x872c3dc6() {
        java.lang.String str;
        synchronized (com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.class) {
            str = f32430x2639ab50;
        }
        return str;
    }

    /* renamed from: hashMatched */
    private static boolean m47661x704bb436(java.io.File file, java.lang.String str) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA1");
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                try {
                    byte[] bArr = new byte[131072];
                    while (true) {
                        try {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            messageDigest.update(bArr, 0, read);
                        } catch (java.io.IOException e17) {
                            m47688x22d5abd9(e17, "Error reading from library file opened from the temp directory: '" + file.getAbsolutePath() + "'");
                            try {
                                fileInputStream.close();
                            } catch (java.io.IOException unused) {
                            }
                            return false;
                        }
                    }
                    boolean equals = m47648x9b7df6ef(messageDigest.digest()).equals(str.trim().toLowerCase());
                    try {
                    } catch (java.io.IOException e18) {
                        m47688x22d5abd9(e18, "Error closing library file from the temp directory (opened for reading): '" + file.getAbsolutePath() + "'");
                    }
                    return equals;
                } finally {
                    try {
                        fileInputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
            } catch (java.io.IOException e19) {
                m47688x22d5abd9(e19, "Error opening library file from the temp directory for reading: '" + file.getAbsolutePath() + "'");
                return false;
            }
        } catch (java.security.NoSuchAlgorithmException e27) {
            m47688x22d5abd9(e27, "Error initializing SHA1 algorithm");
            return false;
        }
    }

    /* renamed from: initLoadedLibraries */
    public static synchronized void m47662xed7c68e4() {
        synchronized (com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.class) {
            if (f32427x658ab75a) {
                return;
            }
            f32425x690c87cb = false;
            m47679x48ed2097();
        }
    }

    /* renamed from: initSevenZipFromPlatformJAR */
    public static void m47663xce934cfa() {
        m47667xd9964cac(null, null);
    }

    /* renamed from: initSevenZipFromPlatformJARIntern */
    private static synchronized void m47667xd9964cac(java.lang.String str, java.io.File file) {
        synchronized (com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.class) {
            try {
                f32425x690c87cb = false;
                if (f32427x658ab75a) {
                    return;
                }
                m47651xc97917ae(str);
                m47670x87e1767c("MM7Zip");
                m47679x48ed2097();
            } catch (com.p314xaae8f345.mm.p930xc01b152a.C11079xf16801e4 e17) {
                f32428xe595e819 = e17;
                throw e17;
            }
        }
    }

    /* renamed from: isAutoInitializationWillOccur */
    public static synchronized boolean m47668x5e957841() {
        boolean z17;
        synchronized (com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.class) {
            z17 = f32425x690c87cb;
        }
        return z17;
    }

    /* renamed from: isInitializedSuccessfully */
    public static synchronized boolean m47669xe2667211() {
        boolean z17;
        synchronized (com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.class) {
            z17 = f32427x658ab75a;
        }
        return z17;
    }

    /* renamed from: loadNativeLibraries */
    private static void m47670x87e1767c(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/mm7zip/SevenZip", "loadNativeLibraries", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/mm7zip/SevenZip", "loadNativeLibraries", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: nativeCreateArchive */
    private static native void m47671xfcdc014f(com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11085xd4054df4<?> c11085xd4054df4, com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 enumC11029xdd1ddb39);

    /* renamed from: nativeGetVersionBuild */
    private static native int m47672x49bfe9d5();

    /* renamed from: nativeGetVersionCopyright */
    private static native java.lang.String m47673xdfcb8bae();

    /* renamed from: nativeGetVersionDate */
    private static native java.lang.String m47674xd0d54367();

    /* renamed from: nativeGetVersionMajor */
    private static native int m47675x4a51d920();

    /* renamed from: nativeGetVersionMinor */
    private static native int m47676x4a558b1c();

    /* renamed from: nativeGetVersionVersion */
    private static native java.lang.String m47677xe09e027f();

    /* renamed from: nativeInitSevenZipLibrary */
    private static native java.lang.String m47678x71fb4980();

    /* renamed from: nativeInitialization */
    private static void m47679x48ed2097() {
        java.lang.String property = java.lang.System.getProperty(f32423xa7b22f2c);
        final java.lang.String[] strArr = new java.lang.String[1];
        final java.lang.Throwable[] thArr = new java.lang.Throwable[1];
        if (property == null || property.trim().equals("0")) {
            java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.lang.Void>() { // from class: com.tencent.mm.mm7zip.SevenZip.1
                @Override // java.security.PrivilegedAction
                public java.lang.Void run() {
                    try {
                        strArr[0] = com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.m47646xbbd77af0();
                        return null;
                    } catch (java.lang.Throwable th6) {
                        thArr[0] = th6;
                        return null;
                    }
                }
            });
        } else {
            strArr[0] = m47678x71fb4980();
        }
        java.lang.String str = strArr[0];
        if (str == null && thArr[0] == null) {
            f32427x658ab75a = true;
            return;
        }
        if (str == null) {
            str = "No message";
        }
        com.p314xaae8f345.mm.p930xc01b152a.C11079xf16801e4 c11079xf16801e4 = new com.p314xaae8f345.mm.p930xc01b152a.C11079xf16801e4("Error initializing 7-Zip-JBinding: ".concat(str), thArr[0]);
        f32428xe595e819 = c11079xf16801e4;
        throw c11079xf16801e4;
    }

    /* renamed from: nativeOpenArchive */
    private static native com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 m47680xa138be81(com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 enumC11029xdd1ddb39, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11038x35e1246e interfaceC11038x35e1246e, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11034x4815cb88 interfaceC11034x4815cb88);

    /* renamed from: openInArchive */
    public static com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 m47682x9f37b4b3(com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 enumC11029xdd1ddb39, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11038x35e1246e interfaceC11038x35e1246e, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11034x4815cb88 interfaceC11034x4815cb88) {
        m47652x321e5bad();
        if (interfaceC11034x4815cb88 == null) {
            interfaceC11034x4815cb88 = new com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.DummyOpenArchiveCallback();
        }
        if (enumC11029xdd1ddb39 != null) {
            return m47649xe0e2cbc3(enumC11029xdd1ddb39, interfaceC11038x35e1246e, interfaceC11034x4815cb88);
        }
        return m47649xe0e2cbc3(null, interfaceC11038x35e1246e, interfaceC11034x4815cb88);
    }

    /* renamed from: openOutArchive */
    public static com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11041x8f29e5e1<com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11050x4c8a6f93> m47684xba72c37e(com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 enumC11029xdd1ddb39) {
        return m47686x883bd030(enumC11029xdd1ddb39);
    }

    /* renamed from: openOutArchive7z */
    public static com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11042x6c47f8c4 m47685xe8cfe321() {
        return (com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11042x6c47f8c4) m47686x883bd030(com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39.SEVEN_ZIP);
    }

    /* renamed from: openOutArchiveIntern */
    private static com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11085xd4054df4<?> m47686x883bd030(com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 enumC11029xdd1ddb39) {
        m47652x321e5bad();
        if (!enumC11029xdd1ddb39.m47551x3bec2bf0()) {
            throw new java.lang.IllegalStateException("Archive format '" + enumC11029xdd1ddb39 + "' doesn't support archive creation.");
        }
        try {
            com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11085xd4054df4<?> newInstance = enumC11029xdd1ddb39.m47550xba224bdc().newInstance();
            m47671xfcdc014f(newInstance, enumC11029xdd1ddb39);
            return newInstance;
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalStateException("Internal error: Can't create new instance of the class " + enumC11029xdd1ddb39.m47550xba224bdc() + " using default constructor.");
        }
    }

    /* renamed from: openOutArchiveZip */
    public static com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11043x1cb7a180 m47687x312d02c3() {
        return (com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11043x1cb7a180) m47686x883bd030(com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39.ZIP);
    }

    /* renamed from: throwInitException */
    private static void m47689x22d5abd9(java.lang.String str) {
        m47688x22d5abd9(null, str);
    }

    /* renamed from: initSevenZipFromPlatformJAR */
    public static void m47664xce934cfa(java.io.File file) {
        m47667xd9964cac(null, file);
    }

    /* renamed from: throwInitException */
    private static void m47688x22d5abd9(java.lang.Exception exc, java.lang.String str) {
        throw new com.p314xaae8f345.mm.p930xc01b152a.C11079xf16801e4("Error loading SevenZipJBinding native library into JVM: " + str + " [You may also try different SevenZipJBinding initialization methods 'com.tencent.mm.mm7zip.SevenZip.init*()' in order to solve this problem] ", exc);
    }

    /* renamed from: initSevenZipFromPlatformJAR */
    public static void m47666xce934cfa(java.lang.String str, java.io.File file) {
        m47667xd9964cac(str, file);
    }

    /* renamed from: initSevenZipFromPlatformJAR */
    public static void m47665xce934cfa(java.lang.String str) {
        m47667xd9964cac(str, null);
    }

    /* renamed from: openInArchive */
    public static com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 m47683x9f37b4b3(com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 enumC11029xdd1ddb39, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11038x35e1246e interfaceC11038x35e1246e, java.lang.String str) {
        m47652x321e5bad();
        if (str == null) {
            return m47681x9f37b4b3(enumC11029xdd1ddb39, interfaceC11038x35e1246e);
        }
        return m47649xe0e2cbc3(enumC11029xdd1ddb39, interfaceC11038x35e1246e, new com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.ArchiveOpenCryptoCallback(str));
    }

    /* renamed from: openInArchive */
    public static com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 m47681x9f37b4b3(com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39 enumC11029xdd1ddb39, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11038x35e1246e interfaceC11038x35e1246e) {
        m47652x321e5bad();
        return m47649xe0e2cbc3(enumC11029xdd1ddb39, interfaceC11038x35e1246e, new com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.DummyOpenArchiveCallback());
    }
}
