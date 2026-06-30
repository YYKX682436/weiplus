package yw0;

/* loaded from: classes5.dex */
public final class b extends yw0.s {

    /* renamed from: b, reason: collision with root package name */
    public final int f548057b;

    /* renamed from: c, reason: collision with root package name */
    public final int f548058c;

    /* renamed from: d, reason: collision with root package name */
    public float f548059d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f548060e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f548061f;

    /* renamed from: g, reason: collision with root package name */
    public float f548062g;

    /* renamed from: h, reason: collision with root package name */
    public float f548063h;

    /* renamed from: i, reason: collision with root package name */
    public yw0.a f548064i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Paint f548065j;

    /* renamed from: k, reason: collision with root package name */
    public final android.graphics.Paint f548066k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Paint f548067l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, yw0.r action) {
        super(action);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f548057b = j65.q.a(context).getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        this.f548058c = j65.q.a(context).getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        int dimensionPixelSize = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
        int color = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560962ad5, null);
        this.f548059d = 0.5625f;
        this.f548060e = new android.graphics.RectF();
        this.f548061f = new android.graphics.RectF();
        this.f548064i = yw0.a.f548055e;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(color);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f548065j = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.afm, null));
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f548066k = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setColor(j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ac8, null));
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        paint3.setStrokeWidth(dimensionPixelSize);
        this.f548067l = paint3;
    }

    @Override // yw0.s
    public void a() {
    }

    @Override // yw0.s
    public void b(android.graphics.Canvas canvas, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (this.f548064i == yw0.a.f548055e) {
            return;
        }
        android.graphics.RectF rectF = this.f548061f;
        float f17 = rectF.left;
        float f18 = this.f548063h + 0.0f;
        android.graphics.Paint paint = this.f548065j;
        canvas.drawRect(0.0f, 0.0f, f17, f18, paint);
        canvas.drawRect(rectF.left, 0.0f, rectF.right, rectF.top, paint);
        canvas.drawRect(rectF.left, rectF.bottom, rectF.right, this.f548063h + 0.0f, paint);
        canvas.drawRect(rectF.right, 0.0f, this.f548062g + 0.0f, this.f548063h + 0.0f, paint);
        float f19 = this.f548062g;
        android.graphics.RectF rectF2 = this.f548060e;
        float f27 = rectF2.top;
        android.graphics.Paint paint2 = this.f548066k;
        canvas.drawRect(0.0f, 0.0f, f19, f27, paint2);
        canvas.drawRect(0.0f, rectF2.top, rectF2.left, rectF2.bottom, paint2);
        canvas.drawRect(0.0f, rectF2.bottom, this.f548062g, this.f548063h, paint2);
        canvas.drawRect(rectF2.right, rectF2.top, this.f548062g, rectF2.bottom, paint2);
        canvas.drawRect(rectF2, this.f548067l);
    }

    @Override // yw0.s
    public void c(boolean z17, int i17, int i18, int i19, int i27) {
        this.f548062g = i19 - i17;
        this.f548063h = i27 - i18;
    }
}
