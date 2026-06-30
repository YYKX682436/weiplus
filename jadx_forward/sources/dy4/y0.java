package dy4;

/* loaded from: classes15.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f326269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f326270f;

    public y0(dy4.f1 f1Var, int i17, int i18) {
        this.f326268d = f1Var;
        this.f326269e = i17;
        this.f326270f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.w wVar;
        dy4.f1 f1Var = this.f326268d;
        int i17 = this.f326269e;
        int i18 = this.f326270f;
        if (!f1Var.I) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onMediaPlayerVideoSizeChanged, mp released");
            return;
        }
        ye1.e eVar = f1Var.f326160n;
        int mo1852x51e8b0a = eVar != null ? eVar.mo1852x51e8b0a() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onVideoSizeChanged, width:%d, height:%d, duration:%d, mVideoHasPrepared:%b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(mo1852x51e8b0a), java.lang.Boolean.valueOf(f1Var.f326168u));
        if (f1Var.f326168u && f1Var.f326160n != null && ((i17 != f1Var.f326170w || i18 != f1Var.f326171x || mo1852x51e8b0a != f1Var.f326173y) && f1Var.J() && (wVar = f1Var.U) != null)) {
            java.lang.String str = wVar.f326248a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onVideoSizeChange width=" + i17 + ", height=" + i18 + ", duration=" + mo1852x51e8b0a);
            try {
                org.json.JSONObject c17 = wVar.c();
                c17.put("width", i17);
                c17.put("height", i18);
                double d17 = (mo1852x51e8b0a * 1.0d) / 1000;
                wVar.f326251d = d17;
                c17.put("duration", d17);
                wVar.a("onVideoSizeChange", c17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onVideoSizeChange fail", e17);
            }
        }
        f1Var.f326170w = i17;
        f1Var.f326171x = i18;
        f1Var.f326173y = mo1852x51e8b0a;
        f1Var.s();
    }
}
