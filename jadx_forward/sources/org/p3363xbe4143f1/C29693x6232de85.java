package org.p3363xbe4143f1;

/* renamed from: org.libpag.PAGImage */
/* loaded from: classes13.dex */
public class C29693x6232de85 {

    /* renamed from: _hellAccFlag_ */
    private byte f75014x7f11beae;

    /* renamed from: nativeContext */
    long f75015xffae8598;

    static {
        b56.a.a("pag");
        m154769xb90145c7();
    }

    public C29693x6232de85(long j17) {
        this.f75015xffae8598 = j17;
    }

    /* renamed from: FromAssets */
    public static org.p3363xbe4143f1.C29693x6232de85 m154756xd8ad6bed(android.content.res.AssetManager assetManager, java.lang.String str) {
        long m154762x64fa9573 = m154762x64fa9573(assetManager, str);
        if (m154762x64fa9573 == 0) {
            return null;
        }
        return new org.p3363xbe4143f1.C29693x6232de85(m154762x64fa9573);
    }

    /* renamed from: FromBitmap */
    public static org.p3363xbe4143f1.C29693x6232de85 m154757xd9d5e999(android.graphics.Bitmap bitmap) {
        if (bitmap != null && bitmap.getConfig() == android.graphics.Bitmap.Config.ARGB_4444) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Boolean.FALSE);
            arrayList.add(config);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(bitmap, arrayList.toArray(), "org/libpag/PAGImage", "FromBitmap", "(Landroid/graphics/Bitmap;)Lorg/libpag/PAGImage;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap copy = bitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
            yj0.a.e(bitmap, copy, "org/libpag/PAGImage", "FromBitmap", "(Landroid/graphics/Bitmap;)Lorg/libpag/PAGImage;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            bitmap = copy;
        }
        long m154763x6623131f = m154763x6623131f(bitmap);
        if (m154763x6623131f == 0) {
            return null;
        }
        return new org.p3363xbe4143f1.C29693x6232de85(m154763x6623131f);
    }

    /* renamed from: FromBytes */
    public static org.p3363xbe4143f1.C29693x6232de85 m154758x7aab12c1(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        long m154764x76efa07b = m154764x76efa07b(bArr, bArr.length);
        if (m154764x76efa07b == 0) {
            return null;
        }
        return new org.p3363xbe4143f1.C29693x6232de85(m154764x76efa07b);
    }

    /* renamed from: FromPath */
    public static org.p3363xbe4143f1.C29693x6232de85 m154759xb9a86f0f(java.lang.String str) {
        long m154765xc1e4215 = m154765xc1e4215(str);
        if (m154765xc1e4215 == 0) {
            return null;
        }
        return new org.p3363xbe4143f1.C29693x6232de85(m154765xc1e4215);
    }

    /* renamed from: FromTexture */
    public static org.p3363xbe4143f1.C29693x6232de85 m154760x127fe9f1(int i17, int i18, int i19, int i27) {
        return m154761x127fe9f1(i17, i18, i19, i27, false);
    }

    /* renamed from: LoadFromAssets */
    private static native long m154762x64fa9573(android.content.res.AssetManager assetManager, java.lang.String str);

    /* renamed from: LoadFromBitmap */
    private static native long m154763x6623131f(android.graphics.Bitmap bitmap);

    /* renamed from: LoadFromBytes */
    private static native long m154764x76efa07b(byte[] bArr, int i17);

    /* renamed from: LoadFromPath */
    private static native long m154765xc1e4215(java.lang.String str);

    /* renamed from: LoadFromTexture */
    private static native long m154766xfd7f12b(int i17, int i18, int i19, int i27, boolean z17);

    /* renamed from: nativeFinalize */
    private native void m154767xef578955();

    /* renamed from: nativeGetMatrix */
    private native void m154768xb07b460(float[] fArr);

    /* renamed from: nativeInit */
    private static final native void m154769xb90145c7();

    /* renamed from: nativeRelease */
    private final native void m154770x7f877f0();

    /* renamed from: nativeSetMatrix */
    private native void m154771xfe3ce86c(float f17, float f18, float f19, float f27, float f28, float f29);

    /* renamed from: finalize */
    public void m154772xd764dc1e() {
        m154767xef578955();
    }

    /* renamed from: height */
    public native int m154773xb7389127();

    /* renamed from: matrix */
    public android.graphics.Matrix m154774xbf8d97c1() {
        float[] fArr = new float[9];
        m154768xb07b460(fArr);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    /* renamed from: release */
    public void m154775x41012807() {
        m154770x7f877f0();
    }

    /* renamed from: scaleMode */
    public native int m154776x900e020d();

    /* renamed from: setMatrix */
    public void m154777x17d9eec3(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        m154771xfe3ce86c(fArr[0], fArr[3], fArr[1], fArr[4], fArr[2], fArr[5]);
    }

    /* renamed from: setScaleMode */
    public native void m154778xebcf33cb(int i17);

    /* renamed from: width */
    public native int m154779x6be2dc6();

    /* renamed from: FromTexture */
    public static org.p3363xbe4143f1.C29693x6232de85 m154761x127fe9f1(int i17, int i18, int i19, int i27, boolean z17) {
        long m154766xfd7f12b = m154766xfd7f12b(i17, i18, i19, i27, z17);
        if (m154766xfd7f12b == 0) {
            return null;
        }
        return new org.p3363xbe4143f1.C29693x6232de85(m154766xfd7f12b);
    }
}
