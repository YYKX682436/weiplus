package com.tencent.mm.plugin.appbrand.widget.desktop;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R.\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopContainerView;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewGroup;", "d", "Landroid/view/ViewGroup;", "getContentView", "()Landroid/view/ViewGroup;", "contentView", "Lcl1/o0;", "value", "n", "Lcl1/o0;", "getCallback", "()Lcl1/o0;", "setCallback", "(Lcl1/o0;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cl1/c", "appbrand-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class AppBrandDesktopContainerView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final android.view.ViewGroup contentView;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f91072e;

    /* renamed from: f, reason: collision with root package name */
    public final cl1.p0 f91073f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f91074g;

    /* renamed from: h, reason: collision with root package name */
    public final cl1.y f91075h;

    /* renamed from: i, reason: collision with root package name */
    public final cl1.y f91076i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f91077m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public cl1.o0 callback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppBrandDesktopContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a() {
        if (b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopContainerView", "animateHideDesktopView");
            cl1.o0 o0Var = this.callback;
            if (o0Var != null) {
                ((cl1.c) o0Var).A();
            }
            this.f91077m = true;
            android.view.ViewGroup viewGroup = this.contentView;
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(viewGroup, "translationX", 0.0f, getWidth());
            ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofFloat.setDuration(300L);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(viewGroup, "alpha", 1.0f, 0.0f);
            ofFloat2.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofFloat2.setDuration(300L);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this.f91072e, "alpha", 1.0f, 0.0f);
            ofFloat3.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofFloat3.setDuration(300L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
            animatorSet.addListener(new cl1.d(this));
            animatorSet.start();
        }
    }

    public final boolean b() {
        return this.contentView.getVisibility() == 0;
    }

    public final cl1.o0 getCallback() {
        return this.callback;
    }

    public final android.view.ViewGroup getContentView() {
        return this.contentView;
    }

    public final void setCallback(cl1.o0 o0Var) {
        if (o0Var == null) {
            return;
        }
        cl1.c cVar = new cl1.c(this, o0Var);
        this.callback = cVar;
        this.f91073f.setCallback(cVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandDesktopContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        sk3.d dVar;
        kotlin.jvm.internal.o.g(context, "context");
        ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
        this.f91075h = new cl1.a0();
        ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
        this.f91076i = new cl1.d0();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f91072e = frameLayout;
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientColorBackgroundView = new com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView(context2);
        frameLayout.addView(gradientColorBackgroundView, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskViewBgParticleColorConfig", "getColorConfig " + com.tencent.mm.ui.bk.C());
        if (com.tencent.mm.ui.bk.C()) {
            dVar = sk3.d.f408955f;
        } else {
            dVar = sk3.d.f408956g;
        }
        gradientColorBackgroundView.post(new nq.y(gradientColorBackgroundView, dVar.f408960d, dVar.f408961e));
        gradientColorBackgroundView.setUpdateMode(1);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(getContext());
        frameLayout2.setBackgroundColor(i65.a.d(getContext(), com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
        frameLayout.addView(frameLayout2, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        frameLayout.setVisibility(8);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        ((ft.u3) i95.n0.c(ft.u3.class)).getClass();
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.f488019ek, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.contentView = viewGroup;
        android.view.KeyEvent.Callback findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f483106wq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f91073f = (cl1.p0) findViewById;
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.f483105wp);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f91074g = (android.widget.TextView) findViewById2;
        ((com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.actionbar_up_indicator_btn)).setOnClickListener(new cl1.b(this));
        addView(viewGroup, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin = com.tencent.mm.ui.bl.h(context);
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams2).bottomMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480038ma);
        viewGroup.setVisibility(8);
    }
}
