package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* loaded from: classes7.dex */
public abstract class v {
    public static android.graphics.Bitmap a(byte[] bArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            return null;
        }
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        long m64978xe871e070 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64978xe871e070();
        if (m64978xe871e070 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMWXGFUtil", "Cpan init wxam decoder failed.");
        }
        int m64969x79127872 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64969x79127872(m64978xe871e070, bArr, bArr.length);
        if (m64969x79127872 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMWXGFUtil", "Cpan WXGF decode buffer header failed. result:%d", java.lang.Integer.valueOf(m64969x79127872));
        }
        int m64975xf44a514 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64975xf44a514(m64978xe871e070, bArr, bArr.length, iArr);
        if (m64975xf44a514 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMWXGFUtil", "Cpan WXGF get option failed. result:%d", java.lang.Integer.valueOf(m64975xf44a514));
        }
        int i17 = iArr[1];
        int i18 = iArr[2];
        if (i17 <= 0 || i18 <= 0) {
            return null;
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/gif/MMWXGFUtil", "getWXGFFirstBitmap", "([B)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/gif/MMWXGFUtil", "getWXGFFirstBitmap", "([B)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64968x5ea842e8(m64978xe871e070, null, 0, createBitmap, iArr2);
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64990x92410e20(m64978xe871e070);
        return createBitmap;
    }
}
