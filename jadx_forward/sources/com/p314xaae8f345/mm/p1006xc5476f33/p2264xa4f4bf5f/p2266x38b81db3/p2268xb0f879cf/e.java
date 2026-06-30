package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.i f254763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f254764e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.i iVar, in5.s0 s0Var) {
        this.f254763d = iVar;
        this.f254764e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.i iVar = this.f254763d;
        iVar.getClass();
        in5.s0 s0Var = this.f254764e;
        android.content.Context context = s0Var.f374654e;
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f568964om3);
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f566946hl4);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.hvt);
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.f566945hl3);
        android.view.View p19 = s0Var.p(com.p314xaae8f345.mm.R.id.nhv);
        viewGroup.setVisibility(0);
        android.view.animation.AccelerateInterpolator accelerateInterpolator = iVar.f254770h;
        long j17 = iVar.f254769g;
        if (p18 != null) {
            android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.42f, 1.0f, 1.42f, p18.getWidth() * 0.5f, p18.getHeight() * 0.5f);
            scaleAnimation.setInterpolator(accelerateInterpolator);
            scaleAnimation.setDuration(j17);
            scaleAnimation.setFillEnabled(true);
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setFillBefore(false);
            scaleAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.h());
            p18.startAnimation(scaleAnimation);
        }
        if (p19 != null) {
            p19.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.a.f254755d);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.cpc);
        if (viewGroup2 != null) {
            android.view.ViewPropertyAnimator animate = viewGroup2.animate();
            animate.setDuration(j17);
            animate.setInterpolator(accelerateInterpolator);
            animate.setUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.c(iVar, context, viewGroup, p17, p19));
            animate.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.d());
            animate.start();
        }
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.cpo);
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.oqc);
        if (textView2 != null) {
            textView2.setVisibility(4);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
