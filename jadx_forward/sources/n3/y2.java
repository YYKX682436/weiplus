package n3;

/* loaded from: classes14.dex */
public class y2 extends n3.d3 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f415974h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.reflect.Method f415975i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.Class f415976j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.reflect.Field f415977k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.reflect.Field f415978l;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.WindowInsets f415979c;

    /* renamed from: d, reason: collision with root package name */
    public e3.d[] f415980d;

    /* renamed from: e, reason: collision with root package name */
    public e3.d f415981e;

    /* renamed from: f, reason: collision with root package name */
    public n3.g3 f415982f;

    /* renamed from: g, reason: collision with root package name */
    public e3.d f415983g;

    public y2(n3.g3 g3Var, android.view.WindowInsets windowInsets) {
        super(g3Var);
        this.f415981e = null;
        this.f415979c = windowInsets;
    }

    private e3.d u(int i17, boolean z17) {
        e3.d dVar = e3.d.f328576e;
        for (int i18 = 1; i18 <= 256; i18 <<= 1) {
            if ((i17 & i18) != 0) {
                dVar = e3.d.a(dVar, v(i18, z17));
            }
        }
        return dVar;
    }

    private e3.d w() {
        n3.g3 g3Var = this.f415982f;
        return g3Var != null ? g3Var.f415871a.j() : e3.d.f328576e;
    }

    private e3.d x(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            throw new java.lang.UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f415974h) {
            z();
        }
        java.lang.reflect.Method method = f415975i;
        if (method != null && f415976j != null && f415977k != null) {
            try {
                java.lang.Object invoke = method.invoke(view, new java.lang.Object[0]);
                if (invoke == null) {
                    return null;
                }
                android.graphics.Rect rect = (android.graphics.Rect) f415977k.get(f415978l.get(invoke));
                if (rect != null) {
                    return e3.d.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (java.lang.ReflectiveOperationException e17) {
                e17.getMessage();
            }
        }
        return null;
    }

    private static void z() {
        try {
            f415975i = android.view.View.class.getDeclaredMethod("getViewRootImpl", new java.lang.Class[0]);
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
            f415976j = cls;
            f415977k = cls.getDeclaredField("mVisibleInsets");
            f415978l = java.lang.Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f415977k.setAccessible(true);
            f415978l.setAccessible(true);
        } catch (java.lang.ReflectiveOperationException e17) {
            e17.getMessage();
        }
        f415974h = true;
    }

    @Override // n3.d3
    public void d(android.view.View view) {
        e3.d x17 = x(view);
        if (x17 == null) {
            x17 = e3.d.f328576e;
        }
        r(x17);
    }

    @Override // n3.d3
    public void e(n3.g3 g3Var) {
        g3Var.f415871a.s(this.f415982f);
        g3Var.f415871a.r(this.f415983g);
    }

    @Override // n3.d3
    /* renamed from: equals */
    public boolean mo148918xb2c87fbf(java.lang.Object obj) {
        if (super.mo148918xb2c87fbf(obj)) {
            return java.util.Objects.equals(this.f415983g, ((n3.y2) obj).f415983g);
        }
        return false;
    }

    @Override // n3.d3
    public e3.d g(int i17) {
        return u(i17, false);
    }

    @Override // n3.d3
    public e3.d h(int i17) {
        return u(i17, true);
    }

    @Override // n3.d3
    public final e3.d l() {
        if (this.f415981e == null) {
            android.view.WindowInsets windowInsets = this.f415979c;
            this.f415981e = e3.d.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f415981e;
    }

    @Override // n3.d3
    public boolean o() {
        return this.f415979c.isRound();
    }

    @Override // n3.d3
    public boolean p(int i17) {
        for (int i18 = 1; i18 <= 256; i18 <<= 1) {
            if ((i17 & i18) != 0 && !y(i18)) {
                return false;
            }
        }
        return true;
    }

    @Override // n3.d3
    public void q(e3.d[] dVarArr) {
        this.f415980d = dVarArr;
    }

    @Override // n3.d3
    public void r(e3.d dVar) {
        this.f415983g = dVar;
    }

    @Override // n3.d3
    public void s(n3.g3 g3Var) {
        this.f415982f = g3Var;
    }

    public e3.d v(int i17, boolean z17) {
        e3.d j17;
        int i18;
        if (i17 == 1) {
            return z17 ? e3.d.b(0, java.lang.Math.max(w().f328578b, l().f328578b), 0, 0) : e3.d.b(0, l().f328578b, 0, 0);
        }
        if (i17 == 2) {
            if (z17) {
                e3.d w17 = w();
                e3.d j18 = j();
                return e3.d.b(java.lang.Math.max(w17.f328577a, j18.f328577a), 0, java.lang.Math.max(w17.f328579c, j18.f328579c), java.lang.Math.max(w17.f328580d, j18.f328580d));
            }
            e3.d l17 = l();
            n3.g3 g3Var = this.f415982f;
            j17 = g3Var != null ? g3Var.f415871a.j() : null;
            int i19 = l17.f328580d;
            if (j17 != null) {
                i19 = java.lang.Math.min(i19, j17.f328580d);
            }
            return e3.d.b(l17.f328577a, 0, l17.f328579c, i19);
        }
        e3.d dVar = e3.d.f328576e;
        if (i17 != 8) {
            if (i17 == 16) {
                return k();
            }
            if (i17 == 32) {
                return i();
            }
            if (i17 == 64) {
                return m();
            }
            if (i17 != 128) {
                return dVar;
            }
            n3.g3 g3Var2 = this.f415982f;
            n3.l f17 = g3Var2 != null ? g3Var2.f415871a.f() : f();
            return f17 != null ? e3.d.b(f17.b(), f17.d(), f17.c(), f17.a()) : dVar;
        }
        e3.d[] dVarArr = this.f415980d;
        j17 = dVarArr != null ? dVarArr[n3.e3.a(8)] : null;
        if (j17 != null) {
            return j17;
        }
        e3.d l18 = l();
        e3.d w18 = w();
        int i27 = l18.f328580d;
        if (i27 > w18.f328580d) {
            return e3.d.b(0, 0, 0, i27);
        }
        e3.d dVar2 = this.f415983g;
        return (dVar2 == null || dVar2.m126834xb2c87fbf(dVar) || (i18 = this.f415983g.f328580d) <= w18.f328580d) ? dVar : e3.d.b(0, 0, 0, i18);
    }

    public boolean y(int i17) {
        if (i17 != 1 && i17 != 2) {
            if (i17 == 4) {
                return false;
            }
            if (i17 != 8 && i17 != 128) {
                return true;
            }
        }
        return !v(i17, false).m126834xb2c87fbf(e3.d.f328576e);
    }

    public y2(n3.g3 g3Var, n3.y2 y2Var) {
        this(g3Var, new android.view.WindowInsets(y2Var.f415979c));
    }
}
