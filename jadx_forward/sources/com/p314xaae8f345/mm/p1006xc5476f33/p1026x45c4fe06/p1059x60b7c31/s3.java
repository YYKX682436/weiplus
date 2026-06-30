package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public final class s3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34735x366c91de = 875;

    /* renamed from: NAME */
    public static final java.lang.String f34736x24728b = "bindGroup";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String mo48798x74292566 = lVar != null ? lVar.mo48798x74292566() : null;
        if (mo48798x74292566 == null || mo48798x74292566.length() == 0) {
            if (lVar != null) {
                lVar.a(i17, o("fail:appId is null"));
                return;
            }
            return;
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("signature") : null;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("groupId") : null;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("nonceStr") : null;
        vg3.i3 i3Var = new vg3.i3();
        i3Var.f518245d = mo48798x74292566;
        i3Var.f518248g = optString;
        i3Var.f518246e = optString2;
        i3Var.f518247f = optString3;
        ((hn.s) ((vg3.k3) i95.n0.c(vg3.k3.class))).Ai(lVar.mo50352x76847179(), i3Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r3(lVar, i17, this));
    }
}
