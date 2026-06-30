package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes5.dex */
public class a1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    public static int f(double d17) {
        return (int) (d17 * android.content.res.Resources.getSystem().getDisplayMetrics().density);
    }

    @Override // sd.c
    public java.lang.String b() {
        return "getWebViewSnapShot";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        if (jSONObject == null) {
            bVar.c("invalid_params", null);
            return;
        }
        double optDouble = jSONObject.optDouble("compressionRatio", 0.9d);
        double optDouble2 = jSONObject.optDouble("x", 0.0d);
        double optDouble3 = jSONObject.optDouble("y", 0.0d);
        double optDouble4 = jSONObject.optDouble("width", 0.0d);
        double optDouble5 = jSONObject.optDouble("height", 0.0d);
        double optDouble6 = jSONObject.optDouble("snapshotWidth", 0.0d);
        boolean optBoolean = jSONObject.optBoolean("noLocalId", false);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a;
        int f17 = f(optDouble2);
        int f18 = f(optDouble3);
        int f19 = f(optDouble4);
        int f27 = f(optDouble5);
        int f28 = f(optDouble6);
        android.graphics.Bitmap f29 = x0Var.f488188i.f488166i.f();
        if (f17 < 0 || f17 >= f29.getWidth()) {
            f17 = 0;
        }
        if (f18 < 0 || f18 >= f29.getWidth()) {
            f18 = 0;
        }
        if (f19 <= 0 || f19 >= f29.getWidth() - f17) {
            f19 = f29.getWidth() - f17;
        }
        if (f27 <= 0 || f27 >= f29.getHeight() - f18) {
            f27 = f29.getHeight() - f18;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(f27));
        arrayList.add(java.lang.Integer.valueOf(f19));
        arrayList.add(java.lang.Integer.valueOf(f18));
        arrayList.add(java.lang.Integer.valueOf(f17));
        arrayList.add(f29);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/luggage/container/LuggageWebPage", "takeScreenShot", "(IIIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
        yj0.a.e(obj, createBitmap, "com/tencent/luggage/container/LuggageWebPage", "takeScreenShot", "(IIIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        if (f28 == 0) {
            f28 = f19;
        }
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(createBitmap, f28, (f28 / f19) * f27, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMImage_");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b("screenshot".getBytes()));
        sb6.append(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
        java.lang.String sb7 = sb6.toString();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.y0(this, createScaledBitmap, java.lang.Math.min(java.lang.Math.max((int) (optDouble * 100.0d), 10), 99), optBoolean, sb7, jSONObject2, bVar));
    }
}
