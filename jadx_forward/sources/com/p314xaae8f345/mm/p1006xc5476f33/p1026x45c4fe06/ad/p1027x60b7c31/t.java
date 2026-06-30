package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31;

/* loaded from: classes7.dex */
public class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33395x366c91de = 756;

    /* renamed from: NAME */
    public static final java.lang.String f33396x24728b = "showSplashAdMenu";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        boolean optBoolean = jSONObject.optBoolean("showMenu", false);
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        java.lang.String optString2 = jSONObject.optString("icon", "");
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        java.util.Map map = i81.j.f371125a;
        i81.a0.b(mo48798x74292566).f371091b = optBoolean;
        i81.a0.b(e9Var.mo48798x74292566()).f371093d = optString;
        i81.a0.b(e9Var.mo48798x74292566()).f371092c = optString2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShowMenuAd[AppBrandSplashAd]", "showSplashAdMenu, showMenuAd:%s, title:%s, icon:%s", java.lang.Boolean.valueOf(optBoolean), optString, optString2);
        e9Var.a(i17, o("ok"));
    }
}
