package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class x implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f164831a;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("link");
        this.f164831a = optString;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShareAppMessageBase", "hy: is h5 share type but no link!");
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t("is h5 share type but no h5 link");
        }
        uVar.I.put("is_h5", java.lang.Boolean.TRUE);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713 c12236xd46e1713, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        c12236xd46e1713.B = 5;
        c12236xd46e1713.f164602o = this.f164831a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, android.content.Intent intent) {
        java.util.HashMap hashMap = new java.util.HashMap(4);
        hashMap.put("img_url", uVar.f164796i);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, uVar.f164793f);
        hashMap.put("desc", uVar.f164794g);
        hashMap.put("url", this.f164831a);
        intent.putExtra("webview_params", hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public boolean e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar) {
        java.lang.String str = uVar.C;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        return str.startsWith("delayLoadFile://");
    }

    /* renamed from: toString */
    public java.lang.String m51298x9616526c() {
        return "ShareTypeH5{h5Link='" + this.f164831a + "'}";
    }
}
