package com.tencent.mm.mm7zip;

/* loaded from: classes13.dex */
public class SevenZip {
    private static final java.lang.String PROPERTY_BUILD_REF = "build.ref";
    private static final java.lang.String PROPERTY_SEVENZIPJBINDING_LIB_HASH = "lib.%s.hash";
    private static final java.lang.String PROPERTY_SEVENZIPJBINDING_LIB_NAME = "lib.%s.name";
    private static final java.lang.String SEVENZIPJBINDING_LIB_PROPERTIES = "build.ref=000000000000\n\nlib.1.name=lib7-Zip-JBinding.so\nlib.1.hash=0000000000000000000000000000000000000000\n";
    private static final java.lang.String SEVENZIPJBINDING_LIB_PROPERTIES_FILENAME = "sevenzipjbinding-lib.properties";
    public static final java.lang.String SEVENZIPJBINDING_MANIFEST_MF = "Manifest-Version: 1.0\nImplementation-Vendor: sevenzipjbind.sf.net\nImplementation-Title: 7-Zip-JBinding native lib (Linux-arm)\nImplementation-Version: 16.02-2.02\nBuilt-By: Boris Brodski\nCMake: 3.3.2\nCreated-By: 1.6.0_33-b03 (Sun Microsystems Inc.)\nBuilt-Date: 2020-01-20 21:44:51Z\n";
    private static final java.lang.String SEVENZIPJBINDING_PLATFORMS_PROPRETIES_FILENAME = "/sevenzipjbinding-platforms.properties";
    private static final java.lang.String SEVENZIPJBINDING_PLATFORM_PROPERTIES = "platform.1=Linux-arm";
    private static final java.lang.String SEVENZIPJBINDING_VERSION = "16.02-2.02";
    private static final java.lang.String SYSTEM_PROPERTY_SEVEN_ZIP_NO_DO_PRIVILEGED_INITIALIZATION = "sevenzip.no_doprivileged_initialization";
    private static final java.lang.String SYSTEM_PROPERTY_TMP = "java.io.tmpdir";
    private static boolean autoInitializationWillOccur = true;
    private static java.util.List<java.lang.String> availablePlatforms;
    private static boolean initializationSuccessful;
    private static com.tencent.mm.mm7zip.SevenZipNativeInitializationException lastInitializationException;
    private static java.io.File[] temporaryArtifacts;
    private static java.lang.String usedPlatform;
    private byte _hellAccFlag_;

    /* loaded from: classes13.dex */
    public static final class ArchiveOpenCryptoCallback implements com.tencent.mm.mm7zip.IArchiveOpenCallback, com.tencent.mm.mm7zip.ICryptoGetTextPassword {
        private final java.lang.String passwordForOpen;

        public ArchiveOpenCryptoCallback(java.lang.String str) {
            this.passwordForOpen = str;
        }

        @Override // com.tencent.mm.mm7zip.ICryptoGetTextPassword
        public java.lang.String cryptoGetTextPassword() {
            return this.passwordForOpen;
        }

        @Override // com.tencent.mm.mm7zip.IArchiveOpenCallback
        public void setCompleted(java.lang.Long l17, java.lang.Long l18) {
        }

        @Override // com.tencent.mm.mm7zip.IArchiveOpenCallback
        public void setTotal(java.lang.Long l17, java.lang.Long l18) {
        }
    }

    /* loaded from: classes13.dex */
    public static class DummyOpenArchiveCallback implements com.tencent.mm.mm7zip.IArchiveOpenCallback, com.tencent.mm.mm7zip.ICryptoGetTextPassword {
        private DummyOpenArchiveCallback() {
        }

        @Override // com.tencent.mm.mm7zip.ICryptoGetTextPassword
        public java.lang.String cryptoGetTextPassword() {
            throw new com.tencent.mm.mm7zip.SevenZipException("No password was provided for opening protected archive.");
        }

        @Override // com.tencent.mm.mm7zip.IArchiveOpenCallback
        public void setCompleted(java.lang.Long l17, java.lang.Long l18) {
        }

        @Override // com.tencent.mm.mm7zip.IArchiveOpenCallback
        public void setTotal(java.lang.Long l17, java.lang.Long l18) {
        }
    }

