package uo;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final uo.n f511055a = new uo.n();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f511056b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f511057c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Throwable f511058d;

    /* renamed from: e, reason: collision with root package name */
    public static yz5.l f511059e;

    /* renamed from: f, reason: collision with root package name */
    public static android.app.Dialog f511060f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f511061g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f511062h;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f511056b = jz5.h.a(iVar, uo.g.f511045d);
        f511057c = jz5.h.a(iVar, uo.h.f511046d);
        f511061g = jz5.h.b(uo.b.f511038d);
        f511062h = jz5.h.b(uo.m.f511054d);
    }

    public final void a(android.content.Context context, java.lang.Class caller) {
        java.lang.StackTraceElement stackTraceElement;
        java.lang.StackTraceElement[] stackTrace;
        java.lang.StackTraceElement[] stackTrace2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(caller, "caller");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", "checkShowFailAlert: " + caller + ", mLastErr=" + f511058d + ", mErrAlertShow=" + f511059e + ", mErrAlertHold=" + f511060f + ", caller=" + caller.getName());
        java.lang.Throwable th6 = f511058d;
        boolean z17 = false;
        if (th6 != null && (stackTrace2 = th6.getStackTrace()) != null) {
            int length = stackTrace2.length;
            for (int i17 = 0; i17 < length; i17++) {
                stackTraceElement = stackTrace2[i17];
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stackTraceElement.getClassName(), caller.getName())) {
                    break;
                }
            }
        }
        stackTraceElement = null;
        if (stackTraceElement != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            if (!L.contains("last-open-camera-err-alert")) {
                L.putLong("last-open-camera-err-alert", java.lang.System.currentTimeMillis()).commit();
            }
            if (!c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", "notShow: disabled");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", "postShow");
            android.app.Dialog dialog = f511060f;
            if (dialog != null && dialog.isShowing()) {
                z17 = true;
            }
            if (!z17) {
                d().removeCallbacksAndMessages(null);
                d().postDelayed(new uo.c(context, null), 1000L);
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notShow: mLastErr=\n");
            java.lang.Throwable th7 = f511058d;
            sb6.append((th7 == null || (stackTrace = th7.getStackTrace()) == null) ? null : kz5.z.d0(stackTrace, "\n", null, null, 0, null, uo.d.f511041d, 30, null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", sb6.toString());
        }
        f511058d = null;
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraCompat", "dismiss: mErrAlertHold=" + f511060f);
        d().removeCallbacksAndMessages(null);
        android.app.Dialog dialog = f511060f;
        if (dialog != null) {
            dialog.dismiss();
        }
        ((android.os.Handler) f511057c.mo141623x754a37bb()).removeCallbacksAndMessages(null);
        f511058d = null;
    }

    public final boolean c() {
        return ((java.lang.Boolean) ((jz5.n) f511061g).mo141623x754a37bb()).booleanValue();
    }

    public final android.os.Handler d() {
        return (android.os.Handler) f511056b.mo141623x754a37bb();
    }

    public final void e(java.lang.Throwable err) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err, "err");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", "markOpenCameraFail");
        f511058d = err;
    }

    public final void f(android.content.Context context) {
        b();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        long j17 = L.getLong("last-open-camera-err-alert", 0L);
        if (j17 > 0) {
            d().postDelayed(new uo.i(java.lang.System.currentTimeMillis() - j17), 1000L);
        }
        L.remove("last-open-camera-err-alert");
    }

    public final void g(int i17, boolean z17, yz5.a cancelToken, yz5.p retryBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cancelToken, "cancelToken");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(retryBlock, "retryBlock");
        h(new uo.a(i17, new uo.j(z17, cancelToken)), retryBlock);
    }

    public final void h(uo.a aVar, yz5.p pVar) {
        jz5.g gVar = f511057c;
        ((android.os.Handler) gVar.mo141623x754a37bb()).removeCallbacksAndMessages(null);
        if (((java.lang.Boolean) ((jz5.n) f511062h).mo141623x754a37bb()).booleanValue()) {
            aVar.f511034c++;
            int i17 = aVar.f511035d;
            int b17 = i17 <= 0 ? aVar.f511032a : a06.d.b(i17 * aVar.f511037f);
            aVar.f511035d = b17;
            int i18 = aVar.f511036e + b17;
            aVar.f511036e = i18;
            if (!(i18 <= 30)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", "postRetryOpenCamera NO: count=" + aVar.f511034c);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", "postRetryOpenCamera YES: count=" + aVar.f511034c + ", curr=" + aVar.f511035d + ", sum=" + aVar.f511036e);
            ((android.os.Handler) gVar.mo141623x754a37bb()).postDelayed(new uo.l(aVar, pVar), ((long) aVar.f511035d) * 1000);
        }
    }
}
