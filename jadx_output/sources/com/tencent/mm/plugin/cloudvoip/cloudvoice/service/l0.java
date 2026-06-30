package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes8.dex */
public enum l0 {
    INSTANCE;

    public final void a(int i17) {
        java.lang.String a17 = bm5.f1.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: %s operate network change: %d", a17, java.lang.Integer.valueOf(i17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("from_process", a17);
        bundle.putInt("opcode", i17);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.k0.class, new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h0(this, a17));
    }
}
