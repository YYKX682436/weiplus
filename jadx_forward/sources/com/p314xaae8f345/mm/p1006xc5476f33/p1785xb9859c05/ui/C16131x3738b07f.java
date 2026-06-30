package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallCounponCardLayout */
/* loaded from: classes4.dex */
public class C16131x3738b07f extends android.widget.RelativeLayout {
    public C16131x3738b07f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(android.view.View.getDefaultSize(0, i17), android.view.View.getDefaultSize(0, i18));
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() * 3) / 5, 1073741824));
    }

    public C16131x3738b07f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
