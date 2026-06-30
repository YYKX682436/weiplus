package c.t.m.p134x35c0ce.c;

/* loaded from: classes13.dex */
public class m implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f118440a = com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.class.getPackage().getName();

    /* renamed from: b, reason: collision with root package name */
    public static c.t.m.p134x35c0ce.c.m f118441b = null;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f118442c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Thread.UncaughtExceptionHandler f118443d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f118444e = false;

    public m(android.content.Context context) {
        this.f118442c = context;
    }

    public static c.t.m.p134x35c0ce.c.m a(android.content.Context context) {
        if (f118441b == null) {
            synchronized (c.t.m.p134x35c0ce.c.m.class) {
                if (f118441b == null) {
                    f118441b = new c.t.m.p134x35c0ce.c.m(context);
                }
            }
        }
        return f118441b;
    }

    public final java.lang.String b(java.lang.Throwable th6) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
            th6.printStackTrace(printWriter);
            for (java.lang.Throwable cause = th6.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            printWriter.close();
            stringBuffer.append(stringWriter.toString());
        } catch (java.lang.Throwable unused) {
        }
        return stringBuffer.toString();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        if (a(th6) && this.f118442c != null) {
            java.lang.String b17 = b(th6);
            if (!b17.contains("onLocationChanged") && !b17.contains("onStatusUpdate")) {
                c.t.m.p134x35c0ce.c.q.d(this.f118442c, "__bad_dex_info___sapp", c.t.m.p134x35c0ce.c.q.f118451d);
                c.t.m.p134x35c0ce.c.q.b(this.f118442c, "__loc_sdk_run_duration___sapp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c.t.m.p134x35c0ce.c.q.f118452e));
                java.lang.String str = "EXP:" + c.t.m.p134x35c0ce.c.q.f118451d + "," + b17;
                if (str.contains("\n")) {
                    str = str.replaceAll("\n", "\\$");
                }
                c.t.m.p134x35c0ce.c.i.a(str);
                com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053.m34915x9cf0d20b(this.f118442c).m34924x3948a3a6(null);
                return;
            }
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f118443d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th6);
        }
    }

    public final boolean a(java.lang.Throwable th6) {
        if (th6 == null) {
            return false;
        }
        while (th6 != null) {
            for (java.lang.StackTraceElement stackTraceElement : th6.getStackTrace()) {
                if ("TLSAPP".equals(stackTraceElement.getFileName())) {
                    return true;
                }
            }
            th6 = th6.getCause();
        }
        return false;
    }

    public void a() {
        if (this.f118444e) {
            return;
        }
        this.f118443d = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(f118441b);
        this.f118444e = true;
    }
}