    /* loaded from: classes13.dex */
    public static class Version {
        public int build;
        public java.lang.String copyright;
        public java.lang.String date;
        public int major;
        public int minor;
        public java.lang.String version;
    }

    private SevenZip() {
    }

    public static /* synthetic */ java.lang.String access$000() {
        return nativeInitSevenZipLibrary();
    }

    private static void applyTemporaryArtifacts(java.io.File file, java.util.List<java.io.File> list) {
        java.io.File[] fileArr = new java.io.File[list.size() + 1];
        temporaryArtifacts = fileArr;
        list.toArray(fileArr);
        temporaryArtifacts[r2.length - 1] = file;
    }

    private static java.lang.String byteArrayToHex(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (byte b17 : bArr) {
            sb6.append(java.lang.Integer.toHexString(b17 & 255));
        }
        return sb6.toString();
    }

    private static com.tencent.mm.mm7zip.IInArchive callNativeOpenArchive(com.tencent.mm.mm7zip.ArchiveFormat archiveFormat, com.tencent.mm.mm7zip.IInStream iInStream, com.tencent.mm.mm7zip.IArchiveOpenCallback iArchiveOpenCallback) {
        if (iInStream != null) {
            return nativeOpenArchive(archiveFormat, iInStream, iArchiveOpenCallback);
        }
        throw new java.lang.NullPointerException("SevenZip.callNativeOpenArchive(...): inStream parameter is null");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0045: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:27:0x0045 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void copyLibraryToFS(java.io.File r6, java.io.InputStream r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mm7zip.SevenZip.copyLibraryToFS(java.io.File, java.io.InputStream):void");
    }

    private static void determineAndSetUsedPlatform(java.lang.String str) {
        if (str == null) {
            usedPlatform = getPlatformBestMatch();
        } else {
            usedPlatform = str;
        }
    }

    private static void ensureLibraryIsInitialized() {
        if (autoInitializationWillOccur) {
            autoInitializationWillOccur = false;
            try {
                initSevenZipFromPlatformJAR();
            } catch (com.tencent.mm.mm7zip.SevenZipNativeInitializationException e17) {
                lastInitializationException = e17;
                throw new java.lang.RuntimeException("SevenZipJBinding couldn't be initialized automaticly using initialization from platform depended JAR and the default temporary directory. Please, make sure the correct 'sevenzipjbinding-<Platform>.jar' file is on the class path or consider initializing SevenZipJBinding manualy using one of the offered initialization methods: 'com.tencent.mm.mm7zip.SevenZip.init*()'", e17);
            }
        }
        if (!initializationSuccessful) {
            throw new java.lang.RuntimeException("SevenZipJBinding wasn't initialized successfully last time.", lastInitializationException);
        }
    }

    public static synchronized java.lang.Throwable getLastInitializationException() {
        com.tencent.mm.mm7zip.SevenZipNativeInitializationException sevenZipNativeInitializationException;
        synchronized (com.tencent.mm.mm7zip.SevenZip.class) {
            sevenZipNativeInitializationException = lastInitializationException;
        }
        return sevenZipNativeInitializationException;
    }

    private static java.lang.String getOrGenerateBuildRef(java.util.Properties properties) {
        java.lang.String property = properties.getProperty(PROPERTY_BUILD_REF);
        return property == null ? java.lang.Integer.toString(new java.util.Random().nextInt(10000000)) : property;
    }

    public static java.lang.String getPlatformBestMatch() {
        java.util.List<java.lang.String> platformList = getPlatformList();
        if (platformList.size() == 1) {
            return platformList.get(0);
        }
        java.lang.String property = java.lang.System.getProperty("os.arch");
        java.lang.String str = java.lang.System.getProperty("os.name").split(" ")[0];
        if (platformList.contains(str + "-" + property)) {
            return str + "-" + property;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Can't find suited platform for os.arch=");
        sb6.append(property);
        sb6.append(", os.name=");
        sb6.append(str);
        sb6.append("... Available list of platforms: ");
        java.util.Iterator<java.lang.String> it = platformList.iterator();
        while (it.hasNext()) {
            sb6.append(it.next());
            sb6.append(", ");
        }
        sb6.setLength(sb6.length() - 2);
        throwInitException(sb6.toString());
        return null;
    }

    public static synchronized java.util.List<java.lang.String> getPlatformList() {
        synchronized (com.tencent.mm.mm7zip.SevenZip.class) {
            java.util.List<java.lang.String> list = availablePlatforms;
            if (list != null) {
                return list;
            }
            java.io.InputStream byteArrayInputStream = java.lang.System.getProperty("java.vendor", com.eclipsesource.mmv8.Platform.UNKNOWN).equals("The Android Project") ? new java.io.ByteArrayInputStream(SEVENZIPJBINDING_PLATFORM_PROPERTIES.getBytes()) : com.tencent.mm.mm7zip.SevenZip.class.getResourceAsStream(SEVENZIPJBINDING_PLATFORMS_PROPRETIES_FILENAME);
            if (byteArrayInputStream == null) {
                throw new com.tencent.mm.mm7zip.SevenZipNativeInitializationException("Can not find 7-Zip-JBinding platform property file /sevenzipjbinding-platforms.properties. Make sure the 'sevenzipjbinding-<Platform>.jar' file is on the class path or consider initializing SevenZipJBinding manualy using one of the offered initialization methods: 'com.tencent.mm.mm7zip.SevenZip.init*()'");
            }
            java.util.Properties properties = new java.util.Properties();
            try {
                properties.load(byteArrayInputStream);
            } catch (java.io.IOException e17) {
                throwInitException(e17, "Error loading existing property file /sevenzipjbinding-platforms.properties");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i17 = 1;
            while (true) {
                java.lang.String property = properties.getProperty("platform." + i17);
                if (property == null) {
                    availablePlatforms = arrayList;
                    return arrayList;
                }
                arrayList.add(property);
                i17++;
            }
        }
    }

    public static java.lang.String getSevenZipJBindingVersion() {
        return SEVENZIPJBINDING_VERSION;
    }

    public static com.tencent.mm.mm7zip.SevenZip.Version getSevenZipVersion() {
        ensureLibraryIsInitialized();
        com.tencent.mm.mm7zip.SevenZip.Version version = new com.tencent.mm.mm7zip.SevenZip.Version();
        version.major = nativeGetVersionMajor();
        version.minor = nativeGetVersionMinor();
        version.build = nativeGetVersionBuild();
        version.version = nativeGetVersionVersion();
        version.date = nativeGetVersionDate();
        version.copyright = nativeGetVersionCopyright();
        return version;
    }

    public static synchronized java.io.File[] getTemporaryArtifacts() {
        java.io.File[] fileArr;
        synchronized (com.tencent.mm.mm7zip.SevenZip.class) {
            fileArr = temporaryArtifacts;
        }
        return fileArr;
    }

    public static synchronized java.lang.String getUsedPlatform() {
        java.lang.String str;
        synchronized (com.tencent.mm.mm7zip.SevenZip.class) {
            str = usedPlatform;
        }
        return str;
    }

    private static boolean hashMatched(java.io.File file, java.lang.String str) {
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
                            throwInitException(e17, "Error reading from library file opened from the temp directory: '" + file.getAbsolutePath() + "'");
                            try {
                                fileInputStream.close();
                            } catch (java.io.IOException unused) {
                            }
                            return false;
                        }
                    }
                    boolean equals = byteArrayToHex(messageDigest.digest()).equals(str.trim().toLowerCase());
                    try {
                    } catch (java.io.IOException e18) {
                        throwInitException(e18, "Error closing library file from the temp directory (opened for reading): '" + file.getAbsolutePath() + "'");
                    }
                    return equals;
                } finally {
                    try {
                        fileInputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
            } catch (java.io.IOException e19) {
                throwInitException(e19, "Error opening library file from the temp directory for reading: '" + file.getAbsolutePath() + "'");
                return false;
            }
        } catch (java.security.NoSuchAlgorithmException e27) {
            throwInitException(e27, "Error initializing SHA1 algorithm");
            return false;
        }
    }

