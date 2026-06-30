package com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5;

/* renamed from: com.tencent.cloud.huiyan.view.HuiYanReflectLayout */
/* loaded from: classes3.dex */
public class C2935x453a187d extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f127441d;

    /* renamed from: e, reason: collision with root package name */
    public long f127442e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Rect f127443f;

    public C2935x453a187d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f127441d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f127442e = 0L;
        this.f127443f = new android.graphics.Rect();
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        long j17 = this.f127442e;
        this.f127441d.setColor(android.graphics.Color.argb((int) ((j17 >> 24) & 255), (int) ((j17 >> 16) & 255), (int) ((j17 >> 8) & 255), (int) (j17 & 255)));
        this.f127443f.set(0, 0, getWidth(), getHeight());
        canvas.drawRect(this.f127443f, this.f127441d);
    }
}
