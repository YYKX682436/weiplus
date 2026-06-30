package gl5;

/* loaded from: classes15.dex */
public abstract class q extends android.view.View implements gl5.d0 {
    public boolean A;
    public final int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public final int H;
    public final long[] I;

    /* renamed from: J, reason: collision with root package name */
    public final int[] f354590J;
    public int K;
    public int L;
    public final /* synthetic */ gl5.e0 M;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f354591d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f354592e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f354593f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.PopupWindow f354594g;

    /* renamed from: h, reason: collision with root package name */
    public int f354595h;

    /* renamed from: i, reason: collision with root package name */
    public int f354596i;

    /* renamed from: m, reason: collision with root package name */
    public int f354597m;

    /* renamed from: n, reason: collision with root package name */
    public int f354598n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f354599o;

    /* renamed from: p, reason: collision with root package name */
    public float f354600p;

    /* renamed from: q, reason: collision with root package name */
    public float f354601q;

    /* renamed from: r, reason: collision with root package name */
    public int f354602r;

    /* renamed from: s, reason: collision with root package name */
    public int f354603s;

    /* renamed from: t, reason: collision with root package name */
    public final float f354604t;

    /* renamed from: u, reason: collision with root package name */
    public final float f354605u;

    /* renamed from: v, reason: collision with root package name */
    public int f354606v;

    /* renamed from: w, reason: collision with root package name */
    public int f354607w;

    /* renamed from: x, reason: collision with root package name */
    public int f354608x;

    /* renamed from: y, reason: collision with root package name */
    public int f354609y;

    /* renamed from: z, reason: collision with root package name */
    public int f354610z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(gl5.e0 e0Var, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, int i17, gl5.k kVar) {
        super(e0Var.U.getContext());
        this.M = e0Var;
        this.f354610z = -1;
        this.A = true;
        this.C = -1;
        this.D = -1;
        this.E = -1.0f;
        this.I = new long[5];
        this.f354590J = new int[5];
        this.K = 0;
        this.L = 0;
        com.p314xaae8f345.mm.ui.zk.a(getContext(), 18);
        setId(i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(viewTreeObserverOnPreDrawListenerC22668xe0605023.getContext(), (android.util.AttributeSet) null, com.p314xaae8f345.mm.R.C30868x68b1db1.f575976nb);
        this.f354594g = popupWindow;
        popupWindow.setSplitTouchEnabled(true);
        popupWindow.setClippingEnabled(false);
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.r.d(popupWindow, 1002);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        popupWindow.setContentView(this);
        this.f354592e = drawable;
        this.f354593f = drawable2;
        p(true);
        this.B = viewTreeObserverOnPreDrawListenerC22668xe0605023.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.abu);
        float m131753xa76936d2 = m131753xa76936d2();
        float f17 = (-0.3f) * m131753xa76936d2;
        this.f354604t = f17;
        float f18 = m131753xa76936d2 * 0.7f;
        this.f354605u = f18;
        this.H = (int) (f18 - f17);
    }

    /* renamed from: getDrawHeight */
    private int m131745xd55f5f81() {
        return this.f354591d.getIntrinsicHeight();
    }

    /* renamed from: getDrawWidth */
    private int m131746x7b72c2c() {
        return this.f354591d.getIntrinsicWidth();
    }

    /* renamed from: getHorizontalOffset */
    private int m131747x4431994d() {
        int m131754x8a5ca6bb = m131754x8a5ca6bb();
        int m131746x7b72c2c = m131746x7b72c2c();
        int i17 = this.f354603s;
        if (i17 != 3) {
            return i17 != 5 ? (m131754x8a5ca6bb - m131746x7b72c2c) / 2 : m131754x8a5ca6bb - m131746x7b72c2c;
        }
        return 0;
    }

    /* renamed from: getOtherSelectionHandle */
    private gl5.q m131748xb22b661a() {
        gl5.b0 p17 = this.M.p();
        if (p17 == null || !p17.a()) {
            return null;
        }
        gl5.a0 a0Var = p17.f354436d;
        return a0Var != this ? a0Var : p17.f354437e;
    }

