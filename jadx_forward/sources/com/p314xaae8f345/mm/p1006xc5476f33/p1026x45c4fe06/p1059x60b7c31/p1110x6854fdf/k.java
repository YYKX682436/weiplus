package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l {

    /* renamed from: CTRL_INDEX */
    public static final int f34811x366c91de = 73;

    /* renamed from: NAME */
    public static final java.lang.String f34812x24728b = "shareAppMessage";

    public static void N(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(str, str2, i17, str3, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), i18, i19);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u C() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u F = super.F(c0Var, jSONObject);
        c01.l2 l2Var = F.f164789b.H1(3).f167529d;
        if (!l2Var.g("user_clicked_share_btn")) {
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t("not allow to share");
        }
        l2Var.j("user_clicked_share_btn", false);
        return F;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l
    public void I(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar) {
        N(uVar.f164809v, uVar.f164795h, uVar.f164791d ? 16 : 2, "", 2, -1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l
    public void J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, int i17) {
        N(uVar.f164809v, uVar.f164795h, uVar.f164791d ? 16 : 2, "", 3, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l
    public void K(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, java.lang.String str) {
        if (z17) {
            N(uVar.f164809v, uVar.f164795h, str.toLowerCase().endsWith("@chatroom") ? 15 : 16, str + ":", 1, -1);
        } else {
            N(uVar.f164809v, uVar.f164795h, str.toLowerCase().endsWith("@chatroom") ? 9 : 2, "", 1, -1);
        }
        uVar.f164804q.c(uVar, z17);
    }
}
