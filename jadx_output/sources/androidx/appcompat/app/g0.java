package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class g0 extends androidx.appcompat.app.o implements o.p, android.view.LayoutInflater.Factory2 {
    public static final int[] X = {android.R.attr.windowBackground};
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public androidx.appcompat.app.e0[] I;

    /* renamed from: J, reason: collision with root package name */
    public androidx.appcompat.app.e0 f9108J;
    public boolean K;
    public boolean L;
    public boolean N;
    public androidx.appcompat.app.b0 P;
    public boolean Q;
    public int R;
    public boolean T;
    public android.graphics.Rect U;
    public android.graphics.Rect V;
    public androidx.appcompat.app.AppCompatViewInflater W;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f9109d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.Window f9110e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.Window.Callback f9111f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.Window.Callback f9112g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.appcompat.app.n f9113h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.appcompat.app.b f9114i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.MenuInflater f9115m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f9116n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.appcompat.widget.w0 f9117o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.appcompat.app.w f9118p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.appcompat.app.f0 f9119q;

    /* renamed from: r, reason: collision with root package name */
    public n.b f9120r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.appcompat.widget.ActionBarContextView f9121s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.PopupWindow f9122t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Runnable f9123u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9125w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewGroup f9126x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f9127y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f9128z;

    /* renamed from: v, reason: collision with root package name */
    public n3.z1 f9124v = null;
    public int M = -100;
    public final java.lang.Runnable S = new androidx.appcompat.app.p(this);

    public g0(android.content.Context context, android.view.Window window, androidx.appcompat.app.n nVar) {
        int resourceId;
        android.graphics.drawable.Drawable drawable = null;
        this.f9109d = context;
        this.f9110e = window;
        this.f9113h = nVar;
        android.view.Window.Callback callback = window.getCallback();
        this.f9111f = callback;
        if (callback instanceof androidx.appcompat.app.z) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        androidx.appcompat.app.z zVar = new androidx.appcompat.app.z(this, callback);
        this.f9112g = zVar;
        window.setCallback(zVar);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, X);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = androidx.appcompat.widget.h0.f().i(context, resourceId, true);
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if ((r5.getPackageManager().getActivityInfo(new android.content.ComponentName(r5, r5.getClass()), 0).configChanges & 512) == 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0112  */
    @Override // androidx.appcompat.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g0.a():boolean");
    }

    @Override // o.p
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        int i17;
        int i18;
        androidx.appcompat.app.e0 e0Var;
        android.view.Window.Callback r17 = r();
        if (r17 != null && !this.L) {
            o.r k17 = rVar.k();
            androidx.appcompat.app.e0[] e0VarArr = this.I;
            if (e0VarArr != null) {
                i17 = e0VarArr.length;
                i18 = 0;
            } else {
                i17 = 0;
                i18 = 0;
            }
            while (true) {
                if (i18 < i17) {
                    e0Var = e0VarArr[i18];
                    if (e0Var != null && e0Var.f9093h == k17) {
                        break;
                    }
                    i18++;
                } else {
                    e0Var = null;
                    break;
                }
            }
            if (e0Var != null) {
                return r17.onMenuItemSelected(e0Var.f9086a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.o
    public void c() {
        s();
        androidx.appcompat.app.b bVar = this.f9114i;
        if (bVar == null || !bVar.p()) {
            this.R |= 1;
            if (this.Q) {
                return;
            }
            android.view.View decorView = this.f9110e.getDecorView();
            java.lang.Runnable runnable = this.S;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.m(decorView, runnable);
            this.Q = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r6 == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    @Override // o.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(o.r r6) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g0.d(o.r):void");
    }

    @Override // androidx.appcompat.app.o
    public void e(android.os.Bundle bundle) {
        java.lang.String str;
        android.view.Window.Callback callback = this.f9111f;
        if (callback instanceof android.app.Activity) {
            try {
                android.app.Activity activity = (android.app.Activity) callback;
                try {
                    str = z2.c0.c(activity, activity.getComponentName());
                } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                    throw new java.lang.IllegalArgumentException(e17);
                }
            } catch (java.lang.IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                androidx.appcompat.app.b bVar = this.f9114i;
                if (bVar == null) {
                    this.T = true;
                } else {
                    bVar.A(true);
                }
            }
        }
        if (bundle == null || this.M != -100) {
            return;
        }
        this.M = bundle.getInt("appcompat:local_night_mode", -100);
    }

    @Override // androidx.appcompat.app.o
    public boolean f(int i17) {
        if (i17 == 8) {
            i17 = 108;
        } else if (i17 == 9) {
            i17 = 109;
        }
        if (this.G && i17 == 108) {
            return false;
        }
        if (this.C && i17 == 1) {
            this.C = false;
        }
        if (i17 == 1) {
            w();
            this.G = true;
            return true;
        }
        if (i17 == 2) {
            w();
            this.A = true;
            return true;
        }
        if (i17 == 5) {
            w();
            this.B = true;
            return true;
        }
        if (i17 == 10) {
            w();
            this.E = true;
            return true;
        }
        if (i17 == 108) {
            w();
            this.C = true;
            return true;
        }
        if (i17 != 109) {
            return this.f9110e.requestFeature(i17);
        }
        w();
        this.D = true;
        return true;
    }

    @Override // androidx.appcompat.app.o
    public void g(int i17) {
        p();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f9126x.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        android.view.LayoutInflater.from(this.f9109d).inflate(i17, viewGroup);
        this.f9111f.onContentChanged();
    }

    @Override // androidx.appcompat.app.o
    public final void h(java.lang.CharSequence charSequence) {
        this.f9116n = charSequence;
        androidx.appcompat.widget.w0 w0Var = this.f9117o;
        if (w0Var != null) {
            w0Var.setWindowTitle(charSequence);
            return;
        }
        androidx.appcompat.app.b bVar = this.f9114i;
        if (bVar != null) {
            bVar.K(charSequence);
            return;
        }
        android.widget.TextView textView = this.f9127y;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0147, code lost:
    
        if (n3.x0.c(r9) != false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    @Override // androidx.appcompat.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n.b i(n.a r9) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g0.i(n.a):n.b");
    }

    public void j(int i17, androidx.appcompat.app.e0 e0Var, android.view.Menu menu) {
        if (menu == null) {
            if (e0Var == null && i17 >= 0) {
                androidx.appcompat.app.e0[] e0VarArr = this.I;
                if (i17 < e0VarArr.length) {
                    e0Var = e0VarArr[i17];
                }
            }
            if (e0Var != null) {
                menu = e0Var.f9093h;
            }
        }
        if ((e0Var == null || e0Var.f9098m) && !this.L) {
            this.f9111f.onPanelClosed(i17, menu);
        }
    }

    public void k(o.r rVar) {
        androidx.appcompat.widget.q qVar;
        if (this.H) {
            return;
        }
        this.H = true;
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) this.f9117o;
        actionBarOverlayLayout.e();
        androidx.appcompat.widget.ActionMenuView actionMenuView = ((androidx.appcompat.widget.z2) actionBarOverlayLayout.f9319h).f9747a.f9478d;
        if (actionMenuView != null && (qVar = actionMenuView.f9340z) != null) {
            qVar.l();
            androidx.appcompat.widget.i iVar = qVar.B;
            if (iVar != null && iVar.b()) {
                iVar.f341711j.dismiss();
            }
        }
        android.view.Window.Callback r17 = r();
        if (r17 != null && !this.L) {
            r17.onPanelClosed(108, rVar);
        }
        this.H = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(androidx.appcompat.app.e0 r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L35
            int r2 = r6.f9086a
            if (r2 != 0) goto L35
            androidx.appcompat.widget.w0 r2 = r5.f9117o
            if (r2 == 0) goto L35
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.e()
            androidx.appcompat.widget.x0 r2 = r2.f9319h
            androidx.appcompat.widget.z2 r2 = (androidx.appcompat.widget.z2) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f9747a
            androidx.appcompat.widget.ActionMenuView r2 = r2.f9478d
            if (r2 == 0) goto L2c
            androidx.appcompat.widget.q r2 = r2.f9340z
            if (r2 == 0) goto L27
            boolean r2 = r2.m()
            if (r2 == 0) goto L27
            r2 = r0
            goto L28
        L27:
            r2 = r1
        L28:
            if (r2 == 0) goto L2c
            r2 = r0
            goto L2d
        L2c:
            r2 = r1
        L2d:
            if (r2 == 0) goto L35
            o.r r6 = r6.f9093h
            r5.k(r6)
            return
        L35:
            android.content.Context r2 = r5.f9109d
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r3 = 0
            if (r2 == 0) goto L55
            boolean r4 = r6.f9098m
            if (r4 == 0) goto L55
            android.view.ViewGroup r4 = r6.f9090e
            if (r4 == 0) goto L55
            r2.removeView(r4)
            if (r7 == 0) goto L55
            int r7 = r6.f9086a
            r5.j(r7, r6, r3)
        L55:
            r6.f9096k = r1
            r6.f9097l = r1
            r6.f9098m = r1
            r6.f9091f = r3
            r6.f9099n = r0
            androidx.appcompat.app.e0 r7 = r5.f9108J
            if (r7 != r6) goto L65
            r5.f9108J = r3
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g0.l(androidx.appcompat.app.e0, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ec, code lost:
    
        if ((r14 != null && r14.o()) != false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m(android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g0.m(android.view.KeyEvent):boolean");
    }

    public void n(int i17) {
        androidx.appcompat.app.e0 q17 = q(i17, true);
        if (q17.f9093h != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            q17.f9093h.u(bundle);
            if (bundle.size() > 0) {
                q17.f9101p = bundle;
            }
            q17.f9093h.z();
            q17.f9093h.clear();
        }
        q17.f9100o = true;
        q17.f9099n = true;
        if ((i17 == 108 || i17 == 0) && this.f9117o != null) {
            androidx.appcompat.app.e0 q18 = q(0, false);
            q18.f9096k = false;
            v(q18, null);
        }
    }

    public final void o() {
        if (this.P == null) {
            if (androidx.appcompat.app.t0.f9220d == null) {
                android.content.Context applicationContext = this.f9109d.getApplicationContext();
                androidx.appcompat.app.t0.f9220d = new androidx.appcompat.app.t0(applicationContext, (android.location.LocationManager) applicationContext.getSystemService(ya.b.LOCATION));
            }
            this.P = new androidx.appcompat.app.b0(this, androidx.appcompat.app.t0.f9220d);
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        if (this.W == null) {
            java.lang.String string = this.f9109d.obtainStyledAttributes(j.a.f296183k).getString(110);
            if (string != null && !androidx.appcompat.app.AppCompatViewInflater.class.getName().equals(string)) {
                try {
                    this.W = (androidx.appcompat.app.AppCompatViewInflater) java.lang.Class.forName(string).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                } catch (java.lang.Throwable unused) {
                    this.W = new androidx.appcompat.app.AppCompatViewInflater();
                }
            } else {
                this.W = new androidx.appcompat.app.AppCompatViewInflater();
            }
        }
        androidx.appcompat.app.AppCompatViewInflater appCompatViewInflater = this.W;
        int i17 = androidx.appcompat.widget.f3.f9585a;
        return appCompatViewInflater.createView(view, str, context, attributeSet, false, false, true, false);
    }

    public final void p() {
        android.view.ViewGroup viewGroup;
        if (this.f9125w) {
            return;
        }
        int[] iArr = j.a.f296183k;
        android.content.Context context = this.f9109d;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(111)) {
            obtainStyledAttributes.recycle();
            throw new java.lang.IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(120, false)) {
            f(1);
        } else if (obtainStyledAttributes.getBoolean(111, false)) {
            f(108);
        }
        if (obtainStyledAttributes.getBoolean(112, false)) {
            f(109);
        }
        if (obtainStyledAttributes.getBoolean(113, false)) {
            f(10);
        }
        this.F = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        android.view.Window window = this.f9110e;
        window.getDecorView();
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        if (this.G) {
            viewGroup = this.E ? (android.view.ViewGroup) from.inflate(com.tencent.mm.R.layout.f487899b0, (android.view.ViewGroup) null) : (android.view.ViewGroup) from.inflate(com.tencent.mm.R.layout.f487898az, (android.view.ViewGroup) null);
            androidx.appcompat.app.q qVar = new androidx.appcompat.app.q(this);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.u(viewGroup, qVar);
        } else if (this.F) {
            viewGroup = (android.view.ViewGroup) from.inflate(com.tencent.mm.R.layout.f487889aq, (android.view.ViewGroup) null);
            this.D = false;
            this.C = false;
        } else if (this.C) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478068s, typedValue, true);
            viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(typedValue.resourceId != 0 ? new n.d(context, typedValue.resourceId) : context).inflate(com.tencent.mm.R.layout.f487900b1, (android.view.ViewGroup) null);
            androidx.appcompat.widget.w0 w0Var = (androidx.appcompat.widget.w0) viewGroup.findViewById(com.tencent.mm.R.id.crd);
            this.f9117o = w0Var;
            w0Var.setWindowCallback(r());
            if (this.D) {
                ((androidx.appcompat.widget.ActionBarOverlayLayout) this.f9117o).d(109);
            }
            if (this.A) {
                ((androidx.appcompat.widget.ActionBarOverlayLayout) this.f9117o).d(2);
            }
            if (this.B) {
                ((androidx.appcompat.widget.ActionBarOverlayLayout) this.f9117o).d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.C + ", windowActionBarOverlay: " + this.D + ", android:windowIsFloating: " + this.F + ", windowActionModeOverlay: " + this.E + ", windowNoTitle: " + this.G + " }");
        }
        if (this.f9117o == null) {
            this.f9127y = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.obc);
        }
        java.lang.reflect.Method method = androidx.appcompat.widget.h3.f9604a;
        try {
            java.lang.reflect.Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new java.lang.Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        androidx.appcompat.widget.ContentFrameLayout contentFrameLayout = (androidx.appcompat.widget.ContentFrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.f482433eg);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) window.findViewById(android.R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                android.view.View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(android.R.id.content);
            if (viewGroup2 instanceof android.widget.FrameLayout) {
                ((android.widget.FrameLayout) viewGroup2).setForeground(null);
            }
        }
        window.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new androidx.appcompat.app.r(this));
        this.f9126x = viewGroup;
        android.view.Window.Callback callback = this.f9111f;
        java.lang.CharSequence title = callback instanceof android.app.Activity ? ((android.app.Activity) callback).getTitle() : this.f9116n;
        if (!android.text.TextUtils.isEmpty(title)) {
            androidx.appcompat.widget.w0 w0Var2 = this.f9117o;
            if (w0Var2 != null) {
                w0Var2.setWindowTitle(title);
            } else {
                androidx.appcompat.app.b bVar = this.f9114i;
                if (bVar != null) {
                    bVar.K(title);
                } else {
                    android.widget.TextView textView = this.f9127y;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        androidx.appcompat.widget.ContentFrameLayout contentFrameLayout2 = (androidx.appcompat.widget.ContentFrameLayout) this.f9126x.findViewById(android.R.id.content);
        android.view.View decorView = window.getDecorView();
        contentFrameLayout2.f9398m.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
        if (n3.x0.c(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(118, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(119, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(116)) {
            obtainStyledAttributes2.getValue(116, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(117)) {
            obtainStyledAttributes2.getValue(117, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(114)) {
            obtainStyledAttributes2.getValue(114, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(115)) {
            obtainStyledAttributes2.getValue(115, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f9125w = true;
        androidx.appcompat.app.e0 q17 = q(0, false);
        if (this.L || q17.f9093h != null) {
            return;
        }
        this.R |= 4096;
        if (this.Q) {
            return;
        }
        n3.u0.m(window.getDecorView(), this.S);
        this.Q = true;
    }

    public androidx.appcompat.app.e0 q(int i17, boolean z17) {
        androidx.appcompat.app.e0[] e0VarArr = this.I;
        if (e0VarArr == null || e0VarArr.length <= i17) {
            androidx.appcompat.app.e0[] e0VarArr2 = new androidx.appcompat.app.e0[i17 + 1];
            if (e0VarArr != null) {
                java.lang.System.arraycopy(e0VarArr, 0, e0VarArr2, 0, e0VarArr.length);
            }
            this.I = e0VarArr2;
            e0VarArr = e0VarArr2;
        }
        androidx.appcompat.app.e0 e0Var = e0VarArr[i17];
        if (e0Var != null) {
            return e0Var;
        }
        androidx.appcompat.app.e0 e0Var2 = new androidx.appcompat.app.e0(i17);
        e0VarArr[i17] = e0Var2;
        return e0Var2;
    }

    public final android.view.Window.Callback r() {
        return this.f9110e.getCallback();
    }

    public final void s() {
        p();
        if (this.C && this.f9114i == null) {
            android.view.Window.Callback callback = this.f9111f;
            if (callback instanceof android.app.Activity) {
                this.f9114i = new androidx.appcompat.app.y0((android.app.Activity) callback, this.D);
            } else if (callback instanceof android.app.Dialog) {
                this.f9114i = new androidx.appcompat.app.y0((android.app.Dialog) callback);
            }
            androidx.appcompat.app.b bVar = this.f9114i;
            if (bVar != null) {
                bVar.A(this.T);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0178, code lost:
    
        if (r15.f341753i.getCount() > 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0154, code lost:
    
        if (r15 != null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(androidx.appcompat.app.e0 r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g0.t(androidx.appcompat.app.e0, android.view.KeyEvent):void");
    }

    public final boolean u(androidx.appcompat.app.e0 e0Var, int i17, android.view.KeyEvent keyEvent, int i18) {
        o.r rVar;
        boolean z17 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((e0Var.f9096k || v(e0Var, keyEvent)) && (rVar = e0Var.f9093h) != null) {
            z17 = rVar.performShortcut(i17, keyEvent, i18);
        }
        if (z17 && (i18 & 1) == 0 && this.f9117o == null) {
            l(e0Var, true);
        }
        return z17;
    }

    public final boolean v(androidx.appcompat.app.e0 e0Var, android.view.KeyEvent keyEvent) {
        androidx.appcompat.widget.w0 w0Var;
        androidx.appcompat.widget.w0 w0Var2;
        android.content.res.Resources.Theme theme;
        androidx.appcompat.widget.w0 w0Var3;
        androidx.appcompat.widget.w0 w0Var4;
        if (this.L) {
            return false;
        }
        if (e0Var.f9096k) {
            return true;
        }
        androidx.appcompat.app.e0 e0Var2 = this.f9108J;
        if (e0Var2 != null && e0Var2 != e0Var) {
            l(e0Var2, false);
        }
        android.view.Window.Callback r17 = r();
        int i17 = e0Var.f9086a;
        if (r17 != null) {
            e0Var.f9092g = r17.onCreatePanelView(i17);
        }
        boolean z17 = i17 == 0 || i17 == 108;
        if (z17 && (w0Var4 = this.f9117o) != null) {
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) w0Var4;
            actionBarOverlayLayout.e();
            ((androidx.appcompat.widget.z2) actionBarOverlayLayout.f9319h).f9759m = true;
        }
        if (e0Var.f9092g == null && (!z17 || !(this.f9114i instanceof androidx.appcompat.app.q0))) {
            o.r rVar = e0Var.f9093h;
            if (rVar == null || e0Var.f9100o) {
                if (rVar == null) {
                    android.content.Context context = this.f9109d;
                    if ((i17 == 0 || i17 == 108) && this.f9117o != null) {
                        android.util.TypedValue typedValue = new android.util.TypedValue();
                        android.content.res.Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.tencent.mm.R.attr.f478068s, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.tencent.mm.R.attr.f478069t, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.tencent.mm.R.attr.f478069t, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            n.d dVar = new n.d(context, 0);
                            dVar.getTheme().setTo(theme);
                            context = dVar;
                        }
                    }
                    o.r rVar2 = new o.r(context);
                    rVar2.f341784h = this;
                    o.r rVar3 = e0Var.f9093h;
                    if (rVar2 != rVar3) {
                        if (rVar3 != null) {
                            rVar3.r(e0Var.f9094i);
                        }
                        e0Var.f9093h = rVar2;
                        o.n nVar = e0Var.f9094i;
                        if (nVar != null) {
                            rVar2.b(nVar, rVar2.f341780d);
                        }
                    }
                    if (e0Var.f9093h == null) {
                        return false;
                    }
                }
                if (z17 && (w0Var2 = this.f9117o) != null) {
                    if (this.f9118p == null) {
                        this.f9118p = new androidx.appcompat.app.w(this);
                    }
                    o.r rVar4 = e0Var.f9093h;
                    androidx.appcompat.app.w wVar = this.f9118p;
                    androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = (androidx.appcompat.widget.ActionBarOverlayLayout) w0Var2;
                    actionBarOverlayLayout2.e();
                    ((androidx.appcompat.widget.z2) actionBarOverlayLayout2.f9319h).f(rVar4, wVar);
                }
                e0Var.f9093h.z();
                if (!r17.onCreatePanelMenu(i17, e0Var.f9093h)) {
                    o.r rVar5 = e0Var.f9093h;
                    if (rVar5 != null) {
                        if (rVar5 != null) {
                            rVar5.r(e0Var.f9094i);
                        }
                        e0Var.f9093h = null;
                    }
                    if (z17 && (w0Var = this.f9117o) != null) {
                        androidx.appcompat.app.w wVar2 = this.f9118p;
                        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout3 = (androidx.appcompat.widget.ActionBarOverlayLayout) w0Var;
                        actionBarOverlayLayout3.e();
                        ((androidx.appcompat.widget.z2) actionBarOverlayLayout3.f9319h).f(null, wVar2);
                    }
                    return false;
                }
                e0Var.f9100o = false;
            }
            e0Var.f9093h.z();
            android.os.Bundle bundle = e0Var.f9101p;
            if (bundle != null) {
                e0Var.f9093h.s(bundle);
                e0Var.f9101p = null;
            }
            if (!r17.onPreparePanel(0, e0Var.f9092g, e0Var.f9093h)) {
                if (z17 && (w0Var3 = this.f9117o) != null) {
                    androidx.appcompat.app.w wVar3 = this.f9118p;
                    androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout4 = (androidx.appcompat.widget.ActionBarOverlayLayout) w0Var3;
                    actionBarOverlayLayout4.e();
                    ((androidx.appcompat.widget.z2) actionBarOverlayLayout4.f9319h).f(null, wVar3);
                }
                e0Var.f9093h.y();
                return false;
            }
            e0Var.f9093h.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            e0Var.f9093h.y();
        }
        e0Var.f9096k = true;
        e0Var.f9097l = false;
        this.f9108J = e0Var;
        return true;
    }

    public final void w() {
        if (this.f9125w) {
            throw new android.util.AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
