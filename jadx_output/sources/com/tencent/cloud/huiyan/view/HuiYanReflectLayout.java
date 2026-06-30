package com.tencent.cloud.huiyan.view;

/* loaded from: classes3.dex */
public class HuiYanReflectLayout extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f45908d;

    /* renamed from: e, reason: collision with root package name */
    public long f45909e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Rect f45910f;

    public HuiYanReflectLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f45908d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f45909e = 0L;
        this.f45910f = new android.graphics.Rect();
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        long j17 = this.f45909e;
        this.f45908d.setColor(android.graphics.Color.argb((int) ((j17 >> 24) & 255), (int) ((j17 >> 16) & 255), (int) ((j17 >> 8) & 255), (int) (j17 & 255)));
        this.f45910f.set(0, 0, getWidth(), getHeight());
        canvas.drawRect(this.f45910f, this.f45908d);
    }
}
