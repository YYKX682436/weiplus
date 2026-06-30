package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveOverScrollRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "layout", "Ljz5/f0;", "setLayoutManager", "Lkotlin/Function0;", "", "p2", "Lyz5/a;", "getCanScrollListener", "()Lyz5/a;", "setCanScrollListener", "(Lyz5/a;)V", "canScrollListener", "q2", "getHasUnreadListener", "setHasUnreadListener", "hasUnreadListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/live/view/a8", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView */
/* loaded from: classes3.dex */
public final class C14339x748bebd7 extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 {

    /* renamed from: j2, reason: collision with root package name */
    public final int f197597j2;

    /* renamed from: k2, reason: collision with root package name */
    public float f197598k2;

    /* renamed from: l2, reason: collision with root package name */
    public int f197599l2;

    /* renamed from: m2, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f197600m2;

    /* renamed from: n2, reason: collision with root package name */
    public boolean f197601n2;

    /* renamed from: o2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.a8 f197602o2;

    /* renamed from: p2, reason: collision with root package name and from kotlin metadata */
    public yz5.a canScrollListener;

    /* renamed from: q2, reason: collision with root package name and from kotlin metadata */
    public yz5.a hasUnreadListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14339x748bebd7(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z17 = true;
        }
        if (z17) {
            this.f197598k2 = motionEvent.getRawY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean g1() {
        yz5.a aVar = this.hasUnreadListener;
        if (aVar != null && ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue()) {
            return false;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f197600m2;
        java.lang.Integer valueOf = c1162x665295de != null ? java.lang.Integer.valueOf(c1162x665295de.x()) : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = mo7946xf939df19();
        return valueOf != null && valueOf.intValue() == (mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : -1) - 1;
    }

    public final yz5.a getCanScrollListener() {
        return this.canScrollListener;
    }

    public final yz5.a getHasUnreadListener() {
        return this.hasUnreadListener;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z17 = true;
        }
        if (z17) {
            this.f197598k2 = motionEvent.getRawY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        if (r3 != 3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        if (r3 != 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14339x748bebd7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setCanScrollListener */
    public final void m57424xd8d2e64f(yz5.a aVar) {
        this.canScrollListener = aVar;
    }

    /* renamed from: setHasUnreadListener */
    public final void m57425x3e8fda7b(yz5.a aVar) {
        this.hasUnreadListener = aVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    /* renamed from: setLayoutManager */
    public void mo7967x900dcbe1(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        super.mo7967x900dcbe1(layoutManager);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de2 != null && c1162x665295de2.getF204840r()) {
            c1162x665295de = c1162x665295de2;
        }
        this.f197600m2 = c1162x665295de;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14339x748bebd7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f197597j2 = i65.a.b(getContext(), 64);
        this.f197602o2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.a8.f197713d;
        this.f197599l2 = android.view.ViewConfiguration.getTouchSlop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveOverScrollRecyclerView", "init, touchSlop=" + this.f197599l2);
    }
}
