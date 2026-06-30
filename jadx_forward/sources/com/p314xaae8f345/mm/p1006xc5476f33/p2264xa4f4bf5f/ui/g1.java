package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes7.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1 f255424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f255426f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1 h1Var, int i17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f255424d = h1Var;
        this.f255425e = i17;
        this.f255426f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.g1(this.f255424d, this.f255425e, this.f255426f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.g1 g1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.g1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class);
        java.lang.Boolean valueOf = o6Var != null ? java.lang.Boolean.valueOf(o6Var.l5("wxb1320569c2a2b6d2", 0)) : null;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.FALSE);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255424d.f255456f, "updateCoverAgendaView: lastClientVersion:" + this.f255425e + "  CLIENT_VERSION:" + o45.wf.f424562g + " isClientVersionChange:" + this.f255426f + " isNeedPreDownLoad:" + b17 + " isPkgCached:" + valueOf + ' ');
        if (b17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)).P4("gh_8672f34b4389@app", "wxb1320569c2a2b6d2", "pages/emoji-panel/emoji-panel.html", 14);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LAST_CLIENT_VERSION_FOR_EMOJI_APPBRAND_PANEL_INT, new java.lang.Integer(o45.wf.f424562g));
        }
        return jz5.f0.f384359a;
    }
}
