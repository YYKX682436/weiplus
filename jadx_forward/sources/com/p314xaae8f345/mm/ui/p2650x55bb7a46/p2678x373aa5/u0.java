package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes9.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 f284637d;

    public u0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 c1Var) {
        this.f284637d = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/view/MMRemindDatePickerRemake$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 c1Var = this.f284637d;
        android.content.Context context = c1Var.f284418a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561228cu);
        android.view.ViewGroup viewGroup = c1Var.f284424g;
        int height = viewGroup != null ? viewGroup.getHeight() : context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        android.view.ViewGroup viewGroup2 = c1Var.f284424g;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        android.view.ViewGroup viewGroup3 = c1Var.f284426i;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(height, dimensionPixelSize);
        ofInt.setDuration(300L);
        ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.q0(c1Var));
        ofInt.addListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r0(c1Var));
        ofInt.start();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/view/MMRemindDatePickerRemake$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
