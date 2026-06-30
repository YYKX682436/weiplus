package v72;

/* loaded from: classes12.dex */
public class f extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f515192n;

    /* renamed from: o, reason: collision with root package name */
    public final long f515193o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v72.i f515194p;

    public f(v72.i iVar, long j17, v72.b bVar) {
        this.f515194p = iVar;
        this.f515193o = j17;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "InsertFavItemTask";
    }

    @Override // p13.c
    public boolean i() {
        v72.i iVar = this.f515194p;
        l75.k0 k0Var = iVar.f515201i;
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTS5SearchFavoriteLogic", "InsertFavItemTask: fav db is null");
            return true;
        }
        long j17 = this.f515193o;
        android.database.Cursor c17 = d95.b.c(k0Var, "SELECT localId, type, updateTime, fromUser, favProto, tagProto FROM FavItemInfo WHERE localId = ? AND flag <> -1;", new java.lang.String[]{java.lang.String.valueOf(j17)});
        try {
            try {
                if (c17.moveToFirst()) {
                    v72.e eVar = new v72.e(iVar, null);
                    eVar.a(c17);
                    c17.close();
                    try {
                        if (v72.i.j(eVar)) {
                            return true;
                        }
                        iVar.f515200h.h();
                        iVar.f515200h.F(o13.d.f423749b, j17);
                        this.f515192n = v72.i.k(iVar, eVar);
                        iVar.f515200h.j();
                        c17 = null;
                    } catch (java.lang.Exception e17) {
                        throw e17;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        c17 = null;
                        if (c17 != null) {
                            c17.close();
                        }
                        throw th;
                    }
                }
                if (c17 != null) {
                    c17.close();
                }
                return true;
            } catch (java.lang.Exception e18) {
                throw e18;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{favItemId: %d transactionCount: %d}", java.lang.Long.valueOf(this.f515193o), java.lang.Integer.valueOf(this.f515192n));
    }
}
