package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView */
/* loaded from: classes15.dex */
public class C16332x7cb9791e extends android.widget.FrameLayout {
    public static android.util.DisplayMetrics E;
    public boolean A;
    public final int B;
    public final int C;
    public final android.view.GestureDetector D;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f226645d;

    /* renamed from: e, reason: collision with root package name */
    public ub3.v0 f226646e;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.ValueAnimator f226647f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f226648g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.ValueAnimator f226649h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.ValueAnimator f226650i;

    /* renamed from: m, reason: collision with root package name */
    public ub3.t0 f226651m;

    /* renamed from: n, reason: collision with root package name */
    public ub3.t0 f226652n;

    /* renamed from: o, reason: collision with root package name */
    public ub3.u0 f226653o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f226654p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f226655q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f226656r;

    /* renamed from: s, reason: collision with root package name */
    public int f226657s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f226658t;

    /* renamed from: u, reason: collision with root package name */
    public int f226659u;

    /* renamed from: v, reason: collision with root package name */
    public int f226660v;

    /* renamed from: w, reason: collision with root package name */
    public float f226661w;

    /* renamed from: x, reason: collision with root package name */
    public float f226662x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f226663y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f226664z;

    public C16332x7cb9791e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = 2500;
        this.D = new android.view.GestureDetector(new ub3.r0(this));
        this.f226646e = new ub3.v0();
        this.f226645d = new java.util.ArrayList();
        this.f226663y = new java.util.ArrayList();
        this.f226664z = new java.util.ArrayList();
        this.B = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a4o);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e, int i17) {
        if (i17 < 0) {
            c16332x7cb9791e.getClass();
            return;
        }
        if (i17 < c16332x7cb9791e.f226660v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShuffleView", "touch card " + i17);
            if (c16332x7cb9791e.f226650i.isStarted()) {
                c16332x7cb9791e.f226650i.cancel();
            }
            c16332x7cb9791e.f226650i.removeAllUpdateListeners();
            c16332x7cb9791e.f226650i.removeAllListeners();
            c16332x7cb9791e.f226658t = (android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17);
            c16332x7cb9791e.f226659u = i17;
            if (c16332x7cb9791e.f226646e.f507675b == 4) {
                if (i17 > 0) {
                    c16332x7cb9791e.f226650i.addUpdateListener(new ub3.p0(c16332x7cb9791e, i17 - 1, (c16332x7cb9791e.f226660v - 1) - i17));
                } else {
                    c16332x7cb9791e.f226650i.addUpdateListener(new ub3.q0(c16332x7cb9791e));
                }
                ub3.u0 u0Var = c16332x7cb9791e.f226653o;
                if (u0Var != null) {
                    int i18 = c16332x7cb9791e.f226659u;
                    int i19 = c16332x7cb9791e.f226660v;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404 = ((ub3.f) u0Var).f507633a;
                    if (i19 == 8) {
                        activityC16330x45b4a404.H.a("music" + (i18 + 1) + ".m4a");
                        int[] iArr = activityC16330x45b4a404.V;
                        iArr[4] = iArr[4] + 1;
                    } else {
                        activityC16330x45b4a404.H.a("touch_card.m4a");
                        int[] iArr2 = activityC16330x45b4a404.V;
                        iArr2[2] = iArr2[2] + 1;
                    }
                }
            }
            c16332x7cb9791e.f226650i.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getSelectScaleTranslationX */
    public float m66057x180bac5f() {
        if (this.f226656r == null) {
            return 0.0f;
        }
        float width = (r0.getWidth() * 0.33f) - this.f226661w;
        int i17 = this.f226657s;
        int i18 = i17 - 1;
        int i19 = (this.f226660v - 1) - i17;
        int i27 = i18 > 0 ? 0 + i18 : 0;
        if (i19 > 0) {
            i27 += i19;
        }
        if (i27 > 0) {
            return (width * 2.0f) / i27;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getTouchScaleTranslationX */
    public float m66058xa8797fa8() {
        if (this.f226658t == null) {
            return 0.0f;
        }
        float width = (r0.getWidth() * 0.28f) - this.f226661w;
        int i17 = this.f226659u;
        int i18 = i17 - 1;
        int i19 = (this.f226660v - 1) - i17;
        int i27 = i18 > 0 ? 0 + i18 : 0;
        if (i19 > 0) {
            i27 += i19;
        }
        if (i27 > 0) {
            return (width * 2.0f) / i27;
        }
        return 0.0f;
    }

    public final void d() {
        if (this.f226656r != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShuffleView", "selectView != null, cancel select");
            if (this.f226650i.isStarted()) {
                this.f226650i.cancel();
            }
            this.f226650i.removeAllUpdateListeners();
            this.f226650i.removeAllListeners();
            if (this.f226646e.f507675b == 4 && this.f226657s >= 0) {
                this.f226650i.addUpdateListener(new ub3.l0(this));
            }
            this.f226656r = null;
            this.f226657s = 0;
            this.f226650i.start();
        }
    }

    public final void e() {
        if (this.f226658t != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShuffleView", "touchView != null,cancel touch");
            if (this.f226650i.isStarted()) {
                this.f226650i.cancel();
            }
            this.f226650i.removeAllUpdateListeners();
            this.f226650i.removeAllListeners();
            if (this.f226646e.f507675b == 4 && this.f226659u >= 0) {
                this.f226650i.addUpdateListener(new ub3.o0(this));
            }
            this.f226658t = null;
            this.f226659u = -1;
            this.f226650i.start();
        }
    }

    public final android.graphics.Rect f(int i17) {
        if (i17 < 0 || i17 >= this.f226660v) {
            return null;
        }
        java.util.List list = this.f226645d;
        android.view.View view = (android.view.View) ((java.util.ArrayList) list).get(i17);
        if (this.f226646e.f507675b != 4) {
            return null;
        }
        if (i17 == 0) {
            return new android.graphics.Rect(view.getLeft() + ((int) view.getTranslationX()), view.getTop() + ((int) view.getTranslationY()), view.getRight() + ((int) view.getTranslationX()), view.getBottom() + ((int) view.getTranslationY()));
        }
        android.view.View view2 = (android.view.View) ((java.util.ArrayList) list).get(i17 - 1);
        return new android.graphics.Rect(view2.getRight() + ((int) view2.getTranslationX()), view.getTop() + ((int) view.getTranslationY()), view.getRight() + ((int) view.getTranslationX()), view.getBottom() + ((int) view.getTranslationY()));
    }

    public float g(int i17) {
        int i18;
        ub3.v0 v0Var = this.f226646e;
        if (v0Var.f507674a != 2 || (i18 = this.f226660v) <= 0) {
            return 0.0f;
        }
        int i19 = v0Var.f507675b;
        if (i19 == 3) {
            float f17 = (i18 - 1) * 0.5f;
            float f18 = this.f226661w;
            return (f17 * f18) - (f18 * i17);
        }
        if (i19 != 4) {
            return 0.0f;
        }
        float f19 = this.f226661w;
        return (i17 * f19) - (((i18 - 1) * 0.5f) * f19);
    }

    /* renamed from: getEnterView */
    public android.view.View m66059xcc49fae7() {
        return this.f226655q;
    }

    /* renamed from: getExitView */
    public android.view.View m66060xfd54e659() {
        return this.f226654p;
    }

    public float h(int i17) {
        ub3.v0 v0Var = this.f226646e;
        if (v0Var.f507674a != 1) {
            return 0.0f;
        }
        int i18 = v0Var.f507675b;
        if (i18 == 1) {
            float f17 = (this.f226660v - 1) * 0.5f;
            float f18 = this.f226662x;
            return (f17 * f18) - (f18 * i17);
        }
        if (i18 != 2) {
            return 0.0f;
        }
        float f19 = this.f226662x;
        return (i17 * f19) - (((this.f226660v - 1) * 0.5f) * f19);
    }

    public final void i(int i17) {
        this.f226649h.removeAllUpdateListeners();
        this.f226649h.removeAllListeners();
        java.util.List list = this.f226645d;
        int size = ((java.util.ArrayList) list).size();
        int i18 = this.f226660v;
        if (size < i18) {
            int i19 = i18 - 1;
            this.f226660v = i19;
            if (i19 == 1) {
                android.view.View findViewById = ((android.view.View) ((java.util.ArrayList) list).get(0)).findViewById(com.p314xaae8f345.mm.R.id.j1z);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "playShuffle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "playShuffle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            l();
            this.f226649h.addUpdateListener(new ub3.s0(this));
            this.f226649h.addListener(new ub3.e0(this));
        } else {
            android.view.View view = (android.view.View) ((java.util.ArrayList) list).get(i18 - 1);
            this.f226655q = view;
            k(view, this.f226660v - 1);
            addView(this.f226655q, 0);
            if (this.f226648g != null) {
                int i27 = this.f226646e.f507676c;
                if (i27 == 1) {
                    this.f226655q.setTranslationY(-E.heightPixels);
                } else if (i27 == 2) {
                    this.f226655q.setTranslationY(E.heightPixels);
                } else if (i27 == 3) {
                    this.f226655q.setTranslationX(-E.widthPixels);
                } else if (i27 == 4) {
                    this.f226655q.setTranslationX(E.widthPixels);
                }
            }
            android.view.View view2 = this.f226655q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "playShuffle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "playShuffle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f226649h.addUpdateListener(new ub3.f0(this, i17));
            this.f226649h.addListener(new ub3.g0(this));
        }
        this.f226649h.start();
    }

    public final void j(int i17) {
        if (i17 < 0 || i17 >= this.f226660v) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShuffleView", "select card " + i17);
        if (this.f226650i.isStarted()) {
            this.f226650i.cancel();
        }
        this.f226650i.removeAllUpdateListeners();
        this.f226650i.removeAllListeners();
        this.f226656r = (android.view.View) ((java.util.ArrayList) this.f226645d).get(i17);
        this.f226657s = i17;
        this.f226658t = null;
        this.f226659u = -1;
        if (this.f226646e.f507675b == 4) {
            if (i17 > 0) {
                this.f226650i.addUpdateListener(new ub3.m0(this, i17 - 1, (this.f226660v - 1) - i17));
            } else {
                this.f226650i.addUpdateListener(new ub3.n0(this));
            }
        }
        this.f226650i.start();
    }

    public final void k(android.view.View view, int i17) {
        ub3.v0 v0Var = this.f226646e;
        int i18 = v0Var.f507674a;
        if (i18 == 1) {
            v0Var.getClass();
            view.setScaleX(1.0f - (0.01f * i17));
            view.setTranslationY(h(i17));
        } else if (i18 == 2) {
            view.setScaleY(1.0f - (v0Var.f507677d * i17));
            view.setTranslationX(g(i17));
        }
    }

    public final void l() {
        if (this.f226660v <= 1) {
            this.f226661w = 0.0f;
            this.f226662x = 0.0f;
            return;
        }
        java.util.List list = this.f226645d;
        ((android.view.View) ((java.util.ArrayList) list).get(0)).getWidth();
        ((android.view.View) ((java.util.ArrayList) list).get(0)).getHeight();
        int i17 = this.f226646e.f507674a;
        if (i17 != 2) {
            if (i17 == 1) {
                this.f226662x = (((android.view.View) ((java.util.ArrayList) list).get(0)).getHeight() * 1.0f) / this.f226660v;
            }
        } else {
            float width = (((android.view.View) ((java.util.ArrayList) list).get(0)).getWidth() * 1.5f) / this.f226660v;
            this.f226661w = width;
            if (width > ((android.view.View) ((java.util.ArrayList) list).get(0)).getWidth() * 0.23f) {
                this.f226661w = ((android.view.View) ((java.util.ArrayList) list).get(0)).getWidth() * 0.23f;
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        if (this.A) {
            return true;
        }
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        if (this.f226660v <= 0) {
            return false;
        }
        getHeight();
        java.util.List list = this.f226645d;
        ((android.view.View) ((java.util.ArrayList) list).get(0)).getHeight();
        int height = ((android.view.View) ((java.util.ArrayList) list).get(0)).getHeight() / 7;
        if (y17 < (getHeight() - ((android.view.View) ((java.util.ArrayList) list).get(0)).getHeight()) - (((android.view.View) ((java.util.ArrayList) list).get(0)).getHeight() / 7)) {
            if (this.f226656r == null || motionEvent.getActionMasked() != 0) {
                android.view.View view = this.f226658t;
                if (view != null && view.getTranslationY() == (-this.f226658t.getHeight()) / 7) {
                    ub3.u0 u0Var = this.f226653o;
                    if (u0Var != null) {
                        ((ub3.f) u0Var).b(this.f226659u, this.f226660v);
                    }
                    j(this.f226659u);
                } else if (this.f226658t != null) {
                    e();
                }
            } else {
                ub3.u0 u0Var2 = this.f226653o;
                if (u0Var2 != null) {
                    ((ub3.f) u0Var2).a(this.f226657s, this.f226660v);
                }
                d();
            }
            return false;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= this.f226660v) {
                z17 = false;
                break;
            }
            android.graphics.Rect f17 = f(i17);
            if (f17 != null && f17.contains(x17, y17)) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (!z17) {
            motionEvent.getActionMasked();
            if (this.f226656r == null || motionEvent.getActionMasked() != 0) {
                android.view.View view2 = this.f226658t;
                if (view2 != null && view2.getTranslationY() == (-this.f226658t.getHeight()) / 7) {
                    ub3.u0 u0Var3 = this.f226653o;
                    if (u0Var3 != null) {
                        ((ub3.f) u0Var3).b(this.f226659u, this.f226660v);
                    }
                    j(this.f226659u);
                } else if (this.f226658t != null) {
                    e();
                }
            } else {
                ub3.u0 u0Var4 = this.f226653o;
                if (u0Var4 != null) {
                    ((ub3.f) u0Var4).a(this.f226657s, this.f226660v);
                }
                d();
            }
        }
        if (this.f226660v <= 1) {
            return false;
        }
        android.view.GestureDetector gestureDetector = this.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShuffleView", "ret:%s,action:%s", java.lang.Boolean.valueOf(onTouchEvent), java.lang.Integer.valueOf(motionEvent.getActionMasked()));
        if (!onTouchEvent && motionEvent.getActionMasked() == 1) {
            android.view.View view3 = this.f226658t;
            if (view3 != null && view3.getTranslationY() == (-this.f226658t.getHeight()) / 7) {
                ub3.u0 u0Var5 = this.f226653o;
                if (u0Var5 != null) {
                    ((ub3.f) u0Var5).b(this.f226659u, this.f226660v);
                }
                j(this.f226659u);
            } else if (this.f226658t != null) {
                e();
            }
        }
        return true;
    }

    /* renamed from: setAllShuffleCards */
    public void m66061x2999f369(java.util.List<android.view.View> list) {
        java.util.List list2 = this.f226645d;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        this.f226657s = 0;
        this.f226656r = null;
        this.f226659u = -1;
        this.f226658t = null;
        removeAllViews();
        java.util.ArrayList arrayList = (java.util.ArrayList) list2;
        if (arrayList.size() > 100) {
            this.f226660v = 100;
        } else {
            int size = arrayList.size();
            this.f226660v = size;
            if (size == 1) {
                android.view.View findViewById = ((android.view.View) arrayList.get(0)).findViewById(com.p314xaae8f345.mm.R.id.j1z);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "fitCards", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "fitCards", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        for (int i17 = this.f226660v - 1; i17 >= 0; i17--) {
            addView((android.view.View) arrayList.get(i17));
        }
        addOnLayoutChangeListener(new ub3.k0(this));
    }

    /* renamed from: setCardListener */
    public void m66062x31d2166(ub3.u0 u0Var) {
        this.f226653o = u0Var;
    }

    /* renamed from: setEnterAnimator */
    public void m66063x6bc5609d(android.animation.ValueAnimator valueAnimator) {
        android.animation.ValueAnimator valueAnimator2 = this.f226648g;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f226648g.cancel();
        }
        this.f226648g = valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new ub3.j0(this));
        }
    }

    /* renamed from: setEnterAnimatorListener */
    public void m66064xc2749c71(ub3.t0 t0Var) {
        this.f226652n = t0Var;
    }

    /* renamed from: setExitAnimator */
    public void m66065xa11bd7a7(android.animation.ValueAnimator valueAnimator) {
        android.animation.ValueAnimator valueAnimator2 = this.f226647f;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f226647f.cancel();
        }
        this.f226647f = valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new ub3.i0(this));
        }
    }

    /* renamed from: setExitAnimatorListener */
    public void m66066xdc10697b(ub3.t0 t0Var) {
        this.f226651m = t0Var;
    }

    /* renamed from: setShuffleSetting */
    public void m66067xa14a7a19(ub3.v0 v0Var) {
        this.f226646e = v0Var;
        this.f226649h = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v0Var.f507678e);
        this.f226650i = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(80);
    }
}
