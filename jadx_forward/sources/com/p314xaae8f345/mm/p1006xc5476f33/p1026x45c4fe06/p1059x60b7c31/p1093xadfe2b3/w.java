package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes7.dex */
public final class w extends gb1.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34445x366c91de = 1333;

    /* renamed from: NAME */
    public static final java.lang.String f34446x24728b = "removeLiteAppView";

    @Override // gb1.f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveLiteAppView", "invoke");
        B(lVar, data, i17, lVar.mo50357xcd94f799());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.getInt("viewId");
    }

    @Override // gb1.f
    public boolean J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveLiteAppView", "onRemoveView(viewId : %s, %s)", java.lang.Integer.valueOf(i17), jSONObject);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer");
        com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329 = (com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329.class);
        if (c3717xac6c2329 == null) {
            return true;
        }
        c3717xac6c2329.g();
        return true;
    }
}
