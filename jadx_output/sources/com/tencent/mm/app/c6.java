package com.tencent.mm.app;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'MATCH_MM' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes12.dex */
public final class c6 {
    private static final /* synthetic */ com.tencent.mm.app.c6[] $VALUES;
    public static final com.tencent.mm.app.c6 MATCH_APPBRAND;
    public static final com.tencent.mm.app.c6 MATCH_APPBRAND1;
    public static final com.tencent.mm.app.c6 MATCH_BACKTRACE__;
    public static final com.tencent.mm.app.c6 MATCH_CUPLOADER;
    public static final com.tencent.mm.app.c6 MATCH_DEXOPT;
    public static final com.tencent.mm.app.c6 MATCH_EXDEVICE;
    public static final com.tencent.mm.app.c6 MATCH_EXTMIG;
    public static final com.tencent.mm.app.c6 MATCH_FALLBACK;
    public static final com.tencent.mm.app.c6 MATCH_HLD;
    public static final com.tencent.mm.app.c6 MATCH_HLDFL;
    public static final com.tencent.mm.app.c6 MATCH_HOTPOT_DOTDOT;
    public static final com.tencent.mm.app.c6 MATCH_ISOLATED_PROCESS;
    public static final com.tencent.mm.app.c6 MATCH_JECTL;
    public static final com.tencent.mm.app.c6 MATCH_LITE;
    public static final com.tencent.mm.app.c6 MATCH_MAGIC_EMOJI;
    public static final com.tencent.mm.app.c6 MATCH_MM;
    public static final com.tencent.mm.app.c6 MATCH_NOSPACE;
    public static final com.tencent.mm.app.c6 MATCH_NOT_PLAIN_NOT_ISOLATED_PROCESSES;
    public static final com.tencent.mm.app.c6 MATCH_NOT_PLAIN_PROCESSES;
    public static final com.tencent.mm.app.c6 MATCH_OPENGL_DETECTOR;
    public static final com.tencent.mm.app.c6 MATCH_PATCH;
    public static final com.tencent.mm.app.c6 MATCH_PLAYCORE_MISSING_SPLITS_ACTIVITY;
    public static final com.tencent.mm.app.c6 MATCH_PUSH;
    public static final com.tencent.mm.app.c6 MATCH_RECOVERY;
    public static final com.tencent.mm.app.c6 MATCH_RES_CAN_WORKER;
    public static final com.tencent.mm.app.c6 MATCH_RUBBISHBIN;
    public static final com.tencent.mm.app.c6 MATCH_SANDBOX;
    public static final com.tencent.mm.app.c6 MATCH_SUPPORT;
    public static final com.tencent.mm.app.c6 MATCH_SWITCH;
    public static final com.tencent.mm.app.c6 MATCH_TM_ASSISTANT_DOWNLOAD_SDK_SERVICE;
    public static final com.tencent.mm.app.c6 MATCH_TOOLS;
    public static final com.tencent.mm.app.c6 MATCH_XWEB_PRIVILEGED_PROCESS;
    public static final com.tencent.mm.app.c6 MATCH_XWEB_PRIVILEGED_PROCESS_APPBRAND;
    public static final com.tencent.mm.app.c6 MATCH_XWEB_SANDBOXED_PROCESS;
    public static final com.tencent.mm.app.c6 MATCH_XWEB_SANDBOXED_PROCESS_EX;
    public static final com.tencent.mm.app.c6 MATCH_XWEB_SANDBOXED_PROCESS_EX_APPBRAND;
    private final int[] mCachedResult = {-1};
    private final java.lang.Object mExpected;
    private final com.tencent.mm.app.b6 mMatchAction;

    private static /* synthetic */ com.tencent.mm.app.c6[] $values() {
        return new com.tencent.mm.app.c6[]{MATCH_MM, MATCH_PUSH, MATCH_TOOLS, MATCH_APPBRAND, MATCH_APPBRAND1, MATCH_SANDBOX, MATCH_EXDEVICE, MATCH_SUPPORT, MATCH_CUPLOADER, MATCH_PATCH, MATCH_HOTPOT_DOTDOT, MATCH_FALLBACK, MATCH_DEXOPT, MATCH_RECOVERY, MATCH_NOSPACE, MATCH_JECTL, MATCH_OPENGL_DETECTOR, MATCH_RUBBISHBIN, MATCH_ISOLATED_PROCESS, MATCH_XWEB_SANDBOXED_PROCESS, MATCH_XWEB_SANDBOXED_PROCESS_EX, MATCH_XWEB_SANDBOXED_PROCESS_EX_APPBRAND, MATCH_XWEB_PRIVILEGED_PROCESS, MATCH_XWEB_PRIVILEGED_PROCESS_APPBRAND, MATCH_RES_CAN_WORKER, MATCH_EXTMIG, MATCH_BACKTRACE__, MATCH_TM_ASSISTANT_DOWNLOAD_SDK_SERVICE, MATCH_SWITCH, MATCH_LITE, MATCH_HLD, MATCH_PLAYCORE_MISSING_SPLITS_ACTIVITY, MATCH_HLDFL, MATCH_MAGIC_EMOJI, MATCH_NOT_PLAIN_PROCESSES, MATCH_NOT_PLAIN_NOT_ISOLATED_PROCESSES};
    }

