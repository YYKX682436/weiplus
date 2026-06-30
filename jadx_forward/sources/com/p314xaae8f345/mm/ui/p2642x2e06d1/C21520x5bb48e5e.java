package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMViewPager */
/* loaded from: classes15.dex */
public class C21520x5bb48e5e extends com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d {
    public int A;
    public android.view.View.OnTouchListener A1;
    public int B;
    public final android.graphics.RectF C;
    public boolean D;
    public db5.y7 E;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 F;
    public db5.d8 G;
    public db5.a8 H;
    public db5.x7 I;

    /* renamed from: J, reason: collision with root package name */
    public db5.c8 f279140J;
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleChangeReportListener K;
    public boolean L;
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener M;
    public final android.view.GestureDetector N;
    public float P;
    public float Q;
    public android.view.VelocityTracker R;
    public boolean S;
    public android.view.MotionEvent T;
    public float U;
    public float V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public db5.f0 f279141d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f f279142e;

    /* renamed from: f, reason: collision with root package name */
    public int f279143f;

    /* renamed from: g, reason: collision with root package name */
    public int f279144g;

    /* renamed from: h, reason: collision with root package name */
    public int f279145h;

    /* renamed from: i, reason: collision with root package name */
    public int f279146i;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f279147l1;

    /* renamed from: m, reason: collision with root package name */
    public final db5.o8 f279148m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f279149n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f279150o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f279151p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f279152p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f279153p1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f279154q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f279155r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f279156s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f279157t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f279158u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f279159v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f279160w;

    /* renamed from: x, reason: collision with root package name */
    public float f279161x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f279162x0;

    /* renamed from: x1, reason: collision with root package name */
    public db5.z7 f279163x1;

    /* renamed from: y, reason: collision with root package name */
    public float f279164y;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.VelocityTracker f279165y0;

    /* renamed from: y1, reason: collision with root package name */
    public final android.view.GestureDetector.SimpleOnGestureListener f279166y1;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.OverScroller f279167z;

    /* renamed from: z1, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f279168z1;

    public C21520x5bb48e5e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f279143f = -1;
        this.f279144g = -1;
        this.f279149n = false;
        this.f279150o = false;
        this.f279151p = false;
        this.f279154q = false;
        this.f279155r = false;
        this.f279156s = false;
        this.f279157t = false;
        this.f279158u = false;
        this.f279159v = false;
        this.f279160w = false;
        this.C = new android.graphics.RectF();
        this.D = false;
        this.F = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.L = false;
        this.M = null;
        this.P = 0.0f;
        this.R = null;
        this.S = false;
        this.U = 0.0f;
        this.V = 0.0f;
        this.W = false;
        this.f279152p0 = false;
        this.f279162x0 = false;
        this.f279147l1 = true;
        this.f279153p1 = false;
        this.f279166y1 = new db5.b8(this, null);
        this.f279168z1 = new db5.w7(this);
        setStaticTransformationsEnabled(true);
    }

    /* renamed from: getCurrentX */
    private int m79154x9e262f75() {
        if (m80829xf939df19() == null) {
            return -1;
        }
        return getScrollX() - (this.f279145h * ((m80829xf939df19().mo8338x7444f759() - m80830xfda78ef6()) - 1));
    }

    /* renamed from: getSelectedMultiTouchImageView */
    private com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a m79155x37e687e9() {
        return ((db5.p8) m80829xf939df19()).c(m80830xfda78ef6(), true);
    }

