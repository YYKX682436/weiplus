package wf;

/* loaded from: classes7.dex */
public class k implements com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioVolumeEvaluationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.b f527005a;

    public k(wf.b bVar) {
        this.f527005a = bVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioVolumeEvaluationListener
    /* renamed from: onAudioVolumeEvaluationNotify */
    public void mo94542x4d82ef6(int i17) {
        wf.b bVar = this.f527005a;
        xf.b bVar2 = bVar.f526953n;
        if (bVar2 != null) {
            int i18 = bVar.f334030d;
            yf1.k kVar = (yf1.k) bVar2;
            kVar.getClass();
            yf1.g gVar = new yf1.g(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i18);
                jSONObject.put("volume", i17);
                kVar.a(gVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "onXWebLivePlayerAudioVolume fail", e17);
            }
        }
    }
}
