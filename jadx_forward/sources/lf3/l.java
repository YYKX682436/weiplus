package lf3;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final lf3.l f399859a = new lf3.l();

    public final lf3.k a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5 c10724x2c46e1f5 = new com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5();
        ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(str, c10724x2c46e1f5);
        if (d17 != null) {
            d17.recycle();
        }
        int i17 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth;
        int i18 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.c(i17, i18) && ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth > 480;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.e(((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth, ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight) && ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight > 480;
        if (z17 || z18) {
            i18 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight;
            i17 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth;
        }
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str);
        if (a17 == 90 || a17 == 270) {
            int i19 = i18;
            i18 = i17;
            i17 = i19;
        }
        return new lf3.k(i17, i18, z17, z18);
    }
}
