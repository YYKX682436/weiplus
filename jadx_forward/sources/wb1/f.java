package wb1;

/* loaded from: classes7.dex */
public final class f implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f525902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wb1.h f525903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f525904f;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, wb1.h hVar, com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad) {
        this.f525902d = lVar;
        this.f525903e = hVar;
        this.f525904f = c4209xd2d3ddad;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v
    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "background");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f525902d;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar).mo32091x9a3f0ba2().L0()) {
            return;
        }
        vb1.b bVar = vb1.d.f516006c;
        java.lang.String mo48798x74292566 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar).mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        vb1.d a17 = bVar.a(mo48798x74292566);
        a17.b(this.f525903e.f525910i);
        if (a17.d() == 0) {
            this.f525904f.e();
        }
    }
}
