package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public abstract class q0 implements com.tencent.mm.plugin.appbrand.widget.input.p4 {

    /* renamed from: e, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.widget.input.o0 f91603e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.widget.input.n0 f91604f;

    /* renamed from: n, reason: collision with root package name */
    public pl1.f f91609n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.ref.WeakReference f91610o;

    /* renamed from: p, reason: collision with root package name */
    public int f91611p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.e4 f91612q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.u3 f91613r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.o2 f91614s;

    /* renamed from: t, reason: collision with root package name */
    public long f91615t;

    /* renamed from: w, reason: collision with root package name */
    public int f91618w;

    /* renamed from: x, reason: collision with root package name */
    public int f91619x;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.v4 f91602d = null;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View.OnFocusChangeListener f91605g = new com.tencent.mm.plugin.appbrand.widget.input.f0(this);

    /* renamed from: h, reason: collision with root package name */
    public int f91606h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f91607i = -1;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.p0 f91608m = null;

    /* renamed from: u, reason: collision with root package name */
    public final ck5.e f91616u = new com.tencent.mm.plugin.appbrand.widget.input.g0(this);

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f91617v = new com.tencent.mm.plugin.appbrand.widget.input.h0(this);

    /* renamed from: y, reason: collision with root package name */
    public final ml1.b f91620y = new ml1.b();

    /* renamed from: z, reason: collision with root package name */
    public boolean f91621z = false;
    public final java.lang.Runnable A = new com.tencent.mm.plugin.appbrand.widget.input.i0(this);
    public final com.tencent.mm.sdk.platformtools.n3 B = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    public final com.tencent.mm.plugin.appbrand.widget.input.q3 C = new com.tencent.mm.plugin.appbrand.widget.input.x(this);
    public final com.tencent.mm.plugin.appbrand.widget.input.o3 D = new com.tencent.mm.plugin.appbrand.widget.input.y(this);
    public final com.tencent.mm.plugin.appbrand.widget.input.r3 E = new com.tencent.mm.plugin.appbrand.widget.input.z(this);
    public final com.tencent.mm.plugin.appbrand.widget.input.p3 F = new com.tencent.mm.plugin.appbrand.widget.input.b0(this);

    public static void j(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
        boolean z17 = q0Var.f91608m == com.tencent.mm.plugin.appbrand.widget.input.p0.CONFIRM_KEYBOARD_CLICKED && com.tencent.mm.plugin.appbrand.widget.input.m5.d(q0Var.f91609n.A);
        if (!z17) {
            if (q0Var.n() != null) {
                q0Var.f91613r.m(q0Var.F);
                q0Var.f91613r.z();
            } else {
                java.lang.ref.WeakReference weakReference = q0Var.f91610o;
                if (weakReference != null) {
                    com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
                    if (v5Var != null) {
                        com.tencent.mm.plugin.appbrand.widget.input.x4 F1 = v5Var.F1();
                        if (F1 != null) {
                            F1.hideVKB();
                        }
                    }
                }
            }
            com.tencent.mm.plugin.appbrand.widget.input.d1.b(q0Var.f91610o).c(q0Var.f91611p);
        }
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = q0Var.f91612q;
        if (e4Var != null) {
            if (e4Var.hasFocus()) {
                q0Var.l(z17);
            }
            if (z17) {
                return;
            }
            com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var2 = q0Var.f91612q;
            android.view.View.OnFocusChangeListener onFocusChangeListener = q0Var.f91605g;
            if (onFocusChangeListener != null) {
                ((x.n) e4Var2.f91412i).remove(onFocusChangeListener);
            } else {
                e4Var2.getClass();
            }
            com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = q0Var.f91613r;
            if (u3Var != null && u3Var.e(q0Var.f91612q)) {
                q0Var.f91613r.m(q0Var.F);
                q0Var.f91613r.z();
            }
            q0Var.f91612q.setFocusable(false);
            q0Var.f91612q.setFocusableInTouchMode(false);
            if (q0Var.f91609n.T) {
                q0Var.f91613r.e(q0Var.f91612q);
                q0Var.z(q0Var.f91612q);
                q0Var.f91612q.n();
                q0Var.f91612q = null;
                ((java.util.HashSet) com.tencent.mm.plugin.appbrand.utils.s0.f90550a).remove(q0Var);
            }
        }
    }

    public final void A() {
        com.tencent.mm.plugin.appbrand.widget.input.b.a(this.f91612q, this.f91609n);
        pl1.f fVar = this.f91609n;
        java.lang.Integer num = fVar.f356600n;
        if (num == null) {
            fVar.f356600n = 140;
        } else if (num.intValue() <= 0) {
            this.f91609n.f356600n = Integer.MAX_VALUE;
        }
        com.tencent.mm.plugin.appbrand.widget.input.v1 g17 = com.tencent.mm.plugin.appbrand.widget.input.v1.g(this.f91612q);
        int intValue = this.f91609n.f356600n.intValue();
        g17.f42561f = 0;
        g17.f42560e = intValue;
        g17.f42556a = false;
        g17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_1;
        g17.d(this.f91616u);
        this.f91612q.setPasswordMode(this.f91609n.S);
        if (com.tencent.mm.plugin.appbrand.widget.input.m5.d(this.f91609n.f356605s)) {
            this.f91612q.setEnabled(false);
            this.f91612q.setFocusable(false);
            this.f91612q.setFocusableInTouchMode(false);
            this.f91612q.setClickable(false);
        } else {
            this.f91612q.setEnabled(true);
            this.f91612q.setClickable(true);
        }
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = this.f91612q;
        if (e4Var instanceof com.tencent.mm.plugin.appbrand.widget.input.a2) {
            if (this.f91609n.D != null) {
                ((com.tencent.mm.plugin.appbrand.widget.input.a2) e4Var).setLineSpace(r1.intValue());
            }
            if (this.f91609n.E != null) {
                ((com.tencent.mm.plugin.appbrand.widget.input.a2) this.f91612q).setLineHeight(r0.intValue());
            }
        }
    }

    public final void B() {
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var;
        if (this.f91609n.f356607u.booleanValue()) {
            n();
        }
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = this.f91613r;
        if (u3Var == null || (e4Var = this.f91612q) == null) {
            return;
        }
        u3Var.f91691x = e4Var;
        u3Var.setComponentView(this.f91609n.G.booleanValue());
        this.f91613r.M();
        this.f91613r.setShowDoneButton(com.tencent.mm.plugin.appbrand.widget.input.m5.d(this.f91609n.f356608v));
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var2 = this.f91613r;
        if (u3Var2 != null) {
            u3Var2.setOnSmileyChosenListener(this.C);
            this.f91613r.setOnDoneListener(this.D);
            this.f91613r.setOnVisibilityChangedListener(this.E);
        }
        if (com.tencent.mm.plugin.appbrand.ui.na.k(this.f91612q) && this.f91612q.hasFocus()) {
            this.f91613r.k(this.F);
            this.f91613r.I();
        }
    }

    public boolean C(com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var, pl1.f fVar) {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.plugin.appbrand.widget.input.p pVar;
        return (e4Var == null || (weakReference = this.f91610o) == null || weakReference.get() == null || (pVar = (com.tencent.mm.plugin.appbrand.widget.input.p) ((com.tencent.mm.plugin.appbrand.page.v5) this.f91610o.get()).E1()) == null || !pVar.s(((com.tencent.mm.plugin.appbrand.page.v5) this.f91610o.get()).a2(), e4Var, fVar.f356588b.intValue(), fVar.f356589c.intValue(), fVar.f356591e.intValue(), fVar.f356590d.intValue())) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.widget.input.e4 r0 = r5.f91612q
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L56
            java.lang.ref.WeakReference r0 = r5.f91610o
            if (r0 == 0) goto L56
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L11
            goto L56
        L11:
            com.tencent.mm.plugin.appbrand.widget.input.e4 r0 = r5.f91612q
            r0.n()
            java.lang.ref.WeakReference r0 = r5.f91610o
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.appbrand.page.v5 r0 = (com.tencent.mm.plugin.appbrand.page.v5) r0
            android.view.ViewGroup r0 = r0.E1()
            com.tencent.mm.plugin.appbrand.widget.input.p r0 = (com.tencent.mm.plugin.appbrand.widget.input.p) r0
            if (r0 != 0) goto L27
            goto L56
        L27:
            com.tencent.mm.plugin.appbrand.widget.input.e4 r3 = r5.f91612q
            boolean r3 = r3.hasFocus()
            if (r3 == 0) goto L42
            com.tencent.mm.plugin.appbrand.widget.input.o2 r3 = r5.f91614s
            r4 = 8
            if (r3 == 0) goto L38
            r3.setVisibility(r4)
        L38:
            r5.n()
            com.tencent.mm.plugin.appbrand.widget.input.u3 r3 = r5.f91613r
            if (r3 == 0) goto L42
            r3.setVisibility(r4)
        L42:
            com.tencent.mm.plugin.appbrand.widget.input.e4 r3 = r5.f91612q
            r0.p(r3)
            java.lang.ref.WeakReference r0 = r5.f91610o
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.appbrand.page.v5 r0 = (com.tencent.mm.plugin.appbrand.page.v5) r0
            com.tencent.mm.plugin.appbrand.widget.input.e4 r3 = r5.f91612q
            com.tencent.mm.plugin.appbrand.widget.input.r1.h(r0, r3)
            r0 = r1
            goto L57
        L56:
            r0 = r2
        L57:
            if (r0 == 0) goto L64
            r0 = 0
            r5.f91612q = r0
            java.util.Set r0 = com.tencent.mm.plugin.appbrand.utils.s0.f90550a
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.remove(r5)
            return r1
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.input.q0.a():boolean");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public int b() {
        java.lang.Integer num;
        pl1.f fVar = this.f91609n;
        if (fVar != null && (num = fVar.f356611y) != null) {
            return num.intValue();
        }
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = this.f91612q;
        return (e4Var == null || !e4Var.e()) ? 0 : 5;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean c(int i17, int i18, boolean z17) {
        java.lang.ref.WeakReference weakReference;
        if (this.f91612q != null && (weakReference = this.f91610o) != null && weakReference.get() != null) {
            this.f91612q.performClick();
        }
        com.tencent.mm.plugin.appbrand.widget.input.b.b(this.f91612q, i17, i18);
        t(false);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public android.text.Editable currentValue() {
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = this.f91612q;
        if (e4Var == null) {
            return null;
        }
        return e4Var.getText();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public void d(java.lang.String str, java.lang.Integer num) {
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = this.f91612q;
        if (e4Var == null) {
            return;
        }
        e4Var.u(str);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(num == null ? -1 : num.intValue());
        com.tencent.mm.plugin.appbrand.widget.input.b.b(this.f91612q, valueOf.intValue(), valueOf.intValue());
        t(false);
        r();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public final int e() {
        return this.f91611p;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public final void f(int i17) {
        com.tencent.mm.plugin.appbrand.widget.input.n0 n0Var = this.f91604f;
        if (n0Var != null) {
            qc1.r rVar = (qc1.r) n0Var;
            rVar.getClass();
            try {
                com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) rVar.f361491a.get();
                if (v5Var == null) {
                    return;
                }
                rVar.f361492b.J(e(), i17, v5Var);
                new com.tencent.mm.plugin.appbrand.jsapi.p1().x(i17, v5Var.v3(), v5Var, java.lang.Integer.valueOf(e()));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean g(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        java.lang.ref.WeakReference weakReference;
        return (v5Var == null || (weakReference = this.f91610o) == null || v5Var != weakReference.get()) ? false : true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public android.view.View getInputPanel() {
        return this.f91613r;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public android.widget.EditText h() {
        return this.f91612q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r2 != false) goto L28;
     */
    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean hideKeyboard() {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.widget.input.e4 r0 = r4.f91612q
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L20
            boolean r0 = r0.isFocused()
            if (r0 != 0) goto L1e
            com.tencent.mm.plugin.appbrand.widget.input.u3 r0 = r4.n()
            if (r0 == 0) goto L20
            com.tencent.mm.plugin.appbrand.widget.input.u3 r0 = r4.n()
            android.widget.EditText r0 = r0.getAttachedEditText()
            com.tencent.mm.plugin.appbrand.widget.input.e4 r3 = r4.f91612q
            if (r0 != r3) goto L20
        L1e:
            r0 = r1
            goto L21
        L20:
            r0 = r2
        L21:
            if (r0 != 0) goto L4a
            java.lang.ref.WeakReference r0 = r4.f91610o
            if (r0 == 0) goto L47
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L2e
            goto L47
        L2e:
            java.lang.ref.WeakReference r0 = r4.f91610o
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.appbrand.page.v5 r0 = (com.tencent.mm.plugin.appbrand.page.v5) r0
            android.content.Context r0 = r0.getContext()
            boolean r3 = r0 instanceof android.app.Activity
            if (r3 == 0) goto L47
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.View r0 = r0.getCurrentFocus()
            if (r0 == 0) goto L47
            r2 = r1
        L47:
            if (r2 == 0) goto L4a
            goto L55
        L4a:
            com.tencent.mm.plugin.appbrand.widget.input.u3 r0 = r4.n()
            if (r0 == 0) goto L55
            r2 = 8
            r0.setVisibility(r2)
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.input.q0.hideKeyboard():boolean");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p4
    public boolean i() {
        pl1.f fVar = this.f91609n;
        return fVar != null && com.tencent.mm.plugin.appbrand.widget.input.m5.d(fVar.B);
    }

    public boolean k(com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var, pl1.f fVar) {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.plugin.appbrand.widget.input.p pVar;
        return (e4Var == null || (weakReference = this.f91610o) == null || weakReference.get() == null || (pVar = (com.tencent.mm.plugin.appbrand.widget.input.p) ((com.tencent.mm.plugin.appbrand.page.v5) this.f91610o.get()).E1()) == null || !pVar.m(((com.tencent.mm.plugin.appbrand.page.v5) this.f91610o.get()).a2(), e4Var, fVar.f356588b.intValue(), fVar.f356589c.intValue(), fVar.f356591e.intValue(), fVar.f356590d.intValue())) ? false : true;
    }

    public final void l(boolean z17) {
        java.lang.String str;
        java.lang.String message;
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = this.f91612q;
        if (e4Var == null) {
            return;
        }
        pl1.f fVar = this.f91609n;
        com.tencent.mm.plugin.appbrand.widget.input.p0 p0Var = com.tencent.mm.plugin.appbrand.widget.input.p0.CONFIRM_KEYBOARD_CLICKED;
        com.tencent.mm.plugin.appbrand.widget.input.p0 p0Var2 = this.f91608m;
        boolean z18 = p0Var == p0Var2 || com.tencent.mm.plugin.appbrand.widget.input.p0.CONFIRM_BAR_CLICKED == p0Var2;
        java.lang.String obj = e4Var.getText().toString();
        java.lang.String str2 = fVar != null ? fVar.R : null;
        java.util.Map map = com.tencent.mm.plugin.appbrand.widget.input.r1.f91641d;
        if (!"encrypt-text".equalsIgnoreCase(str2)) {
            v(obj, this.f91612q.getSelectionEnd(), z18, z17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputInvokeHandler", "dispatchKeyboardComplete, do encrypt");
        try {
            message = null;
            str = com.tencent.mm.plugin.appbrand.widget.input.l4.b(o(), (com.tencent.mm.plugin.appbrand.jsapi.l) this.f91610o.get(), fVar);
        } catch (com.tencent.mm.plugin.appbrand.widget.input.k4 e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandInputInvokeHandler", "dispatchKeyboardComplete, encrypt fail since %s", e17);
            str = null;
            message = e17.getMessage();
        }
        w(obj, this.f91612q.getSelectionEnd(), z18, z17, str, message);
    }

    public final void m() {
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var;
        java.lang.ref.WeakReference weakReference = this.f91610o;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = weakReference == null ? null : (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
        if (this.f91613r == null) {
            n();
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = true;
        objArr[0] = java.lang.Boolean.valueOf(this.f91612q == null);
        objArr[1] = java.lang.Boolean.valueOf(v5Var == null);
        objArr[2] = java.lang.Boolean.valueOf(this.f91613r == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, null==mInput[%b], null==page[%b], null==mSmileyPanel[%b]", objArr);
        if (v5Var == null || (e4Var = this.f91612q) == null || this.f91613r == null) {
            return;
        }
        java.util.Map map = com.tencent.mm.plugin.appbrand.widget.input.r1.f91641d;
        ik1.h0.b(new com.tencent.mm.plugin.appbrand.widget.input.o1(v5Var, e4Var));
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        pBool.value = false;
        com.tencent.mm.plugin.appbrand.widget.input.u uVar = new com.tencent.mm.plugin.appbrand.widget.input.u(this, pBool);
        android.app.Activity a17 = q75.a.a(v5Var.getContext());
        if (a17 != null && a17.getCurrentFocus() != null) {
            android.view.View currentFocus = a17.getCurrentFocus();
            boolean isActive = com.tencent.mm.plugin.appbrand.widget.input.m5.b(currentFocus).isActive(currentFocus);
            android.view.View wrapperView = v5Var.a2().getWrapperView();
            if (wrapperView != null && currentFocus != null) {
                android.view.ViewParent parent = currentFocus.getParent();
                while (wrapperView != parent) {
                    parent = parent.getParent();
                    if (parent == null) {
                    }
                }
                if (isActive && z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, servedConnecting && servedForWebView, delay checkForInput");
                    this.f91613r.setOnVisibilityChangedListener(new com.tencent.mm.plugin.appbrand.widget.input.v(this, pBool, uVar));
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    com.tencent.mm.plugin.appbrand.widget.input.w wVar = new com.tencent.mm.plugin.appbrand.widget.input.w(this, pBool, uVar);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(wVar, 100L, false);
                    return;
                }
            }
            z17 = false;
            if (isActive) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputInvokeHandler", "ensureInputFocusedWithSoftKeyboard, servedConnecting && servedForWebView, delay checkForInput");
                this.f91613r.setOnVisibilityChangedListener(new com.tencent.mm.plugin.appbrand.widget.input.v(this, pBool, uVar));
                ku5.u0 u0Var2 = ku5.t0.f312615d;
                com.tencent.mm.plugin.appbrand.widget.input.w wVar2 = new com.tencent.mm.plugin.appbrand.widget.input.w(this, pBool, uVar);
                ku5.t0 t0Var2 = (ku5.t0) u0Var2;
                t0Var2.getClass();
                t0Var2.z(wVar2, 100L, false);
                return;
            }
        }
        uVar.run();
    }

    public final com.tencent.mm.plugin.appbrand.widget.input.u3 n() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = this.f91613r;
        if (u3Var != null) {
            return u3Var;
        }
        java.lang.ref.WeakReference weakReference = this.f91610o;
        if (weakReference == null || (v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()) == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.widget.input.u3 y17 = com.tencent.mm.plugin.appbrand.widget.input.u3.y(v5Var.getContentView());
        this.f91613r = y17;
        return y17;
    }

    public synchronized com.tencent.mm.plugin.appbrand.widget.input.v4 o() {
        com.tencent.mm.plugin.appbrand.widget.input.v4 v4Var;
        v4Var = this.f91602d;
        if (v4Var == null) {
            pl1.f fVar = this.f91609n;
            com.tencent.mm.plugin.appbrand.widget.input.l lVar = new com.tencent.mm.plugin.appbrand.widget.input.l(fVar != null ? fVar.R : null, this);
            this.f91602d = lVar;
            v4Var = lVar;
        }
        return v4Var;
    }

    public final void p() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        com.tencent.mm.plugin.appbrand.widget.input.o2 o2Var = this.f91614s;
        if (o2Var == null) {
            java.lang.ref.WeakReference weakReference = this.f91610o;
            if (weakReference != null && (v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()) != null && v5Var.getContentView() != null) {
                android.view.View contentView = v5Var.getContentView();
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                if (n3.x0.b(contentView)) {
                    android.view.View contentView2 = v5Var.getContentView();
                    int i17 = com.tencent.mm.plugin.appbrand.widget.input.o2.f91577o;
                    o2Var = (com.tencent.mm.plugin.appbrand.widget.input.o2) contentView2.getRootView().findViewById(com.tencent.mm.R.id.f483159y6);
                    this.f91614s = o2Var;
                }
            }
            o2Var = null;
        }
        if (o2Var != null) {
            this.f91614s.setVisibility(8);
        }
    }

    public final void q(boolean z17) {
        int i17;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f91610o.get();
        android.view.View contentView = v5Var.getContentView();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(contentView)) {
            com.tencent.mm.plugin.appbrand.widget.input.u3 G = com.tencent.mm.plugin.appbrand.widget.input.u3.G(v5Var.getContentView(), null, v5Var.V1());
            this.f91613r = G;
            G.setComponentView(this.f91609n.G.booleanValue());
            this.f91613r.M();
            if (this.f91609n.T) {
                com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = this.f91613r;
                if (u3Var != null) {
                    u3Var.setOnSmileyChosenListener(this.C);
                    this.f91613r.setOnDoneListener(this.D);
                    this.f91613r.setOnVisibilityChangedListener(this.E);
                }
                p();
            }
            com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = this.f91612q;
            android.view.View.OnFocusChangeListener onFocusChangeListener = this.f91605g;
            if (onFocusChangeListener != null) {
                ((x.n) e4Var.f91412i).put(onFocusChangeListener, e4Var);
            } else {
                e4Var.getClass();
            }
            this.f91612q.setOnKeyListener(new com.tencent.mm.plugin.appbrand.widget.input.c0(this));
            if (this.f91609n.T) {
                com.tencent.mm.plugin.appbrand.page.v5 v5Var2 = (com.tencent.mm.plugin.appbrand.page.v5) this.f91610o.get();
                com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var2 = this.f91612q;
                java.util.Map map = com.tencent.mm.plugin.appbrand.widget.input.r1.f91641d;
                if (v5Var2 != null) {
                    ik1.h0.b(new com.tencent.mm.plugin.appbrand.widget.input.o1(v5Var2, e4Var2));
                }
            }
            this.f91613r.setCanSmileyInput(!this.f91609n.S && z17);
            pl1.f fVar = this.f91609n;
            pl1.c cVar = fVar.f356612z;
            pl1.c cVar2 = pl1.c.RETURN;
            pl1.c cVar3 = pl1.c.DONE;
            if (cVar == null) {
                if (!fVar.f356607u.booleanValue()) {
                    cVar2 = cVar3;
                }
                i17 = cVar2.f356583d;
            } else {
                if (!fVar.f356607u.booleanValue()) {
                    pl1.f fVar2 = this.f91609n;
                    if (cVar2 == fVar2.f356612z) {
                        fVar2.f356612z = cVar3;
                    }
                }
                i17 = this.f91609n.f356612z.f356583d;
            }
            com.tencent.mm.plugin.appbrand.widget.input.d0 d0Var = (this.f91609n.f356607u.booleanValue() && i17 == 0) ? null : new com.tencent.mm.plugin.appbrand.widget.input.d0(this, i17);
            this.f91612q.setImeOptions(i17);
            this.f91612q.setOnEditorActionListener(d0Var);
            this.f91613r.setShowDoneButton(this.f91609n.f356608v.booleanValue());
            this.f91613r.f91691x = this.f91612q;
            if (this.f91609n.T) {
                m();
            } else {
                this.f91612q.setFocusable(false);
                this.f91612q.setFocusableInTouchMode(false);
                this.f91613r.m(this.F);
                this.f91613r.z();
            }
            if (this.f91609n.T) {
                com.tencent.mm.plugin.appbrand.widget.input.d1.b(this.f91610o).d(this.f91611p);
            }
        }
    }

    public final void r() {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = this.f91612q;
        if (e4Var == null) {
            return;
        }
        if (e4Var.getLineCount() == this.f91606h && this.f91612q.k() == this.f91607i) {
            return;
        }
        boolean z17 = this.f91606h == -1;
        this.f91606h = this.f91612q.getLineCount();
        this.f91607i = this.f91612q.k();
        if (this.f91603e != null) {
            com.tencent.mm.plugin.appbrand.widget.input.o0 o0Var = this.f91603e;
            int i17 = this.f91606h;
            int i18 = this.f91607i;
            qc1.f fVar = (qc1.f) o0Var;
            int i19 = fVar.f361464a.f91611p;
            fVar.f361465b.getClass();
            c01.l2 b17 = c01.n2.d().b("AppBrandJsInput@" + i19);
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = (b17 == null || (weakReference = (java.lang.ref.WeakReference) b17.c("webview_reference", null)) == null) ? null : (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
            if (v5Var != null && v5Var.isRunning()) {
                qc1.h hVar = new qc1.h(null);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("height", java.lang.Integer.valueOf(ik1.w.d(i18)));
                hashMap.put("lineCount", java.lang.Integer.valueOf(i17));
                hashMap.put("inputId", java.lang.Integer.valueOf(i19));
                hVar.u(v5Var);
                hVar.t(hashMap);
                hVar.m();
            }
        }
        if (!this.f91609n.f356607u.booleanValue() || z17) {
            return;
        }
        java.lang.Integer num = this.f91609n.f356590d;
        java.lang.Class cls = com.tencent.mm.plugin.appbrand.widget.input.m5.f91549d;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.f91609n.f356589c;
        this.f91618w = intValue + (num2 != null ? num2.intValue() : 0);
        s();
        java.lang.Integer num3 = this.f91609n.f356590d;
        int intValue2 = num3 != null ? num3.intValue() : 0;
        java.lang.Integer num4 = this.f91609n.f356589c;
        this.f91619x = intValue2 + (num4 != null ? num4.intValue() : 0);
        t(true);
    }

    public final void s() {
        if (this.f91612q != null && com.tencent.mm.plugin.appbrand.widget.input.m5.d(this.f91609n.f356609w) && com.tencent.mm.plugin.appbrand.widget.input.m5.d(this.f91609n.f356607u)) {
            ((com.tencent.mm.plugin.appbrand.widget.input.a2) this.f91612q).setAutoHeight(true);
            int lineHeight = this.f91612q.getLineHeight();
            int k17 = this.f91612q.k();
            java.lang.Integer num = this.f91609n.f356592f;
            int intValue = (num == null || num.intValue() <= 0) ? lineHeight : this.f91609n.f356592f.intValue();
            java.lang.Integer num2 = this.f91609n.f356593g;
            int max = (num2 == null || num2.intValue() <= 0) ? Integer.MAX_VALUE : java.lang.Math.max(this.f91609n.f356593g.intValue(), lineHeight);
            this.f91612q.setMinHeight(intValue);
            this.f91612q.setMaxHeight(max);
            this.f91609n.f356589c = java.lang.Integer.valueOf(java.lang.Math.max(intValue, java.lang.Math.min(k17, max)));
            C(this.f91612q, this.f91609n);
        }
    }

    public final void t(boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var;
        com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var;
        int i17;
        if (this.f91609n.f356607u.booleanValue() && (u3Var = this.f91613r) != null && u3Var.isShown() && (e4Var = this.f91612q) != null && e4Var == this.f91613r.getAttachedEditText()) {
            if (!z17) {
                com.tencent.mm.plugin.appbrand.widget.input.d1.b(this.f91610o).d(this.f91611p);
                return;
            }
            java.lang.ref.WeakReference weakReference = this.f91610o;
            int measuredHeight = (weakReference == null || weakReference.get() == null || ((com.tencent.mm.plugin.appbrand.page.v5) this.f91610o.get()).E1() == null) ? 0 : ((com.tencent.mm.plugin.appbrand.page.v5) this.f91610o.get()).E1().getMeasuredHeight() + ((com.tencent.mm.plugin.appbrand.page.v5) this.f91610o.get()).E1().getScrollY();
            int i18 = this.f91619x;
            if ((i18 <= this.f91618w || i18 - this.f91612q.getLineHeight() > measuredHeight) && (((i17 = this.f91619x) > this.f91618w || i17 + this.f91612q.getLineHeight() > measuredHeight) && this.f91612q.k() < measuredHeight)) {
                return;
            }
            com.tencent.mm.plugin.appbrand.widget.input.d1.b(this.f91610o).d(this.f91611p);
        }
    }

    public abstract void u(java.lang.String str);

    public abstract void v(java.lang.String str, int i17, boolean z17, boolean z18);

    public void w(java.lang.String str, int i17, boolean z17, boolean z18, java.lang.String str2, java.lang.String str3) {
        v(str, i17, z17, z18);
    }

    public abstract void x();

    public abstract void y();

    public void z(com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var) {
        com.tencent.mm.plugin.appbrand.widget.input.p pVar;
        if (e4Var == null) {
            return;
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f91605g;
        if (onFocusChangeListener != null) {
            ((x.n) e4Var.f91412i).remove(onFocusChangeListener);
        }
        java.lang.ref.WeakReference weakReference = this.f91610o;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = weakReference == null ? null : (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
        if (v5Var == null || (pVar = (com.tencent.mm.plugin.appbrand.widget.input.p) v5Var.E1()) == null) {
            return;
        }
        pVar.p(e4Var);
    }
}
