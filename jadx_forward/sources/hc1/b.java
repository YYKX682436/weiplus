package hc1;

/* loaded from: classes15.dex */
public final class b extends android.widget.FrameLayout implements ol1.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hc1.c f361816d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f361817e;

    /* renamed from: f, reason: collision with root package name */
    public int f361818f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, boolean z17) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f361816d = new hc1.c();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.u0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a6.class))).getClass();
        com.p314xaae8f345.mm.p2776x373aa5.C22806xb44316b3 c22806xb44316b3 = new com.p314xaae8f345.mm.p2776x373aa5.C22806xb44316b3(context, z17);
        this.f361817e = c22806xb44316b3;
        int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
        c22806xb44316b3.mo75331xef640234(112);
        c22806xb44316b3.mo75351x4aab89d0(true);
        c22806xb44316b3.mo75350x625ff6a7(true);
        c22806xb44316b3.p(false, false);
        c22806xb44316b3.o(false, false);
        c22806xb44316b3.mo75352xe9a5b5a2(false);
        c22806xb44316b3.mo75347xe8c09ab9(false);
        c22806xb44316b3.mo75349x4a374107(false);
        c22806xb44316b3.mo75348x625a7311(false);
        c22806xb44316b3.i();
        c22806xb44316b3.k();
        c22806xb44316b3.j();
        addView(c22806xb44316b3, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setClickable(true);
    }

    /* renamed from: getAppropriateHeightInPort */
    private final int m133167xfc3671e0() {
        int i17 = this.f361818f;
        return i17 > 0 ? i17 : m133170xb502fd00();
    }

    /* renamed from: getForcedPanelHeight */
    public int m133168x56fb3efc() {
        return this.f361818f;
    }

    /* renamed from: getMSmileyPanel */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 m133169x45f66ddc() {
        return this.f361817e;
    }

    /* renamed from: getPanelDefaultHeightInPort */
    public int m133170xb502fd00() {
        hc1.c cVar = this.f361816d;
        if (cVar.f361821c < 0) {
            cVar.f361821c = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        int i17 = cVar.f361821c;
        if (i17 > 0) {
            return i17;
        }
        int[] a17 = cVar.a();
        int max = (java.lang.Math.max(a17[0], a17[1]) / 2) - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561135ac);
        cVar.f361821c = max;
        return max;
    }

    /* renamed from: getPanelHeightInLandscape */
    public int m133171xa8581cc1() {
        hc1.c cVar = this.f361816d;
        int[] a17 = cVar.a();
        int i17 = cVar.f361820b;
        return (i17 <= 0 || i17 >= a17[1]) ? (java.lang.Math.min(a17[0], a17[1]) / 2) - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561135ac) : i17;
    }

    @Override // ol1.o
    /* renamed from: getPanelView */
    public android.view.View mo133172xa7118813() {
        return this;
    }

    @Override // ol1.o
    public boolean l() {
        return true;
    }

    @Override // ol1.o
    public boolean n(int i17) {
        if (i17 <= 0 || this.f361818f == i17) {
            return false;
        }
        this.f361818f = i17;
        return true;
    }

    @Override // ol1.o
    public void o() {
        this.f361817e.setVisibility(0);
        setBackground(null);
    }

    @Override // ol1.o
    /* renamed from: onDestroy */
    public void mo133173xac79a11b() {
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllViews();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (isShown()) {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(!com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(getContext()) ? m133171xa8581cc1() : m133167xfc3671e0(), 1073741824));
        } else {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
        }
    }

    @Override // ol1.o
    /* renamed from: onPause */
    public void mo133174xb01dfb57() {
        this.f361817e.h();
    }

    @Override // ol1.o
    /* renamed from: onResume */
    public void mo133175x57429eec() {
        this.f361817e.i();
    }

    @Override // ol1.o
    public void p(boolean z17) {
        this.f361817e.mo75352xe9a5b5a2(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4
    public boolean q() {
        getHeight();
        getMeasuredHeight();
        int i17 = this.f361818f;
        return i17 > 0 && i17 == getMeasuredHeight();
    }

    @Override // ol1.o
    public void r(boolean z17) {
        this.f361817e.mo75349x4a374107(z17);
    }

    @Override // ol1.o
    public void s(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f361817e;
        abstractC19636xc6b37291.setVisibility(4);
        if (z17) {
            setBackground(null);
            return;
        }
        android.content.res.TypedArray obtainStyledAttributes = abstractC19636xc6b37291.getContext().obtainStyledAttributes(new int[]{com.p314xaae8f345.mm.R.C30857x2dd9f1.f559776ek});
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            setBackground(drawable);
        } catch (java.lang.Throwable th6) {
            obtainStyledAttributes.recycle();
            throw th6;
        }
    }

    /* renamed from: setFinishButtonText */
    public final void m133176x65e300f4(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f361817e.mo75333x567edf71(text);
    }

    /* renamed from: setForceHeight */
    public void m133177x4133a630(int i17) {
        this.f361816d.f361820b = i17;
    }

    @Override // ol1.o
    /* renamed from: setOnEmoticonOperationListener */
    public void mo133178x23b81e74(ol1.t tVar) {
    }

    @Override // ol1.o
    /* renamed from: setOnTextOperationListener */
    public void mo133180x5e04422d(ol1.u uVar) {
    }

    @Override // ol1.o
    public boolean t() {
        return isInLayout();
    }

    /* renamed from: setOnTextOperationListener */
    public final void m133179x5e04422d(com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 k0Var) {
        this.f361817e.mo75339x5e04422d(k0Var == null ? null : new hc1.a(k0Var));
    }
}
