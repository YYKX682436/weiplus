package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMRadioGroupView */
/* loaded from: classes15.dex */
public class C21511xb6a721c9 extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public int f279079d;

    /* renamed from: e, reason: collision with root package name */
    public int f279080e;

    /* renamed from: f, reason: collision with root package name */
    public db5.u5 f279081f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332 f279082g;

    public C21511xb6a721c9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279079d = -1;
        this.f279080e = -1;
        this.f279081f = new db5.q5(this);
        super.setOnHierarchyChangeListener(new db5.s5(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCheckedButton */
    public void m79099xf9556c77(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332 c21512xdc5bf332) {
        this.f279082g = c21512xdc5bf332;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCheckedId */
    public void m79100x738abce0(int i17) {
        this.f279079d = i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setClickedId */
    public void m79101xe6a85d60(int i17) {
        this.f279080e = i17;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.View findViewById;
        if (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332 c21512xdc5bf332 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332) view;
            if (c21512xdc5bf332.isChecked()) {
                int i18 = this.f279079d;
                if (i18 != -1 && (findViewById = findViewById(i18)) != null && (findViewById instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332)) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332) findViewById).setChecked(false);
                }
                m79100x738abce0(c21512xdc5bf332.getId());
                m79099xf9556c77(c21512xdc5bf332);
            }
        }
        super.addView(view, i17, layoutParams);
    }

    /* renamed from: getCheckedRadioButton */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332 m79102x4c3fbadc() {
        return this.f279082g;
    }

    /* renamed from: getCheckedRadioButtonId */
    public int m79103x3b3c7d17() {
        return this.f279079d;
    }

    /* renamed from: getClickedRadioButtonId */
    public int m79104x842d8c97() {
        return this.f279080e;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        int i17 = this.f279079d;
        if (i17 != -1) {
            android.view.View findViewById = findViewById(i17);
            if (findViewById != null && (findViewById instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332)) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332) findViewById).setChecked(true);
            }
            m79100x738abce0(this.f279079d);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
    }

    /* renamed from: setOnMMRadioGroupCheckedChangeListener */
    public void m79105x77c9c7a6(db5.r5 r5Var) {
    }

    /* renamed from: setOnSizeChangeObserver */
    public void m79106x8296ccc8(db5.t5 t5Var) {
    }
}
