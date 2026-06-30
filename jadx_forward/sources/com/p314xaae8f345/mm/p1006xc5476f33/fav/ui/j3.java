package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes5.dex */
public class j3 implements x51.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f182727a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f182728b;

    /* renamed from: c, reason: collision with root package name */
    public final int f182729c;

    /* renamed from: d, reason: collision with root package name */
    public final int f182730d;

    public j3(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f182727a = str;
        this.f182728b = str2;
        this.f182729c = i17;
        this.f182730d = i18;
    }

    @Override // x51.o0
    public boolean a() {
        return true;
    }

    @Override // x51.o0
    public x51.n0 b() {
        return null;
    }

    @Override // x51.o0
    public java.lang.String c() {
        return this.f182727a;
    }

    @Override // x51.o0
    public java.lang.String d() {
        return this.f182727a;
    }

    @Override // x51.o0
    public android.graphics.Bitmap e() {
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bkt));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavGetPicStrategy", "getNoSDCardBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/fav/ui/FavGetPicStrategy", "getNoSDCardBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        return decodeResource;
    }

    @Override // x51.o0
    public void f() {
    }

    @Override // x51.o0
    public java.lang.String g() {
        return this.f182728b;
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
        return o72.x1.I() + kk.k.g(this.f182728b.getBytes());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        if (r3 == null) goto L40;
     */
    @Override // x51.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap l(android.graphics.Bitmap r10, x51.m0 r11, java.lang.String r12) {
        /*
            r9 = this;
            java.lang.String r12 = ""
            java.lang.String r0 = "MicroMsg.FavGetPicStrategy"
            x51.m0 r1 = x51.m0.NET
            if (r1 != r11) goto L9d
            r11 = 0
            java.lang.String r1 = o72.x1.I()     // Catch: java.io.IOException -> L97
            com.tencent.mm.vfs.z7 r1 = com.p314xaae8f345.mm.vfs.z7.a(r1)     // Catch: java.io.IOException -> L97
            java.lang.String r2 = r1.f294812f
            if (r2 == 0) goto L2e
            java.lang.String r6 = com.p314xaae8f345.mm.vfs.e8.l(r2, r11, r11)     // Catch: java.io.IOException -> L97
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L97
            if (r2 != 0) goto L2e
            com.tencent.mm.vfs.z7 r2 = new com.tencent.mm.vfs.z7     // Catch: java.io.IOException -> L97
            java.lang.String r4 = r1.f294810d     // Catch: java.io.IOException -> L97
            java.lang.String r5 = r1.f294811e     // Catch: java.io.IOException -> L97
            java.lang.String r7 = r1.f294813g     // Catch: java.io.IOException -> L97
            java.lang.String r8 = r1.f294814h     // Catch: java.io.IOException -> L97
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L97
            r1 = r2
        L2e:
            com.tencent.mm.vfs.b3 r2 = com.p314xaae8f345.mm.vfs.a3.f294314a     // Catch: java.io.IOException -> L97
            r3 = 0
            com.tencent.mm.vfs.z2 r2 = r2.m(r1, r3)     // Catch: java.io.IOException -> L97
            boolean r4 = r2.a()     // Catch: java.io.IOException -> L97
            if (r4 != 0) goto L3d
            r4 = r11
            goto L45
        L3d:
            com.tencent.mm.vfs.q2 r4 = r2.f294799a     // Catch: java.io.IOException -> L97
            java.lang.String r5 = r2.f294800b     // Catch: java.io.IOException -> L97
            boolean r4 = r4.F(r5)     // Catch: java.io.IOException -> L97
        L45:
            if (r4 != 0) goto L5b
            com.tencent.mm.vfs.b3 r4 = com.p314xaae8f345.mm.vfs.a3.f294314a     // Catch: java.io.IOException -> L97
            com.tencent.mm.vfs.z2 r1 = r4.m(r1, r2)     // Catch: java.io.IOException -> L97
            boolean r2 = r1.a()     // Catch: java.io.IOException -> L97
            if (r2 != 0) goto L54
            goto L5b
        L54:
            com.tencent.mm.vfs.q2 r2 = r1.f294799a     // Catch: java.io.IOException -> L97
            java.lang.String r1 = r1.f294800b     // Catch: java.io.IOException -> L97
            r2.r(r1)     // Catch: java.io.IOException -> L97
        L5b:
            int r1 = r9.f182729c     // Catch: java.io.IOException -> L97
            if (r1 <= 0) goto L68
            int r2 = r9.f182730d     // Catch: java.io.IOException -> L97
            if (r2 <= 0) goto L68
            r4 = 1
            android.graphics.Bitmap r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(r10, r1, r2, r4)     // Catch: java.io.IOException -> L97
        L68:
            java.lang.String r1 = r9.k()     // Catch: java.io.IOException -> L97
            com.tencent.mm.vfs.r6 r2 = new com.tencent.mm.vfs.r6     // Catch: java.io.IOException -> L97
            r2.<init>(r1)     // Catch: java.io.IOException -> L97
            r2.k()     // Catch: java.io.IOException -> L97
            java.io.OutputStream r3 = com.p314xaae8f345.mm.vfs.w6.H(r2)     // Catch: java.lang.Throwable -> L86 java.io.FileNotFoundException -> L88
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L86 java.io.FileNotFoundException -> L88
            r2 = 100
            r10.compress(r1, r2, r3)     // Catch: java.lang.Throwable -> L86 java.io.FileNotFoundException -> L88
            r3.flush()     // Catch: java.lang.Throwable -> L86 java.io.FileNotFoundException -> L88
        L82:
            r3.close()     // Catch: java.io.IOException -> L97
            goto L9d
        L86:
            r1 = move-exception
            goto L91
        L88:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L86
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r1, r12, r2)     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L9d
            goto L82
        L91:
            if (r3 == 0) goto L96
            r3.close()     // Catch: java.io.IOException -> L97
        L96:
            throw r1     // Catch: java.io.IOException -> L97
        L97:
            r1 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r11]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r1, r12, r11)
        L9d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j3.l(android.graphics.Bitmap, x51.m0, java.lang.String):android.graphics.Bitmap");
    }
}
