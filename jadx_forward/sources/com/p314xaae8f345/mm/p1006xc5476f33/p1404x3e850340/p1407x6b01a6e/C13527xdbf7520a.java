package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectDecorView */
/* loaded from: classes5.dex */
public class C13527xdbf7520a extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public boolean f181646d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f181647e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f181648f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f181649g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f181650h;

    public C13527xdbf7520a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectDecorView", "mTargetCoverMode: %b, mIsInCoverMode: %b, %s", java.lang.Boolean.valueOf(this.f181647e), java.lang.Boolean.valueOf(this.f181646d), this.f181649g);
        boolean z17 = this.f181647e;
        if (z17 != this.f181646d || this.f181648f) {
            if (z17) {
                canvas.drawColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560473lg));
                canvas.drawRect(this.f181649g, this.f181650h);
            } else {
                canvas.drawColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            }
        }
        this.f181646d = this.f181647e;
    }

    public C13527xdbf7520a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f181646d = false;
        this.f181647e = false;
        this.f181648f = false;
        this.f181649g = null;
        this.f181650h = null;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f181650h = paint;
        paint.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        this.f181650h.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        setLayerType(1, null);
    }
}
