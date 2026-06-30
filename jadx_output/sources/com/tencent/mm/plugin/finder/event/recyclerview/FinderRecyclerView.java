package com.tencent.mm.plugin.finder.event.recyclerview;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0003\t\u00022B\u001b\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/B#\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u00100\u001a\u00020\f¢\u0006\u0004\b.\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\r\u001a\u00020\fH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR2\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R2\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$¨\u00063"}, d2 = {"Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lgc2/c;", "outListener", "Ljz5/f0;", "setPageChangeListener", "", "defer", "setDeferPageSelectedUntilIdle", "Lgc2/b;", "callback", "setOnInterceptionListener", "", "getScrollState", "Lgc2/h;", "n2", "Lgc2/h;", "getScrollEventAdapter", "()Lgc2/h;", "setScrollEventAdapter", "(Lgc2/h;)V", "scrollEventAdapter", "r2", "Z", "getHorizontalSwipeOptimizationEnabled", "()Z", "setHorizontalSwipeOptimizationEnabled", "(Z)V", "horizontalSwipeOptimizationEnabled", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "u2", "Lyz5/l;", "getInterceptTouchEventListener", "()Lyz5/l;", "setInterceptTouchEventListener", "(Lyz5/l;)V", "interceptTouchEventListener", "v2", "getSkipsTouchInterceptionListener", "setSkipsTouchInterceptionListener", "skipsTouchInterceptionListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gc2/d", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class FinderRecyclerView extends com.tencent.mm.view.recyclerview.WxRecyclerView {

    /* renamed from: j2 */
    public boolean f105307j2;

    /* renamed from: k2 */
    public gc2.c f105308k2;

    /* renamed from: l2 */
    public final jz5.g f105309l2;

    /* renamed from: m2 */
    public int f105310m2;

    /* renamed from: n2, reason: from kotlin metadata */
    public gc2.h scrollEventAdapter;

    /* renamed from: o2 */
    public gc2.d f105312o2;

    /* renamed from: p2 */
    public android.view.MotionEvent f105313p2;

    /* renamed from: q2 */
    public final int f105314q2;

    /* renamed from: r2, reason: from kotlin metadata */
    public boolean horizontalSwipeOptimizationEnabled;

    /* renamed from: s2 */
    public final float f105316s2;

    /* renamed from: t2 */
    public final gc2.c f105317t2;

    /* renamed from: u2, reason: from kotlin metadata */
    public yz5.l interceptTouchEventListener;

    /* renamed from: v2, reason: from kotlin metadata */
    public yz5.l skipsTouchInterceptionListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f105309l2 = jz5.h.b(gc2.e.f270405d);
        this.f105310m2 = -1;
        this.f105312o2 = gc2.d.f270401d;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.horizontalSwipeOptimizationEnabled = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127702fg).getValue()).r()).booleanValue();
        i95.m c18 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        this.f105316s2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127740hg).getValue()).r()).floatValue();
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        this.f105314q2 = viewConfiguration != null ? viewConfiguration.getScaledTouchSlop() : 16;
        this.f105317t2 = new gc2.f(this);
    }

    public static /* synthetic */ void i1(com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
        if ((i17 & 2) != 0) {
            str = "";
        }
        finderRecyclerView.h1(linearLayoutManager, str);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void a1(int i17) {
        if (g1("scrollToPosition", i17)) {
            return;
        }
        super.a1(i17);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void c1(int i17) {
        if (g1("smoothScrollToPosition", i17)) {
            return;
        }
        super.c1(i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if ((r5 != null && r5.getAction() == 1) != false) goto L53;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lf
            yz5.l r0 = r4.interceptTouchEventListener
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r0.invoke(r5)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            kotlin.jvm.internal.o.b(r0, r1)
        Lf:
            boolean r0 = r4.j1()
            if (r0 == 0) goto L47
            if (r5 == 0) goto L24
            int r0 = r5.getAction()
            if (r0 != 0) goto L24
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r5)
            r4.f105313p2 = r0
            goto L47
        L24:
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L31
            int r2 = r5.getAction()
            r3 = 3
            if (r2 != r3) goto L31
            r2 = r0
            goto L32
        L31:
            r2 = r1
        L32:
            if (r2 != 0) goto L40
            if (r5 == 0) goto L3d
            int r2 = r5.getAction()
            if (r2 != r0) goto L3d
            goto L3e
        L3d:
            r0 = r1
        L3e:
            if (r0 == 0) goto L47
        L40:
            gc2.d r0 = gc2.d.f270401d
            r4.f105312o2 = r0
            r0 = 0
            r4.f105313p2 = r0
        L47:
            boolean r5 = super.dispatchTouchEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean g1(java.lang.String str, int i17) {
        java.lang.StackTraceElement[] stackTrace;
        if (((java.lang.Boolean) this.f105309l2.getValue()).booleanValue() && (stackTrace = java.lang.Thread.currentThread().getStackTrace()) != null) {
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                java.lang.String methodName = stackTraceElement.getMethodName();
                kotlin.jvm.internal.o.f(methodName, "getMethodName(...)");
                if (r26.n0.B(methodName, "dispatchStatusBarTop", false)) {
                    com.tencent.mars.xlog.Log.i("FinderRecyclerView", str + ": disable scroll top, position=" + i17 + ", brand=" + android.os.Build.BRAND + ", stack=" + stackTraceElement);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean getHorizontalSwipeOptimizationEnabled() {
        return this.horizontalSwipeOptimizationEnabled;
    }

    public final yz5.l getInterceptTouchEventListener() {
        return this.interceptTouchEventListener;
    }

    public final gc2.h getScrollEventAdapter() {
        gc2.h hVar = this.scrollEventAdapter;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.o.o("scrollEventAdapter");
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getScrollState() {
        return this.f105307j2 ? getScrollEventAdapter().f270414h : super.getScrollState();
    }

    public final yz5.l getSkipsTouchInterceptionListener() {
        return this.skipsTouchInterceptionListener;
    }

    public final void h1(androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, java.lang.String scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        if (linearLayoutManager == null) {
            com.tencent.mars.xlog.Log.e("FinderRecyclerView", "init: params null");
            return;
        }
        if (this.scrollEventAdapter != null) {
            com.tencent.mars.xlog.Log.w("FinderRecyclerView", "init: scrollEventAdapter has init");
            return;
        }
        setLayoutManager(linearLayoutManager);
        setScrollEventAdapter(new gc2.h(this));
        getScrollEventAdapter().f270411e = this.f105317t2;
        i(getScrollEventAdapter());
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            i(new or2.s(getContext().getClass().getSimpleName() + '#' + scene));
        }
        this.f105307j2 = true;
    }

    public final boolean j1() {
        boolean z17;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null && layoutManager.getF123307r()) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
            if ((layoutManager2 == null || layoutManager2.canScrollHorizontally()) ? false : true) {
                z17 = true;
                return !this.horizontalSwipeOptimizationEnabled && z17;
            }
        }
        z17 = false;
        if (this.horizontalSwipeOptimizationEnabled) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        yz5.l lVar;
        android.view.MotionEvent motionEvent2 = this.f105313p2;
        java.lang.Float valueOf = motionEvent2 != null ? java.lang.Float.valueOf(motionEvent2.getX()) : null;
        android.view.MotionEvent motionEvent3 = this.f105313p2;
        java.lang.Float valueOf2 = motionEvent3 != null ? java.lang.Float.valueOf(motionEvent3.getY()) : null;
        if (j1()) {
            if (motionEvent != null && motionEvent.getAction() == 2) {
                if (this.f105312o2 == gc2.d.f270401d && valueOf != null && valueOf2 != null) {
                    double d17 = 2;
                    if (((float) java.lang.Math.sqrt(((float) java.lang.Math.pow(motionEvent.getX() - valueOf.floatValue(), d17)) + ((float) java.lang.Math.pow(motionEvent.getY() - valueOf2.floatValue(), d17)))) > this.f105314q2) {
                        if (!(motionEvent.getY() - valueOf2.floatValue() == 0.0f)) {
                            if (java.lang.Math.abs(motionEvent.getX() - valueOf.floatValue()) / java.lang.Math.abs(motionEvent.getY() - valueOf2.floatValue()) >= this.f105316s2) {
                                this.f105312o2 = gc2.d.f270402e;
                                return false;
                            }
                            this.f105312o2 = gc2.d.f270403f;
                        }
                    }
                }
                if (this.f105312o2 == gc2.d.f270402e) {
                    return false;
                }
            }
        }
        return !((motionEvent == null || (lVar = this.skipsTouchInterceptionListener) == null) ? false : kotlin.jvm.internal.o.b(lVar.invoke(motionEvent), java.lang.Boolean.TRUE)) && super.onInterceptTouchEvent(motionEvent);
    }

    public final void setDeferPageSelectedUntilIdle(boolean z17) {
        if (this.scrollEventAdapter != null) {
            getScrollEventAdapter().f270421r = z17;
        }
    }

    public final void setHorizontalSwipeOptimizationEnabled(boolean z17) {
        this.horizontalSwipeOptimizationEnabled = z17;
    }

    public final void setInterceptTouchEventListener(yz5.l lVar) {
        this.interceptTouchEventListener = lVar;
    }

    public final void setOnInterceptionListener(gc2.b bVar) {
        com.tencent.mars.xlog.Log.i("FinderRecyclerView", "setOnInterceptionListener");
    }

    public final void setPageChangeListener(gc2.c cVar) {
        this.f105308k2 = cVar;
    }

    public final void setScrollEventAdapter(gc2.h hVar) {
        kotlin.jvm.internal.o.g(hVar, "<set-?>");
        this.scrollEventAdapter = hVar;
    }

    public final void setSkipsTouchInterceptionListener(yz5.l lVar) {
        this.skipsTouchInterceptionListener = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f105309l2 = jz5.h.b(gc2.e.f270405d);
        this.f105310m2 = -1;
        this.f105312o2 = gc2.d.f270401d;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.horizontalSwipeOptimizationEnabled = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127702fg).getValue()).r()).booleanValue();
        i95.m c18 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        this.f105316s2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127740hg).getValue()).r()).floatValue();
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        this.f105314q2 = viewConfiguration != null ? viewConfiguration.getScaledTouchSlop() : 16;
        this.f105317t2 = new gc2.f(this);
    }
}
