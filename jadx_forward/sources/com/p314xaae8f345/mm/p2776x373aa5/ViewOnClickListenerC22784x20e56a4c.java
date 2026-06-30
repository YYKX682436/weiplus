package com.p314xaae8f345.mm.p2776x373aa5;

/* renamed from: com.tencent.mm.view.ExpandTextView */
/* loaded from: classes3.dex */
public class ViewOnClickListenerC22784x20e56a4c extends android.widget.FrameLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f294835d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f294836e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f294837f;

    public ViewOnClickListenerC22784x20e56a4c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f294837f = false;
    }

    /* renamed from: getExpandTextView */
    public android.widget.TextView m82525x4b366b22() {
        return this.f294835d;
    }

    /* renamed from: getTextView */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 m82526x4008d2e8() {
        return this.f294836e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/ExpandTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f294837f) {
            this.f294837f = true;
            this.f294836e.m84175x8dd5167d(Integer.MAX_VALUE);
            this.f294835d.animate().alpha(0.0f).setDuration(300L).setListener(new ym5.g0(this)).start();
        }
        yj0.a.h(this, "com/tencent/mm/view/ExpandTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f294836e = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039(getContext());
        addView(this.f294836e, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f294835d = new android.widget.TextView(getContext());
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 85;
        addView(this.f294835d, layoutParams);
        this.f294835d.setOnClickListener(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f294837f) {
            return;
        }
        ks5.a i19 = this.f294836e.i(getMeasuredWidth(), getMeasuredHeight());
        if (i19 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExpandTextView", "layout is null!");
            this.f294835d.setVisibility(8);
        } else if (((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2839xbddafb2a.C23000xc9450414) i19).L > 0) {
            this.f294835d.setVisibility(0);
        } else {
            this.f294835d.setVisibility(8);
        }
    }

    /* renamed from: setExpandIconText */
    public void m82527x23024f02(java.lang.String str) {
    }

    /* renamed from: setExpandTextColor */
    public void m82528x5164a7fa(int i17) {
        this.f294835d.setTextColor(i17);
    }

    /* renamed from: setExpandTextSize */
    public void m82529x132b788a(float f17) {
        this.f294835d.setTextSize(0, f17);
    }

    /* renamed from: setLineSpacingExtra */
    public void m82530xa5da423(int i17) {
        this.f294836e.m84182x42191760(i17);
    }

    /* renamed from: setMaxLines */
    public void m82531x8dd5167d(int i17) {
        this.f294836e.m84175x8dd5167d(i17);
    }

    /* renamed from: setOnExpandListener */
    public void m82532x634f71af(ym5.h0 h0Var) {
    }

    /* renamed from: setTextColor */
    public void m82533x1c5c5ff4(int i17) {
        this.f294836e.m84183x1c5c5ff4(i17);
    }

    /* renamed from: setTextSize */
    public void m82534x3abfd950(float f17) {
        this.f294836e.l(0, f17);
    }

    public ViewOnClickListenerC22784x20e56a4c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f294837f = false;
    }
}
