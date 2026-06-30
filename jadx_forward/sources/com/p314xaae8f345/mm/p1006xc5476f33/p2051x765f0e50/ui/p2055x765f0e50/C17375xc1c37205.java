package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.NetStatRuler */
/* loaded from: classes10.dex */
class C17375xc1c37205 extends android.view.View {
    public C17375xc1c37205(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setTextSize(getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561469ji));
        android.graphics.Rect rect = new android.graphics.Rect();
        getDrawingRect(rect);
        float height = rect.height();
        float paddingLeft = rect.left + getPaddingLeft();
        int i17 = rect.top;
        textPaint.setColor(-7829368);
        canvas.drawText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17376x400fd295.f241686f * 2) / 3), paddingLeft, i17 + (height / 3.0f), textPaint);
        canvas.drawText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17376x400fd295.f241686f / 3), paddingLeft, i17 + ((2.0f * height) / 3.0f), textPaint);
        canvas.drawText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(0L), paddingLeft, i17 + height, textPaint);
    }

    public C17375xc1c37205(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
