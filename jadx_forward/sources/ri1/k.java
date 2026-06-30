package ri1;

/* loaded from: classes4.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1172x7e5810c1.C12531x2a8ddffe f477566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1172x7e5810c1.C12531x2a8ddffe c12531x2a8ddffe) {
        super(0);
        this.f477566d = c12531x2a8ddffe;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ri1.c cVar = (ri1.c) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(ri1.c.class);
        if (cVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1172x7e5810c1.C12531x2a8ddffe c12531x2a8ddffe = this.f477566d;
            ri1.b a17 = c12531x2a8ddffe.a();
            boolean z17 = cVar.get(a17, new java.lang.String[0]);
            a17.f68356xc98d56de = c12531x2a8ddffe.f168771h;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            a17.f68353x75155eb6 = java.lang.System.currentTimeMillis();
            if (z17) {
                cVar.mo9952xce0038c9(a17, new java.lang.String[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WebRenderingCacheIPCOperations", "update record[" + a17 + "] with path[" + c12531x2a8ddffe.f168771h + ']');
            } else {
                cVar.mo880xb970c2b9(a17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WebRenderingCacheIPCOperations", "insert record[" + a17 + "] with path[" + c12531x2a8ddffe.f168771h + ']');
            }
        }
        return jz5.f0.f384359a;
    }
}
