package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.app.v f53510d;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f53512f;

    /* renamed from: e, reason: collision with root package name */
    public int f53511e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f53513g = true;

    public m(com.tencent.mm.app.f fVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f53513g);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f53511e);
        com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppForegroundDelegate", "CheckExceptionRunnable... isValid=%s checkErrorCount=%s isAppForeground=%s", valueOf, valueOf2, java.lang.Boolean.valueOf(wVar.f53889n));
        if (this.f53513g) {
            if (!wVar.f53889n || this.f53511e < 2) {
                if (!wVar.f53889n || (i17 = this.f53511e) >= 2) {
                    return;
                }
                this.f53511e = i17 + 1;
                this.f53512f.postDelayed(this, 5000L);
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppForegroundDelegate", "check error! isScreenOff is true but isAppForeground is true");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("isOpenFallbackCheck", com.tencent.mm.app.w.f53876u);
            } catch (org.json.JSONException unused) {
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.d(20459, jSONObject.toString().replaceAll(",", ";"), 3L);
            if (com.tencent.mm.app.w.f53876u) {
                fVar.idkeyStat(1439L, 11L, 1L, false);
            } else {
                fVar.idkeyStat(1439L, 12L, 1L, false);
            }
            fVar.idkeyStat(1439L, 13L, 1L, false);
            com.tencent.mm.app.w.f53880y.clear();
            com.tencent.mm.app.v vVar = this.f53510d;
            if (vVar != null) {
                vVar.a(false, "fallback");
            }
        }
    }
}
