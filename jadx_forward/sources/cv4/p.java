package cv4;

/* loaded from: classes7.dex */
public final class p implements com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cv4.q f304126d;

    public p(cv4.q qVar) {
        this.f304126d = qVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiRegisterNativeEventMonitor", "onScreenShot， path = " + str + "， dateAdded = " + j17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("retCode", "0");
        long j18 = this.f304126d.f224975e.f380557a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiRegisterNativeEventMonitor", "notifyJSEvent, liteAppUuid: " + j18 + ", funcName: onUserCaptureScreen, paramsJson: " + jSONObject);
        try {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(j18, "onUserCaptureScreen", jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiRegisterNativeEventMonitor", e17, "notifyJSEvent", new java.lang.Object[0]);
        }
    }
}
