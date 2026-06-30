package v31;

/* loaded from: classes7.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f77245x366c91de = 1406;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f77246x24728b = "postMessageToPlayableLib";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, org.json.JSONObject jSONObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("extra") : null;
        if (optString == null) {
            optString = "";
        }
        a41.i iVar = (a41.i) i95.n0.c(a41.i.class);
        com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11191xe67ddda0 c11191xe67ddda0 = new com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11191xe67ddda0();
        cl0.g gVar = new cl0.g();
        gVar.h("eventName", "customEvent");
        gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, optString);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        ((a41.k) iVar).Ai(c11191xe67ddda0.f229414d, gVar2);
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        component.a(i17, u(str2, jSONObject2));
    }
}
