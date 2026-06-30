package v31;

/* loaded from: classes7.dex */
public final class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f77247x366c91de = 1402;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f77248x24728b = "predownloadPlayablePackage";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, org.json.JSONObject jSONObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("extra") : null;
        if (optString == null) {
            optString = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicNewPlayable.JsApiPredownloadPlayablePackage", "playableService invoke");
        ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).Di(null, new v31.f(component));
        a41.i iVar = (a41.i) i95.n0.c(a41.i.class);
        java.lang.String str = new com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11191xe67ddda0().f229414d;
        cl0.g gVar = new cl0.g();
        gVar.h("eventName", "downloadPlayablePackage");
        gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, optString);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        ((a41.k) iVar).Ai(str, gVar2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) component).mo32091x9a3f0ba2().N.a(new v31.h(component));
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str3 = str2 != null ? str2 : "";
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        component.a(i17, u(str3, jSONObject2));
    }
}
