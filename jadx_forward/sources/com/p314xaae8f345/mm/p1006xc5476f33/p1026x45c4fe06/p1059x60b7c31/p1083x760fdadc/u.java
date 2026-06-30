package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes7.dex */
public class u extends gb1.d {

    /* renamed from: CTRL_INDEX */
    private static final int f34103x366c91de = 253;

    /* renamed from: NAME */
    public static final java.lang.String f34104x24728b = "insertImageView";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject) {
        gl1.a aVar;
        android.content.Context mo50352x76847179 = tVar.mo50352x76847179();
        if (nd.f.a(gl1.b.class) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.i0) ((gl1.b) nd.f.a(gl1.b.class));
            i0Var.getClass();
            aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.h0(i0Var, mo50352x76847179);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertImageView", "view is null, may not support IGifCoverViewFactory.");
            aVar = new gl1.e(mo50352x76847179);
        }
        aVar.mo51891xebd28962(android.widget.ImageView.ScaleType.FIT_XY);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505(mo50352x76847179, aVar.mo51884xfb86a31b());
    }

    @Override // gb1.d
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.u uVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505 c12072x6098f505;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505 c12072x6098f5052 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view;
        gl1.a aVar = (gl1.a) c12072x6098f5052.d(gl1.a.class);
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiInsertImageView", "onInsertView(viewId : %d) failed, targetView is null", java.lang.Integer.valueOf(i17));
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("clickable");
        boolean optBoolean2 = jSONObject.optBoolean("gesture");
        boolean optBoolean3 = jSONObject.optBoolean("draggable", false);
        boolean optBoolean4 = jSONObject.optBoolean("transEvt");
        java.lang.String optString = jSONObject.optString("sendTo", "appservice");
        java.lang.String e17 = c75.c.e(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("style");
        c01.l2 b17 = tVar.M(jSONObject.optBoolean("independent", false)).b(i17, true);
        b17.i(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, e17);
        b17.i("sendTo", optString);
        b17.i("transEvt", java.lang.Boolean.valueOf(optBoolean4));
        b17.i("clickable", java.lang.Boolean.valueOf(optBoolean));
        aVar.mo51889xd0f15eee(b17);
        if1.t.a(view, optJSONObject);
        if1.j.a(tVar, i17, aVar, jSONObject, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.f(i17, b17, tVar));
        if1.d.a(aVar.mo51884xfb86a31b(), jSONObject);
        boolean z17 = false;
        boolean optBoolean5 = jSONObject.optBoolean("independent", false);
        int i18 = -1;
        if (optBoolean5) {
            int optInt = jSONObject.optInt("parentId", 0);
            if (optInt != 0) {
                z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) tVar.M(optBoolean5)).q(optInt);
                i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) tVar.M(optBoolean5)).l(optInt);
            }
            b17.k("sendTo", "appservice");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertImageView", "clickable:%b, gesture:%b, draggable:%b， independent:%b, isParentCanDrag:%b", java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(optBoolean2), java.lang.Boolean.valueOf(optBoolean3), java.lang.Boolean.valueOf(optBoolean5), java.lang.Boolean.valueOf(z17));
        if (optBoolean5 && (z17 || optBoolean3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertImageView", "CoverViewContainer setOnClickListener");
            if (optBoolean) {
                c12072x6098f505 = c12072x6098f5052;
                c12072x6098f505.f162169q = i17;
                c12072x6098f505.f162170r = i18;
                c12072x6098f505.m50859x57300f44(true);
                uVar = this;
                c12072x6098f505.m50860xd050fbd(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.p(uVar, b17, tVar));
            } else {
                uVar = this;
                c12072x6098f505 = c12072x6098f5052;
            }
            c12072x6098f505.m50858xc40e67e9(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.q(uVar, b17, tVar));
        } else {
            uVar = this;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertImageView", "targetView setOnClickListener");
            aVar.mo51884xfb86a31b().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.r(uVar, b17, tVar));
            aVar.mo51884xfb86a31b().setClickable(optBoolean);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertImageView", "clickable:%b, gesture:%b, draggable:%b", java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(optBoolean2), java.lang.Boolean.valueOf(optBoolean3));
        if (optBoolean || !optBoolean2 || optBoolean3) {
            return;
        }
        view.setDuplicateParentStateEnabled(true);
        aVar.mo51884xfb86a31b().setDuplicateParentStateEnabled(true);
        aVar.mo51884xfb86a31b().setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.s(uVar, b17, tVar, i17));
    }
}
