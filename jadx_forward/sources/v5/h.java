package v5;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final s5.a f514816a;

    public h(s5.a bitmapPool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmapPool, "bitmapPool");
        this.f514816a = bitmapPool;
    }

    public final android.graphics.Bitmap a(android.graphics.drawable.Drawable drawable, android.graphics.Bitmap.Config config, p135x2eae8f.p138x35e001.AbstractC1421x275421 size, d6.g scale, boolean z17) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scale, "scale");
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.Bitmap bitmap3 = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap3, "bitmap");
            boolean z18 = true;
            if (bitmap3.getConfig() == (h6.a.b(config) ? android.graphics.Bitmap.Config.ARGB_8888 : config)) {
                if (!z17 && !(size instanceof p135x2eae8f.p138x35e001.C1419x8939e192) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(size, v5.f.b(bitmap3.getWidth(), bitmap3.getHeight(), size, scale))) {
                    z18 = false;
                }
                if (z18) {
                    return bitmap3;
                }
            }
        }
        android.graphics.drawable.Drawable mutate = drawable.mutate();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mutate, "drawable.mutate()");
        l36.i0 i0Var = h6.d.f360649a;
        boolean z19 = mutate instanceof android.graphics.drawable.BitmapDrawable;
        java.lang.Integer num = null;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = z19 ? (android.graphics.drawable.BitmapDrawable) mutate : null;
        java.lang.Integer valueOf = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? null : java.lang.Integer.valueOf(bitmap2.getWidth());
        int intrinsicWidth = valueOf == null ? mutate.getIntrinsicWidth() : valueOf.intValue();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable2 = z19 ? (android.graphics.drawable.BitmapDrawable) mutate : null;
        if (bitmapDrawable2 != null && (bitmap = bitmapDrawable2.getBitmap()) != null) {
            num = java.lang.Integer.valueOf(bitmap.getHeight());
        }
        int intrinsicHeight = num == null ? mutate.getIntrinsicHeight() : num.intValue();
        p135x2eae8f.p138x35e001.C1420x6f1c9387 b17 = v5.f.b(intrinsicWidth, intrinsicHeight > 0 ? intrinsicHeight : 512, size, scale);
        if (h6.a.b(config)) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        s5.a aVar = this.f514816a;
        int i17 = b17.f125445d;
        int i18 = b17.f125446e;
        android.graphics.Bitmap d17 = aVar.d(i17, i18, config);
        android.graphics.Rect bounds = mutate.getBounds();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds, "bounds");
        int i19 = bounds.left;
        int i27 = bounds.top;
        int i28 = bounds.right;
        int i29 = bounds.bottom;
        mutate.setBounds(0, 0, i17, i18);
        mutate.draw(new android.graphics.Canvas(d17));
        mutate.setBounds(i19, i27, i28, i29);
        return d17;
    }
}
