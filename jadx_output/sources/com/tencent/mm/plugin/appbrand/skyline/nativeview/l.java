package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes14.dex */
public class l extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f88907d;

    /* renamed from: e, reason: collision with root package name */
    public int f88908e;

    /* renamed from: f, reason: collision with root package name */
    public int f88909f;

    /* renamed from: g, reason: collision with root package name */
    public int f88910g;

    /* renamed from: h, reason: collision with root package name */
    public int f88911h;

    /* renamed from: i, reason: collision with root package name */
    public int f88912i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.SurfaceTexture f88913m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.Surface f88914n;

    /* renamed from: o, reason: collision with root package name */
    public io.flutter.embedding.android.AndroidTouchProcessor f88915o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalFocusChangeListener f88916p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f88917q;

    /* renamed from: r, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry.OnFrameConsumedListener f88918r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f88919s;

    public l(android.content.Context context, android.graphics.SurfaceTexture surfaceTexture) {
        super(context);
        this.f88917q = new java.util.concurrent.atomic.AtomicLong(0L);
        com.tencent.mm.plugin.appbrand.skyline.nativeview.j jVar = new com.tencent.mm.plugin.appbrand.skyline.nativeview.j(this);
        this.f88918r = jVar;
        this.f88919s = false;
        setWillNotDraw(false);
        if (surfaceTexture instanceof kf.b) {
            kf.b bVar = (kf.b) surfaceTexture;
            bVar.getClass();
            bVar.f307162d = jVar;
        }
        setTexture(surfaceTexture);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        android.view.Surface surface = this.f88914n;
        if (surface == null) {
            super.draw(canvas);
            io.flutter.Log.e("PlatformViewWrapper", "Platform view cannot be composed without a surface.");
            return;
        }
        if (!surface.isValid()) {
            io.flutter.Log.e("PlatformViewWrapper", "Invalid surface. The platform view cannot be displayed.");
            return;
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f88913m;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            io.flutter.Log.e("PlatformViewWrapper", "Invalid texture. The platform view cannot be displayed.");
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f88917q;
        if (!(i17 != 29 || atomicLong.get() <= 0)) {
            invalidate();
            return;
        }
        if (this.f88919s) {
            android.view.Surface surface2 = this.f88914n;
            if (surface2 != null) {
                surface2.release();
            }
            this.f88914n = new android.view.Surface(this.f88913m);
            this.f88919s = false;
        }
        android.graphics.Canvas lockHardwareCanvas = this.f88914n.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
            if (i17 == 29) {
                atomicLong.incrementAndGet();
            }
        } finally {
            this.f88914n.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public int getBufferHeight() {
        return this.f88912i;
    }

    public int getBufferWidth() {
        return this.f88911h;
    }

    public android.graphics.SurfaceTexture getTexture() {
        return this.f88913m;
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
        if (this.f88915o == null) {
            return super.onTouchEvent(motionEvent);
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i17 = this.f88909f;
            this.f88907d = i17;
            int i18 = this.f88910g;
            this.f88908e = i18;
            matrix.postTranslate(i17, i18);
        } else if (action != 2) {
            matrix.postTranslate(this.f88909f, this.f88910g);
        } else {
            matrix.postTranslate(this.f88907d, this.f88908e);
            this.f88907d = this.f88909f;
            this.f88908e = this.f88910g;
        }
        return this.f88915o.onTouchEvent(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(android.widget.FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((android.view.ViewGroup.LayoutParams) layoutParams);
        this.f88909f = layoutParams.leftMargin;
        this.f88910g = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        android.view.ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f88916p) != null) {
            this.f88916p = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
        android.view.ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f88916p == null) {
            com.tencent.mm.plugin.appbrand.skyline.nativeview.k kVar = new com.tencent.mm.plugin.appbrand.skyline.nativeview.k(this, onFocusChangeListener);
            this.f88916p = kVar;
            viewTreeObserver2.addOnGlobalFocusChangeListener(kVar);
        }
    }

    public void setTexture(android.graphics.SurfaceTexture surfaceTexture) {
        int i17;
        this.f88913m = surfaceTexture;
        int i18 = this.f88911h;
        if (i18 > 0 && (i17 = this.f88912i) > 0) {
            surfaceTexture.setDefaultBufferSize(i18, i17);
        }
        android.view.Surface surface = this.f88914n;
        if (surface != null) {
            surface.release();
        }
        android.view.Surface surface2 = new android.view.Surface(surfaceTexture);
        this.f88914n = surface2;
        android.graphics.Canvas lockHardwareCanvas = surface2.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            if (android.os.Build.VERSION.SDK_INT == 29) {
                this.f88917q.incrementAndGet();
            }
        } finally {
            this.f88914n.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public void setTouchProcessor(io.flutter.embedding.android.AndroidTouchProcessor androidTouchProcessor) {
        this.f88915o = androidTouchProcessor;
    }
}
