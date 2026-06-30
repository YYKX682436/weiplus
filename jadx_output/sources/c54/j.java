package c54;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f38690a;

    /* renamed from: b, reason: collision with root package name */
    public final c54.h f38691b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f38692c;

    /* renamed from: d, reason: collision with root package name */
    public long f38693d;

    /* renamed from: e, reason: collision with root package name */
    public final c54.i f38694e;

    public j(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 mHalfEggCardComponent, c54.h mHalfEggCardPageInterface, java.lang.String str) {
        kotlin.jvm.internal.o.g(mHalfEggCardComponent, "mHalfEggCardComponent");
        kotlin.jvm.internal.o.g(mHalfEggCardPageInterface, "mHalfEggCardPageInterface");
        this.f38690a = mHalfEggCardComponent;
        this.f38691b = mHalfEggCardPageInterface;
        this.f38692c = str;
        this.f38694e = new c54.i(this);
    }

    public final void a(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f2 f2Var, java.lang.String str) {
        java.lang.Boolean bool;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doStartAnimAndRequestCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
        java.lang.String d17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.j0.d(str);
        if (d17 == null || d17.length() == 0) {
            this.f38693d = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.ComponentController", "doStartAnimAndRequestCardId, no localCardId, reqEggCardId");
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.u uVar = (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.u) this.f38691b;
            uVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reqEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$22");
            uVar.f163146a.K();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reqEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$22");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1970, 3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            f2Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("attachCardRequestInterface", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            f2Var.f162812x = this.f38694e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachCardRequestInterface", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            if (f2Var.f165056n == null) {
                com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.AdLandingComponent", "--showReqCardAnim--, contentView==null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            } else {
                com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "--showReqCardAnim--");
                f2Var.X();
                f2Var.f162811w.post(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a2(f2Var));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
        } else {
            f2Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLocalCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            if (f2Var.f165056n == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLocalCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            } else {
                com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "--showLocalCardAnim--, cardId=" + d17);
                f2Var.X();
                f2Var.S(d17);
                c54.b T = f2Var.T();
                if (T != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCardAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
                    boolean z17 = T.f38671i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCardAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
                    bool = java.lang.Boolean.valueOf(z17);
                } else {
                    bool = null;
                }
                if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
                    com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "showLocalCardAnim, cardId=" + d17 + ", autoJumpH5=true");
                    f2Var.Z(true);
                    f2Var.W(f2Var.u(), d17, 1);
                } else {
                    com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "showLocalCardAnim, cardId=" + d17 + ", false=true");
                    f2Var.Y(true);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLocalCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1970, 2);
            com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.ComponentController", "doStartAnimAndRequestCardId, pageId=" + str + ", localCardId=" + d17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doStartAnimAndRequestCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
    }
}
