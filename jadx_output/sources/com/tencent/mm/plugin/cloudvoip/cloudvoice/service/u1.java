package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes13.dex */
public class u1 implements java.lang.Runnable {
    public u1(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = (android.os.Bundle) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.f96009c2, null, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p2.class);
        if (bundle != null) {
            wo.v1.a(bundle.getString("device_info", ""));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: can not get device info from mm");
        }
    }
}
