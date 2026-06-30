package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class f0 implements com.tencent.mm.plugin.exdevice.model.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI f99451a;

    public f0(com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI exdeviceBindDeviceUI) {
        this.f99451a = exdeviceBindDeviceUI;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.exdevice.model.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r7, java.lang.Object... r8) {
        /*
            r6 = this;
            java.lang.String r0 = "manufacturerData"
            java.lang.String r1 = "MicroMsg.ExdeviceBindDeviceUI"
            r2 = 10
            if (r7 != r2) goto L8f
            if (r8 != 0) goto Ld
            goto L8f
        Ld:
            r7 = 0
            r8 = r8[r7]
            byte[] r8 = (byte[]) r8
            r2 = 0
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L3f
            r3.<init>(r8)     // Catch: java.lang.Exception -> L3f
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3f
            r8.<init>(r3)     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = "deviceInfo"
            org.json.JSONObject r3 = r8.getJSONObject(r3)     // Catch: java.lang.Exception -> L3f
            java.lang.String r4 = "deviceType"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L3f
            java.lang.String r5 = "deviceId"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Exception -> L3c
            boolean r5 = r8.isNull(r0)     // Catch: java.lang.Exception -> L3a
            if (r5 != 0) goto L4e
            java.lang.String r7 = r8.getString(r0)     // Catch: java.lang.Exception -> L3a
            goto L4f
        L3a:
            r8 = move-exception
            goto L42
        L3c:
            r8 = move-exception
            r3 = r2
            goto L42
        L3f:
            r8 = move-exception
            r3 = r2
            r4 = r3
        L42:
            java.lang.String r0 = ""
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r8, r0, r7)
            java.lang.String r7 = "json decode failed: deviceInfo decode"
            com.tencent.mars.xlog.Log.e(r1, r7)
        L4e:
            r7 = r2
        L4f:
            if (r4 == 0) goto L8f
            if (r3 != 0) goto L54
            goto L8f
        L54:
            com.tencent.mm.plugin.exdevice.ui.t0 r8 = new com.tencent.mm.plugin.exdevice.ui.t0
            com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI r0 = r6.f99451a
            r8.<init>(r0, r2)
            com.tencent.mm.plugin.exdevice.ui.p0 r5 = com.tencent.mm.plugin.exdevice.ui.p0.CONNECT_PROTO_TYPE_WIFI
            r8.f99665b = r5
            com.tencent.mm.plugin.exdevice.ui.r0 r5 = new com.tencent.mm.plugin.exdevice.ui.r0
            r5.<init>(r0, r2)
            r8.f99667d = r5
            r5.f99636a = r4
            r5.f99637b = r3
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r0 != 0) goto L85
            byte[] r7 = r7.getBytes()
            r0 = 2
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r0)
            r8.f99672i = r7
            java.lang.String r0 = "device.mManufacturerData: %s"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.tencent.mars.xlog.Log.i(r1, r0, r7)
            goto L87
        L85:
            r8.f99672i = r2
        L87:
            com.tencent.mm.plugin.exdevice.ui.e0 r7 = new com.tencent.mm.plugin.exdevice.ui.e0
            r7.<init>(r6, r8)
            com.tencent.mm.sdk.platformtools.u3.h(r7)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.ui.f0.a(int, java.lang.Object[]):void");
    }
}
