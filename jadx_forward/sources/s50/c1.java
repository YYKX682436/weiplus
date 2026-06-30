package s50;

/* loaded from: classes12.dex */
public final class c1 implements k23.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f484570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f484571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f484572c;

    public c1(s50.l1 l1Var, java.lang.ref.WeakReference weakReference, k23.v0 v0Var) {
        this.f484570a = l1Var;
        this.f484571b = weakReference;
        this.f484572c = v0Var;
    }

    @Override // k23.v2
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchVoice onStartPress");
    }

    @Override // k23.v2
    public void b(java.lang.String result, java.lang.String voiceID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceID, "voiceID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchVoice onResult: ".concat(result));
        java.lang.ref.WeakReference weakReference = this.f484571b;
        s50.l1 l1Var = this.f484570a;
        l1Var.getClass();
        try {
            l1Var.f484618i = s50.x0.f484677n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, result);
            if (voiceID.length() > 0) {
                jSONObject.put("voiceid", voiceID);
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("status", "onsearch");
            jSONObject2.put("extinfo", jSONObject);
            jSONObject2.put("from", "bottom");
            jSONObject2.put("sceneFrom", 3);
            l1Var.cj(weakReference, jSONObject2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputSearchFromBottom, error: " + e17);
        }
        k23.v0 v0Var = this.f484572c;
        v0Var.w(8, "", result);
        v0Var.w(9, "", result);
    }

    @Override // k23.v2
    /* renamed from: onCancel */
    public void mo63604x3d6f0539() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchVoice onCancel");
        java.lang.ref.WeakReference weakReference = this.f484571b;
        s50.l1 l1Var = this.f484570a;
        l1Var.getClass();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "oncancel");
            jSONObject.put("from", "bottom");
            l1Var.cj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputCancelFromBottom, error: " + e17);
        }
    }
}
