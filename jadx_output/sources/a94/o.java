package a94;

/* loaded from: classes4.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView f2460f;

    public o(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView shakeCardAnimView, java.lang.String str, java.lang.String str2) {
        this.f2460f = shakeCardAnimView;
        this.f2458d = str;
        this.f2459e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f2458d;
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView shakeCardAnimView = this.f2460f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$2");
        try {
            if (com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.b(shakeCardAnimView)) {
                com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.a(shakeCardAnimView).setPath("assets://sns/sns_ad_shake_landing_page_anim_low.pag");
                com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "initPagAnimViewData, force use local low file");
            } else {
                java.lang.String b17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.b(str, this.f2459e);
                if (android.text.TextUtils.isEmpty(b17)) {
                    com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().downloadPagFile(str);
                    com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.a(shakeCardAnimView).setPath("assets://sns/sns_ad_shake_landing_page_anim_low.pag");
                    com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "initPagAnimViewData, use local file");
                } else {
                    if (com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.a(shakeCardAnimView).getUseRfx()) {
                        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.a(shakeCardAnimView).setComposition(com.tencent.mm.rfx.RfxPagFile.Load(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.e(b17)));
                    } else {
                        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.a(shakeCardAnimView).setComposition(org.libpag.PAGFile.Load(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.e(b17)));
                    }
                    com.tencent.mars.xlog.Log.i("ShakeCardAnimView", "initPagAnimViewData, use sever file");
                }
            }
            com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.a(shakeCardAnimView).setScaleMode(3);
            com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView.a(shakeCardAnimView).setRepeatCount(1);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ShakeCardAnimView", "initPagAnimViewData , exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$2");
    }
}
