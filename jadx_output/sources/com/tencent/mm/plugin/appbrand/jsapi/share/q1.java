package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class q1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 798;
    public static final java.lang.String NAME = "updateShareMenuToDo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var != null ? e9Var.V0() : null;
        if (V0 == null) {
            if (e9Var != null) {
                e9Var.a(i17, o("fail"));
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.menu.u0 H1 = V0.H1(3);
        if (H1 == null) {
            e9Var.a(i17, o("fail:menu item do not exist"));
            return;
        }
        boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("isToDoMessage", false) : false;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("toDoActivityId", "") : null;
        java.lang.String str = optString != null ? optString : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateShareMenuToDo", "isToDoMessage=" + optBoolean + "  toDoActivityId=" + str);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(optBoolean);
        c01.l2 l2Var = H1.f85996d;
        l2Var.i("is_todo_message", valueOf);
        l2Var.i("share_todo_activity_id", str);
        e9Var.a(i17, o("ok"));
    }
}
