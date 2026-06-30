package s20;

/* loaded from: classes13.dex */
public final class a extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f483792a;

    /* renamed from: b, reason: collision with root package name */
    public final int f483793b;

    /* renamed from: c, reason: collision with root package name */
    public final int f483794c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f483795d;

    public a(android.graphics.drawable.Drawable mPlaceholder, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mPlaceholder, "mPlaceholder");
        this.f483792a = mPlaceholder;
        this.f483793b = i17;
        this.f483794c = i18;
        setBounds(0, 0, i17, i18);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.drawable.Drawable drawable = this.f483795d;
        if (drawable == null) {
            drawable = this.f483792a;
        }
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f483794c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f483793b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.f483795d;
        if (drawable == null) {
            drawable = this.f483792a;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f483792a.setAlpha(i17);
        android.graphics.drawable.Drawable drawable = this.f483795d;
        if (drawable == null) {
            return;
        }
        drawable.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i17, int i18, int i19, int i27) {
        super.setBounds(i17, i18, i19, i27);
        int i28 = i19 - i17;
        int i29 = i27 - i18;
        this.f483792a.setBounds(0, 0, i28, i29);
        android.graphics.drawable.Drawable drawable = this.f483795d;
        if (drawable != null) {
            drawable.setBounds(0, 0, i28, i29);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f483792a.setColorFilter(colorFilter);
        android.graphics.drawable.Drawable drawable = this.f483795d;
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(colorFilter);
    }
}
