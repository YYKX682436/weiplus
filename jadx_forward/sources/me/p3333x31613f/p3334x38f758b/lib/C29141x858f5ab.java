package me.p3333x31613f.p3334x38f758b.lib;

/* renamed from: me.imid.swipebacklayout.lib.SwipeBackLayout */
/* loaded from: classes15.dex */
public class C29141x858f5ab extends android.widget.FrameLayout {
    public static final int[] F = {1, 2, 8, 11};
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 A;
    public java.lang.Runnable B;
    public float C;
    public float D;
    public android.view.MotionEvent E;

    /* renamed from: d, reason: collision with root package name */
    public int f407418d;

    /* renamed from: e, reason: collision with root package name */
    public float f407419e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f407420f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f407421g;

    /* renamed from: h, reason: collision with root package name */
    public final z26.l f407422h;

    /* renamed from: i, reason: collision with root package name */
    public float f407423i;

    /* renamed from: m, reason: collision with root package name */
    public int f407424m;

    /* renamed from: n, reason: collision with root package name */
    public int f407425n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.concurrent.CopyOnWriteArrayList f407426o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.drawable.Drawable f407427p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.drawable.Drawable f407428q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.drawable.Drawable f407429r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.drawable.Drawable f407430s;

    /* renamed from: t, reason: collision with root package name */
    public float f407431t;

    /* renamed from: u, reason: collision with root package name */
    public int f407432u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f407433v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Rect f407434w;

    /* renamed from: x, reason: collision with root package name */
    public int f407435x;

    /* renamed from: y, reason: collision with root package name */
    public int f407436y;

    /* renamed from: z, reason: collision with root package name */
    public long f407437z;

