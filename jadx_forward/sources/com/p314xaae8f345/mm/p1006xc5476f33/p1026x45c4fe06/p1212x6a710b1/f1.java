package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f1 f171970a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f1();

    public static final boolean a(android.graphics.Bitmap _bitmap, float f17, com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5133xf1a4812 c5133xf1a4812) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_bitmap, "_bitmap");
        int[] iArr = {_bitmap.getWidth(), _bitmap.getHeight()};
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            if (_bitmap.isRecycled()) {
                throw new java.lang.IllegalArgumentException("cannot use a recycled source");
            }
            int min = java.lang.Math.min(_bitmap.getWidth(), _bitmap.getHeight());
            if (min <= 0) {
                throw new java.lang.IllegalArgumentException("width and height must be > 0");
            }
            if (min > 300) {
                float f18 = 300.0f / min;
                _bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.F0(_bitmap, f18, f18, true);
            }
            int m43195x699c8e6a = com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5132x8dfa0ba3.m43195x699c8e6a(_bitmap, f17, c5133xf1a4812);
            if (m43195x699c8e6a == 1) {
                return true;
            }
            if (m43195x699c8e6a == 2) {
                return false;
            }
            throw new java.io.IOException("BitmapUtilsJni check failed:" + m43195x699c8e6a);
        } finally {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BitmapUtils", "checkBitmapIsBlank bitmap[" + iArr[0] + 'x' + iArr[1] + "], cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    public final boolean b(android.graphics.BitmapFactory.Options options) {
        java.lang.String str;
        if (options == null || (str = options.outMimeType) == null) {
            return false;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = str.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        return r26.n0.L(lowerCase, "wxam", 0, false, 6, null) >= 0;
    }

    public boolean c(java.lang.String str) {
        java.lang.Throwable th6;
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            inputStream = com.p314xaae8f345.mm.vfs.w6.E(str);
            try {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.p314xaae8f345.mm.p786x600aa8b.e.g(inputStream, null, options);
                boolean b17 = b(options);
                if (inputStream == null) {
                    return b17;
                }
                try {
                    inputStream.close();
                    return b17;
                } catch (java.io.IOException unused) {
                    return b17;
                }
            } catch (java.lang.Exception unused2) {
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                return false;
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused4) {
                    }
                }
                throw th6;
            }
        } catch (java.lang.Exception unused5) {
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            inputStream = null;
        }
    }
}
