package es;

/* loaded from: classes15.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public int f337819a;

    /* renamed from: b, reason: collision with root package name */
    public final int f337820b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f337822d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f337823e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f337824f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f337825g;

    /* renamed from: h, reason: collision with root package name */
    public int f337826h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f337827i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f337828j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f337829k;

    /* renamed from: l, reason: collision with root package name */
    public int f337830l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.VelocityTracker f337831m;

    /* renamed from: n, reason: collision with root package name */
    public float f337832n;

    /* renamed from: o, reason: collision with root package name */
    public float f337833o;

    /* renamed from: p, reason: collision with root package name */
    public int f337834p;

    /* renamed from: q, reason: collision with root package name */
    public int f337835q;

    /* renamed from: r, reason: collision with root package name */
    public final p012xc85e97e9.p075x2eaf9f.p079xd1075a44.s f337836r;

    /* renamed from: s, reason: collision with root package name */
    public final es.w f337837s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f337838t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f337839u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.ViewGroup f337840v;

    /* renamed from: c, reason: collision with root package name */
    public int f337821c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f337841w = new es.v(this);

    public x(android.content.Context context, android.view.ViewGroup viewGroup, es.w wVar, android.view.animation.Interpolator interpolator) {
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("Parent view may not be null");
        }
        if (wVar == null) {
            throw new java.lang.IllegalArgumentException("Callback may not be null");
        }
        this.f337840v = viewGroup;
        this.f337837s = wVar;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f337834p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f337820b = viewConfiguration.getScaledTouchSlop();
        this.f337832n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f337833o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f337836r = new p012xc85e97e9.p075x2eaf9f.p079xd1075a44.s(context, interpolator);
    }

    public void a() {
        this.f337821c = -1;
        float[] fArr = this.f337822d;
        if (fArr != null) {
            java.util.Arrays.fill(fArr, 0.0f);
            java.util.Arrays.fill(this.f337823e, 0.0f);
            java.util.Arrays.fill(this.f337824f, 0.0f);
            java.util.Arrays.fill(this.f337825g, 0.0f);
            java.util.Arrays.fill(this.f337827i, 0);
            java.util.Arrays.fill(this.f337828j, 0);
            java.util.Arrays.fill(this.f337829k, 0);
            this.f337830l = 0;
        }
        android.view.VelocityTracker velocityTracker = this.f337831m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f337831m = null;
        }
    }

    public final boolean b(float f17, float f18, int i17, int i18) {
        float abs = java.lang.Math.abs(f17);
        float abs2 = java.lang.Math.abs(f18);
        if ((this.f337827i[i17] & i18) != i18 || (this.f337835q & i18) == 0 || (this.f337829k[i17] & i18) == i18 || (this.f337828j[i17] & i18) == i18) {
            return false;
        }
        int i19 = this.f337820b;
        if (abs <= i19 && abs2 <= i19) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f337837s.getClass();
        }
        return (this.f337828j[i17] & i18) == 0 && abs > ((float) i19);
    }

    public final void c(int i17) {
        float[] fArr = this.f337822d;
        if (fArr == null) {
            return;
        }
        fArr[i17] = 0.0f;
        this.f337823e[i17] = 0.0f;
        this.f337824f[i17] = 0.0f;
        this.f337825g[i17] = 0.0f;
        this.f337827i[i17] = 0;
        this.f337828j[i17] = 0;
        this.f337829k[i17] = 0;
        this.f337830l = (~(1 << i17)) & this.f337830l;
    }

    public final int d(int i17, int i18, int i19) {
        if (i17 == 0) {
            return 0;
        }
        float width = this.f337840v.getWidth() / 2;
        float sin = width + (((float) java.lang.Math.sin((float) ((java.lang.Math.min(1.0f, java.lang.Math.abs(i17) / r0) - 0.5f) * 0.4712389167638204d))) * width);
        int abs = java.lang.Math.abs(i18);
        return java.lang.Math.min(abs > 0 ? java.lang.Math.round(java.lang.Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((java.lang.Math.abs(i17) / i19) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(float r18, float r19) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es.x.e(float, float):void");
    }

    public android.view.View f(int i17, int i18) {
        android.view.ViewGroup viewGroup = this.f337840v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f337837s.getClass();
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if (i17 >= childAt.getLeft() && i17 < childAt.getRight() && i18 >= childAt.getTop() && i18 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final int g(int i17, int i18) {
        android.view.ViewGroup viewGroup = this.f337840v;
        int i19 = i17 < viewGroup.getLeft() + this.f337834p ? 1 : 0;
        if (i18 < viewGroup.getTop() + this.f337834p) {
            i19 |= 4;
        }
        if (i17 > viewGroup.getRight() - this.f337834p) {
            i19 |= 2;
        }
        return i18 > viewGroup.getBottom() - this.f337834p ? i19 | 8 : i19;
    }

    public void h(android.view.MotionEvent motionEvent) {
        boolean z17;
        int i17;
        int i18;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f337831m == null) {
            this.f337831m = android.view.VelocityTracker.obtain();
        }
        this.f337831m.addMovement(motionEvent);
        es.w wVar = this.f337837s;
        int i19 = 0;
        if (actionMasked == 0) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            android.view.View f17 = f((int) x17, (int) y17);
            k(x17, y17, pointerId);
            o(f17, pointerId);
            if ((this.f337827i[pointerId] & this.f337835q) != 0) {
                wVar.getClass();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f337819a == 1) {
                i();
            }
            a();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f337819a == 1) {
                    e(0.0f, 0.0f);
                }
                a();
                return;
            }
            if (actionMasked != 5) {
                if (actionMasked != 6) {
                    return;
                }
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                if (this.f337819a == 1 && pointerId2 == this.f337821c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i19 >= pointerCount) {
                            i18 = -1;
                            break;
                        }
                        int pointerId3 = motionEvent.getPointerId(i19);
                        if (pointerId3 != this.f337821c) {
                            android.view.View f18 = f((int) motionEvent.getX(i19), (int) motionEvent.getY(i19));
                            android.view.View view = this.f337838t;
                            if (f18 == view && o(view, pointerId3)) {
                                i18 = this.f337821c;
                                break;
                            }
                        }
                        i19++;
                    }
                    if (i18 == -1) {
                        i();
                    }
                }
                c(pointerId2);
                return;
            }
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            float x18 = motionEvent.getX(actionIndex);
            float y18 = motionEvent.getY(actionIndex);
            k(x18, y18, pointerId4);
            if (this.f337819a == 0) {
                o(f((int) x18, (int) y18), pointerId4);
                if ((this.f337827i[pointerId4] & this.f337835q) != 0) {
                    wVar.getClass();
                    return;
                }
                return;
            }
            int i27 = (int) x18;
            int i28 = (int) y18;
            android.view.View view2 = this.f337838t;
            if (view2 != null && i27 >= view2.getLeft() && i27 < view2.getRight() && i28 >= view2.getTop() && i28 < view2.getBottom()) {
                i19 = 1;
            }
            if (i19 != 0) {
                o(this.f337838t, pointerId4);
                return;
            }
            return;
        }
        if (this.f337819a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i29 = 0; i29 < pointerCount2; i29++) {
                int pointerId5 = motionEvent.getPointerId(i29);
                float x19 = motionEvent.getX(i29);
                float y19 = motionEvent.getY(i29);
                float f19 = x19 - this.f337822d[pointerId5];
                j(f19, y19 - this.f337823e[pointerId5], pointerId5);
                if (this.f337819a == 1) {
                    break;
                }
                android.view.View f27 = f((int) x19, (int) y19);
                if (f27 != null) {
                    wVar.getClass();
                    if (java.lang.Math.abs(f19) > this.f337820b) {
                        z17 = true;
                        if (!z17 && o(f27, pointerId5)) {
                            break;
                        }
                    }
                }
                z17 = false;
                if (!z17) {
                }
            }
            l(motionEvent);
            return;
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.f337821c);
        float x27 = motionEvent.getX(findPointerIndex);
        float y27 = motionEvent.getY(findPointerIndex);
        float[] fArr = this.f337824f;
        int i37 = this.f337821c;
        int i38 = (int) (x27 - fArr[i37]);
        int i39 = (int) (y27 - this.f337825g[i37]);
        int left = this.f337838t.getLeft() + i38;
        int top = this.f337838t.getTop() + i39;
        int left2 = this.f337838t.getLeft();
        int top2 = this.f337838t.getTop();
        if (i38 != 0) {
            android.view.View view3 = this.f337838t;
            es.t tVar = (es.t) wVar;
            if (tVar.f337811c.f146507u) {
                int max = java.lang.Math.max(tVar.f337809a, left);
                tVar.f337809a = 0;
                left = java.lang.Math.min(view3.getWidth(), java.lang.Math.max(max, 0));
            } else {
                tVar.f337809a = java.lang.Math.max(tVar.f337809a, left);
                left = 0;
            }
            this.f337838t.offsetLeftAndRight(left - left2);
        }
        int i47 = left;
        if (i39 != 0) {
            wVar.getClass();
            this.f337838t.offsetTopAndBottom(0 - top2);
            i17 = 0;
        } else {
            i17 = top;
        }
        if (i38 != 0 || i39 != 0) {
            this.f337837s.a(this.f337838t, i47, i17, i47 - left2, i17 - top2);
        }
        l(motionEvent);
    }

    public final void i() {
        this.f337831m.computeCurrentVelocity(1000, this.f337832n);
        float xVelocity = this.f337831m.getXVelocity(this.f337821c);
        float f17 = this.f337833o;
        float f18 = this.f337832n;
        float abs = java.lang.Math.abs(xVelocity);
        float f19 = 0.0f;
        if (abs < f17) {
            xVelocity = 0.0f;
        } else if (abs > f18) {
            xVelocity = xVelocity > 0.0f ? f18 : -f18;
        }
        float yVelocity = this.f337831m.getYVelocity(this.f337821c);
        float f27 = this.f337833o;
        float f28 = this.f337832n;
        float abs2 = java.lang.Math.abs(yVelocity);
        if (abs2 >= f27) {
            if (abs2 > f28) {
                if (yVelocity > 0.0f) {
                    f19 = f28;
                } else {
                    yVelocity = -f28;
                }
            }
            f19 = yVelocity;
        }
        e(xVelocity, f19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void j(float f17, float f18, int i17) {
        boolean b17 = b(f17, f18, i17, 1);
        boolean z17 = b17;
        if (b(f18, f17, i17, 4)) {
            z17 = (b17 ? 1 : 0) | 4;
        }
        boolean z18 = z17;
        if (b(f17, f18, i17, 2)) {
            z18 = (z17 ? 1 : 0) | 2;
        }
        ?? r07 = z18;
        if (b(f18, f17, i17, 8)) {
            r07 = (z18 ? 1 : 0) | 8;
        }
        if (r07 != 0) {
            int[] iArr = this.f337828j;
            iArr[i17] = iArr[i17] | r07;
            this.f337837s.getClass();
        }
    }

    public final void k(float f17, float f18, int i17) {
        float[] fArr = this.f337822d;
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
                float[] fArr6 = this.f337823e;
                java.lang.System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f337824f;
                java.lang.System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f337825g;
                java.lang.System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f337827i;
                java.lang.System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f337828j;
                java.lang.System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f337829k;
                java.lang.System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f337822d = fArr2;
            this.f337823e = fArr3;
            this.f337824f = fArr4;
            this.f337825g = fArr5;
            this.f337827i = iArr;
            this.f337828j = iArr2;
            this.f337829k = iArr3;
            this.f337826h = i17;
        }
        float[] fArr9 = this.f337822d;
        this.f337824f[i17] = f17;
        fArr9[i17] = f17;
        float[] fArr10 = this.f337823e;
        this.f337825g[i17] = f18;
        fArr10[i17] = f18;
        this.f337827i[i17] = g((int) f17, (int) f18);
        this.f337830l |= 1 << i17;
    }

    public final void l(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i17 = 0; i17 < pointerCount; i17++) {
            int pointerId = motionEvent.getPointerId(i17);
            float x17 = motionEvent.getX(i17);
            float y17 = motionEvent.getY(i17);
            this.f337824f[pointerId] = x17;
            this.f337825g[pointerId] = y17;
        }
    }

    public void m(int i17) {
        if (this.f337819a != i17) {
            this.f337819a = i17;
            es.t tVar = (es.t) this.f337837s;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab = tVar.f337811c;
            kd.c.c("MicroMsg.SwipeBackLayout", "ashutest::onViewDragStateChanged state %d, requestedTranslucent %B fastRelease %B", valueOf, java.lang.Boolean.valueOf(c10455x858f5ab.f146506t), java.lang.Boolean.valueOf(c10455x858f5ab.f146510x));
            if (1 == i17) {
                kd.c.c("MicroMsg.SwipeBackLayout", "ashutest:: on drag", new java.lang.Object[0]);
                if ((c10455x858f5ab.getContext() instanceof android.app.Activity) && c10455x858f5ab.A == null) {
                    c10455x858f5ab.A = ((android.app.Activity) c10455x858f5ab.getContext()).getWindow().getDecorView().getBackground();
                    if (c10455x858f5ab.D) {
                        ((android.app.Activity) c10455x858f5ab.getContext()).getWindow().getDecorView().setBackgroundResource(android.R.color.transparent);
                    }
                }
                c10455x858f5ab.f146508v = false;
                if (c10455x858f5ab.f146507u) {
                    es.k.b(0.0f);
                }
            }
            if (i17 == 0 && !c10455x858f5ab.f146510x) {
                kd.c.c("MicroMsg.SwipeBackLayout", "ashutest:: on cancel", new java.lang.Object[0]);
                if (c10455x858f5ab.E != null) {
                    if ((c10455x858f5ab.getContext() instanceof android.app.Activity) && c10455x858f5ab.A != null) {
                        if (c10455x858f5ab.D) {
                            ((android.app.Activity) c10455x858f5ab.getContext()).getWindow().getDecorView().setBackground(c10455x858f5ab.A);
                        }
                        c10455x858f5ab.A = null;
                    }
                    c10455x858f5ab.E.getClass();
                }
                es.k.b(1.0f);
            }
            if (1 == i17 && c10455x858f5ab.f146505s && (c10455x858f5ab.getContext() instanceof android.app.Activity) && !c10455x858f5ab.f146507u && !c10455x858f5ab.f146506t) {
                kd.c.c("MicroMsg.SwipeBackLayout", "ashutest:: match dragging", new java.lang.Object[0]);
                c10455x858f5ab.f146506t = true;
                es.d.a((android.app.Activity) c10455x858f5ab.getContext(), tVar);
            }
            if (2 == i17) {
                kd.c.c("MicroMsg.SwipeBackLayout", "ashutest:: notify settle, mReleasedLeft %d", java.lang.Integer.valueOf(tVar.f337810b));
                int i18 = tVar.f337810b;
                es.k.a(i18 > 0, i18);
            }
            if (i17 == 0) {
                this.f337838t = null;
            }
        }
    }

    public boolean n(android.view.MotionEvent motionEvent) {
        android.view.View f17;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f337831m == null) {
            this.f337831m = android.view.VelocityTracker.obtain();
        }
        this.f337831m.addMovement(motionEvent);
        es.w wVar = this.f337837s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i17 = 0; i17 < pointerCount; i17++) {
                        int pointerId = motionEvent.getPointerId(i17);
                        float x17 = motionEvent.getX(i17);
                        float y17 = motionEvent.getY(i17);
                        float f18 = x17 - this.f337822d[pointerId];
                        j(f18, y17 - this.f337823e[pointerId], pointerId);
                        if (this.f337819a == 1) {
                            break;
                        }
                        android.view.View f19 = f((int) x17, (int) y17);
                        if (f19 != null) {
                            wVar.getClass();
                            if ((java.lang.Math.abs(f18) > ((float) this.f337820b)) && o(f19, pointerId)) {
                                break;
                            }
                        }
                    }
                    l(motionEvent);
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x18 = motionEvent.getX(actionIndex);
                        float y18 = motionEvent.getY(actionIndex);
                        k(x18, y18, pointerId2);
                        int i18 = this.f337819a;
                        if (i18 == 0) {
                            if ((this.f337827i[pointerId2] & this.f337835q) != 0) {
                                wVar.getClass();
                            }
                        } else if (i18 == 2 && (f17 = f((int) x18, (int) y18)) == this.f337838t) {
                            o(f17, pointerId2);
                        }
                    } else if (actionMasked == 6) {
                        c(motionEvent.getPointerId(actionIndex));
                    }
                }
            }
            a();
        } else {
            float x19 = motionEvent.getX();
            float y19 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            k(x19, y19, pointerId3);
            android.view.View f27 = f((int) x19, (int) y19);
            if (f27 == this.f337838t && this.f337819a == 2) {
                o(f27, pointerId3);
            }
            if ((this.f337827i[pointerId3] & this.f337835q) != 0) {
                wVar.getClass();
            }
        }
        return this.f337819a == 1;
    }

    public boolean o(android.view.View view, int i17) {
        if (view == this.f337838t && this.f337821c == i17) {
            return true;
        }
        if (view != null) {
            es.w wVar = this.f337837s;
            es.x xVar = ((es.t) wVar).f337811c.f146500n;
            if (((xVar.f337830l & (1 << i17)) != 0) && (xVar.f337827i[i17] & 1) != 0) {
                this.f337821c = i17;
                android.view.ViewParent parent = view.getParent();
                android.view.ViewGroup viewGroup = this.f337840v;
                if (parent != viewGroup) {
                    throw new java.lang.IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
                }
                this.f337838t = view;
                this.f337821c = i17;
                wVar.getClass();
                m(1);
                return true;
            }
        }
        return false;
    }
}
