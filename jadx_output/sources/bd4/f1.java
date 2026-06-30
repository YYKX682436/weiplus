package bd4;

/* loaded from: classes4.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout f19318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout improveTranslateLayout) {
        super(0);
        this.f19318d = improveTranslateLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$loadingDrawable$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$loadingDrawable$2");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout improveTranslateLayout = this.f19318d;
        android.graphics.drawable.Drawable drawable = improveTranslateLayout.getResources().getDrawable(com.tencent.mm.R.drawable.bng);
        drawable.setBounds(0, 0, (int) (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout.c(improveTranslateLayout).getTextSize() * 0.8f), (int) (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout.c(improveTranslateLayout).getTextSize() * 0.8f));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLOADING_DRAWABLE_FILTER_COLOR$cp", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLOADING_DRAWABLE_FILTER_COLOR$cp", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        drawable.setColorFilter(com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout.f169181n, android.graphics.PorterDuff.Mode.SRC_IN);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$loadingDrawable$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout$loadingDrawable$2");
        return drawable;
    }
}
