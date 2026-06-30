package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isCanScroll", "", "()Z", "setCanScroll", "(Z)V", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager */
/* loaded from: classes3.dex */
public final class C14410xbcb3c9ec extends p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe {
    private boolean isCanScroll;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14410xbcb3c9ec(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.isCanScroll = true;
    }

    /* renamed from: isCanScroll, reason: from getter */
    public final boolean getIsCanScroll() {
        return this.isCanScroll;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        return this.isCanScroll && super.onInterceptTouchEvent(ev6);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        return this.isCanScroll && super.onTouchEvent(ev6);
    }

    /* renamed from: setCanScroll */
    public final void m57943x5cc2687b(boolean z17) {
        this.isCanScroll = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14410xbcb3c9ec(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.isCanScroll = true;
    }
}
