package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes8.dex */
public final class d8 implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11925x45e74649, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c> {
    public final boolean a(android.os.Bundle bundle, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 abstractC11230x9d3d6a61, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        abstractC11230x9d3d6a61.mo48431x792022dd(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = mVar.f67386xa1e9e82c;
        args.f32701xaddf3082 = bundle;
        args.f32703x5cfee87 = 268435456;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        return com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, args);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8834xb9724478(java.lang.Object r7, com.p314xaae8f345.mm.p794xb0fa9b5e.r r8) {
        /*
            r6 = this;
            com.tencent.mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication$NavigateBackAppArgs r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11925x45e74649) r7
            if (r7 != 0) goto L5
            goto L45
        L5:
            java.lang.Class<lt.i0> r0 = lt.i0.class
            i95.m r1 = i95.n0.c(r0)
            lt.i0 r1 = (lt.i0) r1
            kt.c r1 = (kt.c) r1
            r1.getClass()
            java.lang.String r1 = r7.f160096d
            r2 = 1
            com.tencent.mm.pluginsdk.model.app.m r3 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(r1, r2, r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r4 = "NavigateBackAppTask appid %s"
            java.lang.String r5 = "MicroMsg.JsApiNavigateBackApplication"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r4, r1)
            if (r3 != 0) goto L2c
            java.lang.String r7 = "NavigateBackAppTask appinfo is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r5, r7)
            goto L45
        L2c:
            i95.m r0 = i95.n0.c(r0)
            lt.i0 r0 = (lt.i0) r0
            kt.c r0 = (kt.c) r0
            r0.getClass()
            java.lang.String r0 = r3.f67386xa1e9e82c
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            r0 = r0 ^ r2
            if (r0 != 0) goto L47
            java.lang.String r7 = "NavigateBackAppTask packageName invalid"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r7)
        L45:
            r7 = 0
            goto L7f
        L47:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r7.f160098f
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            java.lang.String r4 = r7.f160097e
            if (r2 == 0) goto L66
            com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Resp r7 = new com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Resp
            r7.<init>(r0)
            r7.f32981xb32a65a0 = r4
            java.lang.String r1 = r3.f67384x996f3ea
            r7.f32869xc3c3c505 = r1
            boolean r7 = r6.a(r0, r7, r3)
            goto L7f
        L66:
            com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Resp r2 = new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Resp
            r2.<init>(r0)
            r2.f32999xb32a65a0 = r4
            java.lang.String r4 = r3.f67384x996f3ea
            r2.f32869xc3c3c505 = r4
            int r7 = r7.f160099g
            r2.f32867xa7c470f2 = r7
            r2.f32998xd7e6e31a = r1
            java.lang.String r7 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n5.f273326a
            r2.f32870x7fa0d2de = r7
            boolean r7 = r6.a(r0, r2, r3)
        L7f:
            if (r8 == 0) goto L89
            com.tencent.mm.ipcinvoker.type.IPCBoolean r0 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r0.<init>(r7)
            r8.a(r0)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d8.mo8834xb9724478(java.lang.Object, com.tencent.mm.ipcinvoker.r):void");
    }
}
