package com.tencent.mm.plugin.ball.view;

/* loaded from: classes14.dex */
public class FloatMenuView extends android.widget.RelativeLayout implements gp1.y {
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
    public int f93576d;

    /* renamed from: e, reason: collision with root package name */
    public int f93577e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f93578f;

    /* renamed from: g, reason: collision with root package name */
    public dp1.l f93579g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f93580h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBackgroundView f93581i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBallView f93582m;

    /* renamed from: n, reason: collision with root package name */
    public int f93583n;

    /* renamed from: o, reason: collision with root package name */
    public int f93584o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f93585p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f93586q;

    /* renamed from: r, reason: collision with root package name */
    public mp1.g f93587r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.animation.LayoutAnimationController f93588s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.animation.LayoutAnimationController f93589t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.animation.LayoutAnimationController f93590u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.animation.LayoutAnimationController f93591v;

    /* renamed from: w, reason: collision with root package name */
    public int f93592w;

    /* renamed from: x, reason: collision with root package name */
    public int f93593x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f93594y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f93595z;

    public FloatMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView, boolean z17) {
        android.os.Bundle bundle;
        if (floatMenuView.G != null) {
            if (z17) {
                bundle = null;
            } else {
                bundle = new android.os.Bundle();
                bundle.putBoolean("can_add_float_ball_when_hide", floatMenuView.H);
                floatMenuView.H = false;
            }
            floatMenuView.G.send(z17 ? 1 : 2, bundle);
        }
    }

    public static void b(com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) floatMenuView.f93586q).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.ball.ui.d) ((mp1.f) it.next())).b(ballInfo, i17);
        }
        java.lang.Boolean bool = qp1.w.f365755a;
        if (ballInfo.H == 2) {
            com.tencent.mm.plugin.ball.service.s.H0().O0(ballInfo);
        }
    }

    @Override // gp1.y
    public void X(java.util.List list, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.util.Vector vector;
        java.util.List h17 = qp1.w.h(qp1.w.e(list));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (true) {
            java.util.Vector vector2 = (java.util.Vector) h17;
            if (i17 >= vector2.size()) {
                break;
            }
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = (com.tencent.mm.plugin.ball.model.BallInfo) vector2.get(i17);
            sb6.append(ballInfo2.f93049g);
            sb6.append(ballInfo2.f93046d);
            sb6.append(ballInfo2.f93057r);
            sb6.append(ballInfo2.f93060u);
            sb6.append(ballInfo2.f93063x);
            sb6.append(ballInfo2.f93065z);
            sb6.append(ballInfo2.H);
            sb6.append(ballInfo2.f93054o.f93069d);
            sb6.append(ballInfo2.I);
            sb6.append(ballInfo2.f93045J);
            sb6.append(ballInfo2.A);
            sb6.append("|");
            i17++;
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(sb6.toString());
        if (com.tencent.mm.sdk.platformtools.t8.D0(a17, this.A)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "FloatMenuView ignore refresh");
            return;
        }
        this.A = a17;
        this.f93585p = h17;
        java.util.Collections.reverse(h17);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(qp1.w.a(this.f93585p) ? this.f93585p.size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "menuBallInfoList, size:%s", objArr);
        dp1.l lVar = this.f93579g;
        lVar.f242165g = this.f93585p;
        lVar.notifyDataSetChanged();
        if (qp1.w.b(list, ballInfo)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallUtil", "filterBallInfoListForFloatMenu, single ball info true");
            vector = new java.util.Vector();
        } else if (qp1.w.a(list)) {
            java.util.Vector vector3 = new java.util.Vector();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo3 = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
                if (!ballInfo3.f93045J) {
                    vector3.add(ballInfo3);
                }
            }
            vector = vector3;
        } else {
            vector = new java.util.Vector();
        }
        if (qp1.w.a(vector)) {
            j(this.f93576d, this.f93577e);
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
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "float menu already hide");
            yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatMenuView", "com/tencent/mm/plugin/ball/view/FloatMenuView", "hide", "(Landroid/animation/AnimatorListenerAdapter;)V");
            return;
        }
        final boolean z17 = false;
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.FloatMenuView", "hideFloatMenuView", new java.lang.Object[0]);
        com.tencent.mm.plugin.ball.service.i.d(2);
        if (this.f93594y) {
            this.f93578f.setLayoutAnimation(this.f93589t);
        } else {
            this.f93578f.setLayoutAnimation(this.f93591v);
        }
        this.f93578f.startLayoutAnimation();
        if (qp1.w.a(this.f93585p)) {
            for (com.tencent.mm.plugin.ball.model.BallInfo ballInfo : this.f93585p) {
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f93586q).iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.ball.ui.d) ((mp1.f) it.next())).f93283a.f93317b.g0(ballInfo);
                }
            }
        }
        com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = this.f93581i;
        if (floatBackgroundView != null && !floatBackgroundView.getF93441f()) {
            z17 = true;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: rp1.o1$$b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                int i17 = com.tencent.mm.plugin.ball.view.FloatMenuView.I;
                com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = com.tencent.mm.plugin.ball.view.FloatMenuView.this;
                floatMenuView.getClass();
                float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                floatMenuView.setAlpha(floatValue);
                com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView2 = floatMenuView.f93581i;
                if (floatBackgroundView2 == null || !z17 || floatBackgroundView2.f93440e) {
                    return;
                }
                floatBackgroundView2.setAlpha(floatValue);
            }
        });
        ofFloat.addListener(new ep1.y(this, animatorListenerAdapter));
        ofFloat.addListener(new rp1.y1(this, z17));
        ofFloat.start();
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatMenuView", "com/tencent/mm/plugin/ball/view/FloatMenuView", "hide", "(Landroid/animation/AnimatorListenerAdapter;)V");
    }

    public final void d() {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f93586q).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.ui.d dVar = (com.tencent.mm.plugin.ball.ui.d) ((mp1.f) it.next());
            dVar.getClass();
            yj0.a.a("com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuBackPressed", "()V", dVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatMenuBackPressed");
            com.tencent.mm.plugin.ball.ui.n nVar = dVar.f93283a;
            nVar.f93328m.a(5);
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
        android.view.View k07 = this.f93578f.k0(motionEvent.getRawX() - this.f93578f.getLeft(), motionEvent.getRawY() - this.f93578f.getTop());
        if (k07 != null) {
            f(this.f93578f.u0(k07), k07);
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
                if ((view.getTag() instanceof com.tencent.mm.plugin.ball.model.BallInfo) && !((com.tencent.mm.plugin.ball.model.BallInfo) view.getTag()).I) {
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
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "float menu already show");
            return;
        }
        this.G = resultReceiver;
        com.tencent.mm.plugin.ball.service.i.d(1);
        setVisibility(0);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: rp1.o1$$c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                int i17 = com.tencent.mm.plugin.ball.view.FloatMenuView.I;
                com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = com.tencent.mm.plugin.ball.view.FloatMenuView.this;
                floatMenuView.getClass();
                float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                floatMenuView.setAlpha(floatValue);
                com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = floatMenuView.f93581i;
                if (floatBackgroundView == null || floatBackgroundView.f93440e) {
                    return;
                }
                floatBackgroundView.setAlpha(floatValue);
            }
        });
        ofFloat.addListener(new ep1.z(this, animatorListenerAdapter));
        ofFloat.addListener(new rp1.x1(this));
        ofFloat.start();
        if (this.f93594y) {
            this.f93578f.setLayoutAnimation(this.f93588s);
        } else {
            this.f93578f.setLayoutAnimation(this.f93590u);
        }
        this.f93578f.startLayoutAnimation();
        if (qp1.w.a(this.f93585p)) {
            java.util.Iterator it = ((java.util.Vector) this.f93585p).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
                java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArraySet) this.f93586q).iterator();
                while (it6.hasNext()) {
                    ((com.tencent.mm.plugin.ball.ui.d) ((mp1.f) it6.next())).f93283a.f93317b.A0(ballInfo);
                }
            }
        }
    }

    public final void j(int i17, int i18) {
        this.f93576d = i17;
        this.f93577e = i18;
        if (this.f93578f == null) {
            return;
        }
        if (getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "updateMenuContentView, ignore when visible");
            return;
        }
        this.F = false;
        int i19 = this.f93593x;
        if (i19 == 0) {
            i19 = qp1.c0.f365693b;
        }
        int size = qp1.w.a(this.f93585p) ? ((java.util.Vector) this.f93585p).size() * this.f93592w : 0;
        int i27 = this.f93576d;
        int i28 = this.f93577e;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.graphics.Point point = new android.graphics.Point(i65.a.B(context), i65.a.k(context));
        int i29 = point.x / 2;
        int i37 = point.y / 2;
        int i38 = i28 + (i19 / 2);
        qp1.b0 b0Var = qp1.b0.TOP_LEFT;
        qp1.b0 b0Var2 = qp1.b0.BOTTOM_LEFT;
        qp1.b0 b0Var3 = (i27 > i29 || i38 > i37) ? i27 <= i29 ? b0Var2 : i38 <= i37 ? qp1.b0.TOP_RIGHT : qp1.b0.BOTTOM_RIGHT : b0Var;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        int k17 = i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i39 = qp1.c0.f365692a;
        int i47 = k17 - i39;
        int i48 = this.f93577e;
        int i49 = i19 + i48;
        if (i49 + size > i47) {
            int i57 = i48 - size;
            if (i57 >= qp1.c0.f365712u) {
                this.F = i57 < i39;
                if (i57 >= i39) {
                    i39 = i57;
                }
                if (b0Var3 == b0Var || b0Var3 == b0Var2) {
                    layoutParams.setMargins(0, 0, 0, 0);
                    layoutParams.leftMargin = 0;
                    layoutParams.topMargin = i39;
                    layoutParams.addRule(9);
                    this.f93588s.setOrder(1);
                } else {
                    layoutParams.setMargins(0, 0, 0, 0);
                    layoutParams.rightMargin = 0;
                    layoutParams.topMargin = i39;
                    layoutParams.addRule(11);
                    this.f93590u.setOrder(1);
                }
                this.f93580h.S(true);
                this.f93578f.setLayoutManager(this.f93580h);
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
                    this.f93588s.setOrder(0);
                } else {
                    layoutParams.setMargins(0, 0, 0, 0);
                    layoutParams.rightMargin = 0;
                    layoutParams.topMargin = i39;
                    layoutParams.addRule(11);
                    this.f93590u.setOrder(0);
                }
                this.f93580h.S(false);
                this.f93578f.setLayoutManager(this.f93580h);
            }
        } else {
            if (b0Var3 == b0Var || b0Var3 == b0Var2) {
                layoutParams.setMargins(0, 0, 0, 0);
                layoutParams.leftMargin = 0;
                layoutParams.topMargin = i49;
                layoutParams.addRule(9);
                this.f93588s.setOrder(0);
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
                layoutParams.rightMargin = 0;
                layoutParams.topMargin = i49;
                layoutParams.addRule(11);
                this.f93590u.setOrder(0);
            }
            this.f93580h.S(false);
            this.f93578f.setLayoutManager(this.f93580h);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "updateMenuContentView, anchorView:[%s, %s], margins:[%s, %s, %s, %s], enableScroll:%b", java.lang.Integer.valueOf(this.f93576d), java.lang.Integer.valueOf(this.f93577e), java.lang.Integer.valueOf(layoutParams.leftMargin), java.lang.Integer.valueOf(layoutParams.topMargin), java.lang.Integer.valueOf(layoutParams.rightMargin), java.lang.Integer.valueOf(layoutParams.bottomMargin), java.lang.Boolean.valueOf(this.F));
        this.f93578f.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i17 = configuration.orientation;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f93586q).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.ui.n.a(((com.tencent.mm.plugin.ball.ui.d) ((mp1.f) it.next())).f93283a, i17);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        mp1.g gVar = this.f93587r;
        if (gVar != null) {
            com.tencent.mm.plugin.ball.ui.n nVar = ((com.tencent.mm.plugin.ball.ui.e) gVar).f93288a;
            nVar.f93319d.getMeasuredHeight();
            if (nVar.f93319d.getMeasuredHeight() != nVar.f93323h) {
                int measuredHeight = nVar.f93319d.getMeasuredHeight();
                nVar.f93323h = measuredHeight;
                nVar.f93317b.g(measuredHeight);
            }
        }
    }

    public void setCanAddFloatBallWhenHide(boolean z17) {
        this.H = z17;
    }

    public void setForceShowFloatMenu(boolean z17) {
        this.E = z17;
    }

    public void setInLongPressMode(boolean z17) {
        this.f93595z = z17;
        dp1.l lVar = this.f93579g;
        lVar.f242164f = z17;
        lVar.notifyDataSetChanged();
    }

    public void setMenuOffsetY(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "setMenuOffsetY: %s", java.lang.Integer.valueOf(i17));
        this.f93593x = i17;
    }

    public void setOnMeasuredListener(mp1.g gVar) {
        this.f93587r = gVar;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "setVisibility, updateMenuContentView when GONE");
            j(this.f93576d, this.f93577e);
            setForceShowFloatMenu(false);
        }
    }

    public FloatMenuView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f93586q = new java.util.concurrent.CopyOnWriteArraySet();
        this.f93587r = null;
        this.f93593x = 0;
        this.D = -1;
        this.E = false;
        this.F = false;
        this.G = null;
        this.H = false;
        rp1.p1 p1Var = new rp1.p1(this);
        android.view.View.inflate(context, com.tencent.mm.R.layout.boa, this);
        setBackgroundColor(b3.l.getColor(context, ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).wi() ? com.tencent.mm.R.color.a9e : com.tencent.mm.R.color.f479131qu));
        setOnClickListener(new rp1.q1(this));
        setOnTouchListener(new android.view.View.OnTouchListener() { // from class: rp1.o1$$a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                int i18 = com.tencent.mm.plugin.ball.view.FloatMenuView.I;
                com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = com.tencent.mm.plugin.ball.view.FloatMenuView.this;
                floatMenuView.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/ball/view/FloatMenuView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", floatMenuView, array);
                if (motionEvent.getAction() == 1) {
                    floatMenuView.f93583n = (int) motionEvent.getRawX();
                    floatMenuView.f93584o = (int) motionEvent.getRawY();
                }
                yj0.a.i(false, floatMenuView, "com/tencent/mm/plugin/ball/view/FloatMenuView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        });
        this.B = (android.os.Vibrator) context.getSystemService("vibrator");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.jg9);
        this.f93578f = recyclerView;
        recyclerView.setOverScrollMode(2);
        setClipChildren(false);
        this.f93578f.setClipChildren(false);
        dp1.l lVar = new dp1.l(context);
        this.f93579g = lVar;
        lVar.f242168m = true;
        rp1.v1 v1Var = new rp1.v1(this);
        rp1.k2 k2Var = new rp1.k2();
        k2Var.f12168c = 200L;
        k2Var.f12169d = 200L;
        k2Var.f12171f = 200L;
        k2Var.f12170e = 160L;
        k2Var.f398465s = v1Var;
        dp1.l lVar2 = this.f93579g;
        lVar2.f242169n = v1Var;
        lVar2.f242167i = p1Var;
        k2Var.f398466t = p1Var;
        this.f93578f.setItemAnimator(k2Var);
        dp1.l lVar3 = this.f93579g;
        lVar3.f242166h = new rp1.r1(this);
        this.f93578f.setAdapter(lVar3);
        rp1.s1 s1Var = new rp1.s1(this, context);
        this.f93580h = s1Var;
        s1Var.Q(1);
        this.f93578f.setLayoutManager(this.f93580h);
        this.f93592w = i65.a.f(context, com.tencent.mm.R.dimen.a17) + i65.a.f(context, com.tencent.mm.R.dimen.a1m) + i65.a.f(context, com.tencent.mm.R.dimen.a1k);
        this.f93588s = android.view.animation.AnimationUtils.loadLayoutAnimation(context, com.tencent.mm.R.anim.f477799bs);
        this.f93590u = android.view.animation.AnimationUtils.loadLayoutAnimation(context, com.tencent.mm.R.anim.f477800bt);
        this.f93589t = android.view.animation.AnimationUtils.loadLayoutAnimation(context, com.tencent.mm.R.anim.f477797bq);
        this.f93591v = android.view.animation.AnimationUtils.loadLayoutAnimation(context, com.tencent.mm.R.anim.f477798br);
    }
}
