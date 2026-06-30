package com.tencent.mapsdk.internal;

/* loaded from: classes4.dex */
public final class mm {

    /* renamed from: a, reason: collision with root package name */
    private static final int f50425a = 7;

    /* renamed from: b, reason: collision with root package name */
    private static android.graphics.Canvas f50426b;

    /* renamed from: c, reason: collision with root package name */
    private static int f50427c;

    /* renamed from: d, reason: collision with root package name */
    private static android.graphics.Bitmap[] f50428d;

    /* renamed from: e, reason: collision with root package name */
    private static android.graphics.Bitmap f50429e;

    static {
        android.graphics.Bitmap[] bitmapArr = new android.graphics.Bitmap[7];
        f50428d = bitmapArr;
        bitmapArr[0] = android.graphics.Bitmap.createBitmap(64, 32, android.graphics.Bitmap.Config.ARGB_8888);
        f50428d[1] = android.graphics.Bitmap.createBitmap(128, 32, android.graphics.Bitmap.Config.ARGB_8888);
        f50428d[2] = android.graphics.Bitmap.createBitmap(128, 64, android.graphics.Bitmap.Config.ARGB_8888);
        f50428d[3] = android.graphics.Bitmap.createBitmap(256, 32, android.graphics.Bitmap.Config.ARGB_8888);
        f50428d[4] = android.graphics.Bitmap.createBitmap(256, 128, android.graphics.Bitmap.Config.ARGB_8888);
        f50428d[5] = android.graphics.Bitmap.createBitmap(32, 128, android.graphics.Bitmap.Config.ARGB_8888);
        f50428d[6] = android.graphics.Bitmap.createBitmap(32, 256, android.graphics.Bitmap.Config.ARGB_8888);
        f50426b = new android.graphics.Canvas(f50428d[1]);
        f50427c = 1;
        f50429e = null;
    }

    private static android.graphics.Canvas a(float f17, float f18) {
        int i17 = 0;
        while (i17 < 7 && (f50428d[i17].getWidth() < f17 || f50428d[i17].getHeight() < f18)) {
            i17++;
        }
        if (i17 < 7) {
            f50427c = i17;
            f50426b.setBitmap(f50428d[i17]);
            f50428d[i17].eraseColor(0);
            return f50426b;
        }
        f50427c = f50428d.length;
        int i18 = 1;
        int i19 = 1;
        while (i19 < f17) {
            i19 <<= 1;
        }
        while (i18 < f18) {
            i18 <<= 1;
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i19, i18, android.graphics.Bitmap.Config.ARGB_8888);
        f50429e = createBitmap;
        f50426b.setBitmap(createBitmap);
        f50429e.eraseColor(0);
        return f50426b;
    }

    private static android.graphics.Bitmap b() {
        int i17 = f50427c;
        return i17 < 7 ? f50428d[i17] : f50429e;
    }

    private static void a(float f17, float f18, android.graphics.Point point) {
        for (int i17 = 0; i17 < 7; i17++) {
            if (f50428d[i17].getWidth() >= f17 && f50428d[i17].getHeight() >= f18) {
                point.set(f50428d[i17].getWidth(), f50428d[i17].getHeight());
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
        android.graphics.Bitmap bitmap = f50429e;
        if (bitmap != null) {
            bitmap.recycle();
            f50429e = null;
        }
    }
}
