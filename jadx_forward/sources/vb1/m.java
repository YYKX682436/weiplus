package vb1;

/* loaded from: classes7.dex */
public class m extends gb1.h {

    /* renamed from: CTRL_INDEX */
    public static final int f77268x366c91de = 69;

    /* renamed from: NAME */
    public static final java.lang.String f77269x24728b = "drawCanvas";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("canvasId");
    }

    @Override // gb1.h
    public boolean L(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject, gb1.n nVar) {
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDrawCanvas", "drawCanvas failed, view is not a instance of CoverViewContainer.(%s)", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.KeyEvent.Callback callback = (android.view.View) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(android.view.View.class);
        if (!(callback instanceof h91.b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDrawCanvas", "drawCanvas failed, view is not a instance of AppBrandDrawableView.(%s)", java.lang.Integer.valueOf(i17));
            return false;
        }
        java.lang.System.currentTimeMillis();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        h91.b bVar = (h91.b) callback;
        if (jSONObject.optBoolean("reserve")) {
            bVar.e(optJSONArray, new vb1.k(this, nVar));
        } else {
            bVar.c(optJSONArray, new vb1.l(this, nVar));
        }
        bVar.a();
        java.lang.System.currentTimeMillis();
        return true;
    }
}
