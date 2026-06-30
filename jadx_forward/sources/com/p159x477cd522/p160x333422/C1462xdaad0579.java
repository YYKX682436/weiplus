package com.p159x477cd522.p160x333422;

/* renamed from: com.eclipsesource.mmv8.PlatformDetector */
/* loaded from: classes13.dex */
public class C1462xdaad0579 {

    /* renamed from: com.eclipsesource.mmv8.PlatformDetector$Arch */
    /* loaded from: classes13.dex */
    public static class Arch {
        /* renamed from: getName */
        public static java.lang.String m15891xfb82e301() {
            java.lang.String property = java.lang.System.getProperty("os.arch");
            java.lang.String m15888xaca95503 = com.p159x477cd522.p160x333422.C1462xdaad0579.m15888xaca95503(property);
            if (!m15888xaca95503.equals(com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a)) {
                return m15888xaca95503;
            }
            throw new java.lang.UnsatisfiedLinkError("Unsupported arch: " + property);
        }
    }

    /* renamed from: com.eclipsesource.mmv8.PlatformDetector$OS */
    /* loaded from: classes13.dex */
    public static class OS {
        /* renamed from: getLibFileExtension */
        public static java.lang.String m15892x75ca714() {
            if (m15898x2de0e9f9()) {
                return "dll";
            }
            if (m15896x5fd17c5()) {
                return "dylib";
            }
            if (m15895x7b0bfdea() || m15894xaa197de5() || m15897x460c750c()) {
                return "so";
            }
            throw new java.lang.UnsatisfiedLinkError("Unsupported platform library-extension for: " + m15893xfb82e301());
        }

        /* renamed from: getName */
        public static java.lang.String m15893xfb82e301() {
            java.lang.String property = java.lang.System.getProperty("os.name");
            java.lang.String m15889xf0fed9d1 = com.p159x477cd522.p160x333422.C1462xdaad0579.m15889xf0fed9d1(property);
            java.lang.String property2 = java.lang.System.getProperty("java.specification.vendor");
            if (com.p159x477cd522.p160x333422.C1462xdaad0579.m15887xe1a5f0d(property2).contains(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f) || m15889xf0fed9d1.contains(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f)) {
                return com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f;
            }
            if (!m15889xf0fed9d1.equals(com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a)) {
                return m15889xf0fed9d1;
            }
            throw new java.lang.UnsatisfiedLinkError("Unsupported platform/vendor: " + property + " / " + property2);
        }

        /* renamed from: isAndroid */
        public static boolean m15894xaa197de5() {
            return m15893xfb82e301().equals(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        }

        /* renamed from: isLinux */
        public static boolean m15895x7b0bfdea() {
            return m15893xfb82e301().equals(com.p159x477cd522.p160x333422.C1461x7397cc93.f4736x45158d4);
        }

        /* renamed from: isMac */
        public static boolean m15896x5fd17c5() {
            return m15893xfb82e301().equals(com.p159x477cd522.p160x333422.C1461x7397cc93.f4737x8718c765);
        }

        /* renamed from: isNativeClient */
        public static boolean m15897x460c750c() {
            return m15893xfb82e301().equals(com.p159x477cd522.p160x333422.C1461x7397cc93.f4738xac728f3);
        }

        /* renamed from: isWindows */
        public static boolean m15898x2de0e9f9() {
            return m15893xfb82e301().equals(com.p159x477cd522.p160x333422.C1461x7397cc93.f4740x7b3b2e63);
        }
    }

    /* renamed from: com.eclipsesource.mmv8.PlatformDetector$Vendor */
    /* loaded from: classes13.dex */
    public static class Vendor {

        /* renamed from: LINUX_ID_PREFIX */
        private static final java.lang.String f4741x3313908b = "ID=";

        /* renamed from: LINUX_OS_RELEASE_FILES */
        private static final java.lang.String[] f4742x34ea18ef = {"/etc/os-release", "/usr/lib/os-release"};

        /* renamed from: REDHAT_RELEASE_FILE */
        private static final java.lang.String f4743x40dc7889 = "/etc/redhat-release";

        /* renamed from: closeQuietly */
        private static void m15900xd71209a9(java.io.Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (java.io.IOException unused) {
                }
            }
        }

        /* renamed from: getLinuxOsReleaseId */
        private static java.lang.String m15901x832f1be0() {
            for (java.lang.String str : f4742x34ea18ef) {
                java.io.File file = new java.io.File(str);
                if (file.exists()) {
                    return m15903xaa5b51e(file);
                }
            }
            java.io.File file2 = new java.io.File(f4743x40dc7889);
            if (file2.exists()) {
                return m15904xe0d5f758(file2);
            }
            throw new java.lang.UnsatisfiedLinkError("Unsupported linux vendor: " + m15902xfb82e301());
        }

