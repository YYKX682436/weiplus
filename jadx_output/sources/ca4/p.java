package ca4;

/* loaded from: classes4.dex */
public abstract class p {
    public static final void a(android.content.Context context, android.view.View view, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkResetLikeViewPadding", "com.tencent.mm.plugin.sns.data.SnsAdCommentUtil");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkResetLikeViewPadding", "com.tencent.mm.plugin.sns.data.SnsAdCommentUtil");
        } else {
            if (view == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkResetLikeViewPadding", "com.tencent.mm.plugin.sns.data.SnsAdCommentUtil");
                return;
            }
            int b17 = (z17 && yb4.a.f460697a.a()) ? i65.a.b(context, 6) : i65.a.b(context, 4);
            view.setPadding(view.getPaddingLeft(), b17, view.getPaddingRight(), b17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkResetLikeViewPadding", "com.tencent.mm.plugin.sns.data.SnsAdCommentUtil");
        }
    }
}
