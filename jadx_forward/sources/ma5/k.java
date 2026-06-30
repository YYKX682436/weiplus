package ma5;

/* loaded from: classes15.dex */
public class k extends p012xc85e97e9.p016x746ad0e3.app.b implements p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f406786a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f406787b;

    /* renamed from: c, reason: collision with root package name */
    public final android.app.Activity f406788c;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 f406789d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 f406790e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0073x5080ced7 f406791f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f406792g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f406793h;

    /* renamed from: i, reason: collision with root package name */
    public ma5.j f406794i;

    /* renamed from: j, reason: collision with root package name */
    public n.b f406795j;

    /* renamed from: k, reason: collision with root package name */
    public n.a f406796k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f406797l;

    /* renamed from: p, reason: collision with root package name */
    public boolean f406801p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f406802q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f406803r;

    /* renamed from: t, reason: collision with root package name */
    public n.l f406805t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f406806u;

    /* renamed from: y, reason: collision with root package name */
    public static final android.view.animation.Interpolator f406784y = new android.view.animation.AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final android.view.animation.Interpolator f406785z = new android.view.animation.DecelerateInterpolator();
    public static final boolean A = true;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f406798m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public int f406799n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f406800o = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f406804s = true;

    /* renamed from: v, reason: collision with root package name */
    public final n3.c2 f406807v = new ma5.g(this);

    /* renamed from: w, reason: collision with root package name */
    public final n3.c2 f406808w = new ma5.h(this);

    /* renamed from: x, reason: collision with root package name */
    public final n3.e2 f406809x = new ma5.i(this);

    public k(android.app.Activity activity, android.view.ViewGroup viewGroup, android.view.View view) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 m2829x9ce6c05d;
        this.f406788c = activity;
        java.lang.Object findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f563965ef);
        if (findViewById instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0) {
            m2829x9ce6c05d = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0) findViewById;
        } else {
            if (!(findViewById instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Can't make a decor toolbar out of ");
                sb6.append(findViewById);
                throw new java.lang.IllegalStateException(sb6.toString() != null ? findViewById.getClass().getSimpleName() : "null");
            }
            m2829x9ce6c05d = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b) findViewById).m2829x9ce6c05d();
        }
        this.f406790e = m2829x9ce6c05d;
        this.f406791f = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0073x5080ced7) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f563992f3);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 c0072x2565c324 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f563968ei);
        this.f406789d = c0072x2565c324;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 x0Var = this.f406790e;
        if (x0Var == null || this.f406791f == null || c0072x2565c324 == null) {
            throw new java.lang.IllegalStateException(ma5.k.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        android.content.Context a17 = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).a();
        this.f406786a = a17;
        if ((((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e).f91281b & 4) != 0) {
            this.f406793h = true;
        }
        int i17 = a17.getApplicationInfo().targetSdkVersion;
        this.f406790e.getClass();
        android.content.res.TypedArray obtainStyledAttributes = this.f406786a.obtainStyledAttributes(null, j.a.f377706a, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559597o, 0);
        obtainStyledAttributes.getBoolean(14, false);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        this.f406792g = view;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void A(boolean z17) {
        if (this.f406793h) {
            return;
        }
        B(z17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void B(boolean z17) {
        O(z17 ? 4 : 0, 4);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void C(int i17) {
        if ((i17 & 4) != 0) {
            this.f406793h = true;
        }
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e).d(i17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void D(boolean z17) {
        O(z17 ? 16 : 0, 16);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void E(boolean z17) {
        O(z17 ? 2 : 0, 2);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void F(boolean z17) {
        O(z17 ? 8 : 0, 8);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void G(float f17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 c0072x2565c324 = this.f406789d;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.s(c0072x2565c324, f17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void H(int i17) {
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e).e(i17);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void I(android.graphics.drawable.Drawable drawable) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e;
        z2Var.f91285f = drawable;
        z2Var.h();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void J(boolean z17) {
        n.l lVar;
        this.f406806u = z17;
        if (z17 || (lVar = this.f406805t) == null) {
            return;
        }
        lVar.a();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void K(java.lang.CharSequence charSequence) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e;
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
        if (this.f406801p) {
            this.f406801p = false;
            P(false);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public n.b M(n.a aVar) {
        ma5.j jVar = this.f406794i;
        if (jVar != null) {
            jVar.a();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0073x5080ced7 c0073x5080ced7 = this.f406791f;
        c0073x5080ced7.removeAllViews();
        c0073x5080ced7.f90840r = null;
        c0073x5080ced7.f91046f = null;
        ma5.j jVar2 = new ma5.j(this, this.f406791f.getContext(), aVar);
        o.r rVar = jVar2.f406780g;
        rVar.z();
        try {
            if (!jVar2.f406781h.a(jVar2, rVar)) {
                return null;
            }
            jVar2.i();
            this.f406791f.f(jVar2);
            N(true);
            this.f406791f.sendAccessibilityEvent(32);
            this.f406794i = jVar2;
            return jVar2;
        } finally {
            rVar.y();
        }
    }

    public void N(boolean z17) {
        n3.z1 g17;
        n3.z1 e17;
        if (z17) {
            if (!this.f406803r) {
                this.f406803r = true;
                P(false);
            }
        } else if (this.f406803r) {
            this.f406803r = false;
            P(false);
        }
        if (z17) {
            e17 = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e).g(8, 100L);
            g17 = this.f406791f.e(0, 200L);
        } else {
            g17 = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e).g(0, 200L);
            e17 = this.f406791f.e(8, 100L);
        }
        n.l lVar = new n.l();
        lVar.c(e17, g17);
        lVar.d();
    }

    public void O(int i17, int i18) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 x0Var = this.f406790e;
        int i19 = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).f91281b;
        if ((i18 & 4) != 0) {
            this.f406793h = true;
        }
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) x0Var).d((i17 & i18) | ((~i18) & i19));
    }

    public final void P(boolean z17) {
        boolean z18 = this.f406803r || !(this.f406801p || this.f406802q);
        n3.e2 e2Var = this.f406809x;
        android.view.View view = this.f406792g;
        boolean z19 = A;
        if (!z18) {
            if (this.f406804s) {
                this.f406804s = false;
                n.l lVar = this.f406805t;
                if (lVar != null) {
                    lVar.a();
                }
                int i17 = this.f406799n;
                n3.c2 c2Var = this.f406807v;
                if (i17 != 0 || !z19 || (!this.f406806u && !z17)) {
                    ((ma5.g) c2Var).b(null);
                    return;
                }
                n3.l1.m(this.f406789d, 1.0f);
                this.f406789d.m2597x1acfd12b(true);
                n.l lVar2 = new n.l();
                float f17 = -this.f406789d.getHeight();
                if (z17) {
                    this.f406789d.getLocationInWindow(new int[]{0, 0});
                    f17 -= r13[1];
                }
                n3.z1 a17 = n3.l1.a(this.f406789d);
                a17.g(f17);
                a17.e(e2Var);
                lVar2.b(a17);
                if (this.f406800o && view != null) {
                    n3.z1 a18 = n3.l1.a(view);
                    a18.g(f17);
                    lVar2.b(a18);
                }
                android.view.animation.Interpolator interpolator = f406784y;
                boolean z27 = lVar2.f414954e;
                if (!z27) {
                    lVar2.f414952c = interpolator;
                }
                if (!z27) {
                    lVar2.f414951b = 250L;
                }
                if (!z27) {
                    lVar2.f414953d = c2Var;
                }
                this.f406805t = lVar2;
                lVar2.d();
                return;
            }
            return;
        }
        if (this.f406804s) {
            return;
        }
        this.f406804s = true;
        n.l lVar3 = this.f406805t;
        if (lVar3 != null) {
            lVar3.a();
        }
        this.f406789d.setVisibility(0);
        int i18 = this.f406799n;
        n3.c2 c2Var2 = this.f406808w;
        if (i18 != 0 || !z19 || (!this.f406806u && !z17)) {
            n3.l1.m(this.f406789d, 1.0f);
            this.f406789d.setTranslationY(0.0f);
            if (this.f406800o && view != null) {
                view.setTranslationY(0.0f);
            }
            ((ma5.h) c2Var2).b(null);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 c0072x2565c324 = this.f406789d;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        c0072x2565c324.setTranslationY(0.0f);
        float f18 = -this.f406789d.getHeight();
        if (z17) {
            this.f406789d.getLocationInWindow(new int[]{0, 0});
            f18 -= r13[1];
        }
        this.f406789d.setTranslationY(f18);
        n.l lVar4 = new n.l();
        n3.z1 a19 = n3.l1.a(this.f406789d);
        a19.g(0.0f);
        a19.e(e2Var);
        lVar4.b(a19);
        if (this.f406800o && view != null) {
            view.setTranslationY(f18);
            n3.z1 a27 = n3.l1.a(view);
            a27.g(0.0f);
            lVar4.b(a27);
        }
        android.view.animation.Interpolator interpolator2 = f406785z;
        boolean z28 = lVar4.f414954e;
        if (!z28) {
            lVar4.f414952c = interpolator2;
        }
        if (!z28) {
            lVar4.f414951b = 250L;
        }
        if (!z28) {
            lVar4.f414953d = c2Var2;
        }
        this.f406805t = lVar4;
        lVar4.d();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h
    public void a() {
        if (this.f406802q) {
            this.f406802q = false;
            P(true);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h
    public void b() {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h
    public void c() {
        if (this.f406802q) {
            return;
        }
        this.f406802q = true;
        P(true);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h
    public void d() {
        n.l lVar = this.f406805t;
        if (lVar != null) {
            lVar.a();
            this.f406805t = null;
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h
    public void e(int i17) {
        this.f406799n = i17;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h
    public void f(boolean z17) {
        this.f406800o = z17;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean h() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 x0Var = this.f406790e;
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
        if (z17 == this.f406797l) {
            return;
        }
        this.f406797l = z17;
        java.util.ArrayList arrayList = this.f406798m;
        if (arrayList.size() <= 0) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(arrayList.get(0));
        throw null;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public android.view.View j() {
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e).f91283d;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public int k() {
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e).f91281b;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public int l() {
        return this.f406789d.getHeight();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public android.content.Context m() {
        if (this.f406787b == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.f406786a.getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559602t, typedValue, true);
            int i17 = typedValue.resourceId;
            if (i17 != 0) {
                this.f406787b = new android.view.ContextThemeWrapper(this.f406786a, i17);
            } else {
                this.f406787b = this.f406786a;
            }
        }
        return this.f406787b;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public java.lang.CharSequence n() {
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e).f91280a.m2824x7531c8a2();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void o() {
        if (this.f406801p) {
            return;
        }
        this.f406801p = true;
        P(false);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public boolean q() {
        int l17 = l();
        return this.f406804s && (l17 == 0 || l17 > 0);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void r(android.content.res.Configuration configuration) {
        android.view.ViewGroup.LayoutParams layoutParams = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e).f91280a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = fp.a.c(this.f406788c);
        }
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e).f91280a.setLayoutParams(layoutParams);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void w(android.graphics.drawable.Drawable drawable) {
        this.f406789d.m2593x46c1b88e(drawable);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void x(int i17) {
        y(android.view.LayoutInflater.from(m()).inflate(i17, (android.view.ViewGroup) ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e).f91280a, false));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void y(android.view.View view) {
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e).c(view);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.b
    public void z(android.view.View view, p012xc85e97e9.p016x746ad0e3.app.C0063x293d4d7 c0063x293d4d7) {
        view.setLayoutParams(c0063x293d4d7);
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f406790e).c(view);
    }
}
