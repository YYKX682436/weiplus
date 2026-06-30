package md1;

/* loaded from: classes7.dex */
public class f extends gb1.d {

    /* renamed from: CTRL_INDEX */
    private static final int f72848x366c91de = 623;

    /* renamed from: NAME */
    public static final java.lang.String f72849x24728b = "insertVoIPView";

    public f() {
        si1.e.a(f72849x24728b);
    }

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("viewId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "inflateView," + jSONObject.toString());
        android.content.Context mo50352x76847179 = tVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "inflate view failed, context is null, %s", k());
            return null;
        }
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        if (p0Var.f177565u == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "inflate view failed, newView failed, %s, audio room", k());
            return null;
        }
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        java.lang.Object c17 = p0Var.f177552h.c(mo50352x76847179, jSONObject, false);
        if (c17 != null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505(mo50352x76847179, (android.view.View) c17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "inflate view failed, newView failed, %s", k());
        return null;
    }

    @Override // gb1.d
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(android.view.View.class);
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "onInsertView failed, view is null, viewId:" + i17);
            return;
        }
        dVar.mo54527xda608282(new md1.e(this, tVar, jSONObject.optBoolean("independent", false), i17, new md1.d(this)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "onInsertView, viewId:[" + i17 + "," + dVar.mo54526x346a5196() + "],data:" + jSONObject.toString());
        dVar.k(jSONObject);
    }
}
