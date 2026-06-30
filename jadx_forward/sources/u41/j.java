package u41;

/* loaded from: classes4.dex */
public class j extends l75.n0 implements ab0.d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f506166e = {l75.n0.m145250x3fdc6f77(u41.i.f506165p, "OpenIMSnsFlag")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f506167d;

    public j(l75.k0 k0Var) {
        super(k0Var, u41.i.f506165p, "OpenIMSnsFlag", null);
        this.f506167d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo11260x413cb2b4(u41.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.OpenIMSnsFlagStg", "replace " + iVar.f68766x315f5dc9 + "," + iVar.f68765x66a9f5b1);
        return super.mo11260x413cb2b4(iVar);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: update */
    public boolean mo9952xce0038c9(l75.f0 f0Var, java.lang.String[] strArr) {
        u41.i iVar = (u41.i) f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.OpenIMSnsFlagStg", "update " + iVar.f68766x315f5dc9 + "," + iVar.f68765x66a9f5b1);
        return super.mo9952xce0038c9(iVar, strArr);
    }

    public void y0() {
        l75.k0 k0Var = this.f506167d;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = 0;
        try {
            try {
                j17 = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                k0Var.A("OpenIMSnsFlag", "DROP TABLE OpenIMSnsFlag");
                k0Var.A("OpenIMSnsFlag", f506166e[0]);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Openim.OpenIMSnsFlagStg", "drop table Error :" + e17.getMessage());
            }
            k0Var.w(java.lang.Long.valueOf(j17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.OpenIMSnsFlagStg", "deleteTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            k0Var.w(java.lang.Long.valueOf(j17));
            throw th6;
        }
    }

    public long z0(java.lang.String str) {
        android.database.Cursor f17 = this.f506167d.f("SELECT * FROM OpenIMSnsFlag WHERE openIMUsername = \"" + str + "\"", null, 2);
        long j17 = 0;
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Openim.OpenIMSnsFlagStg", "getFlag failed, openIMUsername:%s", str);
            return 0L;
        }
        if (f17.moveToFirst()) {
            u41.i iVar = new u41.i();
            iVar.mo9015xbf5d97fd(f17);
            j17 = iVar.f68765x66a9f5b1;
        }
        f17.close();
        return j17;
    }
}
