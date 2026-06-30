package sc1;

/* loaded from: classes7.dex */
public class u implements com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioVolumeEvaluationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f487266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f487267b;

    public u(sc1.z zVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f487266a = i17;
        this.f487267b = tVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioVolumeEvaluationListener
    /* renamed from: onAudioVolumeEvaluationNotify */
    public void mo94542x4d82ef6(int i17) {
        sc1.v vVar = new sc1.v(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("livePlayerId", this.f487266a);
            jSONObject.put("volume", i17);
        } catch (org.json.JSONException unused) {
        }
        vVar.f163907f = jSONObject.toString();
        this.f487267b.i(vVar, null);
    }
}
