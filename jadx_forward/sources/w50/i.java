package w50;

/* loaded from: classes.dex */
public class i implements gm0.i2 {
    @Override // gm0.i2
    public void kh(int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "upgrade reset rebuild times to 3");
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FTS_MASTER_DB_CORRUPT_REBUILD_TIME_INT_SYNC, 5);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FTS_MASTER_DB_CORRUPT_REBUILD_UPDATE_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            return;
        }
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FTS_MASTER_DB_CORRUPT_REBUILD_UPDATE_TIME_LONG_SYNC;
        long t17 = c17.t(u3Var, 0L);
        if (java.lang.System.currentTimeMillis() - t17 <= 86400000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "no need reset rebuild times to 3 %s preVersion %s", java.lang.Long.valueOf(t17), java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "one day reset rebuild times to 3");
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FTS_MASTER_DB_CORRUPT_REBUILD_TIME_INT_SYNC, 5);
        gm0.j1.i();
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }
}
