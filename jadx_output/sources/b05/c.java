package b05;

/* loaded from: classes12.dex */
public final class c extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f16970e;

    /* renamed from: f, reason: collision with root package name */
    public b05.i f16971f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f16972g;

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        b05.b bVar = new b05.b(this, uVar);
        o13.y yVar = this.f16970e;
        if (yVar == null) {
            return null;
        }
        ((com.tencent.mm.plugin.fts.t) yVar).b(-65536, bVar);
        return bVar;
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTSSearchWeShopLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("FTS.FTSSearchWeShopLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("FTS.FTSSearchWeShopLogic", "Create Success!");
        this.f16971f = (b05.i) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(2048);
        com.tencent.mm.plugin.fts.t tVar = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d;
        this.f16970e = tVar;
        if (tVar != null) {
            tVar.b(65656, new b05.a(this));
        }
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EcsWeShopIndexEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EcsWeShopIndexEvent>(a0Var) { // from class: com.tencent.mm.plugin.weshop.fts.FTSSearchWeShopLogic$onCreate$1
            {
                this.__eventId = 1789290609;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.EcsWeShopIndexEvent ecsWeShopIndexEvent) {
                com.tencent.mm.autogen.events.EcsWeShopIndexEvent event = ecsWeShopIndexEvent;
                kotlin.jvm.internal.o.g(event, "event");
                b05.c cVar = b05.c.this;
                o13.y yVar = cVar.f16970e;
                if (yVar == null) {
                    return true;
                }
                ((com.tencent.mm.plugin.fts.t) yVar).b(65656, new b05.a(cVar));
                return true;
            }
        };
        this.f16972g = iListener;
        iListener.alive();
        return true;
    }

    @Override // o13.b
    public boolean i() {
        com.tencent.mm.sdk.event.IListener iListener = this.f16972g;
        if (iListener != null) {
            iListener.dead();
        }
        this.f16970e = null;
        this.f16971f = null;
        return true;
    }
}
