package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderShoppingSkuHorizontalNestedScrollView;", "Landroid/widget/HorizontalScrollView;", "Ln3/d0;", "", "enabled", "Ljz5/f0;", "setNestedScrollingEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderShoppingSkuHorizontalNestedScrollView */
/* loaded from: classes14.dex */
public final class C14984xda19797c extends android.widget.HorizontalScrollView implements n3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f207876d;

    /* renamed from: e, reason: collision with root package name */
    public final n3.f0 f207877e;

    /* renamed from: f, reason: collision with root package name */
    public float f207878f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f207879g;

    public C14984xda19797c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f207876d = "FinderShoppingSkuHorizontalNestedScrollView";
        this.f207877e = new n3.f0(this);
        this.f207879g = new int[2];
        android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f17, float f18, boolean z17) {
        return this.f207877e.a(f17, f18, z17);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f17, float f18) {
        return this.f207877e.b(f17, f18);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        return this.f207877e.c(i17, i18, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i17, int i18, int i19, int i27, int[] iArr) {
        return this.f207877e.e(i17, i18, i19, i27, iArr);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f207877e.h(0);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f207877e.f415867d;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        int actionMasked = ev6.getActionMasked();
        if (actionMasked == 0) {
            this.f207878f = ev6.getX();
            this.f207877e.j(1, 0);
        } else if (actionMasked == 1) {
            p(0);
        }
        return super.onInterceptTouchEvent(ev6);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        int scrollX = getScrollX();
        boolean onTouchEvent = super.onTouchEvent(ev6);
        int actionMasked = ev6.getActionMasked();
        if (actionMasked == 0) {
            this.f207878f = ev6.getX();
            this.f207877e.j(1, 0);
        } else if (actionMasked == 1) {
            p(0);
        } else if (actionMasked == 2) {
            float x17 = this.f207878f - ev6.getX();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f207876d, "on move lastX = " + this.f207878f + ", curX = " + ev6.getX() + ", oldX = " + scrollX + ", scrollX = " + getScrollX());
            this.f207878f = ev6.getX();
            int scrollX2 = getScrollX() - scrollX;
            this.f207877e.f(scrollX2, 0, (int) (x17 - ((float) scrollX2)), 0, this.f207879g, 0, null);
        }
        return onTouchEvent;
    }

    @Override // n3.d0
    public void p(int i17) {
        this.f207877e.k(i17);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z17) {
        this.f207877e.i(z17);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i17) {
        return this.f207877e.j(i17, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f207877e.k(0);
    }

    public C14984xda19797c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f207876d = "FinderShoppingSkuHorizontalNestedScrollView";
        this.f207877e = new n3.f0(this);
        this.f207879g = new int[2];
        android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setNestedScrollingEnabled(true);
    }
}
