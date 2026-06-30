package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.b f221122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221124g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221125h;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x3 x3Var, java.lang.String str, sd.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, java.lang.String str2, java.lang.String str3) {
        this.f221121d = str;
        this.f221122e = bVar;
        this.f221123f = q5Var;
        this.f221124g = str2;
        this.f221125h = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f221121d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String str2 = this.f221124g;
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
            java.lang.String str3 = this.f221125h;
            if (K0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.z3 z3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.z3(this);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("url", str2);
            bundle.putString(dm.i4.f66867x2a5c95c7, str3);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.g4.class, z3Var);
            return;
        }
        byte[] decode = android.util.Base64.decode(str, 2);
        int length = decode.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(decode);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/jsapi/JsApiSaveImageToPhotosAlbum$2", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
        yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/game/luggage/jsapi/JsApiSaveImageToPhotosAlbum$2", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x3.i("", "", decodeByteArray, ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) this.f221122e.f488129a).f488143d, this.f221123f);
    }
}
