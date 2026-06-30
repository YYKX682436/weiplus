package hj1;

/* loaded from: classes5.dex */
public class b implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public final int f363112d;

    /* renamed from: e, reason: collision with root package name */
    public final int f363113e;

    public b(int i17, int i18) {
        iz5.a.c(null, i17 == 0);
        iz5.a.c(null, i18 == 0);
        this.f363112d = i17;
        this.f363113e = i18;
    }

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = this.f363113e;
        int i18 = this.f363112d;
        float f17 = i17 / i18;
        android.graphics.Bitmap m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(i18, i17, android.graphics.Bitmap.Config.ARGB_8888, false);
        android.graphics.Canvas canvas = new android.graphics.Canvas(m17);
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = 0;
        rect.top = 0;
        float f18 = height;
        float f19 = width;
        if (f17 <= f18 / f19) {
            rect.right = width;
            rect.bottom = (int) (f19 * f17);
        } else {
            rect.right = (int) (f18 / f17);
            rect.bottom = height;
        }
        android.graphics.Rect rect2 = new android.graphics.Rect();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = i18;
        rect2.bottom = i17;
        canvas.drawBitmap(bitmap, rect, rect2, (android.graphics.Paint) null);
        return m17;
    }

    @Override // l01.i0
    public java.lang.String key() {
        return java.lang.String.format("Transformation_w%s_h%s", java.lang.Integer.valueOf(this.f363112d), java.lang.Integer.valueOf(this.f363113e));
    }
}
