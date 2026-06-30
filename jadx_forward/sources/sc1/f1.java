package sc1;

/* loaded from: classes7.dex */
public class f1 extends gb1.h {

    /* renamed from: CTRL_INDEX */
    private static final int f76740x366c91de = 365;

    /* renamed from: NAME */
    public static final java.lang.String f76741x24728b = "updateLivePlayer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("livePlayerId");
    }

    @Override // gb1.h
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView : livePlayerId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUpdateLivePlayer", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.View view2 = (android.view.View) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(android.view.View.class);
        if (!(view2 instanceof sc1.f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUpdateLivePlayer", "targetView not AppBrandLivePlayerView");
            return false;
        }
        sc1.f fVar = (sc1.f) view2;
        android.os.Bundle a17 = sc1.n1.a(jSONObject);
        fVar.f487197i = a17.getBoolean("needEvent", fVar.f487197i);
        sc1.k1 f17 = ((sc1.o1) fVar.f487193e).f(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePlayerView", "onUpdate code:%d info:%s", java.lang.Integer.valueOf(f17.f487221a), f17.f487222b);
        return true;
    }
}
