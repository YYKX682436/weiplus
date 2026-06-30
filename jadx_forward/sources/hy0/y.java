package hy0;

/* loaded from: classes5.dex */
public final class y implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public yz5.a f367550a;

    /* renamed from: b, reason: collision with root package name */
    public final float f367551b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f367552c;

    public y(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        float dimensionPixelSize = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562099al5);
        this.f367551b = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562098al4);
        int color = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ac8, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(dimensionPixelSize);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f367552c = paint;
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        yz5.a aVar = this.f367550a;
        if ((aVar == null || ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue()) ? false : true) {
            return;
        }
        bx0.h hVar = context.f367580c;
        bx0.f fVar = hVar.f117810d;
        e3.d dVar = fVar.f117799r;
        float f17 = (float) (dVar.f328577a + hVar.f117812f);
        int i17 = dVar.f328578b;
        int i18 = fVar.f117801t + i17;
        float f18 = this.f367551b;
        canvas.drawLine(f17, i17 - f18, f17, i18 + f18, this.f367552c);
    }
}
