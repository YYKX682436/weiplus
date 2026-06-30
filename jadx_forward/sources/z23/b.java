package z23;

/* loaded from: classes10.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final android.graphics.Bitmap a(java.io.InputStream inputStream, int i17, int i18, boolean z17, boolean z18, boolean z19) {
        float min;
        int i19 = i17;
        int i27 = i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputStream, "inputStream");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaTailor", "[decodeBitmap] limit[" + i19 + ':' + i27 + "] isRotate=" + z17 + " isClose=" + z18 + " isSizeStrict=" + z19 + " decode bitmap start");
        if (i19 > i27) {
            i27 = i19;
            i19 = i27;
        }
        android.graphics.BitmapFactory.Options m07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m0(inputStream, false);
        int i28 = m07.outWidth;
        int i29 = m07.outHeight;
        if (i28 <= i29) {
            float f17 = (i19 * 1.0f) / i28;
            float f18 = (i27 * 1.0f) / i29;
            if (f17 > f18) {
                f17 = f18;
            }
            min = java.lang.Math.min(1.0f, f17);
        } else {
            float f19 = (i19 * 1.0f) / i29;
            float f27 = (i27 * 1.0f) / i28;
            if (f19 > f27) {
                f19 = f27;
            }
            min = java.lang.Math.min(1.0f, f19);
        }
        inputStream.reset();
        android.graphics.Bitmap P = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.P(inputStream, 0.0f, (int) (m07.outWidth * min), (int) (m07.outHeight * min), z19);
        if (z17) {
            inputStream.reset();
            int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43588x80a06bca(inputStream).m43592x7a249f0b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaTailor", "read exif rotate degree %d", java.lang.Integer.valueOf(m43592x7a249f0b));
            P = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(P, m43592x7a249f0b * 1.0f);
        }
        if (z18) {
            inputStream.close();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[decodeBitmap] [");
        sb6.append(m07.outWidth);
        sb6.append(':');
        sb6.append(m07.outHeight);
        sb6.append("]->[");
        sb6.append(P != null ? java.lang.Integer.valueOf(P.getWidth()) : null);
        sb6.append(':');
        sb6.append(P != null ? java.lang.Integer.valueOf(P.getHeight()) : null);
        sb6.append("] scale=");
        sb6.append(min);
        sb6.append(" limit[");
        sb6.append(i19);
        sb6.append(':');
        sb6.append(i27);
        sb6.append("] decode bitmap done!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaTailor", sb6.toString());
        if (P == null) {
            P = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(1, 1, android.graphics.Bitmap.Config.ARGB_8888, false);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bitmap is null. ");
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb7.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaTailor", sb7.toString());
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(P);
        return P;
    }
}
