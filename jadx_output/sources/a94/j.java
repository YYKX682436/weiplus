package a94;

/* loaded from: classes4.dex */
public class j extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView f2455e;

    public j(com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView) {
        this.f2455e = gLCardAnimView;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3");
        com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView = this.f2455e;
        if (com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView.h(gLCardAnimView) != null) {
            com.tencent.mars.xlog.Log.i("GLCardAnimView", "onPrepareCard");
            ((com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.e0) com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView.h(gLCardAnimView)).b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        android.view.View view = gLCardAnimView.f163815u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        if (view == null) {
            com.tencent.mars.xlog.Log.e("GLCardAnimView", "playMainCardAnim, targetView==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3");
        } else {
            com.tencent.mm.sdk.platformtools.u3.i(new a94.i(this), 100L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3");
        }
    }
}
