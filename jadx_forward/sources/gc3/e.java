package gc3;

/* loaded from: classes9.dex */
public final class e extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa f351958a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa abstractC16410x346dc9fa) {
        this.f351958a = abstractC16410x346dc9fa;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.AbstractC16410x346dc9fa abstractC16410x346dc9fa = this.f351958a;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyVoiceInputLayout", "Recognized revealTime force finished %s", java.lang.Integer.valueOf(abstractC16410x346dc9fa.getCurrentState()));
            }
        }
        abstractC16410x346dc9fa.getCurrentState();
        if (abstractC16410x346dc9fa.getCurrentState() != 3) {
            return;
        }
        mo50303x856b99f0(0);
        mo50303x856b99f0(1);
        z21.e eVar = abstractC16410x346dc9fa.f229129f;
        if (eVar != null) {
            eVar.mo48278xae7a2e7a(true);
        }
        if (abstractC16410x346dc9fa.currentState == 1) {
            return;
        }
        abstractC16410x346dc9fa.currentState = 1;
        abstractC16410x346dc9fa.j();
        if (abstractC16410x346dc9fa.voiceDetectListener != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyVoiceTransLayout", "onStateReset, someone like prepare state");
        }
    }
}
