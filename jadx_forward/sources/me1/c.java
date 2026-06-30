package me1;

/* loaded from: classes7.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f72882x366c91de = 650;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f72883x24728b = "openWeAppProfile";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (yVar == null || yVar.mo50352x76847179() == null || jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5, null);
        if (optString == null || !k01.o.a(optString)) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        java.lang.String optString2 = jSONObject.optString("sceneNote", null);
        int optInt2 = jSONObject.optInt("exposeScene", 0);
        try {
            android.content.Context mo50352x76847179 = yVar.mo50352x76847179();
            k91.z5 z5Var = new k91.z5();
            z5Var.f387399d = optString;
            z5Var.f387405j = optInt2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12663x79416297.V6(mo50352x76847179, optString, optInt, optString2, true, z5Var.a(), new android.os.Bundle(), null);
            yVar.a(i17, o("ok"));
        } catch (java.lang.Exception e17) {
            yVar.a(i17, o("fail:internal error " + e17.getMessage()));
        }
    }
}
