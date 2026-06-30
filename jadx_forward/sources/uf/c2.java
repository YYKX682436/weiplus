package uf;

/* loaded from: classes7.dex */
public final class c2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f508527d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f508528e;

    /* renamed from: f, reason: collision with root package name */
    public final uf.c1 f508529f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f508530g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f508531h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f508532i;

    /* renamed from: m, reason: collision with root package name */
    public uf.v1 f508533m;

    /* renamed from: n, reason: collision with root package name */
    public int f508534n;

    /* renamed from: o, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f508535o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f508536p;

    /* renamed from: q, reason: collision with root package name */
    public int f508537q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f508538r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewTreeObserver f508539s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f508540t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f508541u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f508542v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.p f508543w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f508544x;

    /* renamed from: y, reason: collision with root package name */
    public final uf.w1 f508545y;

    public c2(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, boolean z17, boolean z18, uf.c1 deviceManager, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        android.app.Dialog iVar2;
        int i18;
        int e17;
        boolean z19 = (i17 & 4) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceManager, "deviceManager");
        this.f508527d = c11510xdd90c2f2;
        this.f508528e = z18;
        this.f508529f = deviceManager;
        this.f508531h = context;
        this.f508540t = true;
        this.f508541u = z19;
        this.f508544x = uf.b2.f508512d;
        uf.w1 w1Var = new uf.w1(this);
        this.f508545y = w1Var;
        if (context instanceof android.app.Activity) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f508538r = ((android.view.ViewGroup) decorView).findViewById(android.R.id.content);
        }
        if (z19) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            iVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c(context);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            iVar2 = new y9.i(context, 0);
        }
        this.f508530g = iVar2;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bpl, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f508532i = inflate;
        zk1.j jVar = zk1.m.f554947l;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.oqh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        jVar.a(findViewById, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : java.lang.Boolean.TRUE, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        android.view.View view = this.f508532i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.ong);
        findViewById2.setOnClickListener(new uf.x1(this, context));
        jVar.a(findViewById2, (r27 & 2) != 0 ? null : android.widget.Button.class, (r27 & 4) != 0 ? null : java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.aws), (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        android.view.View view2 = this.f508532i;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view2.findViewById(com.p314xaae8f345.mm.R.id.avc);
        c1163xf1deaba4.m7963x830bc99d(true);
        android.view.View view3 = this.f508532i;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view3.findViewById(com.p314xaae8f345.mm.R.id.hkt);
        findViewById3.setOnClickListener(new uf.y1(this));
        jVar.a(findViewById3, (r27 & 2) != 0 ? null : android.widget.Button.class, (r27 & 4) != 0 ? null : java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f571869s5), (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        android.view.View view4 = this.f508532i;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view4.findViewById(com.p314xaae8f345.mm.R.id.hks);
        nf.y yVar = nf.x.f418149b;
        if (yVar != null ? yVar.mo53144x387a9983() : false) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            imageView.setImageDrawable(b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.C30861xcebc809e.buc));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            imageView.setImageDrawable(b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.C30861xcebc809e.bu9));
        }
        this.f508536p = d();
        int e18 = com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561677pj);
        if (this.f508536p) {
            i18 = (int) (e18 * 4.5d);
            e17 = com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561670pc);
        } else {
            i18 = (int) (e18 * 6.5d);
            e17 = com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561670pc);
        }
        this.f508534n = i18 + e17;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        c1163xf1deaba4.setFocusable(false);
        uf.v1 v1Var = new uf.v1(this);
        this.f508533m = v1Var;
        c1163xf1deaba4.mo7960x6cab2c8d(v1Var);
        c1163xf1deaba4.setOverScrollMode(1);
        android.app.Dialog dialog = this.f508530g;
        if (dialog == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
            throw null;
        }
        android.view.View view5 = this.f508532i;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        dialog.setContentView(view5);
        if (!z19) {
            android.view.View view6 = this.f508532i;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            java.lang.Object parent = view6.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) parent);
            this.f508535o = A;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(A);
            A.C(this.f508534n);
        }
        android.app.Dialog dialog2 = this.f508530g;
        if (dialog2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
            throw null;
        }
        dialog2.setOnCancelListener(new uf.z1(this));
        android.app.Dialog dialog3 = this.f508530g;
        if (dialog3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
            throw null;
        }
        dialog3.setOnDismissListener(new uf.a2(this));
        android.app.Dialog dialog4 = this.f508530g;
        if (dialog4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
            throw null;
        }
        dialog4.setCancelable(false);
        if (c11510xdd90c2f2 != null) {
            c11510xdd90c2f2.P(4, -1, w1Var);
        }
        deviceManager.f508519e = new uf.q1(this);
    }

    public static final boolean a(uf.c2 c2Var) {
        return !c2Var.f508529f.f508518d.isEmpty();
    }

    public static final void b(uf.c2 c2Var, x91.h hVar, int i17) {
        if (hVar != null) {
            uf.c1 c1Var = c2Var.f508529f;
            c1Var.getClass();
            ((b06.b) c1Var.f508516b).a(c1Var, uf.c1.f508514m[0], hVar);
        }
        yz5.p pVar = c2Var.f508543w;
        if (pVar != null) {
            pVar.mo149xb9724478(hVar, java.lang.Integer.valueOf(i17));
        }
    }

    public final int c() {
        android.content.Context context = this.f508531h;
        if (!(context instanceof android.app.Activity)) {
            return 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }

    public final boolean d() {
        android.content.Context context = this.f508531h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        return context.getResources().getConfiguration().orientation == 2;
    }

    public final boolean e() {
        android.app.Dialog dialog = this.f508530g;
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

    public final void f() {
        if (this.f508530g != null) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f508535o;
            if (c2690x46972046 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2690x46972046);
                c2690x46972046.f125976p = true;
            }
            android.content.Context context = this.f508531h;
            if (context != null && (context instanceof android.app.Activity)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (!((android.app.Activity) context).isFinishing()) {
                    android.app.Dialog dialog = this.f508530g;
                    if (dialog == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheetDialog");
                        throw null;
                    }
                    dialog.dismiss();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f508527d;
        if (c11510xdd90c2f2 != null) {
            c11510xdd90c2f2.B1(this.f508545y);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (e()) {
            android.view.View view = this.f508538r;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                f();
            } else if (e()) {
                if (this.f508536p == d() && this.f508537q == c()) {
                    return;
                }
                f();
            }
        }
    }
}
