package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes5.dex */
public class jp extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f228609a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f228610b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f228611c;

    /* renamed from: e, reason: collision with root package name */
    public final int f228613e;

    /* renamed from: f, reason: collision with root package name */
    public final int f228614f;

    /* renamed from: g, reason: collision with root package name */
    public final int f228615g;

    /* renamed from: h, reason: collision with root package name */
    public final int f228616h;

    /* renamed from: i, reason: collision with root package name */
    public final int f228617i;

    /* renamed from: k, reason: collision with root package name */
    public int f228619k;

    /* renamed from: l, reason: collision with root package name */
    public int f228620l;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f228612d = new android.graphics.Paint(1);

    /* renamed from: j, reason: collision with root package name */
    public boolean f228618j = false;

    /* renamed from: m, reason: collision with root package name */
    public int f228621m = 2;

    /* renamed from: n, reason: collision with root package name */
    public final int f228622n = 2;

    public jp(android.content.Context context) {
        this.f228609a = context;
        i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560905xo);
        i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a09);
        this.f228610b = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c_s);
        this.f228611c = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c_s);
        this.f228616h = i65.a.b(context, 24);
        this.f228617i = i65.a.b(context, 34);
        this.f228613e = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560903xn);
        this.f228620l = i65.a.a(context, 40.0f);
        this.f228614f = i65.a.a(context, 40.0f);
        this.f228615g = i65.a.a(context, 56.0f);
    }

    public final void a(android.graphics.Canvas canvas, boolean z17) {
        int i17;
        android.graphics.drawable.Drawable drawable = this.f228610b;
        if (drawable != null) {
            if (canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0) {
                return;
            }
            if (z17) {
                drawable = this.f228611c;
                i17 = this.f228617i;
            } else {
                i17 = this.f228616h;
            }
            int width = canvas.getWidth() / 2;
            int height = canvas.getHeight() / 2;
            drawable.setBounds(width - i17, height - i17, width + i17, height + i17);
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        int i17 = this.f228621m;
        if (i17 == 6 || i17 == 7) {
            if (!(canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0)) {
                int width = canvas.getWidth() >> 1;
                int height = canvas.getHeight() >> 1;
                android.graphics.Paint paint = this.f228612d;
                paint.setShader(null);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setColor(this.f228613e);
                int i18 = this.f228621m;
                int i19 = this.f228614f;
                if (i18 == 7) {
                    boolean z17 = this.f228618j;
                    int i27 = this.f228622n;
                    if (z17) {
                        this.f228620l -= i27;
                    } else {
                        this.f228620l += i27;
                    }
                    int min = java.lang.Math.min(java.lang.Math.max(i19, this.f228620l), this.f228615g);
                    this.f228620l = min;
                    canvas.drawCircle(width, height, min, paint);
                } else {
                    canvas.drawCircle(width, height, i19, paint);
                }
            }
        }
        int i28 = this.f228621m;
        if (i28 == 6 || i28 == 7) {
            a(canvas, true);
        } else {
            a(canvas, false);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f228616h * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        android.content.Context context = this.f228609a;
        if (context == null) {
            return 0;
        }
        return i65.a.B(context);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
