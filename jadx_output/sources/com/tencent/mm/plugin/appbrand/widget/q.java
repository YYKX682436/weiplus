package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public class q extends android.widget.FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.LinkedList f91848m = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.profile.a f91849d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.p f91850e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.f0 f91851f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f91852g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f91853h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f91854i;

    public q(android.content.Context context) {
        super((context == null || context.getApplicationContext() == null) ? com.tencent.mm.sdk.platformtools.x2.f193071a : context.getApplicationContext());
        this.f91850e = new com.tencent.mm.plugin.appbrand.widget.p(this);
        this.f91851f = null;
        this.f91854i = new java.util.HashSet();
        setWillNotDraw(false);
        this.f91849d = (com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true);
    }

    public void a(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (!com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.widget.n(this, runnable));
        } else if (getAnimation() == null) {
            runnable.run();
        } else {
            ((java.util.HashSet) this.f91854i).add(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        if (willNotDraw()) {
            return;
        }
        try {
            super.dispatchDraw(canvas);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.AppBrandRuntimeFrameLayout", e17, "", new java.lang.Object[0]);
            boolean z17 = e17 instanceof java.lang.NullPointerException;
            com.tencent.mm.plugin.appbrand.profile.a aVar = this.f91849d;
            if (z17) {
                ((ch1.c) aVar).c(1088L, 0L, 1L, false);
                throw e17;
            }
            ((ch1.c) aVar).c(1088L, 1L, 1L, false);
            throw e17;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View view;
        return (!this.f91852g || (view = this.f91853h) == null) ? super.dispatchTouchEvent(motionEvent) : view.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        java.util.Set set = this.f91854i;
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        ((java.util.HashSet) set).clear();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.content.Context context = getContext();
        com.tencent.mm.plugin.appbrand.widget.p pVar = this.f91850e;
        com.tencent.mm.plugin.appbrand.widget.o oVar = pVar.f91778a;
        if (oVar != null) {
            float[] a17 = oVar.a(context);
            android.graphics.Rect rect = pVar.f91779b;
            rect.setEmpty();
            pVar.f91782e.getGlobalVisibleRect(rect);
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, rect.right - rect.left, rect.bottom - rect.top);
            android.graphics.RectF rectF2 = pVar.f91780c;
            rectF2.setEmpty();
            rectF2.left = 0.0f;
            rectF2.top = 0.0f;
            rectF2.right = rect.right - rect.left;
            rectF2.bottom = rect.bottom - rect.top;
            android.graphics.Path path = pVar.f91781d;
            path.rewind();
            path.addRoundRect(rectF, a17, android.graphics.Path.Direction.CW);
            path.close();
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var = this.f91851f;
        if (f0Var != null) {
            f0Var.V(i17, i18, i19, i27);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeFrameLayout", "onViewRemoved %s", view);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        android.util.Log.getStackTraceString(new java.lang.Throwable());
        super.removeAllViews();
    }

    public void setRoundCornerProvider(com.tencent.mm.plugin.appbrand.widget.o oVar) {
        this.f91850e.f91778a = oVar;
    }

    public void setWxaHalfScreenGestureController(com.tencent.mm.plugin.appbrand.widget.f0 f0Var) {
        this.f91851f = f0Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new android.widget.FrameLayout.LayoutParams(-1, -1);
    }
}
