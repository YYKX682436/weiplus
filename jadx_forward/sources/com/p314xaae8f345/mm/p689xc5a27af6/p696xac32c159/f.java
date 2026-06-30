package com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159;

/* loaded from: classes5.dex */
public final class f extends android.graphics.drawable.BitmapDrawable {

    /* renamed from: f, reason: collision with root package name */
    public static final android.graphics.Bitmap f146682f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f146683a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f146684b;

    /* renamed from: c, reason: collision with root package name */
    public volatile android.graphics.Bitmap f146685c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f146686d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f146687e;

    static {
        new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.a(null);
        android.graphics.Bitmap c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
        f146682f = c17 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(c17, true, c17.getWidth() * 0.1f) : null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String username) {
        super(f146682f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f146683a = "MicroMsg.AnyProcessAvatarAttacher.AvatarDrawable#" + hashCode();
        this.f146684b = "";
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f146687e = paint;
        paint.setColor(-16777216);
        paint.setAlpha(76);
        paint.setAntiAlias(true);
        a(username);
    }

    public final void a(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        java.lang.String str = this.f146684b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f146683a, "username#set, oldUsername: " + str + ", newUsername: " + value);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(value, str)) {
            uk0.a.b(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(value), com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.k.f146699d, new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.l(new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.d(this, value, new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.e(this, value))));
        }
        this.f146684b = value;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Bitmap bitmap = this.f146685c;
        if (bitmap == null) {
            bitmap = f146682f;
        }
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f146683a, "draw, bitmap2Draw is null");
            super.draw(canvas);
            return;
        }
        android.graphics.Rect bounds = getBounds();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds, "getBounds(...)");
        canvas.drawBitmap(bitmap, (android.graphics.Rect) null, bounds, getPaint());
        if (this.f146686d) {
            canvas.drawRoundRect(new android.graphics.RectF(bounds), bounds.width() * 0.1f, bounds.height() * 0.1f, this.f146687e);
        }
    }
}
