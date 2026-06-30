package com.p314xaae8f345.mm.p2629x577239cb;

/* renamed from: com.tencent.mm.timelineedit.MediaInfoRetriever */
/* loaded from: classes10.dex */
public class C21326x4b265544 {

    /* renamed from: _hellAccFlag_ */
    private byte f39238x7f11beae;

    /* renamed from: getImageInfo */
    public static int[] m78213xcb10cdf3(java.lang.String str) {
        new android.graphics.BitmapFactory.Options().inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/timelineedit/MediaInfoRetriever", "getImageInfo", "(Ljava/lang/String;)[I", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
        yj0.a.e(obj, decodeFile, "com/tencent/mm/timelineedit/MediaInfoRetriever", "getImageInfo", "(Ljava/lang/String;)[I", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        return decodeFile != null ? new int[]{decodeFile.getWidth(), decodeFile.getHeight()} : new int[]{0, 0};
    }

    /* renamed from: getVideoOrAudioInfo */
    public static int[] m78214x645a8afc(java.lang.String str) {
        rm5.p d17 = rm5.l.f479053a.d(str);
        return d17 != null ? new int[]{d17.f479068d, d17.f479065a, d17.f479066b} : new int[]{0, 0, 0};
    }
}
