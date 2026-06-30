package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* loaded from: classes7.dex */
public class q extends android.widget.FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.LinkedList f173381m = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a f173382d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p f173383e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f173384f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f173385g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f173386h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f173387i;

    public q(android.content.Context context) {
        super((context == null || context.getApplicationContext() == null) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context.getApplicationContext());
        this.f173383e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p(this);
        this.f173384f = null;
        this.f173387i = new java.util.HashSet();
        setWillNotDraw(false);
        this.f173382d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true);
    }

    public void a(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.n(this, runnable));
        } else if (getAnimation() == null) {
            runnable.run();
        } else {
            ((java.util.HashSet) this.f173387i).add(runnable);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.AppBrandRuntimeFrameLayout", e17, "", new java.lang.Object[0]);
            boolean z17 = e17 instanceof java.lang.NullPointerException;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a aVar = this.f173382d;
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
        return (!this.f173385g || (view = this.f173386h) == null) ? super.dispatchTouchEvent(motionEvent) : view.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        java.util.Set set = this.f173387i;
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        ((java.util.HashSet) set).clear();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p pVar = this.f173383e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.o oVar = pVar.f173311a;
        if (oVar != null) {
            float[] a17 = oVar.a(context);
            android.graphics.Rect rect = pVar.f173312b;
            rect.setEmpty();
            pVar.f173315e.getGlobalVisibleRect(rect);
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, rect.right - rect.left, rect.bottom - rect.top);
            android.graphics.RectF rectF2 = pVar.f173313c;
            rectF2.setEmpty();
            rectF2.left = 0.0f;
            rectF2.top = 0.0f;
            rectF2.right = rect.right - rect.left;
            rectF2.bottom = rect.bottom - rect.top;
            android.graphics.Path path = pVar.f173314d;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var = this.f173384f;
        if (f0Var != null) {
            f0Var.V(i17, i18, i19, i27);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeFrameLayout", "onViewRemoved %s", view);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        android.util.Log.getStackTraceString(new java.lang.Throwable());
        super.removeAllViews();
    }

    /* renamed from: setRoundCornerProvider */
    public void m53607x7b4800d2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.o oVar) {
        this.f173383e.f173311a = oVar;
    }

    /* renamed from: setWxaHalfScreenGestureController */
    public void m53608x1e535048(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var) {
        this.f173384f = f0Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new android.widget.FrameLayout.LayoutParams(-1, -1);
    }
}
