package q81;

/* loaded from: classes7.dex */
public class f extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        r45.gf7 gf7Var = (r45.gf7) obj;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.CmdGetContact", "invalid username & appId");
            return java.lang.Boolean.FALSE;
        }
        km5.b b17 = km5.u.b();
        b17.b();
        int i17 = gf7Var.f456737d.f453064f;
        r81.f.INSTANCE.b(i17, 24);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.j(str, true, new q81.d(this, str, b17, i17), new q81.e(this));
        return java.lang.Boolean.TRUE;
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        return ((r45.gf7) obj).f456737d;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdGetContact";
    }
}
