package dy4;

/* loaded from: classes8.dex */
public final class q implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.w f326229a;

    public q(dy4.w wVar) {
        this.f326229a = wVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0
    public void a(int i17, android.os.Bundle bundle) {
        dy4.w wVar = this.f326229a;
        org.json.JSONObject c17 = wVar.c();
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.f326248a, "onEnterFinderFullscreen data: " + c17);
            wVar.a("onEnterFinderFullscreen", c17);
            return;
        }
        if (bundle != null) {
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268517a;
            c17.put("status", bundle.getString("status", ""));
            c17.put("playbackTime", java.lang.Float.valueOf(bundle.getFloat("playbackTime")));
            c17.put("playbackRate", java.lang.Float.valueOf(bundle.getFloat("playbackRate")));
            c17.put("isPause", bundle.getBoolean("isPause"));
            c17.put("showBarrage", bundle.getBoolean("showBarrage"));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.f326248a, "onExitFinderFullscreen data: " + c17);
        wVar.a("onExitFinderFullscreen", c17);
    }
}
