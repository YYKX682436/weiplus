package com.tencent.mm.plugin.appbrand.app;

@j95.b
/* loaded from: classes7.dex */
public class BSPatchJNIWrapper extends i95.w implements com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService {
    public static volatile java.lang.Boolean sForceUseWeAppCoreImpl;
    private final bm5.x0 legacyImpl = new bm5.x0(new com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper$$b());
    private final bm5.x0 weAppCoreImpl = new bm5.x0(new bm5.w0() { // from class: com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper$$c
        @Override // bm5.w0
        public final java.lang.Object a() {
            com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService lambda$new$1;
            lambda$new$1 = com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper.this.lambda$new$1();
            return lambda$new$1;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService lambda$new$0() {
        com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper.class.getClassLoader();
        fp.d0.n("appbrandcommon");
        return new com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper$$a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService lambda$new$1() {
        sk1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        final com.tencent.mm.weapp_core.BSPatchUtil bSPatchUtil = new com.tencent.mm.weapp_core.BSPatchUtil();
        return new com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService() { // from class: com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper.1
            @Override // com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService
            public int bspatch(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                com.tencent.mm.weapp_core.BSPatchUtil bSPatchUtil2 = bSPatchUtil;
                java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, false);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (i17 == null) {
                    i17 = "";
                }
                java.lang.String i18 = com.tencent.mm.vfs.w6.i(str3, false);
                if (i18 == null) {
                    i18 = "";
                }
                java.lang.String i19 = com.tencent.mm.vfs.w6.i(str2, true);
                return bSPatchUtil2.bspatch(i17, i18, i19 != null ? i19 : "").f439090d;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    @Override // com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int bspatch(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.Boolean r0 = com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper.sForceUseWeAppCoreImpl
            if (r0 == 0) goto L13
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z.f193105a
            boolean r0 = z65.c.a()
            if (r0 == 0) goto L13
            java.lang.Boolean r0 = com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper.sForceUseWeAppCoreImpl
            boolean r0 = r0.booleanValue()
            goto L2c
        L13:
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r1 = e42.d0.clicfg_android_use_weapp_core_bspatch
            h62.d r0 = (h62.d) r0
            r2 = 1
            java.lang.String r3 = ""
            java.lang.String r0 = r0.Zi(r1, r3, r2)
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
        L2c:
            if (r0 == 0) goto L3b
            bm5.x0 r0 = r4.weAppCoreImpl
            java.lang.Object r0 = r0.b()
            com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService r0 = (com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService) r0
            int r5 = r0.bspatch(r5, r6, r7)
            goto L47
        L3b:
            bm5.x0 r0 = r4.legacyImpl
            java.lang.Object r0 = r0.b()
            com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService r0 = (com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService) r0
            int r5 = r0.bspatch(r5, r6, r7)
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper.bspatch(java.lang.String, java.lang.String, java.lang.String):int");
    }
}
