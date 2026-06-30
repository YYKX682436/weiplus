package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMPullDownView */
/* loaded from: classes9.dex */
public class GestureDetectorOnGestureListenerC21510x15ed9d8c extends android.widget.FrameLayout implements android.view.GestureDetector.OnGestureListener {
    public static final int S = android.graphics.Color.parseColor("#00000000");
    public android.view.View A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f279058J;
    public db5.h5 K;
    public int L;
    public int M;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 N;
    public boolean P;
    public int Q;
    public db5.i5 R;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.Scroller f279059d;

    /* renamed from: e, reason: collision with root package name */
    public final int f279060e;

    /* renamed from: f, reason: collision with root package name */
    public db5.o5 f279061f;

    /* renamed from: g, reason: collision with root package name */
    public db5.m5 f279062g;

    /* renamed from: h, reason: collision with root package name */
    public db5.l5 f279063h;

    /* renamed from: i, reason: collision with root package name */
    public int f279064i;

    /* renamed from: m, reason: collision with root package name */
    public int f279065m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f279066n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f279067o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f279068p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f279069q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f279070r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f279071s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f279072t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f279073u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.GestureDetector f279074v;

    /* renamed from: w, reason: collision with root package name */
    public db5.j5 f279075w;

    /* renamed from: x, reason: collision with root package name */
    public db5.k5 f279076x;

    /* renamed from: y, reason: collision with root package name */
    public final android.content.Context f279077y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f279078z;

    public GestureDetectorOnGestureListenerC21510x15ed9d8c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void j() {
        int scrollY = getScrollY() - this.f279064i;
        android.widget.Scroller scroller = this.f279059d;
        if (scrollY < 0) {
            if (this.f279072t) {
                scroller.startScroll(0, getScrollY(), 0, (-getScrollY()) + this.f279064i, 200);
            } else if (!this.f279058J) {
                if (this.f279078z.getVisibility() == 4) {
                    scroller.startScroll(0, getScrollY(), 0, (-getScrollY()) + this.f279064i, 200);
                }
                if (this.f279078z.getVisibility() == 0) {
                    scroller.startScroll(0, getScrollY(), 0, -getScrollY(), 200);
                }
                this.B = 0;
                this.f279069q = true;
                this.f279070r = false;
            }
            postInvalidate();
        }
        if (getScrollY() > this.f279065m) {
            if (this.f279073u) {
                scroller.startScroll(0, getScrollY(), 0, this.f279065m - getScrollY(), 200);
            } else {
                if (this.A.getVisibility() == 4) {
                    scroller.startScroll(0, getScrollY(), 0, this.f279065m - getScrollY(), 200);
                }
                if (this.A.getVisibility() == 0) {
                    scroller.startScroll(0, getScrollY(), 0, (this.f279065m - getScrollY()) + this.f279065m, 200);
                }
                this.B = 1;
                this.f279069q = true;
                this.f279070r = false;
            }
            postInvalidate();
        }
        this.f279068p = false;
    }

