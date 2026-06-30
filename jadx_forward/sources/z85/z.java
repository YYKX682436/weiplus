package z85;

/* loaded from: classes4.dex */
public final class z extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f552363f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f552364d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f552365e;

    static {
        java.lang.String m145250x3fdc6f77 = l75.n0.m145250x3fdc6f77(z85.y.f552362p, "GetEmotionStoreRecListCache");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m145250x3fdc6f77, "getCreateSQLs(...)");
        f552363f = new java.lang.String[]{m145250x3fdc6f77};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l75.k0 k0Var) {
        super(k0Var, z85.y.f552362p, "GetEmotionStoreRecListCache", null);
        l75.e0 e0Var = z85.y.f552362p;
        this.f552364d = k0Var;
        this.f552365e = "MicroMsg.GetEmotionStoreRecListCacheStorage";
    }

    public final boolean y0(int i17, r45.oo3 oo3Var) {
        if (oo3Var == null) {
            return false;
        }
        try {
            l75.k0 k0Var = this.f552364d;
            java.lang.Integer valueOf = k0Var != null ? java.lang.Integer.valueOf(k0Var.mo70514xb06685ab("GetEmotionStoreRecListCache", "reqType=?", new java.lang.String[]{java.lang.String.valueOf(i17)})) : null;
            if (valueOf != null) {
                valueOf.intValue();
            }
            java.lang.String reqType = i17 + "";
            byte[] mo14344x5f01b1f6 = oo3Var.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqType, "reqType");
            z85.y yVar = new z85.y();
            yVar.f69194xb5d2eab3 = reqType;
            yVar.f69193x28e98ffd = mo14344x5f01b1f6;
            return mo880xb970c2b9(yVar);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f552365e, "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return false;
        }
    }
}
