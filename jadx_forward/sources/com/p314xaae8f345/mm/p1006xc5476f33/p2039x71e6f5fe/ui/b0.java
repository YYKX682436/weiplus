package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes5.dex */
public final class b0 implements x51.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f241039a;

    public b0(java.lang.String str) {
        this.f241039a = null;
        this.f241039a = str;
    }

    @Override // x51.o0
    public boolean a() {
        return false;
    }

    @Override // x51.o0
    public x51.n0 b() {
        return null;
    }

    @Override // x51.o0
    public java.lang.String c() {
        return this.f241039a;
    }

    @Override // x51.o0
    public java.lang.String d() {
        return this.f241039a;
    }

    @Override // x51.o0
    public android.graphics.Bitmap e() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null) {
            return null;
        }
        android.content.res.Resources resources = context.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bkr));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ProductGridPreference$GetPicStrategy", "getNoSDCardBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/scanner/ui/ProductGridPreference$GetPicStrategy", "getNoSDCardBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        return decodeResource;
    }

    @Override // x51.o0
    public void f() {
    }

    @Override // x51.o0
    public java.lang.String g() {
        return this.f241039a;
    }

    @Override // x51.o0
    public void h(x51.m0 m0Var, java.lang.String str) {
    }

    @Override // x51.o0
    public boolean i() {
        return false;
    }

    @Override // x51.o0
    public void j(java.lang.String str, boolean z17) {
    }

    @Override // x51.o0
    public java.lang.String k() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().Di(this.f241039a, "@S");
    }

    @Override // x51.o0
    public android.graphics.Bitmap l(android.graphics.Bitmap bitmap, x51.m0 m0Var, java.lang.String str) {
        if (x51.m0.NET == m0Var) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, k(), false);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ProductGridPreference", e17, "", new java.lang.Object[0]);
            }
        }
        return bitmap;
    }
}
