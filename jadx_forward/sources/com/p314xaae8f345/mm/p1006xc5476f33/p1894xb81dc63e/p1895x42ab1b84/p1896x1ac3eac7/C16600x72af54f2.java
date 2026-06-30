package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/multitask/animation/swipeahead/FloatMultiTaskIndicatorView;", "Landroid/widget/FrameLayout;", "", "Landroid/view/View;", "getView", "Landroid/graphics/drawable/Drawable;", "drawable", "Ljz5/f0;", "setIconDrawable", "Ldk3/g;", "orientationChangedListener", "setOnOrientationChangedListener", "Landroid/widget/ImageView;", "getInnerIndicatorImageView", "Landroid/widget/TextView;", "getInnerIndicatorTextView", "e", "Landroid/widget/ImageView;", "getIndicatorImageView", "()Landroid/widget/ImageView;", "setIndicatorImageView", "(Landroid/widget/ImageView;)V", "indicatorImageView", "f", "Landroid/widget/TextView;", "getIndicatorTextView", "()Landroid/widget/TextView;", "setIndicatorTextView", "(Landroid/widget/TextView;)V", "indicatorTextView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView */
/* loaded from: classes8.dex */
public final class C16600x72af54f2 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f231945d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.widget.ImageView indicatorImageView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView indicatorTextView;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Vibrator f231948g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.Animator f231949h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.Animator f231950i;

    /* renamed from: m, reason: collision with root package name */
    public dk3.g f231951m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f231952n;

    public C16600x72af54f2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean a() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).Di();
    }

    public final android.widget.ImageView getIndicatorImageView() {
        return this.indicatorImageView;
    }

    public final android.widget.TextView getIndicatorTextView() {
        return this.indicatorTextView;
    }

    /* renamed from: getInnerIndicatorImageView */
    public android.widget.ImageView m67114xecb3be11() {
        return this.indicatorImageView;
    }

    /* renamed from: getInnerIndicatorTextView */
    public android.widget.TextView m67115x38dc57e1() {
        return this.indicatorTextView;
    }

    /* renamed from: getView */
    public android.view.View m67116xfb86a31b() {
        return this;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        dk3.g gVar = this.f231951m;
        if (gVar != null) {
            boolean z17 = newConfig.orientation == 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "onOrientationChanged, isLandscape:%s", java.lang.Boolean.valueOf(z17));
            dk3.e eVar = ((dk3.a) gVar).f315978a;
            eVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "updateOrientation, isLandscape:%b", java.lang.Boolean.valueOf(z17));
            eVar.f315989h = z17;
            eVar.d();
            android.widget.FrameLayout.LayoutParams layoutParams = eVar.f315988g;
            if (layoutParams != null) {
                layoutParams.bottomMargin = eVar.f315987f;
            }
            if (layoutParams != null) {
                layoutParams.rightMargin = eVar.f315986e;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f2 = eVar.f315985d;
            if (c16600x72af54f2 != null) {
                c16600x72af54f2.setLayoutParams(layoutParams);
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            android.widget.FrameLayout.LayoutParams layoutParams2 = eVar.f315988g;
            objArr[0] = layoutParams2 != null ? java.lang.Integer.valueOf(layoutParams2.rightMargin) : null;
            android.widget.FrameLayout.LayoutParams layoutParams3 = eVar.f315988g;
            objArr[1] = layoutParams3 != null ? java.lang.Integer.valueOf(layoutParams3.bottomMargin) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "onOrientationChanged layoutParams, right:%s, bottom:%s", objArr);
        }
    }

    /* renamed from: setIconDrawable */
    public void m67117xc76025b9(android.graphics.drawable.Drawable drawable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        this.f231952n = drawable;
        android.widget.ImageView imageView = this.indicatorImageView;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* renamed from: setIndicatorImageView */
    public final void m67118xbb36d953(android.widget.ImageView imageView) {
        this.indicatorImageView = imageView;
    }

    /* renamed from: setIndicatorTextView */
    public final void m67119x47c7cc5f(android.widget.TextView textView) {
        this.indicatorTextView = textView;
    }

    /* renamed from: setOnOrientationChangedListener */
    public void m67120xdecb4a59(dk3.g gVar) {
        this.f231951m = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16600x72af54f2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bof, this);
        this.f231945d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.aaj);
        this.indicatorImageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hc8);
        this.indicatorTextView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hc9);
        java.lang.Object systemService = context.getSystemService("vibrator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        this.f231948g = (android.os.Vibrator) systemService;
        float f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232023g;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f231945d, "scaleX", f17, 1.0f);
        ofFloat.setDuration(200L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f231945d, "scaleY", f17, 1.0f);
        ofFloat2.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f231949h = animatorSet;
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this.f231945d, "scaleX", 1.0f, f17);
        ofFloat3.setDuration(200L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this.f231945d, "scaleY", 1.0f, f17);
        ofFloat4.setDuration(200L);
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        this.f231950i = animatorSet2;
    }

    public /* synthetic */ C16600x72af54f2(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }
}