    public C29141x858f5ab(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559589g);
    }

    public static void b(me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab c29141x858f5ab) {
        android.view.View view = c29141x858f5ab.f407421g;
        if (view == null) {
            return;
        }
        z26.a aVar = new z26.a(c29141x858f5ab);
        int i17 = c29141x858f5ab.f407436y;
        if (i17 == 0) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), c29141x858f5ab.C);
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            ofFloat.addListener(aVar);
            ofFloat.addUpdateListener(new z26.b(c29141x858f5ab));
            ofFloat.start();
            c29141x858f5ab.f407421g.setTranslationY(c29141x858f5ab.D);
            return;
        }
        if (i17 != 1) {
            view.setTranslationX(c29141x858f5ab.C);
            c29141x858f5ab.f407421g.setTranslationY(c29141x858f5ab.D);
            c29141x858f5ab.invalidate();
            return;
        }
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), c29141x858f5ab.D);
        ofFloat2.setDuration(150L);
        ofFloat2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofFloat2.addListener(aVar);
        ofFloat2.addUpdateListener(new z26.c(c29141x858f5ab));
        ofFloat2.start();
        c29141x858f5ab.f407421g.setTranslationX(c29141x858f5ab.C);
    }

    public void c(z26.e eVar) {
        if (this.f407426o == null) {
            this.f407426o = new java.util.concurrent.CopyOnWriteArrayList();
        }
        this.f407426o.add(eVar);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f407431t = 1.0f - this.f407423i;
        z26.l lVar = this.f407422h;
        if (lVar.f551368a == 2) {
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.s sVar = lVar.f551384q;
            boolean computeScrollOffset = sVar.f92637a.computeScrollOffset();
            android.widget.OverScroller overScroller = sVar.f92637a;
            int currX = overScroller.getCurrX();
            int b17 = sVar.b();
            int left = currX - lVar.f551386s.getLeft();
            int top = b17 - lVar.f551386s.getTop();
            if (left != 0) {
                lVar.f551386s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                lVar.f551386s.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                lVar.f551385r.a(lVar.f551386s, currX, b17, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && b17 == overScroller.getFinalY()) {
                sVar.a();
                computeScrollOffset = sVar.c();
            }
            if (!computeScrollOffset) {
                lVar.f551388u.post(lVar.f551389v);
            }
        }
        if (lVar.f551368a == 2) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f407420f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f407426o;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            java.util.Iterator it = this.f407426o.iterator();
            while (it.hasNext()) {
                ((z26.e) it.next()).a(motionEvent);
            }
        }
        z26.l lVar = this.f407422h;
        if (lVar.f551368a == 1) {
            if (this.E != null) {
                this.E = null;
            }
            lVar.j(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 0) {
            this.E = android.view.MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.E = null;
        }
        try {
            if (!lVar.p(motionEvent)) {
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
            motionEvent.setAction(3);
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.IllegalArgumentException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        boolean z17 = view == this.f407421g;
        boolean drawChild = super.drawChild(canvas, view, j17);
        if (this.f407431t > 0.0f && z17 && this.f407422h.f551368a != 0) {
            android.graphics.Rect rect = this.f407434w;
            view.getHitRect(rect);
            if ((this.f407418d & 1) != 0) {
                if (this.f407436y == 1) {
                    android.graphics.drawable.Drawable drawable = this.f407427p;
                    drawable.setBounds(rect.left, rect.top - drawable.getIntrinsicWidth(), rect.right, rect.top);
                    this.f407427p.setAlpha((int) (this.f407431t * 255.0f));
                    this.f407427p.draw(canvas);
                } else {
                    android.graphics.drawable.Drawable drawable2 = this.f407428q;
                    drawable2.setBounds(rect.left - drawable2.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
                    this.f407428q.setAlpha((int) (this.f407431t * 255.0f));
                    this.f407428q.draw(canvas);
                }
            }
            if ((this.f407418d & 2) != 0) {
                if (this.f407436y == 1) {
                    throw new java.lang.RuntimeException("Stub!");
                }
                android.graphics.drawable.Drawable drawable3 = this.f407429r;
                int i17 = rect.right;
                drawable3.setBounds(i17, rect.top, drawable3.getIntrinsicWidth() + i17, rect.bottom);
                this.f407429r.setAlpha((int) (this.f407431t * 255.0f));
                this.f407429r.draw(canvas);
            }
            if ((this.f407418d & 8) != 0) {
                if (this.f407436y == 1) {
                    throw new java.lang.RuntimeException("Stub!");
                }
                android.graphics.drawable.Drawable drawable4 = this.f407430s;
                int i18 = rect.left;
                int i19 = rect.bottom;
                drawable4.setBounds(i18, i19, rect.right, drawable4.getIntrinsicHeight() + i19);
                this.f407430s.setAlpha((int) (this.f407431t * 255.0f));
                this.f407430s.draw(canvas);
            }
            int i27 = (this.f407432u & 16777215) | (((int) ((((-16777216) & r13) >>> 24) * this.f407431t)) << 24);
            int i28 = this.f407435x;
            if ((i28 & 1) != 0) {
                canvas.clipRect(0, 0, view.getLeft(), getHeight());
            } else if ((i28 & 2) != 0) {
                canvas.clipRect(view.getRight(), 0, getRight(), getHeight());
            } else if ((i28 & 8) != 0) {
                canvas.clipRect(view.getLeft(), view.getBottom(), getRight(), getHeight());
            }
            canvas.drawColor(i27);
        }
        return drawChild;
    }

    public void e() {
        this.f407423i = 0.0f;
        this.C = 0.0f;
        this.D = 0.0f;
        this.f407437z = 0L;
        h();
        android.view.View view = this.f407421g;
        if (view != null) {
            view.setTranslationX(0.0f);
            this.f407421g.setTranslationY(0.0f);
        }
        z26.l lVar = this.f407422h;
        lVar.a();
        lVar.o(0);
        if (this.f407424m == 0 && this.f407425n == 0) {
            return;
        }
        this.f407425n = 0;
        this.f407424m = 0;
        requestLayout();
    }

    public void f(int i17, int i18) {
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(i17);
        if ((i18 & 1) != 0) {
            this.f407428q = drawable;
        } else if ((i18 & 4) != 0) {
            this.f407427p = drawable;
        } else if ((i18 & 2) != 0) {
            this.f407429r = drawable;
        } else if ((i18 & 8) != 0) {
            this.f407430s = drawable;
        }
        invalidate();
    }

    /* renamed from: getEdgeSize */
    public int m147193xd719d8d4() {
        return this.f407422h.f551382o;
    }

    /* renamed from: getEnableGesture */
    public boolean m147194xfb9fe290() {
        return this.f407420f;
    }

    /* renamed from: getTargetView */
    public android.view.View m147195xb42a7cc() {
        return this.f407421g;
    }

    public final void h() {
        java.lang.Runnable runnable = this.B;
        if (runnable != null) {
            this.A.mo50300x3fa464aa(runnable);
            this.B = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.f407433v = true;
        android.view.View view = this.f407421g;
        if (view != null) {
            int i28 = this.f407424m;
            view.layout(i28, this.f407425n, view.getMeasuredWidth() + i28, this.f407425n + this.f407421g.getMeasuredHeight());
        }
        this.f407433v = false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f407420f) {
            return false;
        }
        this.f407422h.j(motionEvent);
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f407433v) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: setContentView */
    public void m147196x590ab8fc(android.view.View view) {
        this.f407421g = view;
    }

    /* renamed from: setEdgeSize */
    public void m147197xd1d239e0(int i17) {
        this.f407422h.f551382o = i17;
    }

    /* renamed from: setEdgeTrackingEnabled */
    public void m147198x62a86d4b(int i17) {
        this.f407418d = i17;
        this.f407422h.f551383p = i17;
    }

    /* renamed from: setEnableGesture */
    public void m147199x8e764904(boolean z17) {
        this.f407420f = z17;
    }

    /* renamed from: setMaxVelocity */
    public void m147200x68945c9f(float f17) {
        this.f407422h.f551380m = f17;
    }

    /* renamed from: setMinVelocity */
    public void m147201x40338f8d(float f17) {
        this.f407422h.f551381n = f17;
    }

    /* renamed from: setOrientation */
    public void m147202x1a6eb00e(int i17) {
        this.f407436y = i17;
    }

    /* renamed from: setScrimColor */
    public void m147203xe272883f(int i17) {
        this.f407432u = i17;
        invalidate();
    }

    /* renamed from: setScrollThresHold */
    public void m147204x58aa537c(float f17) {
        if (f17 >= 1.0f || f17 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Threshold value should be between 0 and 1.0");
        }
        this.f407419e = f17;
    }

    @java.lang.Deprecated
    /* renamed from: setSwipeListener */
    public void m147205xcdabb0cc(z26.e eVar) {
        c(eVar);
    }

    public C29141x858f5ab(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f407419e = 0.3f;
        this.f407420f = true;
        this.f407432u = -1728053248;
        this.f407434w = new android.graphics.Rect();
        this.f407436y = 0;
        this.A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        z26.l lVar = new z26.l(getContext(), this, new z26.g(this, null));
        this.f407422h = lVar;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.l0.f173286b, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576084px);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize > 0) {
            m147197xd1d239e0(dimensionPixelSize);
        }
        m147198x62a86d4b(F[obtainStyledAttributes.getInt(0, 0)]);
        int resourceId = obtainStyledAttributes.getResourceId(3, com.p314xaae8f345.mm.R.C30861xcebc809e.brk);
        int resourceId2 = obtainStyledAttributes.getResourceId(5, com.p314xaae8f345.mm.R.C30861xcebc809e.dab);
        int resourceId3 = obtainStyledAttributes.getResourceId(4, com.p314xaae8f345.mm.R.C30861xcebc809e.brl);
        int resourceId4 = obtainStyledAttributes.getResourceId(2, com.p314xaae8f345.mm.R.C30861xcebc809e.brj);
        f(resourceId, 1);
        f(resourceId2, 4);
        f(resourceId3, 2);
        f(resourceId4, 8);
        obtainStyledAttributes.recycle();
        float f17 = getResources().getDisplayMetrics().density * 400.0f;
        lVar.f551381n = f17;
        lVar.f551380m = f17 * 2.0f;
    }
}
