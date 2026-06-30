package wl5;

/* loaded from: classes15.dex */
public class x {
    public db5.g A;
    public int B;
    public int C;
    public final android.view.View.OnAttachStateChangeListener D;
    public final android.view.ViewTreeObserver.OnScrollChangedListener E;
    public final android.view.ViewTreeObserver.OnPreDrawListener F;
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener G;
    public final android.view.View.OnTouchListener H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f528687J;
    public boolean K;
    public int S;
    public final boolean T;
    public wl5.p X;
    public wl5.u Y;
    public wl5.r Z;

    /* renamed from: a, reason: collision with root package name */
    public wl5.q f528688a;

    /* renamed from: a0, reason: collision with root package name */
    public java.util.ArrayList f528689a0;

    /* renamed from: b, reason: collision with root package name */
    public wl5.q f528690b;

    /* renamed from: d, reason: collision with root package name */
    public wl5.t f528692d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f528693e;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f528695g;

    /* renamed from: h, reason: collision with root package name */
    public wl5.n f528696h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.Context f528697i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f528698j;

    /* renamed from: k, reason: collision with root package name */
    public final wl5.v f528699k;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f528703o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnTouchListener f528704p;

    /* renamed from: r, reason: collision with root package name */
    public int f528706r;

    /* renamed from: s, reason: collision with root package name */
    public android.text.Spannable f528707s;

    /* renamed from: t, reason: collision with root package name */
    public final rl5.r f528708t;

    /* renamed from: u, reason: collision with root package name */
    public int f528709u;

    /* renamed from: v, reason: collision with root package name */
    public int f528710v;

    /* renamed from: w, reason: collision with root package name */
    public int f528711w;

    /* renamed from: x, reason: collision with root package name */
    public final int f528712x;

    /* renamed from: y, reason: collision with root package name */
    public final int f528713y;

    /* renamed from: z, reason: collision with root package name */
    public int f528714z;

    /* renamed from: c, reason: collision with root package name */
    public final wl5.w f528691c = new wl5.w(this);

    /* renamed from: f, reason: collision with root package name */
    public boolean f528694f = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f528700l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f528701m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f528702n = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f528705q = new java.util.ArrayList();
    public boolean L = false;
    public boolean M = true;
    public boolean N = true;
    public boolean O = true;
    public boolean P = false;
    public boolean Q = false;
    public final int[] R = new int[2];
    public final java.lang.Runnable U = new wl5.e(this);
    public final java.lang.Runnable V = new wl5.f(this);
    public final int[] W = new int[2];

