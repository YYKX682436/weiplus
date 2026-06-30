package ol1;

/* loaded from: classes15.dex */
public final class c extends android.widget.FrameLayout implements ol1.o, ol1.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol1.q f427657d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f427658e;

    /* renamed from: f, reason: collision with root package name */
    public int f427659f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, boolean z17) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f427657d = new ol1.q();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.u0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a6.class))).getClass();
        com.p314xaae8f345.mm.p2776x373aa5.C22806xb44316b3 c22806xb44316b3 = new com.p314xaae8f345.mm.p2776x373aa5.C22806xb44316b3(context, z17);
        this.f427658e = c22806xb44316b3;
        c22806xb44316b3.mo75351x4aab89d0(true);
        c22806xb44316b3.p(false, false);
        c22806xb44316b3.o(false, false);
        c22806xb44316b3.mo75352xe9a5b5a2(false);
        c22806xb44316b3.mo75350x625ff6a7(false);
        c22806xb44316b3.mo75347xe8c09ab9(false);
        c22806xb44316b3.mo75349x4a374107(true);
        c22806xb44316b3.i();
        addView(c22806xb44316b3, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setClickable(true);
    }

    /* renamed from: getAppropriateHeightInPort */
    private final int m151618xfc3671e0() {
        int i17 = this.f427659f;
        return i17 > 0 ? i17 : m151620xb502fd00();
    }

    /* renamed from: getForcedPanelHeight */
    public int m151619x56fb3efc() {
        return this.f427659f;
    }

    /* renamed from: getPanelDefaultHeightInPort */
    public int m151620xb502fd00() {
        ol1.q qVar = this.f427657d;
        if (qVar.f427671f < 0) {
            qVar.f427671f = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        int i17 = qVar.f427671f;
        if (i17 > 0) {
            return i17;
        }
        int[] a17 = qVar.a();
        int max = (java.lang.Math.max(a17[0], a17[1]) / 2) - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561135ac);
        qVar.f427671f = max;
        return max;
    }

    /* renamed from: getPanelHeightInLandscape */
    public int m151621xa8581cc1() {
        ol1.q qVar = this.f427657d;
        int[] a17 = qVar.a();
        int i17 = qVar.f427670e;
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
        if (i17 <= 0 || this.f427659f == i17) {
            return false;
        }
        this.f427659f = i17;
        mo151622x4133a630(i17);
        return true;
    }

    @Override // ol1.o
    public void o() {
        this.f427658e.setVisibility(0);
        setBackground(null);
    }

    @Override // ol1.o
    /* renamed from: onDestroy */
    public void mo133173xac79a11b() {
        removeAllViews();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (isShown()) {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(!com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(getContext()) ? m151621xa8581cc1() : m151618xfc3671e0(), 1073741824));
        } else {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
        }
    }

    @Override // ol1.o
    /* renamed from: onPause */
    public void mo133174xb01dfb57() {
        this.f427658e.h();
    }

    @Override // ol1.o
    /* renamed from: onResume */
    public void mo133175x57429eec() {
        this.f427658e.i();
    }

    @Override // ol1.o
    public void p(boolean z17) {
        this.f427658e.mo75352xe9a5b5a2(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4
    public boolean q() {
        getHeight();
        getMeasuredHeight();
        int i17 = this.f427659f;
        return i17 > 0 && i17 == getMeasuredHeight();
    }

    @Override // ol1.o
    public void r(boolean z17) {
        this.f427658e.mo75349x4a374107(z17);
    }

    @Override // ol1.o
    public void s(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f427658e;
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

    @Override // ol1.p
    /* renamed from: setForceHeight */
    public void mo151622x4133a630(int i17) {
        this.f427657d.f427670e = i17;
    }

    @Override // ol1.o
    /* renamed from: setOnEmoticonOperationListener */
    public void mo133178x23b81e74(ol1.t tVar) {
        this.f427658e.mo75328x6c4ebec7(new ol1.a(tVar));
    }

    @Override // ol1.o
    /* renamed from: setOnTextOperationListener */
    public void mo133180x5e04422d(ol1.u uVar) {
        this.f427658e.mo75339x5e04422d(uVar == null ? null : new ol1.b(uVar));
    }

    @Override // ol1.o
    public boolean t() {
        return isInLayout();
    }
}
