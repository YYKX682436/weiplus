package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* renamed from: com.tencent.mm.plugin.scanner.ui.StrokedImageView */
/* loaded from: classes3.dex */
public class C17317x7e90d6f4 extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public int f241000d;

    public C17317x7e90d6f4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f241000d = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a3i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Rect clipBounds = canvas.getClipBounds();
        clipBounds.left++;
        clipBounds.top++;
        clipBounds.bottom--;
        clipBounds.right--;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(this.f241000d);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.5f);
        canvas.drawRect(clipBounds, paint);
    }

    /* renamed from: setStrokeColor */
    public void m68734xe1d3a649(int i17) {
        this.f241000d = i17;
    }
}
