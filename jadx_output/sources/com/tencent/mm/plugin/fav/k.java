package com.tencent.mm.plugin.fav;

/* loaded from: classes12.dex */
public class k extends p13.c {
    public k(com.tencent.mm.plugin.fav.o oVar) {
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "InitFTSFavPluginTask";
    }

    @Override // p13.c
    public boolean i() {
        v72.a aVar = new v72.a();
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).pj(aVar);
        aVar.create();
        v72.i iVar = new v72.i();
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).qj(6, iVar);
        iVar.f();
        return true;
    }
}
