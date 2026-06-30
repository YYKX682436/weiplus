package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.WrapScollview */
/* loaded from: classes4.dex */
public class C18153xb2f8a3ba extends p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 {
    public boolean K;
    public boolean L;
    public int M;
    public android.view.View N;

    public C18153xb2f8a3ba(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.K = true;
        this.L = true;
        this.M = -1;
    }

    @Override // p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89
    public int b(android.graphics.Rect rect) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("computeScrollDeltaToGetChildRectOnScreen", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        int b17 = super.b(rect);
        if (!this.K) {
            b17 = 0;
        }
        int i17 = this.M;
        if (i17 != -1) {
            this.M = 0;
            b17 = i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("computeScrollDeltaToGetChildRectOnScreen", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        return b17;
    }

    @Override // p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        if (this.L && (view = this.N) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i17 = iArr[0];
            int width = view.getWidth() + i17;
            boolean z17 = true;
            int i18 = iArr[1];
            int height = view.getHeight() + i18;
            if (i17 >= rawX || rawX >= width || i18 >= rawY || rawY >= height) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
                z17 = false;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.WrapScollview");
                return false;
            }
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        return onInterceptTouchEvent;
    }

    /* renamed from: setCheckInterceptTouchEventByCheckArea */
    public void m70823x788d9147(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCheckInterceptTouchEventByCheckArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        this.L = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCheckInterceptTouchEventByCheckArea", "com.tencent.mm.plugin.sns.ui.WrapScollview");
    }

    /* renamed from: setContentView */
    public void m70824x590ab8fc(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentView", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        this.N = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentView", "com.tencent.mm.plugin.sns.ui.WrapScollview");
    }

    /* renamed from: setDoComputeScrollDeltaToGetChildRectOnScreen */
    public void m70825x7b40c7d1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDoComputeScrollDeltaToGetChildRectOnScreen", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        this.K = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDoComputeScrollDeltaToGetChildRectOnScreen", "com.tencent.mm.plugin.sns.ui.WrapScollview");
    }

    /* renamed from: setScrollDeltaOnFocusLocationChange */
    public void m70826x437b1eb5(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScrollDeltaOnFocusLocationChange", "com.tencent.mm.plugin.sns.ui.WrapScollview");
        this.M = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScrollDeltaOnFocusLocationChange", "com.tencent.mm.plugin.sns.ui.WrapScollview");
    }

    public C18153xb2f8a3ba(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = true;
        this.L = true;
        this.M = -1;
    }
}
