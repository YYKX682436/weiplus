package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

@j95.b
/* renamed from: com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper */
/* loaded from: classes7.dex */
public class C11569x4d47b705 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.InterfaceC12580x720b73fe {

    /* renamed from: sForceUseWeAppCoreImpl */
    public static volatile java.lang.Boolean f33410xa79e5403;

    /* renamed from: legacyImpl */
    private final bm5.x0 f33411x148cbd89 = new bm5.x0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11571x2c8bbabd());

    /* renamed from: weAppCoreImpl */
    private final bm5.x0 f33412x5c1eb7f2 = new bm5.x0(new bm5.w0() { // from class: com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper$$c
        @Override // bm5.w0
        public final java.lang.Object a() {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.InterfaceC12580x720b73fe m48869x51ef5f10;
            m48869x51ef5f10 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11569x4d47b705.this.m48869x51ef5f10();
            return m48869x51ef5f10;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.InterfaceC12580x720b73fe m48868x51ef5f0f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11569x4d47b705.class.getClassLoader();
        fp.d0.n("appbrandcommon");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11570x2c8bbabc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$1 */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.InterfaceC12580x720b73fe m48869x51ef5f10() {
        sk1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        final com.p314xaae8f345.mm.p2809x52b77bcb.C22912xef9f0319 c22912xef9f0319 = new com.p314xaae8f345.mm.p2809x52b77bcb.C22912xef9f0319();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.InterfaceC12580x720b73fe() { // from class: com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper.1
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.InterfaceC12580x720b73fe
            /* renamed from: bspatch */
            public int mo48870xab81e97(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                com.p314xaae8f345.mm.p2809x52b77bcb.C22912xef9f0319 c22912xef9f03192 = c22912xef9f0319;
                java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (i17 == null) {
                    i17 = "";
                }
                java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(str3, false);
                if (i18 == null) {
                    i18 = "";
                }
                java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(str2, true);
                return c22912xef9f03192.m83224xab81e97(i17, i18, i19 != null ? i19 : "").f520623d;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.InterfaceC12580x720b73fe
    /* renamed from: bspatch */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo48870xab81e97(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.Boolean r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11569x4d47b705.f33410xa79e5403
            if (r0 == 0) goto L13
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            boolean r0 = z65.c.a()
            if (r0 == 0) goto L13
            java.lang.Boolean r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11569x4d47b705.f33410xa79e5403
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
            bm5.x0 r0 = r4.f33412x5c1eb7f2
            java.lang.Object r0 = r0.b()
            com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.InterfaceC12580x720b73fe) r0
            int r5 = r0.mo48870xab81e97(r5, r6, r7)
            goto L47
        L3b:
            bm5.x0 r0 = r4.f33411x148cbd89
            java.lang.Object r0 = r0.b()
            com.tencent.mm.plugin.appbrand.service.IBSPatchJNIService r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.InterfaceC12580x720b73fe) r0
            int r5 = r0.mo48870xab81e97(r5, r6, r7)
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11569x4d47b705.mo48870xab81e97(java.lang.String, java.lang.String, java.lang.String):int");
    }
}
