package com.p314xaae8f345.p2926x359365.ui;

/* renamed from: com.tencent.rtmp.ui.FocusIndicatorView */
/* loaded from: classes3.dex */
public class C25491x98f9037c extends android.view.View {

    /* renamed from: a, reason: collision with root package name */
    final android.view.animation.ScaleAnimation f296810a;

    /* renamed from: b, reason: collision with root package name */
    private final android.graphics.Paint f296811b;

    /* renamed from: c, reason: collision with root package name */
    private final int f296812c;

    /* renamed from: d, reason: collision with root package name */
    private final android.graphics.Rect f296813d;

    public C25491x98f9037c(android.content.Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17 = this.f296812c / 2;
        android.graphics.Rect rect = this.f296813d;
        rect.left = i17;
        rect.top = i17;
        rect.right = getWidth() - i17;
        this.f296813d.bottom = getHeight() - i17;
        canvas.drawRect(this.f296813d, this.f296811b);
    }

    public C25491x98f9037c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C25491x98f9037c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f296813d = new android.graphics.Rect();
        int i18 = (int) ((getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
        this.f296812c = i18;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f296811b = paint;
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(i18);
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.3f, 1.0f, 1.3f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f296810a = scaleAnimation;
        scaleAnimation.setDuration(200L);
    }
}
