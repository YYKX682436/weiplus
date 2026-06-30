package com.eclipsesource.mmv8;

/* loaded from: classes13.dex */
public class PlatformDetector {

    /* loaded from: classes13.dex */
    public static class Arch {
        public static java.lang.String getName() {
            java.lang.String property = java.lang.System.getProperty("os.arch");
            java.lang.String normalizeArch = com.eclipsesource.mmv8.PlatformDetector.normalizeArch(property);
            if (!normalizeArch.equals(com.eclipsesource.mmv8.Platform.UNKNOWN)) {
                return normalizeArch;
            }
            throw new java.lang.UnsatisfiedLinkError("Unsupported arch: " + property);
        }
    }

    /* loaded from: classes13.dex */
    public static class OS {
        public static java.lang.String getLibFileExtension() {
            if (isWindows()) {
                return "dll";
            }
            if (isMac()) {
                return "dylib";
            }
            if (isLinux() || isAndroid() || isNativeClient()) {
                return "so";
            }
            throw new java.lang.UnsatisfiedLinkError("Unsupported platform library-extension for: " + getName());
        }

        public static java.lang.String getName() {
            java.lang.String property = java.lang.System.getProperty("os.name");
            java.lang.String normalizeOs = com.eclipsesource.mmv8.PlatformDetector.normalizeOs(property);
            java.lang.String property2 = java.lang.System.getProperty("java.specification.vendor");
            if (com.eclipsesource.mmv8.PlatformDetector.normalize(property2).contains(com.eclipsesource.mmv8.Platform.ANDROID) || normalizeOs.contains(com.eclipsesource.mmv8.Platform.ANDROID)) {
                return com.eclipsesource.mmv8.Platform.ANDROID;
            }
            if (!normalizeOs.equals(com.eclipsesource.mmv8.Platform.UNKNOWN)) {
                return normalizeOs;
            }
            throw new java.lang.UnsatisfiedLinkError("Unsupported platform/vendor: " + property + " / " + property2);
        }

        public static boolean isAndroid() {
            return getName().equals(com.eclipsesource.mmv8.Platform.ANDROID);
        }

        public static boolean isLinux() {
            return getName().equals(com.eclipsesource.mmv8.Platform.LINUX);
        }

        public static boolean isMac() {
            return getName().equals(com.eclipsesource.mmv8.Platform.MACOSX);
        }

        public static boolean isNativeClient() {
            return getName().equals(com.eclipsesource.mmv8.Platform.NATIVE_CLIENT);
        }

        public static boolean isWindows() {
            return getName().equals(com.eclipsesource.mmv8.Platform.WINDOWS);
        }
    }

    /* loaded from: classes13.dex */
    public static class Vendor {
        private static final java.lang.String LINUX_ID_PREFIX = "ID=";
        private static final java.lang.String[] LINUX_OS_RELEASE_FILES = {"/etc/os-release", "/usr/lib/os-release"};
        private static final java.lang.String REDHAT_RELEASE_FILE = "/etc/redhat-release";

        private static void closeQuietly(java.io.Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (java.io.IOException unused) {
                }
            }
        }

        private static java.lang.String getLinuxOsReleaseId() {
            for (java.lang.String str : LINUX_OS_RELEASE_FILES) {
                java.io.File file = new java.io.File(str);
                if (file.exists()) {
                    return parseLinuxOsReleaseFile(file);
                }
            }
            java.io.File file2 = new java.io.File(REDHAT_RELEASE_FILE);
            if (file2.exists()) {
                return parseLinuxRedhatReleaseFile(file2);
            }
            throw new java.lang.UnsatisfiedLinkError("Unsupported linux vendor: " + getName());
        }

