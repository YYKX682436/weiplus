package sc1;

/* loaded from: classes7.dex */
public class p0 implements com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f487242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f487243c;

    public p0(sc1.x0 x0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f487242b = i17;
        this.f487243c = tVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener
    /* renamed from: onAudioVolumeEvaluationNotify */
    public void mo29876x4d82ef6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "onAudioVolumeEvaluationNotify, volume:%s", java.lang.Integer.valueOf(i17));
        sc1.q0 q0Var = new sc1.q0(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("volume", i17);
            jSONObject.put("livePusherId", this.f487242b);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertLivePusher", "onAudioVolumeEvaluationNotify fail", e17);
        }
        q0Var.f163907f = jSONObject.toString();
        this.f487243c.i(q0Var, null);
    }
}
