package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class u0 implements com.tencent.mm.plugin.exdevice.model.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.z0 f99069a;

    public u0(com.tencent.mm.plugin.exdevice.model.z0 z0Var) {
        this.f99069a = z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    @Override // com.tencent.mm.plugin.exdevice.model.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r7, java.lang.Object... r8) {
        /*
            r6 = this;
            java.lang.String r0 = "profile"
            java.lang.String r1 = "MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice"
            r2 = 14
            if (r7 != r2) goto Le1
            if (r8 == 0) goto Le1
            int r7 = r8.length
            r2 = 1
            if (r7 < r2) goto Le1
            r7 = 0
            r8 = r8[r7]
            boolean r2 = r8 instanceof byte[]
            if (r2 != 0) goto L18
            goto Le1
        L18:
            byte[] r8 = (byte[]) r8
            r2 = 0
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L4d
            r3.<init>(r8)     // Catch: java.lang.Exception -> L4d
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4d
            r8.<init>(r3)     // Catch: java.lang.Exception -> L4d
            java.lang.String r3 = "deviceInfo"
            org.json.JSONObject r3 = r8.getJSONObject(r3)     // Catch: java.lang.Exception -> L4d
            java.lang.String r4 = "deviceType"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L4a
            java.lang.String r5 = "deviceId"
            java.lang.String r2 = r3.getString(r5)     // Catch: java.lang.Exception -> L46
            boolean r5 = r8.isNull(r0)     // Catch: java.lang.Exception -> L46
            if (r5 == 0) goto L3e
            return
        L3e:
            org.json.JSONArray r8 = r8.getJSONArray(r0)     // Catch: java.lang.Exception -> L46
            r8.toString()     // Catch: java.lang.Exception -> L46
            goto L5b
        L46:
            r8 = move-exception
            r0 = r2
            r2 = r4
            goto L50
        L4a:
            r8 = move-exception
            r0 = r2
            goto L50
        L4d:
            r8 = move-exception
            r0 = r2
            r3 = r0
        L50:
            java.lang.String r4 = "JSON decode failed in discover package callback %s"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.tencent.mars.xlog.Log.e(r1, r4, r8)
            r4 = r2
            r2 = r0
        L5b:
            if (r4 == 0) goto L68
            if (r2 == 0) goto L68
            java.lang.String r8 = "discover package deviceType %s, deviceId %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r2}
            com.tencent.mars.xlog.Log.i(r1, r8, r0)
        L68:
            com.tencent.mm.plugin.exdevice.model.z0 r8 = r6.f99069a
            java.util.List r0 = r8.f99134w
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r0 = r0.size()
        L72:
            if (r7 >= r0) goto Le1
            java.util.List r1 = r8.f99134w
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            java.lang.Object r1 = r1.get(r7)
            v32.b r1 = (v32.b) r1
            java.lang.String r1 = r1.field_deviceID
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lde
            java.util.List r1 = r8.f99134w
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            java.lang.Object r1 = r1.get(r7)
            v32.b r1 = (v32.b) r1
            java.lang.String r1 = r1.field_deviceType
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Lde
            java.util.List r1 = r8.f99134w
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            java.lang.Object r1 = r1.get(r7)
            v32.b r1 = (v32.b) r1
            java.lang.String r1 = r1.H
            java.lang.String r5 = "wechat_to_device"
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto Lde
            java.util.List r1 = r8.f99135x
            java.util.List r5 = r8.f99134w
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            java.lang.Object r5 = r5.get(r7)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto Lde
            java.util.HashMap r1 = r8.f99137z
            java.lang.String r5 = r3.toString()
            r1.put(r2, r5)
            java.util.List r1 = r8.f99135x
            java.util.List r5 = r8.f99134w
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            java.lang.Object r5 = r5.get(r7)
            v32.b r5 = (v32.b) r5
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r5)
            java.util.List r1 = r8.f99135x
            com.tencent.mm.plugin.exdevice.model.z0.a(r8, r1)
        Lde:
            int r7 = r7 + 1
            goto L72
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.model.u0.a(int, java.lang.Object[]):void");
    }
}
