package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.MMGestureGallery */
/* loaded from: classes15.dex */
public class C22506x89e75b89 extends android.widget.Gallery {
    public float A;
    public int B;
    public long C;
    public long D;
    public float E;
    public float F;
    public final android.widget.OverScroller G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.RectF f291587J;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.n5 K;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 L;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s5 M;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.p5 N;
    public boolean P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public android.view.VelocityTracker V;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.o5 W;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.GestureDetector f291588d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a f291589e;

    /* renamed from: f, reason: collision with root package name */
    public int f291590f;

    /* renamed from: g, reason: collision with root package name */
    public int f291591g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.j6 f291592h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.j6 f291593i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.j6 f291594m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f291595n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f291596o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f291597p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f291598p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f291599q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f291600r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f291601s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f291602t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f291603u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f291604v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f291605w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f291606x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f291607y;

    /* renamed from: z, reason: collision with root package name */
    public float f291608z;

    public C22506x89e75b89(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f291595n = false;
        this.f291596o = false;
        this.f291597p = false;
        this.f291599q = false;
        this.f291600r = false;
        this.f291601s = false;
        this.f291602t = false;
        this.f291603u = false;
        this.f291604v = false;
        this.f291605w = false;
        this.f291606x = false;
        this.f291607y = false;
        this.B = 0;
        this.C = 0L;
        this.D = 0L;
        this.E = 0.0f;
        this.F = 0.0f;
        this.f291587J = new android.graphics.RectF();
        this.L = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.P = true;
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = false;
        this.T = false;
        this.U = false;
        this.f291598p0 = false;
        setStaticTransformationsEnabled(true);
    }

    public static void a(com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89, long j17) {
        c22506x89e75b89.f291592h.mo50303x856b99f0(1);
        com.p314xaae8f345.mm.ui.p2740x696c9db.j6 j6Var = c22506x89e75b89.f291592h;
        j6Var.f292046b = j17;
        j6Var.mo50307xb9e94560(1, j17);
    }

