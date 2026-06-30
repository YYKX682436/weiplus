package ad4;

/* loaded from: classes4.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ad4.b0 f3175a = new ad4.b0(null);

    public static final void a(android.view.View containerView, android.widget.TextView nickNameTv, android.widget.TextView weCompanyNameTv, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(nickNameTv, "nickNameTv");
        kotlin.jvm.internal.o.g(weCompanyNameTv, "weCompanyNameTv");
        containerView.post(new ad4.z(containerView, nickNameTv, weCompanyNameTv, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper");
    }

    public static final void b(android.widget.TextView textView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetToAutoWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper");
        f3175a.b(textView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetToAutoWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper");
    }
}
