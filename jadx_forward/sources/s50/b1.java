package s50;

/* loaded from: classes12.dex */
public final class b1 implements k23.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f484568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f484569b;

    public b1(s50.l1 l1Var, java.lang.ref.WeakReference weakReference) {
        this.f484568a = l1Var;
        this.f484569b = weakReference;
    }

    @Override // k23.k1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onKeyboardClick");
        java.lang.ref.WeakReference weakReference = this.f484569b;
        s50.l1 l1Var = this.f484568a;
        l1Var.getClass();
        try {
            l1Var.f484618i = s50.x0.f484677n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onBottomToggleKeyboard");
            jSONObject.put("from", "bottom");
            l1Var.cj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceBottomToggleKeyboard, error: " + e17);
        }
    }

    @Override // k23.d1
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onMoveToRecognize");
    }

    @Override // k23.d1
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onTouchDown");
        java.lang.ref.WeakReference weakReference = this.f484569b;
        s50.l1 l1Var = this.f484568a;
        l1Var.getClass();
        try {
            l1Var.f484618i = s50.x0.f484677n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onstart");
            jSONObject.put("from", "bottom");
            l1Var.cj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStartFromBottom, error: " + e17);
        }
    }

    @Override // k23.k1
    public void d(k23.f0 newMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMode, "newMode");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onModeSwitch: " + newMode);
        java.lang.ref.WeakReference weakReference = this.f484569b;
        s50.l1 l1Var = this.f484568a;
        l1Var.getClass();
        try {
            l1Var.f484618i = s50.x0.f484677n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("modeType", newMode.f385101d);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("status", "onmodeswitch");
            jSONObject2.put("extinfo", jSONObject);
            jSONObject2.put("from", "bottom");
            l1Var.cj(weakReference, jSONObject2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceModeSwitch, error: " + e17);
        }
    }

    @Override // k23.d1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onMoveUpwardToCancel");
    }

    @Override // k23.k1
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onUploadClick");
        java.lang.ref.WeakReference weakReference = this.f484569b;
        s50.l1 l1Var = this.f484568a;
        l1Var.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceUploadClick");
            l1Var.f484618i = s50.x0.f484677n;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onclickupload");
            jSONObject.put("from", "bottom");
            l1Var.cj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceUploadClick, error: " + e17);
        }
    }

    @Override // k23.d1
    public void g(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "ModeSwitchListener onTouchUp: isCanceling=" + z17);
        if (z17) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f484569b;
        s50.l1 l1Var = this.f484568a;
        l1Var.getClass();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onstop");
            jSONObject.put("from", "bottom");
            l1Var.cj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputStopFromBottom, error: " + e17);
        }
    }
}