    public final void b(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        try {
            float x17 = motionEvent.getX() - motionEvent2.getX();
            float y17 = motionEvent.getY() - motionEvent2.getY();
            boolean z17 = motionEvent.getX() - motionEvent2.getX() < 0.0f;
            float abs = java.lang.Math.abs(x17);
            float abs2 = java.lang.Math.abs(y17);
            if (java.lang.Math.abs(f17) > 500.0f && abs >= 60.0f && abs >= abs2) {
                if (z17) {
                    onKeyDown(21, null);
                } else {
                    onKeyDown(22, null);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final boolean c(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        if (this.f291597p || this.f291596o) {
            return true;
        }
        this.f291599q = true;
        return super.onScroll(motionEvent, motionEvent2, f17, f18);
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.OverScroller overScroller = this.G;
        overScroller.computeScrollOffset();
        if (this.f291589e != null && overScroller.computeScrollOffset()) {
            overScroller.getCurrX();
            overScroller.getCurrY();
            int currX = overScroller.getCurrX() - this.H;
            int currY = overScroller.getCurrY() - this.I;
            this.H = overScroller.getCurrX();
            this.I = overScroller.getCurrY();
            float mo45732x7520af94 = this.f291589e.mo45732x7520af94() * this.f291589e.mo79182x97cbed21();
            float mo45732x7520af942 = this.f291589e.mo45732x7520af94() * this.f291589e.mo79180x47e2bd2c();
            float[] fArr = new float[9];
            this.f291589e.getImageMatrix().getValues(fArr);
            float f17 = mo45732x7520af94 + fArr[2];
            float f18 = fArr[5] + mo45732x7520af942;
            android.graphics.RectF rectF = this.f291587J;
            if (currX < 0 && currX < rectF.right - java.lang.Math.round(f17)) {
                currX = (int) (rectF.right - java.lang.Math.round(f17));
            }
            if (currX > 0 && currX > rectF.left - java.lang.Math.round(r5)) {
                currX = (int) (rectF.left - java.lang.Math.round(r5));
            }
            if (currY < 0 && currY < rectF.bottom - java.lang.Math.round(f18)) {
                currY = (int) (rectF.bottom - java.lang.Math.round(f18));
            }
            if (currY > 0 && currY > rectF.top - java.lang.Math.round(r4)) {
                currY = (int) (rectF.top - java.lang.Math.round(r4));
            }
            if (java.lang.Math.round(r5) >= rectF.left || java.lang.Math.round(f17) <= rectF.right) {
                currX = 0;
            } else if (java.lang.Math.round(r4) >= rectF.top || java.lang.Math.round(f18) <= rectF.bottom) {
                currY = 0;
            }
            this.f291589e.c(currX, mo45732x7520af942 >= ((float) this.f291591g) ? currY : 0);
            postInvalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(float r8, float r9, android.view.View r10, float r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89.d(float, float, android.view.View, float):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGestureGallery", "MMGallery dispatchTouchEvent " + java.lang.String.valueOf(motionEvent.getActionMasked()));
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* renamed from: getScreenWidth */
    public int m81087xd6cf2784() {
        return this.f291590f;
    }

    @Override // android.widget.AbsSpinner, android.widget.AdapterView
    public android.view.View getSelectedView() {
        android.view.View selectedView = super.getSelectedView();
        if (selectedView == null) {
            return null;
        }
        android.view.View findViewById = selectedView.findViewById(com.p314xaae8f345.mm.R.id.jut);
        android.view.View findViewById2 = selectedView.findViewById(com.p314xaae8f345.mm.R.id.pr8);
        return (findViewById == null || findViewById.getVisibility() != 0) ? (findViewById2 == null || findViewById2.getVisibility() != 0) ? selectedView : findViewById2 : findViewById;
    }

    /* renamed from: getSingleClickOverListener */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s5 m81088x25b49bb2() {
        return this.M;
    }

    /* renamed from: getXDown */
    public int m81089x75594384() {
        return (int) this.Q;
    }

    /* renamed from: getYDown */
    public int m81090x75675b05() {
        return (int) this.R;
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    @Override // android.widget.Gallery, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        android.widget.OverScroller overScroller = this.G;
        if (overScroller != null) {
            overScroller.forceFinished(true);
        }
        return super.onDown(motionEvent);
    }

    @Override // android.widget.Gallery, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        android.view.View selectedView = getSelectedView();
        if (selectedView instanceof android.view.ViewGroup) {
            android.view.View findViewById = selectedView.findViewById(com.p314xaae8f345.mm.R.id.h9e);
            if (findViewById == null || findViewById.getVisibility() == 8) {
                b(motionEvent, motionEvent2, f17, f18);
                return false;
            }
            selectedView = findViewById.findViewById(com.p314xaae8f345.mm.R.id.h88);
            if (selectedView == null) {
                b(motionEvent, motionEvent2, f17, f18);
                return false;
            }
        }
        if (selectedView instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) selectedView;
            float mo45732x7520af94 = c21524xecd57b9a.mo45732x7520af94() * c21524xecd57b9a.mo79182x97cbed21();
            float mo45732x7520af942 = c21524xecd57b9a.mo45732x7520af94() * c21524xecd57b9a.mo79180x47e2bd2c();
            if (c21524xecd57b9a.F || c21524xecd57b9a.G || ((int) mo45732x7520af94) > this.f291590f || ((int) mo45732x7520af942) > this.f291591g) {
                float[] fArr = new float[9];
                c21524xecd57b9a.getImageMatrix().getValues(fArr);
                float f19 = fArr[2];
                float f27 = f19 + mo45732x7520af94;
                float f28 = fArr[5] + mo45732x7520af942;
                float round = java.lang.Math.round(f19);
                android.graphics.RectF rectF = this.f291587J;
                float f29 = 0.0f;
                float f37 = (round >= rectF.left || ((float) java.lang.Math.round(f27)) <= rectF.right) ? 0.0f : f17;
                if (java.lang.Math.round(r6) < rectF.top && java.lang.Math.round(f28) > rectF.bottom) {
                    f29 = f18;
                }
                if (java.lang.Math.round(r6) < rectF.top) {
                    this.f291598p0 = true;
                } else {
                    this.f291598p0 = false;
                }
                float f38 = rectF.right;
                int i17 = (int) (f38 - mo45732x7520af94);
                int i18 = (int) (f38 + mo45732x7520af94);
                float f39 = rectF.bottom;
                android.widget.OverScroller overScroller = this.G;
                overScroller.forceFinished(true);
                overScroller.fling(overScroller.getCurrX(), overScroller.getCurrY(), (int) f37, (int) f29, i17, i18, (int) (f39 - mo45732x7520af942), (int) (f39 + mo45732x7520af942), 0, 0);
            }
        }
        if (this.f291595n) {
            return true;
        }
        b(motionEvent, motionEvent2, f17, f18);
        return true;
    }

    @Override // android.widget.Gallery, android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        if (z17) {
            super.onFocusChanged(z17, i17, rect);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View selectedView = getSelectedView();
        return (selectedView instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) && !((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) selectedView).m45730xecf7a936();
    }

    @Override // android.widget.Gallery, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        this.U = true;
        super.onLongPress(motionEvent);
    }

    @Override // android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f291590f = android.view.View.MeasureSpec.getSize(i17);
        int size = android.view.View.MeasureSpec.getSize(i18);
        this.f291591g = size;
        this.f291587J.set(0.0f, 0.0f, this.f291590f, size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0187, code lost:
    
        if (r14 < r1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0278, code lost:
    
        if (r12 < (r1 * 0.3f)) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x029e, code lost:
    
        r2 = r19 * 0.3f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02d0, code lost:
    
        if (r10 < (r1 * 0.3f)) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02f6, code lost:
    
        r1 = 0.3f * r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02f4, code lost:
    
        if (r14 < r1) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x029c, code lost:
    
        if (r13 < r1) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0163, code lost:
    
        if (r10 < (r1 * 0.3f)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0189, code lost:
    
        r2 = r20 * 0.3f;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0198  */
    @Override // android.widget.Gallery, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onScroll(android.view.MotionEvent r17, android.view.MotionEvent r18, float r19, float r20) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.widget.Gallery, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f291588d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/tools/MMGestureGallery", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/ui/tools/MMGestureGallery", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        motionEvent.getAction();
        if (motionEvent.getAction() == 1) {
            android.view.View selectedView = getSelectedView();
            if (selectedView instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) selectedView;
                this.f291589e = c21524xecd57b9a;
                float mo45732x7520af94 = c21524xecd57b9a.mo45732x7520af94() * this.f291589e.mo79182x97cbed21();
                float mo45732x7520af942 = this.f291589e.mo45732x7520af94() * this.f291589e.mo79180x47e2bd2c();
                if (((int) mo45732x7520af94) > this.f291590f || ((int) mo45732x7520af942) > this.f291591g) {
                    this.f291589e.getImageMatrix().getValues(new float[9]);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("dktest", "onTouchEvent width:" + mo45732x7520af94 + "height:" + mo45732x7520af942);
                }
            }
        }
        computeScroll();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        if (z17) {
            super.onWindowFocusChanged(z17);
        }
    }

    /* renamed from: setGalleryScaleListener */
    public void mo55654x9bfee16e(com.p314xaae8f345.mm.ui.p2740x696c9db.o5 o5Var) {
        this.W = o5Var;
    }

    /* renamed from: setLoadQuit */
    public void m81091xe49316d7(boolean z17) {
        this.P = z17;
    }

    /* renamed from: setLongClickOverListener */
    public void mo55655xf8a6a4f2(com.p314xaae8f345.mm.ui.p2740x696c9db.p5 p5Var) {
        this.N = p5Var;
    }

    /* renamed from: setScrollLeftRightListener */
    public void m81092x4a939c1a(com.p314xaae8f345.mm.ui.p2740x696c9db.r5 r5Var) {
    }

    /* renamed from: setSingleClickOverListener */
    public void mo55657x3be48126(com.p314xaae8f345.mm.ui.p2740x696c9db.s5 s5Var) {
        this.M = s5Var;
    }

    public C22506x89e75b89(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f291595n = false;
        this.f291596o = false;
        this.f291597p = false;
        this.f291599q = false;
        this.f291600r = false;
        this.f291601s = false;
        this.f291602t = false;
        this.f291603u = false;
        this.f291604v = false;
        this.f291605w = false;
        this.f291606x = false;
        this.f291607y = false;
        this.B = 0;
        this.C = 0L;
        this.D = 0L;
        this.E = 0.0f;
        this.F = 0.0f;
        this.f291587J = new android.graphics.RectF();
        this.L = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.P = true;
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = false;
        this.T = false;
        this.U = false;
        this.f291598p0 = false;
        setStaticTransformationsEnabled(true);
        this.f291588d = new android.view.GestureDetector(context, new com.p314xaae8f345.mm.ui.p2740x696c9db.q5(this, null));
        this.f291592h = new com.p314xaae8f345.mm.ui.p2740x696c9db.j6(new java.lang.ref.WeakReference(this));
        this.f291593i = new com.p314xaae8f345.mm.ui.p2740x696c9db.j6(new java.lang.ref.WeakReference(this));
        this.f291594m = new com.p314xaae8f345.mm.ui.p2740x696c9db.j6(new java.lang.ref.WeakReference(this));
        this.G = new android.widget.OverScroller(context, new android.view.animation.DecelerateInterpolator(2.0f));
        float f17 = getResources().getDisplayMetrics().density;
        setOnTouchListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.m5(this));
    }
}
