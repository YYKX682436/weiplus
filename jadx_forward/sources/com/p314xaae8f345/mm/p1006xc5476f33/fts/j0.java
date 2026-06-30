package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes12.dex */
public class j0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 f218955n;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var) {
        this.f218955n = d0Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "InitSearchTask";
    }

    @Override // p13.c
    public boolean i() {
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FTS_MASTER_DB_VERISON_INT_SYNC;
        if (2 != ((java.lang.Integer) c17.m(u3Var, 0)).intValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.o.f();
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, 2);
        }
        gm0.j1.i();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(gm0.j1.u().h(), "IndexMicroMsg.db");
        if (r6Var.m()) {
            r6Var.l();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "not exist fts3DBFile %s", r6Var.o());
        }
        gm0.j1.i();
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(gm0.j1.u().h(), "FTS5IndexMicroMsg.db");
        if (r6Var2.m()) {
            r6Var2.l();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "not exist fts5DBUnEncrypt %s", r6Var2.o());
        }
        gm0.j1.i();
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(gm0.j1.u().h(), "FTS5IndexMicroMsg_encrypt.db");
        gm0.j1.i();
        com.p314xaae8f345.mm.vfs.r6 r6Var4 = new com.p314xaae8f345.mm.vfs.r6(gm0.j1.u().g());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("enFavorite.db");
        com.p314xaae8f345.mm.vfs.r6 r6Var5 = new com.p314xaae8f345.mm.vfs.r6(sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "ftsEncryptDB:%s mainEncryptDB:%s favEncryptDB:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(r6Var3.C()), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(r6Var4.C()), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(r6Var5.C()));
        if (r6Var3.C() > 1.610612736E9d && r6Var3.C() > (r6Var4.C() + r6Var5.C()) * 2) {
            r6Var3.l();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "try to delete old db and rebuild");
            jx3.f.INSTANCE.mo68477x336bdfd8(729L, 14L, 1L, false);
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var = this.f218955n;
            gm0.j1.i();
            d0Var.f218914f = new com.p314xaae8f345.mm.p1006xc5476f33.fts.o(gm0.j1.u().h());
            com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.wi(this.f218955n);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.Ai(this.f218955n);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.Bi(this.f218955n);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.Di(this.f218955n);
            ((w50.k) ((x50.j) i95.n0.c(x50.j.class))).Bi();
            ((od2.s) ((m40.l0) i95.n0.c(m40.l0.class))).wi();
            if (((w50.k) ((x50.j) i95.n0.c(x50.j.class))).f524488d) {
                ((w50.k) ((x50.j) i95.n0.c(x50.j.class))).Di();
            }
            ((w50.k) ((x50.j) i95.n0.c(x50.j.class))).Ai();
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.fts.q e17) {
            throw e17;
        } catch (java.lang.Exception e18) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.E) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.PluginFTS", e18, "Index database corruption detected", new java.lang.Object[0]);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.C15569x5978c15) this.f218955n.f218921p).mo63526x28043a1a(null);
        }
        return true;
    }
}
