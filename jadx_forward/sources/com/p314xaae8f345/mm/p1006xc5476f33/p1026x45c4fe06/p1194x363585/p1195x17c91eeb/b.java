package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb;

@mk0.a
/* loaded from: classes7.dex */
class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8834xb9724478(java.lang.Object r13, com.p314xaae8f345.mm.p794xb0fa9b5e.r r14) {
        /*
            r12 = this;
            com.tencent.mm.ipcinvoker.type.IPCString r13 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) r13
            r0 = 0
            java.lang.String r1 = "MicroMsg.AppBrand.AppBrandCheckDemoIPCTask"
            if (r13 == 0) goto Lcf
            java.lang.String r2 = r13.f149939d
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            if (r2 != 0) goto Lcf
            java.lang.String r2 = r13.f149939d
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "CheckDemoTask invoke appId:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3, r2)
            com.tencent.mm.plugin.appbrand.task.checkdemo.d r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ai()
            if (r2 != 0) goto L2f
            java.lang.String r13 = "CheckDemoTask invoke storage null!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r13)
            com.tencent.mm.ipcinvoker.type.IPCBoolean r13 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r13.<init>(r0)
            r14.a(r13)
            goto Ldc
        L2f:
            java.lang.String r3 = r13.f149939d
            java.lang.String r4 = "MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage"
            r5 = 2
            r6 = 1
            com.tencent.mm.plugin.appbrand.task.checkdemo.c r7 = new com.tencent.mm.plugin.appbrand.task.checkdemo.c     // Catch: java.lang.Exception -> L6b
            r7.<init>()     // Catch: java.lang.Exception -> L6b
            r7.f69054x28d45f97 = r3     // Catch: java.lang.Exception -> L6b
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L6b
            boolean r2 = r2.get(r7, r8)     // Catch: java.lang.Exception -> L6b
            if (r2 == 0) goto L75
            java.lang.String r2 = "found info with appId(%s) versiontime(%d)"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L6b
            r8[r0] = r3     // Catch: java.lang.Exception -> L6b
            long r9 = r7.f69056x94e09be0     // Catch: java.lang.Exception -> L6b
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Exception -> L6b
            r8[r6] = r9     // Catch: java.lang.Exception -> L6b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2, r8)     // Catch: java.lang.Exception -> L6b
            long r8 = r7.f69056x94e09be0     // Catch: java.lang.Exception -> L6b
            long r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(r8)     // Catch: java.lang.Exception -> L6b
            r10 = 86400(0x15180, double:4.26873E-319)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L63
            goto L75
        L63:
            boolean r2 = r7.f69055x5a3d3237     // Catch: java.lang.Exception -> L6b
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r2, r7, r3)
        L75:
            r2 = r0
        L76:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "CheckDemoTask invoke permissionDemo:%d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4, r3)
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
            java.lang.String r3 = r13.f149939d
            r2.f457233d = r3
            r3 = 0
            r2.f457234e = r3
            r2.f457235f = r3
            r0.f152197a = r2
            r45.i00 r2 = new r45.i00
            r2.<init>()
            r0.f152198b = r2
            java.lang.String r2 = "/cgi-bin/mmbiz-bin/wxaapp/checkdemoinfo"
            r0.f152199c = r2
            r2 = 1124(0x464, float:1.575E-42)
            r0.f152200d = r2
            java.lang.String r2 = "CheckDemoTask request"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            com.tencent.mm.modelbase.o r0 = r0.a()
            com.tencent.mm.plugin.appbrand.task.checkdemo.a r1 = new com.tencent.mm.plugin.appbrand.task.checkdemo.a
            r1.<init>(r12, r14, r13)
            com.p314xaae8f345.mm.p944x882e457a.z2.d(r0, r1, r6)
            goto Ldc
        Lcf:
            java.lang.String r13 = "CheckDemoTask callback error invalid appid "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r13)
            com.tencent.mm.ipcinvoker.type.IPCBoolean r13 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r13.<init>(r0)
            r14.a(r13)
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb.b.mo8834xb9724478(java.lang.Object, com.tencent.mm.ipcinvoker.r):void");
    }
}
