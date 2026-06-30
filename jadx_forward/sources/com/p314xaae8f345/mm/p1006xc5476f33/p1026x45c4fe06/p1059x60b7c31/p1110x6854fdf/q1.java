package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class q1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34825x366c91de = 798;

    /* renamed from: NAME */
    public static final java.lang.String f34826x24728b = "updateShareMenuToDo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var != null ? e9Var.V0() : null;
        if (V0 == null) {
            if (e9Var != null) {
                e9Var.a(i17, o("fail"));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 H1 = V0.H1(3);
        if (H1 == null) {
            e9Var.a(i17, o("fail:menu item do not exist"));
            return;
        }
        boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("isToDoMessage", false) : false;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("toDoActivityId", "") : null;
        java.lang.String str = optString != null ? optString : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateShareMenuToDo", "isToDoMessage=" + optBoolean + "  toDoActivityId=" + str);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(optBoolean);
        c01.l2 l2Var = H1.f167529d;
        l2Var.i("is_todo_message", valueOf);
        l2Var.i("share_todo_activity_id", str);
        e9Var.a(i17, o("ok"));
    }
}
