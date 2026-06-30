package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class j {
    public static android.graphics.Bitmap a(java.lang.String str, float f17) {
        float f18 = 160.0f * f17;
        android.graphics.Bitmap j07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(str, 0, 0, f17);
        if (j07 != null) {
            j07.setDensity((int) f18);
        }
        return j07;
    }

    public static android.graphics.Bitmap b(java.lang.String str, int i17) {
        int i18;
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
        if (n07 == null || android.text.TextUtils.isEmpty(n07.outMimeType)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BackwardSupportUtil", "[-] [tomys] Fail to get image size: %s", str);
            return null;
        }
        int i19 = n07.outWidth;
        if (i19 == 0 || (i18 = n07.outHeight) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SDK.BackwardSupportUtil", "[!] [tomys] Bad image size: %s x %s, try to decode it directly.", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(n07.outHeight));
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(str);
        }
        n07.inJustDecodeBounds = false;
        n07.inSampleSize = 1;
        long j17 = i19 * i18 * 8;
        while (true) {
            int i27 = n07.inSampleSize;
            j17 = (j17 / i27) / i27;
            if (j17 <= 0) {
                if (i27 > 1) {
                    n07.inSampleSize = i27 - 1;
                }
            } else {
                if (j17 <= i17) {
                    break;
                }
                n07.inSampleSize = i27 + 1;
            }
        }
        return com.p314xaae8f345.mm.p786x600aa8b.e.d(str, n07);
    }

    public static android.graphics.Bitmap c(java.io.InputStream inputStream, float f17) {
        float f18 = 160.0f * f17;
        android.graphics.Bitmap P = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.P(inputStream, f17, 0, 0, false);
        if (P != null) {
            P.setDensity((int) f18);
        }
        return P;
    }

    public static int d(android.content.Context context, float f17) {
        return java.lang.Math.round((f17 * context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap e(java.lang.String r6) {
        /*
            java.lang.String r0 = "MicroMsg.SDK.BackwardSupportUtil"
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            java.net.URLConnection r6 = r2.openConnection()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3b
            r2 = 1
            r6.setDoInput(r2)     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L60
            r6.connect()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L60
            java.io.InputStream r2 = r6.getInputStream()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L60
            android.graphics.Bitmap r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.O(r2)     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L60
            r2.close()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L60
            java.io.InputStream r1 = r6.getInputStream()     // Catch: java.lang.Exception -> L28
            r1.close()     // Catch: java.lang.Exception -> L28
            goto L30
        L28:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L30:
            r6.disconnect()
            return r3
        L34:
            r2 = move-exception
            goto L3d
        L36:
            r6 = move-exception
            r5 = r1
            r1 = r6
            r6 = r5
            goto L61
        L3b:
            r2 = move-exception
            r6 = r1
        L3d:
            java.lang.String r3 = "get bitmap from url failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = ""
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L60
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L5f
            java.io.InputStream r2 = r6.getInputStream()     // Catch: java.lang.Exception -> L54
            r2.close()     // Catch: java.lang.Exception -> L54
            goto L5c
        L54:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r2)
        L5c:
            r6.disconnect()
        L5f:
            return r1
        L60:
            r1 = move-exception
        L61:
            if (r6 == 0) goto L76
            java.io.InputStream r2 = r6.getInputStream()     // Catch: java.lang.Exception -> L6b
            r2.close()     // Catch: java.lang.Exception -> L6b
            goto L73
        L6b:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r2)
        L73:
            r6.disconnect()
        L76:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.j.e(java.lang.String):android.graphics.Bitmap");
    }

    public static java.lang.String f(android.content.Context context) {
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        float f17 = displayMetrics.density;
        java.lang.String str = f17 < 1.0f ? "LDPI" : f17 >= 1.5f ? "HDPI" : "MDPI";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(configuration.orientation == 2 ? "_L" : "_P");
        return sb6.toString();
    }

    public static java.lang.String g(android.content.Context context) {
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return "" + displayMetrics.heightPixels + "x" + displayMetrics.widthPixels;
    }
}
