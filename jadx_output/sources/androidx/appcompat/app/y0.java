package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class y0 extends androidx.appcompat.app.b implements androidx.appcompat.widget.h {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f9238a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f9239b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.appcompat.widget.ActionBarOverlayLayout f9240c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.ActionBarContainer f9241d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.appcompat.widget.x0 f9242e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.appcompat.widget.ActionBarContextView f9243f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f9244g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9245h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.appcompat.app.x0 f9246i;

    /* renamed from: j, reason: collision with root package name */
    public n.b f9247j;

    /* renamed from: k, reason: collision with root package name */
    public n.a f9248k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9249l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f9250m;

    /* renamed from: n, reason: collision with root package name */
    public int f9251n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9252o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9253p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9254q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9255r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9256s;

    /* renamed from: t, reason: collision with root package name */
    public n.l f9257t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9258u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9259v;

    /* renamed from: w, reason: collision with root package name */
    public final n3.c2 f9260w;

    /* renamed from: x, reason: collision with root package name */
    public final n3.c2 f9261x;

    /* renamed from: y, reason: collision with root package name */
    public final n3.e2 f9262y;

    /* renamed from: z, reason: collision with root package name */
    public static final android.view.animation.Interpolator f9237z = new android.view.animation.AccelerateInterpolator();
    public static final android.view.animation.Interpolator A = new android.view.animation.DecelerateInterpolator();

    public y0(android.app.Activity activity, boolean z17) {
        new java.util.ArrayList();
        this.f9250m = new java.util.ArrayList();
        this.f9251n = 0;
        this.f9252o = true;
        this.f9256s = true;
        this.f9260w = new androidx.appcompat.app.u0(this);
        this.f9261x = new androidx.appcompat.app.v0(this);
        this.f9262y = new androidx.appcompat.app.w0(this);
        android.view.View decorView = activity.getWindow().getDecorView();
        O(decorView);
        if (z17) {
            return;
        }
        this.f9244g = decorView.findViewById(android.R.id.content);
    }

    @Override // androidx.appcompat.app.b
    public void A(boolean z17) {
        if (this.f9245h) {
            return;
        }
        B(z17);
    }

    @Override // androidx.appcompat.app.b
    public void B(boolean z17) {
        P(z17 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.b
    public void C(int i17) {
        if ((i17 & 4) != 0) {
            this.f9245h = true;
        }
        ((androidx.appcompat.widget.z2) this.f9242e).d(i17);
    }

    @Override // androidx.appcompat.app.b
    public void D(boolean z17) {
        P(z17 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.b
    public void E(boolean z17) {
        P(z17 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.b
    public void F(boolean z17) {
        P(z17 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.b
    public void G(float f17) {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f9241d;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.s(actionBarContainer, f17);
    }

    @Override // androidx.appcompat.app.b
    public void H(int i17) {
        ((androidx.appcompat.widget.z2) this.f9242e).e(i17);
    }

    @Override // androidx.appcompat.app.b
    public void I(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.z2 z2Var = (androidx.appcompat.widget.z2) this.f9242e;
        z2Var.f9752f = drawable;
        z2Var.h();
    }

    @Override // androidx.appcompat.app.b
    public void J(boolean z17) {
        n.l lVar;
        this.f9258u = z17;
        if (z17 || (lVar = this.f9257t) == null) {
            return;
        }
        lVar.a();
    }

    @Override // androidx.appcompat.app.b
    public void K(java.lang.CharSequence charSequence) {
        androidx.appcompat.widget.z2 z2Var = (androidx.appcompat.widget.z2) this.f9242e;
        if (z2Var.f9754h) {
            return;
        }
        z2Var.f9755i = charSequence;
        if ((z2Var.f9748b & 8) != 0) {
            z2Var.f9747a.setTitle(charSequence);
        }
    }

    @Override // androidx.appcompat.app.b
    public void L() {
        if (this.f9253p) {
            this.f9253p = false;
            R(false);
        }
    }

    @Override // androidx.appcompat.app.b
    public n.b M(n.a aVar) {
        androidx.appcompat.app.x0 x0Var = this.f9246i;
        if (x0Var != null) {
            x0Var.a();
        }
        this.f9240c.setHideOnContentScrollEnabled(false);
        androidx.appcompat.widget.ActionBarContextView actionBarContextView = this.f9243f;
        actionBarContextView.removeAllViews();
        actionBarContextView.f9307r = null;
        actionBarContextView.f9513f = null;
        androidx.appcompat.app.x0 x0Var2 = new androidx.appcompat.app.x0(this, this.f9243f.getContext(), aVar);
        o.r rVar = x0Var2.f9231g;
        rVar.z();
        try {
            if (!x0Var2.f9232h.a(x0Var2, rVar)) {
                return null;
            }
            this.f9246i = x0Var2;
            x0Var2.i();
            this.f9243f.f(x0Var2);
            N(true);
            this.f9243f.sendAccessibilityEvent(32);
            return x0Var2;
        } finally {
            rVar.y();
        }
    }

    public void N(boolean z17) {
        n3.z1 g17;
        n3.z1 e17;
        if (z17) {
            if (!this.f9255r) {
                this.f9255r = true;
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f9240c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                R(false);
            }
        } else if (this.f9255r) {
            this.f9255r = false;
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9240c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            R(false);
        }
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f9241d;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.c(actionBarContainer)) {
            if (z17) {
                ((androidx.appcompat.widget.z2) this.f9242e).f9747a.setVisibility(4);
                this.f9243f.setVisibility(0);
                return;
            } else {
                ((androidx.appcompat.widget.z2) this.f9242e).f9747a.setVisibility(0);
                this.f9243f.setVisibility(8);
                return;
            }
        }
        if (z17) {
            e17 = ((androidx.appcompat.widget.z2) this.f9242e).g(4, 100L);
            g17 = this.f9243f.e(0, 200L);
        } else {
            g17 = ((androidx.appcompat.widget.z2) this.f9242e).g(0, 200L);
            e17 = this.f9243f.e(8, 100L);
        }
        n.l lVar = new n.l();
        lVar.c(e17, g17);
        lVar.d();
    }

    public final void O(android.view.View view) {
        androidx.appcompat.widget.x0 wrapper;
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) view.findViewById(com.tencent.mm.R.id.crd);
        this.f9240c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        android.view.KeyEvent.Callback findViewById = view.findViewById(com.tencent.mm.R.id.f482432ef);
        if (findViewById instanceof androidx.appcompat.widget.x0) {
            wrapper = (androidx.appcompat.widget.x0) findViewById;
        } else {
            if (!(findViewById instanceof androidx.appcompat.widget.Toolbar)) {
                throw new java.lang.IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((androidx.appcompat.widget.Toolbar) findViewById).getWrapper();
        }
        this.f9242e = wrapper;
        this.f9243f = (androidx.appcompat.widget.ActionBarContextView) view.findViewById(com.tencent.mm.R.id.f482459f3);
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = (androidx.appcompat.widget.ActionBarContainer) view.findViewById(com.tencent.mm.R.id.f482435ei);
        this.f9241d = actionBarContainer;
        androidx.appcompat.widget.x0 x0Var = this.f9242e;
        if (x0Var == null || this.f9243f == null || actionBarContainer == null) {
            throw new java.lang.IllegalStateException(androidx.appcompat.app.y0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        android.content.Context a17 = ((androidx.appcompat.widget.z2) x0Var).a();
        this.f9238a = a17;
        if ((((androidx.appcompat.widget.z2) this.f9242e).f9748b & 4) != 0) {
            this.f9245h = true;
        }
        if (a17.getApplicationInfo().targetSdkVersion < 14) {
        }
        this.f9242e.getClass();
        Q(a17.getResources().getBoolean(com.tencent.mm.R.bool.f478483a));
        android.content.res.TypedArray obtainStyledAttributes = this.f9238a.obtainStyledAttributes(null, j.a.f296173a, com.tencent.mm.R.attr.f478064o, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9240c;
            if (!actionBarOverlayLayout2.f9322n) {
                throw new java.lang.IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f9259v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void P(int i17, int i18) {
        androidx.appcompat.widget.x0 x0Var = this.f9242e;
        int i19 = ((androidx.appcompat.widget.z2) x0Var).f9748b;
        if ((i18 & 4) != 0) {
            this.f9245h = true;
        }
        ((androidx.appcompat.widget.z2) x0Var).d((i17 & i18) | ((~i18) & i19));
    }

    public final void Q(boolean z17) {
        if (z17) {
            this.f9241d.setTabContainer(null);
            androidx.appcompat.widget.z2 z2Var = (androidx.appcompat.widget.z2) this.f9242e;
            android.view.View view = z2Var.f9749c;
            if (view != null) {
                android.view.ViewParent parent = view.getParent();
                androidx.appcompat.widget.Toolbar toolbar = z2Var.f9747a;
                if (parent == toolbar) {
                    toolbar.removeView(z2Var.f9749c);
                }
            }
            z2Var.f9749c = null;
        } else {
            androidx.appcompat.widget.z2 z2Var2 = (androidx.appcompat.widget.z2) this.f9242e;
            android.view.View view2 = z2Var2.f9749c;
            if (view2 != null) {
                android.view.ViewParent parent2 = view2.getParent();
                androidx.appcompat.widget.Toolbar toolbar2 = z2Var2.f9747a;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(z2Var2.f9749c);
                }
            }
            z2Var2.f9749c = null;
            this.f9241d.setTabContainer(null);
        }
        this.f9242e.getClass();
        ((androidx.appcompat.widget.z2) this.f9242e).f9747a.setCollapsible(false);
        this.f9240c.setHasNonEmbeddedTabs(false);
    }

    public final void R(boolean z17) {
        boolean z18 = this.f9255r || !(this.f9253p || this.f9254q);
        n3.e2 e2Var = this.f9262y;
        android.view.View view = this.f9244g;
        if (!z18) {
            if (this.f9256s) {
                this.f9256s = false;
                n.l lVar = this.f9257t;
                if (lVar != null) {
                    lVar.a();
                }
                int i17 = this.f9251n;
                n3.c2 c2Var = this.f9260w;
                if (i17 != 0 || (!this.f9258u && !z17)) {
                    ((androidx.appcompat.app.u0) c2Var).b(null);
                    return;
                }
                this.f9241d.setAlpha(1.0f);
                this.f9241d.setTransitioning(true);
                n.l lVar2 = new n.l();
                float f17 = -this.f9241d.getHeight();
                if (z17) {
                    this.f9241d.getLocationInWindow(new int[]{0, 0});
                    f17 -= r12[1];
                }
                n3.z1 a17 = n3.l1.a(this.f9241d);
                a17.g(f17);
                a17.e(e2Var);
                lVar2.b(a17);
                if (this.f9252o && view != null) {
                    n3.z1 a18 = n3.l1.a(view);
                    a18.g(f17);
                    lVar2.b(a18);
                }
                android.view.animation.Interpolator interpolator = f9237z;
                boolean z19 = lVar2.f333421e;
                if (!z19) {
                    lVar2.f333419c = interpolator;
                }
                if (!z19) {
                    lVar2.f333418b = 250L;
                }
                if (!z19) {
                    lVar2.f333420d = c2Var;
                }
                this.f9257t = lVar2;
                lVar2.d();
                return;
            }
            return;
        }
        if (this.f9256s) {
            return;
        }
        this.f9256s = true;
        n.l lVar3 = this.f9257t;
        if (lVar3 != null) {
            lVar3.a();
        }
        this.f9241d.setVisibility(0);
        int i18 = this.f9251n;
        n3.c2 c2Var2 = this.f9261x;
        if (i18 == 0 && (this.f9258u || z17)) {
            this.f9241d.setTranslationY(0.0f);
            float f18 = -this.f9241d.getHeight();
            if (z17) {
                this.f9241d.getLocationInWindow(new int[]{0, 0});
                f18 -= r12[1];
            }
            this.f9241d.setTranslationY(f18);
            n.l lVar4 = new n.l();
            n3.z1 a19 = n3.l1.a(this.f9241d);
            a19.g(0.0f);
            a19.e(e2Var);
            lVar4.b(a19);
            if (this.f9252o && view != null) {
                view.setTranslationY(f18);
                n3.z1 a27 = n3.l1.a(view);
                a27.g(0.0f);
                lVar4.b(a27);
            }
            android.view.animation.Interpolator interpolator2 = A;
            boolean z27 = lVar4.f333421e;
            if (!z27) {
                lVar4.f333419c = interpolator2;
            }
            if (!z27) {
                lVar4.f333418b = 250L;
            }
            if (!z27) {
                lVar4.f333420d = c2Var2;
            }
            this.f9257t = lVar4;
            lVar4.d();
        } else {
            this.f9241d.setAlpha(1.0f);
            this.f9241d.setTranslationY(0.0f);
            if (this.f9252o && view != null) {
                view.setTranslationY(0.0f);
            }
            ((androidx.appcompat.app.v0) c2Var2).b(null);
        }
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f9240c;
        if (actionBarOverlayLayout != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.y0.c(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.widget.h
    public void a() {
        if (this.f9254q) {
            this.f9254q = false;
            R(true);
        }
    }

    @Override // androidx.appcompat.widget.h
    public void b() {
    }

    @Override // androidx.appcompat.widget.h
    public void c() {
        if (this.f9254q) {
            return;
        }
        this.f9254q = true;
        R(true);
    }

    @Override // androidx.appcompat.widget.h
    public void d() {
        n.l lVar = this.f9257t;
        if (lVar != null) {
            lVar.a();
            this.f9257t = null;
        }
    }

    @Override // androidx.appcompat.widget.h
    public void e(int i17) {
        this.f9251n = i17;
    }

    @Override // androidx.appcompat.widget.h
    public void f(boolean z17) {
        this.f9252o = z17;
    }

    @Override // androidx.appcompat.app.b
    public boolean h() {
        androidx.appcompat.widget.x0 x0Var = this.f9242e;
        if (x0Var != null) {
            androidx.appcompat.widget.u2 u2Var = ((androidx.appcompat.widget.z2) x0Var).f9747a.R;
            if ((u2Var == null || u2Var.f9729e == null) ? false : true) {
                androidx.appcompat.widget.u2 u2Var2 = ((androidx.appcompat.widget.z2) x0Var).f9747a.R;
                o.u uVar = u2Var2 == null ? null : u2Var2.f9729e;
                if (uVar != null) {
                    uVar.collapseActionView();
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.b
    public void i(boolean z17) {
        if (z17 == this.f9249l) {
            return;
        }
        this.f9249l = z17;
        java.util.ArrayList arrayList = this.f9250m;
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.f.a(arrayList.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.b
    public android.view.View j() {
        return ((androidx.appcompat.widget.z2) this.f9242e).f9750d;
    }

    @Override // androidx.appcompat.app.b
    public int k() {
        return ((androidx.appcompat.widget.z2) this.f9242e).f9748b;
    }

    @Override // androidx.appcompat.app.b
    public int l() {
        return this.f9241d.getHeight();
    }

    @Override // androidx.appcompat.app.b
    public android.content.Context m() {
        if (this.f9239b == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.f9238a.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478069t, typedValue, true);
            int i17 = typedValue.resourceId;
            if (i17 != 0) {
                this.f9239b = new android.view.ContextThemeWrapper(this.f9238a, i17);
            } else {
                this.f9239b = this.f9238a;
            }
        }
        return this.f9239b;
    }

    @Override // androidx.appcompat.app.b
    public java.lang.CharSequence n() {
        return ((androidx.appcompat.widget.z2) this.f9242e).f9747a.getTitle();
    }

    @Override // androidx.appcompat.app.b
    public void o() {
        if (this.f9253p) {
            return;
        }
        this.f9253p = true;
        R(false);
    }

    @Override // androidx.appcompat.app.b
    public boolean q() {
        int l17 = l();
        return this.f9256s && (l17 == 0 || this.f9240c.getActionBarHideOffset() < l17);
    }

    @Override // androidx.appcompat.app.b
    public void r(android.content.res.Configuration configuration) {
        Q(this.f9238a.getResources().getBoolean(com.tencent.mm.R.bool.f478483a));
    }

    @Override // androidx.appcompat.app.b
    public boolean t(int i17, android.view.KeyEvent keyEvent) {
        o.r rVar;
        androidx.appcompat.app.x0 x0Var = this.f9246i;
        if (x0Var == null || (rVar = x0Var.f9231g) == null) {
            return false;
        }
        rVar.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return rVar.performShortcut(i17, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.b
    public void w(android.graphics.drawable.Drawable drawable) {
        this.f9241d.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.b
    public void x(int i17) {
        y(android.view.LayoutInflater.from(m()).inflate(i17, (android.view.ViewGroup) ((androidx.appcompat.widget.z2) this.f9242e).f9747a, false));
    }

    @Override // androidx.appcompat.app.b
    public void y(android.view.View view) {
        ((androidx.appcompat.widget.z2) this.f9242e).c(view);
    }

    @Override // androidx.appcompat.app.b
    public void z(android.view.View view, androidx.appcompat.app.ActionBar$LayoutParams actionBar$LayoutParams) {
        view.setLayoutParams(actionBar$LayoutParams);
        ((androidx.appcompat.widget.z2) this.f9242e).c(view);
    }

    public y0(android.app.Dialog dialog) {
        new java.util.ArrayList();
        this.f9250m = new java.util.ArrayList();
        this.f9251n = 0;
        this.f9252o = true;
        this.f9256s = true;
        this.f9260w = new androidx.appcompat.app.u0(this);
        this.f9261x = new androidx.appcompat.app.v0(this);
        this.f9262y = new androidx.appcompat.app.w0(this);
        O(dialog.getWindow().getDecorView());
    }
}
