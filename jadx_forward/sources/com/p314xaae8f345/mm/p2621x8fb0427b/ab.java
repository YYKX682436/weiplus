package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class ab extends l75.n0 implements xg3.v0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f275282f = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.ya.f277921v, "Stranger")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f275283d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f275284e;

    public ab(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.ya.f277921v, "Stranger", null);
        this.f275284e = new com.p314xaae8f345.mm.p2621x8fb0427b.za(this);
        this.f275283d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ya) f0Var;
        if (yaVar == null) {
            return false;
        }
        boolean mo880xb970c2b9 = super.mo880xb970c2b9(yaVar);
        if (!mo880xb970c2b9) {
            return mo880xb970c2b9;
        }
        l75.v0 v0Var = this.f275284e;
        if (!v0Var.d(yaVar)) {
            return mo880xb970c2b9;
        }
        v0Var.c();
        return mo880xb970c2b9;
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo11260x413cb2b4(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ya) f0Var;
        iz5.a.g("stranger NULL !", yaVar != null);
        java.lang.String str = yaVar.f66694xdd77ad16;
        if (!(this.f275283d.m("Stranger", "", yaVar.mo9763xeb27878e()) > 0)) {
            return false;
        }
        l75.v0 v0Var = this.f275284e;
        if (!v0Var.d(yaVar)) {
            return true;
        }
        v0Var.c();
        return true;
    }

    public int y0(java.lang.String str) {
        int mo70514xb06685ab = this.f275283d.mo70514xb06685ab("Stranger", "(encryptUsername=?)", new java.lang.String[]{"" + str});
        if (mo70514xb06685ab > 0) {
            m145262xf35bbb4();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StrangerStorage", "delByEncryptUsername:" + str + " result:" + mo70514xb06685ab);
        return mo70514xb06685ab;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.ya z0(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar = new com.p314xaae8f345.mm.p2621x8fb0427b.ya();
        android.database.Cursor D = this.f275283d.D("Stranger", null, "encryptUsername = ?", new java.lang.String[]{str}, null, null, null, 2);
        if (D.moveToFirst()) {
            yaVar.mo9015xbf5d97fd(D);
        }
        D.close();
        return yaVar;
    }
}
