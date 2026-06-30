package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.MMTabView */
/* loaded from: classes11.dex */
public class C21407xddef161a extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f278446d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f278447e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f278448f;

    /* renamed from: g, reason: collision with root package name */
    public final int f278449g;

    /* renamed from: h, reason: collision with root package name */
    public int f278450h;

    public C21407xddef161a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278450h = 0;
        a();
    }

    public final void a() {
        this.f278450h = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_);
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        boolean j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j();
        boolean equalsIgnoreCase = d17.equalsIgnoreCase("en");
        int q17 = j17 ? (int) (i65.a.q(getContext()) * i65.a.b(getContext(), 2)) : 0;
        android.widget.TextView textView = new android.widget.TextView(getContext());
        this.f278446d = textView;
        textView.setSingleLine();
        this.f278446d.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.f278446d.setTextColor(getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq));
        this.f278446d.setTextSize(0, i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
        this.f278446d.setText("");
        if (j17) {
            android.widget.TextView textView2 = this.f278446d;
            textView2.setTextSize(0, textView2.getTextSize() + q17);
            this.f278446d.setTypeface(null, 0);
        } else if (equalsIgnoreCase) {
            this.f278446d.setTypeface(null, 1);
        }
        addView(this.f278446d);
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f278447e = imageView;
        imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b8i);
        this.f278447e.setVisibility(4);
        addView(this.f278447e);
        android.widget.TextView textView3 = new android.widget.TextView(getContext());
        this.f278448f = textView3;
        textView3.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        this.f278448f.setTextSize(1, 11.0f);
        this.f278448f.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.a(getContext()));
        this.f278448f.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        this.f278448f.setGravity(17);
        this.f278448f.setVisibility(4);
        addView(this.f278448f);
        setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfk);
    }

    /* renamed from: getText */
    public java.lang.String m78770xfb85ada3() {
        return this.f278446d.getText().toString();
    }

    /* renamed from: getUnread */
    public java.lang.String m78771x330196a5() {
        return this.f278448f.getText().toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28 = i19 - i17;
        int i29 = i27 - i18;
        int measuredWidth = (i28 - this.f278446d.getMeasuredWidth()) / 2;
        int measuredWidth2 = this.f278446d.getMeasuredWidth() + measuredWidth;
        int measuredHeight = (i29 - this.f278446d.getMeasuredHeight()) / 2;
        this.f278446d.layout(measuredWidth, measuredHeight, measuredWidth2, this.f278446d.getMeasuredHeight() + measuredHeight);
        int i37 = this.f278450h + measuredWidth2;
        int measuredWidth3 = this.f278447e.getMeasuredWidth() + i37;
        int measuredHeight2 = (i29 - this.f278447e.getMeasuredHeight()) / 2;
        this.f278447e.layout(i37, measuredHeight2, measuredWidth3, this.f278447e.getMeasuredHeight() + measuredHeight2);
        if (measuredWidth - this.f278450h < this.f278448f.getMeasuredWidth()) {
            int measuredWidth4 = i28 - this.f278448f.getMeasuredWidth();
            int measuredWidth5 = this.f278448f.getMeasuredWidth() + measuredWidth4;
            int measuredHeight3 = (i29 - this.f278448f.getMeasuredHeight()) / 2;
            this.f278448f.layout(measuredWidth4, measuredHeight3, measuredWidth5, this.f278448f.getMeasuredHeight() + measuredHeight3);
            return;
        }
        int i38 = measuredWidth2 + this.f278450h;
        int measuredWidth6 = this.f278448f.getMeasuredWidth() + i38;
        int measuredHeight4 = (i29 - this.f278448f.getMeasuredHeight()) / 2;
        this.f278448f.layout(i38, measuredHeight4, measuredWidth6, this.f278448f.getMeasuredHeight() + measuredHeight4);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int size = (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight();
        int size2 = (android.view.View.MeasureSpec.getSize(i18) - getPaddingTop()) - getPaddingBottom();
        int makeMeasureSpec = android.view.View.MeasureSpec.getMode(i18) == Integer.MIN_VALUE ? android.view.View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f278446d.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        this.f278447e.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        this.f278448f.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        setMeasuredDimension(size, size2);
    }

    /* renamed from: setText */
    public void m78772x765074af(int i17) {
        this.f278446d.setText(i17);
    }

    /* renamed from: setTextColor */
    public void m78774x1c5c5ff4(int i17) {
        this.f278446d.setTextColor(i17);
    }

    /* renamed from: setUnread */
    public void m78775x2636cab1(java.lang.String str) {
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(getContext(), java.lang.Integer.parseInt(str));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f278448f.setVisibility(4);
        } else {
            this.f278448f.setVisibility(0);
            this.f278448f.post(new com.p314xaae8f345.mm.ui.be(this, str, b17));
        }
    }

    /* renamed from: setText */
    public void m78773x765074af(java.lang.String str) {
        this.f278446d.setText(str);
    }

    public C21407xddef161a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278450h = 0;
        a();
    }

    public C21407xddef161a(android.content.Context context, int i17) {
        super(context);
        this.f278450h = 0;
        a();
        this.f278449g = i17;
        m78771x330196a5();
        la5.b.f399133a.d(this, m78770xfb85ada3(), m78771x330196a5(), i17);
    }
}
