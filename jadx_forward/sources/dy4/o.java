package dy4;

/* loaded from: classes8.dex */
public final class o extends cy4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.w f326225a;

    public o(dy4.w wVar) {
        this.f326225a = wVar;
    }

    @Override // cy4.f
    public void a() {
        dy4.w wVar = this.f326225a;
        try {
            wVar.a("onEnterFullscreen", wVar.c());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(wVar.f326248a, "OnXWebVideoError fail", e17);
        }
    }

    @Override // cy4.f
    public void b() {
        dy4.w wVar = this.f326225a;
        try {
            wVar.a("onExitFullscreen", wVar.c());
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(wVar.f326248a, "OnXWebVideoError fail", e17);
        }
    }
}
