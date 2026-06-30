package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f221237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f221238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.m f221239f;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.m mVar, java.util.ArrayList arrayList, android.content.Intent intent) {
        this.f221239f = mVar;
        this.f221237d = arrayList;
        this.f221238e = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.o oVar = this.f221239f.f221246f;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.o.f221251g;
        oVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f221237d.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.o.f221251g;
            sb6.append(str3);
            sb6.append("microMsg.image.");
            sb6.append(currentTimeMillis);
            sb6.append(".");
            sb6.append(str2.hashCode() & 65535);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str4 = str3 + "microMsg.thumb." + currentTimeMillis + "." + (str2.hashCode() & 65535);
            if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str2).m43592x7a249f0b() == 0) ? false : true) {
                int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str2).m43592x7a249f0b();
                if (m43592x7a249f0b != 0) {
                    int i17 = m43592x7a249f0b % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
                    try {
                        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                        android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(str2, options);
                        if (d17 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseHaowanMedia", "rotate image, get null bmp");
                        } else {
                            android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(d17, i17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseHaowanMedia", "doRotate, dstPath : %s", sb7);
                            try {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(w07, 80, je.a.d(options) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG, sb7, true);
                                if (je.a.d(options)) {
                                    ya1.d.b(str2, sb7);
                                }
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseHaowanMedia", "rotate image, exception occurred when saving | %s", e17);
                                com.p314xaae8f345.mm.vfs.w6.h(sb7);
                            }
                        }
                    } catch (java.lang.NullPointerException | java.lang.OutOfMemoryError unused) {
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 e18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.e(str2, str4);
                android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str2);
                e18.f264277p = n07.outWidth;
                e18.f264278q = n07.outHeight;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416) e18).f264284w = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str2);
                java.lang.String str5 = e18.f264269e;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(e18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseHaowanMedia", "now filepath is : %s, local id is : %s", str2, str5);
                arrayList.add(str5);
            } else if (com.p314xaae8f345.mm.vfs.w6.d(str2, sb7, false) <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 e182 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.e(str2, str4);
                android.graphics.BitmapFactory.Options n072 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str2);
                e182.f264277p = n072.outWidth;
                e182.f264278q = n072.outHeight;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416) e182).f264284w = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str2);
                java.lang.String str52 = e182.f264269e;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(e182);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseHaowanMedia", "now filepath is : %s, local id is : %s", str2, str52);
                arrayList.add(str52);
            }
            str2 = sb7;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 e1822 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.e(str2, str4);
            android.graphics.BitmapFactory.Options n0722 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str2);
            e1822.f264277p = n0722.outWidth;
            e1822.f264278q = n0722.outHeight;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416) e1822).f264284w = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str2);
            java.lang.String str522 = e1822.f264269e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(e1822);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseHaowanMedia", "now filepath is : %s, local id is : %s", str2, str522);
            arrayList.add(str522);
        }
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.a(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseHaowanMedia", "after parse to json data : %s", a17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.k(this, a17));
    }
}
