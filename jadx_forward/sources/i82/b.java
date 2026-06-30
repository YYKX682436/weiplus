package i82;

/* loaded from: classes8.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f371163e = {l75.n0.m145250x3fdc6f77(i82.a.G, "FavOffline")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f371164f = new java.lang.String[0];

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f371165d;

    public b(l75.k0 k0Var) {
        super(k0Var, i82.a.G, "FavOffline", f371164f);
        this.f371165d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(i82.a aVar) {
        if (aVar == null) {
            return false;
        }
        return super.mo880xb970c2b9(aVar);
    }

    public boolean J0(i82.a aVar) {
        if (aVar != null) {
            return mo11261xce0038c9(aVar.f72763xa3c65b86, aVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.offline.FavOfflineStorage", "update() item is null");
        return false;
    }

    public java.util.List y0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor E = this.f371165d.E("FavOffline", i82.a.G.f398487c, "status!=?", new java.lang.String[]{"0"}, null, null, "updateTime asc");
        while (E.moveToNext()) {
            i82.a aVar = new i82.a();
            aVar.mo9015xbf5d97fd(E);
            arrayList.add(aVar);
        }
        arrayList.size();
        return arrayList;
    }

    public i82.a z0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        android.database.Cursor E = this.f371165d.E("FavOffline", i82.a.G.f398487c, "url=?", new java.lang.String[]{str}, null, null, "rowid");
        if (!E.moveToNext()) {
            return null;
        }
        i82.a aVar = new i82.a();
        aVar.mo9015xbf5d97fd(E);
        return aVar;
    }
}
