package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes13.dex */
public class x0 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f219878a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.drawable.Drawable f219879b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f219880c;

    /* renamed from: d, reason: collision with root package name */
    public final int f219881d;

    /* renamed from: e, reason: collision with root package name */
    public int f219882e;

    /* renamed from: g, reason: collision with root package name */
    public final int f219884g;

    /* renamed from: h, reason: collision with root package name */
    public final int f219885h;

    /* renamed from: i, reason: collision with root package name */
    public final int f219886i;

    /* renamed from: j, reason: collision with root package name */
    public final int f219887j;

    /* renamed from: k, reason: collision with root package name */
    public final int f219888k;

    /* renamed from: m, reason: collision with root package name */
    public int f219890m;

    /* renamed from: p, reason: collision with root package name */
    public final int f219893p;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f219883f = new android.graphics.Paint(1);

    /* renamed from: l, reason: collision with root package name */
    public boolean f219889l = false;

    /* renamed from: n, reason: collision with root package name */
    public int f219891n = 2;

    /* renamed from: o, reason: collision with root package name */
    public int f219892o = 0;

    public x0(android.content.Context context) {
        this.f219881d = 0;
        this.f219882e = 0;
        this.f219888k = 0;
        this.f219893p = 0;
        this.f219878a = context;
        this.f219881d = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        this.f219882e = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        this.f219879b = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c67);
        this.f219880c = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c68);
        this.f219888k = i65.a.b(context, 24);
        this.f219884g = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a__);
        this.f219887j = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a_a);
        this.f219890m = i65.a.b(context, 47);
        this.f219885h = i65.a.b(context, 47);
        this.f219886i = i65.a.b(context, 60);
        this.f219893p = 4;
    }

    public final boolean a(android.graphics.Canvas canvas) {
        return canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0;
    }

    public final void b(android.graphics.Canvas canvas, boolean z17) {
        android.graphics.drawable.Drawable drawable;
        int i17;
        if (this.f219879b == null || a(canvas)) {
            return;
        }
        if (z17) {
            drawable = this.f219880c;
            i17 = this.f219881d;
        } else {
            drawable = this.f219879b;
            i17 = this.f219882e;
        }
        int width = canvas.getWidth() / 2;
        int height = canvas.getHeight() / 2;
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
        android.graphics.Paint paint = this.f219883f;
        paint.setShader(null);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(i17);
        canvas.drawCircle(width, height, this.f219888k, paint);
        drawable.setBounds(width - intrinsicWidth, height - intrinsicHeight, width + intrinsicWidth, height + intrinsicHeight);
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        int i17 = this.f219891n;
        android.graphics.Paint paint = this.f219883f;
        if ((i17 == 6 || i17 == 7) && !a(canvas)) {
            int width = canvas.getWidth() >> 1;
            int height = canvas.getHeight() >> 1;
            paint.setShader(null);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f219884g);
            int i18 = this.f219891n;
            int i19 = this.f219885h;
            if (i18 == 7) {
                boolean z17 = this.f219889l;
                int i27 = this.f219893p;
                if (z17) {
                    this.f219890m -= i27;
                } else {
                    this.f219890m += i27;
                }
                int min = java.lang.Math.min(java.lang.Math.max(i19, this.f219890m), this.f219886i);
                this.f219890m = min;
                canvas.drawCircle(width, height, min, paint);
            } else {
                canvas.drawCircle(width, height, i19, paint);
            }
        }
        int i28 = this.f219891n;
        if (i28 == 6 || i28 == 7) {
            b(canvas, true);
        } else {
            b(canvas, false);
        }
        int i29 = this.f219891n;
        if ((i29 == 6 || i29 == 7) && !a(canvas)) {
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f219887j);
            canvas.drawCircle(canvas.getWidth() >> 1, canvas.getHeight() >> 1, this.f219888k, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f219888k * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        android.content.Context context = this.f219878a;
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
