package ek3;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f335119a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335120b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f335122d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f335123e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f335124f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f335125g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f335126h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f335127i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f335128j;

    /* renamed from: k, reason: collision with root package name */
    public int f335129k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.VelocityTracker f335130l;

    /* renamed from: m, reason: collision with root package name */
    public float f335131m;

    /* renamed from: n, reason: collision with root package name */
    public float f335132n;

    /* renamed from: o, reason: collision with root package name */
    public final int f335133o;

    /* renamed from: p, reason: collision with root package name */
    public int f335134p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.OverScroller f335135q;

    /* renamed from: r, reason: collision with root package name */
    public final ek3.b f335136r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f335137s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f335138t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.ViewGroup f335139u;

    /* renamed from: c, reason: collision with root package name */
    public int f335121c = -1;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Rect f335140v = new android.graphics.Rect();

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f335141w = new ek3.c(this);

    public d(android.content.Context context, android.view.ViewGroup viewGroup, ek3.b bVar, android.view.animation.Interpolator interpolator, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("Parent view may not be null".toString());
        }
        if (bVar == null) {
            throw new java.lang.IllegalArgumentException("Callback may not be null".toString());
        }
        this.f335139u = viewGroup;
        this.f335136r = bVar;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f335133o = (int) ((20 * context.getResources().getDisplayMetrics().density) + 0.5f);
        this.f335120b = viewConfiguration.getScaledTouchSlop();
        this.f335131m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f335132n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f335135q = new android.widget.OverScroller(context, interpolator);
    }

    public final void a() {
        b();
        if (this.f335119a == 2) {
            android.widget.OverScroller overScroller = this.f335135q;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX2 = overScroller.getCurrX();
            int currY2 = overScroller.getCurrY();
            this.f335136r.e(this.f335137s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        o(0);
    }

    public final void b() {
        this.f335121c = -1;
        float[] fArr = this.f335122d;
        if (fArr != null) {
            java.util.Arrays.fill(fArr, 0.0f);
            java.util.Arrays.fill(this.f335123e, 0.0f);
            java.util.Arrays.fill(this.f335124f, 0.0f);
            java.util.Arrays.fill(this.f335125g, 0.0f);
            java.util.Arrays.fill(this.f335126h, 0);
            java.util.Arrays.fill(this.f335127i, 0);
            java.util.Arrays.fill(this.f335128j, 0);
            this.f335129k = 0;
        }
        android.view.VelocityTracker velocityTracker = this.f335130l;
        if (velocityTracker != null) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.f335130l = null;
        }
    }

    public final boolean c(float f17, float f18, int i17, int i18) {
        float abs = java.lang.Math.abs(f17);
        float abs2 = java.lang.Math.abs(f18);
        int[] iArr = this.f335126h;
        if (((iArr != null ? iArr[i17] : 0) & i18) != i18 || (this.f335134p & i18) == 0) {
            return false;
        }
        int[] iArr2 = this.f335128j;
        if (((iArr2 != null ? iArr2[i17] : 0) & i18) == i18) {
            return false;
        }
        int[] iArr3 = this.f335127i;
        if (((iArr3 != null ? iArr3[i17] : 0) & i18) == i18) {
            return false;
        }
        int i19 = this.f335120b;
        if (abs <= i19 && abs2 <= i19) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f335136r.getClass();
        }
        int[] iArr4 = this.f335127i;
        return ((iArr4 != null ? iArr4[i17] : 0) & i18) == 0 && abs > ((float) i19);
    }

    public final boolean d(int i17, int i18) {
        if (!(((this.f335129k & 1) << i18) != 0)) {
            return false;
        }
        boolean z17 = (i17 & 1) == 1;
        boolean z18 = (i17 & 2) == 2;
        boolean z19 = (i17 & 8) == 8;
        boolean z27 = (i17 & 4) == 4;
        float[] fArr = this.f335124f;
        float[] fArr2 = this.f335125g;
        float[] fArr3 = this.f335122d;
        float[] fArr4 = this.f335123e;
        if (fArr != null && fArr2 != null && fArr3 != null && fArr4 != null) {
            float f17 = fArr[i18] - fArr3[i18];
            float f18 = fArr2[i18] - fArr4[i18];
            int i19 = this.f335120b;
            if (z17 && z18) {
                return (f17 * f17) + (f18 * f18) > ((float) (i19 * i19));
            }
            if (z27) {
                return f17 < ((float) i19) && java.lang.Math.abs(f17) > java.lang.Math.abs(f18);
            }
            if (z19) {
                return f17 > ((float) i19) && java.lang.Math.abs(f17) > java.lang.Math.abs(f18);
            }
            if (z17) {
                return java.lang.Math.abs(f17) > ((float) i19);
            }
            if (z18 && java.lang.Math.abs(f18) > i19) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(android.view.View view, float f17, float f18) {
        if (view == null) {
            return false;
        }
        ek3.b bVar = this.f335136r;
        boolean z17 = bVar.b(view) > 0;
        bVar.getClass();
        return z17 && java.lang.Math.abs(f17) > ((float) this.f335120b);
    }

    public final void f(int i17) {
        float[] fArr = this.f335122d;
        if (fArr != null) {
            if ((fArr != null ? fArr.length : 0) <= i17) {
                return;
            }
            if (fArr != null) {
                fArr[i17] = 0.0f;
            }
            float[] fArr2 = this.f335123e;
            if (fArr2 != null) {
                fArr2[i17] = 0.0f;
            }
            float[] fArr3 = this.f335124f;
            if (fArr3 != null) {
                fArr3[i17] = 0.0f;
            }
            float[] fArr4 = this.f335125g;
            if (fArr4 != null) {
                fArr4[i17] = 0.0f;
            }
            int[] iArr = this.f335126h;
            if (iArr != null) {
                iArr[i17] = 0;
            }
            int[] iArr2 = this.f335127i;
            if (iArr2 != null) {
                iArr2[i17] = 0;
            }
            int[] iArr3 = this.f335128j;
            if (iArr3 != null) {
                iArr3[i17] = 0;
            }
            this.f335129k = (~(1 << i17)) & this.f335129k;
        }
    }

    public final int g(int i17, int i18, int i19) {
        if (i17 == 0) {
            return 0;
        }
        float width = this.f335139u.getWidth() / 2;
        float sin = width + (((float) java.lang.Math.sin((java.lang.Math.min(1.0f, java.lang.Math.abs(i17) / r0) - 0.5f) * 0.4712389f)) * width);
        int abs = java.lang.Math.abs(i18);
        return java.lang.Math.min(abs > 0 ? java.lang.Math.round(1000 * java.lang.Math.abs(sin / abs)) * 4 : (int) (((java.lang.Math.abs(i17) / i19) + 1) * 256), com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a);
    }

    public final android.view.View h(int i17, int i18) {
        android.view.ViewGroup viewGroup = this.f335139u;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            this.f335136r.getClass();
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if (i17 >= childAt.getLeft() && i17 < childAt.getRight() && i18 >= childAt.getTop() && i18 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public final boolean i(int i17, int i18, int i19, int i27, long j17, boolean z17) {
        float f17;
        float f18;
        float f19;
        float f27;
        android.view.View view = this.f335137s;
        int left = view != null ? view.getLeft() : 0;
        android.view.View view2 = this.f335137s;
        int top = view2 != null ? view2.getTop() : 0;
        int i28 = i17 - left;
        int i29 = i18 - top;
        android.widget.OverScroller overScroller = this.f335135q;
        if (i28 == 0 && i29 == 0) {
            overScroller.abortAnimation();
            o(0);
            return false;
        }
        overScroller.forceFinished(true);
        long j18 = 0;
        if (j17 == 0 && !z17) {
            android.view.View view3 = this.f335137s;
            int i37 = (int) this.f335132n;
            int i38 = (int) this.f335131m;
            int abs = java.lang.Math.abs(i19);
            int i39 = abs < i37 ? 0 : abs > i38 ? i19 > 0 ? i38 : -i38 : i19;
            int i47 = (int) this.f335132n;
            int i48 = (int) this.f335131m;
            int abs2 = java.lang.Math.abs(i27);
            int i49 = abs2 < i47 ? 0 : abs2 > i48 ? i27 > 0 ? i48 : -i48 : i27;
            int abs3 = java.lang.Math.abs(i28);
            int abs4 = java.lang.Math.abs(i29);
            int abs5 = java.lang.Math.abs(i39);
            int abs6 = java.lang.Math.abs(i49);
            int i57 = abs5 + abs6;
            int i58 = abs3 + abs4;
            if (i39 != 0) {
                f17 = abs5;
                f18 = i57;
            } else {
                f17 = abs3;
                f18 = i58;
            }
            float f28 = f17 / f18;
            if (i49 != 0) {
                f27 = abs6;
                f19 = i57;
            } else {
                float f29 = abs4;
                f19 = i58;
                f27 = f29;
            }
            j18 = (int) ((g(i28, i39, this.f335136r.b(view3)) * f28) + (g(i29, i49, 0) * (f27 / f19)));
        } else if (!z17) {
            j18 = j17;
        }
        overScroller.startScroll(left, top, i28, i29, (int) j18);
        o(2);
        return true;
    }

    public final void j(android.view.MotionEvent ev6) {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        int actionMasked = ev6.getActionMasked();
        int actionIndex = ev6.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f335130l == null) {
            this.f335130l = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.f335130l;
        if (velocityTracker != null) {
            velocityTracker.addMovement(ev6);
        }
        ek3.b bVar = this.f335136r;
        if (actionMasked == 0) {
            float x17 = ev6.getX();
            float y17 = ev6.getY();
            int pointerId = ev6.getPointerId(0);
            android.view.View h17 = h((int) x17, (int) y17);
            m(x17, y17, pointerId);
            q(h17, pointerId);
            int[] iArr = this.f335126h;
            java.lang.Integer valueOf = iArr != null ? java.lang.Integer.valueOf(iArr[pointerId]) : null;
            if (valueOf != null) {
                valueOf.intValue();
                if ((valueOf.intValue() & this.f335134p) != 0) {
                    valueOf.intValue();
                    bVar.getClass();
                    return;
                }
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f335119a == 1) {
                float[] fArr = this.f335122d;
                if (fArr == null) {
                    return;
                }
                int length = fArr.length;
                int i19 = this.f335121c;
                if (length <= i19) {
                    return;
                }
                int findPointerIndex = ev6.findPointerIndex(i19);
                r4 = findPointerIndex >= 0 ? findPointerIndex : 0;
                float x18 = ev6.getX(r4);
                float y18 = ev6.getY(r4);
                float[] fArr2 = this.f335122d;
                float f17 = x18 - (fArr2 != null ? fArr2[this.f335121c] : 0.0f);
                float[] fArr3 = this.f335123e;
                k(f17, y18 - (fArr3 != null ? fArr3[this.f335121c] : 0.0f));
            }
            b();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f335119a == 1) {
                    float[] fArr4 = this.f335122d;
                    if (fArr4 == null) {
                        return;
                    }
                    int length2 = fArr4.length;
                    int i27 = this.f335121c;
                    if (length2 <= i27) {
                        return;
                    }
                    int findPointerIndex2 = ev6.findPointerIndex(i27);
                    if (findPointerIndex2 < 0) {
                        findPointerIndex2 = 0;
                    }
                    float x19 = ev6.getX(findPointerIndex2);
                    float y19 = ev6.getY(findPointerIndex2);
                    float[] fArr5 = this.f335122d;
                    float f18 = x19 - (fArr5 != null ? fArr5[this.f335121c] : 0.0f);
                    float[] fArr6 = this.f335123e;
                    float f19 = fArr6 != null ? fArr6[this.f335121c] : 0.0f;
                    this.f335138t = true;
                    this.f335136r.f(this.f335137s, 0.0f, 0.0f, f18, y19 - f19);
                    this.f335138t = false;
                    if (this.f335119a == 1) {
                        o(0);
                    }
                }
                b();
                return;
            }
            if (actionMasked != 5) {
                if (actionMasked != 6) {
                    return;
                }
                int pointerId2 = ev6.getPointerId(actionIndex);
                if (this.f335119a == 1 && pointerId2 == this.f335121c) {
                    int pointerCount = ev6.getPointerCount();
                    while (true) {
                        if (r4 >= pointerCount) {
                            i18 = -1;
                            break;
                        }
                        int pointerId3 = ev6.getPointerId(r4);
                        if (pointerId3 != this.f335121c) {
                            android.view.View h18 = h((int) ev6.getX(r4), (int) ev6.getY(r4));
                            android.view.View view = this.f335137s;
                            if (h18 == view && q(view, pointerId3)) {
                                i18 = this.f335121c;
                                break;
                            }
                        }
                        r4++;
                    }
                    if (i18 == -1) {
                        k(0.0f, 0.0f);
                    }
                }
                f(pointerId2);
                return;
            }
            int pointerId4 = ev6.getPointerId(actionIndex);
            float x27 = ev6.getX(actionIndex);
            float y27 = ev6.getY(actionIndex);
            m(x27, y27, pointerId4);
            if (this.f335119a == 0) {
                q(h((int) x27, (int) y27), pointerId4);
                int[] iArr2 = this.f335126h;
                if (iArr2 == null || (iArr2[pointerId4] & this.f335134p) == 0) {
                    return;
                }
                bVar.getClass();
                return;
            }
            int i28 = (int) x27;
            int i29 = (int) y27;
            android.view.View view2 = this.f335137s;
            if (view2 != null && i28 >= view2.getLeft() && i28 < view2.getRight() && i29 >= view2.getTop() && i29 < view2.getBottom()) {
                r4 = 1;
            }
            if (r4 != 0) {
                q(this.f335137s, pointerId4);
                return;
            }
            return;
        }
        if (this.f335119a != 1) {
            int pointerCount2 = ev6.getPointerCount();
            for (int i37 = 0; i37 < pointerCount2; i37++) {
                int pointerId5 = ev6.getPointerId(i37);
                float[] fArr7 = this.f335122d;
                if (fArr7 == null || fArr7.length <= pointerId5) {
                    break;
                }
                float x28 = ev6.getX(i37);
                float y28 = ev6.getY(i37);
                float[] fArr8 = this.f335122d;
                float f27 = x28 - (fArr8 != null ? fArr8[pointerId5] : 0.0f);
                float[] fArr9 = this.f335123e;
                float f28 = y28 - (fArr9 != null ? fArr9[pointerId5] : 0.0f);
                l(f27, f28, pointerId5);
                if (this.f335119a == 1) {
                    break;
                }
                float[] fArr10 = this.f335122d;
                int i38 = fArr10 != null ? (int) fArr10[pointerId5] : 0;
                float[] fArr11 = this.f335123e;
                android.view.View h19 = h(i38, fArr11 != null ? (int) fArr11[pointerId5] : 0);
                if (e(h19, f27, f28) && q(h19, pointerId5)) {
                    break;
                }
            }
            n(ev6);
            return;
        }
        float[] fArr12 = this.f335122d;
        if (fArr12 != null) {
            int length3 = fArr12.length;
            int i39 = this.f335121c;
            if (length3 <= i39) {
                return;
            }
            int findPointerIndex3 = ev6.findPointerIndex(i39);
            if (findPointerIndex3 < 0) {
                findPointerIndex3 = 0;
            }
            float x29 = ev6.getX(findPointerIndex3);
            float y29 = ev6.getY(findPointerIndex3);
            float[] fArr13 = this.f335124f;
            int i47 = (int) ((x29 - (fArr13 != null ? fArr13[this.f335121c] : 0.0f)) / 1.6666666f);
            float[] fArr14 = this.f335125g;
            int i48 = (int) ((y29 - (fArr14 != null ? fArr14[this.f335121c] : 0.0f)) / 1.6666666f);
            android.view.View view3 = this.f335137s;
            int left = (view3 != null ? view3.getLeft() : 0) + i47;
            android.view.View view4 = this.f335137s;
            int top = (view4 != null ? view4.getTop() : 0) + i48;
            android.view.View view5 = this.f335137s;
            int left2 = view5 != null ? view5.getLeft() : 0;
            android.view.View view6 = this.f335137s;
            int top2 = view6 != null ? view6.getTop() : 0;
            if (i47 != 0) {
                left = bVar.a(this.f335137s, left, i47);
                android.view.View view7 = this.f335137s;
                if (view7 != null) {
                    view7.offsetLeftAndRight(left - left2);
                }
            }
            int i49 = left;
            if (i48 != 0) {
                bVar.getClass();
                android.view.View view8 = this.f335137s;
                if (view8 != null) {
                    view8.offsetTopAndBottom(0 - top2);
                }
                i17 = 0;
            } else {
                i17 = top;
            }
            if (i47 != 0 || i48 != 0) {
                this.f335136r.e(this.f335137s, i49, i17, i49 - left2, i17 - top2);
            }
            float[] fArr15 = this.f335122d;
            float f29 = x29 - (fArr15 != null ? fArr15[this.f335121c] : 0.0f);
            float[] fArr16 = this.f335123e;
            this.f335136r.g(x29, y29, i47, i48, (int) f29, (int) (y29 - (fArr16 != null ? fArr16[this.f335121c] : 0.0f)));
            n(ev6);
        }
    }

    public final void k(float f17, float f18) {
        float f19;
        android.view.VelocityTracker velocityTracker = this.f335130l;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.f335131m);
        }
        float xVelocity = this.f335130l.getXVelocity(this.f335121c);
        float f27 = this.f335132n;
        float f28 = this.f335131m;
        float abs = java.lang.Math.abs(xVelocity);
        float f29 = 0.0f;
        if (abs < f27) {
            f19 = 0.0f;
        } else {
            if (abs > f28) {
                xVelocity = xVelocity > 0.0f ? f28 : -f28;
            }
            f19 = xVelocity;
        }
        float yVelocity = this.f335130l.getYVelocity(this.f335121c);
        float f37 = this.f335132n;
        float f38 = this.f335131m;
        float abs2 = java.lang.Math.abs(yVelocity);
        if (abs2 >= f37) {
            if (abs2 > f38) {
                if (yVelocity > 0.0f) {
                    f29 = f38;
                } else {
                    yVelocity = -f38;
                }
            }
            f29 = yVelocity;
        }
        float f39 = f29;
        this.f335138t = true;
        this.f335136r.f(this.f335137s, f19, f39, f17, f18);
        this.f335138t = false;
        if (this.f335119a == 1) {
            o(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void l(float f17, float f18, int i17) {
        boolean c17 = c(f17, f18, i17, 1);
        boolean z17 = c17;
        if (c(f18, f17, i17, 4)) {
            z17 = (c17 ? 1 : 0) | 4;
        }
        boolean z18 = z17;
        if (c(f17, f18, i17, 2)) {
            z18 = (z17 ? 1 : 0) | 2;
        }
        ?? r07 = z18;
        if (c(f18, f17, i17, 8)) {
            r07 = (z18 ? 1 : 0) | 8;
        }
        if (r07 != 0) {
            int[] iArr = this.f335127i;
            if (iArr != null) {
                iArr[i17] = iArr[i17] | r07;
            }
            this.f335136r.getClass();
        }
    }

    public final void m(float f17, float f18, int i17) {
        float[] fArr = this.f335122d;
        if (fArr == null || fArr.length <= i17) {
            int i18 = i17 + 1;
            float[] fArr2 = new float[i18];
            float[] fArr3 = new float[i18];
            float[] fArr4 = new float[i18];
            float[] fArr5 = new float[i18];
            int[] iArr = new int[i18];
            int[] iArr2 = new int[i18];
            int[] iArr3 = new int[i18];
            float[] fArr6 = this.f335123e;
            float[] fArr7 = this.f335124f;
            float[] fArr8 = this.f335125g;
            if (fArr != null && fArr6 != null && fArr7 != null && fArr8 != null) {
                java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                java.lang.System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                java.lang.System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                java.lang.System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            }
            int[] iArr4 = this.f335126h;
            int[] iArr5 = this.f335127i;
            int[] iArr6 = this.f335128j;
            if (iArr4 != null && iArr5 != null && iArr6 != null) {
                java.lang.System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                java.lang.System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                java.lang.System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f335122d = fArr2;
            this.f335123e = fArr3;
            this.f335124f = fArr4;
            this.f335125g = fArr5;
            this.f335126h = iArr;
            this.f335127i = iArr2;
            this.f335128j = iArr3;
        }
        float[] fArr9 = this.f335124f;
        if (fArr9 != null) {
            fArr9[i17] = f17;
        }
        float[] fArr10 = this.f335122d;
        if (fArr10 != null) {
            fArr10[i17] = f17;
        }
        float[] fArr11 = this.f335125g;
        if (fArr11 != null) {
            fArr11[i17] = f18;
        }
        float[] fArr12 = this.f335123e;
        if (fArr12 != null) {
            fArr12[i17] = f18;
        }
        int[] iArr7 = this.f335126h;
        if (iArr7 != null) {
            int i19 = (int) f17;
            int i27 = (int) f18;
            android.view.ViewGroup viewGroup = this.f335139u;
            int left = viewGroup.getLeft();
            int i28 = this.f335133o;
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
        }
        this.f335129k |= 1 << i17;
    }

    public final void n(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i17 = 0; i17 < pointerCount; i17++) {
            int pointerId = motionEvent.getPointerId(i17);
            float x17 = motionEvent.getX(i17);
            float y17 = motionEvent.getY(i17);
            float[] fArr = this.f335124f;
            float[] fArr2 = this.f335125g;
            if (fArr != null && fArr2 != null && fArr.length > pointerId && fArr2.length > pointerId) {
                fArr[pointerId] = x17;
                fArr2[pointerId] = y17;
            }
        }
    }

    public final void o(int i17) {
        if (this.f335119a != i17) {
            this.f335119a = i17;
            this.f335136r.d(i17);
            if (i17 == 0) {
                this.f335137s = null;
            }
        }
    }

    public final boolean p(android.view.MotionEvent ev6) {
        java.lang.Integer valueOf;
        android.view.View h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        int actionMasked = ev6.getActionMasked();
        int actionIndex = ev6.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f335130l == null) {
            this.f335130l = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.f335130l;
        if (velocityTracker != null) {
            velocityTracker.addMovement(ev6);
        }
        ek3.b bVar = this.f335136r;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    n(ev6);
                    int pointerCount = ev6.getPointerCount();
                    for (int i17 = 0; i17 < pointerCount; i17++) {
                        int pointerId = ev6.getPointerId(i17);
                        float[] fArr = this.f335122d;
                        if (fArr == null || pointerId < 0) {
                            break;
                        }
                        if (pointerId >= (fArr != null ? fArr.length : 0)) {
                            break;
                        }
                        float x17 = ev6.getX(i17);
                        float y17 = ev6.getY(i17);
                        float[] fArr2 = this.f335122d;
                        float f17 = x17 - (fArr2 != null ? fArr2[pointerId] : 0.0f);
                        float[] fArr3 = this.f335123e;
                        float f18 = y17 - (fArr3 != null ? fArr3[pointerId] : 0.0f);
                        l(f17, f18, pointerId);
                        if (this.f335119a == 1) {
                            break;
                        }
                        float[] fArr4 = this.f335122d;
                        int i18 = fArr4 != null ? (int) fArr4[pointerId] : 0;
                        float[] fArr5 = this.f335123e;
                        android.view.View h18 = h(i18, fArr5 != null ? (int) fArr5[pointerId] : 0);
                        if (h18 != null && e(h18, f17, f18) && q(h18, pointerId)) {
                            break;
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = ev6.getPointerId(actionIndex);
                        float x18 = ev6.getX(actionIndex);
                        float y18 = ev6.getY(actionIndex);
                        m(x18, y18, pointerId2);
                        int i19 = this.f335119a;
                        if (i19 == 0) {
                            int[] iArr = this.f335126h;
                            valueOf = iArr != null ? java.lang.Integer.valueOf(iArr[pointerId2]) : null;
                            if (valueOf != null) {
                                valueOf.intValue();
                                if ((valueOf.intValue() & this.f335134p) != 0) {
                                    valueOf.intValue();
                                    bVar.getClass();
                                }
                            }
                        } else if (i19 == 2 && (h17 = h((int) x18, (int) y18)) == this.f335137s) {
                            q(h17, pointerId2);
                        }
                    } else if (actionMasked == 6) {
                        f(ev6.getPointerId(actionIndex));
                    }
                }
            }
            b();
        } else {
            float x19 = ev6.getX();
            float y19 = ev6.getY();
            int pointerId3 = ev6.getPointerId(0);
            m(x19, y19, pointerId3);
            android.view.View h19 = h((int) x19, (int) y19);
            if (h19 == this.f335137s && this.f335119a == 2) {
                q(h19, pointerId3);
            }
            int[] iArr2 = this.f335126h;
            valueOf = iArr2 != null ? java.lang.Integer.valueOf(iArr2[pointerId3]) : null;
            if (valueOf != null && (valueOf.intValue() & this.f335134p) != 0) {
                bVar.getClass();
            }
        }
        return this.f335119a == 1;
    }

    public final boolean q(android.view.View view, int i17) {
        if (view == this.f335137s && this.f335121c == i17) {
            return true;
        }
        if (view != null) {
            ek3.b bVar = this.f335136r;
            if (bVar.h(view, i17)) {
                this.f335121c = i17;
                android.view.ViewParent parent = view.getParent();
                android.view.ViewGroup viewGroup = this.f335139u;
                if (!(parent == viewGroup)) {
                    throw new java.lang.IllegalArgumentException(("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ')').toString());
                }
                this.f335137s = view;
                this.f335121c = i17;
                bVar.c(view, i17);
                o(1);
                return true;
            }
        }
        return false;
    }
}
