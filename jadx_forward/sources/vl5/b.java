package vl5;

/* loaded from: classes15.dex */
public class b extends vl5.u implements android.view.View.OnTouchListener, android.view.GestureDetector.OnGestureListener {
    public boolean A;
    public final int B;
    public final int C;
    public final int D;
    public boolean E;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 F;
    public int G;

    /* renamed from: h, reason: collision with root package name */
    public int f519439h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f519440i;

    /* renamed from: m, reason: collision with root package name */
    public int f519441m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f519442n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f519443o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.GestureDetector f519444p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.GestureDetector f519445q;

    /* renamed from: r, reason: collision with root package name */
    public final int f519446r;

    /* renamed from: s, reason: collision with root package name */
    public int f519447s;

    /* renamed from: t, reason: collision with root package name */
    public int f519448t;

    /* renamed from: u, reason: collision with root package name */
    public int f519449u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f519450v;

    /* renamed from: w, reason: collision with root package name */
    public int f519451w;

    /* renamed from: x, reason: collision with root package name */
    public int f519452x;

    /* renamed from: y, reason: collision with root package name */
    public int f519453y;

    /* renamed from: z, reason: collision with root package name */
    public int f519454z;

    public b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395, int i17, int i18, int i19, int i27, int i28) {
        super(c22722xd3be5395);
        this.f519439h = 0;
        this.f519440i = true;
        this.f519442n = false;
        this.f519443o = false;
        this.f519447s = -1;
        this.f519448t = -1;
        this.f519449u = -1;
        this.f519450v = new int[2];
        this.A = false;
        vl5.a aVar = new vl5.a(this);
        this.F = c22722xd3be5395;
        this.f519444p = new android.view.GestureDetector(c22722xd3be5395.getContext(), this);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(c22722xd3be5395.getContext(), aVar);
        this.f519445q = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f519446r = android.view.ViewConfiguration.get(c22722xd3be5395.getContext()).getScaledTouchSlop();
        this.B = i17;
        this.C = i27;
        this.D = i28;
        this.f519441m = i19;
        this.f519439h = i18;
    }

    public boolean a(int i17, int i18, int i19) {
        int i27 = (!this.f519440i || this.f519443o) ? 0 : 12;
        if (this.f519442n && this.f519443o) {
            i27 = i27 | 1 | 2;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.F;
        boolean w17 = c22722xd3be5395.w(i17 - c22722xd3be5395.getHeaderViewsCount(), i27, i18, i19);
        this.A = w17;
        return w17;
    }

    public int b(android.view.MotionEvent motionEvent, int i17) {
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.F;
        int pointToPosition = c22722xd3be5395.pointToPosition(x17, y17);
        int headerViewsCount = c22722xd3be5395.getHeaderViewsCount();
        int footerViewsCount = c22722xd3be5395.getFooterViewsCount();
        int count = c22722xd3be5395.getCount();
        if (pointToPosition != -1 && pointToPosition >= headerViewsCount && pointToPosition < count - footerViewsCount) {
            android.view.View childAt = c22722xd3be5395.getChildAt(pointToPosition - c22722xd3be5395.getFirstVisiblePosition());
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            android.view.View findViewById = i17 == 0 ? childAt : childAt.findViewById(i17);
            if (findViewById != null) {
                int[] iArr = this.f519450v;
                findViewById.getLocationOnScreen(iArr);
                int i18 = iArr[0];
                if (rawX > i18 && rawY > iArr[1] && rawX < i18 + findViewById.getWidth() && rawY < iArr[1] + findViewById.getHeight()) {
                    this.f519451w = childAt.getLeft();
                    this.f519452x = childAt.getTop();
                    return pointToPosition;
                }
            }
        }
        return -1;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        if (this.f519442n && this.f519441m == 0) {
            this.f519449u = b(motionEvent, this.C);
        }
        int b17 = b(motionEvent, this.B);
        this.f519447s = b17;
        if (b17 != -1 && this.f519439h == 0) {
            a(b17, ((int) motionEvent.getX()) - this.f519451w, ((int) motionEvent.getY()) - this.f519452x);
        }
        this.f519443o = false;
        this.E = true;
        this.G = 0;
        this.f519448t = this.f519441m == 1 ? b(motionEvent, this.D) : -1;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        if (this.f519447s != -1 && this.f519439h == 2) {
            this.F.performHapticFeedback(0);
            a(this.f519447s, this.f519453y - this.f519451w, this.f519454z - this.f519452x);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        int i17;
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int x18 = (int) motionEvent2.getX();
        int y18 = (int) motionEvent2.getY();
        int i18 = x18 - this.f519451w;
        int i19 = y18 - this.f519452x;
        if (this.E && !this.A && ((i17 = this.f519447s) != -1 || this.f519448t != -1)) {
            int i27 = this.f519446r;
            if (i17 != -1) {
                if (this.f519439h == 1 && java.lang.Math.abs(y18 - y17) > i27 && this.f519440i) {
                    a(this.f519447s, i18, i19);
                } else if (this.f519439h != 0 && java.lang.Math.abs(x18 - x17) > i27 && this.f519442n) {
                    this.f519443o = true;
                    a(this.f519448t, i18, i19);
                }
            } else if (this.f519448t != -1) {
                if (java.lang.Math.abs(x18 - x17) > i27 && this.f519442n) {
                    this.f519443o = true;
                    a(this.f519448t, i18, i19);
                } else if (java.lang.Math.abs(y18 - y17) > i27) {
                    this.E = false;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        if (this.f519442n && this.f519441m == 0 && (i17 = this.f519449u) != -1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.F;
            int headerViewsCount = i17 - c22722xd3be5395.getHeaderViewsCount();
            c22722xd3be5395.F1 = false;
            c22722xd3be5395.u(headerViewsCount, 0.0f);
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.F;
        if (!c22722xd3be5395.f294045y || c22722xd3be5395.H1) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        android.view.GestureDetector gestureDetector = this.f519444p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(motionEvent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/ui/widget/sortlist/DragSortController", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0)), "com/tencent/mm/ui/widget/sortlist/DragSortController", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (this.f519442n && this.A && this.f519441m == 1) {
            android.view.GestureDetector gestureDetector2 = this.f519445q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(motionEvent);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(gestureDetector2, arrayList3.toArray(), "com/tencent/mm/ui/widget/sortlist/DragSortController", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector2, gestureDetector2.onTouchEvent((android.view.MotionEvent) arrayList3.get(0)), "com/tencent/mm/ui/widget/sortlist/DragSortController", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f519453y = (int) motionEvent.getX();
            this.f519454z = (int) motionEvent.getY();
        } else if (action != 1) {
            if (action == 3) {
                this.f519443o = false;
                this.A = false;
            }
        } else if (this.f519442n && this.f519443o) {
            int i17 = this.G;
            if (i17 < 0) {
                i17 = -i17;
            }
            if (i17 > c22722xd3be5395.getWidth() / 2) {
                c22722xd3be5395.F1 = true;
                c22722xd3be5395.x(true, 0.0f);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
