package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class q2 implements com.tencent.mm.ipcinvoker.k0 {
    private q2() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        boolean ie6 = ((jp5.o) i95.n0.c(jp5.o.class)).ie();
        boolean z17 = iq.b.H() || vq4.p0.c() || vq4.p0.d() || ie6;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "GetIsInVoIP task isInVoip:%b isTalkingOfVoipMp:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(ie6));
        bundle.putBoolean("is_in_voip", z17);
        return bundle;
    }
}
