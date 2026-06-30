package rw3;

/* loaded from: classes9.dex */
public class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f482177e = {l75.n0.m145250x3fdc6f77(rw3.c.D, "RemittanceRecord")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f482178f = {"*", "rowid"};

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f482179g = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f482180d;

    public d(l75.k0 k0Var) {
        super(k0Var, rw3.c.D, "RemittanceRecord", dm.u9.f321916q);
        this.f482180d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo11260x413cb2b4(rw3.c cVar) {
        if (cVar != null) {
            java.util.Map map = f482179g;
            if (((java.util.HashMap) map).containsKey(cVar.f68622x5231a6cb)) {
                ((java.util.HashMap) map).put(cVar.f68622x5231a6cb, cVar);
            }
        }
        return super.mo11260x413cb2b4(cVar);
    }

    @Override // l75.n0
    /* renamed from: delete */
    public boolean mo9951xb06685ab(l75.f0 f0Var, java.lang.String[] strArr) {
        rw3.c cVar = (rw3.c) f0Var;
        if (cVar != null) {
            java.util.HashMap hashMap = (java.util.HashMap) f482179g;
            if (hashMap.containsKey(cVar.f68622x5231a6cb)) {
                hashMap.remove(cVar.f68622x5231a6cb);
            }
        }
        return super.mo9951xb06685ab(cVar, strArr);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        rw3.c cVar = (rw3.c) f0Var;
        if (cVar != null) {
            java.util.HashMap hashMap = (java.util.HashMap) f482179g;
            if (hashMap.containsKey(cVar.f68622x5231a6cb)) {
                hashMap.put(cVar.f68622x5231a6cb, cVar);
            }
        }
        return super.mo880xb970c2b9(cVar);
    }

    public rw3.c y0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        android.database.Cursor D = this.f482180d.D("RemittanceRecord", f482178f, "transferId=?", new java.lang.String[]{str}, null, null, null, 2);
        try {
            try {
                if (D.moveToFirst()) {
                    rw3.c cVar = new rw3.c();
                    cVar.mo9015xbf5d97fd(D);
                    return cVar;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RemittanceSendRecordStorage", e17, "getRecordByTransferId error: %s", e17.getMessage());
            }
            return null;
        } finally {
            D.close();
        }
    }

    public rw3.c z0(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        java.util.Map map = f482179g;
        if (!K0 && ((java.util.HashMap) map).containsKey(str)) {
            return (rw3.c) ((java.util.HashMap) map).get(str);
        }
        rw3.c y07 = y0(str);
        if (y07 == null) {
            return null;
        }
        ((java.util.HashMap) map).put(str, y07);
        return y07;
    }
}
