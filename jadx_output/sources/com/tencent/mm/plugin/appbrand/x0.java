package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Iterator f92366a = new com.tencent.mm.plugin.appbrand.t0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f92367b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f92368c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final ik1.x f92369d = new ik1.x();

    /* renamed from: e, reason: collision with root package name */
    public static final ik1.x f92370e = new ik1.x();

    public static void a(java.lang.String str, com.tencent.mm.plugin.appbrand.v0 v0Var) {
        if (android.text.TextUtils.isEmpty(str) || v0Var == null) {
            return;
        }
        f92369d.e(str, v0Var);
    }

    public static com.tencent.mm.plugin.appbrand.u0 b(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.u0 u0Var = (com.tencent.mm.plugin.appbrand.u0) ((java.util.HashMap) f92367b).get(str);
        return u0Var == null ? com.tencent.mm.plugin.appbrand.u0.INIT : u0Var;
    }

    public static java.util.Iterator c(java.lang.String str) {
        java.util.Set d17 = f92369d.d(str);
        return d17 != null ? d17.iterator() : f92366a;
    }

    public static com.tencent.mm.plugin.appbrand.w0 d(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.w0 w0Var = (com.tencent.mm.plugin.appbrand.w0) ((java.util.HashMap) f92368c).get(str);
        return w0Var == null ? com.tencent.mm.plugin.appbrand.w0.HIDE : w0Var;
    }

    public static void e(java.lang.String str, com.tencent.mm.plugin.appbrand.v0 v0Var) {
        if (v0Var == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f92369d.f(str, v0Var);
    }

    public static void f(java.lang.String str, com.tencent.mm.plugin.appbrand.u0 u0Var) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        ((java.util.HashMap) f92367b).put(str, u0Var);
    }

    public static void g(java.lang.String str, com.tencent.mm.plugin.appbrand.w0 w0Var) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLifeCycle", "setPauseType, appId: %s, type: %s", str, w0Var);
        ((java.util.HashMap) f92368c).put(str, w0Var);
    }
}