        public static java.lang.String getName() {
            if (com.eclipsesource.mmv8.PlatformDetector.OS.isWindows()) {
                return "microsoft";
            }
            if (com.eclipsesource.mmv8.PlatformDetector.OS.isMac()) {
                return "apple";
            }
            if (com.eclipsesource.mmv8.PlatformDetector.OS.isLinux()) {
                return getLinuxOsReleaseId();
            }
            if (com.eclipsesource.mmv8.PlatformDetector.OS.isAndroid()) {
                return "google";
            }
            throw new java.lang.UnsatisfiedLinkError("Unsupported vendor: " + getName());
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        
            r0 = com.eclipsesource.mmv8.PlatformDetector.normalizeOsReleaseValue(r4.substring(3));
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String parseLinuxOsReleaseFile(java.io.File r4) {
            /*
                r0 = 0
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                java.lang.String r4 = "utf-8"
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
            L12:
                java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L36
                if (r4 == 0) goto L29
                java.lang.String r2 = "ID="
                boolean r2 = r4.startsWith(r2)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L36
                if (r2 == 0) goto L12
                r2 = 3
                java.lang.String r4 = r4.substring(r2)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L36
                java.lang.String r0 = com.eclipsesource.mmv8.PlatformDetector.access$300(r4)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L36
            L29:
                closeQuietly(r1)
                return r0
            L2d:
                r4 = move-exception
                r0 = r1
                goto L31
            L30:
                r4 = move-exception
            L31:
                closeQuietly(r0)
                throw r4
            L35:
                r1 = r0
            L36:
                closeQuietly(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.PlatformDetector.Vendor.parseLinuxOsReleaseFile(java.io.File):java.lang.String");
        }

        private static java.lang.String parseLinuxRedhatReleaseFile(java.io.File file) {
            java.io.BufferedReader bufferedReader;
            java.lang.String str = "fedora";
            java.io.BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        java.lang.String lowerCase = readLine.toLowerCase(java.util.Locale.US);
                        if (lowerCase.contains("centos")) {
                            str = "centos";
                        } else if (!lowerCase.contains("fedora")) {
                            if (!lowerCase.contains("red hat enterprise linux")) {
                                closeQuietly(bufferedReader);
                                return null;
                            }
                            str = "rhel";
                        }
                        closeQuietly(bufferedReader);
                        return str;
                    }
                } catch (java.io.IOException unused) {
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedReader2 = bufferedReader;
                    closeQuietly(bufferedReader2);
                    throw th;
                }
            } catch (java.io.IOException unused2) {
                bufferedReader = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
            closeQuietly(bufferedReader);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String normalize(java.lang.String str) {
        return str == null ? "" : str.toLowerCase(java.util.Locale.US).replaceAll("[^a-z0-9]+", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String normalizeArch(java.lang.String str) {
        java.lang.String normalize = normalize(str);
        return normalize.matches("^(x8664|amd64|ia32e|em64t|x64)$") ? "x86_64" : normalize.matches("^(x8632|x86|i[3-6]86|ia32|x32)$") ? "x86_32" : normalize.matches("^(ia64|itanium64)$") ? "itanium_64" : normalize.matches("^(sparc|sparc32)$") ? "sparc_32" : normalize.matches("^(sparcv9|sparc64)$") ? "sparc_64" : normalize.matches("^(arm|arm32)$") ? "arm_32" : "aarch64".equals(normalize) ? "aarch_64" : normalize.matches("^(ppc|ppc32)$") ? "ppc_32" : "ppc64".equals(normalize) ? "ppc_64" : "ppc64le".equals(normalize) ? "ppcle_64" : "s390".equals(normalize) ? "s390_32" : "s390x".equals(normalize) ? "s390_64" : com.eclipsesource.mmv8.Platform.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String normalizeOs(java.lang.String str) {
        java.lang.String normalize = normalize(str);
        return normalize.startsWith("aix") ? "aix" : normalize.startsWith("hpux") ? "hpux" : (!normalize.startsWith("os400") || (normalize.length() > 5 && java.lang.Character.isDigit(normalize.charAt(5)))) ? normalize.startsWith(com.eclipsesource.mmv8.Platform.ANDROID) ? com.eclipsesource.mmv8.Platform.ANDROID : normalize.startsWith(com.eclipsesource.mmv8.Platform.LINUX) ? com.eclipsesource.mmv8.Platform.LINUX : normalize.startsWith(com.eclipsesource.mmv8.Platform.NATIVE_CLIENT) ? com.eclipsesource.mmv8.Platform.NATIVE_CLIENT : (normalize.startsWith(com.eclipsesource.mmv8.Platform.MACOSX) || normalize.startsWith("osx")) ? com.eclipsesource.mmv8.Platform.MACOSX : normalize.startsWith("freebsd") ? "freebsd" : normalize.startsWith("openbsd") ? "openbsd" : normalize.startsWith("netbsd") ? "netbsd" : (normalize.startsWith("solaris") || normalize.startsWith("sunos")) ? "sunos" : normalize.startsWith(com.eclipsesource.mmv8.Platform.WINDOWS) ? com.eclipsesource.mmv8.Platform.WINDOWS : com.eclipsesource.mmv8.Platform.UNKNOWN : "os400";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String normalizeOsReleaseValue(java.lang.String str) {
        return str.trim().replace("\"", "");
    }
}
