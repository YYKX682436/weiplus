package yf;

/* loaded from: classes7.dex */
public class v0 implements com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542999b;

    public v0(yf.i0 i0Var) {
        this.f542999b = i0Var;
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener
    /* renamed from: onAudioVolumeEvaluationNotify */
    public void mo29876x4d82ef6(int i17) {
        yf.i0 i0Var = this.f542999b;
        if (i0Var.H()) {
            zf.d dVar = i0Var.f542897n;
            int i18 = i0Var.f334030d;
            bg1.q qVar = (bg1.q) dVar;
            qVar.getClass();
            bg1.j jVar = new bg1.j(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("viewId", i18);
                jSONObject.put("volume", i17);
                qVar.a(jVar, jSONObject);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherAudioVolume fail", e17);
            }
        }
    }
}
