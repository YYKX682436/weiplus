package fl1;

/* loaded from: classes4.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1223xb099fd48.ViewOnClickListenerC12771x8f53376b f345287d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1223xb099fd48.ViewOnClickListenerC12771x8f53376b viewOnClickListenerC12771x8f53376b) {
        this.f345287d = viewOnClickListenerC12771x8f53376b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1223xb099fd48.ViewOnClickListenerC12771x8f53376b viewOnClickListenerC12771x8f53376b = this.f345287d;
        fl1.d1 d1Var = viewOnClickListenerC12771x8f53376b.f172662e;
        if (d1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("optionChooseCallback");
            throw null;
        }
        r45.l25 l25Var = viewOnClickListenerC12771x8f53376b.f172661d;
        if (l25Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("optionConfig");
            throw null;
        }
        fl1.b1 b1Var = (fl1.b1) d1Var;
        b1Var.f345234a.setVisibility(4);
        b1Var.f345235b.setVisibility(8);
        b1Var.f345236c.setVisibility(4);
        android.widget.LinearLayout linearLayout = b1Var.f345237d;
        android.view.View findViewById = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.kkb);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$9", "onOptionChoose", "(Lcom/tencent/mm/protocal/protobuf/OptionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$9", "onOptionChoose", "(Lcom/tencent/mm/protocal/protobuf/OptionItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        fl1.c1 c1Var = b1Var.f345241h;
        if (c1Var.f345277p) {
            return;
        }
        android.view.View findViewById2 = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ned);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper", "animateShowThanksViewAndSubmit", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;Landroid/widget/LinearLayout;Lcom/tencent/mm/protocal/protobuf/OptionItem;Ljava/lang/Runnable;Lcom/tencent/mm/protocal/protobuf/WxagGameOriginalReviewConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper", "animateShowThanksViewAndSubmit", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;Landroid/widget/LinearLayout;Lcom/tencent/mm/protocal/protobuf/OptionItem;Ljava/lang/Runnable;Lcom/tencent/mm/protocal/protobuf/WxagGameOriginalReviewConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.o68);
        imageView.setAlpha(0.0f);
        imageView.setScaleX(0.48076922f);
        imageView.setScaleY(0.48076922f);
        imageView.setRotation(24.0f);
        imageView.setVisibility(0);
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.o69);
        r45.bg7 bg7Var = b1Var.f345240g;
        textView.setText(bg7Var.f452286g);
        textView.setAlpha(0.0f);
        textView.setVisibility(0);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new fl1.q0(c1Var, imageView, textView));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.48076922f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new fl1.r0(c1Var, imageView));
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView, "rotation", 24.0f, 0.0f);
        ofFloat3.setDuration(1300L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animatorSet.addListener(new fl1.s0(c1Var, b1Var.f345239f));
        animatorSet.start();
        c1Var.i(b1Var.f345238e, false, l25Var, bg7Var);
    }
}
