package fl1;

/* loaded from: classes14.dex */
public final class c0 extends android.widget.RelativeLayout implements fl1.g2 {

    /* renamed from: d, reason: collision with root package name */
    public int f345245d;

    /* renamed from: e, reason: collision with root package name */
    public final fl1.d0 f345246e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f345247f;

    /* renamed from: g, reason: collision with root package name */
    public final fl1.u1 f345248g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f345249h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnClickListener f345250i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f345251m;

    /* renamed from: n, reason: collision with root package name */
    public fl1.b2 f345252n;

    /* renamed from: o, reason: collision with root package name */
    public fl1.b2 f345253o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f345254p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f345255q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Set f345256r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f345257s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f345258t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f345259u;

    /* renamed from: v, reason: collision with root package name */
    public fl1.h2 f345260v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f345261w;

    public c0(android.content.Context context, fl1.d0 d0Var) {
        super(context);
        this.f345245d = 0;
        this.f345247f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f345248g = new fl1.u1(this);
        this.f345249h = new java.util.LinkedList();
        fl1.v vVar = new fl1.v(this);
        this.f345250i = vVar;
        this.f345251m = new fl1.w(this);
        this.f345254p = false;
        this.f345255q = new x.d(0);
        this.f345256r = new x.d(0);
        this.f345257s = new x.d(0);
        this.f345258t = false;
        this.f345259u = true;
        this.f345260v = null;
        this.f345261w = false;
        setVisibility(4);
        setBackgroundColor(0);
        setOnClickListener(vVar);
        android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
        if (windowManager != null) {
            this.f345245d = windowManager.getDefaultDisplay().getRotation();
        }
        d0Var = d0Var == null ? new fl1.d0() : d0Var;
        d0Var.getClass();
        fl1.u uVar = d0Var.f345281a;
        uVar.getClass();
        uVar.f345405b.put(this, new fl1.t(uVar, this));
        this.f345246e = d0Var;
    }

    @Override // fl1.g2
    public void a(fl1.b2 b2Var) {
        android.animation.AnimatorSet animatorSet;
        android.animation.Animator animator;
        if (b2Var == null || b2Var.mo81952xc2a54588() == null) {
            return;
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            this.f345247f.mo50293x3498a0(new fl1.z(this, b2Var));
            return;
        }
        if (b2Var.mo81952xc2a54588().getParent() == this && this.f345252n != b2Var) {
            this.f345252n = b2Var;
            if (this.f345253o == b2Var) {
                this.f345253o = null;
            }
            android.view.View mo81952xc2a54588 = b2Var.mo81952xc2a54588();
            mo81952xc2a54588.animate().cancel();
            mo81952xc2a54588.clearAnimation();
            android.view.View mo81952xc2a545882 = b2Var.mo81952xc2a54588();
            if (b2Var.q()) {
                if (b2Var.mo14604xa86cd69f() == 2) {
                    android.view.animation.AccelerateInterpolator accelerateInterpolator = new android.view.animation.AccelerateInterpolator();
                    animatorSet = new android.animation.AnimatorSet();
                    android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(mo81952xc2a545882, "translationY", 0.0f, mo81952xc2a545882.getHeight()).setDuration(200L);
                    duration.setInterpolator(accelerateInterpolator);
                    animatorSet.playTogether(duration);
                } else {
                    android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(mo81952xc2a545882.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559288ai);
                    android.view.animation.Interpolator loadInterpolator2 = android.view.animation.AnimationUtils.loadInterpolator(mo81952xc2a545882.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559287ah);
                    animatorSet = new android.animation.AnimatorSet();
                    android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(mo81952xc2a545882, "scaleX", 1.0f, 0.9f).setDuration(220L);
                    duration2.setInterpolator(loadInterpolator);
                    android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(mo81952xc2a545882, "scaleY", 1.0f, 0.9f).setDuration(220L);
                    duration3.setInterpolator(loadInterpolator);
                    android.animation.ObjectAnimator duration4 = android.animation.ObjectAnimator.ofFloat(mo81952xc2a545882, "alpha", 1.0f, 0.0f).setDuration(150L);
                    duration4.setInterpolator(loadInterpolator2);
                    animatorSet.playTogether(duration2, duration3, duration4);
                }
                animator = animatorSet;
            } else {
                animator = android.animation.ObjectAnimator.ofFloat(mo81952xc2a545882, "translationY", 0.0f, 0.0f).setDuration(1L);
            }
            animator.addListener(new fl1.b0(this, mo81952xc2a54588, b2Var));
            animator.start();
            if (this.f345249h.size() <= 1) {
                this.f345248g.a(0, this.f345251m);
            }
            x.d dVar = (x.d) this.f345255q;
            if (!dVar.isEmpty() && this.f345254p) {
                java.util.Iterator it = dVar.iterator();
                while (true) {
                    x.h hVar = (x.h) it;
                    if (!hVar.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g6 g6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g6) ((fl1.d2) hVar.next());
                    g6Var.getClass();
                    g6Var.f168171a.Q(true);
                }
            }
            this.f345254p = false;
        }
    }

