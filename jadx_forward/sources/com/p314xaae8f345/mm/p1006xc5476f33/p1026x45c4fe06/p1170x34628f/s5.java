package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public abstract class s5 {

    /* renamed from: a, reason: collision with root package name */
    public static final l01.v f168612a = new l01.n();

    /* renamed from: b, reason: collision with root package name */
    public static final ik1.x f168613b = new ik1.x();

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        java.util.Set<java.lang.String> g17;
        if (c11510xdd90c2f2 == null || (g17 = f168613b.g(c11510xdd90c2f2)) == null) {
            return;
        }
        for (java.lang.String str : g17) {
            l01.n nVar = (l01.n) f168612a;
            synchronized (nVar.f396314a) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) nVar.f396314a).m77803xc84af884(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (r5 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 r5, java.lang.String r6) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.h(r6)
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r5.hashCode()
            int r2 = r2 + 35
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            ik1.x r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s5.f168613b
            r2.e(r5, r1)
            l01.v r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s5.f168612a
            r3 = r2
            l01.n r3 = (l01.n) r3
            android.graphics.Bitmap r3 = r3.a(r1)
            if (r3 == 0) goto L3b
            boolean r4 = r3.isRecycled()
            if (r4 != 0) goto L3b
            return r3
        L3b:
            java.io.InputStream r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.q(r5, r6)
            if (r5 == 0) goto L7a
            int r6 = r5.available()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            if (r6 > 0) goto L48
            goto L7a
        L48:
            android.graphics.Bitmap r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.O(r5)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            if (r6 == 0) goto L5d
            boolean r3 = r6.isRecycled()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            if (r3 != 0) goto L5d
            l01.n r2 = (l01.n) r2     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            r2.b(r1, r6)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r5)
            return r6
        L5d:
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r5)
            goto L73
        L61:
            r6 = move-exception
            goto L74
        L63:
            r6 = move-exception
            java.lang.String r1 = "MicroMsg.AppBrandPageIconCache"
            java.lang.String r2 = "try decode icon e = %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L61
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2, r6)     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L73
            goto L5d
        L73:
            return r0
        L74:
            if (r5 == 0) goto L79
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r5)
        L79:
            throw r6
        L7a:
            if (r5 == 0) goto L7f
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r5)
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s5.b(com.tencent.mm.plugin.appbrand.AppBrandRuntime, java.lang.String):android.graphics.Bitmap");
    }
}
