package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes7.dex */
public final class k1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f173757d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f173758e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f173759f;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f173757d = runtime;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.CapsuleAnimatorEventHelper", "isEnable set: " + mi1.o0.f408186b + " -> true");
        mi1.o0.f408186b = true;
        this.f173758e = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.f173759f = new java.util.concurrent.atomic.AtomicReference(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.b3.f173670f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.b3 W1() {
        java.lang.Object obj = this.f173759f.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.b3) obj;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2
    public boolean g4() {
        return this.f173758e.get();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2
    public void l1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.b3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWxAssistantService", "setAgentState: " + state);
        this.f173759f.set(state);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2
    public void zb(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3 c3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173683a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean a17 = z65.c.a();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f173758e;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuggageWxAssistantService", "enableWxAssistant fail, isFeatureEnabled: false");
            atomicBoolean.set(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n.f173084d = true;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWxAssistantService", "enableWxAssistant isEnable:" + z17);
        atomicBoolean.set(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = this.f173757d.f156329e;
        if (hcVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(hcVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.wxassistant.IRuntimeContainerHandlerForWxAssistant");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p2) hcVar);
            c11529x5d7a34bb.Y(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t5(c11529x5d7a34bb, z17));
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n.f173084d = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n.f173084d = true;
        }
    }
}
