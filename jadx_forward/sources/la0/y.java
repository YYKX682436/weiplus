package la0;

/* loaded from: classes11.dex */
public class y extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47 c5147x8f44fd47 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47) abstractC20979x809547d1;
        if (!gm0.j1.a() || c5147x8f44fd47.f135497g.f87945a) {
            return false;
        }
        ml3.b bVar = new ml3.b();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MUSIO_LAST_SCAN_MUSIC_FILE_TIME_LONG;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - longValue < gl3.b.f354353c.longValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PieceCacheCleanController", "don't scanMusic because the time is in one day");
            return false;
        }
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
        s75.d.c(new ml3.a(bVar), "ScanMusicThread", 1);
        return false;
    }
}
