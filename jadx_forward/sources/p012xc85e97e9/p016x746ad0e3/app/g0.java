package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public class g0 extends p012xc85e97e9.p016x746ad0e3.app.o implements o.p, android.view.LayoutInflater.Factory2 {
    public static final int[] X = {android.R.attr.windowBackground};
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public p012xc85e97e9.p016x746ad0e3.app.e0[] I;

    /* renamed from: J, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.e0 f90641J;
    public boolean K;
    public boolean L;
    public boolean N;
    public p012xc85e97e9.p016x746ad0e3.app.b0 P;
    public boolean Q;
    public int R;
    public boolean T;
    public android.graphics.Rect U;
    public android.graphics.Rect V;
    public p012xc85e97e9.p016x746ad0e3.app.C0068xf61c0d93 W;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f90642d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.Window f90643e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.Window.Callback f90644f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.Window.Callback f90645g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.n f90646h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.b f90647i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.MenuInflater f90648m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f90649n;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w0 f90650o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.w f90651p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.f0 f90652q;

    /* renamed from: r, reason: collision with root package name */
    public n.b f90653r;

    /* renamed from: s, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0073x5080ced7 f90654s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.PopupWindow f90655t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Runnable f90656u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f90658w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewGroup f90659x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f90660y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f90661z;

    /* renamed from: v, reason: collision with root package name */
    public n3.z1 f90657v = null;
    public int M = -100;
    public final java.lang.Runnable S = new p012xc85e97e9.p016x746ad0e3.app.p(this);

    public g0(android.content.Context context, android.view.Window window, p012xc85e97e9.p016x746ad0e3.app.n nVar) {
        int resourceId;
        android.graphics.drawable.Drawable drawable = null;
        this.f90642d = context;
        this.f90643e = window;
        this.f90646h = nVar;
        android.view.Window.Callback callback = window.getCallback();
        this.f90644f = callback;
        if (callback instanceof p012xc85e97e9.p016x746ad0e3.app.z) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        p012xc85e97e9.p016x746ad0e3.app.z zVar = new p012xc85e97e9.p016x746ad0e3.app.z(this, callback);
        this.f90645g = zVar;
        window.setCallback(zVar);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, X);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.f().i(context, resourceId, true);
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
    @Override // p012xc85e97e9.p016x746ad0e3.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.app.g0.a():boolean");
    }

    @Override // o.p
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        int i17;
        int i18;
        p012xc85e97e9.p016x746ad0e3.app.e0 e0Var;
        android.view.Window.Callback r17 = r();
        if (r17 != null && !this.L) {
            o.r k17 = rVar.k();
            p012xc85e97e9.p016x746ad0e3.app.e0[] e0VarArr = this.I;
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
                    if (e0Var != null && e0Var.f90626h == k17) {
                        break;
                    }
                    i18++;
                } else {
                    e0Var = null;
                    break;
                }
            }
            if (e0Var != null) {
                return r17.onMenuItemSelected(e0Var.f90619a, menuItem);
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.o
    public void c() {
        s();
        p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f90647i;
        if (bVar == null || !bVar.p()) {
            this.R |= 1;
            if (this.Q) {
                return;
            }
            android.view.View decorView = this.f90643e.getDecorView();
            java.lang.Runnable runnable = this.S;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.app.g0.d(o.r):void");
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.o
    public void e(android.os.Bundle bundle) {
        java.lang.String str;
        android.view.Window.Callback callback = this.f90644f;
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
                p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f90647i;
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

    @Override // p012xc85e97e9.p016x746ad0e3.app.o
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
            return this.f90643e.requestFeature(i17);
        }
        w();
        this.D = true;
        return true;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.o
    public void g(int i17) {
        p();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f90659x.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        android.view.LayoutInflater.from(this.f90642d).inflate(i17, viewGroup);
        this.f90644f.onContentChanged();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.o
    public final void h(java.lang.CharSequence charSequence) {
        this.f90649n = charSequence;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w0 w0Var = this.f90650o;
        if (w0Var != null) {
            w0Var.mo2621xe1bd0686(charSequence);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f90647i;
        if (bVar != null) {
            bVar.K(charSequence);
            return;
        }
        android.widget.TextView textView = this.f90660y;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0147, code lost:
    
        if (n3.x0.c(r9) != false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    @Override // p012xc85e97e9.p016x746ad0e3.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n.b i(n.a r9) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.app.g0.i(n.a):n.b");
    }

    public void j(int i17, p012xc85e97e9.p016x746ad0e3.app.e0 e0Var, android.view.Menu menu) {
        if (menu == null) {
            if (e0Var == null && i17 >= 0) {
                p012xc85e97e9.p016x746ad0e3.app.e0[] e0VarArr = this.I;
                if (i17 < e0VarArr.length) {
                    e0Var = e0VarArr[i17];
                }
            }
            if (e0Var != null) {
                menu = e0Var.f90626h;
            }
        }
        if ((e0Var == null || e0Var.f90631m) && !this.L) {
            this.f90644f.onPanelClosed(i17, menu);
        }
    }

    public void k(o.r rVar) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar;
        if (this.H) {
            return;
        }
        this.H = true;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd) this.f90650o;
        c0074x22961cbd.e();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) c0074x22961cbd.f90852h).f91280a.f91011d;
        if (c0076xa566151a != null && (qVar = c0076xa566151a.f90873z) != null) {
            qVar.l();
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i iVar = qVar.B;
            if (iVar != null && iVar.b()) {
                iVar.f423244j.mo2732x63a3b28a();
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
    public void l(p012xc85e97e9.p016x746ad0e3.app.e0 r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L35
            int r2 = r6.f90619a
            if (r2 != 0) goto L35
            androidx.appcompat.widget.w0 r2 = r5.f90650o
            if (r2 == 0) goto L35
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd) r2
            r2.e()
            androidx.appcompat.widget.x0 r2 = r2.f90852h
            androidx.appcompat.widget.z2 r2 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f91280a
            androidx.appcompat.widget.ActionMenuView r2 = r2.f91011d
            if (r2 == 0) goto L2c
            androidx.appcompat.widget.q r2 = r2.f90873z
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
            o.r r6 = r6.f90626h
            r5.k(r6)
            return
        L35:
            android.content.Context r2 = r5.f90642d
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r3 = 0
            if (r2 == 0) goto L55
            boolean r4 = r6.f90631m
            if (r4 == 0) goto L55
            android.view.ViewGroup r4 = r6.f90623e
            if (r4 == 0) goto L55
            r2.removeView(r4)
            if (r7 == 0) goto L55
            int r7 = r6.f90619a
            r5.j(r7, r6, r3)
        L55:
            r6.f90629k = r1
            r6.f90630l = r1
            r6.f90631m = r1
            r6.f90624f = r3
            r6.f90632n = r0
            androidx.appcompat.app.e0 r7 = r5.f90641J
            if (r7 != r6) goto L65
            r5.f90641J = r3
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.app.g0.l(androidx.appcompat.app.e0, boolean):void");
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.app.g0.m(android.view.KeyEvent):boolean");
    }

    public void n(int i17) {
        p012xc85e97e9.p016x746ad0e3.app.e0 q17 = q(i17, true);
        if (q17.f90626h != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            q17.f90626h.u(bundle);
            if (bundle.size() > 0) {
                q17.f90634p = bundle;
            }
            q17.f90626h.z();
            q17.f90626h.clear();
        }
        q17.f90633o = true;
        q17.f90632n = true;
        if ((i17 == 108 || i17 == 0) && this.f90650o != null) {
            p012xc85e97e9.p016x746ad0e3.app.e0 q18 = q(0, false);
            q18.f90629k = false;
            v(q18, null);
        }
    }

    public final void o() {
        if (this.P == null) {
            if (p012xc85e97e9.p016x746ad0e3.app.t0.f90753d == null) {
                android.content.Context applicationContext = this.f90642d.getApplicationContext();
                p012xc85e97e9.p016x746ad0e3.app.t0.f90753d = new p012xc85e97e9.p016x746ad0e3.app.t0(applicationContext, (android.location.LocationManager) applicationContext.getSystemService(ya.b.f77489x9ff58fb5));
            }
            this.P = new p012xc85e97e9.p016x746ad0e3.app.b0(this, p012xc85e97e9.p016x746ad0e3.app.t0.f90753d);
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        if (this.W == null) {
            java.lang.String string = this.f90642d.obtainStyledAttributes(j.a.f377716k).getString(110);
            if (string != null && !p012xc85e97e9.p016x746ad0e3.app.C0068xf61c0d93.class.getName().equals(string)) {
                try {
                    this.W = (p012xc85e97e9.p016x746ad0e3.app.C0068xf61c0d93) java.lang.Class.forName(string).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                } catch (java.lang.Throwable unused) {
                    this.W = new p012xc85e97e9.p016x746ad0e3.app.C0068xf61c0d93();
                }
            } else {
                this.W = new p012xc85e97e9.p016x746ad0e3.app.C0068xf61c0d93();
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.C0068xf61c0d93 c0068xf61c0d93 = this.W;
        int i17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f3.f91118a;
        return c0068xf61c0d93.m2570x519d71c1(view, str, context, attributeSet, false, false, true, false);
    }

    public final void p() {
        android.view.ViewGroup viewGroup;
        if (this.f90658w) {
            return;
        }
        int[] iArr = j.a.f377716k;
        android.content.Context context = this.f90642d;
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
        android.view.Window window = this.f90643e;
        window.getDecorView();
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        if (this.G) {
            viewGroup = this.E ? (android.view.ViewGroup) from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569432b0, (android.view.ViewGroup) null) : (android.view.ViewGroup) from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569431az, (android.view.ViewGroup) null);
            p012xc85e97e9.p016x746ad0e3.app.q qVar = new p012xc85e97e9.p016x746ad0e3.app.q(this);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.a1.u(viewGroup, qVar);
        } else if (this.F) {
            viewGroup = (android.view.ViewGroup) from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569422aq, (android.view.ViewGroup) null);
            this.D = false;
            this.C = false;
        } else if (this.C) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559601s, typedValue, true);
            viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(typedValue.resourceId != 0 ? new n.d(context, typedValue.resourceId) : context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569433b1, (android.view.ViewGroup) null);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w0 w0Var = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w0) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.crd);
            this.f90650o = w0Var;
            w0Var.mo2620xd14da557(r());
            if (this.D) {
                ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd) this.f90650o).d(109);
            }
            if (this.A) {
                ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd) this.f90650o).d(2);
            }
            if (this.B) {
                ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd) this.f90650o).d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.C + ", windowActionBarOverlay: " + this.D + ", android:windowIsFloating: " + this.F + ", windowActionModeOverlay: " + this.E + ", windowNoTitle: " + this.G + " }");
        }
        if (this.f90650o == null) {
            this.f90660y = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.obc);
        }
        java.lang.reflect.Method method = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h3.f91137a;
        try {
            java.lang.reflect.Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new java.lang.Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0094x735be4de c0094x735be4de = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0094x735be4de) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f563966eg);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) window.findViewById(android.R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                android.view.View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                c0094x735be4de.addView(childAt);
            }
            viewGroup2.setId(-1);
            c0094x735be4de.setId(android.R.id.content);
            if (viewGroup2 instanceof android.widget.FrameLayout) {
                ((android.widget.FrameLayout) viewGroup2).setForeground(null);
            }
        }
        window.setContentView(viewGroup);
        c0094x735be4de.m2708x4e68371b(new p012xc85e97e9.p016x746ad0e3.app.r(this));
        this.f90659x = viewGroup;
        android.view.Window.Callback callback = this.f90644f;
        java.lang.CharSequence title = callback instanceof android.app.Activity ? ((android.app.Activity) callback).getTitle() : this.f90649n;
        if (!android.text.TextUtils.isEmpty(title)) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w0 w0Var2 = this.f90650o;
            if (w0Var2 != null) {
                w0Var2.mo2621xe1bd0686(title);
            } else {
                p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f90647i;
                if (bVar != null) {
                    bVar.K(title);
                } else {
                    android.widget.TextView textView = this.f90660y;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0094x735be4de c0094x735be4de2 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0094x735be4de) this.f90659x.findViewById(android.R.id.content);
        android.view.View decorView = window.getDecorView();
        c0094x735be4de2.f90931m.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
        if (n3.x0.c(c0094x735be4de2)) {
            c0094x735be4de2.requestLayout();
        }
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(118, c0094x735be4de2.m2706x847d43cf());
        obtainStyledAttributes2.getValue(119, c0094x735be4de2.m2707x8480f5cb());
        if (obtainStyledAttributes2.hasValue(116)) {
            obtainStyledAttributes2.getValue(116, c0094x735be4de2.m2704x6ccf17f1());
        }
        if (obtainStyledAttributes2.hasValue(117)) {
            obtainStyledAttributes2.getValue(117, c0094x735be4de2.m2705x6cd2c9ed());
        }
        if (obtainStyledAttributes2.hasValue(114)) {
            obtainStyledAttributes2.getValue(114, c0094x735be4de2.m2702x82dd8c34());
        }
        if (obtainStyledAttributes2.hasValue(115)) {
            obtainStyledAttributes2.getValue(115, c0094x735be4de2.m2703x82e13e30());
        }
        obtainStyledAttributes2.recycle();
        c0094x735be4de2.requestLayout();
        this.f90658w = true;
        p012xc85e97e9.p016x746ad0e3.app.e0 q17 = q(0, false);
        if (this.L || q17.f90626h != null) {
            return;
        }
        this.R |= 4096;
        if (this.Q) {
            return;
        }
        n3.u0.m(window.getDecorView(), this.S);
        this.Q = true;
    }

    public p012xc85e97e9.p016x746ad0e3.app.e0 q(int i17, boolean z17) {
        p012xc85e97e9.p016x746ad0e3.app.e0[] e0VarArr = this.I;
        if (e0VarArr == null || e0VarArr.length <= i17) {
            p012xc85e97e9.p016x746ad0e3.app.e0[] e0VarArr2 = new p012xc85e97e9.p016x746ad0e3.app.e0[i17 + 1];
            if (e0VarArr != null) {
                java.lang.System.arraycopy(e0VarArr, 0, e0VarArr2, 0, e0VarArr.length);
            }
            this.I = e0VarArr2;
            e0VarArr = e0VarArr2;
        }
        p012xc85e97e9.p016x746ad0e3.app.e0 e0Var = e0VarArr[i17];
        if (e0Var != null) {
            return e0Var;
        }
        p012xc85e97e9.p016x746ad0e3.app.e0 e0Var2 = new p012xc85e97e9.p016x746ad0e3.app.e0(i17);
        e0VarArr[i17] = e0Var2;
        return e0Var2;
    }

    public final android.view.Window.Callback r() {
        return this.f90643e.getCallback();
    }

    public final void s() {
        p();
        if (this.C && this.f90647i == null) {
            android.view.Window.Callback callback = this.f90644f;
            if (callback instanceof android.app.Activity) {
                this.f90647i = new p012xc85e97e9.p016x746ad0e3.app.y0((android.app.Activity) callback, this.D);
            } else if (callback instanceof android.app.Dialog) {
                this.f90647i = new p012xc85e97e9.p016x746ad0e3.app.y0((android.app.Dialog) callback);
            }
            p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f90647i;
            if (bVar != null) {
                bVar.A(this.T);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0178, code lost:
    
        if (r15.f423286i.getCount() > 0) goto L94;
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
    public final void t(p012xc85e97e9.p016x746ad0e3.app.e0 r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.app.g0.t(androidx.appcompat.app.e0, android.view.KeyEvent):void");
    }

    public final boolean u(p012xc85e97e9.p016x746ad0e3.app.e0 e0Var, int i17, android.view.KeyEvent keyEvent, int i18) {
        o.r rVar;
        boolean z17 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((e0Var.f90629k || v(e0Var, keyEvent)) && (rVar = e0Var.f90626h) != null) {
            z17 = rVar.performShortcut(i17, keyEvent, i18);
        }
        if (z17 && (i18 & 1) == 0 && this.f90650o == null) {
            l(e0Var, true);
        }
        return z17;
    }

    public final boolean v(p012xc85e97e9.p016x746ad0e3.app.e0 e0Var, android.view.KeyEvent keyEvent) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w0 w0Var;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w0 w0Var2;
        android.content.res.Resources.Theme theme;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w0 w0Var3;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w0 w0Var4;
        if (this.L) {
            return false;
        }
        if (e0Var.f90629k) {
            return true;
        }
        p012xc85e97e9.p016x746ad0e3.app.e0 e0Var2 = this.f90641J;
        if (e0Var2 != null && e0Var2 != e0Var) {
            l(e0Var2, false);
        }
        android.view.Window.Callback r17 = r();
        int i17 = e0Var.f90619a;
        if (r17 != null) {
            e0Var.f90625g = r17.onCreatePanelView(i17);
        }
        boolean z17 = i17 == 0 || i17 == 108;
        if (z17 && (w0Var4 = this.f90650o) != null) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd) w0Var4;
            c0074x22961cbd.e();
            ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) c0074x22961cbd.f90852h).f91292m = true;
        }
        if (e0Var.f90625g == null && (!z17 || !(this.f90647i instanceof p012xc85e97e9.p016x746ad0e3.app.q0))) {
            o.r rVar = e0Var.f90626h;
            if (rVar == null || e0Var.f90633o) {
                if (rVar == null) {
                    android.content.Context context = this.f90642d;
                    if ((i17 == 0 || i17 == 108) && this.f90650o != null) {
                        android.util.TypedValue typedValue = new android.util.TypedValue();
                        android.content.res.Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559601s, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559602t, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559602t, typedValue, true);
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
                    rVar2.f423317h = this;
                    o.r rVar3 = e0Var.f90626h;
                    if (rVar2 != rVar3) {
                        if (rVar3 != null) {
                            rVar3.r(e0Var.f90627i);
                        }
                        e0Var.f90626h = rVar2;
                        o.n nVar = e0Var.f90627i;
                        if (nVar != null) {
                            rVar2.b(nVar, rVar2.f423313d);
                        }
                    }
                    if (e0Var.f90626h == null) {
                        return false;
                    }
                }
                if (z17 && (w0Var2 = this.f90650o) != null) {
                    if (this.f90651p == null) {
                        this.f90651p = new p012xc85e97e9.p016x746ad0e3.app.w(this);
                    }
                    o.r rVar4 = e0Var.f90626h;
                    p012xc85e97e9.p016x746ad0e3.app.w wVar = this.f90651p;
                    p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd2 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd) w0Var2;
                    c0074x22961cbd2.e();
                    ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) c0074x22961cbd2.f90852h).f(rVar4, wVar);
                }
                e0Var.f90626h.z();
                if (!r17.onCreatePanelMenu(i17, e0Var.f90626h)) {
                    o.r rVar5 = e0Var.f90626h;
                    if (rVar5 != null) {
                        if (rVar5 != null) {
                            rVar5.r(e0Var.f90627i);
                        }
                        e0Var.f90626h = null;
                    }
                    if (z17 && (w0Var = this.f90650o) != null) {
                        p012xc85e97e9.p016x746ad0e3.app.w wVar2 = this.f90651p;
                        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd3 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd) w0Var;
                        c0074x22961cbd3.e();
                        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) c0074x22961cbd3.f90852h).f(null, wVar2);
                    }
                    return false;
                }
                e0Var.f90633o = false;
            }
            e0Var.f90626h.z();
            android.os.Bundle bundle = e0Var.f90634p;
            if (bundle != null) {
                e0Var.f90626h.s(bundle);
                e0Var.f90634p = null;
            }
            if (!r17.onPreparePanel(0, e0Var.f90625g, e0Var.f90626h)) {
                if (z17 && (w0Var3 = this.f90650o) != null) {
                    p012xc85e97e9.p016x746ad0e3.app.w wVar3 = this.f90651p;
                    p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd4 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd) w0Var3;
                    c0074x22961cbd4.e();
                    ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) c0074x22961cbd4.f90852h).f(null, wVar3);
                }
                e0Var.f90626h.y();
                return false;
            }
            e0Var.f90626h.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            e0Var.f90626h.y();
        }
        e0Var.f90629k = true;
        e0Var.f90630l = false;
        this.f90641J = e0Var;
        return true;
    }

    public final void w() {
        if (this.f90658w) {
            throw new android.util.AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
