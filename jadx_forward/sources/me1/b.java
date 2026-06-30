package me1;

/* loaded from: classes7.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f72880x366c91de = 648;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f72881x24728b = "openWeAppHistoryList";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (yVar == null || jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        java.lang.String optString = jSONObject.optString("sceneNote");
        int optInt2 = jSONObject.optInt("getUsageReason", 0);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c5 c5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12644x463f8168.f170888f;
            android.content.Context mo50352x76847179 = yVar.mo50352x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo50352x76847179, "getContext(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("extra_get_usage_reason", optInt2);
            intent.putExtra("extra_enter_scene", optInt);
            intent.putExtra("extra_enter_scene_note", optString);
            c5Var.b(mo50352x76847179, intent);
            yVar.a(i17, o("ok"));
        } catch (java.lang.Exception e17) {
            yVar.a(i17, o("fail:internal error " + e17.getMessage()));
        }
    }
}
