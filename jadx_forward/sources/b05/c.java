package b05;

/* loaded from: classes12.dex */
public final class c extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f98503e;

    /* renamed from: f, reason: collision with root package name */
    public b05.i f98504f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f98505g;

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        b05.b bVar = new b05.b(this, uVar);
        o13.y yVar = this.f98503e;
        if (yVar == null) {
            return null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(-65536, bVar);
        return bVar;
    }

    @Override // o13.w
    /* renamed from: getName */
    public java.lang.String mo9545xfb82e301() {
        return "FTSSearchWeShopLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTS.FTSSearchWeShopLogic", "Create Fail!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTS.FTSSearchWeShopLogic", "Create Success!");
        this.f98504f = (b05.i) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(2048);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.t tVar = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218912d;
        this.f98503e = tVar;
        if (tVar != null) {
            tVar.b(65656, new b05.a(this));
        }
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5317x7edac81> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5317x7edac81>(a0Var) { // from class: com.tencent.mm.plugin.weshop.fts.FTSSearchWeShopLogic$onCreate$1
            {
                this.f39173x3fe91575 = 1789290609;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5317x7edac81 c5317x7edac81) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5317x7edac81 event = c5317x7edac81;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                b05.c cVar = b05.c.this;
                o13.y yVar = cVar.f98503e;
                if (yVar == null) {
                    return true;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(65656, new b05.a(cVar));
                return true;
            }
        };
        this.f98505g = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        return true;
    }

    @Override // o13.b
    public boolean i() {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f98505g;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        this.f98503e = null;
        this.f98504f = null;
        return true;
    }
}
