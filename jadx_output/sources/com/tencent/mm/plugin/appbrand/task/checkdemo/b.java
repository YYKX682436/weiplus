package com.tencent.mm.plugin.appbrand.task.checkdemo;

@mk0.a
/* loaded from: classes7.dex */
class b implements com.tencent.mm.ipcinvoker.j {
    private b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    @Override // com.tencent.mm.ipcinvoker.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.Object r13, com.tencent.mm.ipcinvoker.r r14) {
        /*
            r12 = this;
            com.tencent.mm.ipcinvoker.type.IPCString r13 = (com.tencent.mm.ipcinvoker.type.IPCString) r13
            r0 = 0
            java.lang.String r1 = "MicroMsg.AppBrand.AppBrandCheckDemoIPCTask"
            if (r13 == 0) goto Lcf
            java.lang.String r2 = r13.f68406d
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r2 != 0) goto Lcf
            java.lang.String r2 = r13.f68406d
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "CheckDemoTask invoke appId:%s"
            com.tencent.mars.xlog.Log.i(r1, r3, r2)
            com.tencent.mm.plugin.appbrand.task.checkdemo.d r2 = com.tencent.mm.plugin.appbrand.app.r9.Ai()
            if (r2 != 0) goto L2f
            java.lang.String r13 = "CheckDemoTask invoke storage null!"
            com.tencent.mars.xlog.Log.i(r1, r13)
            com.tencent.mm.ipcinvoker.type.IPCBoolean r13 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r13.<init>(r0)
            r14.a(r13)
            goto Ldc
        L2f:
            java.lang.String r3 = r13.f68406d
            java.lang.String r4 = "MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage"
            r5 = 2
            r6 = 1
            com.tencent.mm.plugin.appbrand.task.checkdemo.c r7 = new com.tencent.mm.plugin.appbrand.task.checkdemo.c     // Catch: java.lang.Exception -> L6b
            r7.<init>()     // Catch: java.lang.Exception -> L6b
            r7.field_appId = r3     // Catch: java.lang.Exception -> L6b
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L6b
            boolean r2 = r2.get(r7, r8)     // Catch: java.lang.Exception -> L6b
            if (r2 == 0) goto L75
            java.lang.String r2 = "found info with appId(%s) versiontime(%d)"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L6b
            r8[r0] = r3     // Catch: java.lang.Exception -> L6b
            long r9 = r7.field_versiontime     // Catch: java.lang.Exception -> L6b
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Exception -> L6b
            r8[r6] = r9     // Catch: java.lang.Exception -> L6b
            com.tencent.mars.xlog.Log.i(r4, r2, r8)     // Catch: java.lang.Exception -> L6b
            long r8 = r7.field_versiontime     // Catch: java.lang.Exception -> L6b
            long r8 = com.tencent.mm.sdk.platformtools.t8.H1(r8)     // Catch: java.lang.Exception -> L6b
            r10 = 86400(0x15180, double:4.26873E-319)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L63
            goto L75
        L63:
            boolean r2 = r7.field_permissionDemo     // Catch: java.lang.Exception -> L6b
            if (r2 == 0) goto L69
            r2 = r5
            goto L76
        L69:
            r2 = r6
            goto L76
        L6b:
            r2 = move-exception
            java.lang.String r7 = "get with appId(%s)"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r2, r7, r3)
        L75:
            r2 = r0
        L76:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "CheckDemoTask invoke permissionDemo:%d"
            com.tencent.mars.xlog.Log.i(r1, r4, r3)
            if (r2 == 0) goto L99
            if (r2 != r5) goto L90
            com.tencent.mm.ipcinvoker.type.IPCBoolean r13 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r13.<init>(r6)
            r14.a(r13)
            goto Ldc
        L90:
            com.tencent.mm.ipcinvoker.type.IPCBoolean r13 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r13.<init>(r0)
            r14.a(r13)
            goto Ldc
        L99:
            com.tencent.mm.modelbase.l r0 = new com.tencent.mm.modelbase.l
            r0.<init>()
            r45.h00 r2 = new r45.h00
            r2.<init>()
            java.lang.String r3 = r13.f68406d
            r2.f375700d = r3
            r3 = 0
            r2.f375701e = r3
            r2.f375702f = r3
            r0.f70664a = r2
            r45.i00 r2 = new r45.i00
            r2.<init>()
            r0.f70665b = r2
            java.lang.String r2 = "/cgi-bin/mmbiz-bin/wxaapp/checkdemoinfo"
            r0.f70666c = r2
            r2 = 1124(0x464, float:1.575E-42)
            r0.f70667d = r2
            java.lang.String r2 = "CheckDemoTask request"
            com.tencent.mars.xlog.Log.i(r1, r2)
            com.tencent.mm.modelbase.o r0 = r0.a()
            com.tencent.mm.plugin.appbrand.task.checkdemo.a r1 = new com.tencent.mm.plugin.appbrand.task.checkdemo.a
            r1.<init>(r12, r14, r13)
            com.tencent.mm.modelbase.z2.d(r0, r1, r6)
            goto Ldc
        Lcf:
            java.lang.String r13 = "CheckDemoTask callback error invalid appid "
            com.tencent.mars.xlog.Log.i(r1, r13)
            com.tencent.mm.ipcinvoker.type.IPCBoolean r13 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r13.<init>(r0)
            r14.a(r13)
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.task.checkdemo.b.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.r):void");
    }
}
