package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter;", "Lcom/tencent/mm/plugin/finder/view/FinderFeedBubbleTipsLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter */
/* loaded from: classes2.dex */
public final class C15310x1d9feb31 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 {
    public static final /* synthetic */ int R = 0;
    public uc2.i B;
    public android.view.GestureDetector C;
    public android.widget.Scroller D;
    public final android.widget.FrameLayout E;
    public float F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f212726J;
    public int K;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 L;
    public boolean M;
    public boolean N;
    public int P;
    public final java.lang.Runnable Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15310x1d9feb31(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.E = new android.widget.FrameLayout(getContext());
        this.Q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xc(this);
        this.C = new android.view.GestureDetector(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yc(this));
        this.D = new android.widget.Scroller(getContext(), new android.view.animation.DecelerateInterpolator());
    }

    public static final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31 c15310x1d9feb31) {
        android.view.View mo56698x4ee17f0a;
        c15310x1d9feb31.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", "reset");
        android.widget.FrameLayout frameLayout = c15310x1d9feb31.E;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        if (frameLayout != null) {
            frameLayout.setX(c15310x1d9feb31.getWidth());
        }
        c15310x1d9feb31.f212726J = 0;
        c15310x1d9feb31.K = 0;
        if (frameLayout != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(frameLayout, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(frameLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            frameLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(frameLayout, "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(frameLayout, "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c15310x1d9feb31.M = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f m61652x7f02fdf3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) c15310x1d9feb31.findViewById(com.p314xaae8f345.mm.R.id.fs6)).m62206xf9f03e51().m61652x7f02fdf3();
        cw2.da videoView = m61652x7f02fdf3.getVideoView();
        if (videoView == null || (mo56698x4ee17f0a = videoView.mo56698x4ee17f0a()) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoLayout", "addVideoViewAndClearSnapShot");
        pm0.v.B(mo56698x4ee17f0a);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(m61652x7f02fdf3, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(m61652x7f02fdf3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout", "addVideoViewAndClearSnapShot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m61652x7f02fdf3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(m61652x7f02fdf3, "com/tencent/mm/plugin/finder/video/FinderVideoLayout", "addVideoViewAndClearSnapShot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(m61652x7f02fdf3, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (m61652x7f02fdf3.getChildCount() > 0) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            m61652x7f02fdf3.addView(mo56698x4ee17f0a, 1, layoutParams);
        }
        android.widget.ImageView imageView = m61652x7f02fdf3.f212241f;
        if (imageView != null) {
            pm0.v.B(imageView);
        }
        mo56698x4ee17f0a.setTag(com.p314xaae8f345.mm.R.id.tin, java.lang.Boolean.FALSE);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z
    /* renamed from: canScrollHorizontally */
    public boolean mo57364xc6ea780e(int i17, android.view.ViewGroup parent, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        return (this.P == 4 && i17 > 0) || super.mo57364xc6ea780e(i17, parent, f17, f18);
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.D;
        if (scroller == null || !scroller.computeScrollOffset()) {
            return;
        }
        android.widget.FrameLayout frameLayout = this.E;
        if (frameLayout != null) {
            frameLayout.setX(scroller.getCurrX());
        }
        postInvalidate();
        e(this.f212726J);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        boolean z17 = true;
        if (valueOf != null && valueOf.intValue() == 0) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5483x5b38660c().e();
            this.N = true;
        } else {
            if ((valueOf == null || valueOf.intValue() != 1) && (valueOf == null || valueOf.intValue() != 3)) {
                z17 = false;
            }
            if (z17) {
                this.N = false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i17) {
        if (i17 != this.K) {
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", "initTempContainer");
                android.widget.FrameLayout frameLayout = this.E;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                if (frameLayout != null) {
                    frameLayout.setX(getWidth());
                }
                if (frameLayout != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(frameLayout, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Integer.valueOf(intValue));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(frameLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "initTempContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    frameLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(frameLayout, "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "initTempContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    yj0.a.f(frameLayout, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View U = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) findViewById(com.p314xaae8f345.mm.R.id.fs6)).m62206xf9f03e51().m61652x7f02fdf3().U();
                if (U != null) {
                    pm0.v.B(U);
                }
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                if (U != null && frameLayout != null) {
                    frameLayout.addView(U, new android.widget.FrameLayout.LayoutParams(-1, -1));
                }
            }
            this.K = i17;
        }
    }

    public final void f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", "processPageSelected position=" + i17);
        postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ad(this, i17), 500L);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(this.E, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6.getAction() == 0) {
            this.F = ev6.getX();
            android.widget.FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                frameLayout.setX(getWidth());
            }
            if (frameLayout != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(frameLayout, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(frameLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                frameLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(frameLayout, "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(frameLayout, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.Scroller scroller = this.D;
            if (scroller != null) {
                scroller.abortAnimation();
            }
        }
        int action = ev6.getAction();
        if (action == 0) {
            this.H = (int) ev6.getX();
            this.I = (int) ev6.getY();
            android.view.GestureDetector gestureDetector = this.C;
            if (gestureDetector != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(ev6);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(gestureDetector, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList3.get(0)), "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            }
        } else if (action == 2) {
            int x17 = (int) ev6.getX();
            int y17 = (int) ev6.getY();
            int i17 = x17 - this.H;
            int i18 = y17 - this.I;
            if (this.P != 4) {
                return super.onInterceptTouchEvent(ev6);
            }
            if (this.f212726J == 0) {
                double d17 = i17;
                if (java.lang.Math.abs(d17) > java.lang.Math.abs(i18) && java.lang.Math.abs(d17) > 3.0d && i17 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", "onInterceptTouchEvent true");
                    requestDisallowInterceptTouchEvent(true);
                    this.M = true;
                    return true;
                }
            } else {
                double d18 = i17;
                if (java.lang.Math.abs(d18) > java.lang.Math.abs(i18) && java.lang.Math.abs(d18) >= 0.0d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", "onInterceptTouchEvent true");
                    requestDisallowInterceptTouchEvent(true);
                    this.M = true;
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(ev6);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.widget.FrameLayout frameLayout = this.E;
        if (frameLayout != null) {
            frameLayout.layout(getWidth(), i18, getWidth() * 2, i27);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if (r0 != 3) goto L47;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
