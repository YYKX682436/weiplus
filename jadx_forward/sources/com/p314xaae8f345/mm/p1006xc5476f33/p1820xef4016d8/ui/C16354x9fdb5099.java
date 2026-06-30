package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckMoneyEnvelopeTempTagImageView */
/* loaded from: classes4.dex */
public class C16354x9fdb5099 extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f227477d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f227478e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f227479f;

    public C16354x9fdb5099(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f227477d = paint;
        this.f227478e = new android.graphics.Path();
        this.f227479f = "";
        paint.setAntiAlias(true);
        a(context, attributeSet, -1);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.j.f270112b, i17, 0);
        this.f227479f = obtainStyledAttributes.getString(0);
        int color = obtainStyledAttributes.getColor(1, 0);
        android.graphics.Paint paint = this.f227477d;
        paint.setColor(color);
        paint.setTextSize(obtainStyledAttributes.getDimensionPixelSize(2, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Path path = this.f227478e;
        path.moveTo(0.0f, 0.0f);
        float b17 = i65.a.b(getContext(), 98);
        path.lineTo(b17, b17);
        float b18 = i65.a.b(getContext(), 139);
        canvas.drawTextOnPath(this.f227479f, path, (int) ((b18 - r5.measureText(this.f227479f)) / 2.0f), -30.0f, this.f227477d);
    }

    public C16354x9fdb5099(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f227477d = paint;
        this.f227478e = new android.graphics.Path();
        this.f227479f = "";
        paint.setAntiAlias(true);
        a(context, attributeSet, i17);
    }
}
