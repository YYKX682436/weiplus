package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderInterceptHorizontalLinearLayout;", "Landroid/widget/LinearLayout;", "", "d", "Ljz5/g;", "getSeekAreaReturnOpt", "()Z", "seekAreaReturnOpt", "g", "Z", "isHorizontalEvent", "setHorizontalEvent", "(Z)V", "Lcom/tencent/mm/plugin/finder/view/gs;", "h", "Lcom/tencent/mm/plugin/finder/view/gs;", "getOnInterceptTouchEventCallback", "()Lcom/tencent/mm/plugin/finder/view/gs;", "setOnInterceptTouchEventCallback", "(Lcom/tencent/mm/plugin/finder/view/gs;)V", "onInterceptTouchEventCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderInterceptHorizontalLinearLayout */
/* loaded from: classes2.dex */
public final class C15180x393a0b2f extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g seekAreaReturnOpt;

    /* renamed from: e, reason: collision with root package name */
    public int f212107e;

    /* renamed from: f, reason: collision with root package name */
    public int f212108f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isHorizontalEvent;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gs onInterceptTouchEventCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15180x393a0b2f(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.seekAreaReturnOpt = jz5.h.b(cw2.y2.f305648d);
        this.f212107e = -1;
        this.f212108f = -1;
    }

    /* renamed from: getSeekAreaReturnOpt */
    private final boolean m61300xf3f87508() {
        return ((java.lang.Boolean) this.seekAreaReturnOpt.mo141623x754a37bb()).booleanValue();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gs getOnInterceptTouchEventCallback() {
        return this.onInterceptTouchEventCallback;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f212107e = -1;
        this.f212108f = -1;
        this.isHorizontalEvent = false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try intercept, ev: ");
        sb6.append(motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null);
        sb6.append(", x: ");
        sb6.append(motionEvent != null ? java.lang.Float.valueOf(motionEvent.getX()) : null);
        sb6.append(", y: ");
        sb6.append(motionEvent != null ? java.lang.Float.valueOf(motionEvent.getY()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderInterceptHorizontalLinearLayout", sb6.toString());
        if (motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (m61300xf3f87508()) {
            android.content.Context context = getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context : null;
            if (abstractActivityC15087xee12defa != null && (m78735x28280f95 = abstractActivityC15087xee12defa.m78735x28280f95()) != null) {
                m78735x28280f95.m81455x782e547b(true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gs gsVar = this.onInterceptTouchEventCallback;
        if (gsVar != null && gsVar.a(motionEvent)) {
            this.isHorizontalEvent = true;
            return true;
        }
        if (motionEvent.getAction() == 0) {
            this.f212107e = (int) motionEvent.getX();
            this.f212108f = (int) motionEvent.getY();
            this.isHorizontalEvent = false;
            return super.onInterceptTouchEvent(motionEvent);
        }
        float x17 = motionEvent.getX();
        float f17 = x17 - this.f212107e;
        float y17 = motionEvent.getY() - this.f212108f;
        float sqrt = (float) java.lang.Math.sqrt((f17 * f17) + (y17 * y17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderInterceptHorizontalLinearLayout", "intercept dis: " + sqrt);
        if (sqrt <= 4.0f || this.f212107e == -1 || this.f212108f == -1) {
            this.f212107e = (int) motionEvent.getX();
            this.f212108f = (int) motionEvent.getY();
            return super.onInterceptTouchEvent(motionEvent);
        }
        float abs = java.lang.Math.abs(motionEvent.getX() - this.f212107e);
        float abs2 = java.lang.Math.abs(motionEvent.getY() - this.f212108f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209323kb).mo141623x754a37bb()).r()).intValue();
        if (intValue < 1) {
            intValue = 1;
        }
        boolean z17 = abs > abs2 / ((float) intValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderInterceptHorizontalLinearLayout", "intercept success, ev: " + motionEvent.getAction() + ", ret: " + z17);
        if (z17) {
            this.isHorizontalEvent = true;
        }
        this.f212107e = -1;
        this.f212108f = -1;
        return z17;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (android.os.Build.VERSION.SDK_INT < 29 || !m61300xf3f87508()) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.set(0, 0, 100, getHeight());
        setSystemGestureExclusionRects(kz5.b0.c(rect));
    }

    /* renamed from: setHorizontalEvent */
    public final void m61302x598c5814(boolean z17) {
        this.isHorizontalEvent = z17;
    }

    /* renamed from: setOnInterceptTouchEventCallback */
    public final void m61303xc21b09c1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gs gsVar) {
        this.onInterceptTouchEventCallback = gsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15180x393a0b2f(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.seekAreaReturnOpt = jz5.h.b(cw2.y2.f305648d);
        this.f212107e = -1;
        this.f212108f = -1;
    }
}
