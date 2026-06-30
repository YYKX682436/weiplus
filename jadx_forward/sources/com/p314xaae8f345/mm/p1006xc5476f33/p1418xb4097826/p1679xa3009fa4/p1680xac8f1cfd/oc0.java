package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes4.dex */
public final class oc0 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f216996d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f216997e;

    /* renamed from: f, reason: collision with root package name */
    public float f216998f;

    /* renamed from: g, reason: collision with root package name */
    public final float f216999g;

    /* renamed from: h, reason: collision with root package name */
    public final float f217000h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc0(android.content.Context context, java.lang.Float f17, java.lang.Float f18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(context);
        f17 = (i17 & 2) != 0 ? null : f17;
        f18 = (i17 & 4) != 0 ? null : f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f216996d = new android.graphics.Paint(1);
        this.f216997e = new android.graphics.Path();
        this.f216999g = f17 != null ? f17.floatValue() : 3.0f;
        this.f217000h = f18 != null ? f18.floatValue() : 4.0f;
        setWillNotDraw(false);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float width;
        int height;
        float f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Paint paint = this.f216996d;
        paint.setColor(-16777216);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (this.f216998f >= 0.5f) {
            boolean z17 = getWidth() > getHeight();
            float f18 = this.f216999g;
            float f19 = this.f217000h;
            if (!z17) {
                float width2 = getWidth();
                float width3 = ((f19 * getWidth()) / f18) * (this.f216998f - 0.5f);
                float f27 = 2;
                float height2 = (width3 * f27) + (getHeight() * (1 - ((this.f216998f - 0.5f) * f27)));
                width = width2;
                f17 = height2;
                float f28 = 2;
                float f29 = width / f28;
                float f37 = f17 / f28;
                android.graphics.RectF rectF = new android.graphics.RectF((getWidth() / 2.0f) - f29, (getHeight() / 2.0f) - f37, (getWidth() / 2.0f) + f29, (getHeight() / 2.0f) + f37);
                paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
                android.graphics.Path path = this.f216997e;
                path.reset();
                path.addRoundRect(rectF, 40.0f, 40.0f, android.graphics.Path.Direction.CW);
                canvas.drawPath(path, paint);
                paint.setXfermode(null);
            }
            float f38 = 2;
            width = (((f19 * getHeight()) / f18) * (this.f216998f - 0.5f) * f38) + (getWidth() * (1 - ((this.f216998f - 0.5f) * f38)));
            height = getHeight();
        } else {
            width = getWidth();
            height = getHeight();
        }
        f17 = height;
        float f282 = 2;
        float f292 = width / f282;
        float f372 = f17 / f282;
        android.graphics.RectF rectF2 = new android.graphics.RectF((getWidth() / 2.0f) - f292, (getHeight() / 2.0f) - f372, (getWidth() / 2.0f) + f292, (getHeight() / 2.0f) + f372);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        android.graphics.Path path2 = this.f216997e;
        path2.reset();
        path2.addRoundRect(rectF2, 40.0f, 40.0f, android.graphics.Path.Direction.CW);
        canvas.drawPath(path2, paint);
        paint.setXfermode(null);
    }
}
