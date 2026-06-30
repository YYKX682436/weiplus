package com.p3249xcbb51f6b.p3256x6a710b1;

/* renamed from: com.tenpay.utils.Platform */
/* loaded from: classes12.dex */
public final class C28046x7397cc93 {
    public static final int AIX = 7;

    /* renamed from: ANDROID */
    public static final int f65657xf773c24f = 8;

    /* renamed from: ARCH */
    public static final java.lang.String f65658x1ec856;

    /* renamed from: C_LIBRARY_NAME */
    public static final java.lang.String f65659xc5a3d22b;

    /* renamed from: FREEBSD */
    public static final int f65660x6ce4c27 = 4;
    public static final int GNU = 9;

    /* renamed from: HAS_AWT */
    public static final boolean f65661x54697799;

    /* renamed from: HAS_BUFFERS */
    public static final boolean f65662xbe1a234e;

    /* renamed from: HAS_DLL_CALLBACKS */
    public static final boolean f65663xcfd1e1ee;

    /* renamed from: HAS_JAWT */
    public static final boolean f65664x38c940f9;

    /* renamed from: KFREEBSD */
    public static final int f65665x75c6717c = 10;

    /* renamed from: LINUX */
    public static final int f65666x45158d4 = 1;
    public static final int MAC = 0;

    /* renamed from: MATH_LIBRARY_NAME */
    public static final java.lang.String f65667x3418bb86;

    /* renamed from: NETBSD */
    public static final int f65668x890d8776 = 11;

    /* renamed from: OPENBSD */
    public static final int f65669xdf80c789 = 5;

    /* renamed from: RESOURCE_PREFIX */
    public static final java.lang.String f65670x903e3e3;

    /* renamed from: RO_FIELDS */
    public static final boolean f65671xa970d6fb;

    /* renamed from: SOLARIS */
    public static final int f65672xb1c1d28b = 3;

    /* renamed from: UNSPECIFIED */
    public static final int f65673x1f661f17 = -1;

    /* renamed from: WINDOWS */
    public static final int f65674x7b3b2e63 = 2;

    /* renamed from: WINDOWSCE */
    public static final int f65675x99292a05 = 6;

    /* renamed from: osType */
    private static final int f65676xc3e67f3e;

    static {
        boolean z17;
        java.lang.String property = java.lang.System.getProperty("os.name");
        if (property.startsWith("Linux")) {
            if ("dalvik".equals(java.lang.System.getProperty("java.vm.name").toLowerCase())) {
                f65676xc3e67f3e = 8;
                java.lang.System.setProperty("jna.nounpack", "true");
            } else {
                f65676xc3e67f3e = 1;
            }
        } else if (property.startsWith("AIX")) {
            f65676xc3e67f3e = 7;
        } else if (property.startsWith("Mac") || property.startsWith("Darwin")) {
            f65676xc3e67f3e = 0;
        } else if (property.startsWith("Windows CE")) {
            f65676xc3e67f3e = 6;
        } else if (property.startsWith("Windows")) {
            f65676xc3e67f3e = 2;
        } else if (property.startsWith("Solaris") || property.startsWith("SunOS")) {
            f65676xc3e67f3e = 3;
        } else if (property.startsWith("FreeBSD")) {
            f65676xc3e67f3e = 4;
        } else if (property.startsWith("OpenBSD")) {
            f65676xc3e67f3e = 5;
        } else if (property.equalsIgnoreCase("gnu")) {
            f65676xc3e67f3e = 9;
        } else if (property.equalsIgnoreCase("gnu/kfreebsd")) {
            f65676xc3e67f3e = 10;
        } else if (property.equalsIgnoreCase("netbsd")) {
            f65676xc3e67f3e = 11;
        } else {
            f65676xc3e67f3e = -1;
        }
        try {
            java.lang.Class.forName("java.nio.Buffer");
            z17 = true;
        } catch (java.lang.ClassNotFoundException e17) {
            java.lang.System.out.println(e17.getMessage());
            z17 = false;
        }
        int i17 = f65676xc3e67f3e;
        boolean z18 = (i17 == 6 || i17 == 8 || i17 == 7) ? false : true;
        f65661x54697799 = z18;
        f65664x38c940f9 = z18 && i17 != 0;
        f65662xbe1a234e = z17;
        f65671xa970d6fb = i17 != 6;
        java.lang.String str = "coredll";
        f65659xc5a3d22b = i17 == 2 ? "msvcrt" : i17 == 6 ? "coredll" : "c";
        if (i17 == 2) {
            str = "msvcrt";
        } else if (i17 != 6) {
            str = "m";
        }
        f65667x3418bb86 = str;
        f65663xcfd1e1ee = i17 == 2;
        f65658x1ec856 = m122039xa76f66b1(java.lang.System.getProperty("os.arch"), i17);
        f65670x903e3e3 = m122040x9e8864ce();
    }

    private C28046x7397cc93() {
    }

    /* renamed from: getCanonicalArchitecture */
    public static java.lang.String m122039xa76f66b1(java.lang.String str, int i17) {
        java.lang.String trim = str.toLowerCase().trim();
        if ("powerpc".equals(trim)) {
            trim = "ppc";
        } else if ("powerpc64".equals(trim)) {
            trim = "ppc64";
        } else if ("i386".equals(trim) || "i686".equals(trim)) {
            trim = "x86";
        } else if ("x86_64".equals(trim) || "amd64".equals(trim)) {
            trim = "x86-64";
        }
        return ("ppc64".equals(trim) && "little".equals(java.lang.System.getProperty("sun.cpu.endian"))) ? "ppc64le" : trim;
    }

