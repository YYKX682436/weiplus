package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes10.dex */
public final class wa extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public wa() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5156x300e729d event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5156x300e729d) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundVideoAggressiveCleanEventListener", "aggressiveCleanEventListener: has trigger aggressive clean");
        bm5.t0 t0Var = bm5.t0.f104271a;
        if (!t0Var.a() || !t0Var.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundVideoAggressiveCleanEventListener", "entrance is close");
            return true;
        }
        jm0.i iVar = jm0.k.f381802h;
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.n8) iVar.a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)).Q4() == null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundVideoAggressiveCleanEventListener", "exist old db need to create new db");
        ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) iVar.a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)).mo528x82b764cd();
        com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a.a();
        return true;
    }
}
