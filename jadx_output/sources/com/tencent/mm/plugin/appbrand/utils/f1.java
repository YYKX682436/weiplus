package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.f1 f90437a = new com.tencent.mm.plugin.appbrand.utils.f1();

    public static final boolean a(android.graphics.Bitmap _bitmap, float f17, com.tencent.mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails checkBitmapIsBlankResultDetails) {
        kotlin.jvm.internal.o.g(_bitmap, "_bitmap");
        int[] iArr = {_bitmap.getWidth(), _bitmap.getHeight()};
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
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
                _bitmap = com.tencent.mm.sdk.platformtools.x.F0(_bitmap, f18, f18, true);
            }
            int nativeCheckBitmapIsBlank = com.tencent.mm.appbrand.commonjni.BitmapUtilsJni.nativeCheckBitmapIsBlank(_bitmap, f17, checkBitmapIsBlankResultDetails);
            if (nativeCheckBitmapIsBlank == 1) {
                return true;
            }
            if (nativeCheckBitmapIsBlank == 2) {
                return false;
            }
            throw new java.io.IOException("BitmapUtilsJni check failed:" + nativeCheckBitmapIsBlank);
        } finally {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BitmapUtils", "checkBitmapIsBlank bitmap[" + iArr[0] + 'x' + iArr[1] + "], cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    public final boolean b(android.graphics.BitmapFactory.Options options) {
        java.lang.String str;
        if (options == null || (str = options.outMimeType) == null) {
            return false;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        return r26.n0.L(lowerCase, "wxam", 0, false, 6, null) >= 0;
    }

    public boolean c(java.lang.String str) {
        java.lang.Throwable th6;
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        try {
            kotlin.jvm.internal.o.d(str);
            inputStream = com.tencent.mm.vfs.w6.E(str);
            try {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.tencent.mm.graphics.e.g(inputStream, null, options);
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
