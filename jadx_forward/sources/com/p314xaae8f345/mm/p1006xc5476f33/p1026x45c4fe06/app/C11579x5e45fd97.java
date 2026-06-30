package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

@j95.b
/* renamed from: com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper */
/* loaded from: classes7.dex */
public class C11579x5e45fd97 extends i95.w {
    private static final java.lang.String TAG = "MicroMsg.AppBrand.ZstdJNIWrapper";

    /* renamed from: sForceUseWeAppCoreImpl */
    public static volatile java.lang.Boolean f33432xa79e5403;

    /* renamed from: weAppCoreImpl */
    private final bm5.x0 f33433x5c1eb7f2 = new bm5.x0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11580xb2e212ea());

    /* renamed from: com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$DecompressResult */
    /* loaded from: classes6.dex */
    public enum DecompressResult {
        FAILED,
        SUCCESS_DECOMPRESS_ONLY,
        SUCCESS_VERIFIED
    }

    /* renamed from: decompressWithMars */
    private boolean m48905xa12510be(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "decompressWithMars, input=%s", str);
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.gc.a(str, str2);
    }

    /* renamed from: decompressWithWeAppCore */
    private boolean m48906x2b094a69(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "decompressWithWeAppCore, input=%s", str);
        com.p314xaae8f345.mm.p2809x52b77bcb.C22925x14321f2b c22925x14321f2b = (com.p314xaae8f345.mm.p2809x52b77bcb.C22925x14321f2b) this.f33433x5c1eb7f2.b();
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (i17 == null) {
            i17 = "";
        }
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(str2, true);
        if (i18 == null) {
            i18 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        vp5.l m83399xc7f7e6e3 = c22925x14321f2b.m83399xc7f7e6e3(i17, i18, str3, str4);
        if (m83399xc7f7e6e3 == vp5.l.f520659f) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "decompressWithWeAppCore failed, result=%s, input=%s", m83399xc7f7e6e3.name(), str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public static com.p314xaae8f345.mm.p2809x52b77bcb.C22925x14321f2b m48907x51ef5f0f() {
        sk1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        return new com.p314xaae8f345.mm.p2809x52b77bcb.C22925x14321f2b();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /* renamed from: decompress */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11579x5e45fd97.DecompressResult m48908xc7f7e6e3(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            java.lang.Boolean r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11579x5e45fd97.f33432xa79e5403
            r1 = 1
            if (r0 == 0) goto L14
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            boolean r0 = z65.c.a()
            if (r0 == 0) goto L14
            java.lang.Boolean r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11579x5e45fd97.f33432xa79e5403
            boolean r0 = r0.booleanValue()
            goto L2c
        L14:
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r2 = e42.d0.clicfg_android_use_weapp_core_zstd
            h62.d r0 = (h62.d) r0
            java.lang.String r3 = ""
            java.lang.String r0 = r0.Zi(r2, r3, r1)
            java.lang.String r2 = "1"
            boolean r0 = r2.equals(r0)
        L2c:
            if (r0 == 0) goto L4d
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r0 == 0) goto L3c
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            if (r0 != 0) goto L3b
            goto L3c
        L3b:
            r1 = 0
        L3c:
            boolean r5 = r4.m48906x2b094a69(r5, r6, r7, r8)
            if (r5 == 0) goto L4a
            if (r1 == 0) goto L47
            com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$DecompressResult r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11579x5e45fd97.DecompressResult.SUCCESS_VERIFIED
            goto L49
        L47:
            com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$DecompressResult r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11579x5e45fd97.DecompressResult.SUCCESS_DECOMPRESS_ONLY
        L49:
            return r5
        L4a:
            com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$DecompressResult r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11579x5e45fd97.DecompressResult.FAILED
            return r5
        L4d:
            boolean r5 = r4.m48905xa12510be(r5, r6)
            if (r5 == 0) goto L56
            com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$DecompressResult r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11579x5e45fd97.DecompressResult.SUCCESS_DECOMPRESS_ONLY
            return r5
        L56:
            com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$DecompressResult r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11579x5e45fd97.DecompressResult.FAILED
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11579x5e45fd97.m48908xc7f7e6e3(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$DecompressResult");
    }
}
