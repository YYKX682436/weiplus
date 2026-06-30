package com.tencent.mm.plugin.appbrand.app;

@j95.b
/* loaded from: classes7.dex */
public class ZstdJNIWrapper extends i95.w {
    private static final java.lang.String TAG = "MicroMsg.AppBrand.ZstdJNIWrapper";
    public static volatile java.lang.Boolean sForceUseWeAppCoreImpl;
    private final bm5.x0 weAppCoreImpl = new bm5.x0(new com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$$a());

    /* loaded from: classes6.dex */
    public enum DecompressResult {
        FAILED,
        SUCCESS_DECOMPRESS_ONLY,
        SUCCESS_VERIFIED
    }

    private boolean decompressWithMars(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i(TAG, "decompressWithMars, input=%s", str);
        return com.tencent.mm.plugin.appbrand.appcache.gc.a(str, str2);
    }

    private boolean decompressWithWeAppCore(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i(TAG, "decompressWithWeAppCore, input=%s", str);
        com.tencent.mm.weapp_core.ZstdUtil zstdUtil = (com.tencent.mm.weapp_core.ZstdUtil) this.weAppCoreImpl.b();
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i17 == null) {
            i17 = "";
        }
        java.lang.String i18 = com.tencent.mm.vfs.w6.i(str2, true);
        if (i18 == null) {
            i18 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        vp5.l decompress = zstdUtil.decompress(i17, i18, str3, str4);
        if (decompress == vp5.l.f439126f) {
            return true;
        }
        com.tencent.mars.xlog.Log.e(TAG, "decompressWithWeAppCore failed, result=%s, input=%s", decompress.name(), str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.tencent.mm.weapp_core.ZstdUtil lambda$new$0() {
        sk1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        return new com.tencent.mm.weapp_core.ZstdUtil();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper.DecompressResult decompress(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            java.lang.Boolean r0 = com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper.sForceUseWeAppCoreImpl
            r1 = 1
            if (r0 == 0) goto L14
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z.f193105a
            boolean r0 = z65.c.a()
            if (r0 == 0) goto L14
            java.lang.Boolean r0 = com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper.sForceUseWeAppCoreImpl
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
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r0 == 0) goto L3c
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r8)
            if (r0 != 0) goto L3b
            goto L3c
        L3b:
            r1 = 0
        L3c:
            boolean r5 = r4.decompressWithWeAppCore(r5, r6, r7, r8)
            if (r5 == 0) goto L4a
            if (r1 == 0) goto L47
            com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$DecompressResult r5 = com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper.DecompressResult.SUCCESS_VERIFIED
            goto L49
        L47:
            com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$DecompressResult r5 = com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper.DecompressResult.SUCCESS_DECOMPRESS_ONLY
        L49:
            return r5
        L4a:
            com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$DecompressResult r5 = com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper.DecompressResult.FAILED
            return r5
        L4d:
            boolean r5 = r4.decompressWithMars(r5, r6)
            if (r5 == 0) goto L56
            com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$DecompressResult r5 = com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper.DecompressResult.SUCCESS_DECOMPRESS_ONLY
            return r5
        L56:
            com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$DecompressResult r5 = com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper.DecompressResult.FAILED
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper.decompress(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.tencent.mm.plugin.appbrand.app.ZstdJNIWrapper$DecompressResult");
    }
}
