package b82;

/* loaded from: classes4.dex */
public class b extends l75.n0 implements o72.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f18306d;

    public b(l75.k0 k0Var) {
        super(k0Var, o72.k2.f343384p, "FavConfigInfo", null);
        this.f18306d = k0Var;
    }

    @Override // o72.a4
    public byte[] Ue() {
        o72.k2 y07 = y0(8216);
        if (8216 != y07.field_configId) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavConfigStorage", "get sync key from fav db fail, try to load from mmdb");
            gm0.j1.i();
            if (!((java.lang.Boolean) gm0.j1.u().c().l(8224, java.lang.Boolean.FALSE)).booleanValue()) {
                gm0.j1.i();
                java.lang.String str = (java.lang.String) gm0.j1.u().c().l(8216, "");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str2 = str != null ? str : "";
                com.tencent.mars.xlog.Log.i("MicroMsg.FavConfigStorage", "get sync key(%s) from mmdb, do update fav sync key", str2);
                byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h(str2);
                q1(h17);
                com.tencent.mars.xlog.Log.w("MicroMsg.FavConfigStorage", "set fav sync key has trans");
                gm0.j1.i();
                gm0.j1.u().c().w(8224, java.lang.Boolean.TRUE);
                return h17;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.FavConfigStorage", "get sync from mmdb fail, has trans");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavConfigStorage", "get sync key, id %d, value %s", java.lang.Integer.valueOf(y07.field_configId), y07.field_value);
        return com.tencent.mm.sdk.platformtools.t8.h(y07.field_value);
    }

    @Override // o72.a4
    public void q1(byte[] bArr) {
        o72.k2 y07 = y0(8216);
        if (8216 == y07.field_configId) {
            y07.field_value = com.tencent.mm.sdk.platformtools.t8.l(bArr);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavConfigStorage", "update sync key: %s, result %B", y07.field_value, java.lang.Boolean.valueOf(update(y07, new java.lang.String[0])));
        } else {
            y07.field_configId = 8216;
            y07.field_value = com.tencent.mm.sdk.platformtools.t8.l(bArr);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavConfigStorage", "insert sync key: %s, result %B", y07.field_value, java.lang.Boolean.valueOf(insert(y07)));
        }
    }

    public final o72.k2 y0(int i17) {
        o72.k2 k2Var = new o72.k2();
        android.database.Cursor f17 = this.f18306d.f("select * from FavConfigInfo where configId = " + i17, null, 2);
        if (f17 != null) {
            if (f17.moveToFirst()) {
                k2Var.convertFrom(f17);
            }
            f17.close();
        }
        return k2Var;
    }
}
