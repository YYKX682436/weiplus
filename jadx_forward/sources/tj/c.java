package tj;

/* loaded from: classes7.dex */
public final class c implements x31.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tj.d f501207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f501208b;

    public c(tj.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f501207a = dVar;
        this.f501208b = tVar;
    }

    @Override // x31.a
    public void b(int i17, java.lang.String status, java.lang.String extra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        java.lang.String P = this.f501207a.P(i17, status);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "playableService callback result:".concat(P));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f501208b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.AppBrandPageView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 v37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) tVar).v3();
        if (v37 != null) {
            tj.e eVar = new tj.e();
            eVar.f163907f = P;
            v37.p(eVar);
        }
    }
}
