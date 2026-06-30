package v31;

/* loaded from: classes7.dex */
public final class c implements x31.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f514620a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f514620a = tVar;
    }

    @Override // x31.a
    public void b(int i17, java.lang.String status, java.lang.String extra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("action", java.lang.Integer.valueOf(i17));
        hashMap.put("status", status);
        hashMap.put("extra", extra);
        java.lang.String gVar = new cl0.g(hashMap).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicNewPlayable.JsApiInsertMiniProgramPlayableView", "playableService callback result:".concat(gVar));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f514620a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.AppBrandPageView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 v37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) tVar).v3();
        if (v37 != null) {
            w31.a aVar = new w31.a();
            aVar.f163907f = gVar;
            v37.p(aVar);
        }
    }
}
