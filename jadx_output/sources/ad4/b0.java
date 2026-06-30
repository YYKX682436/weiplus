package ad4;

/* loaded from: classes4.dex */
public final class b0 {
    public b0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.view.View containerView, android.widget.TextView nickNameTv, android.widget.TextView weCompanyNameTv, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("executeFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(nickNameTv, "nickNameTv");
        kotlin.jvm.internal.o.g(weCompanyNameTv, "weCompanyNameTv");
        int width = ((containerView.getWidth() - containerView.getPaddingStart()) - containerView.getPaddingEnd()) - i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("measureTextWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        int i18 = 0;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        nickNameTv.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = nickNameTv.getMeasuredWidth();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("measureTextWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("measureTextWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        weCompanyNameTv.measure(makeMeasureSpec2, makeMeasureSpec2);
        int measuredWidth2 = weCompanyNameTv.getMeasuredWidth();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("measureTextWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        if (measuredWidth + measuredWidth2 <= width) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFullDisplayMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
            android.view.ViewGroup.LayoutParams layoutParams = nickNameTv.getLayoutParams();
            layoutParams.width = -2;
            nickNameTv.setLayoutParams(layoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = weCompanyNameTv.getLayoutParams();
            layoutParams2.width = width - measuredWidth;
            weCompanyNameTv.setLayoutParams(layoutParams2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFullDisplayMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyFoldingRules", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
            int i19 = width / 2;
            if (measuredWidth > i19 && measuredWidth2 > i19) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBothFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                if (i19 <= 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBothFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateMinNickNameWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                    int measureText = (((int) nickNameTv.getPaint().measureText("…")) * 2) + nickNameTv.getPaddingLeft() + nickNameTv.getPaddingRight();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateMinNickNameWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                    int i27 = i19 * 2;
                    if (measureText > i19) {
                        i19 = i27;
                    } else {
                        i18 = i19;
                    }
                    android.view.ViewGroup.LayoutParams layoutParams3 = nickNameTv.getLayoutParams();
                    layoutParams3.width = i19;
                    nickNameTv.setLayoutParams(layoutParams3);
                    android.view.ViewGroup.LayoutParams layoutParams4 = weCompanyNameTv.getLayoutParams();
                    layoutParams4.width = i18;
                    weCompanyNameTv.setLayoutParams(layoutParams4);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBothFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                }
            } else if (measuredWidth > i19) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNickNameFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                android.view.ViewGroup.LayoutParams layoutParams5 = nickNameTv.getLayoutParams();
                layoutParams5.width = width - measuredWidth2;
                nickNameTv.setLayoutParams(layoutParams5);
                android.view.ViewGroup.LayoutParams layoutParams6 = weCompanyNameTv.getLayoutParams();
                layoutParams6.width = -2;
                weCompanyNameTv.setLayoutParams(layoutParams6);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNickNameFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
            } else if (measuredWidth2 > i19) {
                int i28 = width - measuredWidth;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWeCompanyNameFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                android.view.ViewGroup.LayoutParams layoutParams7 = nickNameTv.getLayoutParams();
                layoutParams7.width = -2;
                nickNameTv.setLayoutParams(layoutParams7);
                android.view.ViewGroup.LayoutParams layoutParams8 = weCompanyNameTv.getLayoutParams();
                layoutParams8.width = i28;
                weCompanyNameTv.setLayoutParams(layoutParams8);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWeCompanyNameFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyFoldingRules", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("executeFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
    }

    public final void b(android.widget.TextView textView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetToAutoWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        kotlin.jvm.internal.o.g(textView, "textView");
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = 0;
            textView.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetToAutoWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
    }
}
