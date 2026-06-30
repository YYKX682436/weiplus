package p012xc85e97e9.p080xa1c8a596.p082xd1075a44;

/* loaded from: classes14.dex */
public class l {

    /* renamed from: w, reason: collision with root package name */
    public static final android.view.animation.Interpolator f92652w = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.i();

    /* renamed from: a, reason: collision with root package name */
    public int f92653a;

    /* renamed from: b, reason: collision with root package name */
    public int f92654b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f92656d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f92657e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f92658f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f92659g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f92660h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f92661i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f92662j;

    /* renamed from: k, reason: collision with root package name */
    public int f92663k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.VelocityTracker f92664l;

    /* renamed from: m, reason: collision with root package name */
    public final float f92665m;

    /* renamed from: n, reason: collision with root package name */
    public float f92666n;

    /* renamed from: o, reason: collision with root package name */
    public final int f92667o;

    /* renamed from: p, reason: collision with root package name */
    public int f92668p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.OverScroller f92669q;

    /* renamed from: r, reason: collision with root package name */
    public final p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k f92670r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f92671s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f92672t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.ViewGroup f92673u;

    /* renamed from: c, reason: collision with root package name */
    public int f92655c = -1;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f92674v = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.j(this);

    public l(android.content.Context context, android.view.ViewGroup viewGroup, p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k kVar) {
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("Parent view may not be null");
        }
        if (kVar == null) {
            throw new java.lang.IllegalArgumentException("Callback may not be null");
        }
        this.f92673u = viewGroup;
        this.f92670r = kVar;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f92667o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f92654b = viewConfiguration.getScaledTouchSlop();
        this.f92665m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f92666n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f92669q = new android.widget.OverScroller(context, f92652w);
    }

    public static p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l i(android.view.ViewGroup viewGroup, float f17, p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k kVar) {
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l(viewGroup.getContext(), viewGroup, kVar);
        lVar.f92654b = (int) (lVar.f92654b * (1.0f / f17));
        return lVar;
    }

    public void a() {
        b();
        if (this.f92653a == 2) {
            android.widget.OverScroller overScroller = this.f92669q;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX2 = overScroller.getCurrX();
            int currY2 = overScroller.getCurrY();
            this.f92670r.i(this.f92671s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        r(0);
    }

    public void b() {
        this.f92655c = -1;
        float[] fArr = this.f92656d;
        if (fArr != null) {
            java.util.Arrays.fill(fArr, 0.0f);
            java.util.Arrays.fill(this.f92657e, 0.0f);
            java.util.Arrays.fill(this.f92658f, 0.0f);
            java.util.Arrays.fill(this.f92659g, 0.0f);
            java.util.Arrays.fill(this.f92660h, 0);
            java.util.Arrays.fill(this.f92661i, 0);
            java.util.Arrays.fill(this.f92662j, 0);
            this.f92663k = 0;
        }
        android.view.VelocityTracker velocityTracker = this.f92664l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f92664l = null;
        }
    }

    public void c(android.view.View view, int i17) {
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = this.f92673u;
        if (parent != viewGroup) {
            throw new java.lang.IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f92671s = view;
        this.f92655c = i17;
        this.f92670r.g(view, i17);
        r(1);
    }

    public final boolean d(float f17, float f18, int i17, int i18) {
        float abs = java.lang.Math.abs(f17);
        float abs2 = java.lang.Math.abs(f18);
        if ((this.f92660h[i17] & i18) != i18 || (this.f92668p & i18) == 0 || (this.f92662j[i17] & i18) == i18 || (this.f92661i[i17] & i18) == i18) {
            return false;
        }
        int i19 = this.f92654b;
        if (abs <= i19 && abs2 <= i19) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f92670r.getClass();
        }
        return (this.f92661i[i17] & i18) == 0 && abs > ((float) this.f92654b);
    }

    public final boolean e(android.view.View view, float f17, float f18) {
        if (view == null) {
            return false;
        }
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k kVar = this.f92670r;
        boolean z17 = kVar.c(view) > 0;
        boolean z18 = kVar.d(view) > 0;
        if (!z17 || !z18) {
            return z17 ? java.lang.Math.abs(f17) > ((float) this.f92654b) : z18 && java.lang.Math.abs(f18) > ((float) this.f92654b);
        }
        float f19 = (f17 * f17) + (f18 * f18);
        int i17 = this.f92654b;
        return f19 > ((float) (i17 * i17));
    }

    public final void f(int i17) {
        float[] fArr = this.f92656d;
        if (fArr != null) {
            int i18 = this.f92663k;
            int i19 = 1 << i17;
            if ((i19 & i18) != 0) {
                fArr[i17] = 0.0f;
                this.f92657e[i17] = 0.0f;
                this.f92658f[i17] = 0.0f;
                this.f92659g[i17] = 0.0f;
                this.f92660h[i17] = 0;
                this.f92661i[i17] = 0;
                this.f92662j[i17] = 0;
                this.f92663k = (~i19) & i18;
            }
        }
    }

    public final int g(int i17, int i18, int i19) {
        if (i17 == 0) {
            return 0;
        }
        float width = this.f92673u.getWidth() / 2;
        float sin = width + (((float) java.lang.Math.sin((java.lang.Math.min(1.0f, java.lang.Math.abs(i17) / r0) - 0.5f) * 0.47123894f)) * width);
        int abs = java.lang.Math.abs(i18);
        return java.lang.Math.min(abs > 0 ? java.lang.Math.round(java.lang.Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((java.lang.Math.abs(i17) / i19) + 1.0f) * 256.0f), 600);
    }

    public boolean h(boolean z17) {
        if (this.f92653a == 2) {
            android.widget.OverScroller overScroller = this.f92669q;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f92671s.getLeft();
            int top = currY - this.f92671s.getTop();
            if (left != 0) {
                android.view.View view = this.f92671s;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                android.view.View view2 = this.f92671s;
                java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f92670r.i(this.f92671s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z17) {
                    this.f92673u.post(this.f92674v);
                } else {
                    r(0);
                }
            }
        }
        return this.f92653a == 2;
    }

    public android.view.View j(int i17, int i18) {
        android.view.ViewGroup viewGroup = this.f92673u;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f92670r.getClass();
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if (i17 >= childAt.getLeft() && i17 < childAt.getRight() && i18 >= childAt.getTop() && i18 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f92671s
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f92671s
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f92669q
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.r(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f92671s
            float r0 = r10.f92666n
            int r0 = (int) r0
            float r6 = r10.f92665m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            float r0 = r10.f92666n
            int r0 = (int) r0
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3f
            goto L46
        L3f:
            if (r7 <= r6) goto L47
            if (r14 <= 0) goto L45
            r14 = r6
            goto L47
        L45:
            int r11 = -r6
        L46:
            r14 = r11
        L47:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L60
            float r11 = (float) r6
            float r6 = (float) r8
            goto L62
        L60:
            float r11 = (float) r11
            float r6 = (float) r9
        L62:
            float r11 = r11 / r6
            if (r14 == 0) goto L68
            float r0 = (float) r7
            float r6 = (float) r8
            goto L6a
        L68:
            float r0 = (float) r0
            float r6 = (float) r9
        L6a:
            float r0 = r0 / r6
            androidx.customview.widget.k r6 = r10.f92670r
            int r7 = r6.c(r12)
            int r13 = r10.g(r4, r13, r7)
            int r12 = r6.d(r12)
            int r12 = r10.g(r5, r14, r12)
            float r13 = (float) r13
            float r13 = r13 * r11
            float r11 = (float) r12
            float r11 = r11 * r0
            float r13 = r13 + r11
            int r6 = (int) r13
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.r(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l.k(int, int, int, int):boolean");
    }

    public boolean l(android.view.View view, int i17, int i18) {
        return view != null && i17 >= view.getLeft() && i17 < view.getRight() && i18 >= view.getTop() && i18 < view.getBottom();
    }

    public void m(android.view.MotionEvent motionEvent) {
        int i17;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f92664l == null) {
            this.f92664l = android.view.VelocityTracker.obtain();
        }
        this.f92664l.addMovement(motionEvent);
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k kVar = this.f92670r;
        if (actionMasked == 0) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            android.view.View j17 = j((int) x17, (int) y17);
            p(x17, y17, pointerId);
            v(j17, pointerId);
            int i18 = this.f92660h[pointerId] & this.f92668p;
            if (i18 != 0) {
                kVar.f(i18, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f92653a == 1) {
                n();
            }
            b();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f92653a == 1) {
                    this.f92672t = true;
                    kVar.j(this.f92671s, 0.0f, 0.0f);
                    this.f92672t = false;
                    if (this.f92653a == 1) {
                        r(0);
                    }
                }
                b();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x18 = motionEvent.getX(actionIndex);
                float y18 = motionEvent.getY(actionIndex);
                p(x18, y18, pointerId2);
                if (this.f92653a != 0) {
                    if (l(this.f92671s, (int) x18, (int) y18)) {
                        v(this.f92671s, pointerId2);
                        return;
                    }
                    return;
                } else {
                    v(j((int) x18, (int) y18), pointerId2);
                    int i19 = this.f92660h[pointerId2] & this.f92668p;
                    if (i19 != 0) {
                        kVar.f(i19, pointerId2);
                        return;
                    }
                    return;
                }
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f92653a == 1 && pointerId3 == this.f92655c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (r4 >= pointerCount) {
                        i17 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(r4);
                    if (pointerId4 != this.f92655c) {
                        android.view.View j18 = j((int) motionEvent.getX(r4), (int) motionEvent.getY(r4));
                        android.view.View view = this.f92671s;
                        if (j18 == view && v(view, pointerId4)) {
                            i17 = this.f92655c;
                            break;
                        }
                    }
                    r4++;
                }
                if (i17 == -1) {
                    n();
                }
            }
            f(pointerId3);
            return;
        }
        if (this.f92653a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i27 = 0; i27 < pointerCount2; i27++) {
                int pointerId5 = motionEvent.getPointerId(i27);
                if ((this.f92663k & (1 << pointerId5)) != 0) {
                    float x19 = motionEvent.getX(i27);
                    float y19 = motionEvent.getY(i27);
                    float f17 = x19 - this.f92656d[pointerId5];
                    float f18 = y19 - this.f92657e[pointerId5];
                    o(f17, f18, pointerId5);
                    if (this.f92653a == 1) {
                        break;
                    }
                    android.view.View j19 = j((int) x19, (int) y19);
                    if (e(j19, f17, f18) && v(j19, pointerId5)) {
                        break;
                    }
                }
            }
            q(motionEvent);
            return;
        }
        int i28 = this.f92655c;
        if (((this.f92663k & (1 << i28)) != 0 ? 1 : 0) == 0) {
            return;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i28);
        float x27 = motionEvent.getX(findPointerIndex);
        float y27 = motionEvent.getY(findPointerIndex);
        float[] fArr = this.f92658f;
        int i29 = this.f92655c;
        int i37 = (int) (x27 - fArr[i29]);
        int i38 = (int) (y27 - this.f92659g[i29]);
        int left = this.f92671s.getLeft() + i37;
        int top = this.f92671s.getTop() + i38;
        int left2 = this.f92671s.getLeft();
        int top2 = this.f92671s.getTop();
        if (i37 != 0) {
            left = kVar.a(this.f92671s, left, i37);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            this.f92671s.offsetLeftAndRight(left - left2);
        }
        int i39 = left;
        if (i38 != 0) {
            top = kVar.b(this.f92671s, top, i38);
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            this.f92671s.offsetTopAndBottom(top - top2);
        }
        int i47 = top;
        if (i37 != 0 || i38 != 0) {
            this.f92670r.i(this.f92671s, i39, i47, i39 - left2, i47 - top2);
        }
        q(motionEvent);
    }

    public final void n() {
        android.view.VelocityTracker velocityTracker = this.f92664l;
        float f17 = this.f92665m;
        velocityTracker.computeCurrentVelocity(1000, f17);
        float xVelocity = this.f92664l.getXVelocity(this.f92655c);
        float f18 = this.f92666n;
        float abs = java.lang.Math.abs(xVelocity);
        float f19 = 0.0f;
        if (abs < f18) {
            xVelocity = 0.0f;
        } else if (abs > f17) {
            xVelocity = xVelocity > 0.0f ? f17 : -f17;
        }
        float yVelocity = this.f92664l.getYVelocity(this.f92655c);
        float f27 = this.f92666n;
        float abs2 = java.lang.Math.abs(yVelocity);
        if (abs2 >= f27) {
            if (abs2 > f17) {
                if (yVelocity <= 0.0f) {
                    f17 = -f17;
                }
                f19 = f17;
            } else {
                f19 = yVelocity;
            }
        }
        this.f92672t = true;
        this.f92670r.j(this.f92671s, xVelocity, f19);
        this.f92672t = false;
        if (this.f92653a == 1) {
            r(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.k] */
    public final void o(float f17, float f18, int i17) {
        boolean d17 = d(f17, f18, i17, 1);
        boolean z17 = d17;
        if (d(f18, f17, i17, 4)) {
            z17 = (d17 ? 1 : 0) | 4;
        }
        boolean z18 = z17;
        if (d(f17, f18, i17, 2)) {
            z18 = (z17 ? 1 : 0) | 2;
        }
        ?? r07 = z18;
        if (d(f18, f17, i17, 8)) {
            r07 = (z18 ? 1 : 0) | 8;
        }
        if (r07 != 0) {
            int[] iArr = this.f92661i;
            iArr[i17] = iArr[i17] | r07;
            this.f92670r.e(r07, i17);
        }
    }

    public final void p(float f17, float f18, int i17) {
        float[] fArr = this.f92656d;
        if (fArr == null || fArr.length <= i17) {
            int i18 = i17 + 1;
            float[] fArr2 = new float[i18];
            float[] fArr3 = new float[i18];
            float[] fArr4 = new float[i18];
            float[] fArr5 = new float[i18];
            int[] iArr = new int[i18];
            int[] iArr2 = new int[i18];
            int[] iArr3 = new int[i18];
            if (fArr != null) {
                java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f92657e;
                java.lang.System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f92658f;
                java.lang.System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f92659g;
                java.lang.System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f92660h;
                java.lang.System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f92661i;
                java.lang.System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f92662j;
                java.lang.System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f92656d = fArr2;
            this.f92657e = fArr3;
            this.f92658f = fArr4;
            this.f92659g = fArr5;
            this.f92660h = iArr;
            this.f92661i = iArr2;
            this.f92662j = iArr3;
        }
        float[] fArr9 = this.f92656d;
        this.f92658f[i17] = f17;
        fArr9[i17] = f17;
        float[] fArr10 = this.f92657e;
        this.f92659g[i17] = f18;
        fArr10[i17] = f18;
        int[] iArr7 = this.f92660h;
        int i19 = (int) f17;
        int i27 = (int) f18;
        android.view.ViewGroup viewGroup = this.f92673u;
        int left = viewGroup.getLeft();
        int i28 = this.f92667o;
        int i29 = i19 < left + i28 ? 1 : 0;
        if (i27 < viewGroup.getTop() + i28) {
            i29 |= 4;
        }
        if (i19 > viewGroup.getRight() - i28) {
            i29 |= 2;
        }
        if (i27 > viewGroup.getBottom() - i28) {
            i29 |= 8;
        }
        iArr7[i17] = i29;
        this.f92663k |= 1 << i17;
    }

    public final void q(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i17 = 0; i17 < pointerCount; i17++) {
            int pointerId = motionEvent.getPointerId(i17);
            if ((this.f92663k & (1 << pointerId)) != 0) {
                float x17 = motionEvent.getX(i17);
                float y17 = motionEvent.getY(i17);
                this.f92658f[pointerId] = x17;
                this.f92659g[pointerId] = y17;
            }
        }
    }

    public void r(int i17) {
        this.f92673u.removeCallbacks(this.f92674v);
        if (this.f92653a != i17) {
            this.f92653a = i17;
            this.f92670r.h(i17);
            if (this.f92653a == 0) {
                this.f92671s = null;
            }
        }
    }

    public boolean s(int i17, int i18) {
        if (this.f92672t) {
            return k(i17, i18, (int) this.f92664l.getXVelocity(this.f92655c), (int) this.f92664l.getYVelocity(this.f92655c));
        }
        throw new java.lang.IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00db, code lost:
    
        if (r13 != r12) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l.t(android.view.MotionEvent):boolean");
    }

    public boolean u(android.view.View view, int i17, int i18) {
        this.f92671s = view;
        this.f92655c = -1;
        boolean k17 = k(i17, i18, 0, 0);
        if (!k17 && this.f92653a == 0 && this.f92671s != null) {
            this.f92671s = null;
        }
        return k17;
    }

    public boolean v(android.view.View view, int i17) {
        if (view == this.f92671s && this.f92655c == i17) {
            return true;
        }
        if (view == null || !this.f92670r.k(view, i17)) {
            return false;
        }
        this.f92655c = i17;
        c(view, i17);
        return true;
    }
}
