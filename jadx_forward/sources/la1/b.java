package la1;

/* loaded from: classes7.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f399026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        super(1);
        this.f399026d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 it = (com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WAGameJsApiInsertVideoPlayer", "InsertVideoPlayer, info: change viewType to TextureView");
        if (it.m34863xc321a0f5() != gh.y.TextureView) {
            it.m34869xe201638a(new qa1.s(it.getContext()));
            it.m34868x1c0e5b23(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = ((pa1.o) this.f399026d).mo32091x9a3f0ba2();
            if (!(mo32091x9a3f0ba2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6)) {
                mo32091x9a3f0ba2 = null;
            }
            if (mo32091x9a3f0ba2 != null && mo32091x9a3f0ba2.q2() && !mo32091x9a3f0ba2.f167700d3) {
                mo32091x9a3f0ba2.f167700d3 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = mo32091x9a3f0ba2.f156329e;
                if (hcVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb) hcVar).d0(mo32091x9a3f0ba2);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
