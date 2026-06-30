package dy4;

/* loaded from: classes15.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f326237e;

    public s0(dy4.f1 f1Var, int i17) {
        this.f326236d = f1Var;
        this.f326237e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.w wVar;
        dy4.f1 f1Var = this.f326236d;
        int i17 = this.f326237e;
        if (!f1Var.I) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onMediaPlayerBufferingUpdate, mp released");
            return;
        }
        if (i17 != f1Var.f326175z) {
            f1Var.f326175z = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onBufferingUpdate, percent:%s", java.lang.Integer.valueOf(i17));
        }
        if (f1Var.J() && f1Var.f326168u && (wVar = f1Var.U) != null) {
            try {
                org.json.JSONObject c17 = wVar.c();
                c17.put("buffered", i17);
                wVar.a("onVideoBufferUpdate", c17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(wVar.f326248a, "OnXWebVideoProgress fail", e17);
            }
        }
    }
}
