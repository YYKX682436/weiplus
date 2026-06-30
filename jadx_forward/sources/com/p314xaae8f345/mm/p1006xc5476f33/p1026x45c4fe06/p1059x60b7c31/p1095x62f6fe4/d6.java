package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class d6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.b6 {
    public d6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z5 z5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.b6
    public nm5.j a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.String str) {
        java.lang.String b17;
        java.io.InputStream q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.q(c11510xdd90c2f2, str);
        if (q17 == null) {
            return nm5.j.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e6.FILE_NOT_FOUND);
        }
        int i17 = 0;
        q17.mark(0);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.Rect rect = new android.graphics.Rect();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(rect);
        arrayList.add(q17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/media/JsApiGetImageInfo$LocalPathImpl", "getImageInfo", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Ljava/lang/String;)Lcom/tencent/mm/vending/tuple/Tuple;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2)), "com/tencent/mm/plugin/appbrand/jsapi/media/JsApiGetImageInfo$LocalPathImpl", "getImageInfo", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;Ljava/lang/String;)Lcom/tencent/mm/vending/tuple/Tuple;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c6 c6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c6(null);
        c6Var.f163275a = options.outWidth;
        c6Var.f163276b = options.outHeight;
        c6Var.f163278d = je.a.c(options);
        boolean d17 = je.a.d(options);
        try {
            q17.reset();
        } catch (java.io.IOException unused) {
        }
        if (d17) {
            try {
                i17 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(q17).m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 1);
            } catch (java.lang.Error | java.lang.Exception unused2) {
            }
            b17 = je.a.b(i17);
        } else {
            b17 = "up";
        }
        c6Var.f163277c = b17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(q17);
        return nm5.j.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e6.RESOLVED, c6Var);
    }
}
