package hy0;

/* loaded from: classes5.dex */
public final class a3 implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f367306a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f367307b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f367308c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f367309d;

    /* renamed from: e, reason: collision with root package name */
    public final float f367310e;

    /* renamed from: f, reason: collision with root package name */
    public final float f367311f;

    /* renamed from: g, reason: collision with root package name */
    public final float f367312g;

    /* renamed from: h, reason: collision with root package name */
    public final float f367313h;

    /* renamed from: i, reason: collision with root package name */
    public final float f367314i;

    /* renamed from: j, reason: collision with root package name */
    public final float f367315j;

    /* renamed from: k, reason: collision with root package name */
    public final int f367316k;

    /* renamed from: l, reason: collision with root package name */
    public final int f367317l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.drawable.VectorDrawable f367318m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f367319n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f367320o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f367321p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f367322q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f367323r;

    public a3(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f367306a = z17;
        this.f367307b = new android.graphics.RectF();
        this.f367308c = new android.graphics.RectF();
        this.f367309d = new android.graphics.RectF();
        this.f367310e = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ajn);
        this.f367311f = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ajl);
        this.f367312g = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ajm);
        this.f367313h = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ajk);
        float dimensionPixelSize = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.al_);
        this.f367314i = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.al9);
        float dimensionPixelSize2 = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ak_);
        float dimensionPixelSize3 = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ak9);
        float dimensionPixelSize4 = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ak8);
        this.f367315j = dimensionPixelSize4;
        android.graphics.DashPathEffect dashPathEffect = new android.graphics.DashPathEffect(new float[]{dimensionPixelSize2, dimensionPixelSize3}, 0.0f);
        int color = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ac8, null);
        int color2 = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560934a22, null);
        this.f367316k = color2;
        this.f367317l = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560931pp, null);
        int color3 = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.acs, null);
        int color4 = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.acp, null);
        int color5 = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560931pp, null);
        android.graphics.drawable.Drawable drawable = j65.q.a(context).getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f78098xb99e7b77, null);
        this.f367318m = drawable instanceof android.graphics.drawable.VectorDrawable ? (android.graphics.drawable.VectorDrawable) drawable : null;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeWidth(dimensionPixelSize);
        paint.setColor(color3);
        this.f367319n = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setColor(color);
        paint2.setShadowLayer(6.0f, 0.0f, 0.0f, color4);
        this.f367320o = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(color2);
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        paint3.setStrokeWidth(dimensionPixelSize4);
        paint3.setPathEffect(dashPathEffect);
        this.f367321p = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setAntiAlias(true);
        paint4.setStyle(android.graphics.Paint.Style.FILL);
        paint4.setColor(color5);
        paint4.setShadowLayer(6.0f, 0.0f, 0.0f, color4);
        this.f367322q = paint4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        if (r1 == true) goto L36;
     */
    @Override // iy0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.graphics.Canvas r18, hy0.z2 r19) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy0.a3.a(android.graphics.Canvas, hy0.z2):void");
    }

    public final void b(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        android.graphics.RectF rectF = this.f367308c;
        float f17 = this.f367313h;
        canvas.drawRoundRect(rectF, f17, f17, paint);
        float f18 = this.f367310e;
        float f19 = this.f367312g;
        float f27 = 2;
        float f28 = (f18 - f19) / f27;
        float f29 = (this.f367311f - f19) / f27;
        android.graphics.drawable.VectorDrawable vectorDrawable = this.f367318m;
        if (vectorDrawable != null) {
            vectorDrawable.setBounds((int) (rectF.left + f28), (int) (rectF.top + f29), (int) (rectF.right - f28), (int) (rectF.bottom - f29));
        }
        if (vectorDrawable != null) {
            vectorDrawable.draw(canvas);
        }
    }

    public final void d(android.graphics.Canvas canvas, int i17) {
        android.graphics.RectF rectF = this.f367309d;
        float f17 = rectF.left;
        android.graphics.RectF rectF2 = this.f367308c;
        if (f17 >= rectF2.left || rectF.right <= rectF2.right) {
            return;
        }
        float centerY = rectF.centerY();
        android.graphics.Paint paint = this.f367321p;
        paint.setColor(i17);
        float f18 = rectF.left;
        float f19 = rectF2.left;
        float f27 = 2;
        float f28 = this.f367315j;
        canvas.drawLine(f18, centerY, f19 - (f28 / f27), centerY, paint);
        canvas.drawLine(rectF.right, centerY, rectF2.right + (f28 / f27), centerY, paint);
    }
}
