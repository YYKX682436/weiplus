package as3;

/* loaded from: classes5.dex */
public final class h0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView f13511d;

    public h0(com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView bizProfileTopicFlowView) {
        this.f13511d = bizProfileTopicFlowView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        com.tencent.mm.view.recyclerview.WxRecyclerView foldRecyclerView = this.f13511d.getFoldRecyclerView();
        if (foldRecyclerView != null) {
            java.lang.Object animatedValue = anim.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) animatedValue).intValue();
            android.view.ViewGroup.LayoutParams layoutParams = foldRecyclerView.getLayoutParams();
            layoutParams.height = intValue;
            foldRecyclerView.setLayoutParams(layoutParams);
        }
    }
}
