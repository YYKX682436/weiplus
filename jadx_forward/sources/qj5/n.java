package qj5;

/* loaded from: classes8.dex */
public final class n extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 {
    public static qj5.b I2;
    public android.view.View A2;
    public android.view.View B2;
    public android.widget.FrameLayout C2;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 D2;
    public com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed E2;
    public final jz5.g F2;
    public java.lang.String G2;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 H2;

    /* renamed from: q2, reason: collision with root package name */
    public qj5.o f445516q2;

    /* renamed from: r2, reason: collision with root package name */
    public boolean f445517r2;

    /* renamed from: s2, reason: collision with root package name */
    public int f445518s2;

    /* renamed from: t2, reason: collision with root package name */
    public java.lang.String f445519t2;

    /* renamed from: u2, reason: collision with root package name */
    public boolean f445520u2;

    /* renamed from: v2, reason: collision with root package name */
    public java.lang.Integer f445521v2;

    /* renamed from: w2, reason: collision with root package name */
    public android.content.Context f445522w2;

    /* renamed from: x2, reason: collision with root package name */
    public qj5.q f445523x2;

    /* renamed from: y2, reason: collision with root package name */
    public android.view.View f445524y2;

    /* renamed from: z2, reason: collision with root package name */
    public android.view.ViewTreeObserver f445525z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, int i17, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.m1 initConfig, qj5.q qVar) {
        super(context, i17, z17, initConfig);
        float f17;
        int i18;
        jz5.f0 f0Var;
        qj5.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        this.f445520u2 = true;
        jz5.g b17 = jz5.h.b(new qj5.h(this));
        this.F2 = b17;
        this.f445522w2 = context;
        if (context instanceof android.app.Activity) {
            android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
            this.f445524y2 = decorView.findViewById(android.R.id.content);
        }
        this.f445516q2 = new qj5.o(context);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570808ek0, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.A2 = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564976sl0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.C2 = (android.widget.FrameLayout) findViewById;
        android.view.View view = this.A2;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.ntc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.D2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById2;
        android.view.View view2 = this.A2;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.h_z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.E2 = (com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed) findViewById3;
        qj5.o oVar = this.f445516q2;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerDialog");
            throw null;
        }
        oVar.setOnDismissListener(new qj5.e(this));
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed = this.E2;
        if (c22991x5a0fbed == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        qj5.f fVar = new qj5.f(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.u(c22991x5a0fbed, fVar);
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed2 = this.E2;
        if (c22991x5a0fbed2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        n3.y0.c(c22991x5a0fbed2);
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed3 = this.E2;
        if (c22991x5a0fbed3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        c22991x5a0fbed3.m83894x74a7bfc4(null);
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed4 = this.E2;
        if (c22991x5a0fbed4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        c22991x5a0fbed4.m83893x5f05abb3(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed5 = this.E2;
        if (c22991x5a0fbed5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        c22991x5a0fbed5.m83895xe1d3a649(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed6 = this.E2;
        if (c22991x5a0fbed6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        c22991x5a0fbed6.m83896xe2eaa4ac(i65.a.a(context, 0.5f));
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.content.Context context2 = this.f445522w2;
        if (context2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        java.lang.Object systemService = context2.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((android.view.WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        if (h()) {
            f17 = displayMetrics.heightPixels;
            i18 = displayMetrics.widthPixels;
        } else {
            f17 = displayMetrics.widthPixels;
            i18 = displayMetrics.heightPixels;
        }
        float f18 = f17 / i18;
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed7 = this.E2;
        if (c22991x5a0fbed7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        c22991x5a0fbed7.m83887xb094d523().f(new qj5.a(f18 / 1.5f));
        this.f445517r2 = h();
        if (qVar != null) {
            this.f445523x2 = qVar;
            if (((java.lang.String) ((jz5.n) b17).mo141623x754a37bb()) != null) {
                z();
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                x();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.D2;
            if (c22661xa3a2b3c0 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
                throw null;
            }
            c22661xa3a2b3c0.setVisibility(qVar.i());
            java.lang.String a17 = qVar.a();
            if (a17 != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = this.D2;
                if (c22661xa3a2b3c02 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
                    throw null;
                }
                c22661xa3a2b3c02.setText(a17);
            }
            if (qVar.i() == 0 && (bVar = I2) != null) {
                ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.h0) bVar).b("generate_image_entry_btn", "view_exp");
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c03 = this.D2;
            if (c22661xa3a2b3c03 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
                throw null;
            }
            c22661xa3a2b3c03.setOnClickListener(new qj5.g(this));
        }
        android.view.View c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getView(...)");
        android.view.View view3 = this.B2;
        if (view3 != null) {
            android.widget.FrameLayout frameLayout = this.C2;
            if (frameLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomSheetContainer");
                throw null;
            }
            frameLayout.removeView(view3);
        }
        this.B2 = c17;
        android.view.ViewGroup.LayoutParams layoutParams = c17.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMImageBottomSheet", "setBottomView, layout params error");
            return;
        }
        layoutParams2.gravity = 80;
        android.view.View view4 = this.B2;
        if (view4 != null) {
            view4.setLayoutParams(layoutParams2);
        }
        android.widget.FrameLayout frameLayout2 = this.C2;
        if (frameLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomSheetContainer");
            throw null;
        }
        frameLayout2.addView(this.B2);
        qj5.o oVar2 = this.f445516q2;
        if (oVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerDialog");
            throw null;
        }
        android.view.View view5 = this.A2;
        if (view5 != null) {
            oVar2.setContentView(view5);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
    }

    public final boolean h() {
        qj5.o oVar = this.f445516q2;
        if (oVar != null) {
            return oVar.I();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerDialog");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0
    public boolean i() {
        qj5.o oVar = this.f445516q2;
        if (oVar != null) {
            return oVar.isShowing();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerDialog");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if ((r0 != null && r0.getVisibility() == 0) == false) goto L30;
     */
    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0, android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGlobalLayout() {
        /*
            r3 = this;
            boolean r0 = r3.i()
            if (r0 != 0) goto L7
            return
        L7:
            android.view.View r0 = r3.f445524y2
            if (r0 == 0) goto L47
            boolean r0 = r0.isShown()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = r2
        L16:
            if (r0 == 0) goto L27
            android.view.View r0 = r3.f445524y2
            if (r0 == 0) goto L23
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 != 0) goto L27
            goto L47
        L27:
            boolean r0 = r3.f445517r2
            boolean r1 = r3.h()
            if (r0 != r1) goto L43
            int r0 = r3.f445518s2
            qj5.o r1 = r3.f445516q2
            if (r1 == 0) goto L3c
            int r1 = r1.F()
            if (r0 == r1) goto L4a
            goto L43
        L3c:
            java.lang.String r0 = "containerDialog"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r0)
            r0 = 0
            throw r0
        L43:
            r3.u()
            goto L4a
        L47:
            r3.u()
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj5.n.onGlobalLayout():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0
    public void u() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMImageBottomSheet", "tryHide");
        android.content.Context context = this.f445522w2;
        jz5.f0 f0Var = null;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMImageBottomSheet", "tryShow, unlock orientation");
            java.lang.Integer num = this.f445521v2;
            activity.setRequestedOrientation(num != null ? num.intValue() : -1);
            this.f445521v2 = null;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                w(new qj5.l(this));
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            w(new qj5.m(this));
        }
        qj5.q qVar = this.f445523x2;
        if (qVar != null) {
            qVar.c();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0
    public void v() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMImageBottomSheet", "tryShow");
        android.content.Context context = this.f445522w2;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMImageBottomSheet", "tryShow, lock orientation");
            this.f445521v2 = java.lang.Integer.valueOf(activity.getRequestedOrientation());
            activity.setRequestedOrientation(14);
        }
        super.v();
        this.f445517r2 = h();
        qj5.o oVar = this.f445516q2;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerDialog");
            throw null;
        }
        this.f445518s2 = oVar.F();
        android.view.View view = this.f445524y2;
        if (view != null) {
            boolean z17 = this.f445525z2 == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f445525z2 = viewTreeObserver;
            if (z17) {
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
                java.lang.Object obj = this.f445522w2;
                if (obj == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                    throw null;
                }
                p012xc85e97e9.p093xedfae76a.y yVar = obj instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) obj : null;
                if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
                    mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.ui.screenshot.MMImageBottomSheet$tryShow$2$1
                        @Override // p012xc85e97e9.p093xedfae76a.v
                        /* renamed from: onStateChanged */
                        public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                            if (event != p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
                                return;
                            }
                            qj5.n nVar = qj5.n.this;
                            android.view.ViewTreeObserver viewTreeObserver2 = nVar.f445525z2;
                            if (viewTreeObserver2 != null) {
                                if (!viewTreeObserver2.isAlive()) {
                                    android.view.View view2 = nVar.f445524y2;
                                    viewTreeObserver2 = view2 != null ? view2.getViewTreeObserver() : null;
                                }
                                if (viewTreeObserver2 != null) {
                                    viewTreeObserver2.removeGlobalOnLayoutListener(nVar);
                                }
                                nVar.f445525z2 = null;
                            }
                            source.mo273xed6858b4().c(this);
                        }
                    });
                }
            }
        }
        android.content.Context context2 = this.f445522w2;
        if (context2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if ((activity2 == null || activity2.isFinishing()) ? false : true) {
            qj5.o oVar2 = this.f445516q2;
            if (oVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerDialog");
                throw null;
            }
            oVar2.show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMImageBottomSheet", "animIn");
            android.widget.FrameLayout frameLayout = this.C2;
            if (frameLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomSheetContainer");
                throw null;
            }
            sa5.d.a(frameLayout, new sa5.h0(), 300L, null);
            com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed = this.E2;
            if (c22991x5a0fbed != null) {
                c22991x5a0fbed.post(new qj5.c(this));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
                throw null;
            }
        }
    }

    public final void w(yz5.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMImageBottomSheet", "animOut");
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed = this.E2;
        if (c22991x5a0fbed == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        c22991x5a0fbed.setVisibility(4);
        android.widget.FrameLayout frameLayout = this.C2;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomSheetContainer");
            throw null;
        }
        sa5.d.b(frameLayout, new sa5.q0(), 300L, new qj5.d(aVar));
    }

    public final void x() {
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMImageBottomSheet", "setGenImg");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = this.G2;
        if (str != null) {
            y(str);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.D2;
            if (c22661xa3a2b3c0 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
                throw null;
            }
            android.content.Context context = this.f445522w2;
            if (context == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                throw null;
            }
            c22661xa3a2b3c0.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oej));
            this.f445520u2 = false;
            qj5.b bVar = I2;
            if (bVar != null) {
                ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.h0) bVar).a(java.lang.System.currentTimeMillis() - currentTimeMillis);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMImageBottomSheet", "setGenImg, genImg not exist, try fetch");
        android.content.Context context2 = this.f445522w2;
        if (context2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context2, null, false, 3, qj5.i.f445506d);
        android.widget.TextView textView = f17.f293537d;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.H2 = f17;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new qj5.k(this, currentTimeMillis, null), 3, null);
    }

    public final void y(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f445519t2 = path;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMImageBottomSheet", "setImage, originScreenshotPath: ".concat(path));
        android.graphics.Bitmap K = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K(path);
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed = this.E2;
        if (c22991x5a0fbed == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        c22991x5a0fbed.setImageBitmap(K);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        boolean z17 = true;
        options.inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(path, options);
        if (d17 != null) {
            d17.recycle();
        }
        yq5.b bVar = new yq5.b(path);
        yq5.c cVar = new yq5.c(zq5.h.a(options.outWidth, options.outHeight), "image/jpeg", null);
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed2 = this.E2;
        if (c22991x5a0fbed2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0 m0Var = c22991x5a0fbed2.m83886x9a1694f1().f105287c;
        m0Var.getClass();
        yq5.k kVar = new yq5.k(new yq5.e(bVar), cVar);
        zq5.b.d();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m0Var.f296539o, kVar)) {
            z17 = false;
        } else {
            m0Var.f296526b.a(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.f0(m0Var, kVar));
            m0Var.b("setImage");
            m0Var.c("setImage");
            m0Var.f296539o = kVar;
            if (m0Var.f296530f != null) {
                m0Var.f("setImage");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMImageBottomSheet", "setSubsamplingImage: " + z17);
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed3 = this.E2;
        if (c22991x5a0fbed3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        er5.g m83887xb094d523 = c22991x5a0fbed3.m83887xb094d523();
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed4 = this.E2;
        if (c22991x5a0fbed4 != null) {
            m83887xb094d523.d(c22991x5a0fbed4.canScrollVertically(-1) ? gr5.a.f356433b : gr5.a.f356436e);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
    }

    public final void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMImageBottomSheet", "setOriImg");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.D2;
        if (c22661xa3a2b3c0 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
            throw null;
        }
        qj5.q qVar = this.f445523x2;
        c22661xa3a2b3c0.setText(qVar != null ? qVar.a() : null);
        java.lang.String str = (java.lang.String) ((jz5.n) this.F2).mo141623x754a37bb();
        if (str != null) {
            y(str);
        }
        this.f445520u2 = true;
    }
}
