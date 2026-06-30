package gl5;

/* loaded from: classes15.dex */
public class b0 implements gl5.p {

    /* renamed from: d, reason: collision with root package name */
    public gl5.a0 f354436d;

    /* renamed from: e, reason: collision with root package name */
    public gl5.a0 f354437e;

    /* renamed from: f, reason: collision with root package name */
    public int f354438f;

    /* renamed from: g, reason: collision with root package name */
    public int f354439g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f354440h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f354442m;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f354446q;

    /* renamed from: i, reason: collision with root package name */
    public int f354441i = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f354443n = -1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f354444o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f354445p = 0;

    public b0(gl5.e0 e0Var) {
        this.f354446q = e0Var;
        g();
    }

    @Override // gl5.p
    public boolean a() {
        gl5.a0 a0Var = this.f354436d;
        return a0Var != null && a0Var.k();
    }

    public void b(int i17) {
        mo131740x35dafd();
        this.f354445p = i17;
        gl5.e0 e0Var = this.f354446q;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
        gl5.f0 f0Var = e0Var.O;
        this.f354441i = viewTreeObserverOnPreDrawListenerC22668xe0605023.K(f0Var.f354506a, f0Var.f354507b);
        this.f354443n = e0Var.U.J(e0Var.O.f354507b);
        c();
        e0Var.U.getParent().requestDisallowInterceptTouchEvent(true);
        e0Var.U.cancelLongPress();
    }

    public void c() {
        gl5.a0 a0Var = this.f354436d;
        if (a0Var != null) {
            a0Var.i();
        }
        gl5.a0 a0Var2 = this.f354437e;
        if (a0Var2 != null) {
            a0Var2.i();
        }
    }

    public final void d() {
        if (this.f354436d == null) {
            gl5.e0 e0Var = this.f354446q;
            this.f354436d = new gl5.a0(e0Var, e0Var.G, e0Var.H, com.p314xaae8f345.mm.R.id.mkq, 0);
        }
        if (this.f354437e == null) {
            gl5.e0 e0Var2 = this.f354446q;
            this.f354437e = new gl5.a0(e0Var2, e0Var2.H, e0Var2.G, com.p314xaae8f345.mm.R.id.mkp, 1);
        }
        this.f354436d.o();
        this.f354437e.o();
        this.f354446q.r();
    }

    @Override // gl5.p
    public boolean e() {
        if (this.f354445p != 0) {
            return true;
        }
        gl5.a0 a0Var = this.f354436d;
        if (a0Var != null && a0Var.f354599o) {
            return true;
        }
        gl5.a0 a0Var2 = this.f354437e;
        return a0Var2 != null && a0Var2.f354599o;
    }

    public final void f() {
        this.f354441i = -1;
        this.f354445p = 0;
        this.f354444o = false;
        gl5.e0 e0Var = this.f354446q;
        int m81687x6f2c472c = e0Var.U.m81687x6f2c472c();
        int m81686xffd93625 = e0Var.U.m81686xffd93625();
        if (m81687x6f2c472c < 0 || m81686xffd93625 < 0) {
            android.text.Selection.removeSelection((android.text.Spannable) e0Var.U.mo81602xfb85ada3());
        } else if (m81687x6f2c472c > m81686xffd93625) {
            android.text.Selection.setSelection((android.text.Spannable) e0Var.U.mo81602xfb85ada3(), m81686xffd93625, m81687x6f2c472c);
        }
    }

    public void g() {
        this.f354439g = -1;
        this.f354438f = -1;
        f();
    }

    public final void h(android.view.MotionEvent motionEvent) {
        int i17;
        int b17;
        int i18;
        gl5.e0 e0Var = this.f354446q;
        if (e0Var.U.m81661x22f21e20() != null) {
            int i19 = this.f354445p;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
            if (i19 == 1) {
                i(this.f354441i, viewTreeObserverOnPreDrawListenerC22668xe0605023.K(motionEvent.getX(), motionEvent.getY()), motionEvent.isFromSource(4098));
                return;
            }
            if (i19 != 2) {
                if (i19 != 3) {
                    return;
                }
                int K = viewTreeObserverOnPreDrawListenerC22668xe0605023.K(motionEvent.getX(), motionEvent.getY());
                long m17 = e0Var.m(java.lang.Math.min(K, this.f354441i), java.lang.Math.max(K, this.f354441i));
                i((int) (m17 >>> 32), jl5.b.c(m17), motionEvent.isFromSource(4098));
                return;
            }
            if (this.f354442m) {
                return;
            }
            boolean isFromSource = motionEvent.isFromSource(8194);
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(viewTreeObserverOnPreDrawListenerC22668xe0605023.getContext());
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            if (isFromSource) {
                i17 = viewTreeObserverOnPreDrawListenerC22668xe0605023.J(y17);
            } else {
                if (this.f354444o) {
                    int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                    gl5.a0 a0Var = this.f354436d;
                    y17 -= a0Var != null ? a0Var.m131752x517e5828() : scaledTouchSlop;
                }
                i17 = e0Var.i(viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20(), this.f354443n, y17);
                if (!this.f354444o && i17 != this.f354443n) {
                    this.f354444o = true;
                    return;
                }
            }
            int offsetForHorizontal = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20().getOffsetForHorizontal(i17, viewTreeObserverOnPreDrawListenerC22668xe0605023.C(x17));
            if (this.f354441i < offsetForHorizontal) {
                b17 = gl5.e0.a(e0Var, offsetForHorizontal);
                i18 = gl5.e0.b(e0Var, this.f354441i);
            } else {
                b17 = gl5.e0.b(e0Var, offsetForHorizontal);
                int a17 = gl5.e0.a(e0Var, this.f354441i);
                if (a17 == b17) {
                    b17 = e0Var.l(b17, false);
                }
                i18 = a17;
            }
            this.f354443n = i17;
            i(i18, b17, motionEvent.isFromSource(4098));
        }
    }

    public final void i(int i17, int i18, boolean z17) {
        gl5.e0 e0Var = this.f354446q;
        if (z17) {
            e0Var.getClass();
        }
        android.text.Selection.setSelection((android.text.Spannable) e0Var.U.mo81602xfb85ada3(), i17, i18);
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public void onTouchModeChanged(boolean z17) {
        if (z17) {
            return;
        }
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[RETURN] */
    @Override // gl5.p
    /* renamed from: show */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo131740x35dafd() {
        /*
            r4 = this;
            gl5.e0 r0 = r4.f354446q
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r1 = r0.U
            gl5.e0 r1 = r1.f293122g2
            r2 = 0
            if (r1 != 0) goto La
            goto L14
        La:
            gl5.s r3 = r1.f354486k
            if (r3 == 0) goto L16
            int r1 = r3.f354623c
            if (r1 <= 0) goto L14
            r1 = 1
            goto L18
        L14:
            r1 = r2
            goto L18
        L16:
            boolean r1 = r1.f354500y
        L18:
            if (r1 == 0) goto L1b
            return
        L1b:
            r0.w(r2)
            r4.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.b0.mo131740x35dafd():void");
    }
}
