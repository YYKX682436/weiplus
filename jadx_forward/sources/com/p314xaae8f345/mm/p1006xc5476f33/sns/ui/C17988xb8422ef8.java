package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/PassThroughRecyclerView;", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveRecyclerView;", "", "o2", "Ljz5/g;", "getTouchSlop", "()I", "touchSlop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView */
/* loaded from: classes3.dex */
public final class C17988xb8422ef8 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18275x32e752fc {

    /* renamed from: k2, reason: collision with root package name */
    public float f248099k2;

    /* renamed from: l2, reason: collision with root package name */
    public float f248100l2;

    /* renamed from: m2, reason: collision with root package name */
    public boolean f248101m2;

    /* renamed from: n2, reason: collision with root package name */
    public boolean f248102n2;

    /* renamed from: o2, reason: collision with root package name and from kotlin metadata */
    public final jz5.g touchSlop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17988xb8422ef8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.touchSlop = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n7(this));
    }

    /* renamed from: getTouchSlop */
    private final int m70664x151bf723() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTouchSlop", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        int intValue = ((java.lang.Number) this.touchSlop.mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTouchSlop", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        return intValue;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    public void L0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        this.f248101m2 = !canScrollVertically(-1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        int actionMasked = e17.getActionMasked();
        if (actionMasked == 5) {
            this.f248102n2 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
            return false;
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f248102n2 = false;
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(e17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
            return onInterceptTouchEvent;
        }
        if (this.f248102n2 || e17.getPointerCount() >= 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
            return false;
        }
        if (actionMasked == 0) {
            this.f248099k2 = e17.getY();
            this.f248100l2 = e17.getX();
            this.f248101m2 = !canScrollVertically(-1);
        } else if (actionMasked == 2) {
            float abs = java.lang.Math.abs(e17.getX() - this.f248100l2);
            float abs2 = java.lang.Math.abs(e17.getY() - this.f248099k2);
            if (abs > m70664x151bf723() && abs > abs2 * 1.2d) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
                return true;
            }
            if (this.f248101m2 && e17.getY() - this.f248099k2 > m70664x151bf723() && abs2 > abs) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
                return false;
            }
        }
        boolean onInterceptTouchEvent2 = super.onInterceptTouchEvent(e17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        return onInterceptTouchEvent2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        int action = e17.getAction();
        if (action == 0) {
            this.f248099k2 = e17.getY();
            this.f248101m2 = !canScrollVertically(-1);
        } else if (action == 2 && this.f248101m2 && e17.getY() - this.f248099k2 > 0.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
            return false;
        }
        boolean onTouchEvent = super.onTouchEvent(e17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        return onTouchEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17988xb8422ef8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.touchSlop = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n7(this));
    }
}
