package ad4;

/* loaded from: classes4.dex */
public final class b0 {
    public b0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.view.View containerView, android.widget.TextView nickNameTv, android.widget.TextView weCompanyNameTv, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("executeFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickNameTv, "nickNameTv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weCompanyNameTv, "weCompanyNameTv");
        int width = ((containerView.getWidth() - containerView.getPaddingStart()) - containerView.getPaddingEnd()) - i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("measureTextWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        int i18 = 0;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        nickNameTv.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = nickNameTv.getMeasuredWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("measureTextWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("measureTextWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        weCompanyNameTv.measure(makeMeasureSpec2, makeMeasureSpec2);
        int measuredWidth2 = weCompanyNameTv.getMeasuredWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("measureTextWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        if (measuredWidth + measuredWidth2 <= width) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFullDisplayMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
            android.view.ViewGroup.LayoutParams layoutParams = nickNameTv.getLayoutParams();
            layoutParams.width = -2;
            nickNameTv.setLayoutParams(layoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = weCompanyNameTv.getLayoutParams();
            layoutParams2.width = width - measuredWidth;
            weCompanyNameTv.setLayoutParams(layoutParams2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFullDisplayMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("applyFoldingRules", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
            int i19 = width / 2;
            if (measuredWidth > i19 && measuredWidth2 > i19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBothFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                if (i19 <= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBothFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateMinNickNameWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                    int measureText = (((int) nickNameTv.getPaint().measureText("…")) * 2) + nickNameTv.getPaddingLeft() + nickNameTv.getPaddingRight();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateMinNickNameWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
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
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBothFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                }
            } else if (measuredWidth > i19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNickNameFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                android.view.ViewGroup.LayoutParams layoutParams5 = nickNameTv.getLayoutParams();
                layoutParams5.width = width - measuredWidth2;
                nickNameTv.setLayoutParams(layoutParams5);
                android.view.ViewGroup.LayoutParams layoutParams6 = weCompanyNameTv.getLayoutParams();
                layoutParams6.width = -2;
                weCompanyNameTv.setLayoutParams(layoutParams6);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNickNameFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
            } else if (measuredWidth2 > i19) {
                int i28 = width - measuredWidth;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWeCompanyNameFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                android.view.ViewGroup.LayoutParams layoutParams7 = nickNameTv.getLayoutParams();
                layoutParams7.width = -2;
                nickNameTv.setLayoutParams(layoutParams7);
                android.view.ViewGroup.LayoutParams layoutParams8 = weCompanyNameTv.getLayoutParams();
                layoutParams8.width = i28;
                weCompanyNameTv.setLayoutParams(layoutParams8);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWeCompanyNameFoldedMode", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyFoldingRules", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("executeFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
    }

    public final void b(android.widget.TextView textView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetToAutoWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = 0;
            textView.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetToAutoWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
    }
}
