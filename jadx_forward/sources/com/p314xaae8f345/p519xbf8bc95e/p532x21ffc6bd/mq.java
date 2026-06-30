package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class mq {

    /* renamed from: a, reason: collision with root package name */
    public static final int f131978a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f131979b = 2;

    private static float a(float f17, float f18) {
        return (int) ((f17 * f18) + 0.5f);
    }

    private static android.graphics.Bitmap b(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = 2;
        int i18 = 2;
        while (i18 < width) {
            i18 <<= 1;
        }
        while (i17 < height) {
            i17 <<= 1;
        }
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i18, i17, false);
        if (createScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return createScaledBitmap;
    }

    private static android.graphics.Bitmap c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, android.graphics.Bitmap bitmap, java.lang.String str, int i17, int i18) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.na naVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.na(interfaceC25963x17625b8);
        naVar.setColor(i17);
        naVar.setTextSize(a(i18, 2.0f));
        naVar.a(600);
        float f17 = naVar.getFontMetrics().bottom - naVar.getFontMetrics().top;
        float max = java.lang.Math.max(width, naVar.measureText(str)) + 0.0f;
        float max2 = java.lang.Math.max(height, f17) + 0.0f;
        int ceil = (int) java.lang.Math.ceil(max);
        int ceil2 = (int) java.lang.Math.ceil(max2);
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, ceil, ceil2, false);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(ceil, ceil2, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.setDensity(0);
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, new android.graphics.Paint());
        float f18 = (float) (ceil / 2);
        float f19 = ceil2;
        float f27 = (f19 - ((f19 - f17) / 2.0f)) - naVar.getFontMetrics().bottom;
        naVar.setTextAlign(android.graphics.Paint.Align.CENTER);
        canvas.drawText(str, f18, f27, naVar);
        return createBitmap;
    }

    private static android.graphics.Bitmap a(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = 2;
        int i18 = 2;
        while (i18 < width) {
            i18 <<= 1;
        }
        while (i17 < height) {
            i17 <<= 1;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(false);
        try {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i18, i17, android.graphics.Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(0);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            canvas.setDensity(0);
            createBitmap.eraseColor(0);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return createBitmap;
        } catch (java.lang.OutOfMemoryError unused) {
            return null;
        }
    }

    private static int b(javax.microedition.khronos.opengles.GL10 gl10) {
        int a17 = a(gl10);
        gl10.glBindTexture(3553, a17);
        gl10.glTexParameterf(3553, 10241, 9729.0f);
        gl10.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        gl10.glTexParameterf(3553, 10242, 33071.0f);
        gl10.glTexParameterf(3553, 10243, 33071.0f);
        return a17;
    }

    private static android.graphics.Bitmap b(byte[] bArr) {
        return b(android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, a()));
    }

    private static android.graphics.Bitmap a(java.io.InputStream inputStream) {
        return android.graphics.BitmapFactory.decodeStream(inputStream, null, a());
    }

    private static android.graphics.Bitmap a(byte[] bArr) {
        return android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, a());
    }

    private static android.graphics.Bitmap b(java.io.InputStream inputStream) {
        return b(android.graphics.BitmapFactory.decodeStream(inputStream, null, a()));
    }

    private static android.graphics.BitmapFactory.Options a() {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return options;
    }

    private static android.graphics.Bitmap b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, android.graphics.Bitmap bitmap, java.lang.String str, int i17, int i18) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.na naVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.na(interfaceC25963x17625b8);
        naVar.setColor(i17);
        naVar.setTextSize(a(i18, 2.0f));
        naVar.a(600);
        float f17 = naVar.getFontMetrics().bottom - naVar.getFontMetrics().top;
        float max = java.lang.Math.max(width, naVar.measureText(str)) + 0.0f;
        float max2 = java.lang.Math.max(height, f17) + 0.0f;
        int ceil = (int) java.lang.Math.ceil(max);
        int ceil2 = (int) java.lang.Math.ceil(max2);
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, ceil, ceil2, false);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(ceil, ceil2, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.setDensity(0);
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, new android.graphics.Paint());
        float f18 = (float) (ceil / 2);
        float f19 = ceil2;
        float f27 = (f19 - ((f19 - f17) / 2.0f)) - naVar.getFontMetrics().bottom;
        naVar.setTextAlign(android.graphics.Paint.Align.CENTER);
        canvas.drawText(str, f18, f27, naVar);
        return createBitmap;
    }

    private static int a(javax.microedition.khronos.opengles.GL10 gl10, android.graphics.Bitmap bitmap) {
        int b17 = b(gl10);
        android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        return b17;
    }

    private static void a(javax.microedition.khronos.opengles.GL10 gl10, int i17) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(4);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.IntBuffer asIntBuffer = allocateDirect.asIntBuffer();
        asIntBuffer.put(i17);
        asIntBuffer.position(0);
        gl10.glDeleteTextures(1, asIntBuffer);
    }

    private static int a(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18, int i19, int i27, java.nio.IntBuffer intBuffer) {
        int b17 = b(gl10);
        gl10.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, i17, i18, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        gl10.glTexSubImage2D(3553, 0, 0, 0, i19, i27, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, intBuffer);
        return b17;
    }

    private static float a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, java.lang.String str, int i17, float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.na naVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.na(interfaceC25963x17625b8);
        naVar.setTextSize(a(i17, f17));
        naVar.a(600);
        return naVar.measureText(str);
    }

    private static android.graphics.Bitmap a(java.lang.String str, float f17, int i17, int i18, int i19, android.graphics.Typeface typeface) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(i17);
        paint.setTextSize(f17);
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
        android.graphics.Paint paint2 = new android.graphics.Paint(paint);
        paint2.setColor(i18);
        paint2.setStrokeWidth(paint.getStrokeWidth() + 2.0f);
        android.graphics.Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f18 = fontMetrics.bottom - fontMetrics.top;
        if (i19 != 1) {
            if (i19 != 2) {
                return null;
            }
            int ceil = (int) java.lang.Math.ceil(paint2.measureText(str) + 4.0f);
            int ceil2 = (int) java.lang.Math.ceil(f18);
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(ceil, ceil2, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            float f19 = (float) (ceil / 2);
            float f27 = (float) ((ceil2 / 2) + 1);
            paint2.setTextAlign(android.graphics.Paint.Align.CENTER);
            paint.setTextAlign(android.graphics.Paint.Align.CENTER);
            canvas.drawText(str, f19, f27, paint2);
            canvas.drawText(str, f19, f27, paint);
            return createBitmap;
        }
        int ceil3 = (int) java.lang.Math.ceil(((f18 + 2.0f) * str.length()) + 4.0f);
        int ceil4 = (int) java.lang.Math.ceil(paint2.measureText(str.substring(0, 1)) + 4.0f);
        float f28 = 0.0f - fontMetrics.top;
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(ceil4, ceil3, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap2);
        for (int i27 = 0; i27 < str.length(); i27++) {
            char charAt = str.charAt(i27);
            canvas2.drawText(java.lang.String.valueOf(charAt), 2.0f, f28, paint2);
            canvas2.drawText(java.lang.String.valueOf(charAt), 2.0f, f28, paint);
            f28 += f18;
        }
        return createBitmap2;
    }

    private static int a(javax.microedition.khronos.opengles.GL10 gl10) {
        int[] iArr = new int[1];
        gl10.glGenTextures(1, iArr, 0);
        return iArr[0];
    }

    private static android.graphics.Bitmap a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8, android.graphics.Bitmap bitmap, java.lang.String str, int i17, int i18) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.na naVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.na(interfaceC25963x17625b8);
        naVar.setColor(i17);
        naVar.setTextSize(a(i18, 2.0f));
        naVar.a(600);
        float f17 = naVar.getFontMetrics().bottom - naVar.getFontMetrics().top;
        float max = java.lang.Math.max(width, naVar.measureText(str)) + 0.0f;
        float max2 = java.lang.Math.max(height, f17) + 0.0f;
        int ceil = (int) java.lang.Math.ceil(max);
        int ceil2 = (int) java.lang.Math.ceil(max2);
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, ceil, ceil2, false);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(ceil, ceil2, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.setDensity(0);
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, new android.graphics.Paint());
        float f18 = (float) (ceil / 2);
        float f19 = ceil2;
        float f27 = (f19 - ((f19 - f17) / 2.0f)) - naVar.getFontMetrics().bottom;
        naVar.setTextAlign(android.graphics.Paint.Align.CENTER);
        canvas.drawText(str, f18, f27, naVar);
        return createBitmap;
    }
}
