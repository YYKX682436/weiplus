package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes7.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r2 f225256f;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r2 r2Var, java.lang.String str, java.lang.String str2) {
        this.f225256f = r2Var;
        this.f225254d = str;
        this.f225255e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f225254d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r2 r2Var = this.f225256f;
        if (K0) {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            jd.c cVar = r2Var.f224975e;
            str = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).zj(cVar.f380558b, cVar.f380557a, this.f225255e);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                r2Var.f224976f.a("path or localID not exist");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiGetAccountInfo", "cannot find localPath");
                return;
            }
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetImageInfo$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetImageInfo$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            r2Var.f224976f.a("image not found");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiGetAccountInfo", "cannot find image");
            return;
        }
        java.lang.String c17 = je.a.c(options);
        java.lang.String b17 = je.a.d(options) ? je.a.b(je.a.a(str)) : "up";
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("width", java.lang.Integer.valueOf(options.outWidth));
        hashMap.put("height", java.lang.Integer.valueOf(options.outHeight));
        hashMap.put("orientation", b17);
        hashMap.put("type", c17);
        r2Var.f224976f.b(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetAccountInfo", "getImageInfo w=%d h=%d", java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight));
    }
}
