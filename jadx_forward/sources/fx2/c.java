package fx2;

/* loaded from: classes8.dex */
public final class c extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f348649a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f348650b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Bitmap f348651c;

    /* renamed from: d, reason: collision with root package name */
    public final int f348652d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.ColorFilter f348653e;

    /* renamed from: f, reason: collision with root package name */
    public final mn2.f1 f348654f;

    public c(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f348649a = url;
        this.f348650b = "Finder.UrlBitmapDrawable";
        this.f348652d = 255;
        this.f348654f = mn2.f1.f411498s;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Bitmap bitmap = this.f348651c;
        java.lang.String str = this.f348650b;
        jz5.f0 f0Var = null;
        java.lang.String str2 = this.f348649a;
        if (bitmap != null) {
            android.graphics.Rect bounds = getBounds();
            android.graphics.Paint paint = new android.graphics.Paint();
            int i17 = this.f348652d;
            paint.setAlpha(i17);
            android.graphics.ColorFilter colorFilter = this.f348653e;
            if (colorFilter != null) {
                paint.setColorFilter(colorFilter);
            }
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, bounds, paint);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "draw, drawableAlpha=" + i17 + " rect:" + getBounds() + ", " + str2);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start load, " + str2);
            mn2.g1 g1Var = mn2.g1.f411508a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(this.f348654f));
            fx2.b bVar = new fx2.b(this, this);
            b17.getClass();
            b17.f529406d = bVar;
            b17.a();
        }
    }

    /* renamed from: equals */
    public boolean m130526xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof fx2.c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((fx2.c) obj).f348649a, this.f348649a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    /* renamed from: hashCode */
    public int m130527x8cdac1b() {
        return this.f348649a.hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f348653e = colorFilter;
        invalidateSelf();
    }
}
