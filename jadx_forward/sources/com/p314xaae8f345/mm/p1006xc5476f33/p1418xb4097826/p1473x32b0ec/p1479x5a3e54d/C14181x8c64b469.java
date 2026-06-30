package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1479x5a3e54d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/cheer/CheerCountDownView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "a", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "i", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.cheer.CheerCountDownView */
/* loaded from: classes3.dex */
public final class C14181x8c64b469 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f193053d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f193054e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f193055f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f193056g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f193057h;

    /* renamed from: i, reason: collision with root package name */
    public final float f193058i;

    /* renamed from: m, reason: collision with root package name */
    public float f193059m;

    /* renamed from: n, reason: collision with root package name */
    public float f193060n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14181x8c64b469(android.content.Context context, android.util.AttributeSet a17) {
        super(context, a17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        this.f193055f = new int[]{android.graphics.Color.parseColor("#1391BC"), android.graphics.Color.parseColor("#B4CB47")};
        this.f193056g = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f193058i = -90.0f;
        this.f193059m = 360.0f;
        this.f193060n = i65.a.b(getContext(), 4);
        a();
    }

    public final void a() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f193060n);
        paint.setAntiAlias(true);
        this.f193054e = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(this.f193060n);
        paint2.setAntiAlias(true);
        paint2.setColor(android.graphics.Color.parseColor("#80FFFFFF"));
        this.f193053d = paint2;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f17 = 2;
        float f18 = width - (this.f193060n / f17);
        android.graphics.Paint paint = this.f193053d;
        if (paint == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("srcPaint");
            throw null;
        }
        canvas.drawCircle(width, height, f18, paint);
        float f19 = this.f193060n;
        android.graphics.RectF rectF = new android.graphics.RectF(f19 / f17, f19 / f17, getWidth() - (this.f193060n / f17), getHeight() - (this.f193060n / f17));
        float f27 = this.f193058i;
        float f28 = this.f193059m;
        android.graphics.Paint paint2 = this.f193054e;
        if (paint2 != null) {
            canvas.drawArc(rectF, f27, f28, false, paint2);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shaderPaint");
            throw null;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        android.graphics.Paint paint = this.f193054e;
        if (paint == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shaderPaint");
            throw null;
        }
        android.graphics.SweepGradient sweepGradient = new android.graphics.SweepGradient(width, height, this.f193055f, (float[]) null);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(-90.0f, width, height);
        sweepGradient.setLocalMatrix(matrix);
        paint.setShader(sweepGradient);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14181x8c64b469(android.content.Context context, android.util.AttributeSet a17, int i17) {
        super(context, a17, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        this.f193055f = new int[]{android.graphics.Color.parseColor("#1391BC"), android.graphics.Color.parseColor("#B4CB47")};
        this.f193056g = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f193058i = -90.0f;
        this.f193059m = 360.0f;
        this.f193060n = i65.a.b(getContext(), 4);
        a();
    }
}
