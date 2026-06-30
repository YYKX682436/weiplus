package a94;

/* loaded from: classes4.dex */
public class u extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView f2464e;

    public u(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView) {
        this.f2464e = shakeCoverView;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$4");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        android.view.ViewGroup viewGroup = this.f2464e.f163832g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        viewGroup.setVisibility(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$4");
    }
}
