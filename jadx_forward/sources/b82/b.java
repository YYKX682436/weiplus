package b82;

/* loaded from: classes4.dex */
public class b extends l75.n0 implements o72.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f99839d;

    public b(l75.k0 k0Var) {
        super(k0Var, o72.k2.f424917p, "FavConfigInfo", null);
        this.f99839d = k0Var;
    }

    @Override // o72.a4
    public byte[] Ue() {
        o72.k2 y07 = y0(8216);
        if (8216 != y07.f67197xfb2ecda2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavConfigStorage", "get sync key from fav db fail, try to load from mmdb");
            gm0.j1.i();
            if (!((java.lang.Boolean) gm0.j1.u().c().l(8224, java.lang.Boolean.FALSE)).booleanValue()) {
                gm0.j1.i();
                java.lang.String str = (java.lang.String) gm0.j1.u().c().l(8216, "");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str2 = str != null ? str : "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavConfigStorage", "get sync key(%s) from mmdb, do update fav sync key", str2);
                byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str2);
                q1(h17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavConfigStorage", "set fav sync key has trans");
                gm0.j1.i();
                gm0.j1.u().c().w(8224, java.lang.Boolean.TRUE);
                return h17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavConfigStorage", "get sync from mmdb fail, has trans");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavConfigStorage", "get sync key, id %d, value %s", java.lang.Integer.valueOf(y07.f67197xfb2ecda2), y07.f67198x29f571ec);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(y07.f67198x29f571ec);
    }

    @Override // o72.a4
    public void q1(byte[] bArr) {
        o72.k2 y07 = y0(8216);
        if (8216 == y07.f67197xfb2ecda2) {
            y07.f67198x29f571ec = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(bArr);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavConfigStorage", "update sync key: %s, result %B", y07.f67198x29f571ec, java.lang.Boolean.valueOf(mo9952xce0038c9(y07, new java.lang.String[0])));
        } else {
            y07.f67197xfb2ecda2 = 8216;
            y07.f67198x29f571ec = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(bArr);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavConfigStorage", "insert sync key: %s, result %B", y07.f67198x29f571ec, java.lang.Boolean.valueOf(mo880xb970c2b9(y07)));
        }
    }

    public final o72.k2 y0(int i17) {
        o72.k2 k2Var = new o72.k2();
        android.database.Cursor f17 = this.f99839d.f("select * from FavConfigInfo where configId = " + i17, null, 2);
        if (f17 != null) {
            if (f17.moveToFirst()) {
                k2Var.mo9015xbf5d97fd(f17);
            }
            f17.close();
        }
        return k2Var;
    }
}
