package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5;

/* renamed from: com.tencent.mm.plugin.ball.view.FloatMenuView */
/* loaded from: classes14.dex */
public class C12931xa4a39700 extends android.widget.RelativeLayout implements gp1.y {
    public static final /* synthetic */ int I = 0;
    public java.lang.String A;
    public android.os.Vibrator B;
    public android.view.View C;
    public int D;
    public boolean E;
    public volatile boolean F;
    public android.os.ResultReceiver G;
    public boolean H;

    /* renamed from: d, reason: collision with root package name */
    public int f175109d;

    /* renamed from: e, reason: collision with root package name */
    public int f175110e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f175111f;

    /* renamed from: g, reason: collision with root package name */
    public dp1.l f175112g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f175113h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f f175114i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 f175115m;

    /* renamed from: n, reason: collision with root package name */
    public int f175116n;

    /* renamed from: o, reason: collision with root package name */
    public int f175117o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f175118p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f175119q;

    /* renamed from: r, reason: collision with root package name */
    public mp1.g f175120r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.animation.LayoutAnimationController f175121s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.animation.LayoutAnimationController f175122t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.animation.LayoutAnimationController f175123u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.animation.LayoutAnimationController f175124v;

    /* renamed from: w, reason: collision with root package name */
    public int f175125w;

    /* renamed from: x, reason: collision with root package name */
    public int f175126x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f175127y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f175128z;

