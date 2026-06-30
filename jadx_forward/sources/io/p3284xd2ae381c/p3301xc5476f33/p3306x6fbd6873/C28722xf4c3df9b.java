package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.PlatformViewWrapper */
/* loaded from: classes14.dex */
public class C28722xf4c3df9b extends android.widget.FrameLayout {
    private static final java.lang.String TAG = "PlatformViewWrapper";

    /* renamed from: activeFocusListener */
    private android.view.ViewTreeObserver.OnGlobalFocusChangeListener f71797x421af046;

    /* renamed from: left */
    private int f71798x32a007;

    /* renamed from: prevLeft */
    private int f71799xb40664da;

    /* renamed from: prevTop */
    private int f71800xed089622;

    /* renamed from: renderTarget */
    private io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf f71801x2ce096c7;
    private int top;

    /* renamed from: touchProcessor */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28537x46552842 f71802x4ff84413;

    public C28722xf4c3df9b(android.content.Context context) {
        super(context);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf = this.f71801x2ce096c7;
        if (interfaceC28721xe81de0bf == null) {
            super.draw(canvas);
            io.p3284xd2ae381c.Log.e(TAG, "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        android.view.Surface mo53764xcf572877 = interfaceC28721xe81de0bf.mo53764xcf572877();
        if (!mo53764xcf572877.isValid()) {
            io.p3284xd2ae381c.Log.e(TAG, "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        android.graphics.Canvas lockHardwareCanvas = mo53764xcf572877.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        } finally {
            this.f71801x2ce096c7.mo138698x62a02d16();
            mo53764xcf572877.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    /* renamed from: getActiveFocusListener */
    public android.view.ViewTreeObserver.OnGlobalFocusChangeListener m138699x9a4acd10() {
        return this.f71797x421af046;
    }

    /* renamed from: getRenderTargetHeight */
    public int m138700x9e8a04c4() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf = this.f71801x2ce096c7;
        if (interfaceC28721xe81de0bf != null) {
            return interfaceC28721xe81de0bf.mo53762x1c4fb41d();
        }
        return 0;
    }

    /* renamed from: getRenderTargetWidth */
    public int m138701x81d15289() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf = this.f71801x2ce096c7;
        if (interfaceC28721xe81de0bf != null) {
            return interfaceC28721xe81de0bf.mo53765x755bd410();
        }
        return 0;
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
        if (this.f71802x4ff84413 == null) {
            return super.onTouchEvent(motionEvent);
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i17 = this.f71798x32a007;
            this.f71799xb40664da = i17;
            int i18 = this.top;
            this.f71800xed089622 = i18;
            matrix.postTranslate(i17, i18);
        } else if (action != 2) {
            matrix.postTranslate(this.f71798x32a007, this.top);
        } else {
            matrix.postTranslate(this.f71799xb40664da, this.f71800xed089622);
            this.f71799xb40664da = this.f71798x32a007;
            this.f71800xed089622 = this.top;
        }
        return this.f71802x4ff84413.m136976x667eb1da(motionEvent, matrix);
    }

    /* renamed from: release */
    public void m138702x41012807() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf = this.f71801x2ce096c7;
        if (interfaceC28721xe81de0bf != null) {
            interfaceC28721xe81de0bf.mo53767x41012807();
            this.f71801x2ce096c7 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    /* renamed from: resizeRenderTarget */
    public void m138703x7f90199b(int i17, int i18) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf = this.f71801x2ce096c7;
        if (interfaceC28721xe81de0bf != null) {
            interfaceC28721xe81de0bf.mo53768xc84d9cb4(i17, i18);
        }
    }

    /* renamed from: setLayoutParams */
    public void m138704x183e6d2(android.widget.FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams((android.view.ViewGroup.LayoutParams) layoutParams);
        this.f71798x32a007 = layoutParams.leftMargin;
        this.top = layoutParams.topMargin;
    }

    /* renamed from: setOnDescendantFocusChangeListener */
    public void m138705xe6831cde(final android.view.View.OnFocusChangeListener onFocusChangeListener) {
        m138707x388a4537();
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f71797x421af046 == null) {
            android.view.ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new android.view.ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: io.flutter.plugin.platform.PlatformViewWrapper.1
                @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
                public void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
                    android.view.View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                    io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b c28722xf4c3df9b = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28722xf4c3df9b.this;
                    onFocusChangeListener2.onFocusChange(c28722xf4c3df9b, io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.m139425x7337df9a(c28722xf4c3df9b));
                }
            };
            this.f71797x421af046 = onGlobalFocusChangeListener;
            viewTreeObserver.addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    /* renamed from: setTouchProcessor */
    public void m138706x6867915(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28537x46552842 c28537x46552842) {
        this.f71802x4ff84413 = c28537x46552842;
    }

    /* renamed from: unsetOnDescendantFocusChangeListener */
    public void m138707x388a4537() {
        android.view.ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f71797x421af046) == null) {
            return;
        }
        this.f71797x421af046 = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    public C28722xf4c3df9b(android.content.Context context, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf) {
        this(context);
        this.f71801x2ce096c7 = interfaceC28721xe81de0bf;
        android.view.Surface mo53764xcf572877 = interfaceC28721xe81de0bf.mo53764xcf572877();
        if (mo53764xcf572877 == null || io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.f71171xd0ff0b55) {
            return;
        }
        android.graphics.Canvas lockHardwareCanvas = mo53764xcf572877.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        } finally {
            mo53764xcf572877.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }
}
