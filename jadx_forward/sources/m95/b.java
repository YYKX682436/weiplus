package m95;

/* loaded from: classes13.dex */
public abstract class b extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final int f406611a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f406612b = new android.graphics.Rect();

    /* renamed from: c, reason: collision with root package name */
    public boolean f406613c = false;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f406614d = new android.graphics.Paint();

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.ColorFilter f406615e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f406616f;

    /* renamed from: g, reason: collision with root package name */
    public final int f406617g;

    /* renamed from: h, reason: collision with root package name */
    public final int f406618h;

    public b(int i17, int i18, float f17, int i19) {
        this.f406611a = 0;
        this.f406617g = 0;
        this.f406618h = 0;
        this.f406617g = i17;
        this.f406618h = i18;
        setLevel(10000);
        this.f406611a = i19;
    }

    public void a(android.graphics.Canvas canvas) {
        if (n95.b.f417462d) {
            int height = this.f406612b.height() / 3;
            canvas.save();
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(-12303292);
            paint.setAlpha(127);
            float f17 = height;
            paint.setTextSize(f17);
            paint.setStrokeWidth(1.0f);
            canvas.translate(r0.width() - paint.measureText("SVG"), (r0.height() * 2) / 3);
            canvas.drawText("SVG", 0.0f, f17, paint);
            canvas.restore();
        }
    }

    public synchronized android.view.View b() {
        java.lang.ref.WeakReference weakReference = this.f406616f;
        if (weakReference == null) {
            return null;
        }
        return (android.view.View) weakReference.get();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f406618h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f406617g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.view.View b17 = b();
        if (b17 != null && b17.getAlpha() < 1.0f) {
            return -3;
        }
        android.graphics.Paint paint = this.f406614d;
        return (paint == null || paint.getAlpha() >= 255) ? 0 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.f406613c = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i17) {
        android.view.View b17 = m95.a.b(this);
        synchronized (this) {
            this.f406616f = new java.lang.ref.WeakReference(b17);
        }
        if (b17 != null) {
            android.graphics.ColorFilter colorFilter = this.f406615e;
            if (colorFilter != null) {
                setColorFilter(colorFilter);
            }
            m95.a.h(b17, this.f406614d);
        }
        return super.onLevelChange(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        android.graphics.Paint paint = this.f406614d;
        paint.setAlpha(i17);
        android.view.View b17 = b();
        if (b17 != null) {
            try {
                b17.setLayerPaint(paint);
            } catch (java.lang.NoSuchMethodError e17) {
                n95.d.c("MicroMsg.SVGDrawable", e17, "samsung", new java.lang.Object[0]);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.Paint paint = this.f406614d;
        paint.setColorFilter(colorFilter);
        android.view.View b17 = b();
        if (b17 == null) {
            if (b17 == null) {
                this.f406615e = colorFilter;
            }
        } else {
            try {
                b17.setLayerPaint(paint);
            } catch (java.lang.NoSuchMethodError e17) {
                n95.d.c("MicroMsg.SVGDrawable", e17, "samsung", new java.lang.Object[0]);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z17, boolean z18) {
        android.view.View b17 = m95.a.b(this);
        synchronized (this) {
            this.f406616f = new java.lang.ref.WeakReference(b17);
        }
        if (b17 != null) {
            android.graphics.ColorFilter colorFilter = this.f406615e;
            if (colorFilter != null) {
                setColorFilter(colorFilter);
            }
            m95.a.h(b17, this.f406614d);
        }
        return super.setVisible(z17, z18);
    }
}
