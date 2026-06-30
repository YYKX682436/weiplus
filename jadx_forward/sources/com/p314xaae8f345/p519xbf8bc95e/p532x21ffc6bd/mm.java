package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes4.dex */
public final class mm {

    /* renamed from: a, reason: collision with root package name */
    private static final int f131958a = 7;

    /* renamed from: b, reason: collision with root package name */
    private static android.graphics.Canvas f131959b;

    /* renamed from: c, reason: collision with root package name */
    private static int f131960c;

    /* renamed from: d, reason: collision with root package name */
    private static android.graphics.Bitmap[] f131961d;

    /* renamed from: e, reason: collision with root package name */
    private static android.graphics.Bitmap f131962e;

    static {
        android.graphics.Bitmap[] bitmapArr = new android.graphics.Bitmap[7];
        f131961d = bitmapArr;
        bitmapArr[0] = android.graphics.Bitmap.createBitmap(64, 32, android.graphics.Bitmap.Config.ARGB_8888);
        f131961d[1] = android.graphics.Bitmap.createBitmap(128, 32, android.graphics.Bitmap.Config.ARGB_8888);
        f131961d[2] = android.graphics.Bitmap.createBitmap(128, 64, android.graphics.Bitmap.Config.ARGB_8888);
        f131961d[3] = android.graphics.Bitmap.createBitmap(256, 32, android.graphics.Bitmap.Config.ARGB_8888);
        f131961d[4] = android.graphics.Bitmap.createBitmap(256, 128, android.graphics.Bitmap.Config.ARGB_8888);
        f131961d[5] = android.graphics.Bitmap.createBitmap(32, 128, android.graphics.Bitmap.Config.ARGB_8888);
        f131961d[6] = android.graphics.Bitmap.createBitmap(32, 256, android.graphics.Bitmap.Config.ARGB_8888);
        f131959b = new android.graphics.Canvas(f131961d[1]);
        f131960c = 1;
        f131962e = null;
    }

    private static android.graphics.Canvas a(float f17, float f18) {
        int i17 = 0;
        while (i17 < 7 && (f131961d[i17].getWidth() < f17 || f131961d[i17].getHeight() < f18)) {
            i17++;
        }
        if (i17 < 7) {
            f131960c = i17;
            f131959b.setBitmap(f131961d[i17]);
            f131961d[i17].eraseColor(0);
            return f131959b;
        }
        f131960c = f131961d.length;
        int i18 = 1;
        int i19 = 1;
        while (i19 < f17) {
            i19 <<= 1;
        }
        while (i18 < f18) {
            i18 <<= 1;
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i19, i18, android.graphics.Bitmap.Config.ARGB_8888);
        f131962e = createBitmap;
        f131959b.setBitmap(createBitmap);
        f131962e.eraseColor(0);
        return f131959b;
    }

    private static android.graphics.Bitmap b() {
        int i17 = f131960c;
        return i17 < 7 ? f131961d[i17] : f131962e;
    }

    private static void a(float f17, float f18, android.graphics.Point point) {
        for (int i17 = 0; i17 < 7; i17++) {
            if (f131961d[i17].getWidth() >= f17 && f131961d[i17].getHeight() >= f18) {
                point.set(f131961d[i17].getWidth(), f131961d[i17].getHeight());
                return;
            }
        }
        int i18 = 1;
        int i19 = 1;
        while (i19 < f17) {
            i19 <<= 1;
        }
        while (i18 < f18) {
            i18 <<= 1;
        }
        point.set(i19, i18);
    }

    private static void a() {
        android.graphics.Bitmap bitmap = f131962e;
        if (bitmap != null) {
            bitmap.recycle();
            f131962e = null;
        }
    }
}
