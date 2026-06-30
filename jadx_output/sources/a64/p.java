package a64;

/* loaded from: classes4.dex */
public final class p extends a64.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // a64.e, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdStaticTecReportUIC");
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPageIdKeyReport", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdStaticTecReportUIC");
        if (P6()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2040, 1);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2040, 50);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionType", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        int i17 = this.f1758d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionType", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        if (i17 == 18) {
            if (P6()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2040, 5);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2040, 51);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPageIdKeyReport", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdStaticTecReportUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdStaticTecReportUIC");
    }
}
