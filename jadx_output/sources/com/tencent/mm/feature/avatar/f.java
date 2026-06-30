package com.tencent.mm.feature.avatar;

/* loaded from: classes5.dex */
public final class f extends android.graphics.drawable.BitmapDrawable {

    /* renamed from: f, reason: collision with root package name */
    public static final android.graphics.Bitmap f65149f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f65150a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f65151b;

    /* renamed from: c, reason: collision with root package name */
    public volatile android.graphics.Bitmap f65152c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f65153d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f65154e;

    static {
        new com.tencent.mm.feature.avatar.a(null);
        android.graphics.Bitmap c17 = com.tencent.mm.sdk.platformtools.j.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
        f65149f = c17 != null ? com.tencent.mm.sdk.platformtools.x.s0(c17, true, c17.getWidth() * 0.1f) : null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String username) {
        super(f65149f);
        kotlin.jvm.internal.o.g(username, "username");
        this.f65150a = "MicroMsg.AnyProcessAvatarAttacher.AvatarDrawable#" + hashCode();
        this.f65151b = "";
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f65154e = paint;
        paint.setColor(-16777216);
        paint.setAlpha(76);
        paint.setAntiAlias(true);
        a(username);
    }

    public final void a(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        java.lang.String str = this.f65151b;
        com.tencent.mars.xlog.Log.i(this.f65150a, "username#set, oldUsername: " + str + ", newUsername: " + value);
        if (!kotlin.jvm.internal.o.b(value, str)) {
            uk0.a.b(new com.tencent.mm.ipcinvoker.type.IPCString(value), com.tencent.mm.feature.avatar.k.f65166d, new com.tencent.mm.feature.avatar.l(new com.tencent.mm.feature.avatar.d(this, value, new com.tencent.mm.feature.avatar.e(this, value))));
        }
        this.f65151b = value;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Bitmap bitmap = this.f65152c;
        if (bitmap == null) {
            bitmap = f65149f;
        }
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.i(this.f65150a, "draw, bitmap2Draw is null");
            super.draw(canvas);
            return;
        }
        android.graphics.Rect bounds = getBounds();
        kotlin.jvm.internal.o.f(bounds, "getBounds(...)");
        canvas.drawBitmap(bitmap, (android.graphics.Rect) null, bounds, getPaint());
        if (this.f65153d) {
            canvas.drawRoundRect(new android.graphics.RectF(bounds), bounds.width() * 0.1f, bounds.height() * 0.1f, this.f65154e);
        }
    }
}
