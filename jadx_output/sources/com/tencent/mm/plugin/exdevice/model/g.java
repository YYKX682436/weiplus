package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes9.dex */
public final class g implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.k f98905d;

    public g(com.tencent.mm.plugin.exdevice.model.k kVar) {
        this.f98905d = kVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        byte[] byteArray;
        m1Var.setHasCallbackToQueue(true);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        com.tencent.mm.plugin.exdevice.model.k kVar = this.f98905d;
        com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "cdnMsg, onSceneEnd, errType(%d) errCode(%d) errMsg(%s). release %b", valueOf, valueOf2, str, java.lang.Boolean.valueOf(kVar.f98953j));
        com.tencent.mm.plugin.exdevice.model.q2 q2Var = (com.tencent.mm.plugin.exdevice.model.q2) m1Var;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("ExDeviceSendIotLogic", "onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (kVar.f98953j) {
                return;
            }
            if (i18 == -125) {
                r45.yf4 yf4Var = q2Var.H().f392257f;
                com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = q2Var.f99047f;
                if (yf4Var == null || kotlin.jvm.internal.o.b(q2Var.H().f392257f.f391039d, "")) {
                    com.tencent.mm.plugin.exdevice.model.p.l(networkDeviceInfo.f66586d, "send_data_failed");
                } else {
                    com.tencent.mm.plugin.exdevice.model.p.m(networkDeviceInfo.f66586d, "send_data_failed", q2Var.H().f392257f.toByteArray());
                }
            } else {
                r45.yf4 yf4Var2 = q2Var.H().f392257f;
                com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo2 = q2Var.f99047f;
                if (yf4Var2 == null || kotlin.jvm.internal.o.b(q2Var.H().f392257f.f391039d, "")) {
                    com.tencent.mm.plugin.exdevice.model.p.l(networkDeviceInfo2.f66586d, "send_data_failed");
                } else {
                    com.tencent.mm.plugin.exdevice.model.p.m(networkDeviceInfo2.f66586d, "send_data_failed", q2Var.H().f392257f.toByteArray());
                }
            }
            com.tencent.mm.plugin.exdevice.model.l3.Zi().y0(kVar.f98944a);
            return;
        }
        com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "cdn navigate_to_miniprogram: " + q2Var.H().f392255d);
        boolean z17 = q2Var.H().f392255d;
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo3 = q2Var.f99047f;
        if (!z17) {
            r45.yf4 yf4Var3 = q2Var.H().f392257f;
            r45.fu5 fu5Var = q2Var.H().f392258g;
            com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "cdn wordingInfo: " + yf4Var3 + ", ssv: " + fu5Var);
            java.lang.String str2 = networkDeviceInfo3.f66586d;
            byte[] byteArray2 = yf4Var3 != null ? yf4Var3.toByteArray() : null;
            byteArray = fu5Var != null ? fu5Var.toByteArray() : null;
            com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent = new com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent();
            am.z6 z6Var = exDeviceSendDataToNetworkDeviceStateEvent.f54165g;
            z6Var.f8519a = "send_data_sucess";
            z6Var.f8521c = str2;
            z6Var.f8522d = byteArray2;
            z6Var.f8524f = byteArray;
            exDeviceSendDataToNetworkDeviceStateEvent.e();
            return;
        }
        r45.xf4 xf4Var = q2Var.H().f392256e;
        java.lang.String str3 = xf4Var.f390050e;
        java.lang.String str4 = xf4Var.f390051f;
        int i19 = xf4Var.f390052g;
        java.lang.String str5 = xf4Var.f390049d;
        r45.yf4 yf4Var4 = q2Var.H().f392257f;
        r45.fu5 fu5Var2 = q2Var.H().f392258g;
        com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "mfr appid: " + str3 + ", path: " + str4 + ", env: " + i19 + ", args:" + str5);
        java.lang.String str6 = networkDeviceInfo3.f66586d;
        byte[] byteArray3 = yf4Var4 != null ? yf4Var4.toByteArray() : null;
        byte[] byteArray4 = xf4Var.toByteArray();
        byteArray = fu5Var2 != null ? fu5Var2.toByteArray() : null;
        com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent2 = new com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent();
        am.z6 z6Var2 = exDeviceSendDataToNetworkDeviceStateEvent2.f54165g;
        z6Var2.f8519a = "send_data_sucess";
        z6Var2.f8521c = str6;
        z6Var2.f8523e = byteArray4;
        z6Var2.f8522d = byteArray3;
        z6Var2.f8524f = byteArray;
        exDeviceSendDataToNetworkDeviceStateEvent2.e();
    }
}
