package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f302098a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f302099b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f302100c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static void a() {
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("Calling WebView methods on another thread than the UI thread.");
        }
        if (f302100c.getAndSet(true)) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        by5.c4.f("SysWebFactory.PreIniter", "ensureSystemWebViewGlobalLooper, init system webview");
        android.webkit.CookieManager.getInstance();
        android.webkit.CookieSyncManager.createInstance(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c);
        new android.webkit.WebView(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c).destroy();
        by5.c4.f("SysWebFactory.PreIniter", "ensureSystemWebViewGlobalLooper cost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
    }

    public static boolean b() {
        if (f302099b == null) {
            f302099b = java.lang.Boolean.valueOf(by5.d4.a("SysWebFactory.PreIniter", false).getBoolean("isEnforceMainLooper", false));
        }
        return f302099b.booleanValue();
    }
}