    /* renamed from: setVisible */
    private void m131749xcd1079b0(boolean z17) {
        android.view.View contentView = this.f354594g.getContentView();
        int i17 = z17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/ui/widget/cedit/edit/Editor$HandleView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/ui/widget/cedit/edit/Editor$HandleView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r2.f354623c > 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    @Override // gl5.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            int r0 = r3.mo131738x43d18c6c()
            r1 = 0
            r3.n(r0, r7, r1)
            if (r6 != 0) goto Le
            boolean r6 = r3.A
            if (r6 == 0) goto L91
        Le:
            boolean r6 = r3.f354599o
            if (r6 == 0) goto L33
            int r6 = r3.f354606v
            if (r4 != r6) goto L1a
            int r7 = r3.f354607w
            if (r5 == r7) goto L30
        L1a:
            float r7 = r3.f354600p
            int r6 = r4 - r6
            float r6 = (float) r6
            float r7 = r7 + r6
            r3.f354600p = r7
            float r6 = r3.f354601q
            int r7 = r3.f354607w
            int r7 = r5 - r7
            float r7 = (float) r7
            float r6 = r6 + r7
            r3.f354601q = r6
            r3.f354606v = r4
            r3.f354607w = r5
        L30:
            r3.m()
        L33:
            boolean r6 = r3.f354599o
            r7 = 1
            gl5.e0 r0 = r3.M
            if (r6 == 0) goto L3b
            goto L67
        L3b:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r0.U
            gl5.e0 r6 = r6.f293122g2
            if (r6 != 0) goto L42
            goto L4b
        L42:
            gl5.s r2 = r6.f354486k
            if (r2 == 0) goto L4d
            int r6 = r2.f354623c
            if (r6 <= 0) goto L4b
            goto L4f
        L4b:
            r7 = r1
            goto L4f
        L4d:
            boolean r7 = r6.f354500y
        L4f:
            if (r7 == 0) goto L53
            r7 = r1
            goto L67
        L53:
            int r6 = r3.f354595h
            int r7 = r3.f354602r
            int r6 = r6 + r7
            int r7 = r3.m131747x4431994d()
            int r6 = r6 + r7
            float r6 = (float) r6
            int r7 = r3.f354596i
            float r7 = (float) r7
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r0.U
            boolean r7 = r2.T(r6, r7)
        L67:
            if (r7 == 0) goto L86
            int r6 = r3.f354595h
            int r4 = r4 + r6
            int r6 = r3.f354596i
            int r5 = r5 + r6
            r3.f354597m = r4
            r3.f354598n = r5
            boolean r6 = r3.k()
            android.widget.PopupWindow r7 = r3.f354594g
            if (r6 == 0) goto L80
            r6 = -1
            r7.update(r4, r5, r6, r6)
            goto L8f
        L80:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r6 = r0.U
            r7.showAtLocation(r6, r1, r4, r5)
            goto L8f
        L86:
            boolean r4 = r3.k()
            if (r4 == 0) goto L8f
            r3.b()
        L8f:
            r3.A = r1
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.q.a(int, int, boolean, boolean):void");
    }

    public void b() {
        this.f354599o = false;
        this.f354594g.dismiss();
        l();
    }

