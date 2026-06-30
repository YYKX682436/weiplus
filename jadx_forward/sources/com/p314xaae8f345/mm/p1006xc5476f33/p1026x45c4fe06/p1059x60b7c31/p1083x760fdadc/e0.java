package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes7.dex */
public class e0 extends gb1.d {

    /* renamed from: CTRL_INDEX */
    private static final int f34073x366c91de = 253;

    /* renamed from: NAME */
    public static final java.lang.String f34074x24728b = "insertTextView";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject) {
        android.content.Context mo50352x76847179 = tVar.mo50352x76847179();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505(mo50352x76847179, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.s(mo50352x76847179));
    }

    @Override // gb1.d
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        boolean z17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.e0 e0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.s sVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505 c12072x6098f505;
        int optInt;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505 c12072x6098f5052 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.s sVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.s) c12072x6098f5052.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.s.class);
        if (sVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiInsertTextView", "onInsertView(viewId : %d) failed, targetView is null", java.lang.Integer.valueOf(i17));
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("clickable");
        boolean optBoolean2 = jSONObject.optBoolean("transEvt");
        boolean optBoolean3 = jSONObject.optBoolean("gesture");
        boolean optBoolean4 = jSONObject.optBoolean("draggable", false);
        java.lang.String optString = jSONObject.optString("sendTo", "appservice");
        java.lang.String e17 = c75.c.e(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if1.j.b(sVar2, jSONObject.optJSONObject("label"));
        if1.d.a(sVar2, jSONObject);
        if1.t.a(view, jSONObject.optJSONObject("style"));
        c01.l2 b17 = tVar.M(jSONObject.optBoolean("independent", false)).b(i17, true);
        b17.i(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, e17);
        b17.i("sendTo", optString);
        b17.i("transEvt", java.lang.Boolean.valueOf(optBoolean2));
        b17.i("clickable", java.lang.Boolean.valueOf(optBoolean));
        boolean optBoolean5 = jSONObject.optBoolean("independent", false);
        if (!optBoolean5 || (optInt = jSONObject.optInt("parentId", 0)) == 0) {
            z17 = false;
            i18 = -1;
        } else {
            z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) tVar.M(optBoolean5)).q(optInt);
            i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) tVar.M(optBoolean5)).l(optInt);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertTextView", "clickable:%b, gesture:%b, draggable:%b， independent:%b, isParentCanDrag:%b", java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(optBoolean3), java.lang.Boolean.valueOf(optBoolean4), java.lang.Boolean.valueOf(optBoolean5), java.lang.Boolean.valueOf(z17));
        if (optBoolean5 && (z17 || optBoolean4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertTextView", "CoverViewContainer setOnClickListener");
            if (optBoolean) {
                c12072x6098f505 = c12072x6098f5052;
                c12072x6098f505.f162169q = i17;
                c12072x6098f505.f162170r = i18;
                c12072x6098f505.m50859x57300f44(true);
                e0Var = this;
                c12072x6098f505.m50860xd050fbd(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.y(e0Var, b17, tVar));
            } else {
                e0Var = this;
                c12072x6098f505 = c12072x6098f5052;
            }
            c12072x6098f505.m50858xc40e67e9(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.z(e0Var, b17, tVar));
            sVar = sVar2;
        } else {
            e0Var = this;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertTextView", "targetView setOnClickListener");
            sVar = sVar2;
            sVar.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.a0(e0Var, b17, tVar));
            sVar.setClickable(optBoolean);
        }
        if (optBoolean || !optBoolean3 || optBoolean4) {
            return;
        }
        view.setDuplicateParentStateEnabled(true);
        sVar.setDuplicateParentStateEnabled(true);
        sVar.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.b0(e0Var, b17, tVar, i17));
    }
}
