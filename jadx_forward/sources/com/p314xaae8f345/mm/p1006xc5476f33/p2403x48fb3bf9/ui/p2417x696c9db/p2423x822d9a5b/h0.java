package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0 f265734a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f265735b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.g0.f265732d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f265736c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f265737d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f265738e = new java.util.concurrent.atomic.AtomicReference(null);

    /* renamed from: f, reason: collision with root package name */
    public static final gp1.z f265739f = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.e0();

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0 h0Var, android.content.Intent intent) {
        h0Var.getClass();
        try {
            java.lang.String stringExtra = intent.getStringExtra("float_ball_key");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 c17 = h0Var.c(stringExtra);
            if (c17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallManager", "onBallRemove " + intent.getStringExtra("rawUrl"));
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.f0(stringExtra, c17));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewFloatBallManager", "onRemove is null, " + e17.getMessage());
        }
    }

    public static final boolean d() {
        return ((java.lang.Boolean) ((jz5.n) f265735b).mo141623x754a37bb()).booleanValue();
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.y yVar) {
        if (yVar != null && java.lang.Math.abs(java.lang.System.currentTimeMillis() - yVar.f265775d) >= 1800000) {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.b0(yVar), "WebViewFloatBallThread");
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 c(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        java.lang.ref.SoftReference softReference = (java.lang.ref.SoftReference) f265736c.get(id6);
        if (softReference != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) softReference.get();
        }
        return null;
    }

    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        if (c16601x7ed0e40c == null) {
            return;
        }
        r45.k97 k97Var = new r45.k97();
        try {
            k97Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
            java.lang.String m75945x2fec8307 = k97Var.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                return;
            }
            java.lang.String m75945x2fec83072 = k97Var.m75945x2fec8307(27);
            java.lang.String str = c16601x7ed0e40c.f66791xc8a07680;
            if (str == null) {
                return;
            }
            b(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.y(m75945x2fec8307, m75945x2fec83072, str, c16601x7ed0e40c.f66794xa783a79b));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewFloatBallManager", "WebMultiTaskData parse fail", th6);
        }
    }

    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        if (c16601x7ed0e40c == null) {
            return;
        }
        r45.k97 k97Var = new r45.k97();
        try {
            k97Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
            java.lang.String m75945x2fec8307 = k97Var.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                return;
            }
            java.lang.String m75945x2fec83072 = k97Var.m75945x2fec8307(27);
            java.lang.String str = c16601x7ed0e40c.f66791xc8a07680;
            if (str == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.y(m75945x2fec8307, m75945x2fec83072, str, c16601x7ed0e40c.f66794xa783a79b);
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.d0(yVar), "WebViewFloatBallThread");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewFloatBallManager", "WebMultiTaskData parse fail", th6);
        }
    }

    public final void g(java.lang.String id6, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        f265736c.put(id6, new java.lang.ref.SoftReference(controller));
    }
}
