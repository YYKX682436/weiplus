package rn;

/* loaded from: classes11.dex */
public class i extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f479139e = {l75.n0.m145250x3fdc6f77(rn.h.f479136v, "GroupTools")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f479140f = {"DROP INDEX IF EXISTS usernameIndex", "CREATE INDEX IF NOT EXISTS GroupTools_usernameIndex ON GroupTools ( chatroomname )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f479141d;

    public i(l75.k0 k0Var) {
        super(k0Var, rn.h.f479136v, "GroupTools", f479140f);
        this.f479141d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo9952xce0038c9(rn.h hVar, java.lang.String... strArr) {
        boolean mo51732xbf274172 = super.mo51732xbf274172(hVar, true, strArr);
        if (mo51732xbf274172) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5760x1e77eb5 c5760x1e77eb5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5760x1e77eb5();
            c5760x1e77eb5.f136079g.f89358a = hVar.f66385x37548063;
            c5760x1e77eb5.b(android.os.Looper.getMainLooper());
        }
        return mo51732xbf274172;
    }

    public rn.h y0(java.lang.String str) {
        android.database.Cursor E;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (E = this.f479141d.E("GroupTools", rn.h.f479136v.f398487c, "chatroomname=?", new java.lang.String[]{str}, null, null, null)) == null) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (E.moveToNext()) {
                rn.h hVar = new rn.h();
                hVar.mo9015xbf5d97fd(E);
                arrayList.add(hVar);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return (rn.h) arrayList.get(0);
        } finally {
            E.close();
        }
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(rn.h hVar) {
        if (hVar == null) {
            return false;
        }
        return super.mo880xb970c2b9(hVar);
    }
}
