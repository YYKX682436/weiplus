package vz4;

/* loaded from: classes8.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f523281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz4.x f523282e;

    public u(vz4.x xVar, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        this.f523282e = xVar;
        this.f523281d = c27816xac2547f9;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f523281d;
        if (c27816xac2547f9 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "injectGameJs, webview == null");
            return;
        }
        vz4.x xVar = this.f523282e;
        java.lang.String format = java.lang.String.format("javascript:(function() {window.__usewepkg__=%s;})();", java.lang.String.valueOf(xVar.d(xVar.f523286a)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "__usewepkg__: %s", format);
        c27816xac2547f9.mo14660x738236e6(format, null);
        java.lang.String format2 = java.lang.String.format("javascript:(function() {window.__lowPowerMode__=%s;})();", java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.c.a()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "__lowPowerMode__: %s", format2);
        c27816xac2547f9.mo14660x738236e6(format2, null);
        java.lang.String format3 = java.lang.String.format("javascript:(function() {window.__lowPower__=%s;})();", java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.c.f220933a));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "__lowPower__: %s", format3);
        c27816xac2547f9.mo14660x738236e6(format3, null);
        java.lang.String format4 = java.lang.String.format("javascript:(function() {window.__game_center_preload__=%s;})();", java.lang.String.valueOf(xVar.f523305t));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "__game_center_preload__: %s", format4);
        c27816xac2547f9.mo14660x738236e6(format4, null);
        java.lang.String format5 = java.lang.String.format("javascript:(function() {window.__is_game_center_preload_page__=%s;})();", java.lang.String.valueOf(xVar.f523305t));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "__is_game_center_preload_page__: %s", format5);
        c27816xac2547f9.mo14660x738236e6(format5, null);
    }
}
