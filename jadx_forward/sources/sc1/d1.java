package sc1;

/* loaded from: classes7.dex */
public class d1 extends gb1.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76736x366c91de = 366;

    /* renamed from: NAME */
    public static final java.lang.String f76737x24728b = "removeLivePlayer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("livePlayerId");
    }

    @Override // gb1.f
    public boolean J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRemoveLivePlayer", "onRemoveView livePlayerId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiRemoveLivePlayer", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.View view2 = (android.view.View) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(android.view.View.class);
        if (view2 instanceof sc1.f) {
            ((sc1.f) view2).a();
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRemoveLivePlayer", "targetView not AppBrandLivePlayerView");
        return false;
    }
}
