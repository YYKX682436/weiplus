package z72;

/* loaded from: classes12.dex */
public class b extends l75.s0 implements o72.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b f552083d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae f552084e;

    public b(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b) {
        this.f552083d = c26918x6e83759b;
        this.f552084e = c26918x6e83759b.m106824x752de218("FavConfigInfo", up5.c.f511443b);
    }

    @Override // o72.a4
    public byte[] Ue() {
        com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 c26901x4e9a151;
        try {
            c26901x4e9a151 = this.f552084e.m107277x754a37bb(up5.c.f511445d, up5.c.f511444c.eq(8216));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavConfigStorage", "Operation failed: " + e17.getMessage());
            c26901x4e9a151 = null;
        }
        if (c26901x4e9a151 != null) {
            java.lang.String m106363xfb85ada3 = c26901x4e9a151.m106363xfb85ada3();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavConfigStorage", "get sync key, id %d, value %s", 8216, m106363xfb85ada3);
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(m106363xfb85ada3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavConfigStorage", "get sync key from fav db fail, try to load from mmdb");
        gm0.j1.i();
        if (((java.lang.Boolean) gm0.j1.u().c().l(8224, java.lang.Boolean.FALSE)).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavConfigStorage", "get sync from mmdb fail, has trans");
            return new byte[0];
        }
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

    @Override // o72.a4
    public void q1(byte[] bArr) {
        up5.q qVar = new up5.q();
        qVar.f511576a = 8216;
        qVar.f511577b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(bArr);
        try {
            this.f552084e.m107158x7beb81f7(qVar);
            java.lang.String num = java.lang.Integer.toString(qVar.f511576a);
            o72.k2 k2Var = new o72.k2();
            k2Var.f67197xfb2ecda2 = qVar.f511576a;
            k2Var.f67198x29f571ec = qVar.f511577b;
            mo142179xf35bbb4(num, 2, k2Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavConfigStorage", "Operation failed: " + e17.getMessage());
        }
    }
}
