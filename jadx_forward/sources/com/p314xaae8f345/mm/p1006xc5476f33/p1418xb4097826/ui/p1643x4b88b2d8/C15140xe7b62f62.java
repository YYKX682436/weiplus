package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB#\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/slideprofile/FinderPagerView;", "Landroid/view/ViewGroup;", "Lav2/d;", "onPageScrollListener", "Ljz5/f0;", "setOnPageScrollListener", "Landroid/view/View;", "getTimelineView", "", "g", "I", "getPosition", "()I", "setPosition", "(I)V", "position", "", "h", "Z", "getEnableHorizontallyScroll", "()Z", "setEnableHorizontallyScroll", "(Z)V", "enableHorizontallyScroll", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView */
/* loaded from: classes5.dex */
public final class C15140xe7b62f62 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f211362d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.GestureDetector f211363e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Scroller f211364f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean enableHorizontallyScroll;

    /* renamed from: i, reason: collision with root package name */
    public final av2.f f211367i;

    /* renamed from: m, reason: collision with root package name */
    public int f211368m;

    /* renamed from: n, reason: collision with root package name */
    public int f211369n;

    /* renamed from: o, reason: collision with root package name */
    public int f211370o;

    /* renamed from: p, reason: collision with root package name */
    public int f211371p;

    /* renamed from: q, reason: collision with root package name */
    public int f211372q;

    /* renamed from: r, reason: collision with root package name */
    public float f211373r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.VelocityTracker f211374s;

    /* renamed from: t, reason: collision with root package name */
    public float f211375t;

    /* renamed from: u, reason: collision with root package name */
    public av2.d f211376u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15140xe7b62f62(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = av2.f.f95740a;
        jz5.g gVar = av2.h.f95742a;
        this.f211367i = (av2.f) ((jz5.n) av2.h.f95742a).mo141623x754a37bb();
        this.f211362d = context;
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(int i17, android.view.ViewGroup viewGroup, float f17, float f18) {
        int childCount = viewGroup.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = viewGroup.getChildAt(i18);
            android.graphics.Rect rect = new android.graphics.Rect();
            if ((childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z) childAt).mo57364xc6ea780e(i17, viewGroup, f17, f18) && childAt.getGlobalVisibleRect(rect)) {
                return true;
            }
            if ((childAt instanceof android.view.ViewGroup) && a(i17, (android.view.ViewGroup) childAt, f17, f18)) {
                return true;
            }
        }
        return false;
    }

    public final void b(boolean z17, boolean z18, float f17) {
        if (getWidth() <= 0) {
            return;
        }
        this.f211367i.c(getScrollX(), this.f211371p, getWidth(), z17, this.position, this.f211372q, z18, this.f211373r, f17, d(f17), getChildCount());
    }

    public final void c() {
        this.f211363e = new android.view.GestureDetector(new av2.e(this));
        android.content.Context context = this.f211362d;
        if (context != null) {
            this.f211364f = new android.widget.Scroller(context);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.f211364f;
        if (scroller == null || !scroller.computeScrollOffset()) {
            return;
        }
        scrollTo(scroller.getCurrX(), 0);
        postInvalidate();
        av2.d dVar = this.f211376u;
        if (dVar == null || dVar == null) {
            return;
        }
        ((av2.a) dVar).a((float) ((scroller.getCurrX() * 1.0d) / (getWidth() * 1)), this.position, true);
    }

    public final int d(float f17) {
        float d17 = this.f211367i.d();
        int i17 = (d17 > 0.0f ? 1 : (d17 == 0.0f ? 0 : -1)) > 0 && (java.lang.Math.abs(f17) > d17 ? 1 : (java.lang.Math.abs(f17) == d17 ? 0 : -1)) >= 0 ? f17 < 0.0f ? this.f211372q + 1 : this.f211372q - 1 : this.position;
        int childCount = getChildCount() - 1;
        if (childCount < 0) {
            childCount = 0;
        }
        return e06.p.f(i17, 0, childCount);
    }

    public final void e() {
        android.widget.Scroller scroller = this.f211364f;
        if (scroller != null) {
            int i17 = this.f211368m;
            scroller.startScroll(i17, 0, -i17, 0, this.f211367i.b());
        }
        invalidate();
        av2.d dVar = this.f211376u;
        if (dVar != null) {
            if (dVar != null) {
                ((av2.a) dVar).a(0.0f, 1, false);
            }
            av2.d dVar2 = this.f211376u;
            if (dVar2 != null) {
                ((av2.a) dVar2).b(0);
            }
        }
        this.position = 0;
    }

    public final boolean getEnableHorizontallyScroll() {
        return this.enableHorizontallyScroll;
    }

    public final int getPosition() {
        return this.position;
    }

    /* renamed from: getTimelineView */
    public final android.view.View m60965xb85e0cfc() {
        android.view.View childAt = getChildAt(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
        return childAt;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f211367i.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f211367i.g();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Qb).mo141623x754a37bb()).r()).booleanValue() && this.enableHorizontallyScroll) {
            this.f211367i.e(ev6);
            if (ev6.getAction() == 0) {
                android.view.VelocityTracker velocityTracker = this.f211374s;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                this.f211374s = android.view.VelocityTracker.obtain();
            }
            android.view.VelocityTracker velocityTracker2 = this.f211374s;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(ev6);
            }
            if (ev6.getAction() == 0) {
                this.f211375t = ev6.getX();
            } else if (a((int) (this.f211375t - ev6.getX(0)), this, ev6.getX(), ev6.getY())) {
                return false;
            }
            int action = ev6.getAction();
            if (action == 0) {
                this.f211369n = (int) ev6.getX();
                this.f211370o = (int) ev6.getY();
                this.f211373r = ev6.getX();
                this.f211371p = getScrollX();
                this.f211372q = getWidth() > 0 ? this.f211371p / getWidth() : 0;
                android.view.GestureDetector gestureDetector = this.f211363e;
                if (gestureDetector != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(ev6);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/slideprofile/FinderPagerView", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                    yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/finder/ui/slideprofile/FinderPagerView", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                }
            } else if (action == 2) {
                int x17 = (int) ev6.getX();
                int y17 = (int) ev6.getY();
                double d17 = x17 - this.f211369n;
                if (java.lang.Math.abs(d17) > java.lang.Math.abs(y17 - this.f211370o) && java.lang.Math.abs(d17) > r0.f()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int childCount = getChildCount();
        int i28 = 0;
        while (i28 < childCount) {
            android.view.View childAt = getChildAt(i28);
            int width = getWidth() * i28;
            i28++;
            childAt.layout(width, i18, getWidth() * i28, i27);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            getChildAt(i19).measure(i17, i18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        if (r3 != 3) goto L70;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.C15140xe7b62f62.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setEnableHorizontallyScroll */
    public final void m60966xbe67ec43(boolean z17) {
        this.enableHorizontallyScroll = z17;
    }

    /* renamed from: setOnPageScrollListener */
    public final void m60967x8d8096d1(av2.d dVar) {
        this.f211376u = dVar;
    }

    /* renamed from: setPosition */
    public final void m60968xa32537ab(int i17) {
        this.position = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15140xe7b62f62(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i18 = av2.f.f95740a;
        jz5.g gVar = av2.h.f95742a;
        this.f211367i = (av2.f) ((jz5.n) av2.h.f95742a).mo141623x754a37bb();
        this.f211362d = context;
        c();
    }
}
