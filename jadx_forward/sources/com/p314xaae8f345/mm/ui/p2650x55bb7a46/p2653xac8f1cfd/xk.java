package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class xk extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public xk() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.uq uqVar = event.f136212g;
        java.lang.String str = uqVar != null ? uqVar.f89659b : null;
        new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20043xe80dfb();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "RepairerConfig_SetVoiceInputLongclickTime")) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N(gm0.j1.b().j() + "MicroMsg.ChattingVoice2TxtComponent", 2, null);
        N.B("longclick_guide_interval_override", 3000L);
        N.G("show_longclick_guide", false);
        N.A("longclick_guide_count", 0);
        return true;
    }
}
