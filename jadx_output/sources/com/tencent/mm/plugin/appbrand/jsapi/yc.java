package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class yc extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 990;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "sendRedCoverAppMsg";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f83944g = "MicroMsg.JsApiSendRedCoverAppMsg";

    /* renamed from: h, reason: collision with root package name */
    public final int f83945h = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        kotlin.jvm.internal.o.d(d0Var);
        android.app.Activity r07 = d0Var.t3().r0();
        java.lang.String str = this.f83944g;
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.tencent.mars.xlog.Log.e(str, "mmActivity is null, invoke fail!");
            return;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = jSONObject != null ? jSONObject.optString("receiveuri") : null;
        com.tencent.mars.xlog.Log.i(str, "receive uri: " + ((java.lang.String) h0Var.f310123d));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", false);
        intent.putExtra("mutil_select_is_ret", false);
        intent.putExtra("scene_from", 12);
        nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.xc(this, d0Var, i17, h0Var));
        j45.l.v(r07, ".ui.transmit.SelectConversationUI", intent, this.f83945h);
    }
}
