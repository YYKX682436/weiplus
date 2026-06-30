package l01;

/* loaded from: classes4.dex */
public class o0 implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public final int f396315d;

    /* renamed from: e, reason: collision with root package name */
    public final int f396316e;

    public o0(int i17, int i18) {
        this.f396315d = i17;
        this.f396316e = i18;
    }

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = this.f396315d;
        int i18 = this.f396316e;
        if (width == height) {
            float f17 = i17;
            if (i18 > 0 && i17 > 0) {
                f17 = (i17 * bitmap.getWidth()) / i18;
            }
            android.graphics.Bitmap s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, f17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s07, "getRoundedCornerBitmap(...)");
            return s07;
        }
        int min = (int) java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight());
        if (min <= 0) {
            min = (int) java.lang.Math.max(bitmap.getWidth(), bitmap.getHeight());
        }
        android.graphics.Bitmap k07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(bitmap, min, min, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k07, "getCenterCropBitmap(...)");
        float f18 = i17;
        if (i18 > 0 && i17 > 0) {
            f18 = (i17 * k07.getWidth()) / i18;
        }
        android.graphics.Bitmap s08 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(k07, false, f18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s08, "getRoundedCornerBitmap(...)");
        return s08;
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "RoundedCornerIcon_" + this.f396315d;
    }
}