    @Override // fl1.g2
    public void b(fl1.c2 c2Var) {
        if (c2Var == null) {
            return;
        }
        if (this.f345258t) {
            ((x.d) this.f345257s).add(c2Var);
        } else {
            ((x.d) this.f345256r).remove(c2Var);
        }
    }

    @Override // fl1.g2
    public void c(fl1.b2 b2Var) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        android.view.animation.Animation loadAnimation;
        android.animation.ValueAnimator valueAnimator;
        if (b2Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDialogContainerLayout", "showDialog dialog[%s] tid[%d]", b2Var.getClass().getName(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            this.f345247f.mo50293x3498a0(new fl1.x(this, b2Var));
            return;
        }
        nf.o.a(getContext());
        fl1.u1 u1Var = this.f345248g;
        android.animation.ValueAnimator valueAnimator2 = u1Var.f345410c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = u1Var.f345410c) != null) {
            valueAnimator.cancel();
        }
        android.view.View mo81952xc2a54588 = b2Var.mo81952xc2a54588();
        if (mo81952xc2a54588 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandDialogContainerLayout", "showDialog NULL dialogView from dialog[%s], stack=%s", b2Var, android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        if (mo81952xc2a54588.getParent() != this) {
            if (mo81952xc2a54588.getParent() != null) {
                ((android.view.ViewGroup) mo81952xc2a54588.getParent()).removeView(mo81952xc2a54588);
            }
            if (b2Var.mo14604xa86cd69f() == 2) {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(12);
                layoutParams.addRule(14);
            } else {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(13);
            }
            addView(mo81952xc2a54588, layoutParams);
            if (this.f345253o != b2Var) {
                mo81952xc2a54588.clearAnimation();
                if (b2Var.n()) {
                    loadAnimation = b2Var.mo14604xa86cd69f() == 2 ? android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559343c4) : android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559277a5);
                } else {
                    loadAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                    loadAnimation.setDuration(1L);
                }
                loadAnimation.setAnimationListener(new fl1.y(this, b2Var));
                mo81952xc2a54588.startAnimation(loadAnimation);
            }
            this.f345253o = b2Var;
        }
        if (mo81952xc2a54588.getVisibility() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo81952xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout", "showDialog", "(Lcom/tencent/mm/plugin/appbrand/widget/dialog/IAppBrandDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo81952xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo81952xc2a54588, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout", "showDialog", "(Lcom/tencent/mm/plugin/appbrand/widget/dialog/IAppBrandDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo81952xc2a54588.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(0L).scaleX(1.0f).scaleY(1.0f).start();
        mo81952xc2a54588.setOnClickListener(this.f345250i);
        this.f345249h.add(b2Var);
        b2Var.v(this);
        setVisibility(0);
        if (this.f345259u) {
            bringToFront();
        }
        u1Var.a(android.graphics.Color.argb(127, 0, 0, 0), null);
        x.d dVar = (x.d) this.f345255q;
        if (!dVar.isEmpty() && !this.f345254p) {
            java.util.Iterator it = dVar.iterator();
            while (true) {
                x.h hVar = (x.h) it;
                if (!hVar.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g6 g6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g6) ((fl1.d2) hVar.next());
                g6Var.getClass();
                g6Var.f168171a.Q(false);
            }
        }
        this.f345254p = true;
    }

    @Override // fl1.g2
    public void d(fl1.c2 c2Var) {
        if (c2Var == null) {
            return;
        }
        ((x.d) this.f345256r).add(c2Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (getChildCount() == 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean e() {
        fl1.b2 b2Var = (fl1.b2) this.f345249h.peekLast();
        if (b2Var == null) {
            setVisibility(8);
            return false;
        }
        if (b2Var.a() || !b2Var.j()) {
            return true;
        }
        b2Var.mo123830x3d6f0539();
        a(b2Var);
        return true;
    }

    public void f() {
        android.animation.ValueAnimator valueAnimator;
        fl1.u1 u1Var = this.f345248g;
        android.animation.ValueAnimator valueAnimator2 = u1Var.f345410c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = u1Var.f345410c) != null) {
            valueAnimator.cancel();
        }
        java.util.LinkedList linkedList = this.f345249h;
        if (!linkedList.isEmpty()) {
            while (!linkedList.isEmpty()) {
                fl1.b2 b2Var = (fl1.b2) linkedList.pollFirst();
                if (b2Var != null && b2Var.mo81952xc2a54588() != null) {
                    android.view.View mo81952xc2a54588 = b2Var.mo81952xc2a54588();
                    mo81952xc2a54588.animate().cancel();
                    mo81952xc2a54588.clearAnimation();
                }
            }
        }
        this.f345252n = null;
        this.f345253o = null;
        this.f345258t = false;
        ((x.d) this.f345256r).clear();
        ((x.d) this.f345257s).clear();
        removeAllViewsInLayout();
        this.f345247f.mo50302x6b17ad39(null);
        ((fl1.w) this.f345251m).run();
    }

    @Override // fl1.g2
    /* renamed from: getCurrentDialog */
    public fl1.b2 mo129672x28daa46b() {
        return (fl1.b2) this.f345249h.peekLast();
    }

    /* renamed from: getShareContext */
    public fl1.d0 m129673x80bc4746() {
        return this.f345246e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int rotation;
        super.onConfigurationChanged(configuration);
        android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
        if (windowManager == null || this.f345245d == (rotation = windowManager.getDefaultDisplay().getRotation())) {
            return;
        }
        this.f345245d = rotation;
        java.util.Iterator it = this.f345249h.iterator();
        while (it.hasNext()) {
            ((fl1.b2) it.next()).y(this.f345245d);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if (this.f345249h.size() == 0) {
            this.f345252n = null;
            this.f345253o = null;
            this.f345248g.a(0, this.f345251m);
            return;
        }
        fl1.b2 b2Var = this.f345253o;
        if (b2Var != null && b2Var.mo81952xc2a54588() == view) {
            this.f345253o = null;
        }
        fl1.b2 b2Var2 = this.f345252n;
        if (b2Var2 == null || b2Var2.mo81952xc2a54588() != view) {
            return;
        }
        this.f345252n = null;
    }

    /* renamed from: setListener */
    public void m129674xc6cf6336(fl1.h2 h2Var) {
        this.f345260v = h2Var;
    }

    /* renamed from: setShouldBringSelfToFrontWhenDialogShown */
    public void m129675x794554ea(boolean z17) {
        this.f345259u = z17;
    }
}
