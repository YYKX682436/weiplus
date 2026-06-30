package com.tencent.mm.openim.ui.view;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%B#\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b$\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0004J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0010J\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0010J\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0010J\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0010¨\u0006("}, d2 = {"Lcom/tencent/mm/openim/ui/view/BaseDialogView;", "Landroid/widget/RelativeLayout;", "", "getMaxTranslationY", "getContentViewLayoutId", "getCloseLayoutHeight", "", "getAnimationTime", "Lx41/a;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOnCloseClickListener", "Lx41/n;", "setBackgroundListener", "Lx41/m;", "setBackgroundTouchListener", "", "fixed", "setIsFixDialogHeight", "fixedHeight", "setFixDialogHeight", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RATE, "setFixDialogHeightRate", "wrapContent", "setContentViewWrapContent", "enableScroll", "setEnableDialogScroll", "enableScrollRightClose", "setEnableScrollRightClose", "cancel", "setCanceledOnTouchOutside", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public abstract class BaseDialogView extends android.widget.RelativeLayout {

    /* renamed from: l1, reason: collision with root package name */
    public static final /* synthetic */ int f72302l1 = 0;
    public int A;
    public int B;
    public int C;
    public final boolean D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public float f72303J;
    public boolean K;
    public float L;
    public boolean M;
    public boolean N;
    public boolean P;
    public final boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public float f72304d;

    /* renamed from: e, reason: collision with root package name */
    public float f72305e;

    /* renamed from: f, reason: collision with root package name */
    public float f72306f;

    /* renamed from: g, reason: collision with root package name */
    public float f72307g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.VelocityTracker f72308h;

    /* renamed from: i, reason: collision with root package name */
    public x41.b f72309i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f72310m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f72311n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.RelativeLayout f72312o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f72313p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f72314p0;

    /* renamed from: q, reason: collision with root package name */
    public x41.n f72315q;

    /* renamed from: r, reason: collision with root package name */
    public x41.a f72316r;

    /* renamed from: s, reason: collision with root package name */
    public int f72317s;

    /* renamed from: t, reason: collision with root package name */
    public float f72318t;

    /* renamed from: u, reason: collision with root package name */
    public float f72319u;

    /* renamed from: v, reason: collision with root package name */
    public float f72320v;

    /* renamed from: w, reason: collision with root package name */
    public int f72321w;

    /* renamed from: x, reason: collision with root package name */
    public int f72322x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.view.animation.DecelerateInterpolator f72323x0;

    /* renamed from: y, reason: collision with root package name */
    public int f72324y;

    /* renamed from: y0, reason: collision with root package name */
    public int f72325y0;

    /* renamed from: z, reason: collision with root package name */
    public int f72326z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseDialogView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* renamed from: getMaxTranslationY, reason: from getter */
    private final int getF72317s() {
        return this.f72317s;
    }

    public final void a(float f17, float f18, long j17, boolean z17) {
        if (f17 == f18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseDialogView", "animateDialogVerticalTranslation start equals end and ignore");
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, f18);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.setDuration(j17);
        ofFloat.addUpdateListener(new x41.c(this));
        ofFloat.addListener(new x41.d(this, z17));
        ofFloat.start();
    }

    public final void b(int i17) {
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator interpolator;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator updateListener;
        float f72317s = getF72317s();
        this.N = true;
        this.P = false;
        android.view.View view = this.f72311n;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        android.view.ViewPropertyAnimator animate = view.animate();
        if (animate == null || (translationY = animate.translationY(f72317s)) == null || (duration = translationY.setDuration(getAnimationTime())) == null || (interpolator = duration.setInterpolator(new android.view.animation.AccelerateInterpolator())) == null || (listener = interpolator.setListener(new x41.f(this, i17))) == null || (updateListener = listener.setUpdateListener(new x41.g(this))) == null) {
            return;
        }
        updateListener.start();
    }

    public abstract android.view.View c(android.view.View view);

    public final void d(float f17, boolean z17) {
        if (this.U) {
            if (!this.T) {
                this.T = true;
            }
            if (this.G) {
                if (this.E > this.I) {
                    this.f72319u = java.lang.Math.max(this.f72319u, this.E - java.lang.Math.max(r1, this.F));
                }
            }
            float f18 = f17 * (z17 ? 0.68f : 0.85f);
            float min = java.lang.Math.min(this.f72317s, java.lang.Math.max(this.f72319u, this.f72318t + f18));
            this.L = f18;
            android.view.View view = this.f72311n;
            if (view == null) {
                kotlin.jvm.internal.o.o("dialogContainer");
                throw null;
            }
            view.setTranslationY(min);
            g(min);
        }
    }

    public final void e() {
        android.view.View decorView;
        if (getContext() instanceof android.app.Activity) {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.Window window = ((android.app.Activity) context).getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            this.f72326z = rect.height();
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseDialogView", "initWindowVisibleHeight: %s, height: %d, windowVisibleHeight: %d, navigationBarHeight: %d", rect, java.lang.Integer.valueOf(rect.height()), java.lang.Integer.valueOf(this.f72326z), java.lang.Integer.valueOf(this.C));
        }
    }

    public void f(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    public final void g(float f17) {
        x41.n nVar = this.f72315q;
        if (nVar != null) {
            w41.j jVar = ((w41.h) nVar).f442858a;
            float max = java.lang.Math.max(0.0f, jVar.f442866o - f17);
            ah5.a aVar = jVar.f442861g;
            if (aVar != null) {
                aVar.b((int) max, jVar.f442866o);
            }
        }
    }

    public long getAnimationTime() {
        return 300L;
    }

    public abstract int getCloseLayoutHeight();

    public abstract int getContentViewLayoutId();

    public final void h() {
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator interpolator;
        android.view.ViewPropertyAnimator updateListener;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator duration;
        this.M = false;
        this.N = true;
        float f72317s = getF72317s();
        float f17 = this.f72320v;
        android.view.View view = this.f72311n;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        view.setTranslationY(f72317s);
        android.view.View view2 = this.f72311n;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        android.view.ViewPropertyAnimator animate = view2.animate();
        if (animate == null || (translationY = animate.translationY(f17)) == null || (interpolator = translationY.setInterpolator(this.f72323x0)) == null || (updateListener = interpolator.setUpdateListener(new x41.j(this))) == null || (listener = updateListener.setListener(new x41.k(this, f72317s, f17))) == null || (duration = listener.setDuration(getAnimationTime())) == null) {
            return;
        }
        duration.start();
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = false;
        objArr[0] = configuration != null ? java.lang.Integer.valueOf(configuration.orientation) : null;
        objArr[1] = java.lang.Integer.valueOf(this.f72325y0);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseDialogView", "onConfigurationChanged newConfig orientation: %s, last: %s", objArr);
        if (configuration != null && this.f72325y0 == configuration.orientation) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        e();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            motionEvent.getAction();
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent) {
            return onInterceptTouchEvent;
        }
        boolean z17 = false;
        if (motionEvent == null) {
            return false;
        }
        if (this.f72308h == null) {
            this.f72308h = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.f72308h;
        kotlin.jvm.internal.o.d(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        android.view.VelocityTracker velocityTracker2 = this.f72308h;
        kotlin.jvm.internal.o.d(velocityTracker2);
        velocityTracker2.computeCurrentVelocity(1000);
        android.view.VelocityTracker velocityTracker3 = this.f72308h;
        kotlin.jvm.internal.o.d(velocityTracker3);
        int xVelocity = (int) velocityTracker3.getXVelocity();
        android.view.VelocityTracker velocityTracker4 = this.f72308h;
        kotlin.jvm.internal.o.d(velocityTracker4);
        int yVelocity = (int) velocityTracker4.getYVelocity();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            motionEvent.getRawX();
            motionEvent.getRawY();
            android.view.View view = this.f72311n;
            if (view == null) {
                kotlin.jvm.internal.o.o("dialogContainer");
                throw null;
            }
            view.getTranslationY();
            this.f72306f = motionEvent.getRawX();
            this.f72307g = motionEvent.getRawY();
        } else if (action != 1 && action == 2) {
            float rawX = motionEvent.getRawX() - this.f72306f;
            float rawY = motionEvent.getRawY() - this.f72307g;
            float rawY2 = motionEvent.getRawY();
            android.view.View view2 = this.f72311n;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("dialogContainer");
                throw null;
            }
            if (rawY2 >= view2.getTranslationY()) {
                if (java.lang.Math.abs(rawY) >= 5.0f && this.V && java.lang.Math.abs(rawX) <= 250.0f && java.lang.Math.abs(yVelocity) > java.lang.Math.abs(xVelocity) && java.lang.Math.abs(yVelocity) > 0 && java.lang.Math.abs(rawY) > java.lang.Math.abs(rawX)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseDialogView", "ViewPager onInterceptTouchEvent action: %d, dialogContainerCurrentTranslationY: %s", java.lang.Integer.valueOf(motionEvent.getAction()), java.lang.Float.valueOf(this.f72318t));
                    if (this.f72318t > this.f72319u || (this.Q && rawY >= 0.0f)) {
                        z17 = true;
                    }
                    if (z17) {
                        this.R = true;
                    }
                } else if (this.W) {
                    if (java.lang.Math.abs(xVelocity) > java.lang.Math.abs(yVelocity) && rawX > 0.0f && java.lang.Math.abs(rawX) > java.lang.Math.abs(rawY) && this.f72306f <= 20.0f) {
                        z17 = true;
                    }
                    if (z17) {
                        this.S = true;
                    }
                }
            }
        }
        motionEvent.getAction();
        return z17;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int min;
        super.onMeasure(i17, i18);
        if (this.f72326z == 0) {
            e();
        }
        android.view.View view = this.f72311n;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        if (view.getMeasuredHeight() == this.f72317s || !this.D) {
            return;
        }
        android.view.View view2 = this.f72311n;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        int measuredHeight = view2.getMeasuredHeight();
        this.f72317s = measuredHeight;
        this.B = java.lang.Math.max(0, this.A - java.lang.Math.max(0, this.f72326z - measuredHeight));
        if (this.G) {
            this.B = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        }
        int i27 = this.f72317s;
        int i28 = this.f72321w;
        this.E = (i27 - i28) - this.B;
        this.F = (this.f72326z / 2) - i28;
        android.view.View view3 = this.f72310m;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("dialogBg");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        layoutParams.height = this.f72326z / 2;
        view3.setLayoutParams(layoutParams);
        boolean z17 = this.G;
        if (z17 || this.K) {
            if (this.K) {
                android.widget.RelativeLayout relativeLayout = this.f72312o;
                if (relativeLayout == null) {
                    kotlin.jvm.internal.o.o("contentContainer");
                    throw null;
                }
                min = relativeLayout.getMeasuredHeight();
            } else {
                int i29 = this.f72317s;
                int i37 = this.H;
                if (i37 > 0) {
                    i19 = i37 - this.f72321w;
                } else {
                    float f17 = this.f72303J;
                    i19 = f17 > 0.0f ? (int) ((f17 * i29) - this.f72321w) : 0;
                }
                min = java.lang.Math.min(this.E, i19);
            }
            this.I = min;
            this.E = min;
            if (min > 0) {
                this.F = min;
            } else {
                z17 = false;
            }
        }
        android.widget.RelativeLayout relativeLayout2 = this.f72312o;
        if (relativeLayout2 == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout2.getLayoutParams();
        int i38 = layoutParams2 != null ? layoutParams2.height : 0;
        if (z17 || this.K) {
            if (z17) {
                android.widget.RelativeLayout relativeLayout3 = this.f72312o;
                if (relativeLayout3 == null) {
                    kotlin.jvm.internal.o.o("contentContainer");
                    throw null;
                }
                int i39 = relativeLayout3.getLayoutParams().height;
                int i47 = this.I;
                if (i39 != i47) {
                    android.widget.RelativeLayout relativeLayout4 = this.f72312o;
                    if (relativeLayout4 == null) {
                        kotlin.jvm.internal.o.o("contentContainer");
                        throw null;
                    }
                    android.view.ViewGroup.LayoutParams layoutParams3 = relativeLayout4.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.height = i47;
                    } else {
                        layoutParams3 = null;
                    }
                    relativeLayout4.setLayoutParams(layoutParams3);
                    post(new x41.l(relativeLayout4));
                }
            }
            android.view.View view4 = this.f72311n;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("dialogContainer");
                throw null;
            }
            float translationY = view4.getTranslationY();
            float f18 = this.E - this.I;
            if (!(translationY == f18)) {
                this.f72318t = f18;
                this.f72320v = f18;
                if (this.P) {
                    android.view.View view5 = this.f72311n;
                    if (view5 == null) {
                        kotlin.jvm.internal.o.o("dialogContainer");
                        throw null;
                    }
                    view5.setTranslationY(f18);
                }
            }
        } else {
            android.widget.RelativeLayout relativeLayout5 = this.f72312o;
            if (relativeLayout5 == null) {
                kotlin.jvm.internal.o.o("contentContainer");
                throw null;
            }
            int measuredHeight2 = relativeLayout5.getMeasuredHeight();
            this.F = measuredHeight2;
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseDialogView", "initContentViewHeight: %s", java.lang.Integer.valueOf(measuredHeight2));
            android.view.View view6 = this.f72311n;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("dialogContainer");
                throw null;
            }
            float translationY2 = view6.getTranslationY();
            float f19 = this.E - this.F;
            if (!(translationY2 == f19)) {
                this.f72318t = f19;
                this.f72320v = f19;
                if (this.P) {
                    android.view.View view7 = this.f72311n;
                    if (view7 == null) {
                        kotlin.jvm.internal.o.o("dialogContainer");
                        throw null;
                    }
                    view7.setTranslationY(f19);
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(this.E);
        objArr[1] = java.lang.Integer.valueOf(this.F);
        android.view.View view8 = this.f72311n;
        if (view8 == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        objArr[2] = java.lang.Float.valueOf(view8.getTranslationY());
        objArr[3] = java.lang.Float.valueOf(this.f72318t);
        objArr[4] = java.lang.Boolean.valueOf(z17);
        objArr[5] = java.lang.Integer.valueOf(this.I);
        objArr[6] = java.lang.Integer.valueOf(i38);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseDialogView", "initContentViewHeight maxContentViewHeight: %d, minContentViewHeight: %d, translationY: %s, dialogContainerCurrentTranslationY: %s, fixedDialog: %b, fixedContentViewHeight: %s, currentContentHeight: %s", objArr);
        i65.a.B(getContext());
        android.view.View view9 = this.f72311n;
        if (view9 != null) {
            view9.getMeasuredHeight();
        } else {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        motionEvent.getAction();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f72304d = motionEvent.getRawX();
            this.f72305e = motionEvent.getRawY();
            if (this.N) {
                this.U = false;
            }
            return true;
        }
        if (action == 1) {
            this.f72304d = 0.0f;
            this.f72305e = 0.0f;
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseDialogView", "onTouchUp isExpand: %b, isTouchScrolling: %s, currentEnableTouchScroll: %s, dialogContainerHalfTranslationY: %s", java.lang.Boolean.valueOf(this.M), java.lang.Boolean.valueOf(this.T), java.lang.Boolean.valueOf(this.U), java.lang.Float.valueOf(this.f72320v));
            if (this.U) {
                if (this.T) {
                    this.T = false;
                }
                if (this.M) {
                    float f17 = this.L;
                    if (f17 > 0.0f) {
                        int i17 = (java.lang.Math.abs(f17) > (this.E * 0.15f) ? 1 : (java.lang.Math.abs(f17) == (this.E * 0.15f) ? 0 : -1));
                    }
                    float f18 = this.L;
                    if (f18 > 0.0f && java.lang.Math.abs(f18) >= ((float) this.E) * 0.15f) {
                        x41.a aVar = this.f72316r;
                        if (aVar != null) {
                            aVar.a(this.R ? 1 : 2);
                        }
                    } else {
                        android.view.View view = this.f72311n;
                        if (view == null) {
                            kotlin.jvm.internal.o.o("dialogContainer");
                            throw null;
                        }
                        a(view.getTranslationY(), this.f72319u, 200L, true);
                    }
                } else {
                    float f19 = this.L;
                    if (f19 > 0.0f) {
                        int i18 = (java.lang.Math.abs(f19) > (this.E * 0.15f) ? 1 : (java.lang.Math.abs(f19) == (this.E * 0.15f) ? 0 : -1));
                    }
                    float f27 = this.L;
                    if (f27 < 0.0f) {
                        int i19 = (java.lang.Math.abs(f27) > (this.E * 0.05f) ? 1 : (java.lang.Math.abs(f27) == (this.E * 0.05f) ? 0 : -1));
                    }
                    float f28 = this.L;
                    if (f28 > 0.0f && java.lang.Math.abs(f28) >= ((float) this.E) * 0.15f) {
                        x41.a aVar2 = this.f72316r;
                        if (aVar2 != null) {
                            aVar2.a(this.R ? 1 : 2);
                        }
                    } else {
                        float f29 = this.L;
                        if (f29 < 0.0f && java.lang.Math.abs(f29) >= ((float) this.E) * 0.05f) {
                            android.view.View view2 = this.f72311n;
                            if (view2 == null) {
                                kotlin.jvm.internal.o.o("dialogContainer");
                                throw null;
                            }
                            a(view2.getTranslationY(), this.f72319u, 200L, true);
                        } else {
                            android.view.View view3 = this.f72311n;
                            if (view3 == null) {
                                kotlin.jvm.internal.o.o("dialogContainer");
                                throw null;
                            }
                            a(view3.getTranslationY(), this.f72320v, 200L, false);
                        }
                    }
                }
            }
            this.R = false;
            this.S = false;
            this.U = true;
        } else if (action == 2) {
            if (this.N) {
                this.U = false;
            }
            if (this.f72304d == 0.0f) {
                if (this.f72305e == 0.0f) {
                    this.f72304d = motionEvent.getRawX();
                    this.f72305e = motionEvent.getRawY();
                }
            }
            float rawX = motionEvent.getRawX() - this.f72304d;
            float rawY = motionEvent.getRawY() - this.f72305e;
            if (java.lang.Math.abs(rawY) > java.lang.Math.abs(rawX)) {
                this.R = true;
            } else if (this.W) {
                this.S = true;
            }
            if (this.R && (this.V || this.W)) {
                d(rawY, true);
            } else if (this.S) {
                d(rawX, false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBackgroundListener(x41.n listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f72315q = listener;
    }

    public final void setBackgroundTouchListener(x41.m listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    public final void setCanceledOnTouchOutside(boolean z17) {
        this.f72314p0 = z17;
        if (z17) {
            android.view.View view = this.f72310m;
            if (view == null) {
                kotlin.jvm.internal.o.o("dialogBg");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/openim/ui/view/BaseDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/openim/ui/view/BaseDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f72310m;
            if (view2 != null) {
                view2.setOnClickListener(new x41.i(this));
                return;
            } else {
                kotlin.jvm.internal.o.o("dialogBg");
                throw null;
            }
        }
        android.view.View view3 = this.f72310m;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("dialogBg");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/openim/ui/view/BaseDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/openim/ui/view/BaseDialogView", "setCanceledOnTouchOutside", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f72310m;
        if (view4 != null) {
            view4.setOnClickListener(null);
        } else {
            kotlin.jvm.internal.o.o("dialogBg");
            throw null;
        }
    }

    public final void setContentViewWrapContent(boolean z17) {
        this.K = z17;
    }

    public final void setEnableDialogScroll(boolean z17) {
        this.V = z17;
    }

    public final void setEnableScrollRightClose(boolean z17) {
        this.W = z17;
    }

    public final void setFixDialogHeight(int i17) {
        this.H = i17;
    }

    public final void setFixDialogHeightRate(float f17) {
        this.f72303J = f17;
    }

    public final void setIsFixDialogHeight(boolean z17) {
        this.G = z17;
    }

    public final void setOnCloseClickListener(x41.a listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f72316r = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDialogView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.D = true;
        this.K = true;
        this.Q = true;
        this.U = true;
        this.V = true;
        this.f72314p0 = true;
        this.f72323x0 = new android.view.animation.DecelerateInterpolator();
        setFitsSystemWindows(true);
        this.f72325y0 = getResources().getConfiguration().orientation;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bns, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.cgz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f72312o = (android.widget.RelativeLayout) findViewById;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
        int contentViewLayoutId = getContentViewLayoutId();
        android.widget.RelativeLayout relativeLayout = this.f72312o;
        if (relativeLayout != null) {
            from.inflate(contentViewLayoutId, (android.view.ViewGroup) relativeLayout, true);
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.cz9);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            this.f72311n = findViewById2;
            android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.f484085cz0);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            this.f72310m = findViewById3;
            this.f72313p = c(inflate);
            android.view.View view = this.f72310m;
            if (view != null) {
                view.setOnClickListener(new x41.i(this));
                android.view.View view2 = this.f72313p;
                if (view2 != null) {
                    view2.setOnClickListener(new x41.h(this));
                    android.widget.RelativeLayout relativeLayout2 = this.f72312o;
                    if (relativeLayout2 != null) {
                        f(relativeLayout2);
                        this.C = com.tencent.mm.ui.bl.c(context);
                        this.f72324y = com.tencent.mm.ui.bl.h(context);
                        this.f72322x = i65.a.k(context) + this.f72324y;
                        this.f72321w = getCloseLayoutHeight();
                        this.A = i65.a.b(context, 50);
                        com.tencent.mars.xlog.Log.i("MicroMsg.BaseDialogView", "initBoxDialogView orientation: %s, getScreenHeight: %d, statusBarHeight: %d, topEmptyHeight: %d", java.lang.Integer.valueOf(this.f72325y0), java.lang.Integer.valueOf(this.f72322x), java.lang.Integer.valueOf(this.f72324y), java.lang.Integer.valueOf(this.A));
                        android.view.View view3 = this.f72311n;
                        if (view3 != null) {
                            view3.setTranslationY(this.f72322x);
                            e();
                            return;
                        } else {
                            kotlin.jvm.internal.o.o("dialogContainer");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.o.o("contentContainer");
                    throw null;
                }
                kotlin.jvm.internal.o.o("closeButton");
                throw null;
            }
            kotlin.jvm.internal.o.o("dialogBg");
            throw null;
        }
        kotlin.jvm.internal.o.o("contentContainer");
        throw null;
    }
}