    public static synchronized void initLoadedLibraries() {
        synchronized (com.tencent.mm.mm7zip.SevenZip.class) {
            if (initializationSuccessful) {
                return;
            }
            autoInitializationWillOccur = false;
            nativeInitialization();
        }
    }

    public static void initSevenZipFromPlatformJAR() {
        initSevenZipFromPlatformJARIntern(null, null);
    }

    private static synchronized void initSevenZipFromPlatformJARIntern(java.lang.String str, java.io.File file) {
        synchronized (com.tencent.mm.mm7zip.SevenZip.class) {
            try {
                autoInitializationWillOccur = false;
                if (initializationSuccessful) {
                    return;
                }
                determineAndSetUsedPlatform(str);
                loadNativeLibraries("MM7Zip");
                nativeInitialization();
            } catch (com.tencent.mm.mm7zip.SevenZipNativeInitializationException e17) {
                lastInitializationException = e17;
                throw e17;
            }
        }
    }

    public static synchronized boolean isAutoInitializationWillOccur() {
        boolean z17;
        synchronized (com.tencent.mm.mm7zip.SevenZip.class) {
            z17 = autoInitializationWillOccur;
        }
        return z17;
    }

    public static synchronized boolean isInitializedSuccessfully() {
        boolean z17;
        synchronized (com.tencent.mm.mm7zip.SevenZip.class) {
            z17 = initializationSuccessful;
        }
        return z17;
    }

