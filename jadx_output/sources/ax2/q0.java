package ax2;

/* loaded from: classes10.dex */
public final class q0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView f15084d;

    public q0(com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView) {
        this.f15084d = livePkCritDoingView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.widget.LinearLayout contentLayoutOne;
        android.widget.LinearLayout contentLayoutTwo;
        android.widget.LinearLayout contentLayoutOne2;
        android.widget.LinearLayout contentLayoutTwo2;
        android.widget.LinearLayout contentLayoutOne3;
        android.widget.LinearLayout contentLayoutTwo3;
        android.widget.ScrollView contentScrollView;
        r45.zh5 b17;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView = this.f15084d;
        contentLayoutOne = livePkCritDoingView.getContentLayoutOne();
        android.view.View childAt = contentLayoutOne.getChildAt(0);
        contentLayoutTwo = livePkCritDoingView.getContentLayoutTwo();
        android.view.View childAt2 = contentLayoutTwo.getChildAt(0);
        contentLayoutOne2 = livePkCritDoingView.getContentLayoutOne();
        contentLayoutOne2.removeAllViews();
        contentLayoutTwo2 = livePkCritDoingView.getContentLayoutTwo();
        contentLayoutTwo2.removeAllViews();
        contentLayoutOne3 = livePkCritDoingView.getContentLayoutOne();
        contentLayoutOne3.addView(childAt2);
        contentLayoutTwo3 = livePkCritDoingView.getContentLayoutTwo();
        contentLayoutTwo3.addView(childAt);
        contentScrollView = livePkCritDoingView.getContentScrollView();
        if (contentScrollView != null) {
            contentScrollView.setScrollY(0);
        }
        java.lang.Object tag = childAt2.getTag();
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null || (b17 = com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView.b(livePkCritDoingView, str)) == null) {
            return;
        }
        if ((childAt2 instanceof android.widget.TextView ? (android.widget.TextView) childAt2 : null) != null) {
            livePkCritDoingView.i((android.widget.TextView) childAt2, b17);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        android.widget.LinearLayout contentLayoutTwo;
        r45.zh5 b17;
        android.widget.SeekBar progressBar;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView = this.f15084d;
        contentLayoutTwo = livePkCritDoingView.getContentLayoutTwo();
        java.lang.Object tag = contentLayoutTwo.getChildAt(0).getTag();
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null || (b17 = com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView.b(livePkCritDoingView, str)) == null) {
            return;
        }
        progressBar = livePkCritDoingView.getProgressBar();
        kotlin.jvm.internal.o.f(progressBar, "access$getProgressBar(...)");
        com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView.a(livePkCritDoingView, progressBar, (int) b17.getLong(2), (int) b17.getLong(1));
    }
}
