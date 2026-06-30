package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class q2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private q2() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        boolean ie6 = ((jp5.o) i95.n0.c(jp5.o.class)).ie();
        boolean z17 = iq.b.H() || vq4.p0.c() || vq4.p0.d() || ie6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "GetIsInVoIP task isInVoip:%b isTalkingOfVoipMp:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(ie6));
        bundle.putBoolean("is_in_voip", z17);
        return bundle;
    }
}
