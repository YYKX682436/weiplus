package ad4;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z17) {
        super(0);
        this.f3192d = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View contentView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$dismissCommentWindow$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$dismissCommentWindow$1");
        if (this.f3192d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            android.widget.PopupWindow popupWindow = ad4.w.f3206d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            if (popupWindow != null && (contentView = popupWindow.getContentView()) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCommentOutAnim$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
                android.view.animation.TranslateAnimation translateAnimation = ad4.w.f3205c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCommentOutAnim$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
                contentView.startAnimation(translateAnimation);
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            android.widget.PopupWindow popupWindow2 = ad4.w.f3206d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$dismissCommentWindow$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$dismissCommentWindow$1");
        return f0Var;
    }
}
