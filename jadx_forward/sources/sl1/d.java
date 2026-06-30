package sl1;

/* loaded from: classes5.dex */
public class d extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f490764a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f490765b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.RectF f490766c;

    /* renamed from: d, reason: collision with root package name */
    public float f490767d;

    /* renamed from: e, reason: collision with root package name */
    public final int f490768e = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);

    public d(android.graphics.drawable.Drawable drawable) {
        this.f490765b = drawable;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f490764a = paint;
        paint.setColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560833vg));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f490765b;
        android.graphics.Rect bounds = drawable.getBounds();
        int save = canvas.save();
        canvas.rotate(this.f490767d, ((bounds.right - bounds.left) * 0.5f) + bounds.left, ((bounds.bottom - bounds.top) * 0.5f) + bounds.top);
        canvas.drawOval(this.f490766c, this.f490764a);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f490768e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f490768e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.f490765b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        android.graphics.drawable.Drawable drawable = this.f490765b;
        if (drawable != null) {
            drawable.setAlpha(i17);
        }
        this.f490764a.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i17, int i18, int i19, int i27) {
        android.graphics.drawable.Drawable drawable = this.f490765b;
        if (drawable != null) {
            drawable.setBounds(i17, i18, i19, i27);
        }
        this.f490766c = new android.graphics.RectF(i17, i18, i19, i27);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f490764a.setColorFilter(colorFilter);
    }
}
