package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallFeedbackScrollView */
/* loaded from: classes3.dex */
public class C16137xb4d5357c extends android.widget.ScrollView {
    public C16137xb4d5357c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            android.view.Display defaultDisplay = ((android.app.Activity) getContext()).getWindowManager().getDefaultDisplay();
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels / 2, Integer.MIN_VALUE);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IPCallFeedbackScrollView", e17, "", new java.lang.Object[0]);
        }
        super.onMeasure(i17, i18);
    }

    public C16137xb4d5357c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
