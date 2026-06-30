package yt3;

/* loaded from: classes10.dex */
public final class r3 extends yt3.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f547159d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f547160e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 f547161f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f547162g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f547163h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f547164i;

    /* renamed from: m, reason: collision with root package name */
    public int f547165m;

    /* renamed from: n, reason: collision with root package name */
    public int f547166n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f547167o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f547168p;

    /* renamed from: q, reason: collision with root package name */
    public final int f547169q;

    /* renamed from: r, reason: collision with root package name */
    public long f547170r;

    /* renamed from: s, reason: collision with root package name */
    public int f547171s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f547172t;

    /* renamed from: u, reason: collision with root package name */
    public int f547173u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.l f547174v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f547175w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.concurrent.Future f547176x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f547177y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f547178z;

    public r3(android.widget.RelativeLayout layout, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547159d = layout;
        this.f547160e = status;
        android.view.View findViewById = layout.findViewById(com.p314xaae8f345.mm.R.id.lok);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360) findViewById;
        this.f547161f = c16551xff789360;
        android.view.View findViewById2 = layout.findViewById(com.p314xaae8f345.mm.R.id.b6r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f547162g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = layout.findViewById(com.p314xaae8f345.mm.R.id.b6t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f547163h = findViewById3;
        this.f547164i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f547165m = 10000;
        this.f547166n = 10000;
        this.f547169q = 500;
        this.f547170r = -1L;
        this.f547173u = com.p314xaae8f345.mm.R.C30867xcad56011.f574076gw4;
        this.f547175w = new yt3.h3(this);
        this.f547177y = true;
        this.f547178z = i65.a.r(layout.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.ht6);
        c16551xff789360.m66975xee2457b4(new yt3.e3(this));
    }

    @Override // yt3.b
    public void a() {
        java.util.concurrent.Future future = this.f547176x;
        if (future != null) {
            future.cancel(false);
        }
        android.view.View view = this.f547163h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin", "dismissPermissionHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin", "dismissPermissionHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yt3.b
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        int i17 = config.f237218w;
        this.f547166n = i17;
        this.f547165m = i17 + 250;
        com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = config.f237210o;
        this.f547171s = c10402x5bc41468 != null ? c10402x5bc41468.f146320s : 0;
        java.lang.Boolean enablePicture = config.f237214s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enablePicture, "enablePicture");
        this.f547167o = enablePicture.booleanValue();
        java.lang.Boolean enableVideo = config.f237215t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enableVideo, "enableVideo");
        this.f547168p = enableVideo.booleanValue();
        java.lang.Boolean enablePicture2 = config.f237214s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enablePicture2, "enablePicture");
        boolean booleanValue = enablePicture2.booleanValue();
        android.widget.TextView textView = this.f547162g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360 = this.f547161f;
        if (booleanValue) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574077gw5);
            c16551xff789360.m66975xee2457b4(new yt3.k3(this));
        }
        java.lang.Boolean enableVideo2 = config.f237215t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enableVideo2, "enableVideo");
        if (enableVideo2.booleanValue()) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gw6);
            c16551xff789360.m66973x86d19c4a(new yt3.m3(this));
            c16551xff789360.m66974x7f8af277(new yt3.n3(this));
        }
        java.lang.Boolean enablePicture3 = config.f237214s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enablePicture3, "enablePicture");
        if (enablePicture3.booleanValue()) {
            java.lang.Boolean enableVideo3 = config.f237215t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enableVideo3, "enableVideo");
            if (enableVideo3.booleanValue()) {
                this.f547173u = com.p314xaae8f345.mm.R.C30867xcad56011.f574076gw4;
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574076gw4);
            }
        }
    }

    @Override // yt3.b
    public boolean c() {
        return this.f547161f.f230732i;
    }

    @Override // yt3.b
    public void d() {
        if (!this.f547167o) {
            s();
        } else {
            ju3.d0.k(this.f547160e, ju3.c0.f383434s, null, 2, null);
        }
    }

    @Override // yt3.b
    public void e(int i17) {
    }

    @Override // yt3.b
    public void f(boolean z17) {
    }

    @Override // yt3.b
    public void g(boolean z17) {
        this.f547177y = z17;
    }

    @Override // yt3.b
    public void h(int i17, int i18) {
    }

    @Override // yt3.b
    public void i(boolean z17) {
    }

    @Override // yt3.b
    public void j(android.view.View.OnClickListener clickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickListener, "clickListener");
        if (this.f547162g.getVisibility() == 0) {
            java.util.concurrent.Future future = this.f547176x;
            if (future != null) {
                future.cancel(false);
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            yt3.o3 o3Var = new yt3.o3(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            this.f547176x = t0Var.z(o3Var, 2000L, false);
        } else {
            android.view.View view = this.f547163h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin", "showPermissionAfterHint", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin", "showPermissionAfterHint", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f547163h.setOnClickListener(clickListener);
    }

    @Override // yt3.b
    public void k() {
        this.f547161f.k();
    }

    public final void m(boolean z17) {
        this.f547167o = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360 = this.f547161f;
        android.widget.TextView textView = this.f547162g;
        if (z17) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574077gw5);
            c16551xff789360.m66975xee2457b4(new yt3.f3(this));
        } else {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gw6);
            c16551xff789360.m66975xee2457b4(null);
        }
    }

    public final void n(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360 = this.f547161f;
        c16551xff789360.m66976xbc91ffe0(false);
        this.f547164i.mo50297x7c4d7ca2(new yt3.i3(this), 1500L);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", z17);
        this.f547160e.w(ju3.c0.f383420m, bundle);
        c16551xff789360.announceForAccessibility(i65.a.r(c16551xff789360.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571506h2));
    }

    public final void o(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360 = this.f547161f;
        int size = c16551xff789360.f230731h.m66961xec84eb57().size();
        if (size <= 0 || i17 == size) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16550xff5236a c16550xff5236a = c16551xff789360.f230731h;
        java.util.ArrayList arrayList = c16550xff5236a.f230724y;
        if (arrayList.size() > 0) {
            arrayList.remove(arrayList.size() - 1);
            if (arrayList.size() > 0) {
                c16550xff5236a.f230716q = ((java.lang.Float) arrayList.get(arrayList.size() - 1)).floatValue();
            } else {
                c16550xff5236a.f230716q = 0.0f;
            }
            c16550xff5236a.invalidate();
        }
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        this.f547159d.setVisibility(0);
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360 = this.f547161f;
        if (!c16551xff789360.f230732i) {
            return false;
        }
        c16551xff789360.k();
        return true;
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        this.f547159d.setVisibility(4);
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        this.f547161f.k();
    }

    public final void p(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360 = this.f547161f;
        c16551xff789360.I = z17;
        c16551xff789360.f230731h.m66964x8ffc3ac8(z17);
        c16551xff789360.f230731h.m66962xe2eba6c2(android.graphics.Color.parseColor("#00000000"));
        if (z17) {
            c16551xff789360.f230731h.setVisibility(4);
        } else {
            c16551xff789360.f230731h.a();
            c16551xff789360.f230731h.setVisibility(0);
        }
        android.widget.TextView textView = this.f547162g;
        if (z17) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.huh);
        } else {
            textView.setText(this.f547173u);
        }
        if (z17 && z18) {
            c16551xff789360.f230731h.setVisibility(0);
        }
    }

    public final void r(java.lang.String strWording, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strWording, "strWording");
        if (this.f547163h.getVisibility() == 0) {
            return;
        }
        java.lang.Runnable runnable = this.f547175w;
        android.widget.RelativeLayout relativeLayout = this.f547159d;
        relativeLayout.removeCallbacks(runnable);
        android.widget.TextView textView = this.f547162g;
        textView.setText(strWording);
        textView.setVisibility(0);
        textView.animate().alpha(1.0f).start();
        if (z17) {
            relativeLayout.postDelayed(runnable, 3000L);
        }
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360 = this.f547161f;
        c16551xff789360.d();
        c16551xff789360.m66976xbc91ffe0(true);
        this.f547164i.mo50302x6b17ad39(null);
        if (this.f547168p) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (j35.u.h(c16551xff789360.getContext(), "android.permission.RECORD_AUDIO")) {
                return;
            }
            j(new yt3.j3(this));
        }
    }

    public final void s() {
        java.lang.String string = this.f547159d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ht8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        r(string, true);
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f547161f.setVisibility(i17);
        if (this.f547177y) {
            this.f547159d.bringToFront();
        }
    }

    public final void u(boolean z17) {
        java.lang.String recordHintContent = this.f547178z;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recordHintContent, "recordHintContent");
        r(recordHintContent, z17);
    }

    public final void w() {
        if (this.f547172t) {
            this.f547172t = false;
            ju3.d0.k(this.f547160e, ju3.c0.f383414i, null, 2, null);
            int i17 = this.f547171s;
            if (i17 == 0) {
                i17 = this.f547159d.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
            }
            this.f547161f.i(0, 100, this.f547165m, i17, new yt3.q3(this));
        }
    }

    public void x(int i17) {
        this.f547178z = i65.a.r(this.f547159d.getContext(), i17);
    }
}
