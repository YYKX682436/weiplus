package com.p314xaae8f345.mm.rfx;

/* renamed from: com.tencent.mm.rfx.RfxPagImage */
/* loaded from: classes13.dex */
public class C20945xbc2db729 {

    /* renamed from: _hellAccFlag_ */
    private byte f39080x7f11beae;

    /* renamed from: nativeContext */
    long f39081xffae8598;

    static {
        tq5.k.a("xlabeffect");
        m77448xb90145c7();
    }

    public C20945xbc2db729(long j17) {
        this.f39081xffae8598 = j17;
    }

    /* renamed from: FromAssets */
    public static com.p314xaae8f345.mm.rfx.C20945xbc2db729 m77438xd8ad6bed(android.content.res.AssetManager assetManager, java.lang.String str) {
        long m77442x64fa9573 = m77442x64fa9573(assetManager, str);
        if (m77442x64fa9573 == 0) {
            return null;
        }
        return new com.p314xaae8f345.mm.rfx.C20945xbc2db729(m77442x64fa9573);
    }

    /* renamed from: FromBitmap */
    public static com.p314xaae8f345.mm.rfx.C20945xbc2db729 m77439xd9d5e999(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        if (android.os.Build.VERSION.SDK_INT >= 26 && config == android.graphics.Bitmap.Config.HARDWARE) {
            return null;
        }
        if (config != android.graphics.Bitmap.Config.ALPHA_8 && (config != android.graphics.Bitmap.Config.ARGB_8888 || !bitmap.isPremultiplied())) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config2);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/rfx/RfxPagImage", "FromBitmap", "(Landroid/graphics/Bitmap;)Lcom/tencent/mm/rfx/RfxPagImage;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/rfx/RfxPagImage", "FromBitmap", "(Landroid/graphics/Bitmap;)Lcom/tencent/mm/rfx/RfxPagImage;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            new android.graphics.Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, new android.graphics.Paint());
            bitmap = createBitmap;
        }
        long m77443x6623131f = m77443x6623131f(bitmap);
        if (m77443x6623131f == 0) {
            return null;
        }
        return new com.p314xaae8f345.mm.rfx.C20945xbc2db729(m77443x6623131f);
    }

    /* renamed from: FromBytes */
    public static com.p314xaae8f345.mm.rfx.C20945xbc2db729 m77440x7aab12c1(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        long m77444x76efa07b = m77444x76efa07b(bArr, bArr.length);
        if (m77444x76efa07b == 0) {
            return null;
        }
        return new com.p314xaae8f345.mm.rfx.C20945xbc2db729(m77444x76efa07b);
    }

    /* renamed from: FromPath */
    public static com.p314xaae8f345.mm.rfx.C20945xbc2db729 m77441xb9a86f0f(java.lang.String str) {
        long m77445xc1e4215 = m77445xc1e4215(str);
        if (m77445xc1e4215 == 0) {
            return null;
        }
        return new com.p314xaae8f345.mm.rfx.C20945xbc2db729(m77445xc1e4215);
    }

    /* renamed from: LoadFromAssets */
    private static native long m77442x64fa9573(android.content.res.AssetManager assetManager, java.lang.String str);

    /* renamed from: LoadFromBitmap */
    private static native long m77443x6623131f(android.graphics.Bitmap bitmap);

    /* renamed from: LoadFromBytes */
    private static native long m77444x76efa07b(byte[] bArr, int i17);

    /* renamed from: LoadFromPath */
    private static native long m77445xc1e4215(java.lang.String str);

    /* renamed from: nativeFinalize */
    private native void m77446xef578955();

    /* renamed from: nativeGetMatrix */
    private native void m77447xb07b460(float[] fArr);

    /* renamed from: nativeInit */
    private static final native void m77448xb90145c7();

    /* renamed from: nativeRelease */
    private final native void m77449x7f877f0();

    /* renamed from: nativeSetMatrix */
    private native void m77450xfe3ce86c(float f17, float f18, float f19, float f27, float f28, float f29);

    /* renamed from: finalize */
    public void m77451xd764dc1e() {
        m77446xef578955();
    }

    /* renamed from: height */
    public native int m77452xb7389127();

    /* renamed from: matrix */
    public android.graphics.Matrix m77453xbf8d97c1() {
        float[] fArr = new float[9];
        m77447xb07b460(fArr);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    /* renamed from: release */
    public void m77454x41012807() {
        m77449x7f877f0();
    }

    /* renamed from: scaleMode */
    public native int m77455x900e020d();

    /* renamed from: setMatrix */
    public void m77456x17d9eec3(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        m77450xfe3ce86c(fArr[0], fArr[3], fArr[1], fArr[4], fArr[2], fArr[5]);
    }

    /* renamed from: setScaleMode */
    public native void m77457xebcf33cb(int i17);

    /* renamed from: width */
    public native int m77458x6be2dc6();
}
