package com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui;

/* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceActionMask */
/* loaded from: classes4.dex */
public class C13533xbf67dc9f extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f181702d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f181703e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.PorterDuffXfermode f181704f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f181705g;

    public C13533xbf67dc9f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f181705g = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f181702d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f181703e = new android.graphics.Paint(1);
        setWillNotDraw(false);
        this.f181704f = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        float width = (float) (getWidth() * 0.5d);
        float height = (float) (getHeight() * 0.4d);
        android.graphics.Rect rect = this.f181705g;
        rect.left = 0;
        rect.right = getWidth();
        rect.top = 0;
        rect.bottom = getHeight();
        android.graphics.Paint paint = this.f181702d;
        paint.setColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        canvas.drawARGB(255, 0, 0, 0);
        canvas.drawRect(rect, paint);
        android.graphics.Paint paint2 = this.f181703e;
        paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint2.setXfermode(this.f181704f);
        canvas.drawCircle(width, height, (float) (getWidth() * 0.35d), paint2);
        canvas.restore();
    }
}
