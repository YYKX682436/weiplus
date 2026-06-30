package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class h3 extends android.graphics.drawable.BitmapDrawable implements y60.e {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f222939g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public static android.graphics.Bitmap f222940h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f222941d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f222942e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f222943f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h3(java.lang.String r11, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.g3 r12) {
        /*
            r10 = this;
            android.graphics.Bitmap r12 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.h3.f222940h
            r0 = 1
            if (r12 == 0) goto Le
            boolean r12 = r12.isRecycled()
            if (r12 != 0) goto Le
            android.graphics.Bitmap r12 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.h3.f222940h
            goto L7a
        Le:
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r12)
            java.lang.ThreadLocal r12 = zj0.c.f554818a
            r12 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1.add(r2)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r1.add(r12)
            java.lang.Object r12 = new java.lang.Object
            r12.<init>()
            java.util.Collections.reverse(r1)
            java.lang.Object[] r3 = r1.toArray()
            java.lang.String r4 = "com/tencent/mm/plugin/game/ui/GameDrawable"
            java.lang.String r5 = "getDefaultBitmap"
            java.lang.String r6 = "()Landroid/graphics/Bitmap;"
            java.lang.String r7 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r8 = "createBitmap"
            java.lang.String r9 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r2 = r12
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            java.lang.Object r2 = r1.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r3 = r1.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 2
            java.lang.Object r1 = r1.get(r4)
            android.graphics.Bitmap$Config r1 = (android.graphics.Bitmap.Config) r1
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r3, r1)
            java.lang.String r4 = "com/tencent/mm/plugin/game/ui/GameDrawable"
            java.lang.String r5 = "getDefaultBitmap"
            java.lang.String r6 = "()Landroid/graphics/Bitmap;"
            java.lang.String r7 = "android/graphics/Bitmap_EXEC_"
            java.lang.String r8 = "createBitmap"
            java.lang.String r9 = "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"
            r2 = r12
            r3 = r1
            yj0.a.e(r2, r3, r4, r5, r6, r7, r8, r9)
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.h3.f222940h = r1
            r12 = r1
        L7a:
            r10.<init>(r12)
            com.tencent.mm.plugin.game.ui.g3 r12 = new com.tencent.mm.plugin.game.ui.g3
            r12.<init>(r10)
            r10.f222943f = r12
            android.graphics.Paint r12 = r10.getPaint()
            r12.setAntiAlias(r0)
            r12.setFilterBitmap(r0)
            java.lang.Class<y60.f> r12 = y60.f.class
            i95.m r12 = i95.n0.c(r12)
            y60.f r12 = (y60.f) r12
            x60.e r12 = (x60.e) r12
            r12.wi(r10)
            r10.a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.h3.<init>(java.lang.String, com.tencent.mm.plugin.game.ui.g3):void");
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (this.f222941d != null) {
            if (!(this.f222941d.hashCode() + "").equals(str) || bitmap == null || bitmap.isRecycled()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDrawable", "onGerPictureFinish() function has been invoke.");
            this.f222942e = bitmap;
            f222939g.mo50293x3498a0(this.f222943f);
        }
    }

    public void a(java.lang.String str) {
        if (str == null || str.equals(this.f222941d)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDrawable", "set a new url for the drawable,url:[%s]", str);
        this.f222941d = str;
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i2 i2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i2(this.f222941d);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(i2Var);
        if (d17 != null && !d17.isRecycled()) {
            this.f222942e = d17;
        }
        f222939g.mo50293x3498a0(this.f222943f);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.f222942e;
        if (bitmap == null || bitmap.isRecycled()) {
            super.draw(canvas);
            return;
        }
        android.graphics.Rect bounds = getBounds();
        canvas.drawBitmap(this.f222942e, new android.graphics.Rect(0, 0, this.f222942e.getWidth(), this.f222942e.getHeight()), bounds, getPaint());
    }
}
