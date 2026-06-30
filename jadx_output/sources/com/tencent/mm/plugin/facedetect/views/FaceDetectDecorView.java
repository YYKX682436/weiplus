package com.tencent.mm.plugin.facedetect.views;

/* loaded from: classes5.dex */
public class FaceDetectDecorView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public boolean f100113d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f100114e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f100115f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f100116g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f100117h;

    public FaceDetectDecorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectDecorView", "mTargetCoverMode: %b, mIsInCoverMode: %b, %s", java.lang.Boolean.valueOf(this.f100114e), java.lang.Boolean.valueOf(this.f100113d), this.f100116g);
        boolean z17 = this.f100114e;
        if (z17 != this.f100113d || this.f100115f) {
            if (z17) {
                canvas.drawColor(getResources().getColor(com.tencent.mm.R.color.f478940lg));
                canvas.drawRect(this.f100116g, this.f100117h);
            } else {
                canvas.drawColor(getResources().getColor(com.tencent.mm.R.color.a9e));
            }
        }
        this.f100113d = this.f100114e;
    }

    public FaceDetectDecorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f100113d = false;
        this.f100114e = false;
        this.f100115f = false;
        this.f100116g = null;
        this.f100117h = null;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f100117h = paint;
        paint.setColor(getResources().getColor(com.tencent.mm.R.color.f478712f3));
        this.f100117h.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        setLayerType(1, null);
    }
}