    static {
        com.tencent.mm.app.b6 b6Var = com.tencent.mm.app.b6.f53340d;
        MATCH_MM = new com.tencent.mm.app.c6("MATCH_MM", 0, b6Var, com.tencent.mm.app.v5.f53851h);
        MATCH_PUSH = new com.tencent.mm.app.c6("MATCH_PUSH", 1, b6Var, com.tencent.mm.app.v5.f53852i);
        MATCH_TOOLS = new com.tencent.mm.app.c6("MATCH_TOOLS", 2, b6Var, com.tencent.mm.app.v5.f53853m);
        com.tencent.mm.app.b6 b6Var2 = com.tencent.mm.app.b6.f53341e;
        MATCH_APPBRAND = new com.tencent.mm.app.c6("MATCH_APPBRAND", 3, b6Var2, ":appbrand");
        MATCH_APPBRAND1 = new com.tencent.mm.app.c6("MATCH_APPBRAND1", 4, b6Var, com.tencent.mm.app.v5.f53854n);
        MATCH_SANDBOX = new com.tencent.mm.app.c6("MATCH_SANDBOX", 5, b6Var, com.tencent.mm.app.v5.f53855o);
        MATCH_EXDEVICE = new com.tencent.mm.app.c6("MATCH_EXDEVICE", 6, b6Var, com.tencent.mm.app.v5.f53856p);
        MATCH_SUPPORT = new com.tencent.mm.app.c6("MATCH_SUPPORT", 7, b6Var, com.tencent.mm.app.v5.f53857q);
        MATCH_CUPLOADER = new com.tencent.mm.app.c6("MATCH_CUPLOADER", 8, b6Var, com.tencent.mm.app.v5.f53858r);
        MATCH_PATCH = new com.tencent.mm.app.c6("MATCH_PATCH", 9, b6Var, com.tencent.mm.app.v5.f53859s);
        MATCH_HOTPOT_DOTDOT = new com.tencent.mm.app.c6("MATCH_HOTPOT_DOTDOT", 10, b6Var, com.tencent.mm.app.v5.f53860t);
        MATCH_FALLBACK = new com.tencent.mm.app.c6("MATCH_FALLBACK", 11, b6Var, com.tencent.mm.app.v5.f53861u);
        MATCH_DEXOPT = new com.tencent.mm.app.c6("MATCH_DEXOPT", 12, b6Var, com.tencent.mm.app.v5.f53862v);
        MATCH_RECOVERY = new com.tencent.mm.app.c6("MATCH_RECOVERY", 13, b6Var, com.tencent.mm.app.v5.f53863w);
        MATCH_NOSPACE = new com.tencent.mm.app.c6("MATCH_NOSPACE", 14, b6Var, com.tencent.mm.app.v5.f53864x);
        MATCH_JECTL = new com.tencent.mm.app.c6("MATCH_JECTL", 15, b6Var, com.tencent.mm.app.v5.f53865y);
        MATCH_OPENGL_DETECTOR = new com.tencent.mm.app.c6("MATCH_OPENGL_DETECTOR", 16, b6Var, com.tencent.mm.app.v5.f53866z);
        MATCH_RUBBISHBIN = new com.tencent.mm.app.c6("MATCH_RUBBISHBIN", 17, b6Var, com.tencent.mm.app.v5.A);
        MATCH_ISOLATED_PROCESS = new com.tencent.mm.app.c6("MATCH_ISOLATED_PROCESS", 18, b6Var2, ":isolated_process");
        MATCH_XWEB_SANDBOXED_PROCESS = new com.tencent.mm.app.c6("MATCH_XWEB_SANDBOXED_PROCESS", 19, b6Var2, ":xweb_sandboxed_process_");
        MATCH_XWEB_SANDBOXED_PROCESS_EX = new com.tencent.mm.app.c6("MATCH_XWEB_SANDBOXED_PROCESS_EX", 20, b6Var2, ":xweb_sandboxed_process_ex_");
        MATCH_XWEB_SANDBOXED_PROCESS_EX_APPBRAND = new com.tencent.mm.app.c6("MATCH_XWEB_SANDBOXED_PROCESS_EX_APPBRAND", 21, b6Var2, ":xweb_sandboxed_process_ex_appbrand_");
        MATCH_XWEB_PRIVILEGED_PROCESS = new com.tencent.mm.app.c6("MATCH_XWEB_PRIVILEGED_PROCESS", 22, b6Var2, ":xweb_privileged_process_");
        MATCH_XWEB_PRIVILEGED_PROCESS_APPBRAND = new com.tencent.mm.app.c6("MATCH_XWEB_PRIVILEGED_PROCESS_APPBRAND", 23, b6Var2, ":xweb_privileged_process_appbrand_");
        MATCH_RES_CAN_WORKER = new com.tencent.mm.app.c6("MATCH_RES_CAN_WORKER", 24, b6Var, com.tencent.mm.app.v5.B);
        MATCH_EXTMIG = new com.tencent.mm.app.c6("MATCH_EXTMIG", 25, b6Var, com.tencent.mm.app.v5.C);
        MATCH_BACKTRACE__ = new com.tencent.mm.app.c6("MATCH_BACKTRACE__", 26, b6Var, com.tencent.mm.app.v5.D);
        MATCH_TM_ASSISTANT_DOWNLOAD_SDK_SERVICE = new com.tencent.mm.app.c6("MATCH_TM_ASSISTANT_DOWNLOAD_SDK_SERVICE", 27, b6Var, com.tencent.mm.app.v5.E);
        MATCH_SWITCH = new com.tencent.mm.app.c6("MATCH_SWITCH", 28, b6Var, com.tencent.mm.app.v5.F);
        MATCH_LITE = new com.tencent.mm.app.c6("MATCH_LITE", 29, b6Var, com.tencent.mm.app.v5.H);
        MATCH_HLD = new com.tencent.mm.app.c6("MATCH_HLD", 30, b6Var, com.tencent.mm.app.v5.G);
        MATCH_PLAYCORE_MISSING_SPLITS_ACTIVITY = new com.tencent.mm.app.c6("MATCH_PLAYCORE_MISSING_SPLITS_ACTIVITY", 31, b6Var, com.tencent.mm.app.v5.I);
        MATCH_HLDFL = new com.tencent.mm.app.c6("MATCH_HLDFL", 32, b6Var, com.tencent.mm.app.v5.f53850J);
        MATCH_MAGIC_EMOJI = new com.tencent.mm.app.c6("MATCH_MAGIC_EMOJI", 33, b6Var, com.tencent.mm.app.v5.K);
        MATCH_NOT_PLAIN_PROCESSES = new com.tencent.mm.app.c6("MATCH_NOT_PLAIN_PROCESSES", 34, com.tencent.mm.app.b6.f53342f, null);
        MATCH_NOT_PLAIN_NOT_ISOLATED_PROCESSES = new com.tencent.mm.app.c6("MATCH_NOT_PLAIN_NOT_ISOLATED_PROCESSES", 35, com.tencent.mm.app.b6.f53343g, null);
        $VALUES = $values();
    }

    private c6(java.lang.String str, int i17, com.tencent.mm.app.b6 b6Var, java.lang.Object obj) {
        this.mMatchAction = b6Var;
        this.mExpected = obj;
    }

    public static com.tencent.mm.app.c6 valueOf(java.lang.String str) {
        return (com.tencent.mm.app.c6) java.lang.Enum.valueOf(com.tencent.mm.app.c6.class, str);
    }

    public static com.tencent.mm.app.c6[] values() {
        return (com.tencent.mm.app.c6[]) $VALUES.clone();
    }

    public final boolean matches(android.content.Context context) {
        int[] iArr = this.mCachedResult;
        if (iArr[0] == -1) {
            synchronized (iArr) {
                if (this.mCachedResult[0] == -1) {
                    com.tencent.mm.app.v5 a17 = com.tencent.mm.app.v5.a(context);
                    if (a17 == null) {
                        return false;
                    }
                    this.mCachedResult[0] = this.mMatchAction.a(a17, this.mExpected) ? 1 : 0;
                }
            }
        }
        return this.mCachedResult[0] == 1;
    }
}
