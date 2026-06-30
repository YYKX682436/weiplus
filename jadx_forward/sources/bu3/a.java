package bu3;

/* loaded from: classes10.dex */
public final class a extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public boolean f106112d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f106113e;

    /* renamed from: f, reason: collision with root package name */
    public int f106114f;

    /* renamed from: g, reason: collision with root package name */
    public final float f106115g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f106116h;

    /* renamed from: i, reason: collision with root package name */
    public float f106117i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f106118m;

    /* renamed from: n, reason: collision with root package name */
    public int f106119n;

    /* renamed from: o, reason: collision with root package name */
    public int f106120o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, android.util.AttributeSet attributeSet, boolean z17) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f106112d = z17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f106113e = paint;
        this.f106114f = i65.a.b(context, 7);
        this.f106115g = i65.a.b(context, 2);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    /* renamed from: getSlimWidth */
    public final boolean m11314xde9403d3() {
        return this.f106112d;
    }

    /* renamed from: getType */
    public final int m11315xfb85f7b0() {
        return this.f106120o;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        boolean z17 = false;
        canvas.drawColor(0);
        android.graphics.Paint paint = this.f106113e;
        paint.setColor(-1);
        int width = getWidth() - (((int) this.f106117i) * 2);
        if (!this.f106116h) {
            width -= ((int) this.f106115g) * 2;
        }
        canvas.drawCircle(getWidth() / 2.0f, getWidth() / 2.0f, width / 2.0f, paint);
        android.graphics.Bitmap bitmap = this.f106118m;
        if (bitmap != null) {
            if (bitmap != null && !bitmap.isRecycled()) {
                z17 = true;
            }
            if (z17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f106118m);
                float width2 = (this.f106114f * 2.0f) / r2.getWidth();
                this.f106118m = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.z0(this.f106118m, 0.0f, width2, width2);
                int width3 = getWidth();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f106118m);
                float width4 = (width3 - r2.getWidth()) / 2;
                android.graphics.Bitmap bitmap2 = this.f106118m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap2);
                canvas.drawBitmap(bitmap2, width4, width4, paint);
                super.onDraw(canvas);
            }
        }
        int i17 = this.f106119n;
        if (i17 != 0) {
            paint.setColor(i17);
            if (this.f106112d) {
                this.f106114f = (getWidth() - i65.a.b(getContext(), 8)) / 2;
            }
            canvas.drawCircle(getWidth() / 2.0f, getWidth() / 2.0f, this.f106114f, paint);
        }
        super.onDraw(canvas);
    }

    /* renamed from: setBgPadding */
    public final void m11316x1cb591ca(int i17) {
        this.f106117i = i65.a.b(getContext(), i17);
    }

    /* renamed from: setBitmap */
    public final void m11317x5854831(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        this.f106118m = bitmap;
    }

    /* renamed from: setDrawColor */
    public final void m11318x62f3ee3d(int i17) {
        this.f106119n = i17;
    }

    /* renamed from: setHasSelected */
    public final void m11319x62966993(boolean z17) {
        if (this.f106116h != z17) {
            this.f106116h = z17;
            invalidate();
        }
    }

    /* renamed from: setSlimWidth */
    public final void m11320x3ae7c447(boolean z17) {
        this.f106112d = z17;
    }

    /* renamed from: setType */
    public final void m11321x7650bebc(int i17) {
        this.f106120o = i17;
    }
}
