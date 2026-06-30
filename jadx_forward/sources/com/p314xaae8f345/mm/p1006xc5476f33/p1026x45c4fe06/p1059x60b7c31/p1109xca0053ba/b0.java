package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba;

/* loaded from: classes7.dex */
public class b0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f164515h = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f164518c;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f164520e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f164521f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f164522g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f164516a = false;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f164517b = "";

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.a0 f164519d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.a0();

    public b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.NONE;
        this.f164520e = f4Var;
        this.f164521f = f4Var;
        this.f164522g = f4Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0 a(java.lang.String str, boolean z17) {
        iz5.a.c(null, android.text.TextUtils.isEmpty(str));
        java.util.Map map = f164515h;
        synchronized (map) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0) ((java.util.HashMap) map).get(str);
            if (b0Var == null) {
                if (!z17) {
                    return null;
                }
                b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0();
                b0Var.f164517b = str;
                ((java.util.HashMap) map).put(str, b0Var);
            }
            return b0Var;
        }
    }

    public static void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0 b0Var;
        iz5.a.c(null, android.text.TextUtils.isEmpty(str));
        java.util.Map map = f164515h;
        synchronized (map) {
            b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0) ((java.util.HashMap) map).remove(str);
        }
        if (b0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OrientationConfigListenerHelper", "stopListen appId:%s", b0Var.f164517b);
            b0Var.f164517b = "";
            b0Var.f164518c = null;
            b0Var.f164516a = false;
            b0Var.f164521f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.NONE;
        }
    }

    public final synchronized void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var) {
        if (f4Var == this.f164522g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OrientationConfigListenerHelper", "hy: unexpected redundant orientation fired");
            return;
        }
        this.f164522g = f4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.a0 a0Var = this.f164519d;
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

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var) {
        android.view.Window window;
        android.view.View decorView;
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f164518c;
        if (lVar == null) {
            return;
        }
        android.app.Activity a17 = q75.a.a(lVar.mo50352x76847179());
        if (a17 == null || (window = a17.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            c(f4Var);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.d0 d0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.d0(this, f4Var);
        viewTreeObserver.addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.c0(this, viewTreeObserver, d0Var));
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
        t0Var.getClass();
        t0Var.z(d0Var, 100L, false);
    }
}