    private static void loadNativeLibraries(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/mm7zip/SevenZip", "loadNativeLibraries", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/mm7zip/SevenZip", "loadNativeLibraries", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private static native void nativeCreateArchive(com.tencent.mm.mm7zip.impl.OutArchiveImpl<?> outArchiveImpl, com.tencent.mm.mm7zip.ArchiveFormat archiveFormat);

    private static native int nativeGetVersionBuild();

    private static native java.lang.String nativeGetVersionCopyright();

    private static native java.lang.String nativeGetVersionDate();

    private static native int nativeGetVersionMajor();

    private static native int nativeGetVersionMinor();

    private static native java.lang.String nativeGetVersionVersion();

    private static native java.lang.String nativeInitSevenZipLibrary();

    private static void nativeInitialization() {
        java.lang.String property = java.lang.System.getProperty(SYSTEM_PROPERTY_SEVEN_ZIP_NO_DO_PRIVILEGED_INITIALIZATION);
        final java.lang.String[] strArr = new java.lang.String[1];
        final java.lang.Throwable[] thArr = new java.lang.Throwable[1];
        if (property == null || property.trim().equals("0")) {
            java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.lang.Void>() { // from class: com.tencent.mm.mm7zip.SevenZip.1
                @Override // java.security.PrivilegedAction
                public java.lang.Void run() {
                    try {
                        strArr[0] = com.tencent.mm.mm7zip.SevenZip.access$000();
                        return null;
                    } catch (java.lang.Throwable th6) {
                        thArr[0] = th6;
                        return null;
                    }
                }
            });
        } else {
            strArr[0] = nativeInitSevenZipLibrary();
        }
        java.lang.String str = strArr[0];
        if (str == null && thArr[0] == null) {
            initializationSuccessful = true;
            return;
        }
        if (str == null) {
            str = "No message";
        }
        com.tencent.mm.mm7zip.SevenZipNativeInitializationException sevenZipNativeInitializationException = new com.tencent.mm.mm7zip.SevenZipNativeInitializationException("Error initializing 7-Zip-JBinding: ".concat(str), thArr[0]);
        lastInitializationException = sevenZipNativeInitializationException;
        throw sevenZipNativeInitializationException;
    }

    private static native com.tencent.mm.mm7zip.IInArchive nativeOpenArchive(com.tencent.mm.mm7zip.ArchiveFormat archiveFormat, com.tencent.mm.mm7zip.IInStream iInStream, com.tencent.mm.mm7zip.IArchiveOpenCallback iArchiveOpenCallback);

