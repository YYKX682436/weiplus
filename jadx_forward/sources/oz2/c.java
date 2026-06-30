package oz2;

/* loaded from: classes9.dex */
public class c extends oe4.g implements iu5.e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f431777d;

    /* renamed from: e, reason: collision with root package name */
    public iu5.b f431778e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f431779f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f431780g;

    /* renamed from: h, reason: collision with root package name */
    public final int f431781h;

    /* renamed from: i, reason: collision with root package name */
    public final int f431782i;

    public c(java.lang.String str, int i17) {
        this.f431780g = null;
        this.f431780g = str;
        this.f431781h = i17;
        this.f431782i = i17;
    }

    @Override // iu5.a
    public void B(iu5.b bVar) {
        this.f431778e = bVar;
    }

    @Override // oe4.g
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "hy: authkey required");
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f431777d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(4, -1, "", this);
        }
        if (this.f431778e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "pay auth key expired when upload pay auth key");
            this.f431778e.a(new iu5.d(false));
        }
    }

    @Override // oe4.g
    public void I(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "hy: onError: errType: %d, errcode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f431777d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f431777d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        re4.g0.f476070c = str;
        iu5.b bVar = this.f431778e;
        if (bVar != null) {
            if (i18 == 0 && i19 == 0) {
                bVar.a(new iu5.d(true));
            } else {
                bVar.a(new iu5.d(false));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f431777d = u0Var;
        return mo9409x10f9447a(sVar, this.f431779f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1665;
    }

    @Override // iu5.a
    public void j(java.lang.Object obj) {
        iu5.c cVar = (iu5.c) obj;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nc6();
        lVar.f152198b = new r45.oc6();
        lVar.f152199c = "/cgi-bin/mmpay-bin/soterupdateauthkey";
        lVar.f152200d = 1665;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f431779f = a17;
        r45.nc6 nc6Var = (r45.nc6) a17.f152243a.f152217a;
        nc6Var.f462781e = this.f431780g;
        java.lang.String str = cVar.f376584a;
        nc6Var.f462780d = str;
        java.lang.String str2 = cVar.f376585b;
        nc6Var.f462782f = str2;
        nc6Var.f462783g = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121664x51474d82("passwd=" + nc6Var.f462781e);
        nc6Var.f462784h = this.f431781h;
        nc6Var.f462785i = this.f431782i;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            re4.u.b(jSONObject.getString("cpu_id"), jSONObject.getString("uid"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", e17, "save device info exception", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "json: %s, sign: %s", str, str2);
    }

    @Override // iu5.a
    public void x() {
        gm0.j1.d().g(this);
    }
}
