package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes8.dex */
public final class r extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public r() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!gm0.j1.a() || gm0.j1.s(c25.e.class) == null) {
            return false;
        }
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BizServiceMuteWhitelist");
        if (d17 == null) {
            d17 = "";
        }
        bn0.g gVar = bn0.g.f104312a;
        if (d17.equals(gVar.b("MXM_DynaCfg_BizServiceMuteWhitelist", ""))) {
            return false;
        }
        gVar.h("MXM_DynaCfg_BizServiceMuteWhitelist", d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LightPushDynamicConfigUpdated", "update_MXM_DynaCfg_BizServiceMuteWhitelist");
        return false;
    }
}