    public final void b(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPullDownView", "fix android O progress bar bug. visibility=" + i17);
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return;
        }
        if (viewGroup.getTag() == null) {
            viewGroup.setTag(viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f565217bp1));
        }
        android.view.View view = (android.view.View) viewGroup.getTag();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "fixAndroidOProgressBarOutScreenFlashProblem", "(Landroid/view/ViewGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "fixAndroidOProgressBarOutScreenFlashProblem", "(Landroid/view/ViewGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPullDownView", "forceBottomLoadData start[%b] loadDataBegin[%b] loadDataEnd[%b], isBottomShowAll[%b], getScrollY[%d]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f279069q), java.lang.Boolean.valueOf(this.f279070r), java.lang.Boolean.valueOf(this.f279073u), java.lang.Integer.valueOf(getScrollY()));
        if (!z17) {
            if (!this.f279070r) {
                this.f279070r = true;
                this.f279069q = false;
            }
            android.view.View view = this.A;
            if (view != null && view.getVisibility() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPullDownView", "forceBottomLoadData false bottomView VISIBLE scroll to 0");
                scrollTo(0, this.f279064i);
            }
            android.view.View view2 = this.A;
            if (view2 == null || view2.getVisibility() != 0) {
                return;
            }
            android.view.View view3 = this.A;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "forceBottomLoadData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/base/MMPullDownView", "forceBottomLoadData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.A;
        if (view4 != null) {
            int i17 = this.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "forceBottomLoadData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/ui/base/MMPullDownView", "forceBottomLoadData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z18 = this.f279073u;
        android.widget.Scroller scroller = this.f279059d;
        if (z18) {
            scroller.startScroll(0, getScrollY(), 0, this.f279065m - getScrollY(), 200);
        } else {
            android.view.View view5 = this.A;
            if (view5 != null && view5.getVisibility() == 4) {
                scroller.startScroll(0, getScrollY(), 0, this.f279065m - getScrollY(), 200);
            }
            android.view.View view6 = this.A;
            if (view6 != null && view6.getVisibility() == 0) {
                scroller.startScroll(0, getScrollY(), 0, (this.f279065m - getScrollY()) + this.f279065m, 200);
            }
            this.B = 1;
            this.f279069q = true;
            this.f279070r = false;
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.f279059d;
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            postInvalidate();
        } else if (this.f279069q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPullDownView", "computeScroll loadDataBegin true UPDATE_DELAY");
            this.f279069q = false;
            this.N.mo50307xb9e94560(0, this.B == 2 ? 0L : 400);
            b((android.view.ViewGroup) this.f279078z, 0);
            b((android.view.ViewGroup) this.A, 0);
        }
        scroller.isFinished();
    }

    public void d(boolean z17) {
        e(z17, 200);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (h()) {
            return true;
        }
        if (!this.G) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.f279070r && i()) {
            return true;
        }
        db5.k5 k5Var = this.f279076x;
        if (k5Var == null) {
            this.f279066n = false;
        } else {
            this.f279066n = k5Var.E0();
        }
        db5.j5 j5Var = this.f279075w;
        if (j5Var == null) {
            this.f279067o = false;
        } else {
            this.f279067o = j5Var.A5();
        }
        if (this.D == 0) {
            if (this.f279072t) {
                android.view.View view = this.f279078z;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = this.f279078z;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.C == 0) {
            if (this.f279073u) {
                android.view.View view3 = this.A;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view4 = this.A;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (motionEvent.getAction() == 1) {
            j();
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 3) {
            j();
            if (this.I) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
        android.view.GestureDetector gestureDetector = this.f279074v;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(motionEvent);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(gestureDetector, arrayList5.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList5.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/ui/base/MMPullDownView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (onTouchEvent) {
            motionEvent.setAction(3);
            return super.dispatchTouchEvent(motionEvent);
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMPullDownView", e17, "", new java.lang.Object[0]);
            return true;
        }
    }

    public void e(boolean z17, int i17) {
        f(z17, i17, false);
    }

    public void f(boolean z17, int i17, boolean z18) {
        if (this.f279070r || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPullDownView", "forceTopLoadData start[%b] loadDataBegin[%b], loadDataEnd[%b], isTopShowAll[%b], getScrollY[%d], loadDataIsPreLoad[%b]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f279069q), java.lang.Boolean.valueOf(this.f279070r), java.lang.Boolean.valueOf(this.f279072t), java.lang.Integer.valueOf(getScrollY()), java.lang.Boolean.valueOf(z18));
            if (z17) {
                android.view.View view = this.f279078z;
                if (view != null) {
                    int i18 = this.D;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "forceTopLoadData", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "forceTopLoadData", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                boolean z19 = this.f279072t;
                android.widget.Scroller scroller = this.f279059d;
                if (!z19) {
                    android.view.View view2 = this.f279078z;
                    if (view2 != null && view2.getVisibility() == 4 && !z18) {
                        scroller.startScroll(0, getScrollY(), 0, (-getScrollY()) + this.f279064i, i17);
                    }
                    android.view.View view3 = this.f279078z;
                    if (view3 != null && view3.getVisibility() == 0 && !z18) {
                        scroller.startScroll(0, getScrollY(), 0, -getScrollY(), i17);
                    }
                    this.B = z18 ? 2 : 0;
                    this.f279069q = true;
                    this.f279070r = false;
                    if (z18) {
                        computeScroll();
                    }
                } else if (!z18) {
                    scroller.startScroll(0, getScrollY(), 0, (-getScrollY()) + this.f279064i, i17);
                }
                postInvalidate();
            } else {
                if (!this.f279070r) {
                    this.f279070r = true;
                    this.f279069q = false;
                    android.view.View view4 = this.f279078z;
                    if (view4 != null && view4.getVisibility() == 0 && !z18) {
                        scrollTo(0, this.f279064i);
                    }
                }
                android.view.View view5 = this.f279078z;
                if (view5 != null && view5.getVisibility() == 0) {
                    android.view.View view6 = this.f279078z;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "forceTopLoadData", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/ui/base/MMPullDownView", "forceTopLoadData", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (this.f279072t) {
                return;
            }
            b((android.view.ViewGroup) this.f279078z, 0);
            b((android.view.ViewGroup) this.A, 0);
        }
    }

    public void g() {
        android.content.Context context = this.f279077y;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bsi, null);
        android.view.View inflate2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bsi, null);
        addView(inflate, 0, new android.widget.FrameLayout.LayoutParams(-1, -2));
        addView(inflate2, new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    /* renamed from: getBottomHeight */
    public int m79074xd3ae1da8() {
        return this.f279065m;
    }

    /* renamed from: getCurScreen */
    public int m79075xf19ef016() {
        return this.f279060e;
    }

    /* renamed from: getIsTopShowAll */
    public boolean m79076x2e45158f() {
        return this.f279072t;
    }

    /* renamed from: getTopHeight */
    public int m79077xde699c26() {
        return this.f279064i;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        android.widget.Scroller scroller = this.f279059d;
        if (scroller.isFinished()) {
            return false;
        }
        scroller.abortAnimation();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        db5.h5 h5Var = this.K;
        if (h5Var != null) {
            h5Var.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int childCount = getChildCount();
        int i28 = 0;
        for (int i29 = 0; i29 < childCount; i29++) {
            android.view.View childAt = getChildAt(i29);
            int measuredHeight = childAt.getMeasuredHeight();
            if (childAt.getVisibility() != 8) {
                try {
                    childAt.layout(0, i28, childAt.getMeasuredWidth(), i28 + measuredHeight);
                } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMPullDownView", e17, "childCount: %d, i:%d, childHeight:%d", java.lang.Integer.valueOf(childCount), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(measuredHeight));
                }
                i28 += measuredHeight;
            }
        }
        this.f279078z = getChildAt(0);
        this.A = getChildAt(getChildCount() - 1);
        android.view.View view = this.f279078z;
        int i37 = this.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i37));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.A;
        int i38 = this.C;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i38));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/base/MMPullDownView", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f279064i = this.f279078z.getHeight();
        this.f279065m = this.A.getHeight();
        int i39 = this.f279064i;
        this.Q = i39;
        if (this.f279071s || i39 == 0) {
            return;
        }
        this.f279071s = true;
        scrollTo(0, i39);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMPullDownView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/base/MMPullDownView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (!this.E) {
            g();
            this.E = true;
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        int scrollY;
        if (f18 > 0.0f) {
            this.f279068p = true;
        } else {
            this.f279068p = false;
        }
        boolean z17 = java.lang.Math.abs(f18) > java.lang.Math.abs(f17);
        if (!this.f279067o || ((!this.f279068p && getScrollY() - this.f279064i <= 0) || !z17)) {
            if (!this.f279066n || ((this.f279068p && getScrollY() - this.f279064i >= 0) || !z17)) {
                return false;
            }
            if (!this.F && (this.f279078z.getVisibility() != 0 || (!this.f279068p && getScrollY() <= 0))) {
                return !this.H;
            }
            int i17 = (int) (f18 * 0.5d);
            if (i17 == 0) {
                i17 = f18 > 0.0f ? 1 : -1;
            }
            int scrollY2 = getScrollY() + i17;
            int i18 = this.f279064i;
            if (scrollY2 > i18) {
                i17 = i18 - getScrollY();
            } else if (!this.F && getScrollY() + i17 < 0) {
                i17 = -getScrollY();
            }
            scrollBy(0, i17);
            return true;
        }
        if (!this.F && (this.A.getVisibility() != 0 || (this.f279068p && getScrollY() >= this.f279064i * 2))) {
            return !this.H;
        }
        int i19 = (int) (f18 * 0.5d);
        if (i19 == 0) {
            i19 = f18 > 0.0f ? 1 : -1;
        }
        getScrollY();
        int scrollY3 = getScrollY() + i19;
        int i27 = this.f279064i;
        if (scrollY3 >= i27 || this.f279068p) {
            if (!this.F) {
                int scrollY4 = getScrollY() + i19;
                int i28 = this.f279064i;
                if (scrollY4 >= i28 * 2) {
                    i27 = i28 * 2;
                    scrollY = getScrollY();
                }
            }
            scrollBy(0, i19);
            return true;
        }
        scrollY = getScrollY();
        i19 = i27 - scrollY;
        scrollBy(0, i19);
        return true;
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        db5.i5 i5Var = this.R;
        if (i5Var != null) {
            i5Var.a(i17, i18, i19, i27);
        }
        if (this.P) {
            if (this.Q == Integer.MIN_VALUE) {
                this.Q = this.f279064i;
            }
            int i28 = this.Q;
            if (i18 <= i28) {
                int i29 = this.M;
                int i37 = S;
                if (i29 != i37) {
                    setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3);
                    this.M = i37;
                    return;
                }
            }
            if (i18 > i28) {
                int i38 = this.M;
                int i39 = this.L;
                if (i38 != i39) {
                    setBackgroundColor(i39);
                    this.M = this.L;
                }
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMPullDownView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMPullDownView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (getScrollY() - this.f279064i < 0) {
                this.f279066n = true;
            }
            if (getScrollY() > this.f279065m) {
                this.f279067o = true;
            }
            j();
        }
        return true;
    }

    /* renamed from: setAtBottomCallBack */
    public void m79078x1c273745(db5.j5 j5Var) {
        this.f279075w = j5Var;
    }

    /* renamed from: setAtTopCallBack */
    public void m79079xcab5c565(db5.k5 k5Var) {
        this.f279076x = k5Var;
    }

    /* renamed from: setBgColor */
    public void m79080xa5089f5c(int i17) {
        this.L = i17;
        this.M = i17;
    }

    /* renamed from: setBottomView */
    public void m79081xb81c4172(android.view.View view) {
        if (view == null) {
            this.C = 4;
            android.view.View view2 = this.A;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/base/MMPullDownView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        this.A = view;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.C = 0;
        removeViewAt(getChildCount() - 1);
        addView(this.A, new android.widget.FrameLayout.LayoutParams(-1, -2));
        this.f279065m = 0;
    }

    /* renamed from: setBottomViewVisible */
    public void m79082x1e1922a0(boolean z17) {
        int i17 = z17 ? 0 : 4;
        this.C = i17;
        android.view.View view = this.A;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "setBottomViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "setBottomViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPullDownView", "setBottomViewVisible visible[%b], stack[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    /* renamed from: setCanOverScrool */
    public void m79083x49531bcc(boolean z17) {
        this.F = z17;
    }

    /* renamed from: setEnableGesture */
    public void m79084x8e764904(boolean z17) {
        this.G = z17;
    }

    /* renamed from: setIsBottomShowAll */
    public void m79085xcc8bf2ed(boolean z17) {
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f279073u = z17;
    }

    /* renamed from: setIsIgnoreActionUpForceTopLoad */
    public void m79086xfda753bf(boolean z17) {
        this.f279058J = z17;
    }

    /* renamed from: setIsReturnSuperDispatchWhenCancel */
    public void m79087xceaf442d(boolean z17) {
        this.I = z17;
    }

    /* renamed from: setIsTopShowAll */
    public void m79088x648e109b(boolean z17) {
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f279072t = z17;
    }

    /* renamed from: setNestedOverScrollEnabled */
    public void m79089x36833047(boolean z17) {
        this.H = z17;
    }

    /* renamed from: setOnBottomLoadDataListener */
    public void m79090x3b8dba10(db5.l5 l5Var) {
        this.f279063h = l5Var;
    }

    /* renamed from: setOnInterceptTouchEventListener */
    public void m79091x1c9bae30(db5.h5 h5Var) {
        this.K = h5Var;
    }

    /* renamed from: setOnPreTopLoadDataListener */
    public void m79092x66dea197(db5.m5 m5Var) {
        this.f279062g = m5Var;
    }

    /* renamed from: setOnScrollChangedListener */
    public void m79093x6fa959a(db5.i5 i5Var) {
        this.R = i5Var;
    }

    /* renamed from: setOnSrcollDistance */
    public void m79094x61600f21(db5.n5 n5Var) {
    }

    /* renamed from: setOnTopLoadDataListener */
    public void m79095x31e25658(db5.o5 o5Var) {
        this.f279061f = o5Var;
    }

    /* renamed from: setShowBackground */
    public void m79096xc62a690d(boolean z17) {
        this.P = z17;
    }

    /* renamed from: setTopView */
    public void m79097x6d4e46d8(android.view.View view) {
        if (view == null) {
            this.D = 4;
            android.view.View view2 = this.f279078z;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "setTopView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/base/MMPullDownView", "setTopView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        removeViewAt(0);
        this.f279078z = view;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "setTopView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "setTopView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.D = 0;
        addView(this.f279078z, 0, new android.widget.FrameLayout.LayoutParams(-1, -2));
        this.f279064i = 0;
    }

    /* renamed from: setTopViewVisible */
    public void m79098x563f5e7a(boolean z17) {
        int i17 = z17 ? 0 : 4;
        this.D = i17;
        android.view.View view = this.f279078z;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMPullDownView", "setTopViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMPullDownView", "setTopViewVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPullDownView", "setTopViewVisible visible[%b]", java.lang.Boolean.valueOf(z17));
    }

    public GestureDetectorOnGestureListenerC21510x15ed9d8c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f279066n = false;
        this.f279067o = false;
        this.f279068p = false;
        this.f279069q = false;
        this.f279070r = true;
        this.f279071s = false;
        this.f279072t = true;
        this.f279073u = true;
        this.C = 4;
        this.D = 4;
        this.E = false;
        this.F = true;
        this.G = true;
        this.H = false;
        this.I = false;
        this.f279058J = false;
        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        this.L = color;
        this.M = color;
        this.N = new db5.g5(this);
        this.P = false;
        this.Q = Integer.MIN_VALUE;
        this.f279059d = new android.widget.Scroller(context, new android.view.animation.AccelerateInterpolator());
        this.f279060e = 1;
        this.f279074v = new android.view.GestureDetector(context, this);
        this.f279077y = context;
        int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        this.L = color2;
        this.M = color2;
    }
}
