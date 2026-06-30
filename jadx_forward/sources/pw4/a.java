package pw4;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f440242a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f440243b = false;

    @android.webkit.JavascriptInterface
    /* renamed from: _customEnterFullscreen */
    public boolean m159083x4f43ae03(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomFullscreenApi", "_customEnterFullscreen %b", java.lang.Boolean.valueOf(z17));
        return a(z17);
    }

    public boolean a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomFullscreenApi", "setCustomEnterFullscreen %b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f440242a;
        if (c27816xac2547f9 == null || !c27816xac2547f9.m120171x1f05d274()) {
            return false;
        }
        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(this.f440242a.mo120156xb5887639())) {
            return false;
        }
        this.f440242a.S(z17);
        this.f440243b = z17;
        return true;
    }
}
