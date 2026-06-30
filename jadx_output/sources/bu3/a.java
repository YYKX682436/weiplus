package bu3;

/* loaded from: classes10.dex */
public final class a extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public boolean f24579d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f24580e;

    /* renamed from: f, reason: collision with root package name */
    public int f24581f;

    /* renamed from: g, reason: collision with root package name */
    public final float f24582g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24583h;

    /* renamed from: i, reason: collision with root package name */
    public float f24584i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f24585m;

    /* renamed from: n, reason: collision with root package name */
    public int f24586n;

    /* renamed from: o, reason: collision with root package name */
    public int f24587o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, android.util.AttributeSet attributeSet, boolean z17) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f24579d = z17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f24580e = paint;
        this.f24581f = i65.a.b(context, 7);
        this.f24582g = i65.a.b(context, 2);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    public final boolean getSlimWidth() {
        return this.f24579d;
    }

    public final int getType() {
        return this.f24587o;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        boolean z17 = false;
        canvas.drawColor(0);
        android.graphics.Paint paint = this.f24580e;
        paint.setColor(-1);
        int width = getWidth() - (((int) this.f24584i) * 2);
        if (!this.f24583h) {
            width -= ((int) this.f24582g) * 2;
        }
        canvas.drawCircle(getWidth() / 2.0f, getWidth() / 2.0f, width / 2.0f, paint);
        android.graphics.Bitmap bitmap = this.f24585m;
        if (bitmap != null) {
            if (bitmap != null && !bitmap.isRecycled()) {
                z17 = true;
            }
            if (z17) {
                kotlin.jvm.internal.o.d(this.f24585m);
                float width2 = (this.f24581f * 2.0f) / r2.getWidth();
                this.f24585m = com.tencent.mm.sdk.platformtools.x.z0(this.f24585m, 0.0f, width2, width2);
                int width3 = getWidth();
                kotlin.jvm.internal.o.d(this.f24585m);
                float width4 = (width3 - r2.getWidth()) / 2;
                android.graphics.Bitmap bitmap2 = this.f24585m;
                kotlin.jvm.internal.o.d(bitmap2);
                canvas.drawBitmap(bitmap2, width4, width4, paint);
                super.onDraw(canvas);
            }
        }
        int i17 = this.f24586n;
        if (i17 != 0) {
            paint.setColor(i17);
            if (this.f24579d) {
                this.f24581f = (getWidth() - i65.a.b(getContext(), 8)) / 2;
            }
            canvas.drawCircle(getWidth() / 2.0f, getWidth() / 2.0f, this.f24581f, paint);
        }
        super.onDraw(canvas);
    }

    public final void setBgPadding(int i17) {
        this.f24584i = i65.a.b(getContext(), i17);
    }

    public final void setBitmap(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        this.f24585m = bitmap;
    }

    public final void setDrawColor(int i17) {
        this.f24586n = i17;
    }

    public final void setHasSelected(boolean z17) {
        if (this.f24583h != z17) {
            this.f24583h = z17;
            invalidate();
        }
    }

    public final void setSlimWidth(boolean z17) {
        this.f24579d = z17;
    }

    public final void setType(int i17) {
        this.f24587o = i17;
    }
}
