package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f266887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f266889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f266890g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266891h;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.util.ArrayList arrayList, java.lang.String str, java.util.ArrayList arrayList2, android.content.Intent intent) {
        this.f266891h = c1Var;
        this.f266887d = arrayList;
        this.f266888e = str;
        this.f266889f = arrayList2;
        this.f266890g = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f266887d.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = this.f266888e;
            sb6.append(str2);
            sb6.append("microMsg.image.");
            sb6.append(currentTimeMillis);
            sb6.append(".");
            sb6.append(str.hashCode() & 65535);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str3 = str2 + "microMsg.thumb." + currentTimeMillis + "." + (str.hashCode() & 65535);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266891h;
            c1Var.getClass();
            if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str).m43592x7a249f0b() == 0) ? false : true) {
                c1Var.getClass();
                int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str).m43592x7a249f0b();
                if (m43592x7a249f0b != 0) {
                    int i17 = m43592x7a249f0b % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
                    try {
                        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                        android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(str, options);
                        if (d17 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "rotate image, get null bmp");
                        } else {
                            android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(d17, i17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doRotate, dstPath : %s", sb7);
                            try {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(w07, 80, je.a.d(options) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG, sb7, true);
                                if (je.a.d(options)) {
                                    ya1.d.b(str, sb7);
                                }
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "rotate image, exception occurred when saving | %s", e17);
                                com.p314xaae8f345.mm.vfs.w6.h(sb7);
                            }
                        }
                    } catch (java.lang.NullPointerException | java.lang.OutOfMemoryError unused) {
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 e18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.e(str, str3);
                android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
                e18.f264277p = n07.outWidth;
                e18.f264278q = n07.outHeight;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416) e18).f264284w = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str);
                java.lang.String str4 = e18.f264269e;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(e18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "now filepath is : %s, local id is : %s", str, str4);
                this.f266889f.add(str4);
            } else if (com.p314xaae8f345.mm.vfs.w6.d(str, sb7, false) <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 e182 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.e(str, str3);
                android.graphics.BitmapFactory.Options n072 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
                e182.f264277p = n072.outWidth;
                e182.f264278q = n072.outHeight;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416) e182).f264284w = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str);
                java.lang.String str42 = e182.f264269e;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(e182);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "now filepath is : %s, local id is : %s", str, str42);
                this.f266889f.add(str42);
            }
            str = sb7;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 e1822 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.e(str, str3);
            android.graphics.BitmapFactory.Options n0722 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
            e1822.f264277p = n0722.outWidth;
            e1822.f264278q = n0722.outHeight;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416) e1822).f264284w = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str);
            java.lang.String str422 = e1822.f264269e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(e1822);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "now filepath is : %s, local id is : %s", str, str422);
            this.f266889f.add(str422);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.p3(this));
    }
}