        /* renamed from: getName */
        public static java.lang.String m15902xfb82e301() {
            if (com.p159x477cd522.p160x333422.C1462xdaad0579.OS.m15898x2de0e9f9()) {
                return "microsoft";
            }
            if (com.p159x477cd522.p160x333422.C1462xdaad0579.OS.m15896x5fd17c5()) {
                return "apple";
            }
            if (com.p159x477cd522.p160x333422.C1462xdaad0579.OS.m15895x7b0bfdea()) {
                return m15901x832f1be0();
            }
            if (com.p159x477cd522.p160x333422.C1462xdaad0579.OS.m15894xaa197de5()) {
                return "google";
            }
            throw new java.lang.UnsatisfiedLinkError("Unsupported vendor: " + m15902xfb82e301());
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        
            r0 = com.p159x477cd522.p160x333422.C1462xdaad0579.m15890xc198621b(r4.substring(3));
         */
        /* renamed from: parseLinuxOsReleaseFile */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String m15903xaa5b51e(java.io.File r4) {
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
                java.lang.String r0 = com.p159x477cd522.p160x333422.C1462xdaad0579.m15886xbbd78633(r4)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L36
            L29:
                m15900xd71209a9(r1)
                return r0
            L2d:
                r4 = move-exception
                r0 = r1
                goto L31
            L30:
                r4 = move-exception
            L31:
                m15900xd71209a9(r0)
                throw r4
            L35:
                r1 = r0
            L36:
                m15900xd71209a9(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p159x477cd522.p160x333422.C1462xdaad0579.Vendor.m15903xaa5b51e(java.io.File):java.lang.String");
        }

        /* renamed from: parseLinuxRedhatReleaseFile */
        private static java.lang.String m15904xe0d5f758(java.io.File file) {
            java.io.BufferedReader bufferedReader;
            java.lang.String str = "fedora";
            java.io.BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        java.lang.String lowerCase = readLine.toLowerCase(java.util.Locale.US);
                        if (lowerCase.contains("centos")) {
                            str = "centos";
                        } else if (!lowerCase.contains("fedora")) {
                            if (!lowerCase.contains("red hat enterprise linux")) {
                                m15900xd71209a9(bufferedReader);
                                return null;
                            }
                            str = "rhel";
                        }
                        m15900xd71209a9(bufferedReader);
                        return str;
                    }
                } catch (java.io.IOException unused) {
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedReader2 = bufferedReader;
                    m15900xd71209a9(bufferedReader2);
                    throw th;
                }
            } catch (java.io.IOException unused2) {
                bufferedReader = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
            m15900xd71209a9(bufferedReader);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: normalize */
    public static java.lang.String m15887xe1a5f0d(java.lang.String str) {
        return str == null ? "" : str.toLowerCase(java.util.Locale.US).replaceAll("[^a-z0-9]+", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: normalizeArch */
    public static java.lang.String m15888xaca95503(java.lang.String str) {
        java.lang.String m15887xe1a5f0d = m15887xe1a5f0d(str);
        return m15887xe1a5f0d.matches("^(x8664|amd64|ia32e|em64t|x64)$") ? "x86_64" : m15887xe1a5f0d.matches("^(x8632|x86|i[3-6]86|ia32|x32)$") ? "x86_32" : m15887xe1a5f0d.matches("^(ia64|itanium64)$") ? "itanium_64" : m15887xe1a5f0d.matches("^(sparc|sparc32)$") ? "sparc_32" : m15887xe1a5f0d.matches("^(sparcv9|sparc64)$") ? "sparc_64" : m15887xe1a5f0d.matches("^(arm|arm32)$") ? "arm_32" : "aarch64".equals(m15887xe1a5f0d) ? "aarch_64" : m15887xe1a5f0d.matches("^(ppc|ppc32)$") ? "ppc_32" : "ppc64".equals(m15887xe1a5f0d) ? "ppc_64" : "ppc64le".equals(m15887xe1a5f0d) ? "ppcle_64" : "s390".equals(m15887xe1a5f0d) ? "s390_32" : "s390x".equals(m15887xe1a5f0d) ? "s390_64" : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: normalizeOs */
    public static java.lang.String m15889xf0fed9d1(java.lang.String str) {
        java.lang.String m15887xe1a5f0d = m15887xe1a5f0d(str);
        return m15887xe1a5f0d.startsWith("aix") ? "aix" : m15887xe1a5f0d.startsWith("hpux") ? "hpux" : (!m15887xe1a5f0d.startsWith("os400") || (m15887xe1a5f0d.length() > 5 && java.lang.Character.isDigit(m15887xe1a5f0d.charAt(5)))) ? m15887xe1a5f0d.startsWith(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f) ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f : m15887xe1a5f0d.startsWith(com.p159x477cd522.p160x333422.C1461x7397cc93.f4736x45158d4) ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4736x45158d4 : m15887xe1a5f0d.startsWith(com.p159x477cd522.p160x333422.C1461x7397cc93.f4738xac728f3) ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4738xac728f3 : (m15887xe1a5f0d.startsWith(com.p159x477cd522.p160x333422.C1461x7397cc93.f4737x8718c765) || m15887xe1a5f0d.startsWith("osx")) ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4737x8718c765 : m15887xe1a5f0d.startsWith("freebsd") ? "freebsd" : m15887xe1a5f0d.startsWith("openbsd") ? "openbsd" : m15887xe1a5f0d.startsWith("netbsd") ? "netbsd" : (m15887xe1a5f0d.startsWith("solaris") || m15887xe1a5f0d.startsWith("sunos")) ? "sunos" : m15887xe1a5f0d.startsWith(com.p159x477cd522.p160x333422.C1461x7397cc93.f4740x7b3b2e63) ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4740x7b3b2e63 : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "os400";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: normalizeOsReleaseValue */
    public static java.lang.String m15890xc198621b(java.lang.String str) {
        return str.trim().replace("\"", "");
    }
}
