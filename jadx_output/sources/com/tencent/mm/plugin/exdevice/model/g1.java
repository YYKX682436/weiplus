package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes.dex */
public class g1 implements com.tencent.mm.plugin.exdevice.model.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.j1 f98907a;

    public g1(com.tencent.mm.plugin.exdevice.model.j1 j1Var) {
        this.f98907a = j1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // com.tencent.mm.plugin.exdevice.model.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r9, java.lang.Object... r10) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.exdevice.ExdeviceWCLanSDKUtil"
            r1 = 13
            if (r9 != r1) goto L89
            if (r10 == 0) goto L89
            int r9 = r10.length
            r1 = 2
            if (r9 < r1) goto L89
            r9 = 0
            r2 = r10[r9]
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L89
            r3 = 1
            r10 = r10[r3]
            boolean r4 = r10 instanceof java.lang.Integer
            if (r4 != 0) goto L1b
            goto L89
        L1b:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r4 = 0
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L3d
            r5.<init>(r2)     // Catch: java.lang.Exception -> L3d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3d
            r2.<init>(r5)     // Catch: java.lang.Exception -> L3d
            java.lang.String r5 = "deviceId"
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Exception -> L3d
            java.lang.String r6 = "deviceType"
            java.lang.String r4 = r2.getString(r6)     // Catch: java.lang.Exception -> L3b
            goto L4b
        L3b:
            r2 = move-exception
            goto L3f
        L3d:
            r2 = move-exception
            r5 = r4
        L3f:
            java.lang.String r6 = ""
            java.lang.Object[] r7 = new java.lang.Object[r9]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r2, r6, r7)
            java.lang.String r2 = "JSON decode failed in device ConnState notify callback"
            com.tencent.mars.xlog.Log.e(r0, r2)
        L4b:
            com.tencent.mm.plugin.exdevice.model.j1 r2 = r8.f98907a
            if (r10 == r3) goto L5e
            r2.f98941m = r9
            java.util.HashMap r9 = r2.f98934f
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r9.put(r5, r10)
            java.lang.String r9 = "device disconnect!"
            com.tencent.mars.xlog.Log.i(r0, r9)
            goto L6c
        L5e:
            r2.f98941m = r1
            java.util.HashMap r9 = r2.f98934f
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r9.put(r5, r10)
            java.lang.String r9 = "device connect!"
            com.tencent.mars.xlog.Log.i(r0, r9)
        L6c:
            boolean r9 = r2.f98940l
            if (r9 == 0) goto L89
            int r9 = r2.f98941m
            if (r9 != r1) goto L77
            r2.a(r3, r5)
        L77:
            com.tencent.mm.autogen.events.ExDeviceLanDeviceConnectStateEvent r9 = new com.tencent.mm.autogen.events.ExDeviceLanDeviceConnectStateEvent
            r9.<init>()
            am.f6 r10 = r9.f54145g
            r10.f6639a = r5
            int r0 = r2.f98941m
            r10.f6640b = r0
            r10.f6641c = r4
            r9.e()
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.model.g1.a(int, java.lang.Object[]):void");
    }
}
