package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMTagPanelScrollView */
/* loaded from: classes11.dex */
public class C21517xd417c6fc extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public final db5.d7 f279128d;

    /* renamed from: e, reason: collision with root package name */
    public int f279129e;

    /* renamed from: f, reason: collision with root package name */
    public int f279130f;

    public C21517xd417c6fc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f279128d = new db5.d7(null);
        this.f279129e = 0;
        this.f279130f = 2;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        scrollBy(0, i27);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        super.onMeasure(i17, i18);
        if (getChildCount() <= 0) {
            return;
        }
        int i27 = 0;
        if (getChildAt(0) instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a) getChildAt(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c21516xe823d84a.F;
            boolean isFocused = c22621x7603e017 == null ? false : c22621x7603e017.isFocused();
            if (c21516xe823d84a.m78884x92d2fac5() == this.f279130f) {
                this.f279129e = c21516xe823d84a.getMeasuredHeight() + getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561461j8);
            }
            if (c21516xe823d84a.m78884x92d2fac5() >= this.f279130f) {
                int size = android.view.View.MeasureSpec.getSize(i17);
                int i28 = this.f279130f;
                java.util.LinkedList linkedList = c21516xe823d84a.f278789f;
                int max = java.lang.Math.max(0, java.lang.Math.min(linkedList.size(), i28));
                int paddingTop = c21516xe823d84a.getPaddingTop();
                while (true) {
                    i19 = max - 1;
                    if (i27 >= i19) {
                        break;
                    }
                    paddingTop += ((java.lang.Integer) linkedList.get(i27)).intValue() + c21516xe823d84a.f278788e;
                    i27++;
                }
                setMeasuredDimension(size, java.lang.Math.max(paddingTop + ((java.lang.Integer) linkedList.get(i19)).intValue() + c21516xe823d84a.getPaddingBottom(), this.f279129e));
                if (isFocused) {
                    db5.d7 d7Var = this.f279128d;
                    d7Var.f309852d = c21516xe823d84a;
                    removeCallbacks(d7Var);
                    post(d7Var);
                }
            }
        }
    }

    /* renamed from: setMaxLine */
    public void m79146xe38b00b6(int i17) {
        if (i17 < 1) {
            i17 = 1;
        }
        this.f279130f = i17;
    }

    public C21517xd417c6fc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279128d = new db5.d7(null);
        this.f279129e = 0;
        this.f279130f = 2;
    }
}
