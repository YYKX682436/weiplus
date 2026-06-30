package w;

/* loaded from: classes13.dex */
public class e extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f523344a;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f523346c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f523347d;

    /* renamed from: e, reason: collision with root package name */
    public float f523348e;

    /* renamed from: h, reason: collision with root package name */
    public android.content.res.ColorStateList f523351h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.PorterDuffColorFilter f523352i;

    /* renamed from: j, reason: collision with root package name */
    public android.content.res.ColorStateList f523353j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f523349f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f523350g = true;

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f523354k = android.graphics.PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f523345b = new android.graphics.Paint(5);

    public e(android.content.res.ColorStateList colorStateList, float f17) {
        this.f523344a = f17;
        b(colorStateList);
        this.f523346c = new android.graphics.RectF();
        this.f523347d = new android.graphics.Rect();
    }

    public final android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(0);
        }
        this.f523351h = colorStateList;
        this.f523345b.setColor(colorStateList.getColorForState(getState(), this.f523351h.getDefaultColor()));
    }

    public final void c(android.graphics.Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        android.graphics.RectF rectF = this.f523346c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        android.graphics.Rect rect2 = this.f523347d;
        rect2.set(rect);
        if (this.f523349f) {
            float a17 = w.f.a(this.f523348e, this.f523344a, this.f523350g);
            float f17 = this.f523348e;
            float f18 = this.f523344a;
            if (this.f523350g) {
                f17 = (float) (f17 + ((1.0d - w.f.f523355a) * f18));
            }
            rect2.inset((int) java.lang.Math.ceil(f17), (int) java.lang.Math.ceil(a17));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        boolean z17;
        android.graphics.Paint paint = this.f523345b;
        if (this.f523352i == null || paint.getColorFilter() != null) {
            z17 = false;
        } else {
            paint.setColorFilter(this.f523352i);
            z17 = true;
        }
        android.graphics.RectF rectF = this.f523346c;
        float f17 = this.f523344a;
        canvas.drawRoundRect(rectF, f17, f17, paint);
        if (z17) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        outline.setRoundRect(this.f523347d, this.f523344a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2 = this.f523353j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f523351h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        android.graphics.PorterDuff.Mode mode;
        android.content.res.ColorStateList colorStateList = this.f523351h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        android.graphics.Paint paint = this.f523345b;
        boolean z17 = colorForState != paint.getColor();
        if (z17) {
            paint.setColor(colorForState);
        }
        android.content.res.ColorStateList colorStateList2 = this.f523353j;
        if (colorStateList2 == null || (mode = this.f523354k) == null) {
            return z17;
        }
        this.f523352i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f523345b.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f523345b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.f523353j = colorStateList;
        this.f523352i = a(colorStateList, this.f523354k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f523354k = mode;
        this.f523352i = a(this.f523353j, mode);
        invalidateSelf();
    }
}
