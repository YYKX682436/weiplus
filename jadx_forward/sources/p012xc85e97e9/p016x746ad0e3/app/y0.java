package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public class y0 extends p012xc85e97e9.p016x746ad0e3.app.b implements p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f90771a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f90772b;

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd f90773c;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 f90774d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 f90775e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0073x5080ced7 f90776f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f90777g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f90778h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.x0 f90779i;

    /* renamed from: j, reason: collision with root package name */
    public n.b f90780j;

    /* renamed from: k, reason: collision with root package name */
    public n.a f90781k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f90782l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f90783m;

    /* renamed from: n, reason: collision with root package name */
    public int f90784n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f90785o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f90786p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f90787q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f90788r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f90789s;

    /* renamed from: t, reason: collision with root package name */
    public n.l f90790t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f90791u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f90792v;

    /* renamed from: w, reason: collision with root package name */
    public final n3.c2 f90793w;

    /* renamed from: x, reason: collision with root package name */
    public final n3.c2 f90794x;

    /* renamed from: y, reason: collision with root package name */
    public final n3.e2 f90795y;

    /* renamed from: z, reason: collision with root package name */
    public static final android.view.animation.Interpolator f90770z = new android.view.animation.AccelerateInterpolator();
    public static final android.view.animation.Interpolator A = new android.view.animation.DecelerateInterpolator();

    public y0(android.app.Activity activity, boolean z17) {
        new java.util.ArrayList();
        this.f90783m = new java.util.ArrayList();
        this.f90784n = 0;
        this.f90785o = true;
        this.f90789s = true;
        this.f90793w = new p012xc85e97e9.p016x746ad0e3.app.u0(this);
        this.f90794x = new p012xc85e97e9.p016x746ad0e3.app.v0(this);
        this.f90795y = new p012xc85e97e9.p016x746ad0e3.app.w0(this);
        android.view.View decorView = activity.getWindow().getDecorView();
        O(decorView);
        if (z17) {
            return;
        }
        this.f90777g = decorView.findViewById(android.R.id.content);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void A(boolean z17) {
        if (this.f90778h) {
            return;
        }
        B(z17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void B(boolean z17) {
        P(z17 ? 4 : 0, 4);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void C(int i17) {
        if ((i17 & 4) != 0) {
            this.f90778h = true;
        }
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).d(i17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void D(boolean z17) {
        P(z17 ? 16 : 0, 16);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void E(boolean z17) {
        P(z17 ? 2 : 0, 2);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void F(boolean z17) {
        P(z17 ? 8 : 0, 8);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void G(float f17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 c0072x2565c324 = this.f90774d;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.s(c0072x2565c324, f17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void H(int i17) {
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).e(i17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void I(android.graphics.drawable.Drawable drawable) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e;
        z2Var.f91285f = drawable;
        z2Var.h();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void J(boolean z17) {
        n.l lVar;
        this.f90791u = z17;
        if (z17 || (lVar = this.f90790t) == null) {
            return;
        }
        lVar.a();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void K(java.lang.CharSequence charSequence) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e;
        if (z2Var.f91287h) {
            return;
        }
        z2Var.f91288i = charSequence;
        if ((z2Var.f91281b & 8) != 0) {
            z2Var.f91280a.mo2849x53bfe316(charSequence);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void L() {
        if (this.f90786p) {
            this.f90786p = false;
            R(false);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public n.b M(n.a aVar) {
        p012xc85e97e9.p016x746ad0e3.app.x0 x0Var = this.f90779i;
        if (x0Var != null) {
            x0Var.a();
        }
        this.f90773c.m2613x986bde1e(false);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0073x5080ced7 c0073x5080ced7 = this.f90776f;
        c0073x5080ced7.removeAllViews();
        c0073x5080ced7.f90840r = null;
        c0073x5080ced7.f91046f = null;
        p012xc85e97e9.p016x746ad0e3.app.x0 x0Var2 = new p012xc85e97e9.p016x746ad0e3.app.x0(this, this.f90776f.getContext(), aVar);
        o.r rVar = x0Var2.f90764g;
        rVar.z();
        try {
            if (!x0Var2.f90765h.a(x0Var2, rVar)) {
                return null;
            }
            this.f90779i = x0Var2;
            x0Var2.i();
            this.f90776f.f(x0Var2);
            N(true);
            this.f90776f.sendAccessibilityEvent(32);
            return x0Var2;
        } finally {
            rVar.y();
        }
    }

    public void N(boolean z17) {
        n3.z1 g17;
        n3.z1 e17;
        if (z17) {
            if (!this.f90788r) {
                this.f90788r = true;
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd = this.f90773c;
                if (c0074x22961cbd != null) {
                    c0074x22961cbd.m2618x3f7b065f(true);
                }
                R(false);
            }
        } else if (this.f90788r) {
            this.f90788r = false;
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd2 = this.f90773c;
            if (c0074x22961cbd2 != null) {
                c0074x22961cbd2.m2618x3f7b065f(false);
            }
            R(false);
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 c0072x2565c324 = this.f90774d;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.x0.c(c0072x2565c324)) {
            if (z17) {
                ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).f91280a.setVisibility(4);
                this.f90776f.setVisibility(0);
                return;
            } else {
                ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).f91280a.setVisibility(0);
                this.f90776f.setVisibility(8);
                return;
            }
        }
        if (z17) {
            e17 = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).g(4, 100L);
            g17 = this.f90776f.e(0, 200L);
        } else {
            g17 = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).g(0, 200L);
            e17 = this.f90776f.e(8, 100L);
        }
        n.l lVar = new n.l();
        lVar.c(e17, g17);
        lVar.d();
    }

    public final void O(android.view.View view) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 m2829x9ce6c05d;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd) view.findViewById(com.p314xaae8f345.mm.R.id.crd);
        this.f90773c = c0074x22961cbd;
        if (c0074x22961cbd != null) {
            c0074x22961cbd.m2611x7b5a9c92(this);
        }
        android.view.KeyEvent.Callback findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f563965ef);
        if (findViewById instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0) {
            m2829x9ce6c05d = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0) findViewById;
        } else {
            if (!(findViewById instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b)) {
                throw new java.lang.IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            m2829x9ce6c05d = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b) findViewById).m2829x9ce6c05d();
        }
        this.f90775e = m2829x9ce6c05d;
        this.f90776f = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0073x5080ced7) view.findViewById(com.p314xaae8f345.mm.R.id.f563992f3);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 c0072x2565c324 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324) view.findViewById(com.p314xaae8f345.mm.R.id.f563968ei);
        this.f90774d = c0072x2565c324;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 x0Var = this.f90775e;
        if (x0Var == null || this.f90776f == null || c0072x2565c324 == null) {
            throw new java.lang.IllegalStateException(p012xc85e97e9.p016x746ad0e3.app.y0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        android.content.Context a17 = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).a();
        this.f90771a = a17;
        if ((((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).f91281b & 4) != 0) {
            this.f90778h = true;
        }
        if (a17.getApplicationInfo().targetSdkVersion < 14) {
        }
        this.f90775e.getClass();
        Q(a17.getResources().getBoolean(com.p314xaae8f345.mm.R.C30858x2e3aea.f560016a));
        android.content.res.TypedArray obtainStyledAttributes = this.f90771a.obtainStyledAttributes(null, j.a.f377706a, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559597o, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd2 = this.f90773c;
            if (!c0074x22961cbd2.f90855n) {
                throw new java.lang.IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f90792v = true;
            c0074x22961cbd2.m2613x986bde1e(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void P(int i17, int i18) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 x0Var = this.f90775e;
        int i19 = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).f91281b;
        if ((i18 & 4) != 0) {
            this.f90778h = true;
        }
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).d((i17 & i18) | ((~i18) & i19));
    }

    public final void Q(boolean z17) {
        if (z17) {
            this.f90774d.m2596x6172f1ee(null);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e;
            android.view.View view = z2Var.f91282c;
            if (view != null) {
                android.view.ViewParent parent = view.getParent();
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = z2Var.f91280a;
                if (parent == c0102x1f44235b) {
                    c0102x1f44235b.removeView(z2Var.f91282c);
                }
            }
            z2Var.f91282c = null;
        } else {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var2 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e;
            android.view.View view2 = z2Var2.f91282c;
            if (view2 != null) {
                android.view.ViewParent parent2 = view2.getParent();
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b2 = z2Var2.f91280a;
                if (parent2 == c0102x1f44235b2) {
                    c0102x1f44235b2.removeView(z2Var2.f91282c);
                }
            }
            z2Var2.f91282c = null;
            this.f90774d.m2596x6172f1ee(null);
        }
        this.f90775e.getClass();
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).f91280a.m2830x2143aa48(false);
        this.f90773c.m2612xa246e29d(false);
    }

    public final void R(boolean z17) {
        boolean z18 = this.f90788r || !(this.f90786p || this.f90787q);
        n3.e2 e2Var = this.f90795y;
        android.view.View view = this.f90777g;
        if (!z18) {
            if (this.f90789s) {
                this.f90789s = false;
                n.l lVar = this.f90790t;
                if (lVar != null) {
                    lVar.a();
                }
                int i17 = this.f90784n;
                n3.c2 c2Var = this.f90793w;
                if (i17 != 0 || (!this.f90791u && !z17)) {
                    ((p012xc85e97e9.p016x746ad0e3.app.u0) c2Var).b(null);
                    return;
                }
                this.f90774d.setAlpha(1.0f);
                this.f90774d.m2597x1acfd12b(true);
                n.l lVar2 = new n.l();
                float f17 = -this.f90774d.getHeight();
                if (z17) {
                    this.f90774d.getLocationInWindow(new int[]{0, 0});
                    f17 -= r12[1];
                }
                n3.z1 a17 = n3.l1.a(this.f90774d);
                a17.g(f17);
                a17.e(e2Var);
                lVar2.b(a17);
                if (this.f90785o && view != null) {
                    n3.z1 a18 = n3.l1.a(view);
                    a18.g(f17);
                    lVar2.b(a18);
                }
                android.view.animation.Interpolator interpolator = f90770z;
                boolean z19 = lVar2.f414954e;
                if (!z19) {
                    lVar2.f414952c = interpolator;
                }
                if (!z19) {
                    lVar2.f414951b = 250L;
                }
                if (!z19) {
                    lVar2.f414953d = c2Var;
                }
                this.f90790t = lVar2;
                lVar2.d();
                return;
            }
            return;
        }
        if (this.f90789s) {
            return;
        }
        this.f90789s = true;
        n.l lVar3 = this.f90790t;
        if (lVar3 != null) {
            lVar3.a();
        }
        this.f90774d.setVisibility(0);
        int i18 = this.f90784n;
        n3.c2 c2Var2 = this.f90794x;
        if (i18 == 0 && (this.f90791u || z17)) {
            this.f90774d.setTranslationY(0.0f);
            float f18 = -this.f90774d.getHeight();
            if (z17) {
                this.f90774d.getLocationInWindow(new int[]{0, 0});
                f18 -= r12[1];
            }
            this.f90774d.setTranslationY(f18);
            n.l lVar4 = new n.l();
            n3.z1 a19 = n3.l1.a(this.f90774d);
            a19.g(0.0f);
            a19.e(e2Var);
            lVar4.b(a19);
            if (this.f90785o && view != null) {
                view.setTranslationY(f18);
                n3.z1 a27 = n3.l1.a(view);
                a27.g(0.0f);
                lVar4.b(a27);
            }
            android.view.animation.Interpolator interpolator2 = A;
            boolean z27 = lVar4.f414954e;
            if (!z27) {
                lVar4.f414952c = interpolator2;
            }
            if (!z27) {
                lVar4.f414951b = 250L;
            }
            if (!z27) {
                lVar4.f414953d = c2Var2;
            }
            this.f90790t = lVar4;
            lVar4.d();
        } else {
            this.f90774d.setAlpha(1.0f);
            this.f90774d.setTranslationY(0.0f);
            if (this.f90785o && view != null) {
                view.setTranslationY(0.0f);
            }
            ((p012xc85e97e9.p016x746ad0e3.app.v0) c2Var2).b(null);
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd = this.f90773c;
        if (c0074x22961cbd != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.y0.c(c0074x22961cbd);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h
    public void a() {
        if (this.f90787q) {
            this.f90787q = false;
            R(true);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h
    public void b() {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h
    public void c() {
        if (this.f90787q) {
            return;
        }
        this.f90787q = true;
        R(true);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h
    public void d() {
        n.l lVar = this.f90790t;
        if (lVar != null) {
            lVar.a();
            this.f90790t = null;
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h
    public void e(int i17) {
        this.f90784n = i17;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h
    public void f(boolean z17) {
        this.f90785o = z17;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean h() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 x0Var = this.f90775e;
        if (x0Var != null) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u2 u2Var = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).f91280a.R;
            if ((u2Var == null || u2Var.f91262e == null) ? false : true) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u2 u2Var2 = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).f91280a.R;
                o.u uVar = u2Var2 == null ? null : u2Var2.f91262e;
                if (uVar != null) {
                    uVar.collapseActionView();
                }
                return true;
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void i(boolean z17) {
        if (z17 == this.f90782l) {
            return;
        }
        this.f90782l = z17;
        java.util.ArrayList arrayList = this.f90783m;
        if (arrayList.size() <= 0) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(arrayList.get(0));
        throw null;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public android.view.View j() {
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).f91283d;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public int k() {
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).f91281b;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public int l() {
        return this.f90774d.getHeight();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public android.content.Context m() {
        if (this.f90772b == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.f90771a.getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559602t, typedValue, true);
            int i17 = typedValue.resourceId;
            if (i17 != 0) {
                this.f90772b = new android.view.ContextThemeWrapper(this.f90771a, i17);
            } else {
                this.f90772b = this.f90771a;
            }
        }
        return this.f90772b;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public java.lang.CharSequence n() {
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).f91280a.m2824x7531c8a2();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void o() {
        if (this.f90786p) {
            return;
        }
        this.f90786p = true;
        R(false);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean q() {
        int l17 = l();
        return this.f90789s && (l17 == 0 || this.f90773c.m2608x9975271c() < l17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void r(android.content.res.Configuration configuration) {
        Q(this.f90771a.getResources().getBoolean(com.p314xaae8f345.mm.R.C30858x2e3aea.f560016a));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean t(int i17, android.view.KeyEvent keyEvent) {
        o.r rVar;
        p012xc85e97e9.p016x746ad0e3.app.x0 x0Var = this.f90779i;
        if (x0Var == null || (rVar = x0Var.f90764g) == null) {
            return false;
        }
        rVar.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return rVar.performShortcut(i17, keyEvent, 0);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void w(android.graphics.drawable.Drawable drawable) {
        this.f90774d.m2593x46c1b88e(drawable);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void x(int i17) {
        y(android.view.LayoutInflater.from(m()).inflate(i17, (android.view.ViewGroup) ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).f91280a, false));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void y(android.view.View view) {
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).c(view);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void z(android.view.View view, p012xc85e97e9.p016x746ad0e3.app.C0063x293d4d7 c0063x293d4d7) {
        view.setLayoutParams(c0063x293d4d7);
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90775e).c(view);
    }

    public y0(android.app.Dialog dialog) {
        new java.util.ArrayList();
        this.f90783m = new java.util.ArrayList();
        this.f90784n = 0;
        this.f90785o = true;
        this.f90789s = true;
        this.f90793w = new p012xc85e97e9.p016x746ad0e3.app.u0(this);
        this.f90794x = new p012xc85e97e9.p016x746ad0e3.app.v0(this);
        this.f90795y = new p012xc85e97e9.p016x746ad0e3.app.w0(this);
        O(dialog.getWindow().getDecorView());
    }
}
