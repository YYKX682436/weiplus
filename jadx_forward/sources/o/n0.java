package o;

/* loaded from: classes15.dex */
public final class n0 extends o.c0 implements android.widget.PopupWindow.OnDismissListener, android.view.View.OnKeyListener {
    public boolean A;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f423287e;

    /* renamed from: f, reason: collision with root package name */
    public final o.r f423288f;

    /* renamed from: g, reason: collision with root package name */
    public final o.o f423289g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f423290h;

    /* renamed from: i, reason: collision with root package name */
    public final int f423291i;

    /* renamed from: m, reason: collision with root package name */
    public final int f423292m;

    /* renamed from: n, reason: collision with root package name */
    public final int f423293n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o1 f423294o;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.PopupWindow.OnDismissListener f423297r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f423298s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f423299t;

    /* renamed from: u, reason: collision with root package name */
    public o.f0 f423300u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewTreeObserver f423301v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f423302w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f423303x;

    /* renamed from: y, reason: collision with root package name */
    public int f423304y;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f423295p = new o.l0(this);

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnAttachStateChangeListener f423296q = new o.m0(this);

    /* renamed from: z, reason: collision with root package name */
    public int f423305z = 0;

    public n0(android.content.Context context, o.r rVar, android.view.View view, int i17, int i18, boolean z17) {
        this.f423287e = context;
        this.f423288f = rVar;
        this.f423290h = z17;
        this.f423289g = new o.o(rVar, android.view.LayoutInflater.from(context), z17, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569429ax);
        this.f423292m = i17;
        this.f423293n = i18;
        android.content.res.Resources resources = context.getResources();
        this.f423291i = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561506kl));
        this.f423298s = view;
        this.f423294o = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o1(context, null, i17, i18);
        rVar.b(this, context);
    }

    @Override // o.g0
    public void a(o.r rVar, boolean z17) {
        if (rVar != this.f423288f) {
            return;
        }
        mo2732x63a3b28a();
        o.f0 f0Var = this.f423300u;
        if (f0Var != null) {
            f0Var.a(rVar, z17);
        }
    }

    @Override // o.g0
    public android.os.Parcelable b() {
        return null;
    }

    @Override // o.g0
    public void c(boolean z17) {
        this.f423303x = false;
        o.o oVar = this.f423289g;
        if (oVar != null) {
            oVar.notifyDataSetChanged();
        }
    }

    @Override // o.k0
    /* renamed from: dismiss */
    public void mo2732x63a3b28a() {
        if (mo2734x58a9c73b()) {
            this.f423294o.mo2732x63a3b28a();
        }
    }

    @Override // o.g0
    public boolean e() {
        return false;
    }

    @Override // o.g0
    public void f(android.os.Parcelable parcelable) {
    }

    @Override // o.g0
    public void g(o.f0 f0Var) {
        this.f423300u = f0Var;
    }

    @Override // o.k0
    /* renamed from: getListView */
    public android.widget.ListView mo2733xcc101dd9() {
        return this.f423294o.f90952f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    @Override // o.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(o.o0 r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7e
            o.e0 r0 = new o.e0
            android.content.Context r3 = r9.f423287e
            android.view.View r5 = r9.f423299t
            boolean r6 = r9.f423290h
            int r7 = r9.f423292m
            int r8 = r9.f423293n
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            o.f0 r2 = r9.f423300u
            r0.f423243i = r2
            o.c0 r3 = r0.f423244j
            if (r3 == 0) goto L23
            r3.g(r2)
        L23:
            boolean r2 = o.c0.t(r10)
            r0.f423242h = r2
            o.c0 r3 = r0.f423244j
            if (r3 == 0) goto L30
            r3.n(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f423297r
            r0.f423245k = r2
            r2 = 0
            r9.f423297r = r2
            o.r r2 = r9.f423288f
            r2.c(r1)
            androidx.appcompat.widget.o1 r2 = r9.f423294o
            int r3 = r2.f90955i
            boolean r4 = r2.f90958o
            if (r4 != 0) goto L46
            r2 = r1
            goto L48
        L46:
            int r2 = r2.f90956m
        L48:
            int r4 = r9.f423305z
            android.view.View r5 = r9.f423298s
            java.util.WeakHashMap r6 = n3.l1.f415895a
            int r5 = n3.v0.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L62
            android.view.View r4 = r9.f423298s
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L62:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L6a
            goto L73
        L6a:
            android.view.View r4 = r0.f423240f
            if (r4 != 0) goto L70
            r0 = r1
            goto L74
        L70:
            r0.d(r3, r2, r5, r5)
        L73:
            r0 = r5
        L74:
            if (r0 == 0) goto L7e
            o.f0 r0 = r9.f423300u
            if (r0 == 0) goto L7d
            r0.c(r10)
        L7d:
            return r5
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n0.i(o.o0):boolean");
    }

    @Override // o.k0
    /* renamed from: isShowing */
    public boolean mo2734x58a9c73b() {
        return !this.f423302w && this.f423294o.mo2734x58a9c73b();
    }

    @Override // o.c0
    public void k(o.r rVar) {
    }

    @Override // o.c0
    public void m(android.view.View view) {
        this.f423298s = view;
    }

    @Override // o.c0
    public void n(boolean z17) {
        this.f423289g.f423308f = z17;
    }

    @Override // o.c0
    public void o(int i17) {
        this.f423305z = i17;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f423302w = true;
        this.f423288f.c(true);
        android.view.ViewTreeObserver viewTreeObserver = this.f423301v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f423301v = this.f423299t.getViewTreeObserver();
            }
            this.f423301v.removeGlobalOnLayoutListener(this.f423295p);
            this.f423301v = null;
        }
        this.f423299t.removeOnAttachStateChangeListener(this.f423296q);
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.f423297r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i17 != 82) {
            return false;
        }
        mo2732x63a3b28a();
        return true;
    }

    @Override // o.c0
    public void p(int i17) {
        this.f423294o.f90955i = i17;
    }

    @Override // o.c0
    public void q(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f423297r = onDismissListener;
    }

    @Override // o.c0
    public void r(boolean z17) {
        this.A = z17;
    }

    @Override // o.c0
    public void s(int i17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o1 o1Var = this.f423294o;
        o1Var.f90956m = i17;
        o1Var.f90958o = true;
    }

    @Override // o.k0
    /* renamed from: show */
    public void mo2735x35dafd() {
        android.view.View view;
        boolean z17 = true;
        if (!mo2734x58a9c73b()) {
            if (this.f423302w || (view = this.f423298s) == null) {
                z17 = false;
            } else {
                this.f423299t = view;
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o1 o1Var = this.f423294o;
                o1Var.E.setOnDismissListener(this);
                o1Var.f90965v = this;
                o1Var.D = true;
                android.widget.PopupWindow popupWindow = o1Var.E;
                popupWindow.setFocusable(true);
                android.view.View view2 = this.f423299t;
                boolean z18 = this.f423301v == null;
                android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f423301v = viewTreeObserver;
                if (z18) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f423295p);
                }
                view2.addOnAttachStateChangeListener(this.f423296q);
                o1Var.f90964u = view2;
                o1Var.f90961r = this.f423305z;
                boolean z19 = this.f423303x;
                android.content.Context context = this.f423287e;
                o.o oVar = this.f423289g;
                if (!z19) {
                    this.f423304y = o.c0.l(oVar, null, context, this.f423291i);
                    this.f423303x = true;
                }
                o1Var.e(this.f423304y);
                popupWindow.setInputMethodMode(2);
                o1Var.C = this.f423222d;
                o1Var.mo2735x35dafd();
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1 b1Var = o1Var.f90952f;
                b1Var.setOnKeyListener(this);
                if (this.A) {
                    o.r rVar = this.f423288f;
                    if (rVar.f423325s != null) {
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569428aw, (android.view.ViewGroup) b1Var, false);
                        android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
                        if (textView != null) {
                            textView.setText(rVar.f423325s);
                        }
                        frameLayout.setEnabled(false);
                        b1Var.addHeaderView(frameLayout, null, false);
                    }
                }
                o1Var.d(oVar);
                o1Var.mo2735x35dafd();
            }
        }
        if (!z17) {
            throw new java.lang.IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
