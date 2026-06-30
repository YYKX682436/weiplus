package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes8.dex */
public final class d8 implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication$NavigateBackAppArgs, com.tencent.mm.ipcinvoker.type.IPCBoolean> {
    public final boolean a(android.os.Bundle bundle, com.tencent.mm.opensdk.modelbase.BaseResp baseResp, com.tencent.mm.pluginsdk.model.app.m mVar) {
        baseResp.toBundle(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = mVar.field_packageName;
        args.bundle = bundle;
        args.flags = 268435456;
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        return com.tencent.mm.opensdk.channel.MMessageActV2.send(com.tencent.mm.sdk.platformtools.x2.f193071a, args);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ipcinvoker.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.Object r7, com.tencent.mm.ipcinvoker.r r8) {
        /*
            r6 = this;
            com.tencent.mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication$NavigateBackAppArgs r7 = (com.tencent.mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication$NavigateBackAppArgs) r7
            if (r7 != 0) goto L5
            goto L45
        L5:
            java.lang.Class<lt.i0> r0 = lt.i0.class
            i95.m r1 = i95.n0.c(r0)
            lt.i0 r1 = (lt.i0) r1
            kt.c r1 = (kt.c) r1
            r1.getClass()
            java.lang.String r1 = r7.f78563d
            r2 = 1
            com.tencent.mm.pluginsdk.model.app.m r3 = com.tencent.mm.pluginsdk.model.app.w.j(r1, r2, r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r4 = "NavigateBackAppTask appid %s"
            java.lang.String r5 = "MicroMsg.JsApiNavigateBackApplication"
            com.tencent.mars.xlog.Log.i(r5, r4, r1)
            if (r3 != 0) goto L2c
            java.lang.String r7 = "NavigateBackAppTask appinfo is null"
            com.tencent.mars.xlog.Log.w(r5, r7)
            goto L45
        L2c:
            i95.m r0 = i95.n0.c(r0)
            lt.i0 r0 = (lt.i0) r0
            kt.c r0 = (kt.c) r0
            r0.getClass()
            java.lang.String r0 = r3.field_packageName
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            r0 = r0 ^ r2
            if (r0 != 0) goto L47
            java.lang.String r7 = "NavigateBackAppTask packageName invalid"
            com.tencent.mars.xlog.Log.e(r5, r7)
        L45:
            r7 = 0
            goto L7f
        L47:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r7.f78565f
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            java.lang.String r4 = r7.f78564e
            if (r2 == 0) goto L66
            com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Resp r7 = new com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Resp
            r7.<init>(r0)
            r7.extMsg = r4
            java.lang.String r1 = r3.field_openId
            r7.openId = r1
            boolean r7 = r6.a(r0, r7, r3)
            goto L7f
        L66:
            com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Resp r2 = new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Resp
            r2.<init>(r0)
            r2.extMsg = r4
            java.lang.String r4 = r3.field_openId
            r2.openId = r4
            int r7 = r7.f78566g
            r2.errCode = r7
            r2.businessType = r1
            java.lang.String r7 = com.tencent.mm.pluginsdk.ui.tools.n5.f191793a
            r2.transaction = r7
            boolean r7 = r6.a(r0, r2, r3)
        L7f:
            if (r8 == 0) goto L89
            com.tencent.mm.ipcinvoker.type.IPCBoolean r0 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r0.<init>(r7)
            r8.a(r0)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.d8.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.r):void");
    }
}
