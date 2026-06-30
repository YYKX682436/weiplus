package rc5;

/* loaded from: classes11.dex */
public class x extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.db {
    public static final jz5.g D = jz5.h.b(rc5.d.f475684d);
    public java.lang.ref.WeakReference A;
    public int B;
    public boolean C;

    /* renamed from: z, reason: collision with root package name */
    public final float f475729z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f475729z = 0.9f;
    }

    public static void q7(rc5.x xVar, android.view.Window window, java.lang.Integer num, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: adjustWindow");
        }
        if ((i17 & 2) != 0) {
            num = null;
        }
        xVar.getClass();
        if (window != null) {
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -1;
            attributes.gravity = 80;
            attributes.dimAmount = 0.5f;
            window.setAttributes(attributes);
            window.addFlags(2);
            window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            if (window.getStatusBarColor() != 0) {
                xVar.B = window.getStatusBarColor();
                window.setStatusBarColor(0);
            }
            window.getDecorView().setBackgroundColor(0);
            window.getDecorView().setPadding(0, 0, 0, 0);
            xVar.m158354x19263085().setFinishOnTouchOutside(xVar instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf);
            rc5.m mVar = new rc5.m(xVar, num != null ? num.intValue() : xVar.u7(), xVar.s7(), 0.3f, new rc5.o(xVar), new rc5.p(xVar), new rc5.q(xVar));
            android.view.Window window2 = mVar.f475703f.m158354x19263085().getWindow();
            android.view.View decorView = window2.getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
            android.view.View childAt = viewGroup.getChildAt(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
            mVar.f475712r = childAt;
            viewGroup.removeView(childAt);
            android.view.View view = mVar.f475712r;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mUIRootView");
                throw null;
            }
            mVar.addView(view);
            viewGroup.addView(mVar);
            android.view.ViewGroup.LayoutParams layoutParams = mVar.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = mVar.f475706i;
            if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
                ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = 80;
            }
            mVar.setLayoutParams(layoutParams);
            mVar.setBackgroundColor(0);
            mVar.setPadding(0, 0, 0, 0);
            mVar.f475713s = window2.findViewById(com.p314xaae8f345.mm.R.id.f563968ei);
            mVar.a();
            xVar.A = new java.lang.ref.WeakReference(mVar);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) xVar.W6().f279685f.f542241c.a(sb5.z0.class))).E0();
        }
    }

    private final int u7() {
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z17) {
            return i18;
        }
        if (i18 >= i17) {
            i17 = i18;
        }
        return i17;
    }

    public final void A7() {
        java.lang.ref.WeakReference weakReference;
        rc5.m mVar;
        if (y7() || (weakReference = this.A) == null || (mVar = (rc5.m) weakReference.get()) == null) {
            return;
        }
        int u76 = u7();
        mVar.f475704g = u76;
        mVar.f475705h = u76 - i65.a.h(mVar.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        int i17 = (int) (mVar.f475704g * mVar.f475701d);
        mVar.f475706i = i17;
        mVar.f475707m = (int) (i17 * mVar.f475702e);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public boolean T6() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public void V6(android.view.View view) {
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExpandableHalfScreenChattingUIC", "[!] view is null.");
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        if (viewGroup == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExpandableHalfScreenChattingUIC", "[!] view " + view + " has no parent so far, skip fixing.");
            return;
        }
        if (viewGroup instanceof rc5.m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExpandableHalfScreenChattingUIC", "[+] view " + view + " was already fixed for fullscreen issue.");
            return;
        }
        boolean z17 = false;
        java.util.Iterator it = new e06.k(0, viewGroup.getChildCount()).iterator();
        while (it.hasNext()) {
            android.view.View childAt = viewGroup.getChildAt(((kz5.x0) it).b());
            if (childAt instanceof rc5.m) {
                viewGroup.removeView(view);
                ((rc5.m) childAt).addView(view);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExpandableHalfScreenChattingUIC", "[+] view " + view + " was fixed by adding it to " + childAt);
                z17 = true;
            }
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExpandableHalfScreenChattingUIC", "[!] view " + view + " was not fixed since InteractAuxLayout was not found.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r0 == null) goto L14;
     */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int X6() {
        /*
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.A
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.get()
            rc5.m r0 = (rc5.m) r0
            if (r0 == 0) goto L23
            int r0 = r0.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            if (r1 <= 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 == 0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 != 0) goto L31
        L23:
            int r0 = r2.u7()
            float r0 = (float) r0
            float r1 = r2.s7()
            float r0 = r0 * r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L31:
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rc5.x.X6():int");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public float Y6() {
        return 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:3:0x0005, B:5:0x000b, B:7:0x0015, B:9:0x001b, B:11:0x0021, B:13:0x003e, B:14:0x004a, B:21:0x0026, B:23:0x0030, B:25:0x0036), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d7() {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.ExpandableHalfScreenChattingUIC"
            java.lang.String r1 = "getCurrentWindowHeight tmpWindowHeight:"
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L62
            r4 = 30
            if (r3 < r4) goto L26
            androidx.appcompat.app.AppCompatActivity r3 = r6.m158354x19263085()     // Catch: java.lang.Exception -> L62
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L3b
            android.view.WindowMetrics r3 = r3.getCurrentWindowMetrics()     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L3b
            android.graphics.Rect r3 = r3.getBounds()     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L3b
            int r3 = r3.height()     // Catch: java.lang.Exception -> L62
            goto L3c
        L26:
            androidx.appcompat.app.AppCompatActivity r3 = r6.m158354x19263085()     // Catch: java.lang.Exception -> L62
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L3b
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L3b
            int r3 = r3.getHeight()     // Catch: java.lang.Exception -> L62
            goto L3c
        L3b:
            r3 = r2
        L3c:
            if (r3 > 0) goto L49
            android.app.Activity r4 = r6.m80379x76847179()     // Catch: java.lang.Exception -> L62
            android.graphics.Point r4 = com.p314xaae8f345.mm.ui.bl.b(r4)     // Catch: java.lang.Exception -> L62
            int r4 = r4.y     // Catch: java.lang.Exception -> L62
            goto L4a
        L49:
            r4 = r3
        L4a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L62
            r5.<init>(r1)     // Catch: java.lang.Exception -> L62
            r5.append(r3)     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = "  finalWindowHeight:"
            r5.append(r1)     // Catch: java.lang.Exception -> L62
            r5.append(r4)     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L62
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L62
            goto L74
        L62:
            r1 = move-exception
            java.lang.String r3 = "getCurrentWindowHeight"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r1, r3, r2)
            android.app.Activity r1 = r6.m80379x76847179()
            android.graphics.Point r1 = com.p314xaae8f345.mm.ui.bl.b(r1)
            int r4 = r1.y
        L74:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getCurrentWindowHeight height:"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            ku5.u0 r0 = ku5.t0.f394148d
            rc5.r r1 = new rc5.r
            r1.<init>(r6, r4)
            ku5.t0 r0 = (ku5.t0) r0
            r0.D(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc5.x.d7():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public boolean f7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe headerComponent, android.view.View.OnClickListener listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerComponent, "headerComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        rc5.b bVar = new rc5.b(this, listener);
        boolean y76 = y7();
        int i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.bu9;
        if (y76) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y2 y2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y2) ((sb5.p) W6().f279685f.f542241c.a(sb5.p.class));
            y2Var.m0();
            if (!y2Var.f281801e.booleanValue()) {
                i17 = 0;
            } else if (!y2Var.f281806m) {
                i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.f563411ah0;
            }
            if (i17 < 0) {
                i17 = 0;
            }
        } else if (com.p314xaae8f345.mm.ui.bk.C()) {
            i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.buc;
        }
        headerComponent.f281225p.a(i17);
        headerComponent.f281225p.c(bVar);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public boolean g7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe headerComponent, yb5.d chattingContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerComponent, "headerComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public boolean h7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe headerComponent, com.p314xaae8f345.mm.ui.bc optionListener, yb5.d chattingContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerComponent, "headerComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optionListener, "optionListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        if (y7()) {
            headerComponent.K0(t7(), 0, 0, null);
            return false;
        }
        w7(headerComponent, optionListener, chattingContext);
        headerComponent.K0(t7(), 0, com.p314xaae8f345.mm.R.raw.f78799x463b12c1, v7());
        chattingContext.f542250l.m78709xb0dfae51(t7(), true);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public boolean i7() {
        return this instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        if (x7()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m158354x19263085).m78730xd9026919(new rc5.s(this));
            ((ku5.t0) ku5.t0.f394148d).D(new rc5.u(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        if (!x7()) {
            m158359x1e885992().putExtra("KIsHalfScreen", false);
            return;
        }
        m158354x19263085().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        m158359x1e885992().putExtra("finish_direct", true);
        m158359x1e885992().putExtra("KIsHalfScreen", true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        if (m158359x1e885992().getBooleanExtra("KIsHalfScreen", false)) {
            m158354x19263085().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, y7() ? com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed : com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
            m158359x1e885992().putExtra(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.f39353x639dcc24, true);
        }
        if (W6().m78387x1e885992().getBooleanExtra("deeplink_handled", false)) {
            return;
        }
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        android.os.Bundle extras = m158354x19263085().getIntent().getExtras();
        ((vh0.f3) n1Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.os.IBinder binder = extras != null ? extras.getBinder("chatting_ui_callback_binder") : null;
        if (binder != null) {
            try {
                int i17 = vh0.x0.f518529d;
                android.os.IInterface queryLocalInterface = binder.queryLocalInterface("com.tencent.mm.feature.yuanbao.IPCChattingUICallback");
                ((queryLocalInterface == null || !(queryLocalInterface instanceof vh0.y0)) ? new vh0.w0(binder) : (vh0.y0) queryLocalInterface).mo172110x3d6f0539();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatBotRoutineService", th6, "[-] Fail to notify onCancel.", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (!(W6().f279685f.l() != null) || y7()) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).D(new rc5.v(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
    }

    public void r7() {
        rc5.m mVar;
        java.lang.ref.WeakReference weakReference = this.A;
        if (weakReference == null || (mVar = (rc5.m) weakReference.get()) == null || mVar.f475715u) {
            return;
        }
        android.animation.Animator animator = mVar.A;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ValueAnimator ofArgb = android.animation.ValueAnimator.ofArgb(0, mVar.f475703f.B);
        ofArgb.setInterpolator(mVar.f475717w);
        ofArgb.addUpdateListener(new rc5.w(mVar.f475719y));
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(mVar.getLayoutParams().height, mVar.f475704g);
        ofInt.setInterpolator(mVar.f475718x);
        ofInt.addUpdateListener(new rc5.w(mVar.f475720z));
        animatorSet.playTogether(ofArgb, ofInt);
        animatorSet.addListener(new rc5.f(mVar));
        android.animation.AnimatorSet duration = animatorSet.setDuration(200L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
        duration.start();
        mVar.A = duration;
    }

    public float s7() {
        return this.f475729z;
    }

    public int t7() {
        return 0;
    }

    public com.p314xaae8f345.mm.ui.bc v7() {
        return new rc5.c(this);
    }

    public void w7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe headerComponent, com.p314xaae8f345.mm.ui.bc optionListener, yb5.d chattingContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerComponent, "headerComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optionListener, "optionListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
    }

    public boolean x7() {
        return true;
    }

    public final boolean y7() {
        rc5.m mVar;
        java.lang.ref.WeakReference weakReference = this.A;
        return (weakReference == null || (mVar = (rc5.m) weakReference.get()) == null) ? !m158359x1e885992().getBooleanExtra("KIsHalfScreen", false) : mVar.f475715u;
    }

    public boolean z7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe headerComponent, yb5.d chattingContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerComponent, "headerComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        super.g7(headerComponent, chattingContext);
        return true;
    }
}
