package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.app.v f135043d;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f135045f;

    /* renamed from: e, reason: collision with root package name */
    public int f135044e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f135046g = true;

    public m(com.p314xaae8f345.mm.app.f fVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f135046g);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f135044e);
        com.p314xaae8f345.mm.app.w wVar = com.p314xaae8f345.mm.app.w.INSTANCE;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppForegroundDelegate", "CheckExceptionRunnable... isValid=%s checkErrorCount=%s isAppForeground=%s", valueOf, valueOf2, java.lang.Boolean.valueOf(wVar.f135422n));
        if (this.f135046g) {
            if (!wVar.f135422n || this.f135044e < 2) {
                if (!wVar.f135422n || (i17 = this.f135044e) >= 2) {
                    return;
                }
                this.f135044e = i17 + 1;
                this.f135045f.postDelayed(this, 5000L);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppForegroundDelegate", "check error! isScreenOff is true but isAppForeground is true");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("isOpenFallbackCheck", com.p314xaae8f345.mm.app.w.f135409u);
            } catch (org.json.JSONException unused) {
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.d(20459, jSONObject.toString().replaceAll(",", ";"), 3L);
            if (com.p314xaae8f345.mm.app.w.f135409u) {
                fVar.mo68477x336bdfd8(1439L, 11L, 1L, false);
            } else {
                fVar.mo68477x336bdfd8(1439L, 12L, 1L, false);
            }
            fVar.mo68477x336bdfd8(1439L, 13L, 1L, false);
            com.p314xaae8f345.mm.app.w.f135413y.clear();
            com.p314xaae8f345.mm.app.v vVar = this.f135043d;
            if (vVar != null) {
                vVar.a(false, "fallback");
            }
        }
    }
}
