package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/aa/ui/PaylistAARemarkInputHalfPage;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onActivityResume", "onActivityPause", "onActivityDestroy", "Lcom/tencent/mm/ui/MMActivity;", "context", "", "maxLimitLength", "<init>", "(Lcom/tencent/mm/ui/MMActivity;I)V", "com/tencent/mm/plugin/aa/ui/a6", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage */
/* loaded from: classes5.dex */
public final class C11354x3aa9ae06 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f154068d;

    /* renamed from: e, reason: collision with root package name */
    public final int f154069e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f154070f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f154071g;

    /* renamed from: h, reason: collision with root package name */
    public int f154072h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f154073i;

    /* renamed from: m, reason: collision with root package name */
    public android.animation.ValueAnimator f154074m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ValueAnimator f154075n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f154076o;

    public C11354x3aa9ae06(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f154068d = context;
        this.f154069e = i17;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(context);
        this.f154071g = f5Var;
        this.f154076o = fp.h.c(30);
        context.mo273xed6858b4().a(this);
        f5Var.f291933e = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z5(this);
    }

    public final void a() {
        android.view.View view;
        android.animation.ValueAnimator valueAnimator = this.f154074m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f154075n;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f154074m = null;
        this.f154075n = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f154070f;
        if (z2Var != null && (view = z2Var.f293591g) != null) {
            java.lang.Object parent = view.getParent();
            android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view2 != null) {
                android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != 0) {
                    marginLayoutParams.bottomMargin = 0;
                    view2.setLayoutParams(marginLayoutParams);
                }
            }
            if (view.getPaddingBottom() != 0) {
                view.setPadding(0, 0, 0, 0);
            }
        }
        this.f154071g.d();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = this.f154070f;
        if (z2Var2 != null) {
            z2Var2.B();
        }
        this.f154070f = null;
        this.f154072h = 0;
        this.f154073i = null;
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onActivityDestroy */
    public final void m48645x2711d60c() {
        this.f154071g.d();
        a();
        this.f154068d.mo273xed6858b4().c(this);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onActivityPause */
    public final void m48646xf470b888() {
        this.f154071g.d();
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onActivityResume */
    public final void m48647x9d4787db() {
        this.f154071g.f();
    }
}
