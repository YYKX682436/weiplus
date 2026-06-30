package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c;

/* loaded from: classes14.dex */
public class l extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f170440d;

    /* renamed from: e, reason: collision with root package name */
    public int f170441e;

    /* renamed from: f, reason: collision with root package name */
    public int f170442f;

    /* renamed from: g, reason: collision with root package name */
    public int f170443g;

    /* renamed from: h, reason: collision with root package name */
    public int f170444h;

    /* renamed from: i, reason: collision with root package name */
    public int f170445i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.SurfaceTexture f170446m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.Surface f170447n;

    /* renamed from: o, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28537x46552842 f170448o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalFocusChangeListener f170449p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f170450q;

    /* renamed from: r, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameConsumedListener f170451r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f170452s;

    public l(android.content.Context context, android.graphics.SurfaceTexture surfaceTexture) {
        super(context);
        this.f170450q = new java.util.concurrent.atomic.AtomicLong(0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.j(this);
        this.f170451r = jVar;
        this.f170452s = false;
        setWillNotDraw(false);
        if (surfaceTexture instanceof kf.b) {
            kf.b bVar = (kf.b) surfaceTexture;
            bVar.getClass();
            bVar.f388695d = jVar;
        }
        m52740x5cbc5e59(surfaceTexture);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        android.view.Surface surface = this.f170447n;
        if (surface == null) {
            super.draw(canvas);
            io.p3284xd2ae381c.Log.e("PlatformViewWrapper", "Platform view cannot be composed without a surface.");
            return;
        }
        if (!surface.isValid()) {
            io.p3284xd2ae381c.Log.e("PlatformViewWrapper", "Invalid surface. The platform view cannot be displayed.");
            return;
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f170446m;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            io.p3284xd2ae381c.Log.e("PlatformViewWrapper", "Invalid texture. The platform view cannot be displayed.");
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f170450q;
        if (!(i17 != 29 || atomicLong.get() <= 0)) {
            invalidate();
            return;
        }
        if (this.f170452s) {
            android.view.Surface surface2 = this.f170447n;
            if (surface2 != null) {
                surface2.release();
            }
            this.f170447n = new android.view.Surface(this.f170446m);
            this.f170452s = false;
        }
        android.graphics.Canvas lockHardwareCanvas = this.f170447n.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
            if (i17 == 29) {
                atomicLong.incrementAndGet();
            }
        } finally {
            this.f170447n.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    /* renamed from: getBufferHeight */
    public int m52735xd2fb73fd() {
        return this.f170445i;
    }

    /* renamed from: getBufferWidth */
    public int m52736x9c489830() {
        return this.f170444h;
    }

    /* renamed from: getTexture */
    public android.graphics.SurfaceTexture m52737xe94b10e5() {
        return this.f170446m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(android.view.View view, android.view.View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f170448o == null) {
            return super.onTouchEvent(motionEvent);
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i17 = this.f170442f;
            this.f170440d = i17;
            int i18 = this.f170443g;
            this.f170441e = i18;
            matrix.postTranslate(i17, i18);
        } else if (action != 2) {
            matrix.postTranslate(this.f170442f, this.f170443g);
        } else {
            matrix.postTranslate(this.f170440d, this.f170441e);
            this.f170440d = this.f170442f;
            this.f170441e = this.f170443g;
        }
        return this.f170448o.m136976x667eb1da(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    /* renamed from: setLayoutParams */
    public void m52738x183e6d2(android.widget.FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((android.view.ViewGroup.LayoutParams) layoutParams);
        this.f170442f = layoutParams.leftMargin;
        this.f170443g = layoutParams.topMargin;
    }

    /* renamed from: setOnDescendantFocusChangeListener */
    public void m52739xe6831cde(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        android.view.ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f170449p) != null) {
            this.f170449p = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
        android.view.ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f170449p == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k(this, onFocusChangeListener);
            this.f170449p = kVar;
            viewTreeObserver2.addOnGlobalFocusChangeListener(kVar);
        }
    }

    /* renamed from: setTexture */
    public void m52740x5cbc5e59(android.graphics.SurfaceTexture surfaceTexture) {
        int i17;
        this.f170446m = surfaceTexture;
        int i18 = this.f170444h;
        if (i18 > 0 && (i17 = this.f170445i) > 0) {
            surfaceTexture.setDefaultBufferSize(i18, i17);
        }
        android.view.Surface surface = this.f170447n;
        if (surface != null) {
            surface.release();
        }
        android.view.Surface surface2 = new android.view.Surface(surfaceTexture);
        this.f170447n = surface2;
        android.graphics.Canvas lockHardwareCanvas = surface2.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            if (android.os.Build.VERSION.SDK_INT == 29) {
                this.f170450q.incrementAndGet();
            }
        } finally {
            this.f170447n.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    /* renamed from: setTouchProcessor */
    public void m52741x6867915(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28537x46552842 c28537x46552842) {
        this.f170448o = c28537x46552842;
    }
}
