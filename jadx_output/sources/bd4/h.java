package bd4;

/* loaded from: classes4.dex */
public final class h extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView f19349d;

    public h(com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView improveCommentView) {
        this.f19349d = improveCommentView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadSpreadContent$shrinkSpan$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView$loadSpreadContent$shrinkSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        int i17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$changeFoldState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView improveCommentView = this.f19349d;
        improveCommentView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeFoldState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        if (improveCommentView.f169119w) {
            improveCommentView.r();
        } else if (improveCommentView.E == null) {
            improveCommentView.q();
        } else {
            int i18 = improveCommentView.D;
            java.lang.Runnable extraActionRunnable = improveCommentView.F;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$3");
            kotlin.jvm.internal.o.g(extraActionRunnable, "extraActionRunnable");
            int[] iArr = new int[2];
            improveCommentView.getLocationInWindow(iArr);
            int i19 = iArr[1];
            ad4.g.f3183a.b(improveCommentView, i18 + i19, improveCommentView.getHeight() + i19, 0, extraActionRunnable);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$3");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeFoldState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$changeFoldState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView$loadSpreadContent$shrinkSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadSpreadContent$shrinkSpan$1");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadSpreadContent$shrinkSpan$1");
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setUnderlineText(false);
        int i17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCollapseTextColor$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        int i18 = this.f19349d.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCollapseTextColor$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        ds6.setColor(i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadSpreadContent$shrinkSpan$1");
    }
}
