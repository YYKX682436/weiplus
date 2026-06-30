package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.Logging */
/* loaded from: classes15.dex */
public class C29806x779f633f {

    /* renamed from: fallbackLogger */
    private static final java.util.logging.Logger f75505xefc85712 = m155670xa5195b2e();

    /* renamed from: loggable */
    private static org.p3371xd0ce3e8d.InterfaceC29805x7c49359d f75506x786ed17d;

    /* renamed from: loggableSeverity */
    private static org.p3371xd0ce3e8d.C29806x779f633f.Severity f75507xca6f7b9a;

    /* renamed from: loggingEnabled */
    private static volatile boolean f75508x6b469ee2;

    /* renamed from: org.webrtc.Logging$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$org$webrtc$Logging$Severity */
        static final /* synthetic */ int[] f75509x3bb8c379;

        static {
            int[] iArr = new int[org.p3371xd0ce3e8d.C29806x779f633f.Severity.m155685xcee59d22().length];
            f75509x3bb8c379 = iArr;
            try {
                iArr[org.p3371xd0ce3e8d.C29806x779f633f.Severity.LS_ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f75509x3bb8c379[org.p3371xd0ce3e8d.C29806x779f633f.Severity.LS_WARNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f75509x3bb8c379[org.p3371xd0ce3e8d.C29806x779f633f.Severity.LS_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: org.webrtc.Logging$Severity */
    /* loaded from: classes15.dex */
    public enum Severity {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    @java.lang.Deprecated
    /* renamed from: org.webrtc.Logging$TraceLevel */
    /* loaded from: classes5.dex */
    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(256),
        TRACE_TIMER(512),
        TRACE_STREAM(1024),
        TRACE_DEBUG(2048),
        TRACE_INFO(4096),
        TRACE_TERSEINFO(8192),
        TRACE_ALL(65535);


        /* renamed from: level */
        public final int f75532x6219b84;

        TraceLevel(int i17) {
            this.f75532x6219b84 = i17;
        }
    }

    /* renamed from: createFallbackLogger */
    private static java.util.logging.Logger m155670xa5195b2e() {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(java.util.logging.Level.ALL);
        return logger;
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        log(org.p3371xd0ce3e8d.C29806x779f633f.Severity.LS_INFO, str, str2);
    }

    /* renamed from: deleteInjectedLoggable */
    public static void m155671xdecef58() {
        f75506x786ed17d = null;
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        log(org.p3371xd0ce3e8d.C29806x779f633f.Severity.LS_ERROR, str, str2);
    }

    /* renamed from: enableLogThreads */
    public static void m155672x29be6da8() {
        m155678x4967f3df();
    }

    /* renamed from: enableLogTimeStamps */
    public static void m155673x3d3077de() {
        m155679xcdea3247();
    }

    /* renamed from: enableLogToDebugOutput */
    public static synchronized void m155674x23369e78(org.p3371xd0ce3e8d.C29806x779f633f.Severity severity) {
        synchronized (org.p3371xd0ce3e8d.C29806x779f633f.class) {
            if (f75506x786ed17d != null) {
                throw new java.lang.IllegalStateException("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
            }
            m155680x9a5f6f(severity.ordinal());
            f75508x6b469ee2 = true;
        }
    }

    @java.lang.Deprecated
    /* renamed from: enableTracing */
    public static void m155675x31a99bf(java.lang.String str, java.util.EnumSet<org.p3371xd0ce3e8d.C29806x779f633f.TraceLevel> enumSet) {
    }

    /* renamed from: getStackTraceString */
    private static java.lang.String m155676x2d915d84(java.lang.Throwable th6) {
        if (th6 == null) {
            return "";
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th6.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: injectLoggable */
    public static void m155677x31bfbe2e(org.p3371xd0ce3e8d.InterfaceC29805x7c49359d interfaceC29805x7c49359d, org.p3371xd0ce3e8d.C29806x779f633f.Severity severity) {
        if (interfaceC29805x7c49359d != null) {
            f75506x786ed17d = interfaceC29805x7c49359d;
            f75507xca6f7b9a = severity;
        }
    }

    public static void log(org.p3371xd0ce3e8d.C29806x779f633f.Severity severity, java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            throw new java.lang.IllegalArgumentException("Logging tag or message may not be null.");
        }
        if (f75506x786ed17d != null) {
            if (severity.ordinal() < f75507xca6f7b9a.ordinal()) {
                return;
            }
            f75506x786ed17d.mo155668x8781df62(str2, severity, str);
        } else {
            if (f75508x6b469ee2) {
                m155681xc3e74fad(severity.ordinal(), str, str2);
                return;
            }
            int i17 = org.p3371xd0ce3e8d.C29806x779f633f.AnonymousClass1.f75509x3bb8c379[severity.ordinal()];
            java.util.logging.Level level = i17 != 1 ? i17 != 2 ? i17 != 3 ? java.util.logging.Level.FINE : java.util.logging.Level.INFO : java.util.logging.Level.WARNING : java.util.logging.Level.SEVERE;
            f75505xefc85712.log(level, str + ": " + str2);
        }
    }

    /* renamed from: nativeEnableLogThreads */
    private static native void m155678x4967f3df();

    /* renamed from: nativeEnableLogTimeStamps */
    private static native void m155679xcdea3247();

    /* renamed from: nativeEnableLogToDebugOutput */
    private static native void m155680x9a5f6f(int i17);

    /* renamed from: nativeLog */
    private static native void m155681xc3e74fad(int i17, java.lang.String str, java.lang.String str2);

    public static void v(java.lang.String str, java.lang.String str2) {
        log(org.p3371xd0ce3e8d.C29806x779f633f.Severity.LS_VERBOSE, str, str2);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        log(org.p3371xd0ce3e8d.C29806x779f633f.Severity.LS_WARNING, str, str2);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        org.p3371xd0ce3e8d.C29806x779f633f.Severity severity = org.p3371xd0ce3e8d.C29806x779f633f.Severity.LS_ERROR;
        log(severity, str, str2);
        log(severity, str, th6.toString());
        log(severity, str, m155676x2d915d84(th6));
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        org.p3371xd0ce3e8d.C29806x779f633f.Severity severity = org.p3371xd0ce3e8d.C29806x779f633f.Severity.LS_WARNING;
        log(severity, str, str2);
        log(severity, str, th6.toString());
        log(severity, str, m155676x2d915d84(th6));
    }
}
