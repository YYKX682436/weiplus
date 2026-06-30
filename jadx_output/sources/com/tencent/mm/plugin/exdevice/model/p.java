package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes15.dex */
public abstract class p {
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r9, long r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.model.p.a(java.lang.String, long):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x0125, code lost:
    
        if ((!r6.a() ? false : r6.f213266a.F(r6.f213267b)) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x015c, code lost:
    
        if (r15 != 43) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(r45.rf4 r34, dn.m r35, long r36, java.lang.String r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.model.p.b(r45.rf4, dn.m, long, java.lang.String, java.lang.String):boolean");
    }

    public static java.lang.String c(v32.b bVar) {
        java.lang.String f17;
        if (bVar == null) {
            return "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f237106y)) {
            f17 = bVar.f237106y;
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.B)) {
            long j17 = bVar.field_mac;
            f17 = j17 != 0 ? a42.i.f(j17) : !com.tencent.mm.sdk.platformtools.t8.K0(bVar.field_deviceID) ? bVar.field_deviceID : null;
        } else {
            f17 = bVar.B;
        }
        return f17 == null ? "" : f17;
    }

    public static java.lang.String d(org.w3c.dom.Element element, java.lang.String str) {
        org.w3c.dom.NodeList elementsByTagName = element.getElementsByTagName(str);
        return elementsByTagName.getLength() > 0 ? elementsByTagName.item(0).getTextContent() : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (r10 != 0) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.tencent.mm.network.h2] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.tencent.mm.network.h2] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.tencent.mm.network.h2] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] e(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.model.p.e(java.lang.String):byte[]");
    }

    public static java.lang.Boolean f(com.tencent.mm.storage.f9 f9Var) {
        return (f9Var == null || f9Var.getMsgId() == 0) ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(f9Var.o2());
    }

    public static java.lang.Boolean g(com.tencent.mm.storage.f9 f9Var) {
        boolean z17;
        ot0.q v17;
        if (f9Var == null || f9Var.getMsgId() == 0) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String j17 = f9Var.j();
        if (f9Var.k2() && (v17 = ot0.q.v(j17)) != null) {
            if (((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(v17.f348666i))) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }

    public static java.lang.Boolean h(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null || f9Var.getMsgId() == 0) {
            return java.lang.Boolean.FALSE;
        }
        return java.lang.Boolean.valueOf(f9Var.getType() == 3);
    }

    public static java.lang.Boolean i(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null || f9Var.getMsgId() == 0) {
            return java.lang.Boolean.FALSE;
        }
        return java.lang.Boolean.valueOf(f9Var.getType() == 62);
    }

    public static java.lang.Boolean j(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null || f9Var.getMsgId() == 0) {
            return java.lang.Boolean.FALSE;
        }
        return java.lang.Boolean.valueOf(f9Var.getType() == 43);
    }

    public static void k(java.lang.String str, int i17) {
        com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent = new com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent();
        am.z6 z6Var = exDeviceSendDataToNetworkDeviceStateEvent.f54165g;
        z6Var.f8521c = str;
        if (i17 >= 100) {
            z6Var.f8519a = "send_data_sucess";
        } else {
            z6Var.f8519a = "send_data_sending";
        }
        z6Var.f8520b = i17;
        exDeviceSendDataToNetworkDeviceStateEvent.e();
    }

    public static void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent = new com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent();
        am.z6 z6Var = exDeviceSendDataToNetworkDeviceStateEvent.f54165g;
        z6Var.f8519a = str2;
        z6Var.f8521c = str;
        exDeviceSendDataToNetworkDeviceStateEvent.e();
    }

    public static void m(java.lang.String str, java.lang.String str2, byte[] bArr) {
        com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent = new com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent();
        am.z6 z6Var = exDeviceSendDataToNetworkDeviceStateEvent.f54165g;
        z6Var.f8519a = str2;
        z6Var.f8521c = str;
        z6Var.f8522d = bArr;
        exDeviceSendDataToNetworkDeviceStateEvent.e();
    }
}
