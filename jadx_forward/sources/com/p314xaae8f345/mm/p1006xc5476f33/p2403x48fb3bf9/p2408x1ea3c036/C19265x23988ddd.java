package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* renamed from: com.tencent.mm.plugin.webview.luggage.RedDotView */
/* loaded from: classes3.dex */
public class C19265x23988ddd extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f263672d;

    public C19265x23988ddd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f263672d = new android.graphics.Paint();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Paint paint = this.f263672d;
        paint.setColor(-65536);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2, paint);
    }
}
