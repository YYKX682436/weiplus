package sc1;

/* loaded from: classes7.dex */
public class o implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f487235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc1.f f487236e;

    public o(sc1.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, sc1.f fVar) {
        this.f487235d = tVar;
        this.f487236e = fVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(this.f487235d.mo48798x74292566());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePlayer", "LivePlayer enter background, pause type:%s", d17.name());
        sc1.f fVar = this.f487236e;
        sc1.k1 m17 = ((sc1.o1) fVar.f487193e).m(fVar.f487192d, d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePlayerView", "onBackground code:%d info:%s", java.lang.Integer.valueOf(m17.f487221a), m17.f487222b);
    }
}
