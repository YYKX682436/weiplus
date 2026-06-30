package a94;

/* loaded from: classes4.dex */
public class n implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView f2457d;

    public n(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView shakeCardAnimView) {
        this.f2457d = shakeCardAnimView;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.f163820o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        this.f2457d.f163827m = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
        com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "PagView onAnimationEnd");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.f163820o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView shakeCardAnimView = this.f2457d;
        shakeCardAnimView.f163827m = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        a94.q qVar = shakeCardAnimView.f163828n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        if (qVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            a94.q qVar2 = shakeCardAnimView.f163828n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.e0 e0Var = (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.e0) qVar2;
            e0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPagAnimEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$7");
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = e0Var.f163089b;
            com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView s17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.s(i0Var);
            s17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            if (s17.f163826i) {
                com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView = s17.f163825h;
                gLCardAnimView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                z17 = gLCardAnimView.f163818x;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            } else {
                com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView cardAnimView = s17.f163824g;
                cardAnimView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                z17 = cardAnimView.f163808n;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            }
            com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "onPagAnimEnd, isCardAniming=" + z17);
            if (!z17) {
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.s(i0Var).setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPagAnimEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$7");
        }
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.a(shakeCardAnimView).i(this);
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.a(shakeCardAnimView).n();
        shakeCardAnimView.removeView(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.a(shakeCardAnimView));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
    }
}
