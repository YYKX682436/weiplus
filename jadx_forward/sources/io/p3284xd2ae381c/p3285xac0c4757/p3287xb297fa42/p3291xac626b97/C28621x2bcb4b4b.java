package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97;

/* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView */
/* loaded from: classes14.dex */
public class C28621x2bcb4b4b extends android.widget.FrameLayout {

    /* renamed from: activeFocusListener */
    android.view.ViewTreeObserver.OnGlobalFocusChangeListener f71132x421af046;

    /* renamed from: androidTouchProcessor */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28537x46552842 f71133xd973d862;

    /* renamed from: left */
    private int f71134x32a007;

    /* renamed from: mutatorsStack */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db f71135xaa9f7b77;

    /* renamed from: paint */
    private android.graphics.Paint f71136x657f85e;

    /* renamed from: prevLeft */
    private int f71137xb40664da;

    /* renamed from: prevTop */
    private int f71138xed089622;

    /* renamed from: screenDensity */
    private float f71139xaee65adc;
    private int top;

    public C28621x2bcb4b4b(android.content.Context context, float f17, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28537x46552842 c28537x46552842) {
        super(context, null);
        this.f71139xaee65adc = f17;
        this.f71133xd973d862 = c28537x46552842;
        this.f71136x657f85e = new android.graphics.Paint();
    }

    /* renamed from: getPlatformViewMatrix */
    private android.graphics.Matrix m137960x82c0618f() {
        android.graphics.Matrix matrix = new android.graphics.Matrix(this.f71135xaa9f7b77.m137965x4ae21ba1());
        float f17 = this.f71139xaee65adc;
        matrix.preScale(1.0f / f17, 1.0f / f17);
        matrix.postTranslate(-this.f71134x32a007, -this.top);
        return matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        canvas.save();
        canvas.concat(m137960x82c0618f());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        canvas.save();
        java.util.Iterator<android.graphics.Path> it = this.f71135xaa9f7b77.m137964x43473d6c().iterator();
        while (it.hasNext()) {
            android.graphics.Path path = new android.graphics.Path(it.next());
            path.offset(-this.f71134x32a007, -this.top);
            canvas.clipPath(path);
        }
        if (this.f71136x657f85e.getAlpha() != ((int) (this.f71135xaa9f7b77.m137966x93b3f02b() * 255.0f))) {
            this.f71136x657f85e.setAlpha((int) (this.f71135xaa9f7b77.m137966x93b3f02b() * 255.0f));
            setLayerType(2, this.f71136x657f85e);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f71133xd973d862 == null) {
            return super.onTouchEvent(motionEvent);
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i17 = this.f71134x32a007;
            this.f71137xb40664da = i17;
            int i18 = this.top;
            this.f71138xed089622 = i18;
            matrix.postTranslate(i17, i18);
        } else if (action != 2) {
            matrix.postTranslate(this.f71134x32a007, this.top);
        } else {
            matrix.postTranslate(this.f71137xb40664da, this.f71138xed089622);
            this.f71137xb40664da = this.f71134x32a007;
            this.f71138xed089622 = this.top;
        }
        return this.f71133xd973d862.m136976x667eb1da(motionEvent, matrix);
    }

    /* renamed from: readyToDisplay */
    public void m137961xb0c5df64(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db c28622x9672b4db, int i17, int i18, int i19, int i27) {
        this.f71135xaa9f7b77 = c28622x9672b4db;
        this.f71134x32a007 = i17;
        this.top = i18;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i19, i27);
        layoutParams.leftMargin = i17;
        layoutParams.topMargin = i18;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    /* renamed from: setOnDescendantFocusChangeListener */
    public void m137962xe6831cde(final android.view.View.OnFocusChangeListener onFocusChangeListener) {
        m137963x388a4537();
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f71132x421af046 == null) {
            android.view.ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new android.view.ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView.1
                @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
                public void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
                    android.view.View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                    android.view.View view3 = this;
                    onFocusChangeListener2.onFocusChange(view3, io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.m139425x7337df9a(view3));
                }
            };
            this.f71132x421af046 = onGlobalFocusChangeListener;
            viewTreeObserver.addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    /* renamed from: unsetOnDescendantFocusChangeListener */
    public void m137963x388a4537() {
        android.view.ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f71132x421af046) == null) {
            return;
        }
        this.f71132x421af046 = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    public C28621x2bcb4b4b(android.content.Context context) {
        this(context, 1.0f, null);
    }
}
