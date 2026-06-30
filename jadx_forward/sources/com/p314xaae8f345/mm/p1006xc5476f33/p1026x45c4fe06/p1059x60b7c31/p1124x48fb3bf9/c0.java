package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9;

/* loaded from: classes7.dex */
public class c0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34982x366c91de = 1418;

    /* renamed from: NAME */
    private static final java.lang.String f34983x24728b = "translateHTMLWebView";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t38;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiTranslateHTMLWebView", "translateHTMLWebView data: " + jSONObject);
        boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("translate", true) : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 m52174xaf156f4a = (c0Var == null || (t38 = c0Var.t3()) == null || (x07 = t38.x0()) == null) ? null : x07.m52174xaf156f4a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m52174xaf156f4a, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.AppBrandPageViewWC");
        of1.w1 s37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) m52174xaf156f4a).s3();
        if (c0Var == null || (t37 = c0Var.t3()) == null) {
            return;
        }
        t37.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.b0(optBoolean, s37, c0Var, i17, this));
    }
}