    public final void c() {
        gl5.e0 e0Var = this.M;
        gl5.y yVar = e0Var.f354481f;
        if (yVar != null) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                yVar.f354643a.dismiss();
            }
            yVar.f354644b.cancel();
            yVar.f354645c = false;
            e0Var.f354495t = false;
            gl5.n nVar = e0Var.f354496u;
            if (nVar != null) {
                nVar.f354578d = false;
                e0Var.x();
            }
            m131749xcd1079b0(true);
            gl5.q m131748xb22b661a = m131748xb22b661a();
            if (m131748xb22b661a != null) {
                m131748xb22b661a.m131749xcd1079b0(true);
            }
        }
    }

    public int d(android.text.Layout layout, int i17) {
        return (int) (e(layout, i17) - 0.5f);
    }

    public float e(android.text.Layout layout, int i17) {
        return layout.getPrimaryHorizontal(i17);
    }

    public abstract int f(boolean z17);

    public abstract int g(android.graphics.drawable.Drawable drawable, boolean z17);

    /* renamed from: getCurrentCursorOffset */
    public abstract int mo131738x43d18c6c();

    /* renamed from: getCursorOffset */
    public int mo131750xf0629dff() {
        return 0;
    }

    /* renamed from: getIdealFingerToCursorOffset */
    public final int m131751xc7f326ac() {
        return this.H;
    }

    /* renamed from: getIdealVerticalOffset */
    public float m131752x517e5828() {
        return this.f354605u;
    }

    /* renamed from: getMagnifierHandleTrigger */
    public abstract int mo131739x6b940e08();

    /* renamed from: getPreferredHeight */
    public final int m131753xa76936d2() {
        return java.lang.Math.max(m131746x7b72c2c(), this.B);
    }

    /* renamed from: getPreferredWidth */
    public final int m131754x8a5ca6bb() {
        return java.lang.Math.max(m131746x7b72c2c(), this.B);
    }

    public final boolean h(gl5.q qVar, android.graphics.Rect rect) {
        android.widget.PopupWindow popupWindow = qVar.f354594g;
        int i17 = this.f354597m;
        return android.graphics.Rect.intersects(new android.graphics.Rect(i17, this.f354598n, popupWindow.getContentView().getWidth() + i17, this.f354598n + popupWindow.getContentView().getHeight()), rect);
    }

    public void i() {
        b();
        this.M.n().b(this);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (k()) {
            n(mo131738x43d18c6c(), true, false);
        }
    }

    public boolean j(android.text.Layout layout, int i17) {
        return layout.isRtlCharAt(i17);
    }

    public boolean k() {
        return this.f354594g.isShowing();
    }

    public void l() {
    }

    public void m() {
    }

    public void n(int i17, boolean z17, boolean z18) {
        gl5.e0 e0Var = this.M;
        if (e0Var.U.m81661x22f21e20() == null) {
            e0Var.z();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        boolean z19 = i17 != this.f354610z;
        if (z19 || z17) {
            if (z19) {
                s(i17);
                int i18 = (this.K + 1) % 5;
                this.K = i18;
                this.f354590J[i18] = i17;
                this.I[i18] = android.os.SystemClock.uptimeMillis();
                this.L++;
            }
            int lineForOffset = m81661x22f21e20.getLineForOffset(i17);
            this.C = lineForOffset;
            this.f354595h = ((d(m81661x22f21e20, i17) - this.f354602r) - m131747x4431994d()) + mo131750xf0629dff();
            this.f354596i = m81661x22f21e20.getLineBottom(lineForOffset);
            this.f354595h += viewTreeObserverOnPreDrawListenerC22668xe0605023.m81628xdc9a71d7() - viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX();
            this.f354596i += viewTreeObserverOnPreDrawListenerC22668xe0605023.y0();
            this.f354610z = i17;
            this.A = true;
        }
    }

    public void o() {
        if (k()) {
            return;
        }
        this.M.n().a(this, true);
        this.f354610z = -1;
        n(mo131738x43d18c6c(), false, false);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int m131746x7b72c2c = m131746x7b72c2c();
        int m131745xd55f5f81 = m131745xd55f5f81();
        int m131747x4431994d = m131747x4431994d();
        this.f354591d.setBounds(m131747x4431994d, 0, m131746x7b72c2c + m131747x4431994d, m131745xd55f5f81);
        this.f354591d.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(m131754x8a5ca6bb(), m131753xa76936d2());
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(java.util.Collections.singletonList(new android.graphics.Rect(0, 0, i17, i18)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        if (r1 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1 != 3) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0060  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.q.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(boolean z17) {
        if (z17 || !this.f354599o) {
            gl5.e0 e0Var = this.M;
            android.text.Layout m81661x22f21e20 = e0Var.U.m81661x22f21e20();
            if (m81661x22f21e20 == null) {
                return;
            }
            int mo131738x43d18c6c = mo131738x43d18c6c();
            boolean j17 = j(m81661x22f21e20, mo131738x43d18c6c);
            android.graphics.drawable.Drawable drawable = this.f354591d;
            android.graphics.drawable.Drawable drawable2 = j17 ? this.f354593f : this.f354592e;
            this.f354591d = drawable2;
            this.f354602r = g(drawable2, j17);
            this.f354603s = f(j17);
            if (drawable == this.f354591d || !k()) {
                return;
            }
            int d17 = ((d(m81661x22f21e20, mo131738x43d18c6c) - this.f354602r) - m131747x4431994d()) + mo131750xf0629dff();
            this.f354595h = d17;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
            this.f354595h = d17 + (viewTreeObserverOnPreDrawListenerC22668xe0605023.m81628xdc9a71d7() - viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX());
            this.A = true;
            a(this.f354606v, this.f354607w, false, false);
            postInvalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.q.q(android.view.MotionEvent):void");
    }

    public abstract void r(float f17, float f18, boolean z17);

    public abstract void s(int i17);

    /* renamed from: setTargetWidth */
    public void m131755xf385d8f3(int i17) {
    }
}
