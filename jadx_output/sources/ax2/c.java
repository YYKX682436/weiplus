package ax2;

/* loaded from: classes3.dex */
public final class c implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LiveCritBuffAnimView f15033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f15034e;

    public c(com.tencent.mm.plugin.finder.view.crit.LiveCritBuffAnimView liveCritBuffAnimView, android.view.View view) {
        this.f15033d = liveCritBuffAnimView;
        this.f15034e = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        int i17 = com.tencent.mm.plugin.finder.view.crit.LiveCritBuffAnimView.f131803g;
        this.f15033d.getClass();
        android.view.View view = this.f15034e;
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        java.lang.String str = this.f15033d.f131805e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[moveAndDismiss] view = ");
        android.view.View view = this.f15034e;
        sb6.append(view);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        view.setTag(java.lang.Boolean.TRUE);
    }
}
