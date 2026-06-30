package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes7.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f173889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c2 f173890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c2 c2Var) {
        super(0);
        this.f173889d = z17;
        this.f173890e = c2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2 q2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2 q2Var2;
        if (this.f173889d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWxAssistantView", "showInterceptDialog: remove wx assistant");
            this.f173890e.f173679e = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c = this.f173890e.f173678d.mo48805xd384d23c();
            if (mo48805xd384d23c != null && (q2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2) mo48805xd384d23c.K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class)) != null) {
                q2Var2.l1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.b3.f173671g);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c2 = this.f173890e.f173678d.mo48805xd384d23c();
            if (mo48805xd384d23c2 != null && (q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2) mo48805xd384d23c2.K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class)) != null) {
                q2Var.zb(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = this.f173890e.f173678d;
            if (hcVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(hcVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.wxassistant.IRuntimeContainerHandlerForWxAssistant");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p2) hcVar);
                c11529x5d7a34bb.Y(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t5(c11529x5d7a34bb, false));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuggageWxAssistantView", "setAgentState: not support, runtimeContainerHandler is not IRuntimeContainerHandlerForWxAssistant");
            }
        }
        return jz5.f0.f384359a;
    }
}
