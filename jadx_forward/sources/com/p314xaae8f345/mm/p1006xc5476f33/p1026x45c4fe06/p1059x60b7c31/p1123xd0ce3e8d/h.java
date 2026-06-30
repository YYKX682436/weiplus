package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public final class h implements org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i f165360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b f165361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f165362f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i iVar, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, int i17) {
        this.f165360d = iVar;
        this.f165361e = bVar;
        this.f165362f = i17;
    }

    @Override // org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents
    /* renamed from: onFirstFrameRendered */
    public void mo51494x452e7cb1() {
        this.f165360d.Q(this.f165361e, this.f165362f);
    }

    @Override // org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents
    /* renamed from: onFrameResolutionChanged */
    public void mo51495xd8b11f3a(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: onFrameResolutionChanged " + i17 + " * " + i18);
    }

    @Override // org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents
    /* renamed from: onRenderStats */
    public void mo51496xbae2a94a(org.p3371xd0ce3e8d.C29838x24207153 performanceStatistics) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f229341e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performanceStatistics, "performanceStatistics");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: current render stats: " + performanceStatistics);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = this.f165361e;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y v37 = bVar.v3();
        if (v37 == null || (f229341e = v37.getF229341e()) == null || (f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) f229341e.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class)) == null) {
            return;
        }
        f0Var.mo51545x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.g(bVar, performanceStatistics));
    }
}
