package jj2;

/* loaded from: classes10.dex */
public abstract class a extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f381503d;

    /* renamed from: e, reason: collision with root package name */
    public float f381504e;

    /* renamed from: f, reason: collision with root package name */
    public float f381505f;

    /* renamed from: g, reason: collision with root package name */
    public float f381506g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, jj2.d data) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f381503d = paint;
        b(data);
        paint.setAntiAlias(true);
        setVisibility(8);
    }

    public abstract void a(android.graphics.Canvas canvas);

    public final void b(jj2.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int i17 = data.f381508b;
        android.graphics.Paint paint = this.f381503d;
        paint.setColor(i17);
        paint.setStyle(data.f381511e);
        paint.setStrokeWidth(data.f381507a);
        this.f381506g = data.f381509c;
        paint.setAlpha(data.f381510d);
        if (this.f381504e == 0.0f) {
            return;
        }
        if (this.f381505f == 0.0f) {
            return;
        }
        invalidate();
    }

    /* renamed from: getCircleRadius */
    public final float m141032xcee5cbf8() {
        return this.f381506g;
    }

    /* renamed from: getPaint */
    public final android.graphics.Paint m141033x74f59ea8() {
        return this.f381503d;
    }

    /* renamed from: getViewHeight */
    public final float m141034x6ba62022() {
        return this.f381505f;
    }

    /* renamed from: getViewWidth */
    public final float m141035xa135536b() {
        return this.f381504e;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        a(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        float f17 = size;
        this.f381504e = f17;
        float f18 = size2;
        this.f381505f = f18;
        setMeasuredDimension((int) f17, (int) f18);
    }

    /* renamed from: setCircleRadius */
    public final void m141036x52ec704(float f17) {
        this.f381506g = f17;
    }

    /* renamed from: setViewHeight */
    public final void m141037x99ca6e2e(float f17) {
        this.f381505f = f17;
    }

    /* renamed from: setViewWidth */
    public final void m141038xfd8913df(float f17) {
        this.f381504e = f17;
    }
}
