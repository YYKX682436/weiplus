package vc1;

/* loaded from: classes13.dex */
public class l0 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.r2 f516537a;

    public l0(vc1.p1 p1Var, vc1.r2 r2Var) {
        this.f516537a = r2Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener
    /* renamed from: onInterpolatePoint */
    public void mo100106x54c9b90e(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, int i17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener.AnimationStatus animationStatus) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t Q;
        vc1.r2 r2Var = this.f516537a;
        if (r2Var == null || c4406x873d1d26 == null) {
            return;
        }
        double m37195x2605e9e2 = c4406x873d1d26.m37195x2605e9e2();
        double m37196x79d7af9 = c4406x873d1d26.m37196x79d7af9();
        int ordinal = animationStatus.ordinal();
        uc1.k1 k1Var = (uc1.k1) r2Var;
        k1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiMoveMapMarkerAlong", "onInterpolatePoint index::%d, animationStatus:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(ordinal));
        k1Var.f507860e.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = k1Var.f507856a;
        gb1.k kVar = (gb1.k) lVar.q(gb1.k.class);
        if (kVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiMoveMapMarkerAlong", "getComponentView NULL IComponentConverter");
            Q = null;
        } else {
            Q = kVar.Q(lVar, k1Var.f507857b);
        }
        if (Q == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiMoveMapMarkerAlong", "ComponentView is null.");
            return;
        }
        uc1.b1 b1Var = new uc1.b1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", k1Var.f507858c);
            jSONObject.put("markerId", k1Var.f507859d);
            jSONObject.put("latitude", m37195x2605e9e2);
            jSONObject.put("longitude", m37196x79d7af9);
            jSONObject.put(ya.b.f77479x42930b2, i17);
            jSONObject.put("animationStatus", ordinal);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiMoveMapMarkerAlong", "put JSON data error : %s", e17);
        }
        b1Var.f163907f = jSONObject.toString();
        int mo50260x9f1221c2 = Q.mo50260x9f1221c2();
        b1Var.p(lVar);
        b1Var.f163909h = mo50260x9f1221c2;
        b1Var.m();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiMoveMapMarkerAlong", "OnMapInterpolatePointJsEvent:%s", jSONObject.toString());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener
    /* renamed from: onInterpolateRotation */
    public void mo100107xc0881340(float f17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener.AnimationStatus animationStatus) {
    }
}
