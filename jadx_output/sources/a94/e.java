package a94;

/* loaded from: classes4.dex */
public class e extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView f2450e;

    public e(com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView cardAnimView) {
        this.f2450e = cardAnimView;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$3");
        com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView cardAnimView = this.f2450e;
        if (com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView.a(cardAnimView) != null) {
            com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "onPrepareCard");
            ((com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.e0) com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView.a(cardAnimView)).b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        android.view.View view = cardAnimView.f163805h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        if (view == null) {
            com.tencent.mars.xlog.Log.e("ShakeCardAnimView", "playMainCardAnim, targetView==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$3");
        } else {
            com.tencent.mm.sdk.platformtools.u3.i(new a94.d(this), 100L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$3");
        }
    }
}
