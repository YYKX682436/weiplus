package ld1;

/* loaded from: classes7.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f72778x366c91de = 245;

    /* renamed from: NAME */
    private static final java.lang.String f72779x24728b = "reportPageData";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) lVar;
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 u07 = yVar.t3().u0();
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 E0 = yVar.t3().E0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 l27 = yVar.t3().l2();
        java.lang.String mo48798x74292566 = yVar.mo48798x74292566();
        r45.dr5 dr5Var = new r45.dr5();
        r45.ff4 ff4Var = new r45.ff4();
        dr5Var.f454237d = ff4Var;
        if (E0 != null) {
            ff4Var.f455804d = E0.f387375e;
            ff4Var.f455805e = u07.f128811x;
            ff4Var.f455806f = E0.f387385r.f156932d;
            dr5Var.f454237d.f455807g = E0.f387385r.f33456x1c82a56c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = yVar.x();
            if (x17 != null) {
                dr5Var.f454237d.f455812o = x17.i();
            }
        }
        if (l27 != null) {
            r45.ff4 ff4Var2 = dr5Var.f454237d;
            ff4Var2.f455808h = l27.f169323f;
            ff4Var2.f455809i = l27.f169321d;
        }
        dr5Var.f454237d.f455810m = 1;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b V0 = yVar.V0();
        if (V0 != null) {
            dr5Var.f454237d.f455811n = V0.X1();
        }
        dr5Var.f454238e = jSONObject.toString();
        ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) yVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxabusiness/reportwxaappexpose", mo48798x74292566, dr5Var, r45.er5.class).n(new ld1.g(this, yVar, i17, mo48798x74292566))).s(new ld1.f(this, yVar, i17));
    }
}
