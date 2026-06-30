package com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44;

/* loaded from: classes15.dex */
public class v extends com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 {

    /* renamed from: i2, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 f296318i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4, android.content.Context context) {
        super(context, null);
        this.f296318i2 = c22956x1a4bbf4;
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4, android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        this.f296318i2.f296284z.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f296318i2;
        accessibilityEvent.setFromIndex(c22956x1a4bbf4.f296268g);
        accessibilityEvent.setToIndex(c22956x1a4bbf4.f296268g);
        accessibilityEvent.setSource(((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s) c22956x1a4bbf4.f296284z).f296316d);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f296318i2.f296282x && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f296318i2.f296282x && super.onTouchEvent(motionEvent);
    }
}
