package f11;

/* loaded from: classes.dex */
public class b extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public b() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FontResLogic", "received CheckResUpdateCacheFileEvent when account was not ready, resType: %s, subType: %s", java.lang.Integer.valueOf(c5255x5f3208fd.f135586g.f89292a), java.lang.Integer.valueOf(c5255x5f3208fd.f135586g.f89293b));
            return false;
        }
        am.r2 r2Var = c5255x5f3208fd.f135586g;
        if (r2Var.f89292a != 57 || r2Var.f89293b != 1) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FontResLogic", "download res finish, path: %s, fileVersion: %s, fileUpdated: %s", r2Var.f89294c, java.lang.Integer.valueOf(r2Var.f89295d), java.lang.Boolean.valueOf(c5255x5f3208fd.f135586g.f89296e));
        gm0.j1.e().j(new f11.a(this, c5255x5f3208fd));
        return false;
    }
}
