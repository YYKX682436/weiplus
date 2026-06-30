package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes11.dex */
public class x extends com.p314xaae8f345.mm.p2470x93e71c27.ui.v {

    /* renamed from: v, reason: collision with root package name */
    public static u45.f f273618v;

    /* renamed from: s, reason: collision with root package name */
    public float f273619s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Bitmap f273620t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Paint f273621u;

    public x(java.lang.String str, float f17) {
        super(com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c(), str);
        this.f273619s = 0.5f;
        this.f273620t = null;
        this.f273621u = new android.graphics.Paint();
        this.f273619s = f17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v, com.p314xaae8f345.mm.p2470x93e71c27.ui.n1, kv.e0
    public void U(java.lang.String str) {
        super.U(str);
    }

    public final void c(android.graphics.Canvas canvas, android.graphics.Bitmap bitmap) {
        android.graphics.Rect rect;
        android.graphics.Rect bounds = getBounds();
        if (this.f272435n > 1.0f || this.f272429e) {
            int height = (bitmap.getHeight() / 15) / 2;
            int width = (bitmap.getWidth() / 15) / 2;
            rect = new android.graphics.Rect(width, height, bitmap.getWidth() - width, bitmap.getHeight() - height);
        } else {
            rect = null;
        }
        canvas.drawBitmap(bitmap, rect, bounds, this.f272428d);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.n1, android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (f273618v == null) {
            f273618v = u45.e.a();
        }
        java.lang.String str = this.f272434m + "-" + this.f273619s;
        android.graphics.Bitmap Ai = ((va3.m0) f273618v).Ai(str);
        if (Ai == null || Ai.isRecycled()) {
            boolean z17 = this.f272430f;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var = this.f272433i;
            android.graphics.Bitmap Zg = z17 ? j1Var.Zg(this.f272434m, canvas.getWidth(), canvas.getHeight(), 1) : j1Var.mo560xd586ddb5(this.f272434m);
            boolean a17 = j1Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.k1 ? ((com.p314xaae8f345.mm.p2470x93e71c27.ui.k1) j1Var).a(this.f272434m) : true;
            if (Zg == null || Zg.isRecycled()) {
                if (this.f273620t == null) {
                    try {
                        java.io.InputStream open = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("avatar/default_nor_avatar.png", 3);
                        try {
                            this.f273620t = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(open, i65.a.g(null)), true, this.f273619s * r1.getWidth());
                            if (open != null) {
                                open.close();
                            }
                        } finally {
                        }
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AvatarRoundDrawable", e17, "", new java.lang.Object[0]);
                    }
                }
                android.graphics.Bitmap bitmap = this.f273620t;
                if (bitmap != null && !bitmap.isRecycled()) {
                    c(canvas, bitmap);
                }
            } else {
                if (a17) {
                    Zg = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(Zg, false, this.f273619s * Zg.getWidth());
                }
                ((va3.m0) f273618v).Bi(str, Zg);
                c(canvas, Zg);
            }
        } else {
            c(canvas, Ai);
        }
        if (this.f273561r) {
            android.graphics.Paint paint = this.f273621u;
            paint.setColor(-16777216);
            paint.setAlpha(76);
            paint.setAntiAlias(true);
            android.graphics.RectF rectF = new android.graphics.RectF(getBounds());
            canvas.drawRoundRect(rectF, this.f273619s * rectF.width(), this.f273619s * rectF.height(), paint);
        }
    }
}
