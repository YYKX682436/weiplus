package com.p314xaae8f345.p2926x359365.ui;

/* renamed from: com.tencent.rtmp.ui.TXCloudVideoView */
/* loaded from: classes14.dex */
public class ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf extends android.widget.FrameLayout implements android.view.ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: FOCUS_AREA_SIZE_IN_DP */
    private static final int f46605x71dbf193 = 70;

    /* renamed from: mCallback */
    private java.lang.ref.WeakReference<com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.b> f46606x1ab9c7d2;

    /* renamed from: mDashMargin */
    private final android.graphics.Rect f46607x2770e42d;

    /* renamed from: mDashboard */
    private final com.p314xaae8f345.p2926x359365.ui.C25490x38fd0a74 f46608x3c4234a7;

    /* renamed from: mDelayedTapRunnable */
    private final com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.a f46609x2c00e46b;

    /* renamed from: mDeprecatedTextureViewSet */
    private final java.util.HashSet<android.view.TextureView> f46610x70f45402;

    /* renamed from: mEnableShowLog */
    private boolean f46611x18ffe497;

    /* renamed from: mEnableTouchToFocus */
    private boolean f46612xd95ab74e;

    /* renamed from: mEnableZoom */
    private boolean f46613x4d0d3c43;

    /* renamed from: mFocusIndicatorView */
    private com.p314xaae8f345.p2926x359365.ui.C25491x98f9037c f46614x2a84a2a9;

    /* renamed from: mGLContext */
    protected java.lang.Object f46615x9509133d;

    /* renamed from: mHideIndicatorViewRunnable */
    private final java.lang.Runnable f46616x27e3e482;

    /* renamed from: mLastScaleFactor */
    private float f46617x9eb3a96;

    /* renamed from: mScaleFactor */
    private float f46618x61eb608c;

    /* renamed from: mScaleGestureDetector */
    private android.view.ScaleGestureDetector f46619xc13eed92;

    /* renamed from: mSurface */
    private java.lang.ref.WeakReference<android.view.Surface> f46620x2fa29f80;

    /* renamed from: mSurfaceView */
    private final java.lang.ref.WeakReference<android.view.SurfaceView> f46621x566f8e45;

    /* renamed from: mTAG */
    private final java.lang.String f46622x32cfed;

    /* renamed from: mTopTextureView */
    private android.view.TextureView f46623xeb54b798;

    /* renamed from: mUserId */
    private java.lang.String f46624x1d975513;

    /* renamed from: mVideoViewSetByUser */
    private android.view.TextureView f46625x41f9a531;

    /* renamed from: mViewEventListener */
    private com.p314xaae8f345.p2926x359365.ui.InterfaceC25489xb6bd843a f46626xcfc111dc;

    /* renamed from: com.tencent.rtmp.ui.TXCloudVideoView$b */
    /* loaded from: classes14.dex */
    public interface b {
        /* renamed from: onShowLog */
        void mo29784xcade1428(boolean z17);
    }

    public ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf(android.content.Context context) {
        this(context, null, null);
    }

    /* renamed from: addViewInternal */
    private void m94598x8c12d3c3(android.view.TextureView textureView) {
        if (textureView == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f46622x32cfed, "addViewInternal,TextureView is null.");
            return;
        }
        if (textureView.getParent() == null) {
            addView(textureView);
            m94615x836d1ef4();
        } else if (textureView.getParent() == this) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f46622x32cfed, "view has been added.");
        } else {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f46622x32cfed, "view has been added to other parent view. parent=" + textureView.getParent());
        }
        this.f46610x70f45402.remove(textureView);
    }

    /* renamed from: getTextureViewSetByUser */
    private android.view.TextureView m94599xc29e49ba() {
        return this.f46625x41f9a531;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideIndicatorView */
    public void m94600x9c283b32() {
        com.p314xaae8f345.p2926x359365.ui.C25491x98f9037c c25491x98f9037c = this.f46614x2a84a2a9;
        if (c25491x98f9037c != null) {
            c25491x98f9037c.setVisibility(8);
        }
    }

    /* renamed from: isShowLogEnabled */
    private boolean m94601x2d387204() {
        return this.f46611x18ffe497;
    }

    /* renamed from: px2dip */
    private static int m94604xc5d20921(android.content.Context context, float f17) {
        return (int) ((f17 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: removeDeprecatedViews */
    private void m94605xbed28357(android.view.TextureView textureView) {
        java.util.Iterator<android.view.TextureView> it = this.f46610x70f45402.iterator();
        while (it.hasNext()) {
            android.view.TextureView next = it.next();
            if (next != null && next != textureView) {
                try {
                    removeView(next);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f46622x32cfed, "removeView view error: ", e17);
                }
                it.remove();
            }
        }
        m94615x836d1ef4();
    }

    /* renamed from: removeViewInternal */
    private void m94606xad449726(android.view.TextureView textureView, boolean z17) {
        if (textureView == null) {
            return;
        }
        if (z17) {
            try {
                removeView(textureView);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f46622x32cfed, "removeView view error: ", e17);
            }
            m94615x836d1ef4();
            this.f46610x70f45402.remove(textureView);
            return;
        }
        if (textureView.getParent() == this) {
            m94605xbed28357(textureView);
            this.f46610x70f45402.add(textureView);
        } else if (textureView.getParent() == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f46622x32cfed, "current view has been removed from the parent view. view=".concat(java.lang.String.valueOf(textureView)));
        } else if (textureView.getParent() != this) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f46622x32cfed, "current view is not a child view of this view. parent=" + textureView.getParent());
        }
    }

    /* renamed from: repositionDashBoard */
    private void m94607x36b47d78() {
        try {
            removeView(this.f46608x3c4234a7);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f46622x32cfed, "removeView dashboard view error: ", e17);
        }
        addView(this.f46608x3c4234a7);
    }

    /* renamed from: setAndroidViewEventListener */
    private void m94608x16c8ba9c(com.p314xaae8f345.p2926x359365.ui.InterfaceC25489xb6bd843a interfaceC25489xb6bd843a) {
        this.f46626xcfc111dc = interfaceC25489xb6bd843a;
    }

    /* renamed from: setBackgroundColorForInternalView */
    private void m94609xb5d57d8(int i17) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f46622x32cfed, "setBackgroundColorForInternalView color:".concat(java.lang.String.valueOf(i17)));
        if (this.f46620x2fa29f80 == null && this.f46621x566f8e45 == null) {
            int i18 = (i17 >> 16) & 255;
            post(com.p314xaae8f345.p2926x359365.ui.b.a(this, i17 & 255, (i17 >> 24) & 255, i18, (i17 >> 8) & 255));
        }
    }

    /* renamed from: setShowLogCallback */
    private void m94610xfa230baa(java.lang.ref.WeakReference<com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.b> weakReference) {
        this.f46606x1ab9c7d2 = weakReference;
    }

    /* renamed from: setTouchToFocusEnabled */
    private void m94611xc787dac1(boolean z17) {
        this.f46612xd95ab74e = z17;
    }

    /* renamed from: setZoomEnabled */
    private void m94612xd8e5562c(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f46622x32cfed, "setZoomEnabled: ".concat(java.lang.String.valueOf(z17)));
        this.f46613x4d0d3c43 = z17;
    }

    /* renamed from: showFocusView */
    private void m94613x3ada2920(int i17, int i18, int i19, int i27) {
        post(com.p314xaae8f345.p2926x359365.ui.c.a(this, i17, i18, i19, i27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showFocusViewInternal */
    public void m94614x650933fd(int i17, int i18, int i19, int i27) {
        if ((i19 != 0 && i19 != getWidth()) || (i27 != 0 && i27 != getHeight())) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f46622x32cfed, "ignore show indicator view when view size changed");
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.v(this.f46622x32cfed, "show indicator view at (%d,%d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        removeCallbacks(this.f46616x27e3e482);
        int i28 = (int) ((getResources().getDisplayMetrics().density * 70.0f) + 0.5f);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i28, i28);
        int i29 = i28 / 2;
        layoutParams.leftMargin = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a(i17 - i29, 0, getWidth() - i28);
        layoutParams.topMargin = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a(i18 - i29, 0, getHeight() - i28);
        android.view.View view = this.f46614x2a84a2a9;
        if (view == null) {
            com.p314xaae8f345.p2926x359365.ui.C25491x98f9037c c25491x98f9037c = new com.p314xaae8f345.p2926x359365.ui.C25491x98f9037c(getContext());
            this.f46614x2a84a2a9 = c25491x98f9037c;
            addView(c25491x98f9037c, layoutParams);
        } else if (indexOfChild(view) != getChildCount() - 1) {
            try {
                removeView(this.f46614x2a84a2a9);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f46622x32cfed, "removeView focus indicator view error: ", e17);
            }
            addView(this.f46614x2a84a2a9, layoutParams);
        } else {
            this.f46614x2a84a2a9.setLayoutParams(layoutParams);
        }
        this.f46614x2a84a2a9.setVisibility(0);
        com.p314xaae8f345.p2926x359365.ui.C25491x98f9037c c25491x98f9037c2 = this.f46614x2a84a2a9;
        c25491x98f9037c2.startAnimation(c25491x98f9037c2.f296810a);
        postDelayed(this.f46616x27e3e482, java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
    }

    /* renamed from: updateTopTextureView */
    private void m94615x836d1ef4() {
        android.view.TextureView textureView;
        int childCount = getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                textureView = null;
                break;
            }
            android.view.View childAt = getChildAt(childCount);
            if (childAt instanceof android.view.TextureView) {
                textureView = (android.view.TextureView) childAt;
                break;
            }
            childCount--;
        }
        if (this.f46623xeb54b798 != textureView) {
            this.f46623xeb54b798 = textureView;
        }
    }

    /* renamed from: addVideoView */
    public void mo46533x473bda1f(android.view.TextureView textureView) {
        m94606xad449726(this.f46625x41f9a531, true);
        m94598x8c12d3c3(textureView);
        this.f46625x41f9a531 = textureView;
        m94607x36b47d78();
    }

    /* renamed from: clearLastFrame */
    public void m94616x228f84aa(boolean z17) {
        if (z17) {
            setVisibility(8);
        }
    }

    /* renamed from: clearLog */
    public void m94617x2f1ab5b7() {
        com.p314xaae8f345.p2926x359365.ui.C25490x38fd0a74 c25490x38fd0a74 = this.f46608x3c4234a7;
        if (c25490x38fd0a74 != null) {
            c25490x38fd0a74.f296803a.setLength(0);
            android.widget.TextView textView = c25490x38fd0a74.f296804b;
            if (textView != null) {
                textView.setText("");
            }
            android.widget.TextView textView2 = c25490x38fd0a74.f296805c;
            if (textView2 != null) {
                textView2.setText("");
            }
        }
    }

    /* renamed from: disableLog */
    public void m94618x9f813f3c(boolean z17) {
    }

    @java.lang.Deprecated
    /* renamed from: getHWVideoView */
    public android.view.TextureView m94619x229a845b() {
        return mo46536x4ee17f0a();
    }

    /* renamed from: getOpenGLContext */
    public java.lang.Object m94620xcd74f24a() {
        return this.f46615x9509133d;
    }

    /* renamed from: getSurface */
    public android.view.Surface m94621xcf572877() {
        java.lang.ref.WeakReference<android.view.Surface> weakReference = this.f46620x2fa29f80;
        if (weakReference == null) {
            return null;
        }
        android.view.Surface surface = weakReference.get();
        if (surface == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f46622x32cfed, "surface is null.");
        }
        return surface;
    }

    /* renamed from: getSurfaceView */
    public android.view.SurfaceView mo46535x8638c3bc() {
        java.lang.ref.WeakReference<android.view.SurfaceView> weakReference = this.f46621x566f8e45;
        if (weakReference == null) {
            return null;
        }
        android.view.SurfaceView surfaceView = weakReference.get();
        if (surfaceView == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f46622x32cfed, "surfaceView is null.");
        }
        return surfaceView;
    }

    /* renamed from: getUserId */
    public java.lang.String m94622x3342513c() {
        return this.f46624x1d975513;
    }

    @java.lang.Deprecated
    /* renamed from: getVideoView */
    public android.view.TextureView mo46536x4ee17f0a() {
        android.view.TextureView textureView = this.f46625x41f9a531;
        return textureView != null ? textureView : this.f46623xeb54b798;
    }

    /* renamed from: onDestroy */
    public void m94623xac79a11b() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        com.p314xaae8f345.p2926x359365.ui.C25490x38fd0a74 c25490x38fd0a74 = this.f46608x3c4234a7;
        android.graphics.Rect rect = this.f46607x2770e42d;
        c25490x38fd0a74.a(rect.left, rect.top, rect.right, rect.bottom);
        this.f46608x3c4234a7.m94595xaad591e2((float) (m94604xc5d20921(getContext(), getWidth()) / 30.0d));
        this.f46608x3c4234a7.m94591xa29cfa46((float) (m94604xc5d20921(getContext(), getWidth()) / 25.0d));
    }

    /* renamed from: onPause */
    public void m94624xb01dfb57() {
    }

    /* renamed from: onResume */
    public void m94625x57429eec() {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        if (!this.f46613x4d0d3c43) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() - this.f46617x9eb3a96;
        this.f46617x9eb3a96 = scaleGestureDetector.getScaleFactor();
        float a17 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.g.a(this.f46618x61eb608c + scaleFactor, 0.0f);
        this.f46618x61eb608c = a17;
        com.p314xaae8f345.p2926x359365.ui.InterfaceC25489xb6bd843a interfaceC25489xb6bd843a = this.f46626xcfc111dc;
        if (interfaceC25489xb6bd843a != null) {
            interfaceC25489xb6bd843a.mo31290xc3a29e52(a17);
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
        this.f46617x9eb3a96 = scaleGestureDetector.getScaleFactor();
        return this.f46613x4d0d3c43;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p2926x359365.ui.InterfaceC25489xb6bd843a interfaceC25489xb6bd843a = this.f46626xcfc111dc;
        if (interfaceC25489xb6bd843a != null) {
            interfaceC25489xb6bd843a.mo31288x6521d014(i17, i18, i19, i27);
        }
        super.onSizeChanged(i17, i18, i19, i27);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 0) {
            if (this.f46612xd95ab74e) {
                com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.a aVar = this.f46609x2c00e46b;
                int x17 = (int) motionEvent.getX();
                int y17 = (int) motionEvent.getY();
                int width = getWidth();
                int height = getHeight();
                android.graphics.Point point = aVar.f296819a;
                point.x = x17;
                point.y = y17;
                aVar.f296820b = width;
                aVar.f296821c = height;
                removeCallbacks(this.f46609x2c00e46b);
                postDelayed(this.f46609x2c00e46b, 100L);
            }
        } else if (motionEvent.getPointerCount() > 1 && motionEvent.getAction() == 2 && this.f46613x4d0d3c43) {
            removeCallbacks(this.f46609x2c00e46b);
            m94600x9c283b32();
            if (this.f46619xc13eed92 == null) {
                this.f46619xc13eed92 = new android.view.ScaleGestureDetector(getContext(), this);
            }
            this.f46619xc13eed92.onTouchEvent(motionEvent);
        }
        if (!this.f46613x4d0d3c43) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            performClick();
        }
        return true;
    }

    /* renamed from: removeVideoView */
    public void mo46537xcd50899c() {
        m94606xad449726(this.f46625x41f9a531, true);
        this.f46625x41f9a531 = null;
    }

    /* renamed from: setDashBoardMarginInPx */
    public void m94626x53f7c6ad(int i17, int i18, int i19, int i27) {
        android.graphics.Rect rect = this.f46607x2770e42d;
        rect.left = i17;
        rect.right = i18;
        rect.top = i19;
        rect.bottom = i27;
        this.f46608x3c4234a7.a(i17, i19, i18, i27);
    }

    /* renamed from: setDashBoardMarginInRatio */
    public void m94627x6f0c9946(final float f17, final float f18, final float f19, final float f27) {
        postDelayed(new java.lang.Runnable() { // from class: com.tencent.rtmp.ui.TXCloudVideoView.1
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.this.m94626x53f7c6ad((int) (r0.getWidth() * f17), (int) (com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.this.getWidth() * f18), (int) (com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.this.getHeight() * f19), (int) (com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.this.getHeight() * f27));
            }
        }, 100L);
    }

    /* renamed from: setLogMargin */
    public void m94628xc4d5c3d0(float f17, float f18, float f19, float f27) {
        m94626x53f7c6ad((int) f17, (int) f18, (int) f19, (int) f27);
    }

    /* renamed from: setOpenGLContext */
    public void m94629x604b58be(java.lang.Object obj) {
        this.f46615x9509133d = obj;
    }

    /* renamed from: setUserId */
    public void m94630x26778548(java.lang.String str) {
        this.f46624x1d975513 = str;
    }

    /* renamed from: showLog */
    public void m94631x7b381307(boolean z17) {
        this.f46611x18ffe497 = z17;
        java.lang.ref.WeakReference<com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.b> weakReference = this.f46606x1ab9c7d2;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.b bVar = weakReference == null ? null : weakReference.get();
        if (bVar != null) {
            bVar.mo29784xcade1428(z17);
        }
    }

    public ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf(android.view.SurfaceView surfaceView) {
        this(surfaceView.getContext(), null, surfaceView);
    }

    public ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf(android.content.Context context, android.view.Surface surface) {
        this(context, null, null);
        this.f46620x2fa29f80 = surface != null ? new java.lang.ref.WeakReference<>(surface) : null;
    }

    /* renamed from: com.tencent.rtmp.ui.TXCloudVideoView$a */
    /* loaded from: classes14.dex */
    public class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final android.graphics.Point f296819a;

        /* renamed from: b, reason: collision with root package name */
        int f296820b;

        /* renamed from: c, reason: collision with root package name */
        int f296821c;

        private a() {
            this.f296819a = new android.graphics.Point();
            this.f296820b = 0;
            this.f296821c = 0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.this.f46626xcfc111dc != null) {
                com.p314xaae8f345.p2926x359365.ui.InterfaceC25489xb6bd843a interfaceC25489xb6bd843a = com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.this.f46626xcfc111dc;
                android.graphics.Point point = this.f296819a;
                interfaceC25489xb6bd843a.mo31289x64f7944(point.x, point.y, this.f296820b, this.f296821c);
            }
        }

        public /* synthetic */ a(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, byte b17) {
            this();
        }
    }

    public ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    public ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf(android.content.Context context, android.util.AttributeSet attributeSet, android.view.SurfaceView surfaceView) {
        super(context, attributeSet);
        this.f46622x32cfed = "TXCloudVideoView_" + hashCode();
        this.f46607x2770e42d = new android.graphics.Rect();
        this.f46610x70f45402 = new java.util.HashSet<>();
        this.f46612xd95ab74e = false;
        this.f46609x2c00e46b = new com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.a(this, (byte) 0);
        this.f46613x4d0d3c43 = false;
        this.f46624x1d975513 = "";
        this.f46616x27e3e482 = com.p314xaae8f345.p2926x359365.ui.a.a(this);
        this.f46608x3c4234a7 = new com.p314xaae8f345.p2926x359365.ui.C25490x38fd0a74(context);
        this.f46621x566f8e45 = surfaceView != null ? new java.lang.ref.WeakReference<>(surfaceView) : null;
    }
}
