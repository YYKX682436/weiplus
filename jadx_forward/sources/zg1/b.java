package zg1;

/* loaded from: classes5.dex */
public class b implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public final int f554343d;

    /* renamed from: e, reason: collision with root package name */
    public final int f554344e;

    /* renamed from: f, reason: collision with root package name */
    public final int f554345f;

    /* renamed from: g, reason: collision with root package name */
    public final int f554346g;

    public b(int i17, int i18, int i19, int i27) {
        iz5.a.c(null, i19 == 0);
        iz5.a.c(null, i27 == 0);
        this.f554343d = i17;
        this.f554344e = i18;
        this.f554345f = i19;
        this.f554346g = i27;
    }

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = this.f554343d;
        int i18 = i17 < 0 ? 0 : i17 > width ? width : i17;
        int i19 = this.f554344e;
        int i27 = i19 < 0 ? 0 : i19 > height ? height : i19;
        int i28 = (this.f554345f + i17) - i18;
        int i29 = (this.f554346g + i19) - i27;
        if (i18 + i28 > width) {
            i28 = width - i18;
        }
        if (i27 + i29 > height) {
            i29 = height - i27;
        }
        if (i28 <= 0 || i29 <= 0) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(1, 1, android.graphics.Bitmap.Config.ARGB_8888, false);
        }
        android.graphics.Bitmap m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(i28, i29, android.graphics.Bitmap.Config.ARGB_8888, false);
        new android.graphics.Canvas(m17).drawBitmap(bitmap, new android.graphics.Rect(i18, i27, i18 + i28, i27 + i29), new android.graphics.Rect(0, 0, i28, i29), (android.graphics.Paint) null);
        return m17;
    }

    @Override // l01.i0
    public java.lang.String key() {
        return java.lang.String.format("Transformation_x%s_y%s_w%s_h%s", java.lang.Integer.valueOf(this.f554343d), java.lang.Integer.valueOf(this.f554344e), java.lang.Integer.valueOf(this.f554345f), java.lang.Integer.valueOf(this.f554346g));
    }
}
