package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class h3 extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f219092e;

    @Override // o13.w
    public p13.c b(p13.u request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.g3 g3Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.g3(this, request);
        o13.y yVar = this.f219092e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(-65536, g3Var);
        return g3Var;
    }

    @Override // o13.w
    /* renamed from: getName */
    public java.lang.String mo9545xfb82e301() {
        return "FTS5SearchSettingLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchSettingLogic", "Create Fail!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchSettingLogic", "Create Success!");
        this.f219092e = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218913e;
        return true;
    }

    @Override // o13.b
    public boolean i() {
        this.f219092e = null;
        return true;
    }
}
