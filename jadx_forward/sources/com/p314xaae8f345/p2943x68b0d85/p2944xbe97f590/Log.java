package com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590;

/* loaded from: classes12.dex */
public final class Log {

    /* renamed from: ASSERT */
    public static final int f47022x73a36746 = 7;

    /* renamed from: DEBUG */
    public static final int f47023x3de9e33 = 3;

    /* renamed from: ERROR */
    public static final int f47024x3f2d9e8 = 6;

    /* renamed from: INFO */
    public static final int f47025x225cae = 4;

    /* renamed from: LOGGER_JAVA */
    private static final long f47026x5855eb71 = 3;

    /* renamed from: LOGGER_LOGCAT */
    private static final long f47027x9eb10ba1 = 2;

    /* renamed from: LOGGER_NOOP */
    private static final long f47028x5857f0b1 = 0;

    /* renamed from: LOGGER_STDOUT */
    private static final long f47029xaae83fda = 1;

    /* renamed from: VERBOSE */
    public static final int f47030x3fb90562 = 2;

    /* renamed from: WARN */
    public static final int f47031x288a86 = 5;

    /* renamed from: sLogger */
    static volatile com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0 f47032x4b697fe3;

    /* renamed from: sLoggerPtr */
    static volatile long f47033xca1a8c0b;

    /* renamed from: com.tencent.stubs.logger.Log$Logger */
    /* loaded from: classes12.dex */
    public interface InterfaceC25626x87fce1b0 {
        /* renamed from: isLoggable */
        boolean mo75069x492678c7(java.lang.String str, int i17);

        /* renamed from: println */
        void mo75070xed3dc8ef(int i17, java.lang.String str, java.lang.String str2);
    }

    static {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0 interfaceC25626x87fce1b0;
        long j17;
        try {
            java.lang.Class.forName("android.util.Log");
            interfaceC25626x87fce1b0 = new com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.C25625xe6976941();
            j17 = 2;
        } catch (java.lang.ClassNotFoundException unused) {
            interfaceC25626x87fce1b0 = new com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0() { // from class: com.tencent.stubs.logger.Log.1
                @Override // com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0
                /* renamed from: isLoggable */
                public boolean mo75069x492678c7(java.lang.String str, int i17) {
                    return true;
                }

                @Override // com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0
                /* renamed from: println */
                public void mo75070xed3dc8ef(int i17, java.lang.String str, java.lang.String str2) {
                    java.lang.System.out.println("[" + str + "] " + str2);
                }
            };
            j17 = 1;
        }
        f47032x4b697fe3 = interfaceC25626x87fce1b0;
        f47033xca1a8c0b = j17;
    }

    private Log() {
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        m96100xed3dc8ef(3, str, str2);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        m96100xed3dc8ef(6, str, str2);
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        m96100xed3dc8ef(7, str, str2);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        m96100xed3dc8ef(4, str, str2);
    }

    /* renamed from: printFormat */
    public static void m96098xd5ad2104(int i17, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0 interfaceC25626x87fce1b0 = f47032x4b697fe3;
        if (interfaceC25626x87fce1b0 == null || !interfaceC25626x87fce1b0.mo75069x492678c7(str, i17)) {
            return;
        }
        interfaceC25626x87fce1b0.mo75070xed3dc8ef(i17, str, java.lang.String.format(str2, objArr));
    }

    /* renamed from: printStack */
    public static void m96099x79dc3db(int i17, java.lang.String str, java.lang.Throwable th6) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0 interfaceC25626x87fce1b0 = f47032x4b697fe3;
        if (interfaceC25626x87fce1b0 == null || !interfaceC25626x87fce1b0.mo75069x492678c7(str, i17)) {
            return;
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter(512);
        th6.printStackTrace(new java.io.PrintWriter(stringWriter));
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(stringWriter.toString(), "\n");
        while (stringTokenizer.hasMoreTokens()) {
            interfaceC25626x87fce1b0.mo75070xed3dc8ef(i17, str, stringTokenizer.nextToken());
        }
    }

    /* renamed from: println */
    public static void m96100xed3dc8ef(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0 interfaceC25626x87fce1b0 = f47032x4b697fe3;
        if (interfaceC25626x87fce1b0 == null) {
            return;
        }
        interfaceC25626x87fce1b0.mo75070xed3dc8ef(i17, str, str2);
    }

    /* renamed from: setLogger */
    public static void m96101x16e44c92(com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0 interfaceC25626x87fce1b0) {
        f47032x4b697fe3 = interfaceC25626x87fce1b0;
        f47033xca1a8c0b = interfaceC25626x87fce1b0 == null ? 0L : 3L;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        m96100xed3dc8ef(2, str, str2);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        m96100xed3dc8ef(5, str, str2);
    }

    public static void d(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        if (str2 != null && !str2.isEmpty()) {
            m96100xed3dc8ef(3, str, str2);
        }
        if (th6 != null) {
            m96099x79dc3db(3, str, th6);
        }
    }

    public static void e(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        if (str2 != null && !str2.isEmpty()) {
            m96100xed3dc8ef(6, str, str2);
        }
        if (th6 != null) {
            m96099x79dc3db(6, str, th6);
        }
    }

    public static void f(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        if (str2 != null && !str2.isEmpty()) {
            m96100xed3dc8ef(7, str, str2);
        }
        if (th6 != null) {
            m96099x79dc3db(7, str, th6);
        }
    }

    public static void i(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        if (str2 != null && !str2.isEmpty()) {
            m96100xed3dc8ef(4, str, str2);
        }
        if (th6 != null) {
            m96099x79dc3db(4, str, th6);
        }
    }

    public static void v(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        if (str2 != null && !str2.isEmpty()) {
            m96100xed3dc8ef(2, str, str2);
        }
        if (th6 != null) {
            m96099x79dc3db(2, str, th6);
        }
    }

    public static void w(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        if (str2 != null && !str2.isEmpty()) {
            m96100xed3dc8ef(5, str, str2);
        }
        if (th6 != null) {
            m96099x79dc3db(5, str, th6);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m96098xd5ad2104(3, str, str2, objArr);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m96098xd5ad2104(6, str, str2, objArr);
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m96098xd5ad2104(7, str, str2, objArr);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m96098xd5ad2104(4, str, str2, objArr);
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m96098xd5ad2104(2, str, str2, objArr);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m96098xd5ad2104(5, str, str2, objArr);
    }

    public static void d(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        m96098xd5ad2104(3, str, str2, objArr);
        if (th6 != null) {
            m96099x79dc3db(3, str, th6);
        }
    }

    public static void e(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        m96098xd5ad2104(6, str, str2, objArr);
        if (th6 != null) {
            m96099x79dc3db(6, str, th6);
        }
    }

    public static void f(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        m96098xd5ad2104(7, str, str2, objArr);
        if (th6 != null) {
            m96099x79dc3db(7, str, th6);
        }
    }

    public static void i(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        m96098xd5ad2104(4, str, str2, objArr);
        if (th6 != null) {
            m96099x79dc3db(4, str, th6);
        }
    }

    public static void v(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        m96098xd5ad2104(2, str, str2, objArr);
        if (th6 != null) {
            m96099x79dc3db(2, str, th6);
        }
    }

    public static void w(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        m96098xd5ad2104(5, str, str2, objArr);
        if (th6 != null) {
            m96099x79dc3db(7, str, th6);
        }
    }
}
