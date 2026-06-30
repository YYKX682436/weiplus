package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b;

/* loaded from: classes13.dex */
public class i extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f225804e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.h.H, "LiteAppBaselibInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f225805d;

    public i(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.h.H, "LiteAppBaselibInfo", null);
        this.f225805d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        this.f225805d.l("LiteAppBaselibInfo", com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.f14321xe52ffe12, ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.h) f0Var).mo9763xeb27878e());
        return true;
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo11260x413cb2b4(l75.f0 f0Var) {
        this.f225805d.m("LiteAppBaselibInfo", com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.f14321xe52ffe12, ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.h) f0Var).mo9763xeb27878e());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.h y0() {
        /*
            r9 = this;
            java.lang.String r0 = "LiteAppBaselibInfo"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "select * from %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            r3 = 1
            r4 = 0
            l75.k0 r5 = r9.f225805d     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r6 = 2
            android.database.Cursor r0 = r5.f(r0, r2, r6)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            if (r2 == 0) goto L3c
            r2 = r3
        L1f:
            com.tencent.mm.plugin.lite.storage.h r5 = new com.tencent.mm.plugin.lite.storage.h     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r5.<init>()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r5.mo9015xbf5d97fd(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.lang.String r6 = r5.f37413xe7ff7c04     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            if (r6 < r2) goto L36
            java.lang.String r2 = r5.f37413xe7ff7c04     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r4 = r5
        L36:
            boolean r5 = r0.moveToNext()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            if (r5 != 0) goto L1f
        L3c:
            r0.close()
            goto L63
        L40:
            r1 = move-exception
            r4 = r0
            goto L68
        L43:
            r2 = move-exception
            r8 = r4
            r4 = r0
            r0 = r8
            goto L4c
        L48:
            r1 = move-exception
            goto L68
        L4a:
            r2 = move-exception
            r0 = r4
        L4c:
            java.lang.String r5 = "MicroMsg.LiteAppBaselibInfoStorage"
            java.lang.String r6 = "getLatestLiteAppBaselibInfo failed. :%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L48
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r2)     // Catch: java.lang.Throwable -> L66
            r3[r1] = r2     // Catch: java.lang.Throwable -> L48
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r6, r3)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L62
            r4.close()
        L62:
            r4 = r0
        L63:
            return r4
        L64:
            r1 = r0
            goto L68
        L66:
            r0 = move-exception
            goto L64
        L68:
            if (r4 == 0) goto L6d
            r4.close()
        L6d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.i.y0():com.tencent.mm.plugin.lite.storage.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r9 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r9 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.h z0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "LiteAppBaselibInfo"
            java.lang.String r2 = "majorVersion"
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r2, r9}
            java.lang.String r1 = "select * from %s where %s='%s'"
            java.lang.String r9 = java.lang.String.format(r1, r9)
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            l75.k0 r3 = r8.f225805d     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3d
            r4 = 2
            android.database.Cursor r9 = r3.f(r9, r2, r4)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3d
            if (r9 == 0) goto L32
            boolean r2 = r9.moveToFirst()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L55
            if (r2 == 0) goto L32
            com.tencent.mm.plugin.lite.storage.h r2 = new com.tencent.mm.plugin.lite.storage.h     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L55
            r2.mo9015xbf5d97fd(r9)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L55
            r9.close()
            return r2
        L30:
            r2 = move-exception
            goto L3f
        L32:
            if (r9 == 0) goto L54
        L34:
            r9.close()
            goto L54
        L38:
            r9 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L56
        L3d:
            r2 = move-exception
            r9 = r0
        L3f:
            java.lang.String r3 = "MicroMsg.LiteAppBaselibInfoStorage"
            java.lang.String r4 = "getLiteAppBaselibInfo failed. :%s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L55
            boolean r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r2)     // Catch: java.lang.Throwable -> L55
            r5[r1] = r2     // Catch: java.lang.Throwable -> L55
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r4, r5)     // Catch: java.lang.Throwable -> L55
            if (r9 == 0) goto L54
            goto L34
        L54:
            return r0
        L55:
            r0 = move-exception
        L56:
            if (r9 == 0) goto L5b
            r9.close()
        L5b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.i.z0(java.lang.String):com.tencent.mm.plugin.lite.storage.h");
    }
}