    /* renamed from: getSelectedWxImageView */
    private com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f m79156xe22ee3ee() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f f17 = ((db5.p8) m80829xf939df19()).f(m80830xfda78ef6(), true);
        if (f17 != null) {
            return f17;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d, android.view.View
    public void computeScroll() {
        super.computeScroll();
        db5.f0 f0Var = this.f279141d;
        if (f0Var == null) {
            return;
        }
        float mo45732x7520af94 = f0Var.mo45732x7520af94() * this.f279141d.mo79182x97cbed21();
        float mo45732x7520af942 = this.f279141d.mo45732x7520af94() * this.f279141d.mo79180x47e2bd2c();
        android.widget.OverScroller overScroller = this.f279167z;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX() - this.A;
            int currY = overScroller.getCurrY() - this.B;
            this.A = overScroller.getCurrX();
            this.B = overScroller.getCurrY();
            float[] fArr = new float[9];
            this.f279141d.mo79307x5037c3c6().getValues(fArr);
            float f17 = mo45732x7520af94 + fArr[2];
            float f18 = fArr[5] + mo45732x7520af942;
            android.graphics.RectF rectF = this.C;
            if (currX < 0 && currX < rectF.right - java.lang.Math.round(f17)) {
                currX = (int) (rectF.right - java.lang.Math.round(f17));
            }
            if (currX > 0 && currX > rectF.left - java.lang.Math.round(r5)) {
                currX = (int) (rectF.left - java.lang.Math.round(r5));
            }
            if (currY < 0 && currY < rectF.bottom - java.lang.Math.round(f18)) {
                currY = (int) (rectF.bottom - java.lang.Math.round(f18));
            }
            if (currY > 0 && currY > rectF.top - java.lang.Math.round(r2)) {
                currY = (int) (rectF.top - java.lang.Math.round(r2));
            }
            if (java.lang.Math.round(r5) >= rectF.left || java.lang.Math.round(f17) <= rectF.right) {
                currX = 0;
            } else if (java.lang.Math.round(r2) >= rectF.top || java.lang.Math.round(f18) <= rectF.bottom) {
                currY = 0;
            }
            this.f279141d.c(currX, mo45732x7520af942 >= ((float) this.f279146i) ? currY : 0);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            motionEvent.getAction();
            if (this.f279142e == null) {
                p();
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMViewPager", e17, "MMViewPager dispatchTouchEvent exception", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d
    /* renamed from: firstItemPosForDetermine */
    public int mo79157x9692759b() {
        int b17 = ((db5.p8) m80829xf939df19()).b();
        return b17 >= 0 ? b17 : super.mo79157x9692759b();
    }

    /* renamed from: getScreenWidth */
    public int m79158xd6cf2784() {
        return this.f279145h;
    }

    /* renamed from: getSelectedImageView */
    public db5.f0 m79159xba51a58f() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a m79155x37e687e9 = m79155x37e687e9();
        return m79155x37e687e9 != null ? m79155x37e687e9 : m79156xe22ee3ee();
    }

    /* renamed from: getSelectedView */
    public android.view.View m79160xf8606e56() {
        return ((db5.p8) m80829xf939df19()).e(m80830xfda78ef6());
    }

    /* renamed from: getXDown */
    public int m79161x75594384() {
        return (int) this.U;
    }

    /* renamed from: getYDown */
    public int m79162x75675b05() {
        return (int) this.V;
    }

    @Override // android.view.View
    public boolean isFocused() {
        return super.isFocused();
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d
    /* renamed from: lastItemPosForDetermine */
    public int mo79163x1da6eff5() {
        int g17 = ((db5.p8) m80829xf939df19()).g();
        return g17 >= 0 ? g17 : super.mo79163x1da6eff5();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        if (z17) {
            super.onFocusChanged(z17, i17, rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.viewpager.widget.a r0 = r6.m80829xf939df19()
            db5.p8 r0 = (db5.p8) r0
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.a()
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2 = 0
            if (r0 != 0) goto L13
            return r2
        L13:
            boolean r0 = super.onInterceptTouchEvent(r7)
            r6.S = r2
            androidx.viewpager.widget.a r3 = r6.m80829xf939df19()
            db5.p8 r3 = (db5.p8) r3
            r3.getClass()
            db5.f0 r3 = r6.m79159xba51a58f()
            if (r3 == 0) goto L2e
            boolean r3 = r3 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f
            if (r3 == 0) goto L2e
            r3 = r1
            goto L2f
        L2e:
            r3 = r2
        L2f:
            if (r3 != 0) goto L32
            return r0
        L32:
            if (r0 == 0) goto L35
            return r0
        L35:
            android.view.VelocityTracker r0 = r6.R
            if (r0 != 0) goto L3f
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.R = r0
        L3f:
            android.view.VelocityTracker r0 = r6.R
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.R
            r3 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r3)
            float r3 = r0.getXVelocity()
            int r3 = (int) r3
            float r0 = r0.getYVelocity()
            int r0 = (int) r0
            int r4 = r7.getAction()
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 == 0) goto La0
            if (r4 == r1) goto La9
            r5 = 2
            if (r4 == r5) goto L63
            goto La9
        L63:
            boolean r4 = r6.L
            if (r4 == 0) goto L68
            goto Laa
        L68:
            float r4 = r7.getRawX()
            float r5 = r6.Q
            float r4 = r4 - r5
            r7.getRawY()
            float r4 = java.lang.Math.abs(r4)
            r5 = 1132068864(0x437a0000, float:250.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto La9
            int r4 = java.lang.Math.abs(r0)
            int r3 = java.lang.Math.abs(r3)
            if (r4 <= r3) goto La9
            int r0 = java.lang.Math.abs(r0)
            if (r0 <= 0) goto La9
            int r0 = r7.getAction()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "MicroMsg.MMViewPager"
            java.lang.String r3 = "ViewPager onInterceptTouchEvent action: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3, r0)
            goto Laa
        La0:
            float r0 = r7.getRawX()
            r6.Q = r0
            r7.getRawY()
        La9:
            r1 = r2
        Laa:
            if (r1 == 0) goto Lc2
            float r0 = r7.getRawX()
            r6.U = r0
            float r7 = r7.getRawY()
            r6.V = r7
            com.tencent.mm.ui.base.WxImageView r7 = r6.f279142e
            if (r7 == 0) goto Lc2
            float r7 = r7.mo45732x7520af94()
            r6.f279164y = r7
        Lc2:
            r6.S = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f279145h = android.view.View.MeasureSpec.getSize(i17);
        int size = android.view.View.MeasureSpec.getSize(i18);
        this.f279146i = size;
        this.C.set(0.0f, 0.0f, this.f279145h, size);
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        db5.p8 p8Var = (db5.p8) m80829xf939df19();
        if (p8Var != null ? p8Var.a() : true) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        if (z17) {
            super.onWindowFocusChanged(z17);
        }
    }

    public final void p() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f m79156xe22ee3ee = m79156xe22ee3ee();
        this.f279142e = m79156xe22ee3ee;
        if (m79156xe22ee3ee != null) {
            m79156xe22ee3ee.m45741x540a5741(this.f279166y1);
            this.f279142e.setOnLongClickListener(this.f279168z1);
            android.view.View.OnTouchListener onTouchListener = this.A1;
            if (onTouchListener != null) {
                this.f279142e.k(onTouchListener);
            }
        }
    }

    public final boolean q(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2) {
        return (motionEvent == null || motionEvent2 == null || motionEvent.getX() - motionEvent2.getX() >= 0.0f) ? false : true;
    }

    public final void r(long j17) {
        db5.o8 o8Var = this.f279148m;
        o8Var.mo50303x856b99f0(1);
        o8Var.f309995b = j17;
        o8Var.mo50307xb9e94560(1, j17);
    }

    public final boolean s(float f17, android.view.View view, float f18) {
        if (m80829xf939df19().mo8339xb2fa47d2(view) == mo79157x9692759b() || this.L) {
            db5.f0 f0Var = this.f279141d;
            if (f0Var instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
                float translationX = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var).getTranslationX();
                float f19 = f18 * 0.3f;
                if (f19 < 0.0f && translationX - f19 > 0.0f) {
                    this.f279155r = true;
                }
                if (!this.f279155r) {
                    return false;
                }
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) this.f279141d).y(-f19, 0.0f);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) this.f279141d).m45737x3a5986f(true);
                return true;
            }
            boolean z17 = this.f279155r;
            android.graphics.RectF rectF = this.C;
            if (z17) {
                if (f18 < 0.0f) {
                    float f27 = rectF.left;
                    if (f17 <= f27) {
                        f0Var.c(-f18, 0.0f);
                    } else {
                        if (f17 > f27 && f17 < this.f279145h * 0.3f) {
                            f0Var.c(-(f18 * 0.3f), 0.0f);
                            return true;
                        }
                        if (this.L && f17 > f27) {
                            f0Var.c(-(f18 * 0.3f), 0.0f);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (f18 < 0.0f) {
                if (f17 > 0.0f) {
                    this.f279155r = true;
                }
                float f28 = rectF.left;
                if (f17 <= f28) {
                    f0Var.c(-f18, 0.0f);
                } else {
                    if (f17 > f28 && f17 < this.f279145h * 0.3f) {
                        f0Var.c(-(f18 * 0.3f), 0.0f);
                        return true;
                    }
                    if (this.L && f17 > f28) {
                        f0Var.c(-(f18 * 0.3f), 0.0f);
                        return true;
                    }
                }
            }
        }
        if (!this.f279154q && !this.f279151p) {
            this.f279155r = false;
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d
    /* renamed from: setAdapter */
    public void mo79164x6cab2c8d(p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar) {
        if (!(aVar instanceof db5.p8)) {
            throw new java.lang.IllegalArgumentException("must be MMViewPagerAdapter");
        }
        super.mo79164x6cab2c8d(aVar);
    }

    /* renamed from: setDoubleClickListener */
    public void m79165xf6f0b249(db5.x7 x7Var) {
        this.I = x7Var;
    }

    /* renamed from: setEnableGalleryPullToExitStrictly */
    public void m79166x98a47301(boolean z17) {
        this.f279153p1 = z17;
    }

    /* renamed from: setEnableGalleryScale */
    public void m79167xa8f8963d(boolean z17) {
        this.f279147l1 = z17;
    }

    /* renamed from: setGalleryScaleListener */
    public void m79168x9bfee16e(db5.z7 z7Var) {
        this.f279163x1 = z7Var;
    }

    /* renamed from: setLongClickOverListener */
    public void m79169xf8a6a4f2(db5.a8 a8Var) {
        this.H = a8Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d
    /* renamed from: setOnPageChangeListener */
    public void mo79170x2d3430b4(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener) {
        this.M = onPageChangeListener;
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.A1 = onTouchListener;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = this.f279142e;
        if (c21537x5f41189f != null) {
            c21537x5f41189f.k(onTouchListener);
        }
    }

    /* renamed from: setScaleChangeReportListener */
    public void m79171xf8b16000(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleChangeReportListener scaleChangeReportListener) {
        this.K = scaleChangeReportListener;
    }

    /* renamed from: setScaleFinishListener */
    public void m79172x7f47da8f(db5.c8 c8Var) {
        this.f279140J = c8Var;
    }

    /* renamed from: setSingleClickOverListener */
    public void m79173x3be48126(db5.d8 d8Var) {
        this.G = d8Var;
    }

    /* renamed from: setSingleMode */
    public void m79174x52d6d40d(boolean z17) {
        this.L = z17;
        if (z17) {
            return;
        }
        this.f279149n = false;
    }

    /* renamed from: setVideoDownNewLogic */
    public void m79175xb5ba3c39(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMViewPager", "setVideoDownNewLogic: %b", java.lang.Boolean.valueOf(z17));
        this.D = z17;
    }

    public final boolean t(float f17, android.view.View view, float f18) {
        if (m80829xf939df19().mo8339xb2fa47d2(view) == mo79163x1da6eff5() || this.L) {
            db5.f0 f0Var = this.f279141d;
            if (f0Var instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
                float translationX = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) f0Var).getTranslationX();
                float f19 = f18 * 0.3f;
                if (f19 > 0.0f && translationX - f19 < 0.0f) {
                    this.f279156s = true;
                }
                if (!this.f279156s) {
                    return false;
                }
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) this.f279141d).y(-f19, 0.0f);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) this.f279141d).m45737x3a5986f(true);
                return true;
            }
            if (this.f279156s) {
                if (f18 > 0.0f) {
                    int i17 = this.f279145h;
                    if (f17 >= i17) {
                        f0Var.c(-f18, 0.0f);
                    } else {
                        if (f17 > i17 * 0.7f && f17 < i17) {
                            f0Var.c(-(f18 * 0.3f), 0.0f);
                            return true;
                        }
                        if (this.L && f17 < i17) {
                            f0Var.c(-(f18 * 0.3f), 0.0f);
                        }
                    }
                }
                return false;
            }
            if (f18 > 0.0f) {
                int i18 = this.f279145h;
                if (f17 < i18) {
                    this.f279156s = true;
                }
                if (f17 >= i18) {
                    f0Var.c(-f18, 0.0f);
                } else {
                    if (f17 > i18 * 0.7f && f17 < i18) {
                        f0Var.c(-(f18 * 0.3f), 0.0f);
                        return true;
                    }
                    if (this.L && f17 < i18) {
                        f0Var.c(-(f18 * 0.3f), 0.0f);
                    }
                }
            }
        }
        if (!this.f279154q && !this.f279151p) {
            this.f279156s = false;
        }
        return false;
    }

    public final boolean u(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        if (this.f279151p) {
            return true;
        }
        this.f279154q = true;
        return false;
    }

    public final boolean v(float f17, float f18, android.view.View view, float f19) {
        return t(f18, view, f19) || s(f17, view, f19);
    }

    public C21520x5bb48e5e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279143f = -1;
        this.f279144g = -1;
        this.f279149n = false;
        this.f279150o = false;
        this.f279151p = false;
        this.f279154q = false;
        this.f279155r = false;
        this.f279156s = false;
        this.f279157t = false;
        this.f279158u = false;
        this.f279159v = false;
        this.f279160w = false;
        this.C = new android.graphics.RectF();
        this.D = false;
        this.F = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.L = false;
        this.M = null;
        this.P = 0.0f;
        this.R = null;
        this.S = false;
        this.U = 0.0f;
        this.V = 0.0f;
        this.W = false;
        this.f279152p0 = false;
        this.f279162x0 = false;
        this.f279147l1 = true;
        this.f279153p1 = false;
        this.f279166y1 = new db5.b8(this, null);
        this.f279168z1 = new db5.w7(this);
        setStaticTransformationsEnabled(true);
        this.f279148m = new db5.o8(new java.lang.ref.WeakReference(this));
        this.N = new android.view.GestureDetector(context, new db5.b8(this, null));
        this.f279167z = new android.widget.OverScroller(context, new android.view.animation.DecelerateInterpolator(2.0f));
        float f17 = getResources().getDisplayMetrics().density;
        super.mo79170x2d3430b4(new db5.u7(this));
        super.setOnTouchListener(new db5.v7(this));
    }
}
