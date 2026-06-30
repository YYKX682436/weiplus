package mm3;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f411157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk4.c f411158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 f411159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f411160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mm3.n f411161h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.jf2 f411162i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, pk4.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 h6Var, int i17, mm3.n nVar, r45.jf2 jf2Var) {
        super(1);
        this.f411157d = j17;
        this.f411158e = cVar;
        this.f411159f = h6Var;
        this.f411160g = i17;
        this.f411161h = nVar;
        this.f411162i = jf2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fm3.b bVar = (fm3.b) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on select pag: pag=");
        sb6.append(bVar);
        sb6.append(", resume progress to ");
        long j17 = this.f411157d;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", sb6.toString());
        pk4.c cVar = this.f411158e;
        cVar.mo72014x764cf626(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29 textureViewSurfaceTextureListenerC18694xeac4a29 = (com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar;
        gk4.r rVar = textureViewSurfaceTextureListenerC18694xeac4a29.f256099f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f354135g, "clearPlayRange");
        rVar.f354150v = -1L;
        rVar.f354151w = -1L;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 h6Var = this.f411159f;
        int i17 = this.f411160g;
        h6Var.O6(i17, bVar);
        textureViewSurfaceTextureListenerC18694xeac4a29.d(j17);
        kl3.t.g().a().c((int) j17);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0 = this.f411161h.f411186d;
        if (c16708x2eab1ea0 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tracksEditView");
            throw null;
        }
        c16708x2eab1ea0.c(i17, bVar != null);
        r45.jf2 jf2Var = this.f411162i;
        if (jf2Var != null) {
            jf2Var.set(10, bVar != null ? bVar.f345561a : null);
        }
        return jz5.f0.f384359a;
    }
}
