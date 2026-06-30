package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class g1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 implements p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a {
    public java.util.List A;
    public java.util.List B;
    public n3.q D;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.b1 E;
    public android.graphics.Rect G;
    public long H;

    /* renamed from: g, reason: collision with root package name */
    public float f93565g;

    /* renamed from: h, reason: collision with root package name */
    public float f93566h;

    /* renamed from: i, reason: collision with root package name */
    public float f93567i;

    /* renamed from: m, reason: collision with root package name */
    public float f93568m;

    /* renamed from: n, reason: collision with root package name */
    public float f93569n;

    /* renamed from: o, reason: collision with root package name */
    public float f93570o;

    /* renamed from: p, reason: collision with root package name */
    public float f93571p;

    /* renamed from: q, reason: collision with root package name */
    public float f93572q;

    /* renamed from: s, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 f93574s;

    /* renamed from: u, reason: collision with root package name */
    public int f93576u;

    /* renamed from: w, reason: collision with root package name */
    public int f93578w;

    /* renamed from: x, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f93579x;

    /* renamed from: z, reason: collision with root package name */
    public android.view.VelocityTracker f93581z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f93562d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final float[] f93563e = new float[2];

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f93564f = null;

    /* renamed from: r, reason: collision with root package name */
    public int f93573r = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f93575t = 0;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f93577v = new java.util.ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.Runnable f93580y = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u0(this);
    public android.view.View C = null;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 F = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v0(this);

    public g1(p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 a1Var) {
        this.f93574s = a1Var;
    }

    public static boolean k(android.view.View view, float f17, float f18, float f19, float f27) {
        return f17 >= f19 && f17 <= f19 + ((float) view.getWidth()) && f18 >= f27 && f18 <= f27 + ((float) view.getHeight());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void R3(android.view.View view) {
    }

    public void d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f93579x;
        if (c1163xf1deaba42 == c1163xf1deaba4) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 v2Var = this.F;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.S0(this);
            this.f93579x.U0(v2Var);
            java.util.List list = this.f93579x.H;
            if (list != null) {
                ((java.util.ArrayList) list).remove(this);
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f93577v;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                this.f93574s.mo8113xb4407692(this.f93579x, ((p012xc85e97e9.p103xe821e364.p104xd1075a44.d1) arrayList.get(0)).f93523h);
            }
            arrayList.clear();
            this.C = null;
            android.view.VelocityTracker velocityTracker = this.f93581z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f93581z = null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.b1 b1Var = this.E;
            if (b1Var != null) {
                b1Var.f93496d = false;
                this.E = null;
            }
            if (this.D != null) {
                this.D = null;
            }
        }
        this.f93579x = c1163xf1deaba4;
        if (c1163xf1deaba4 != null) {
            android.content.res.Resources resources = c1163xf1deaba4.getResources();
            this.f93567i = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a3d);
            this.f93568m = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a3c);
            this.f93578w = android.view.ViewConfiguration.get(this.f93579x.getContext()).getScaledTouchSlop();
            this.f93579x.N(this);
            this.f93579x.P(v2Var);
            this.f93579x.O(this);
            this.E = new p012xc85e97e9.p103xe821e364.p104xd1075a44.b1(this);
            this.D = new n3.q(this.f93579x.getContext(), this.E);
        }
    }

    public final int e(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        if ((i17 & 12) == 0) {
            return 0;
        }
        int i18 = this.f93569n > 0.0f ? 8 : 4;
        android.view.VelocityTracker velocityTracker = this.f93581z;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 a1Var = this.f93574s;
        if (velocityTracker != null && this.f93573r > -1) {
            velocityTracker.computeCurrentVelocity(1000, a1Var.m8122x9a0182ea(this.f93568m));
            float xVelocity = this.f93581z.getXVelocity(this.f93573r);
            float yVelocity = this.f93581z.getYVelocity(this.f93573r);
            int i19 = xVelocity <= 0.0f ? 4 : 8;
            float abs = java.lang.Math.abs(xVelocity);
            if ((i19 & i17) != 0 && i18 == i19 && abs >= a1Var.m8120xa0c7cb22(this.f93567i) && abs > java.lang.Math.abs(yVelocity)) {
                return i19;
            }
        }
        float width = this.f93579x.getWidth() * a1Var.m8121xc5a1347(k3Var);
        if ((i17 & i18) == 0 || java.lang.Math.abs(this.f93569n) <= width) {
            return 0;
        }
        return i18;
    }

    public void f(int i17, android.view.MotionEvent motionEvent, int i18) {
        int m8115xc75ae12b;
        android.view.View i19;
        if (this.f93564f == null && i17 == 2 && this.f93575t != 2) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 a1Var = this.f93574s;
            if (a1Var.mo8126x5b4a2f69() && this.f93579x.mo7958x54496c8e() != 1) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93579x.getLayoutManager();
                int i27 = this.f93573r;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = null;
                if (i27 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i27);
                    float x17 = motionEvent.getX(findPointerIndex) - this.f93565g;
                    float y17 = motionEvent.getY(findPointerIndex) - this.f93566h;
                    float abs = java.lang.Math.abs(x17);
                    float abs2 = java.lang.Math.abs(y17);
                    float f17 = this.f93578w;
                    if ((abs >= f17 || abs2 >= f17) && ((abs <= abs2 || !layoutManager.mo2416xc6ea780e()) && ((abs2 <= abs || !layoutManager.getF204840r()) && (i19 = i(motionEvent)) != null))) {
                        k3Var = this.f93579x.w0(i19);
                    }
                }
                if (k3Var == null || (m8115xc75ae12b = (a1Var.m8115xc75ae12b(this.f93579x, k3Var) & 65280) >> 8) == 0) {
                    return;
                }
                float x18 = motionEvent.getX(i18);
                float y18 = motionEvent.getY(i18);
                float f18 = x18 - this.f93565g;
                float f19 = y18 - this.f93566h;
                float abs3 = java.lang.Math.abs(f18);
                float abs4 = java.lang.Math.abs(f19);
                int i28 = this.f93578w;
                if (abs3 >= i28 || abs4 >= i28) {
                    if (abs3 > abs4) {
                        if (f18 < 0.0f && (m8115xc75ae12b & 4) == 0) {
                            return;
                        }
                        if (f18 > 0.0f && (m8115xc75ae12b & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f19 < 0.0f && (m8115xc75ae12b & 1) == 0) {
                            return;
                        }
                        if (f19 > 0.0f && (m8115xc75ae12b & 2) == 0) {
                            return;
                        }
                    }
                    this.f93570o = 0.0f;
                    this.f93569n = 0.0f;
                    this.f93573r = motionEvent.getPointerId(0);
                    n(k3Var, 1);
                }
            }
        }
    }

    public final int g(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        if ((i17 & 3) == 0) {
            return 0;
        }
        int i18 = this.f93570o > 0.0f ? 2 : 1;
        android.view.VelocityTracker velocityTracker = this.f93581z;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 a1Var = this.f93574s;
        if (velocityTracker != null && this.f93573r > -1) {
            velocityTracker.computeCurrentVelocity(1000, a1Var.m8122x9a0182ea(this.f93568m));
            float xVelocity = this.f93581z.getXVelocity(this.f93573r);
            float yVelocity = this.f93581z.getYVelocity(this.f93573r);
            int i19 = yVelocity <= 0.0f ? 1 : 2;
            float abs = java.lang.Math.abs(yVelocity);
            if ((i19 & i17) != 0 && i19 == i18 && abs >= a1Var.m8120xa0c7cb22(this.f93567i) && abs > java.lang.Math.abs(xVelocity)) {
                return i19;
            }
        }
        float height = this.f93579x.getHeight() * a1Var.m8121xc5a1347(k3Var);
        if ((i17 & i18) == 0 || java.lang.Math.abs(this.f93570o) <= height) {
            return 0;
        }
        return i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        rect.setEmpty();
    }

    public void h(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, boolean z17) {
        java.util.List list = this.f93577v;
        for (int size = ((java.util.ArrayList) list).size() - 1; size >= 0; size--) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.d1 d1Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.d1) ((java.util.ArrayList) list).get(size);
            if (d1Var.f93523h == k3Var) {
                d1Var.f93529q |= z17;
                if (!d1Var.f93530r) {
                    d1Var.f93525m.cancel();
                }
                ((java.util.ArrayList) list).remove(size);
                return;
            }
        }
    }

    public android.view.View i(android.view.MotionEvent motionEvent) {
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f93564f;
        if (k3Var != null) {
            android.view.View view = k3Var.f3639x46306858;
            if (k(view, x17, y17, this.f93571p + this.f93569n, this.f93572q + this.f93570o)) {
                return view;
            }
        }
        java.util.List list = this.f93577v;
        for (int size = ((java.util.ArrayList) list).size() - 1; size >= 0; size--) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.d1 d1Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.d1) ((java.util.ArrayList) list).get(size);
            android.view.View view2 = d1Var.f93523h.f3639x46306858;
            if (k(view2, x17, y17, d1Var.f93527o, d1Var.f93528p)) {
                return view2;
            }
        }
        return this.f93579x.k0(x17, y17);
    }

    public final void j(float[] fArr) {
        if ((this.f93576u & 12) != 0) {
            fArr[0] = (this.f93571p + this.f93569n) - this.f93564f.f3639x46306858.getLeft();
        } else {
            fArr[0] = this.f93564f.f3639x46306858.getTranslationX();
        }
        if ((this.f93576u & 3) != 0) {
            fArr[1] = (this.f93572q + this.f93570o) - this.f93564f.f3639x46306858.getTop();
        } else {
            fArr[1] = this.f93564f.f3639x46306858.getTranslationY();
        }
    }

    public void l(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        int i17;
        int i18;
        int i19;
        int i27;
        if (!this.f93579x.isLayoutRequested() && this.f93575t == 2) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 a1Var = this.f93574s;
            float mo8118xbee83fe4 = a1Var.mo8118xbee83fe4(k3Var);
            int i28 = (int) (this.f93571p + this.f93569n);
            int i29 = (int) (this.f93572q + this.f93570o);
            if (java.lang.Math.abs(i29 - k3Var.f3639x46306858.getTop()) >= k3Var.f3639x46306858.getHeight() * mo8118xbee83fe4 || java.lang.Math.abs(i28 - k3Var.f3639x46306858.getLeft()) >= k3Var.f3639x46306858.getWidth() * mo8118xbee83fe4) {
                java.util.List list = this.A;
                if (list == null) {
                    this.A = new java.util.ArrayList();
                    this.B = new java.util.ArrayList();
                } else {
                    ((java.util.ArrayList) list).clear();
                    ((java.util.ArrayList) this.B).clear();
                }
                int m8117x510fe55f = a1Var.m8117x510fe55f();
                int round = java.lang.Math.round(this.f93571p + this.f93569n) - m8117x510fe55f;
                int round2 = java.lang.Math.round(this.f93572q + this.f93570o) - m8117x510fe55f;
                int i37 = m8117x510fe55f * 2;
                int width = k3Var.f3639x46306858.getWidth() + round + i37;
                int height = k3Var.f3639x46306858.getHeight() + round2 + i37;
                int i38 = (round + width) / 2;
                int i39 = (round2 + height) / 2;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93579x.getLayoutManager();
                int m8008x3d79f549 = layoutManager.m8008x3d79f549();
                int i47 = 0;
                while (i47 < m8008x3d79f549) {
                    android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i47);
                    if (m8007x6a486239 != k3Var.f3639x46306858 && m8007x6a486239.getBottom() >= round2 && m8007x6a486239.getTop() <= height && m8007x6a486239.getRight() >= round && m8007x6a486239.getLeft() <= width) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = this.f93579x.w0(m8007x6a486239);
                        i18 = round;
                        i19 = round2;
                        if (a1Var.m8111xc3bce453(this.f93579x, this.f93564f, w07)) {
                            int abs = java.lang.Math.abs(i38 - ((m8007x6a486239.getLeft() + m8007x6a486239.getRight()) / 2));
                            int abs2 = java.lang.Math.abs(i39 - ((m8007x6a486239.getTop() + m8007x6a486239.getBottom()) / 2));
                            int i48 = (abs * abs) + (abs2 * abs2);
                            int size = ((java.util.ArrayList) this.A).size();
                            i17 = i38;
                            int i49 = 0;
                            int i57 = 0;
                            while (true) {
                                i27 = width;
                                if (i57 >= size || i48 <= ((java.lang.Integer) ((java.util.ArrayList) this.B).get(i57)).intValue()) {
                                    break;
                                }
                                i49++;
                                i57++;
                                width = i27;
                            }
                            ((java.util.ArrayList) this.A).add(i49, w07);
                            ((java.util.ArrayList) this.B).add(i49, java.lang.Integer.valueOf(i48));
                            i47++;
                            round = i18;
                            round2 = i19;
                            i38 = i17;
                            width = i27;
                        } else {
                            i17 = i38;
                        }
                    } else {
                        i17 = i38;
                        i18 = round;
                        i19 = round2;
                    }
                    i27 = width;
                    i47++;
                    round = i18;
                    round2 = i19;
                    i38 = i17;
                    width = i27;
                }
                java.util.ArrayList arrayList = (java.util.ArrayList) this.A;
                if (arrayList.size() == 0) {
                    return;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m8112xf7c93ed7 = a1Var.m8112xf7c93ed7(k3Var, arrayList, i28, i29);
                if (m8112xf7c93ed7 == null) {
                    ((java.util.ArrayList) this.A).clear();
                    ((java.util.ArrayList) this.B).clear();
                    return;
                }
                int m8183xf806b362 = m8112xf7c93ed7.m8183xf806b362();
                int m8183xf806b3622 = k3Var.m8183xf806b362();
                if (a1Var.mo8132xc39cb650(this.f93579x, k3Var, m8112xf7c93ed7)) {
                    this.f93574s.mo8133xaffa1414(this.f93579x, k3Var, m8183xf806b3622, m8112xf7c93ed7, m8183xf806b362, i28, i29);
                }
            }
        }
    }

    public void m(android.view.View view) {
        if (view == this.C) {
            this.C = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0094, code lost:
    
        if (r2 > 0) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r25, int r26) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.g1.n(androidx.recyclerview.widget.k3, int):void");
    }

    public void o(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (this.f93574s.m8123x7923a37a(this.f93579x, k3Var) && k3Var.f3639x46306858.getParent() == this.f93579x) {
            android.view.VelocityTracker velocityTracker = this.f93581z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.f93581z = android.view.VelocityTracker.obtain();
            this.f93570o = 0.0f;
            this.f93569n = 0.0f;
            n(k3Var, 2);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        float f17;
        float f18;
        if (this.f93564f != null) {
            float[] fArr = this.f93563e;
            j(fArr);
            float f19 = fArr[0];
            f18 = fArr[1];
            f17 = f19;
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        this.f93574s.m8130xc398a7c3(canvas, c1163xf1deaba4, this.f93564f, this.f93577v, this.f93575t, f17, f18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        float f17;
        float f18;
        if (this.f93564f != null) {
            float[] fArr = this.f93563e;
            j(fArr);
            float f19 = fArr[0];
            f18 = fArr[1];
            f17 = f19;
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        this.f93574s.m8131x73cebf37(canvas, c1163xf1deaba4, this.f93564f, this.f93577v, this.f93575t, f17, f18);
    }

    public void p(android.view.MotionEvent motionEvent, int i17, int i18) {
        float x17 = motionEvent.getX(i18);
        float y17 = motionEvent.getY(i18);
        float f17 = x17 - this.f93565g;
        this.f93569n = f17;
        this.f93570o = y17 - this.f93566h;
        if ((i17 & 4) == 0) {
            this.f93569n = java.lang.Math.max(0.0f, f17);
        }
        if ((i17 & 8) == 0) {
            this.f93569n = java.lang.Math.min(0.0f, this.f93569n);
        }
        if ((i17 & 1) == 0) {
            this.f93570o = java.lang.Math.max(0.0f, this.f93570o);
        }
        if ((i17 & 2) == 0) {
            this.f93570o = java.lang.Math.min(0.0f, this.f93570o);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void p3(android.view.View view) {
        m(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = this.f93579x.w0(view);
        if (w07 == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f93564f;
        if (k3Var != null && w07 == k3Var) {
            n(null, 0);
            return;
        }
        h(w07, false);
        if (((java.util.ArrayList) this.f93562d).remove(w07.f3639x46306858)) {
            this.f93574s.mo8113xb4407692(this.f93579x, w07);
        }
    }
}
