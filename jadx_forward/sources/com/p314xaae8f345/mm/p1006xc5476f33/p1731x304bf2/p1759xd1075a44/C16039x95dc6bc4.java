package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44;

/* renamed from: com.tencent.mm.plugin.game.widget.TextViewWithBorder */
/* loaded from: classes3.dex */
public class C16039x95dc6bc4 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {
    public C16039x95dc6bc4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560725sg));
        canvas.drawRoundRect(new android.graphics.RectF(2.0f, 2.0f, getWidth() - 2, getHeight() - 2), 5.0f, 5.0f, paint);
        super.onDraw(canvas);
    }
}
