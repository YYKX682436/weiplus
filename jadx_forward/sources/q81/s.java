package q81;

/* loaded from: classes4.dex */
public final class s extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        r45.qf7 qf7Var = (r45.qf7) obj;
        t81.j jVar = (t81.j) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.j.class);
        int i17 = qf7Var.f465490e;
        int i18 = qf7Var.f465489d.f453064f;
        int i19 = qf7Var.f465491f;
        jVar.getClass();
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            t81.i iVar = new t81.i();
            iVar.f68629xdec927b = str;
            boolean z18 = jVar.get(iVar, new java.lang.String[0]);
            iVar.f68626x119cf7dc = i17;
            iVar.f68628x44eeb14 = i18;
            iVar.f68627x2ba56136 = i19;
            z17 = z18 ? jVar.mo9952xce0038c9(iVar, new java.lang.String[0]) : jVar.mo880xb970c2b9(iVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.CmdUpdateVersion", "call, username %s, version %d, reportId %d, update %b", str, java.lang.Integer.valueOf(qf7Var.f465490e), java.lang.Integer.valueOf(qf7Var.f465489d.f453064f), java.lang.Boolean.valueOf(z17));
        r81.f.INSTANCE.b(qf7Var.f465489d.f453064f, z17 ? 155 : 156);
        return java.lang.Boolean.valueOf(z17);
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        return ((r45.qf7) obj).f465489d;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdUpdateVersion";
    }
}
