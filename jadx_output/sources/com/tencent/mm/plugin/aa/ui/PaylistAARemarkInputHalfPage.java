package com.tencent.mm.plugin.aa.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/aa/ui/PaylistAARemarkInputHalfPage;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onActivityResume", "onActivityPause", "onActivityDestroy", "Lcom/tencent/mm/ui/MMActivity;", "context", "", "maxLimitLength", "<init>", "(Lcom/tencent/mm/ui/MMActivity;I)V", "com/tencent/mm/plugin/aa/ui/a6", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PaylistAARemarkInputHalfPage implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f72535d;

    /* renamed from: e, reason: collision with root package name */
    public final int f72536e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f72537f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.f5 f72538g;

    /* renamed from: h, reason: collision with root package name */
    public int f72539h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f72540i;

    /* renamed from: m, reason: collision with root package name */
    public android.animation.ValueAnimator f72541m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ValueAnimator f72542n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f72543o;

    public PaylistAARemarkInputHalfPage(com.tencent.mm.ui.MMActivity context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f72535d = context;
        this.f72536e = i17;
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(context);
        this.f72538g = f5Var;
        this.f72543o = fp.h.c(30);
        context.mo133getLifecycle().a(this);
        f5Var.f210400e = new com.tencent.mm.plugin.aa.ui.z5(this);
    }

    public final void a() {
        android.view.View view;
        android.animation.ValueAnimator valueAnimator = this.f72541m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f72542n;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f72541m = null;
        this.f72542n = null;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f72537f;
        if (z2Var != null && (view = z2Var.f212058g) != null) {
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
        this.f72538g.d();
        com.tencent.mm.ui.widget.dialog.z2 z2Var2 = this.f72537f;
        if (z2Var2 != null) {
            z2Var2.B();
        }
        this.f72537f = null;
        this.f72539h = 0;
        this.f72540i = null;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void onActivityDestroy() {
        this.f72538g.d();
        a();
        this.f72535d.mo133getLifecycle().c(this);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public final void onActivityPause() {
        this.f72538g.d();
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public final void onActivityResume() {
        this.f72538g.f();
    }
}
