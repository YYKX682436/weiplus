package c.t.m.sapp.c;

/* loaded from: classes13.dex */
public class m implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f36907a = com.tencent.map.geolocation.sapp.TencentLocation.class.getPackage().getName();

    /* renamed from: b, reason: collision with root package name */
    public static c.t.m.sapp.c.m f36908b = null;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f36909c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Thread.UncaughtExceptionHandler f36910d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f36911e = false;

    public m(android.content.Context context) {
        this.f36909c = context;
    }

    public static c.t.m.sapp.c.m a(android.content.Context context) {
        if (f36908b == null) {
            synchronized (c.t.m.sapp.c.m.class) {
                if (f36908b == null) {
                    f36908b = new c.t.m.sapp.c.m(context);
                }
            }
        }
        return f36908b;
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
        if (a(th6) && this.f36909c != null) {
            java.lang.String b17 = b(th6);
            if (!b17.contains("onLocationChanged") && !b17.contains("onStatusUpdate")) {
                c.t.m.sapp.c.q.d(this.f36909c, "__bad_dex_info___sapp", c.t.m.sapp.c.q.f36918d);
                c.t.m.sapp.c.q.b(this.f36909c, "__loc_sdk_run_duration___sapp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c.t.m.sapp.c.q.f36919e));
                java.lang.String str = "EXP:" + c.t.m.sapp.c.q.f36918d + "," + b17;
                if (str.contains("\n")) {
                    str = str.replaceAll("\n", "\\$");
                }
                c.t.m.sapp.c.i.a(str);
                com.tencent.map.geolocation.sapp.TencentLocationManager.getInstance(this.f36909c).removeUpdates(null);
                return;
            }
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f36910d;
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
        if (this.f36911e) {
            return;
        }
        this.f36910d = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(f36908b);
        this.f36911e = true;
    }
}
