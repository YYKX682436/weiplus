package com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7;

/* loaded from: classes7.dex */
public class r extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    static final int f15674x366c91de = 1;

    /* renamed from: NAME */
    static final java.lang.String f15675x24728b = "showKeyboard";

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.e f128784g = new com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.e();

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.c f128785h = new com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.c();

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.d f128786i = new com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.d();

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.u f128787m = new com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.u();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        java.lang.String optString = jSONObject.optString("defaultValue");
        int optInt = jSONObject.optInt("maxLength", 140);
        if (optInt <= 0) {
            optInt = Integer.MAX_VALUE;
        }
        int i18 = optInt;
        boolean optBoolean = jSONObject.optBoolean("multiple", false);
        boolean optBoolean2 = jSONObject.optBoolean("confirmHold", false);
        pl1.c cVar = (pl1.c) pl1.e.a(jSONObject.optString("confirmType"), pl1.c.class);
        java.lang.String optString2 = jSONObject.optString("keyboardType");
        com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.b.f128736d.getClass();
        com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.b bVar = (com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.b) pl1.e.a(optString2, com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.b.class);
        if (bVar == null) {
            bVar = com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.b.f128737e;
        }
        boolean optBoolean3 = jSONObject.optBoolean("showStoreEmoticon", false);
        boolean optBoolean4 = jSONObject.optBoolean("showStoreEmoticonPlus", false);
        boolean optBoolean5 = jSONObject.optBoolean("showEmoticonFirst", false);
        java.lang.String optString3 = jSONObject.optString("keyboardAppearance", "default");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiShowKeyboard", "defaultValue :%s,finalMaxLength(%d),multiple(%b),confirmHold(%b),showStoreEmoticon(%b),showEmoticonFirst(%b),keyboardAppearance(%s),showStoreEmoticonPlus(%b).", optString, java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(optBoolean2), java.lang.Boolean.valueOf(optBoolean3), java.lang.Boolean.valueOf(optBoolean5), optString3, java.lang.Boolean.valueOf(optBoolean4));
        e9Var.m(new com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.i(this, e9Var, optString, i18, optBoolean, optBoolean2, cVar, bVar, optBoolean3, optBoolean4, optBoolean5, optString3.equalsIgnoreCase("dark"), i17));
    }
}