    public C12931xa4a39700(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700, boolean z17) {
        android.os.Bundle bundle;
        if (c12931xa4a39700.G != null) {
            if (z17) {
                bundle = null;
            } else {
                bundle = new android.os.Bundle();
                bundle.putBoolean("can_add_float_ball_when_hide", c12931xa4a39700.H);
                c12931xa4a39700.H = false;
            }
            c12931xa4a39700.G.send(z17 ? 1 : 2, bundle);
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, int i17) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) c12931xa4a39700.f175119q).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d) ((mp1.f) it.next())).b(c12886x91aa2b6d, i17);
        }
        java.lang.Boolean bool = qp1.w.f447288a;
        if (c12886x91aa2b6d.H == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.H0().O0(c12886x91aa2b6d);
        }
    }

    @Override // gp1.y
    public void X(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.util.Vector vector;
        java.util.List h17 = qp1.w.h(qp1.w.e(list));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (true) {
            java.util.Vector vector2 = (java.util.Vector) h17;
            if (i17 >= vector2.size()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) vector2.get(i17);
            sb6.append(c12886x91aa2b6d2.f174582g);
            sb6.append(c12886x91aa2b6d2.f174579d);
            sb6.append(c12886x91aa2b6d2.f174590r);
            sb6.append(c12886x91aa2b6d2.f174593u);
            sb6.append(c12886x91aa2b6d2.f174596x);
            sb6.append(c12886x91aa2b6d2.f174598z);
            sb6.append(c12886x91aa2b6d2.H);
            sb6.append(c12886x91aa2b6d2.f174587o.f174602d);
            sb6.append(c12886x91aa2b6d2.I);
            sb6.append(c12886x91aa2b6d2.f174578J);
            sb6.append(c12886x91aa2b6d2.A);
            sb6.append("|");
            i17++;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(sb6.toString());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(a17, this.A)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "FloatMenuView ignore refresh");
            return;
        }
        this.A = a17;
        this.f175118p = h17;
        java.util.Collections.reverse(h17);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(qp1.w.a(this.f175118p) ? this.f175118p.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "menuBallInfoList, size:%s", objArr);
        dp1.l lVar = this.f175112g;
        lVar.f323698g = this.f175118p;
        lVar.m8146xced61ae5();
        if (qp1.w.b(list, c12886x91aa2b6d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallUtil", "filterBallInfoListForFloatMenu, single ball info true");
            vector = new java.util.Vector();
        } else if (qp1.w.a(list)) {
            java.util.Vector vector3 = new java.util.Vector();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
                if (!c12886x91aa2b6d3.f174578J) {
                    vector3.add(c12886x91aa2b6d3);
                }
            }
            vector = vector3;
        } else {
            vector = new java.util.Vector();
        }
        if (qp1.w.a(vector)) {
            j(this.f175109d, this.f175110e);
        } else {
            c(null);
        }
    }

    public void c(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(animatorListenerAdapter);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/FloatMenuView", "com/tencent/mm/plugin/ball/view/FloatMenuView", "hide", "(Landroid/animation/AnimatorListenerAdapter;)V", this, array);
        if (getVisibility() == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "float menu already hide");
            yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatMenuView", "com/tencent/mm/plugin/ball/view/FloatMenuView", "hide", "(Landroid/animation/AnimatorListenerAdapter;)V");
            return;
        }
        final boolean z17 = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.FloatMenuView", "hideFloatMenuView", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.i.d(2);
        if (this.f175127y) {
            this.f175111f.setLayoutAnimation(this.f175122t);
        } else {
            this.f175111f.setLayoutAnimation(this.f175124v);
        }
        this.f175111f.startLayoutAnimation();
        if (qp1.w.a(this.f175118p)) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d : this.f175118p) {
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f175119q).iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d) ((mp1.f) it.next())).f174816a.f174850b.g0(c12886x91aa2b6d);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f = this.f175114i;
        if (c12919x6cd8224f != null && !c12919x6cd8224f.getF174974f()) {
            z17 = true;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: rp1.o1$$b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700.I;
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700.this;
                c12931xa4a39700.getClass();
                float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                c12931xa4a39700.setAlpha(floatValue);
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f2 = c12931xa4a39700.f175114i;
                if (c12919x6cd8224f2 == null || !z17 || c12919x6cd8224f2.f174973e) {
                    return;
                }
                c12919x6cd8224f2.setAlpha(floatValue);
            }
        });
        ofFloat.addListener(new ep1.y(this, animatorListenerAdapter));
        ofFloat.addListener(new rp1.y1(this, z17));
        ofFloat.start();
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatMenuView", "com/tencent/mm/plugin/ball/view/FloatMenuView", "hide", "(Landroid/animation/AnimatorListenerAdapter;)V");
    }

    public final void d() {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f175119q).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d) ((mp1.f) it.next());
            dVar.getClass();
            yj0.a.a("com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuBackPressed", "()V", dVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onFloatMenuBackPressed");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = dVar.f174816a;
            nVar.f174861m.a(5);
            nVar.i();
            yj0.a.h(dVar, "com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuBackPressed", "()V");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if ((keyEvent.getKeyCode() != 4 && keyEvent.getKeyCode() != 3 && keyEvent.getKeyCode() != 82) || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d();
        return true;
    }

    public final void e(android.view.MotionEvent motionEvent) {
        android.view.View k07 = this.f175111f.k0(motionEvent.getRawX() - this.f175111f.getLeft(), motionEvent.getRawY() - this.f175111f.getTop());
        if (k07 != null) {
            f(this.f175111f.u0(k07), k07);
        } else {
            f(-1, null);
        }
    }

    public final void f(int i17, android.view.View view) {
        if (i17 == -1) {
            g(this.C);
        } else if (i17 != this.D) {
            g(this.C);
            if (view != null) {
                view.clearAnimation();
                if ((view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) && !((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) view.getTag()).I) {
                    view.animate().scaleX(1.1f).scaleY(1.1f).setDuration(100L).start();
                    android.os.Vibrator vibrator = this.B;
                    if (vibrator != null) {
                        vibrator.vibrate(10L);
                    }
                }
            }
        }
        this.D = i17;
        this.C = view;
    }

    public final void g(android.view.View view) {
        if (view != null) {
            view.clearAnimation();
            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
    }

    public void h(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(animatorListenerAdapter);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/FloatMenuView", "com/tencent/mm/plugin/ball/view/FloatMenuView", "show", "(Landroid/animation/AnimatorListenerAdapter;)V", this, array);
        i(animatorListenerAdapter, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatMenuView", "com/tencent/mm/plugin/ball/view/FloatMenuView", "show", "(Landroid/animation/AnimatorListenerAdapter;)V");
    }

    public void i(android.animation.AnimatorListenerAdapter animatorListenerAdapter, android.os.ResultReceiver resultReceiver) {
        if (getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "float menu already show");
            return;
        }
        this.G = resultReceiver;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.i.d(1);
        setVisibility(0);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: rp1.o1$$c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700.I;
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700.this;
                c12931xa4a39700.getClass();
                float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                c12931xa4a39700.setAlpha(floatValue);
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f = c12931xa4a39700.f175114i;
                if (c12919x6cd8224f == null || c12919x6cd8224f.f174973e) {
                    return;
                }
                c12919x6cd8224f.setAlpha(floatValue);
            }
        });
        ofFloat.addListener(new ep1.z(this, animatorListenerAdapter));
        ofFloat.addListener(new rp1.x1(this));
        ofFloat.start();
        if (this.f175127y) {
            this.f175111f.setLayoutAnimation(this.f175121s);
        } else {
            this.f175111f.setLayoutAnimation(this.f175123u);
        }
        this.f175111f.startLayoutAnimation();
        if (qp1.w.a(this.f175118p)) {
            java.util.Iterator it = ((java.util.Vector) this.f175118p).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
                java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArraySet) this.f175119q).iterator();
                while (it6.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d) ((mp1.f) it6.next())).f174816a.f174850b.A0(c12886x91aa2b6d);
                }
            }
        }
    }

    public final void j(int i17, int i18) {
        this.f175109d = i17;
        this.f175110e = i18;
        if (this.f175111f == null) {
            return;
        }
        if (getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "updateMenuContentView, ignore when visible");
            return;
        }
        this.F = false;
        int i19 = this.f175126x;
        if (i19 == 0) {
            i19 = qp1.c0.f447226b;
        }
        int size = qp1.w.a(this.f175118p) ? ((java.util.Vector) this.f175118p).size() * this.f175125w : 0;
        int i27 = this.f175109d;
        int i28 = this.f175110e;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.graphics.Point point = new android.graphics.Point(i65.a.B(context), i65.a.k(context));
        int i29 = point.x / 2;
        int i37 = point.y / 2;
        int i38 = i28 + (i19 / 2);
        qp1.b0 b0Var = qp1.b0.TOP_LEFT;
        qp1.b0 b0Var2 = qp1.b0.BOTTOM_LEFT;
        qp1.b0 b0Var3 = (i27 > i29 || i38 > i37) ? i27 <= i29 ? b0Var2 : i38 <= i37 ? qp1.b0.TOP_RIGHT : qp1.b0.BOTTOM_RIGHT : b0Var;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        int k17 = i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i39 = qp1.c0.f447225a;
        int i47 = k17 - i39;
        int i48 = this.f175110e;
        int i49 = i19 + i48;
        if (i49 + size > i47) {
            int i57 = i48 - size;
            if (i57 >= qp1.c0.f447245u) {
                this.F = i57 < i39;
                if (i57 >= i39) {
                    i39 = i57;
                }
                if (b0Var3 == b0Var || b0Var3 == b0Var2) {
                    layoutParams.setMargins(0, 0, 0, 0);
                    layoutParams.leftMargin = 0;
                    layoutParams.topMargin = i39;
                    layoutParams.addRule(9);
                    this.f175121s.setOrder(1);
                } else {
                    layoutParams.setMargins(0, 0, 0, 0);
                    layoutParams.rightMargin = 0;
                    layoutParams.topMargin = i39;
                    layoutParams.addRule(11);
                    this.f175123u.setOrder(1);
                }
                this.f175113h.S(true);
                this.f175111f.mo7967x900dcbe1(this.f175113h);
            } else {
                int i58 = i47 - size;
                this.F = i58 < i39;
                if (i58 >= i39) {
                    i39 = i58;
                }
                if (b0Var3 == b0Var || b0Var3 == b0Var2) {
                    layoutParams.setMargins(0, 0, 0, 0);
                    layoutParams.leftMargin = 0;
                    layoutParams.topMargin = i39;
                    layoutParams.addRule(9);
                    this.f175121s.setOrder(0);
                } else {
                    layoutParams.setMargins(0, 0, 0, 0);
                    layoutParams.rightMargin = 0;
                    layoutParams.topMargin = i39;
                    layoutParams.addRule(11);
                    this.f175123u.setOrder(0);
                }
                this.f175113h.S(false);
                this.f175111f.mo7967x900dcbe1(this.f175113h);
            }
        } else {
            if (b0Var3 == b0Var || b0Var3 == b0Var2) {
                layoutParams.setMargins(0, 0, 0, 0);
                layoutParams.leftMargin = 0;
                layoutParams.topMargin = i49;
                layoutParams.addRule(9);
                this.f175121s.setOrder(0);
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
                layoutParams.rightMargin = 0;
                layoutParams.topMargin = i49;
                layoutParams.addRule(11);
                this.f175123u.setOrder(0);
            }
            this.f175113h.S(false);
            this.f175111f.mo7967x900dcbe1(this.f175113h);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "updateMenuContentView, anchorView:[%s, %s], margins:[%s, %s, %s, %s], enableScroll:%b", java.lang.Integer.valueOf(this.f175109d), java.lang.Integer.valueOf(this.f175110e), java.lang.Integer.valueOf(layoutParams.leftMargin), java.lang.Integer.valueOf(layoutParams.topMargin), java.lang.Integer.valueOf(layoutParams.rightMargin), java.lang.Integer.valueOf(layoutParams.bottomMargin), java.lang.Boolean.valueOf(this.F));
        this.f175111f.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i17 = configuration.orientation;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f175119q).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d) ((mp1.f) it.next())).f174816a, i17);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        mp1.g gVar = this.f175120r;
        if (gVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.e) gVar).f174821a;
            nVar.f174852d.getMeasuredHeight();
            if (nVar.f174852d.getMeasuredHeight() != nVar.f174856h) {
                int measuredHeight = nVar.f174852d.getMeasuredHeight();
                nVar.f174856h = measuredHeight;
                nVar.f174850b.g(measuredHeight);
            }
        }
    }

    /* renamed from: setCanAddFloatBallWhenHide */
    public void m54204x3fd48dc4(boolean z17) {
        this.H = z17;
    }

    /* renamed from: setForceShowFloatMenu */
    public void m54205xd1284e35(boolean z17) {
        this.E = z17;
    }

    /* renamed from: setInLongPressMode */
    public void m54206xad762f83(boolean z17) {
        this.f175128z = z17;
        dp1.l lVar = this.f175112g;
        lVar.f323697f = z17;
        lVar.m8146xced61ae5();
    }

    /* renamed from: setMenuOffsetY */
    public void m54207x6cd47205(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "setMenuOffsetY: %s", java.lang.Integer.valueOf(i17));
        this.f175126x = i17;
    }

    /* renamed from: setOnMeasuredListener */
    public void m54208x6f0a19b(mp1.g gVar) {
        this.f175120r = gVar;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "setVisibility, updateMenuContentView when GONE");
            j(this.f175109d, this.f175110e);
            m54205xd1284e35(false);
        }
    }

    public C12931xa4a39700(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f175119q = new java.util.concurrent.CopyOnWriteArraySet();
        this.f175120r = null;
        this.f175126x = 0;
        this.D = -1;
        this.E = false;
        this.F = false;
        this.G = null;
        this.H = false;
        rp1.p1 p1Var = new rp1.p1(this);
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.boa, this);
        setBackgroundColor(b3.l.m9702x7444d5ad(context, ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).wi() ? com.p314xaae8f345.mm.R.C30859x5a72f63.a9e : com.p314xaae8f345.mm.R.C30859x5a72f63.f560664qu));
        setOnClickListener(new rp1.q1(this));
        setOnTouchListener(new android.view.View.OnTouchListener() { // from class: rp1.o1$$a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700.I;
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700.this;
                c12931xa4a39700.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/ball/view/FloatMenuView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", c12931xa4a39700, array);
                if (motionEvent.getAction() == 1) {
                    c12931xa4a39700.f175116n = (int) motionEvent.getRawX();
                    c12931xa4a39700.f175117o = (int) motionEvent.getRawY();
                }
                yj0.a.i(false, c12931xa4a39700, "com/tencent/mm/plugin/ball/view/FloatMenuView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        });
        this.B = (android.os.Vibrator) context.getSystemService("vibrator");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.jg9);
        this.f175111f = c1163xf1deaba4;
        c1163xf1deaba4.setOverScrollMode(2);
        setClipChildren(false);
        this.f175111f.setClipChildren(false);
        dp1.l lVar = new dp1.l(context);
        this.f175112g = lVar;
        lVar.f323701m = true;
        rp1.v1 v1Var = new rp1.v1(this);
        rp1.k2 k2Var = new rp1.k2();
        k2Var.f93701c = 200L;
        k2Var.f93702d = 200L;
        k2Var.f93704f = 200L;
        k2Var.f93703e = 160L;
        k2Var.f479998s = v1Var;
        dp1.l lVar2 = this.f175112g;
        lVar2.f323702n = v1Var;
        lVar2.f323700i = p1Var;
        k2Var.f479999t = p1Var;
        this.f175111f.m7964x8d4ad49c(k2Var);
        dp1.l lVar3 = this.f175112g;
        lVar3.f323699h = new rp1.r1(this);
        this.f175111f.mo7960x6cab2c8d(lVar3);
        rp1.s1 s1Var = new rp1.s1(this, context);
        this.f175113h = s1Var;
        s1Var.Q(1);
        this.f175111f.mo7967x900dcbe1(this.f175113h);
        this.f175125w = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a17) + i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a1m) + i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a1k);
        this.f175121s = android.view.animation.AnimationUtils.loadLayoutAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559332bs);
        this.f175123u = android.view.animation.AnimationUtils.loadLayoutAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559333bt);
        this.f175122t = android.view.animation.AnimationUtils.loadLayoutAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559330bq);
        this.f175124v = android.view.animation.AnimationUtils.loadLayoutAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559331br);
    }
}
