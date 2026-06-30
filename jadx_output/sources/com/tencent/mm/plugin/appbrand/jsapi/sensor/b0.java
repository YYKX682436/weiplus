package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class b0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f82982h = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f82985c;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.utils.f4 f82987e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.utils.f4 f82988f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.utils.f4 f82989g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f82983a = false;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f82984b = "";

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.sensor.a0 f82986d = new com.tencent.mm.plugin.appbrand.jsapi.sensor.a0();

    public b0() {
        com.tencent.mm.plugin.appbrand.utils.f4 f4Var = com.tencent.mm.plugin.appbrand.utils.f4.NONE;
        this.f82987e = f4Var;
        this.f82988f = f4Var;
        this.f82989g = f4Var;
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.sensor.b0 a(java.lang.String str, boolean z17) {
        iz5.a.c(null, android.text.TextUtils.isEmpty(str));
        java.util.Map map = f82982h;
        synchronized (map) {
            com.tencent.mm.plugin.appbrand.jsapi.sensor.b0 b0Var = (com.tencent.mm.plugin.appbrand.jsapi.sensor.b0) ((java.util.HashMap) map).get(str);
            if (b0Var == null) {
                if (!z17) {
                    return null;
                }
                b0Var = new com.tencent.mm.plugin.appbrand.jsapi.sensor.b0();
                b0Var.f82984b = str;
                ((java.util.HashMap) map).put(str, b0Var);
            }
            return b0Var;
        }
    }

    public static void b(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsapi.sensor.b0 b0Var;
        iz5.a.c(null, android.text.TextUtils.isEmpty(str));
        java.util.Map map = f82982h;
        synchronized (map) {
            b0Var = (com.tencent.mm.plugin.appbrand.jsapi.sensor.b0) ((java.util.HashMap) map).remove(str);
        }
        if (b0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OrientationConfigListenerHelper", "stopListen appId:%s", b0Var.f82984b);
            b0Var.f82984b = "";
            b0Var.f82985c = null;
            b0Var.f82983a = false;
            b0Var.f82988f = com.tencent.mm.plugin.appbrand.utils.f4.NONE;
        }
    }

    public final synchronized void c(com.tencent.mm.plugin.appbrand.utils.f4 f4Var) {
        if (f4Var == this.f82989g) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OrientationConfigListenerHelper", "hy: unexpected redundant orientation fired");
            return;
        }
        this.f82989g = f4Var;
        com.tencent.mm.plugin.appbrand.jsapi.sensor.a0 a0Var = this.f82986d;
        a0Var.getClass();
        java.lang.String replace = f4Var.name().replace("_", "");
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("errMsg", "ok");
        hashMap.put("value", replace);
        try {
            a0Var.t(hashMap);
            a0Var.m();
        } catch (java.lang.NullPointerException unused) {
        }
    }

    public final void d(com.tencent.mm.plugin.appbrand.utils.f4 f4Var) {
        android.view.Window window;
        android.view.View decorView;
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82985c;
        if (lVar == null) {
            return;
        }
        android.app.Activity a17 = q75.a.a(lVar.getContext());
        if (a17 == null || (window = a17.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            c(f4Var);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.sensor.d0 d0Var = new com.tencent.mm.plugin.appbrand.jsapi.sensor.d0(this, f4Var);
        viewTreeObserver.addOnGlobalLayoutListener(new com.tencent.mm.plugin.appbrand.jsapi.sensor.c0(this, viewTreeObserver, d0Var));
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
        t0Var.getClass();
        t0Var.z(d0Var, 100L, false);
    }
}
