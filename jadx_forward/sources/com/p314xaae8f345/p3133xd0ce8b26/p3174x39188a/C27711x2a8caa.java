package com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a;

/* renamed from: com.tencent.wechat.zlog.Zlog */
/* loaded from: classes11.dex */
public class C27711x2a8caa {

    /* renamed from: a, reason: collision with root package name */
    public static final hw5.a f301564a;

    static {
        new java.util.concurrent.atomic.AtomicBoolean(false);
        new java.util.concurrent.atomic.AtomicBoolean(false);
        f301564a = hw5.a.DEBUG;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("zlog_binding");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wechat/zlog/Zlog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wechat/zlog/Zlog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        d(hw5.a.DEBUG, str, str2, objArr);
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        d(hw5.a.FATAL, str, str2, objArr);
        throw new java.lang.IllegalStateException("FATAL log triggered");
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        d(hw5.a.INFO, str, str2, objArr);
    }

    public static void d(hw5.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (aVar.ordinal() < f301564a.f367131d) {
            return;
        }
        if (objArr != null && objArr.length > 0) {
            str2 = java.lang.String.format(str2, objArr);
        }
        if (str2.length() > 8192) {
            str2 = str2.substring(0, 8192);
        }
        m119656x58bfb91b(aVar.ordinal(), str, "", "", 0, str2);
    }

    /* renamed from: zlogw_flush */
    private static native void m119653x58304172();

    /* renamed from: zlogw_init_file_config */
    private static native void m119654xfbd79b88(com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27713xbe97428 c27713xbe97428);

    /* renamed from: zlogw_init_zlog */
    private static native void m119655x6da235c7(com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27712x3936f379 c27712x3936f379);

    /* renamed from: zlogw_print */
    private static native void m119656x58bfb91b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4);

    /* renamed from: zlogw_set_pass_through_mode */
    private static native void m119657x419c01c();
}
