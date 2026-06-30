package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes9.dex */
public class AutoBottomScrollView extends android.widget.ScrollView {
    public AutoBottomScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        postDelayed(new p61.a(this), 100L);
    }

    public AutoBottomScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
