package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class l1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34817x366c91de = 779;

    /* renamed from: NAME */
    public static final java.lang.String f34818x24728b = "showShareTimelineMenu";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowShareTimelineMenu", "invoke showShareTimelineMenu");
        if (c0Var == null) {
            c0Var.a(i17, o("fail"));
            return;
        }
        if (c0Var.V0() == null) {
            c0Var.a(i17, o("fail"));
        } else if (c0Var.V0().H1(4) == null) {
            c0Var.a(i17, o("fail"));
        } else {
            c0Var.V0().H1(4).f167528c = false;
            c0Var.a(i17, o("ok"));
        }
    }
}
