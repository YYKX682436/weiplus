package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveRecyclerView;", "Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;", "Ln3/i0;", "Landroid/graphics/Rect;", "getCommentRectOnScreen", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView */
/* loaded from: classes3.dex */
public final class C14343x44b0b6f6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea implements n3.i0 {
    public boolean A2;
    public boolean B2;

    /* renamed from: w2, reason: collision with root package name */
    public final java.lang.String f197621w2;

    /* renamed from: x2, reason: collision with root package name */
    public android.view.View f197622x2;

    /* renamed from: y2, reason: collision with root package name */
    public android.graphics.Rect f197623y2;

    /* renamed from: z2, reason: collision with root package name */
    public boolean f197624z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14343x44b0b6f6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f197621w2 = "Finder.FinderLiveRecyclerView";
    }

    /* renamed from: getCommentRectOnScreen */
    private final android.graphics.Rect m57437x4d3fb9f8() {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Kj();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    public void a1(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197621w2, "scrollToPosition " + i17);
        super.a1(i17);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    public void b1(int i17, int i18, android.view.animation.Interpolator interpolator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197621w2, "smoothScrollBy");
        super.b1(i17, i18, interpolator);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    public void c1(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197621w2, "smoothScrollToPosition");
        super.c1(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        android.view.View view = this.f197622x2;
        if (view != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            if (view.getId() == com.p314xaae8f345.mm.R.id.ev9) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x008b, code lost:
    
        if (r6.f197622x2 != null) goto L50;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14343x44b0b6f6.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return !this.A2 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View target, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197621w2, "onNestedScroll");
        if (target != this.f197622x2 || this.f197624z2 || i18 == 0) {
            return;
        }
        this.f197624z2 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View child, android.view.View target, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197621w2, "onNestedScrollAccepted");
        if ((i17 & 2) != 0) {
            this.f197622x2 = target;
            this.f197624z2 = false;
        }
        super.onNestedScrollAccepted(child, target, i17);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View child, android.view.View target, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        return (i17 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View child) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197621w2, "onStopNestedScroll");
        this.f197622x2 = null;
        this.f197624z2 = false;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void scrollBy(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197621w2, "scrollBy");
        super.scrollBy(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void scrollTo(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197621w2, "scrollTo");
        super.scrollTo(i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    /* renamed from: smoothScrollBy */
    public void mo7976xc291bbd2(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197621w2, "smoothScrollBy");
        b1(i17, i18, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14343x44b0b6f6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f197621w2 = "Finder.FinderLiveRecyclerView";
    }
}
