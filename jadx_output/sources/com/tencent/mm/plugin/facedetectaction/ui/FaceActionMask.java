package com.tencent.mm.plugin.facedetectaction.ui;

/* loaded from: classes4.dex */
public class FaceActionMask extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f100169d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f100170e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.PorterDuffXfermode f100171f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f100172g;

    public FaceActionMask(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f100172g = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f100169d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f100170e = new android.graphics.Paint(1);
        setWillNotDraw(false);
        this.f100171f = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.save();
        float width = (float) (getWidth() * 0.5d);
        float height = (float) (getHeight() * 0.4d);
        android.graphics.Rect rect = this.f100172g;
        rect.left = 0;
        rect.right = getWidth();
        rect.top = 0;
        rect.bottom = getHeight();
        android.graphics.Paint paint = this.f100169d;
        paint.setColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        canvas.drawARGB(255, 0, 0, 0);
        canvas.drawRect(rect, paint);
        android.graphics.Paint paint2 = this.f100170e;
        paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint2.setXfermode(this.f100171f);
        canvas.drawCircle(width, height, (float) (getWidth() * 0.35d), paint2);
        canvas.restore();
    }
}
