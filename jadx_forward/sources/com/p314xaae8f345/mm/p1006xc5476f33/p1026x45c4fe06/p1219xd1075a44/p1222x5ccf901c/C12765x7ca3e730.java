package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R.\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopContainerView;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewGroup;", "d", "Landroid/view/ViewGroup;", "getContentView", "()Landroid/view/ViewGroup;", "contentView", "Lcl1/o0;", "value", "n", "Lcl1/o0;", "getCallback", "()Lcl1/o0;", "setCallback", "(Lcl1/o0;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cl1/c", "appbrand-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView */
/* loaded from: classes8.dex */
public final class C12765x7ca3e730 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final android.view.ViewGroup contentView;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f172605e;

    /* renamed from: f, reason: collision with root package name */
    public final cl1.p0 f172606f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f172607g;

    /* renamed from: h, reason: collision with root package name */
    public final cl1.y f172608h;

    /* renamed from: i, reason: collision with root package name */
    public final cl1.y f172609i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f172610m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public cl1.o0 callback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12765x7ca3e730(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a() {
        if (b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainerView", "animateHideDesktopView");
            cl1.o0 o0Var = this.callback;
            if (o0Var != null) {
                ((cl1.c) o0Var).A();
            }
            this.f172610m = true;
            android.view.ViewGroup viewGroup = this.contentView;
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(viewGroup, "translationX", 0.0f, getWidth());
            ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofFloat.setDuration(300L);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(viewGroup, "alpha", 1.0f, 0.0f);
            ofFloat2.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofFloat2.setDuration(300L);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this.f172605e, "alpha", 1.0f, 0.0f);
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

    /* renamed from: setCallback */
    public final void m53357x6c4ebec7(cl1.o0 o0Var) {
        if (o0Var == null) {
            return;
        }
        cl1.c cVar = new cl1.c(this, o0Var);
        this.callback = cVar;
        this.f172606f.mo15096x6c4ebec7(cVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12765x7ca3e730(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        sk3.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
        this.f172608h = new cl1.a0();
        ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
        this.f172609i = new cl1.d0();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f172605e = frameLayout;
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 c10436x212919c6 = new com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6(context2);
        frameLayout.addView(c10436x212919c6, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskViewBgParticleColorConfig", "getColorConfig " + com.p314xaae8f345.mm.ui.bk.C());
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            dVar = sk3.d.f490488f;
        } else {
            dVar = sk3.d.f490489g;
        }
        c10436x212919c6.post(new nq.y(c10436x212919c6, dVar.f490493d, dVar.f490494e));
        c10436x212919c6.m43673xabe600e(1);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(getContext());
        frameLayout2.setBackgroundColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
        frameLayout.addView(frameLayout2, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        frameLayout.setVisibility(8);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        ((ft.u3) i95.n0.c(ft.u3.class)).getClass();
        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569552ek, (android.view.ViewGroup) this, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.contentView = viewGroup;
        android.view.KeyEvent.Callback findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564639wq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f172606f = (cl1.p0) findViewById;
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564638wp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f172607g = (android.widget.TextView) findViewById2;
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f78239x65c2f76a)).setOnClickListener(new cl1.b(this));
        addView(viewGroup, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin = com.p314xaae8f345.mm.ui.bl.h(context);
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams2).bottomMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561571ma);
        viewGroup.setVisibility(8);
    }
}