    /* renamed from: getNativeLibraryResourcePrefix */
    public static java.lang.String m122040x9e8864ce() {
        return m122041x9e8864ce(m122042x273ab214(), java.lang.System.getProperty("os.arch"), java.lang.System.getProperty("os.name"));
    }

    /* renamed from: getOSType */
    public static final int m122042x273ab214() {
        return f65676xc3e67f3e;
    }

    /* renamed from: hasRuntimeExec */
    public static final boolean m122043x26eda18f() {
        return (m122061x394e581b() && "J9".equals(java.lang.System.getProperty("java.vm.name"))) ? false : true;
    }

    /* renamed from: is64Bit */
    public static final boolean m122044x79bd3a85() {
        java.lang.String property = java.lang.System.getProperty("sun.arch.data.model", java.lang.System.getProperty("com.ibm.vm.bitmode"));
        if (property != null) {
            return "64".equals(property);
        }
        java.lang.String str = f65658x1ec856;
        if ("x86-64".equals(str) || "ia64".equals(str) || "ppc64".equals(str) || "ppc64le".equals(str) || "sparcv9".equals(str) || "mips64".equals(str) || "mips64el".equals(str) || "amd64".equals(str)) {
            return true;
        }
        java.lang.String str2 = java.lang.System.getenv("PROCESSOR_ARCHITECTURE");
        java.lang.String str3 = java.lang.System.getenv("PROCESSOR_ARCHITEW6432");
        if (str2 == null || !str2.endsWith("64")) {
            return str3 != null && str3.endsWith("64");
        }
        return true;
    }

    /* renamed from: isAIX */
    public static final boolean m122045x5fce7c6() {
        return f65676xc3e67f3e == 7;
    }

    /* renamed from: isARM */
    public static final boolean m122046x5fce8d2() {
        return f65658x1ec856.startsWith("arm");
    }

    /* renamed from: isAix */
    public static final boolean m122047x5fcebc6() {
        return m122045x5fce7c6();
    }

    /* renamed from: isAndroid */
    public static final boolean m122048xaa197de5() {
        return f65676xc3e67f3e == 8;
    }

    /* renamed from: isFreeBSD */
    public static final boolean m122049xb9738b9d() {
        return f65676xc3e67f3e == 4;
    }

    /* renamed from: isGNU */
    public static final boolean m122050x5fcfee4() {
        return f65676xc3e67f3e == 9;
    }

    /* renamed from: isIntel */
    public static final boolean m122051x7ae411cc() {
        return f65658x1ec856.startsWith("x86");
    }

    /* renamed from: isLinux */
    public static final boolean m122052x7b0bfdea() {
        return f65676xc3e67f3e == 1;
    }

    /* renamed from: isMIPS */
    public static final boolean m122053xb9a584c9() {
        java.lang.String str = f65658x1ec856;
        return str.equals("mips") || str.equals("mips64") || str.equals("mipsel") || str.equals("mips64el");
    }

    /* renamed from: isMac */
    public static final boolean m122054x5fd17c5() {
        return f65676xc3e67f3e == 0;
    }

    /* renamed from: isNetBSD */
    public static final boolean m122055xe9a70920() {
        return f65676xc3e67f3e == 11;
    }

    /* renamed from: isOpenBSD */
    public static final boolean m122056x922606ff() {
        return f65676xc3e67f3e == 5;
    }

    /* renamed from: isPPC */
    public static final boolean m122057x5fd20d9() {
        return f65658x1ec856.startsWith("ppc");
    }

    /* renamed from: isSPARC */
    public static final boolean m122058x7b6297cb() {
        return f65658x1ec856.startsWith("sparc");
    }

    /* renamed from: isSolaris */
    public static final boolean m122059x64678e21() {
        return f65676xc3e67f3e == 3;
    }

    /* renamed from: isWindows */
    public static final boolean m122060x2de0e9f9() {
        int i17 = f65676xc3e67f3e;
        return i17 == 2 || i17 == 6;
    }

    /* renamed from: isWindowsCE */
    public static final boolean m122061x394e581b() {
        return f65676xc3e67f3e == 6;
    }

    /* renamed from: isX11 */
    public static final boolean m122062x5fd3b0e() {
        return (m122060x2de0e9f9() || m122054x5fd17c5()) ? false : true;
    }

    /* renamed from: iskFreeBSD */
    public static final boolean m122063x7735e066() {
        return f65676xc3e67f3e == 10;
    }

    /* renamed from: getNativeLibraryResourcePrefix */
    public static java.lang.String m122041x9e8864ce(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String m122039xa76f66b1 = m122039xa76f66b1(str, i17);
        switch (i17) {
            case 0:
                return "darwin";
            case 1:
                return "linux-" + m122039xa76f66b1;
            case 2:
                return "win32-" + m122039xa76f66b1;
            case 3:
                return "sunos-" + m122039xa76f66b1;
            case 4:
                return "freebsd-" + m122039xa76f66b1;
            case 5:
                return "openbsd-" + m122039xa76f66b1;
            case 6:
                return "w32ce-" + m122039xa76f66b1;
            case 7:
            case 9:
            default:
                java.lang.String lowerCase = str2.toLowerCase();
                int indexOf = lowerCase.indexOf(" ");
                if (indexOf != -1) {
                    lowerCase = lowerCase.substring(0, indexOf);
                }
                return lowerCase + "-" + m122039xa76f66b1;
            case 8:
                if (m122039xa76f66b1.startsWith("arm")) {
                    m122039xa76f66b1 = "arm";
                }
                return "android-".concat(m122039xa76f66b1);
            case 10:
                return "kfreebsd-" + m122039xa76f66b1;
            case 11:
                return "netbsd-" + m122039xa76f66b1;
        }
    }
}
