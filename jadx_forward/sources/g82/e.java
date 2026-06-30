package g82;

/* loaded from: classes8.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        boolean c17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5424xcd4b49b4 c5424xcd4b49b4 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5424xcd4b49b4) abstractC20979x809547d1;
        if (c5424xcd4b49b4 != null) {
            am.r9 r9Var = c5424xcd4b49b4.f135768g;
            java.lang.String str = r9Var.f89335a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineHelp", "deleteFavOffline url is null!");
            } else {
                i82.a z07 = ((e82.e) i95.n0.c(e82.e.class)).Ai().z0(str);
                if (z07 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineHelp", "deleteFavOffline favOffline is null!");
                } else {
                    c17 = h82.e.c(str, z07.f67784x2260084a, z07.f67781x9ec3d174);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FavDeleteEventIListener", "FavDeleteEvent url:%s result:%s", r9Var.f89335a, java.lang.Boolean.valueOf(c17));
                }
            }
            c17 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FavDeleteEventIListener", "FavDeleteEvent url:%s result:%s", r9Var.f89335a, java.lang.Boolean.valueOf(c17));
        }
        return false;
    }
}
