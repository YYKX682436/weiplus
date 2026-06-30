package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class v2 {
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:18|19))(2:20|(2:22|23)(3:24|25|(1:27)))|12|(1:14)(1:17)|15))|30|6|7|(0)(0)|12|(0)(0)|15) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.IconAttacher", "attachTo, loadIcon fail since " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[Catch: IOException -> 0x0034, TryCatch #0 {IOException -> 0x0034, blocks: (B:11:0x0030, B:12:0x0078, B:14:0x0084, B:17:0x0088, B:25:0x004c), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088 A[Catch: IOException -> 0x0034, TRY_LEAVE, TryCatch #0 {IOException -> 0x0034, blocks: (B:11:0x0030, B:12:0x0078, B:14:0x0084, B:17:0x0088, B:25:0x004c), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.lang.String r6, android.widget.ImageView r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            boolean r0 = r8 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s2
            if (r0 == 0) goto L13
            r0 = r8
            com.tencent.mm.plugin.appbrand.utils.s2 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s2) r0
            int r1 = r0.f172092g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172092g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.appbrand.utils.s2 r0 = new com.tencent.mm.plugin.appbrand.utils.s2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f172091f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f172092g
            jz5.f0 r3 = jz5.f0.f384359a
            java.lang.String r4 = "MicroMsg.AppBrand.IconAttacher"
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r6 = r0.f172090e
            r7 = r6
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            java.lang.Object r6 = r0.f172089d
            java.lang.String r6 = (java.lang.String) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)     // Catch: java.io.IOException -> L34
            goto L78
        L34:
            r6 = move-exception
            goto L8e
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            if (r7 != 0) goto L49
            java.lang.String r6 = "attachTo, imageView is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r6)
            return r3
        L49:
            r7.setTag(r6)
            r0.f172089d = r6     // Catch: java.io.IOException -> L34
            r0.f172090e = r7     // Catch: java.io.IOException -> L34
            r0.f172092g = r5     // Catch: java.io.IOException -> L34
            kotlinx.coroutines.r r8 = new kotlinx.coroutines.r     // Catch: java.io.IOException -> L34
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)     // Catch: java.io.IOException -> L34
            r8.<init>(r0, r5)     // Catch: java.io.IOException -> L34
            r8.k()     // Catch: java.io.IOException -> L34
            com.tencent.mm.plugin.appbrand.utils.u2 r0 = new com.tencent.mm.plugin.appbrand.utils.u2     // Catch: java.io.IOException -> L34
            r0.<init>(r6, r8)     // Catch: java.io.IOException -> L34
            l01.b r2 = l01.d0.f396294a     // Catch: java.io.IOException -> L34
            r5 = 0
            r2.m(r0, r6, r5)     // Catch: java.io.IOException -> L34
            com.tencent.mm.plugin.appbrand.utils.t2 r2 = new com.tencent.mm.plugin.appbrand.utils.t2     // Catch: java.io.IOException -> L34
            r2.<init>(r0)     // Catch: java.io.IOException -> L34
            r8.m(r2)     // Catch: java.io.IOException -> L34
            java.lang.Object r8 = r8.j()     // Catch: java.io.IOException -> L34
            if (r8 != r1) goto L78
            return r1
        L78:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch: java.io.IOException -> L34
            java.lang.Object r0 = r7.getTag()     // Catch: java.io.IOException -> L34
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r0)     // Catch: java.io.IOException -> L34
            if (r6 == 0) goto L88
            r7.setImageBitmap(r8)     // Catch: java.io.IOException -> L34
            goto L9f
        L88:
            java.lang.String r6 = "attachTo, imageView already reused"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r6)     // Catch: java.io.IOException -> L34
            goto L9f
        L8e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "attachTo, loadIcon fail since "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r6)
        L9f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v2.a(java.lang.String, android.widget.ImageView, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