    public x(wl5.o oVar) {
        this.f528693e = true;
        this.f528695g = true;
        this.f528709u = 0;
        this.I = false;
        this.f528687J = true;
        this.K = false;
        this.S = 0;
        this.T = true;
        android.view.View view = oVar.f528650a;
        this.f528698j = view;
        wl5.v vVar = oVar.f528651b;
        this.f528699k = vVar;
        this.f528703o = oVar.f528652c;
        this.f528704p = oVar.f528653d;
        this.f528708t = oVar.f528654e;
        this.f528709u = oVar.f528658i;
        this.S = oVar.f528659j;
        this.T = oVar.f528660k;
        this.f528693e = oVar.f528661l;
        this.f528695g = oVar.f528662m;
        this.f528697i = view.getContext();
        this.f528712x = oVar.f528656g;
        this.f528713y = oVar.f528655f;
        this.B = wl5.y.e(this.f528698j);
        if (this.f528714z == 0) {
            this.f528714z = (int) wl5.y.p(this.f528698j);
        } else {
            this.f528714z = com.p314xaae8f345.mm.ui.zk.a(this.f528697i, oVar.f528657h);
        }
        wl5.g gVar = new wl5.g(this);
        this.D = gVar;
        wl5.h hVar = new wl5.h(this);
        this.F = hVar;
        wl5.i iVar = new wl5.i(this);
        this.E = iVar;
        wl5.j jVar = new wl5.j(this);
        this.G = jVar;
        wl5.k kVar = new wl5.k(this);
        this.H = kVar;
        java.util.Objects.toString(this.f528698j.getContext());
        java.util.Objects.toString(this.f528698j.getViewTreeObserver());
        if (!this.f528687J) {
            com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "not destroy, isReInit: %s.", java.lang.Boolean.valueOf(this.I));
            this.I = true;
            return;
        }
        com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "not init yet, need to init.", new java.lang.Object[0]);
        this.I = false;
        this.f528687J = false;
        this.K = false;
        if (vVar == null) {
            android.view.View view2 = this.f528698j;
            wl5.y.q(view2, wl5.y.o(view2), android.widget.TextView.BufferType.SPANNABLE);
        }
        j();
        this.f528698j.setOnLongClickListener(new wl5.l(this));
        com.p314xaae8f345.mm.ui.yk.c("SelectableTextHelper", "init setOnTouchListener: mTextView=%s, mOnTouchListener=%s, hashCode=%s", this.f528698j, kVar, java.lang.Integer.valueOf(hashCode()));
        this.f528698j.setOnTouchListener(kVar);
        this.f528698j.setOnClickListener(new wl5.m(this));
        this.f528698j.addOnAttachStateChangeListener(gVar);
        this.f528698j.getViewTreeObserver().addOnPreDrawListener(hVar);
        this.f528698j.getViewTreeObserver().addOnScrollChangedListener(iVar);
        this.f528698j.getViewTreeObserver().addOnGlobalLayoutListener(jVar);
        this.f528698j.getViewTreeObserver().addOnGlobalLayoutListener(new wl5.b(this));
    }

    public static void a(wl5.x xVar, boolean z17) {
        for (android.view.ViewParent parent = xVar.f528698j.getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(z17);
        }
    }

    public final int b(int i17, boolean z17) {
        java.util.ArrayList arrayList = this.f528689a0;
        if (arrayList == null) {
            return i17;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wl5.s sVar = (wl5.s) it.next();
            int i18 = sVar.f528682a;
            if (i17 >= i18 && i17 < sVar.f528683b) {
                return z17 ? i18 : sVar.f528683b;
            }
        }
        return i17;
    }

    public void c() {
        java.util.Objects.toString(this.f528698j.getContext());
        java.util.Objects.toString(this.f528698j.getViewTreeObserver());
        this.I = false;
        this.f528687J = true;
        this.K = false;
        this.f528698j.removeCallbacks(this.U);
        this.f528698j.getViewTreeObserver().removeOnScrollChangedListener(this.E);
        this.f528698j.getViewTreeObserver().removeOnPreDrawListener(this.F);
        this.f528698j.getViewTreeObserver().removeOnGlobalLayoutListener(this.G);
        this.f528698j.removeOnAttachStateChangeListener(this.D);
        this.M = true;
        this.N = true;
        i();
        k();
        this.f528688a = null;
        this.f528690b = null;
        wl5.v vVar = this.f528699k;
        if (vVar != null) {
            vVar.a();
        }
    }

    public void d() {
        db5.g gVar;
        wl5.w wVar = this.f528691c;
        wVar.f528684a = 0;
        wVar.f528685b = 0;
        wVar.f528686c = null;
        android.text.Spannable spannable = this.f528707s;
        if (spannable != null && (gVar = this.A) != null) {
            spannable.removeSpan(gVar);
            this.A = null;
            android.view.View view = this.f528698j;
            if (view != null) {
                view.invalidate();
            }
        }
        wl5.t tVar = this.f528692d;
        if (tVar != null) {
            tVar.a("");
        }
    }

    public android.util.Pair e() {
        wl5.w wVar = this.f528691c;
        return new android.util.Pair(java.lang.Integer.valueOf(wVar.f528684a), java.lang.Integer.valueOf(wVar.f528685b));
    }

    public void f() {
        wl5.q qVar = this.f528688a;
        if (qVar != null) {
            qVar.f528663d.dismiss();
        }
        wl5.q qVar2 = this.f528690b;
        if (qVar2 != null) {
            qVar2.f528663d.dismiss();
        }
        this.f528702n = false;
    }

    public void g() {
        rl5.r rVar = this.f528708t;
        if (rVar != null) {
            rVar.a();
        }
    }

    public void h() {
        wl5.v vVar = this.f528699k;
        if (vVar != null) {
            vVar.a();
        }
    }

    public void i() {
        f();
        g();
        wl5.v vVar = this.f528699k;
        if (vVar != null) {
            vVar.a();
        }
        this.f528702n = false;
    }

    public final void j() {
        wl5.q qVar = new wl5.q(this, true);
        this.f528688a = qVar;
        qVar.f528680x = this.Z;
        if (this.f528699k != null) {
            qVar.f528663d.setOutsideTouchable(this.f528695g);
            if (this.f528693e) {
                wl5.q qVar2 = this.f528688a;
                qVar2.f528663d.setTouchInterceptor(new wl5.c(this));
            }
            wl5.q qVar3 = this.f528688a;
            qVar3.f528663d.setOnDismissListener(new wl5.d(this));
        }
        wl5.q qVar4 = new wl5.q(this, false);
        this.f528690b = qVar4;
        qVar4.f528680x = this.Z;
    }

    public void k() {
        db5.g gVar;
        this.f528691c.f528686c = null;
        android.text.Spannable spannable = this.f528707s;
        if (spannable == null || (gVar = this.A) == null) {
            return;
        }
        spannable.removeSpan(gVar);
        this.A = null;
        android.view.View view = this.f528698j;
        if (view != null) {
            view.invalidate();
        }
    }

    public void l(int i17, int i18) {
        int i19;
        boolean z17 = this.f528702n;
        wl5.w wVar = this.f528691c;
        if (z17) {
            com.p314xaae8f345.mm.ui.yk.c("SelectableTextHelper", "is illegalSelect! startPos: %s. endPos:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } else {
            if (i17 != -1) {
                wVar.f528684a = b(i17, true);
            }
            if (i18 != -1) {
                wVar.f528685b = b(i18, false);
            }
        }
        int i27 = wVar.f528684a;
        if (i27 < 0 || i27 > wl5.y.o(this.f528698j).length() || (i19 = wVar.f528685b) < 0 || i19 > wl5.y.o(this.f528698j).length()) {
            return;
        }
        int i28 = wVar.f528684a;
        int i29 = wVar.f528685b;
        if (i28 > i29) {
            wVar.f528684a = i29;
            wVar.f528685b = i28;
        }
        android.text.Spannable spannable = this.f528707s;
        if (spannable != null) {
            wVar.f528686c = spannable.subSequence(wVar.f528684a, wVar.f528685b).toString();
            db5.g gVar = this.A;
            if (gVar != null) {
                int i37 = wVar.f528684a;
                int i38 = wVar.f528685b;
                gVar.f309871f = i37;
                gVar.f309872g = i38;
            } else {
                wl5.n nVar = this.f528696h;
                int i39 = this.f528712x;
                if (nVar != null) {
                    android.view.View view = this.f528698j;
                    int color = this.f528697i.getResources().getColor(i39);
                    int i47 = wVar.f528684a;
                    int i48 = wVar.f528685b;
                    ((bd4.t1) nVar).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSpan", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$createSelectableTextHelper$6");
                    db5.b9 b9Var = new db5.b9(view, color, i47, i48);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSpan", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$createSelectableTextHelper$6");
                    this.A = b9Var;
                } else {
                    this.A = new db5.g(this.f528698j, this.f528697i.getResources().getColor(i39), wVar.f528684a, wVar.f528685b);
                }
            }
            this.f528707s.setSpan(this.A, wl5.y.h(this.f528698j, wl5.y.d(this.f528698j, wVar.f528684a)), wVar.f528685b, 17);
            this.f528698j.invalidate();
            wl5.t tVar = this.f528692d;
            if (tVar != null) {
                tVar.a(wVar.f528686c);
            }
        }
    }

    public void m(boolean z17) {
        this.L = z17;
    }

    public void n(java.lang.Boolean bool) {
        this.f528700l = bool.booleanValue();
    }

    public void o() {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) this.f528697i.getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (this.f528688a == null || this.f528690b == null) {
            j();
        }
        p(this.f528688a);
        p(this.f528690b);
    }

    public final void p(wl5.q qVar) {
        boolean z17;
        int i17;
        int i18;
        if (qVar == null) {
            return;
        }
        boolean z18 = qVar.f528669m;
        wl5.w wVar = this.f528691c;
        int i19 = z18 ? wVar.f528684a : wVar.f528685b;
        if (wVar.f528684a != wVar.f528685b && i19 >= 0 && i19 <= wl5.y.o(this.f528698j).length()) {
            boolean z19 = qVar.f528669m;
            wl5.p pVar = this.X;
            if (pVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canShowHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$createSelectableTextHelper$3");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                z17 = ((bd4.q1) pVar).f100915a.i(z19);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$canShowCursorHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canShowHandle", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$createSelectableTextHelper$3");
            } else {
                z17 = true;
            }
            if (z17) {
                android.text.TextPaint l17 = wl5.y.l(this.f528698j);
                if (l17 != null) {
                    int i27 = (int) l17.getFontMetrics().descent;
                    android.view.View view = this.f528698j;
                    i18 = wl5.y.b(view, wl5.y.d(view, i19)) + i27;
                    i17 = (int) wl5.y.m(this.f528698j, i19);
                } else {
                    i17 = 0;
                    i18 = 0;
                }
                wl5.x xVar = qVar.f528681y;
                xVar.f528698j.getLocationInWindow(qVar.f528673q);
                boolean z27 = qVar.f528669m;
                int i28 = z27 ? qVar.f528666g : 0;
                if (!z27) {
                    int[] e17 = qVar.e(i17, i18);
                    int i29 = e17[0] + qVar.f528668i;
                    i18 = e17[1];
                    i17 = i29;
                }
                try {
                    qVar.f528663d.showAtLocation(xVar.f528698j, 0, (i17 - i28) + qVar.a(), i18 + qVar.b());
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.mm.ui.yk.b("SelectableTextHelper", "error! message: %s.", e18.getMessage());
                }
            }
        }
    }

    public void q() {
        rl5.r rVar = this.f528708t;
        if (rVar != null) {
            int[] iArr = new int[2];
            this.f528698j.getLocationInWindow(iArr);
            wl5.w wVar = this.f528691c;
            int i17 = wVar.f528685b;
            int length = wl5.y.o(this.f528698j).length();
            if (i17 >= length) {
                i17 = length - 1;
            }
            float m17 = wl5.y.m(this.f528698j, wVar.f528684a);
            float m18 = wl5.y.m(this.f528698j, i17);
            if (wl5.y.d(this.f528698j, wVar.f528685b) > wl5.y.d(this.f528698j, wVar.f528684a) || m18 <= m17) {
                android.view.View view = this.f528698j;
                m18 = wl5.y.j(view, wl5.y.d(view, wVar.f528684a));
            }
            if (this.f528709u == 0) {
                this.f528709u = iArr[0] + this.f528698j.getPaddingLeft();
            }
            int i18 = ((int) ((m17 + m18) / 2.0f)) + this.f528709u;
            android.view.View view2 = this.f528698j;
            int i19 = wl5.y.i(view2, wl5.y.d(view2, wVar.f528684a)) + iArr[1] + this.f528697i.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.u_);
            com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "dancy test posX:%s, startline:%s, endline:%s, leftpadding:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(wl5.y.d(this.f528698j, wVar.f528684a)), java.lang.Integer.valueOf(wl5.y.d(this.f528698j, wVar.f528685b)), java.lang.Integer.valueOf(this.f528709u));
            if (i18 <= 0) {
                i18 = 16;
            }
            if (i19 < 0) {
                i19 = 16;
            }
            if (i18 > wl5.y.n(this.f528697i)) {
                i18 = wl5.y.n(this.f528697i) - 16;
            }
            int i27 = this.S;
            if (i27 != 0) {
                i19 += i27;
            }
            rVar.n(i18, i19);
        }
        wl5.v vVar = this.f528699k;
        if (vVar != null) {
            vVar.b();
        }
    }

    public void r() {
        wl5.v vVar = this.f528699k;
        if (vVar != null) {
            vVar.f(this.f528698j);
        }
    }

    public void s(int i17, int i18) {
        k();
        if (wl5.y.o(this.f528698j) instanceof android.text.Spannable) {
            this.f528707s = (android.text.Spannable) wl5.y.o(this.f528698j);
        }
        if (this.f528707s != null && i17 < wl5.y.o(this.f528698j).length()) {
            l(i17, i18);
            return;
        }
        wl5.w wVar = this.f528691c;
        wVar.f528684a = 0;
        wVar.f528685b = 0;
    }
}