    public static com.tencent.mm.mm7zip.IInArchive openInArchive(com.tencent.mm.mm7zip.ArchiveFormat archiveFormat, com.tencent.mm.mm7zip.IInStream iInStream, com.tencent.mm.mm7zip.IArchiveOpenCallback iArchiveOpenCallback) {
        ensureLibraryIsInitialized();
        if (iArchiveOpenCallback == null) {
            iArchiveOpenCallback = new com.tencent.mm.mm7zip.SevenZip.DummyOpenArchiveCallback();
        }
        if (archiveFormat != null) {
            return callNativeOpenArchive(archiveFormat, iInStream, iArchiveOpenCallback);
        }
        return callNativeOpenArchive(null, iInStream, iArchiveOpenCallback);
    }

    public static com.tencent.mm.mm7zip.IOutCreateArchive<com.tencent.mm.mm7zip.IOutItemAllFormats> openOutArchive(com.tencent.mm.mm7zip.ArchiveFormat archiveFormat) {
        return openOutArchiveIntern(archiveFormat);
    }

    public static com.tencent.mm.mm7zip.IOutCreateArchive7z openOutArchive7z() {
        return (com.tencent.mm.mm7zip.IOutCreateArchive7z) openOutArchiveIntern(com.tencent.mm.mm7zip.ArchiveFormat.SEVEN_ZIP);
    }

    private static com.tencent.mm.mm7zip.impl.OutArchiveImpl<?> openOutArchiveIntern(com.tencent.mm.mm7zip.ArchiveFormat archiveFormat) {
        ensureLibraryIsInitialized();
        if (!archiveFormat.isOutArchiveSupported()) {
            throw new java.lang.IllegalStateException("Archive format '" + archiveFormat + "' doesn't support archive creation.");
        }
        try {
            com.tencent.mm.mm7zip.impl.OutArchiveImpl<?> newInstance = archiveFormat.getOutArchiveImplementation().newInstance();
            nativeCreateArchive(newInstance, archiveFormat);
            return newInstance;
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalStateException("Internal error: Can't create new instance of the class " + archiveFormat.getOutArchiveImplementation() + " using default constructor.");
        }
    }

    public static com.tencent.mm.mm7zip.IOutCreateArchiveZip openOutArchiveZip() {
        return (com.tencent.mm.mm7zip.IOutCreateArchiveZip) openOutArchiveIntern(com.tencent.mm.mm7zip.ArchiveFormat.ZIP);
    }

    private static void throwInitException(java.lang.String str) {
        throwInitException(null, str);
    }

    public static void initSevenZipFromPlatformJAR(java.io.File file) {
        initSevenZipFromPlatformJARIntern(null, file);
    }

    private static void throwInitException(java.lang.Exception exc, java.lang.String str) {
        throw new com.tencent.mm.mm7zip.SevenZipNativeInitializationException("Error loading SevenZipJBinding native library into JVM: " + str + " [You may also try different SevenZipJBinding initialization methods 'com.tencent.mm.mm7zip.SevenZip.init*()' in order to solve this problem] ", exc);
    }

    public static void initSevenZipFromPlatformJAR(java.lang.String str, java.io.File file) {
        initSevenZipFromPlatformJARIntern(str, file);
    }

    public static void initSevenZipFromPlatformJAR(java.lang.String str) {
        initSevenZipFromPlatformJARIntern(str, null);
    }

    public static com.tencent.mm.mm7zip.IInArchive openInArchive(com.tencent.mm.mm7zip.ArchiveFormat archiveFormat, com.tencent.mm.mm7zip.IInStream iInStream, java.lang.String str) {
        ensureLibraryIsInitialized();
        if (str == null) {
            return openInArchive(archiveFormat, iInStream);
        }
        return callNativeOpenArchive(archiveFormat, iInStream, new com.tencent.mm.mm7zip.SevenZip.ArchiveOpenCryptoCallback(str));
    }

    public static com.tencent.mm.mm7zip.IInArchive openInArchive(com.tencent.mm.mm7zip.ArchiveFormat archiveFormat, com.tencent.mm.mm7zip.IInStream iInStream) {
        ensureLibraryIsInitialized();
        return callNativeOpenArchive(archiveFormat, iInStream, new com.tencent.mm.mm7zip.SevenZip.DummyOpenArchiveCallback());
    }
}
