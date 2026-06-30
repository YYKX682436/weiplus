package oq3;

/* loaded from: classes12.dex */
public final class g extends jm0.g implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f428916f;

    /* renamed from: g, reason: collision with root package name */
    public final long f428917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jm0.o plugin) {
        super(plugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f428916f = new java.util.ArrayList();
        this.f428917g = 60000L;
    }

    public final void T6() {
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        pq3.j jVar = nVar.B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jVar, "getC2CMsgPreDownloader(...)");
        jVar.h(false);
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.m134976x2690a4ac();
        nVar2.B.g();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreDownloadCheckPLC", "pre download cgi scene end, errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
        if (i17 == 0 && i18 == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.priority.model.precheck.NetScenePredownloadCheck");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((oq3.d) m1Var).f428913e.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.PrevDownloadCheckResponse");
            ((ku5.t0) ku5.t0.f394148d).g(new oq3.e((r45.kc5) fVar));
            return;
        }
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        kq3.k kVar = nVar.f347069u.f392812b;
        if (kVar != null) {
            kVar.mo50307xb9e94560(2, 300000L);
        }
    }
}
