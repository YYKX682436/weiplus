package gg1;

/* loaded from: classes7.dex */
public final class w implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final fg1.u f353167d;

    /* renamed from: e, reason: collision with root package name */
    public final gg1.k1 f353168e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f353169f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f353170g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f353171h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f353172i;

    /* renamed from: m, reason: collision with root package name */
    public gg1.p f353173m;

    /* renamed from: n, reason: collision with root package name */
    public int f353174n;

    /* renamed from: o, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f353175o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f353176p;

    /* renamed from: q, reason: collision with root package name */
    public int f353177q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f353178r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewTreeObserver f353179s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f353180t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f353181u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.p f353182v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.l f353183w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f353184x;

    /* renamed from: y, reason: collision with root package name */
    public final gg1.q f353185y;

    public w(android.content.Context context, boolean z17, fg1.u videoCastHandler, gg1.k1 videoCastDeviceManager, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i18;
        int e17;
        boolean z19 = (i17 & 2) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoCastHandler, "videoCastHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoCastDeviceManager, "videoCastDeviceManager");
        this.f353167d = videoCastHandler;
        this.f353168e = videoCastDeviceManager;
        this.f353169f = z18;
        this.f353171h = context;
        this.f353180t = true;
        this.f353181u = z19;
        this.f353183w = gg1.v.f353165d;
        gg1.q qVar = new gg1.q(this);
        this.f353185y = qVar;
        if (context instanceof android.app.Activity) {
            android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f353178r = ((android.view.ViewGroup) decorView).findViewById(android.R.id.content);
        }
        this.f353170g = z19 ? new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c(context) : new y9.i(context, 0);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bpl, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f353172i = inflate;
        zk1.j jVar = zk1.m.f554947l;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.oqh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        jVar.a(findViewById, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : java.lang.Boolean.TRUE, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        android.view.View view = this.f353172i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.ong);
        findViewById2.setOnClickListener(new gg1.r(this));
        jVar.a(findViewById2, (r27 & 2) != 0 ? null : android.widget.Button.class, (r27 & 4) != 0 ? null : java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.aws), (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        android.view.View view2 = this.f353172i;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view2.findViewById(com.p314xaae8f345.mm.R.id.avc);
        c1163xf1deaba4.m7963x830bc99d(true);
        android.view.View view3 = this.f353172i;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view3.findViewById(com.p314xaae8f345.mm.R.id.hkt);
        findViewById3.setOnClickListener(new gg1.s(this));
        jVar.a(findViewById3, (r27 & 2) != 0 ? null : android.widget.Button.class, (r27 & 4) != 0 ? null : java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f571869s5), (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        android.view.View view4 = this.f353172i;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view4.findViewById(com.p314xaae8f345.mm.R.id.hks);
        nf.y yVar = nf.x.f418149b;
        if (yVar != null ? yVar.mo53144x387a9983() : false) {
            imageView.setImageDrawable(b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.C30861xcebc809e.buc));
        } else {
            imageView.setImageDrawable(b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.C30861xcebc809e.bu9));
        }
        this.f353176p = c();
        int e18 = com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561677pj);
        if (this.f353176p) {
            i18 = (int) (e18 * 4.5d);
            e17 = com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561670pc);
        } else {
            i18 = (int) (e18 * 6.5d);
            e17 = com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561670pc);
        }
        this.f353174n = i18 + e17;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        c1163xf1deaba4.setFocusable(false);
        gg1.p pVar = new gg1.p(this);
        this.f353173m = pVar;
        c1163xf1deaba4.mo7960x6cab2c8d(pVar);
        c1163xf1deaba4.setOverScrollMode(1);
        android.app.Dialog dialog = this.f353170g;
        if (dialog == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
            throw null;
        }
        android.view.View view5 = this.f353172i;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        dialog.setContentView(view5);
        if (!z19) {
            android.view.View view6 = this.f353172i;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            java.lang.Object parent = view6.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) parent);
            this.f353175o = A;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(A);
            A.C(this.f353174n);
        }
        android.app.Dialog dialog2 = this.f353170g;
        if (dialog2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
            throw null;
        }
        dialog2.setOnCancelListener(new gg1.t(this));
        android.app.Dialog dialog3 = this.f353170g;
        if (dialog3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
            throw null;
        }
        dialog3.setOnDismissListener(new gg1.u(this));
        android.app.Dialog dialog4 = this.f353170g;
        if (dialog4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
            throw null;
        }
        dialog4.setCancelable(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a17 = videoCastHandler.a();
        if (a17 != null) {
            a17.P(4, -1, qVar);
        }
    }

    public static final boolean a(gg1.w wVar) {
        return !wVar.f353168e.f353125e.isEmpty();
    }

    public final int b() {
        android.content.Context context = this.f353171h;
        if (!(context instanceof android.app.Activity)) {
            return 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }

    public final boolean c() {
        android.content.Context context = this.f353171h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        return context.getResources().getConfiguration().orientation == 2;
    }

    public final boolean d() {
        android.app.Dialog dialog = this.f353170g;
        if (dialog != null) {
            if (dialog == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                throw null;
            }
            if (dialog.isShowing()) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f353170g != null) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f353175o;
            if (c2690x46972046 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2690x46972046);
                c2690x46972046.f125976p = true;
            }
            android.content.Context context = this.f353171h;
            if (context != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (!((android.app.Activity) context).isFinishing()) {
                    android.app.Dialog dialog = this.f353170g;
                    if (dialog == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                        throw null;
                    }
                    dialog.dismiss();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a17 = this.f353167d.a();
        if (a17 != null) {
            a17.B1(this.f353185y);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (d()) {
            android.view.View view = this.f353178r;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                e();
            } else if (d()) {
                if (this.f353176p == c() && this.f353177q == b()) {
                    return;
                }
                e();
            }
        }
    }
}
